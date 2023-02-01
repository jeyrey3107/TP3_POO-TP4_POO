package TP3.VAILLANT.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

@Controller
public class MeteoController {
    RestTemplate restTemplate = new RestTemplate();
    @PostMapping("/meteo")
    public String post(@RequestParam(name = "addresse") String
                               addresse, Model model) throws JSONException {

        String response = restTemplate.getForObject(
                "http://api-adresse.data.gouv.fr/search/?q="+addresse, String.class);

        JSONObject jsonObject = new JSONObject(response);
        JSONObject geometryarray =  jsonObject.getJSONArray("features").getJSONObject(0).getJSONObject("geometry");
        JSONArray coordinatesarray = geometryarray.getJSONArray ("coordinates");
        model.addAttribute("x", coordinatesarray.getDouble(0));
        model.addAttribute("y", coordinatesarray.getDouble(1));

        String responseMeteo = restTemplate.getForObject(
                "https://api.meteo-concept.com/api/forecast/daily?token=d49348c2239dc41dac4f66dd5a5e63cabb495c0d01e9a744b4dd02913137a28b&latlng="+coordinatesarray.getDouble(1)+","+coordinatesarray.getDouble(0), String.class);
        JSONObject jsonobjectMeteo = new JSONObject(responseMeteo);
        JSONObject forecastarray =  jsonobjectMeteo.getJSONArray("forecast").getJSONObject(0);

        model.addAttribute("response", responseMeteo);
        model.addAttribute("tmin", forecastarray.getString("tmin"));
        model.addAttribute("tmax", forecastarray.getString("tmax"));
        model.addAttribute("weather", forecastarray.getString("weather"));
        model.addAttribute("nomTemplate", addresse);
        return "meteo";
    }
    /*
    * d49348c2239dc41dac4f66dd5a5e63cabb495c0d01e9a744b4dd02913137a28b
    * */

}



