Thymeleaf permet de concevoir des vues web, et aide à la génération de documents
Le Spring Boot Devtools permet de mettre à jour à distance, et/ou d'automatiser le redémarrage, le rechargement de l'application
Spring Web fournit des moyens d'intégration basiques pour créer une application web
H2 Database permet de simuler une base de donnée, et peut s'intégrer à l'application
Spring Data JPA simplifie les requêtes d'accès aux données
Hibernate permet de représenter une BDD en objets Java et inversement

13/
1 - le paramétrage de l'url se fait avec le @GetMapping
2 - la fonction greeting retourne en String le nom du fichier html à utiliser
3 - On envoie le nom via une variable "nomTemplate" qui est récupérée dans le HTML. elle est déterminée dans les paramètres de la fonction, par défaut la valeur est "World", sinon si on la spécifie cela la modifie.

17/
Maintenant une table ADDRESS existe, avec les attributs id, creation et content

18/
Le fait d'avoir créé une nouvelle classe dans nos models, avec le décorateur @Entity, et grâce aux dépendances de Spring boot, a généré la table correspondante

20/
La requête nous retourne bien le contenu que l'on a ajouté via le fichier data.sql

22/
@Autowired permet d'injecter les dépendances pour associer automatiquement les beans nécessaires dans les paramètres d'AddressRepository

Github : https://github.com/Corexproga/TP_note