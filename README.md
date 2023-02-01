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