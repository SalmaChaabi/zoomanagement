# 🦁 Zoo Management Project – Java

## 📌 Description
Ce projet Java est une application de *gestion d’un zoo*, développée progressivement à travers
plusieurs *prosits pédagogiques*.  
Chaque prosit introduit un nouveau concept fondamental de Java et de la programmation orientée objet.

---

## 📁 Structure du projet

src/
└── tn/
    └── esprit/
        └── gestionzoo/
            ├── entities/
            │   ├── Animal.java
            │   ├── Aquatic.java
            │   ├── Dolphin.java
            │   ├── Penguin.java
            │   ├── Terrestrial.java
            │   ├── Zoo.java
            │   └── Food.java
            │
            ├── interfaces/
            │   ├── Carnivore.java
            │   ├── Herbivore.java
            │   └── Omnivore.java
            │
            ├── exceptions/
            │   ├── ZooFullException.java
            │   └── InvalidAgeException.java
            │
            └── main/
                └── ZooManagement.java

---

## 🧩 Prosit 1 – Bases de la POO
*Objectif :* Comprendre les bases de la programmation orientée objet.

- Création de la classe Animal
- Encapsulation des attributs
- Constructeur paramétré
- Getters et setters
- Méthode toString()

*Concepts :* classes, objets, encapsulation

---

## 🧩 Prosit 2 – Gestion du Zoo
*Objectif :* Gérer un ensemble d’objets.

- Création de la classe Zoo
- Tableau d’objets Animal[]
- Méthode addAnimal()
- Vérification si le zoo est plein
- Classe principale ZooManagement

*Concepts :* tableaux, méthodes, logique métier

---

## 🧩 Prosit 3 – Validation des données
*Objectif :* Rendre le programme plus robuste.

- Vérification de l’âge de l’animal
- Interdiction des âges négatifs
- Utilisation du setter setAge()

*Concepts :* validation, sécurité des données

---

## 🧩 Prosit 4 – Héritage
*Objectif :* Réutiliser le code avec l’héritage.

- Création de la classe Terrestrial
- Création de la classe abstraite Aquatic
- Héritage à partir de Animal
- Ajout d’attributs spécifiques

*Concepts :* héritage, extends, classes abstraites

---

## 🧩 Prosit 5 – Polymorphisme
*Objectif :* Manipuler les objets via leur classe mère.

- Création des classes Dolphin et Penguin
- Redéfinition de méthodes
- Utilisation du polymorphisme

*Concepts :* polymorphisme, redéfinition

---

## 🧩 Prosit 6 – Méthodes avancées
*Objectif :* Travailler avec des types spécifiques.

- Gestion des animaux aquatiques
- Méthode makeAquaticsSwim()
- Calcul de la profondeur maximale des pingouins
- Redéfinition de equals()

*Concepts :* instanceof, cast, méthodes avancées

---

## 🧩 Prosit 7 – Gestion des exceptions
*Objectif :* Gérer les erreurs proprement.

- Création de ZooFullException
- Création de InvalidAgeException
- Utilisation de try / catch
- Levée d’exceptions personnalisées

*Concepts :* exceptions, robustesse

---

## 🧩 Prosit 8 – Interfaces et Enum
*Objectif :* Modéliser les comportements alimentaires.

- Création des interfaces :
  - Carnivore
  - Herbivore
  - Omnivore
- Création de l’énumération Food
- Implémentation des interfaces dans les classes
- Tests d’alimentation dans ZooManagement

*Concepts :* interfaces, enum, généricité

---

Prosit 9 – Collections (List, Set, Map)

Objectif : Remplacer les tableaux par des collections plus flexibles.

Contenu :

Remplacement de Animal[] par List<Animal>

Utilisation de ArrayList

Ajout, suppression et recherche d’animaux

Parcours avec for-each

Gestion dynamique de la taille du zoo

Concepts :

Collections Java

List, ArrayList

Généricité (<Animal>)

Avantages des collections vs tableaux

---
🧩 Prosit 10 – Expressions Lambda et Streams

Objectif : Manipuler les données de façon moderne et efficace.

Contenu :

Utilisation des expressions lambda

Filtrage des animaux (aquatiques, terrestres, carnivores…)

Utilisation de l’API Stream

Calculs (ex : nombre d’animaux, profondeur max, etc.)

Tri des animaux selon des critères (âge, nom…)

Concepts :

Lambda expressions

Stream API

filter, map, forEach, count

Programmation fonctionnelle en Java

---

## ✅ Conclusion
Ce projet permet de maîtriser progressivement :
- La programmation orientée objet en Java
- L’héritage et le polymorphisme
- La gestion des exceptions
- L’utilisation des interfaces et des énumérations

Il constitue une base solide pour des projets Java plus avancés.



www.linkedin.com/in/salma-chaabi-8587b1263






