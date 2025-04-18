# Projet Compagnie Aérienne (Spring Boot) par FERREIRA et HARDEEP SINGH 

## Fonctionnalités :
- REST API pour gérer :
  - Vols
  - Clients
  - Réservations
- Intégration base de données MySQL (`root` / `admin123`)
- Lecture / écriture de fichiers CSV
- Page HTML d’accueil avec liste des vols
- Tests unitaires avec JUnit 

## Lancement :
1. Ouvrir le projet dans IntelliJ
2. Lancer `Application.java`
3. Accéder à l’URL : [http://localhost:8080](http://localhost:8080)

## Base de données :
- Créez une base nommée `compagnie` dans MySQL
- Identifiants par défaut :  
  - **Utilisateur** : `root`  
  - **Mot de passe** : `admin123`

## Import SQL :
- Utilisez le fichier `compagnie_dump.sql` fourni pour initialiser la base de données :
  ```bash
  mysql -u root -p compagnie < compagnie_dump.sql_
