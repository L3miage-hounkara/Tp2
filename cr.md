J'ai choisi la stratégie d'héritage de table unique (single-table inheritance) pour modéliser 
mes entités JPA en raison de sa simplicité et de son efficacité.
Cette approche regroupe toutes les sous-classes dans une seule table, 
simplifiant ainsi la structure de la base de données et facilitant la gestion des données. 
Étant donné que les classes Manager et Developpeur partagent des attributs communs avec la classe Employe, 
cette stratégie permet une représentation claire et concise de la hiérarchie d'héritage. En utilisant une colonne 
discriminante pour différencier les types d'employés, cette méthode offre également une meilleure lisibilité et une 
plus grande facilité de gestion des données.