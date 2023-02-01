LIEN GITHUB:https://github.com/jeyrey3107/TP3_POO-TP4_POO



Tp3 POO VAILLANT REMI

Spring Web : Permet de créer une application web

Spring Data JPA : Permet d'acceder au données de l'application plus facilement

Validation: Permet de valider les données rentrer par l'utilisateur

H2 Database: Permet de créer une BDD rapide et légère en Java

Spring Boot DevTools : Optmise le serveur automatiquement

Thymeleaf : un template engine (moteur de rendu de document) écrit en Java conçu pour produire des vues Web

13)
1) c'est grâce a la ligne: @GetMapping("/greeting") que nous définissons l'url
2) c'est grâce à la ligne: return "greeting";
3) On l'envoie avec la fonction model.addAttribute("nomTemplate", nameGET); qui affecte à la variable "nomTemplate" nameGet et qui l'envoie au fichier greeting.html qui la reconnait via :${nomTemplate}.

17)
La tabLe adresse est créée dans la BDD

15)
Hibernate facilite la persistence et la recherche de données dans une base de données en réalisant lui-même la création des objets et les traitements de remplissage de ceux-ci en accédant à la base de données. La quantité de code ainsi épargnée est très importante d'autant que ce code est généralement fastidieux et redondant.

20)
Oui, le contenu est bien apparu dans la table

22)
permet d'activer l'injection automatique de dépendance

30)
Pour ajouter Bootstrap à notre projet il faut télécharger l'API et glisser les dossierrs CSS et JS dans notre projet et y faire appele avec par exemple : <link rel="stylesheet" href="css/bootstrap.css">.



TP 4 POO

Etape 6:

1) Oui il est nécéssaire d'avoir une clé API appelée token qui ressemble à ceci:d49348c2239dc41dac4f66dd5a5e63cabb495c0d01e9a744b4dd02913137a28b

2) il fau appeler l'URL suivante :"https://api.meteo-concept.com/api/forecast/daily?token=d49348c2239dc41dac4f66dd5a5e63cabb495c0d01e9a744b4dd02913137a28b&latlng="+coordinatesarray.getDouble(1)+","+coordinatesarray.getDouble(0), String.class);
(pensez à adapter le token).

3) Il faut utiliser HTTP GET ce qui permet transmettre les données.

4) on peut donner le token après le "token=" et les latitudes et longitudes après le "&latlng="

5/6) Méteo response={"city":{"insee":"72181","cp":72000,"name":"Le Mans","latitude":47.9885,"longitude":0.2,"altitude":65},"update":"2023-02-01T11:02:06+01:00","forecast":[{"insee":"72003","cp":72700,"latitude":47.959,"longitude":0.1438,"day":0,"datetime":"2023-02-01T01:00:00+0100","wind10m":10,"gust10m":31,"dirwind10m":272,"rr10":0,"rr1":0,"probarain":10,"weather":3,"tmin":3,"tmax":9,"sun_hours":3,"etp":0,"probafrost":0,"probafog":40,"probawind70":0,"probawind100":0,"gustx":31},

dans la réponse ci-dessus les températures sont données dans les valeurs de tmin et tmax et la prévision météo est fornie par les données tels que weather. 



