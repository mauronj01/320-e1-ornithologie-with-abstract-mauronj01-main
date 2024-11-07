package services;

import java.time.LocalDate;
import java.util.ArrayList;

import models.Observation;

public class ServiceJournalObservations {

        private ArrayList<Observation> listeObservations;

        /**
         * Constructeur, initialise les attributs de la classe.
         */
        public ServiceJournalObservations() {
                listeObservations = new ArrayList<Observation>();
                chargerObservationsExistantes();
        }

        /**
         * Ajoute une observation dans le journal des observations.
         * 
         * @param observation l'observation à ajouter
         */
        public void ajouterObservation(Observation observation) {
               listeObservations.add(observation);
        }

        /**
         * Retourne la liste des observations du journal,
         * triées par ordre chronologique inverse.
         * 
         * @return la liste des observations
         */
        public ArrayList<Observation> getListObservations() {
                //Collections.sort(listeObservations);
                return listeObservations;
        }

        private void chargerObservationsExistantes() {
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 9, 2), "Anonyme", "", "Bécassine des marais",
                                                "Payerne"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 9, 2), "Anonyme", "", "Bécassine des marais",
                                                "Payerne"));
                listeObservations
                                .add(new Observation(LocalDate.of(2020, 9, 2), "Anonyme", "", "Bécassine des marais",
                                                "Payerne"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 5, 2), "Anonyme", "",
                                                "Pie-grièche à tête rousse", "Fribourg"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 4, 2), "Anonyme", "",
                                                "Pie-grièche à tête rousse", "Lully"));
                listeObservations
                                .add(new Observation(LocalDate.of(2020, 9, 2), "Anonyme", "",
                                                "Pie-grièche à tête rousse", "Moudon"));
                listeObservations.add(new Observation(LocalDate.of(2024, 9, 2), "Anonyme", "observé à l'aube",
                                "Bécassine des marais", "Payerne"));
                listeObservations.add(new Observation(LocalDate.of(2023, 8, 12), "Jean Dupont", "",
                                "Bécassine des marais", "Yverdon-les-Bains"));
                listeObservations.add(new Observation(LocalDate.of(2024, 7, 10), "Marie Schmidt",
                                "dans une zone humide", "Bécassine des marais", "Neuchâtel"));
                listeObservations.add(new Observation(LocalDate.of(2023, 10, 5), "Lucia Ferrari", "",
                                "Bécassine des marais", "Fribourg"));
                listeObservations.add(new Observation(LocalDate.of(2022, 11, 25), "Samuel Weber", "près d'un étang",
                                "Bécassine des marais", "Lausanne"));
                listeObservations.add(new Observation(LocalDate.of(2024, 9, 2), "Anonyme", "observé à l'aube",
                                "Bécassine des marais", "Payerne"));
                listeObservations.add(new Observation(LocalDate.of(2022, 6, 8), "Nicolas Müller", "",
                                "Bécassine des marais", "Sion"));
                listeObservations.add(new Observation(LocalDate.of(2024, 3, 16), "Sophie Lang", "",
                                "Bécassine des marais", "Vevey"));
                listeObservations.add(new Observation(LocalDate.of(2024, 1, 7), "Yves Girard", "près d'une rivière",
                                "Bécassine des marais", "Delémont"));
                listeObservations.add(new Observation(LocalDate.of(2022, 5, 21), "Élodie Fischer", "",
                                "Bécassine des marais", "Monthey"));
                listeObservations.add(new Observation(LocalDate.of(2023, 4, 12), "David Meyer", "vue dans les champs",
                                "Pie-grièche à tête rousse", "Aigle"));
                listeObservations.add(new Observation(LocalDate.of(2022, 9, 19), "Claire Ziegler",
                                "en vol au crépuscule", "Pie-grièche à tête rousse", "Sierre"));
                listeObservations.add(new Observation(LocalDate.of(2024, 7, 3), "Maxime Jung", "",
                                "Pie-grièche à tête rousse", "Bulle"));
                listeObservations.add(new Observation(LocalDate.of(2023, 5, 10), "Chantal Baumann", "",
                                "Pie-grièche à tête rousse", "Sion"));
                listeObservations.add(new Observation(LocalDate.of(2023, 10, 1), "Philippe Marti", "près des bois",
                                "Pie-grièche à tête rousse", "Lausanne"));
                listeObservations.add(new Observation(LocalDate.of(2024, 8, 27), "Véronique Braun", "",
                                "Pie-grièche à tête rousse", "Fribourg"));
                listeObservations.add(new Observation(LocalDate.of(2023, 7, 13), "Pierre Wirth", "",
                                "Pie-grièche à tête rousse", "Zermatt"));
                listeObservations.add(new Observation(LocalDate.of(2022, 3, 16), "Jacqueline Vogt", "",
                                "Pie-grièche à tête rousse", "Porrentruy"));
                listeObservations.add(new Observation(LocalDate.of(2023, 11, 24), "Olivier Bühler", "vue depuis un lac",
                                "Mésange bleue", "Interlaken"));
                listeObservations.add(new Observation(LocalDate.of(2022, 4, 9), "François Geiger", "", "Mésange bleue",
                                "Zurich"));
                listeObservations.add(new Observation(LocalDate.of(2024, 2, 19), "Thomas Herzog",
                                "dans les bois enneigés", "Grand Tétras", "Château-d'Oex"));
                listeObservations.add(new Observation(LocalDate.of(2023, 6, 1), "Isabelle Steiner", "", "Grand Tétras",
                                "Gruyères"));
                listeObservations.add(new Observation(LocalDate.of(2023, 3, 14), "Léonard Blanc", "", "Grand Tétras",
                                "Morges"));
                listeObservations.add(new Observation(LocalDate.of(2022, 7, 9), "Claude Richard", "vu en montagne",
                                "Aigle royal", "Locarno"));
                listeObservations.add(new Observation(LocalDate.of(2024, 1, 18), "Paul Morand", "", "Aigle royal",
                                "Verbier"));
                listeObservations.add(new Observation(LocalDate.of(2023, 5, 7), "Camille Renaud", "", "Aigle royal",
                                "Martigny"));
                listeObservations.add(new Observation(LocalDate.of(2024, 4, 25), "Yannick Keller", "vue au crépuscule",
                                "Effraie des clochers", "Neuchâtel"));
                listeObservations.add(new Observation(LocalDate.of(2023, 11, 17), "Julie Rey", "",
                                "Effraie des clochers", "Sion"));
                listeObservations.add(new Observation(LocalDate.of(2022, 8, 3), "René Weber", "",
                                "Effraie des clochers", "Zurich"));
                listeObservations.add(new Observation(LocalDate.of(2024, 7, 22), "Estelle Wild", "dans les bois",
                                "Autour des palombes", "Bâle"));
                listeObservations.add(new Observation(LocalDate.of(2023, 9, 14), "Dominique Brunner", "",
                                "Autour des palombes", "Schaffhouse"));
                listeObservations.add(new Observation(LocalDate.of(2022, 5, 9), "Hélène Burkhard",
                                "vue près d'un cours d'eau", "Bergeronnette grise", "Genève"));
                listeObservations.add(new Observation(LocalDate.of(2024, 7, 28), "Jean-Marc Zwahlen", "",
                                "Bergeronnette grise", "Meyrin"));
                listeObservations.add(new Observation(LocalDate.of(2023, 12, 15), "Anita Schmid", "",
                                "Bergeronnette grise", "Bienne"));
                listeObservations.add(new Observation(LocalDate.of(2024, 6, 11), "Pierre Vuilleumier",
                                "observée à l'aube", "Bergeronnette grise", "Montreux"));
                listeObservations.add(new Observation(LocalDate.of(2023, 8, 6), "Laurence Widmer",
                                "vue dans les jardins", "Bouvreuil pivoine", "Soleure"));
                listeObservations.add(new Observation(LocalDate.of(2022, 10, 13), "Fanny Keller", "",
                                "Bouvreuil pivoine", "Morges"));
                listeObservations.add(new Observation(LocalDate.of(2024, 1, 8), "Antoine Benz", "",
                                "Bouvreuil pivoine", "Aarau"));
                listeObservations.add(new Observation(LocalDate.of(2023, 9, 17), "Anouk Müller", "",
                                "Bouvreuil pivoine", "Lausanne"));
                listeObservations.add(new Observation(LocalDate.of(2023, 7, 27), "Lucas Huber", "près des champs",
                                "Chardonneret élégant", "Sion"));
                listeObservations.add(new Observation(LocalDate.of(2022, 2, 20), "Marine Gerber", "",
                                "Chardonneret élégant", "Nyon"));
                listeObservations.add(new Observation(LocalDate.of(2023, 8, 24), "Corinne Ruf",
                                "dans une zone forestière", "Chevêchette d'Europe", "Vevey"));
                listeObservations.add(new Observation(LocalDate.of(2022, 9, 5), "Yves Gehrig", "",
                                "Fauvette à tête noire", "Fribourg"));
                listeObservations.add(new Observation(LocalDate.of(2024, 5, 14), "Marc Thalmann", "",
                                "Fauvette à tête noire", "Neuchâtel"));

                listeObservations
                                .add(new Observation(LocalDate.of(2023, 6, 12), "Aline Perret", "",
                                                "Fauvette à tête noire", "Porrentruy"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 7, 1), "Didier Zürcher", "près des bois",
                                                "Huppe fasciée", "Bulle"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 2, 21), "Gabriel Schmid", "", "Huppe fasciée",
                                                "Fribourg"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 12, 9), "Martine Ruf", "", "Mésange bleue",
                                                "Lausanne"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 1, 5), "Lucie Jost", "près des habitations",
                                                "Mésange bleue", "Sion"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 6, 18), "Benoît Frei",
                                                "observée dans les marais", "Bécassine des marais", "Charmey"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 8, 12), "Émilie Kaufmann", "",
                                                "Bécassine des marais", "Rolle"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 9, 22), "Patrick Brunner",
                                                "vue près d'une rivière", "Bécassine des marais", "Gruyères"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 11, 9), "Damien Gautier", "",
                                                "Bécassine des marais", "Broc"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 7, 7), "Elise Köhler", "à proximité de l'eau",
                                                "Bécassine des marais", "Estavayer-le-Lac"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 4, 10), "Louis Moser", "dans un champ ouvert",
                                                "Pie-grièche à tête rousse", "Les Diablerets"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 9, 15), "Sarah Huber", "",
                                                "Pie-grièche à tête rousse", "La Fouly"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 6, 11), "Jérôme Wenger", "vue en vol",
                                                "Pie-grièche à tête rousse", "Riaz"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 12, 1), "Lucienne Forster", "",
                                                "Pie-grièche à tête rousse", "Avenches"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 10, 30), "Nadia Meyer", "",
                                                "Pie-grièche à tête rousse", "Rüschlikon"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 4, 25), "Basile Isler",
                                                "observé au bord du lac", "Mésange bleue", "Cully"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 5, 2), "Lionel Affolter", "", "Mésange bleue",
                                                "Morcote"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 12, 10), "Mireille Wenger",
                                                "dans une forêt dense", "Grand Tétras", "Val d'Illiez"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 6, 30), "Arthur Steiner", "", "Grand Tétras",
                                                "Zinal"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 3, 19), "Éric Gerber", "", "Grand Tétras",
                                                "Liddes"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 7, 24), "Christophe Rey", "en vol majestueux",
                                                "Aigle royal", "Anzère"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 8, 3), "Odile Petit", "", "Aigle royal",
                                                "Leysin"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 1, 9), "Nicolas Favre", "", "Aigle royal",
                                                "Moléson-sur-Gruyères"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 11, 5), "Solène Fischer", "vue au crépuscule",
                                                "Effraie des clochers", "Orsières"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 7, 19), "Valentin Montandon", "",
                                                "Effraie des clochers", "Vernier"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 6, 9), "Laetitia Bühler", "",
                                                "Effraie des clochers", "Moutier"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 10, 18), "Myriam Brunner", "dans une forêt",
                                                "Autour des palombes", "Oron-la-Ville"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 5, 22), "Quentin Hofmann", "",
                                                "Autour des palombes", "Saviese"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 4, 4), "Thomas Zürcher", "près d'un ruisseau",
                                                "Bergeronnette grise", "Chexbres"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 8, 15), "Emma Wyss", "", "Bergeronnette grise",
                                                "Epesses"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 3, 3), "Bernard Jacot",
                                                "observé dans un verger", "Bouvreuil pivoine", "Fully"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 5, 8), "Yvette Maurer", "", "Bouvreuil pivoine",
                                                "Savognin"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 10, 22), "Pascal Mathis", "",
                                                "Bouvreuil pivoine", "Lugnez"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 11, 4), "Manon Egger",
                                                "vue dans un champ fleuri", "Chardonneret élégant", "Couvet"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 8, 6), "Fabienne Habegger", "",
                                                "Chardonneret élégant", "Romont"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 12, 11), "René Wüst", "",
                                                "Chardonneret élégant", "Belfaux"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 2, 18), "Jean-Luc Berger",
                                                "dans une petite forêt", "Chevêchette d'Europe", "Murten"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 1, 26), "Sabine Meyer", "",
                                                "Chevêchette d'Europe", "Gland"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 9, 2), "Lucie Schaller",
                                                "dans un bosquet isolé", "Fauvette à tête noire", "Crans-Montana"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 4, 15), "Gabriel Thalmann", "",
                                                "Fauvette à tête noire", "Les Haudères"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 7, 29), "Vincent Hofstetter",
                                                "vue à proximité des champs", "Huppe fasciée", "Chamoson"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 9, 10), "Élodie Weiss", "", "Huppe fasciée",
                                                "Grandvillard"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 4, 6), "André Monnier", "", "Huppe fasciée",
                                                "Bossonnens"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 3, 12), "Marie-Claude Martinet",
                                                "près d'un village", "Mésange bleue", "Aproz"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 8, 21), "Christian Bischoff", "",
                                                "Mésange bleue", "Neyruz"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 7, 20), "Delphine Reynaud", "", "Mésange bleue",
                                                "Semsales"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 5, 19), "Valérie Joly", "", "Mésange bleue",
                                                "Vufflens-la-Ville"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 9, 10), "Jérôme Suter",
                                                "à proximité des marécages", "Bécassine des marais", "Valangin"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 12, 2), "Diane Fuchs", "",
                                                "Bécassine des marais", "Lignerolle"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 6, 16), "Georges Stauffer", "",
                                                "Bécassine des marais", "Marly"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 8, 26), "Aline Jordi", "vue en pleine campagne",
                                                "Pie-grièche à tête rousse", "Forel (Lavaux)"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 1, 14), "Corinne Pfister", "",
                                                "Pie-grièche à tête rousse", "Epalinges"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 9, 21), "Jérôme Wyss",
                                                "vue depuis les hauteurs", "Mésange bleue", "Champéry"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 5, 8), "Lucienne Stein", "", "Mésange bleue",
                                                "Savièse"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 6, 3), "Bernard Iseli",
                                                "dans une forêt profonde", "Grand Tétras", "Montbovon"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 2, 22), "Philippe Baechler", "", "Grand Tétras",
                                                "Bourg-Saint-Pierre"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 11, 23), "Dominique Keller",
                                                "en vol majestueux", "Aigle royal", "Verbier"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 12, 6), "Jean-Pierre Perren", "", "Aigle royal",
                                                "Mase"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 4, 16), "Christiane Buchs",
                                                "vue à la tombée de la nuit", "Effraie des clochers", "Chippis"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 7, 7), "Alexandre Marchand", "",
                                                "Effraie des clochers", "Brione sopra Minusio"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 8, 14), "Jacques Haller",
                                                "en chasse dans les bois", "Autour des palombes", "Bevaix"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 10, 29), "Christelle Hofer", "",
                                                "Autour des palombes", "Corsier-sur-Vevey"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 9, 1), "Amandine Kuhn",
                                                "vue près d'une petite rivière", "Bergeronnette grise", "Perroy"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 5, 27), "Olivier Marchal", "",
                                                "Bergeronnette grise", "Praz"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 7, 8), "Sylvie Küng",
                                                "dans une prairie fleurie", "Bouvreuil pivoine", "Belprahon"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 12, 19), "Michel Perren", "",
                                                "Bouvreuil pivoine", "Montfaucon"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 6, 1), "Nathalie Burkhalter",
                                                "près des jardins", "Chardonneret élégant", "Aarberg"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 9, 28), "Romain Gysin", "",
                                                "Chardonneret élégant", "Coppet"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 9, 1), "Alain Rey",
                                                "observée en lisière de forêt", "Chevêchette d'Europe",
                                                "Troistorrents"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 2, 5), "Valérie Martin", "",
                                                "Chevêchette d'Europe", "Gryon"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 3, 27), "Clémence Schlup",
                                                "dans une haie bocagère", "Fauvette à tête noire", "Riddes"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 11, 1), "Denis Frei", "",
                                                "Fauvette à tête noire", "Marly"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 8, 14), "Marc Aeberli", "près des pâturages",
                                                "Huppe fasciée", "Moiry"));
                listeObservations
                                .add(new Observation(LocalDate.of(2023, 6, 18), "Séverine Amstutz", "", "Huppe fasciée",
                                                "Rossinière"));
                listeObservations
                                .add(new Observation(LocalDate.of(2022, 12, 20), "Sandrine Gloor",
                                                "près des habitations", "Mésange bleue", "Evilard"));
                listeObservations
                                .add(new Observation(LocalDate.of(2024, 7, 6), "Nicolas Jordi", "", "Mésange bleue",
                                                "Les Cullayes"));

                /*
                 * 
                 * listeObservations
                 * .add(new Observation("Bécassine des marais", LocalDate.of(2024, 9, 2),
                 * "Payerne", "Anonyme", ""));
                 * listeObservations
                 * .add(new Observation("Bécassine des marais", LocalDate.of(2022, 9, 2),
                 * "Payerne", "Anonyme", ""));
                 * listeObservations
                 * .add(new Observation("Bécassine des marais", LocalDate.of(2020, 9, 2),
                 * "Payerne", "Anonyme", ""));
                 * listeObservations
                 * .add(new Observation("Pie-grièche à tête rousse", LocalDate.of(2024, 5, 2),
                 * "Fribourg", "Anonyme", ""));
                 * listeObservations
                 * .add(new Observation("Pie-grièche à tête rousse", LocalDate.of(2022, 4, 2),
                 * "Lully", "Anonyme", ""));
                 * listeObservations
                 * .add(new Observation("Pie-grièche à tête rousse", LocalDate.of(2020, 9, 2),
                 * "Moudon", "Anonyme", ""));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2024, 9, 2), "Payerne", "Anonyme",
                 * "observé à l'aube"));
                 * 
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2023, 8, 12), "Yverdon-les-Bains",
                 * "Jean Dupont", ""));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2024, 7, 10), "Neuchâtel",
                 * "Marie Schmidt", "dans une zone humide"));
                 * listeObservations.add(
                 * new Observation("Bécassine des marais", LocalDate.of(2023, 10, 5),
                 * "Fribourg", "Lucia Ferrari", ""));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2022, 11, 25), "Lausanne",
                 * "Samuel Weber", "près d'un étang"));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2024, 9, 2), "Payerne", "Anonyme",
                 * "observé à l'aube"));
                 * listeObservations
                 * .add(new Observation("Bécassine des marais", LocalDate.of(2022, 6, 8),
                 * "Sion", "Nicolas Müller", ""));
                 * listeObservations
                 * .add(new Observation("Bécassine des marais", LocalDate.of(2024, 3, 16),
                 * "Vevey", "Sophie Lang", ""));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2024, 1, 7), "Delémont",
                 * "Yves Girard", "près d'une rivière"));
                 * listeObservations.add(
                 * new Observation("Bécassine des marais", LocalDate.of(2022, 5, 21), "Monthey",
                 * "Élodie Fischer", ""));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2023, 4, 12), "Aigle",
                 * "David Meyer", "vue dans les champs"));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2022, 9, 19), "Sierre",
                 * "Claire Ziegler", "en vol au crépuscule"));
                 * listeObservations.add(
                 * new Observation("Pie-grièche à tête rousse", LocalDate.of(2024, 7, 3),
                 * "Bulle", "Maxime Jung", ""));
                 * listeObservations.add(
                 * new Observation("Pie-grièche à tête rousse", LocalDate.of(2023, 5, 10),
                 * "Sion", "Chantal Baumann", ""));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2023, 10, 1), "Lausanne",
                 * "Philippe Marti", "près des bois"));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2024, 8, 27), "Fribourg",
                 * "Véronique Braun", ""));
                 * listeObservations.add(
                 * new Observation("Pie-grièche à tête rousse", LocalDate.of(2023, 7, 13),
                 * "Zermatt", "Pierre Wirth", ""));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2022, 3, 16), "Porrentruy",
                 * "Jacqueline Vogt", ""));
                 * listeObservations.add(new Observation("Mésange bleue", LocalDate.of(2023, 11,
                 * 24), "Interlaken",
                 * "Olivier Bühler", "vue depuis un lac"));
                 * listeObservations
                 * .add(new Observation("Mésange bleue", LocalDate.of(2022, 4, 9), "Zurich",
                 * "François Geiger", ""));
                 * listeObservations.add(new Observation("Grand Tétras", LocalDate.of(2024, 2,
                 * 19), "Château-d'Oex",
                 * "Thomas Herzog", "dans les bois enneigés"));
                 * listeObservations
                 * .add(new Observation("Grand Tétras", LocalDate.of(2023, 6, 1), "Gruyères",
                 * "Isabelle Steiner", ""));
                 * listeObservations
                 * .add(new Observation("Grand Tétras", LocalDate.of(2023, 3, 14), "Morges",
                 * "Léonard Blanc", ""));
                 * listeObservations.add(new Observation("Aigle royal", LocalDate.of(2022, 7,
                 * 9), "Locarno", "Claude Richard",
                 * "vu en montagne"));
                 * listeObservations.add(new Observation("Aigle royal", LocalDate.of(2024, 1,
                 * 18), "Verbier", "Paul Morand", ""));
                 * listeObservations
                 * .add(new Observation("Aigle royal", LocalDate.of(2023, 5, 7), "Martigny",
                 * "Camille Renaud", ""));
                 * listeObservations.add(new Observation("Effraie des clochers",
                 * LocalDate.of(2024, 4, 25), "Neuchâtel",
                 * "Yannick Keller", "vue au crépuscule"));
                 * listeObservations
                 * .add(new Observation("Effraie des clochers", LocalDate.of(2023, 11, 17),
                 * "Sion", "Julie Rey", ""));
                 * listeObservations
                 * .add(new Observation("Effraie des clochers", LocalDate.of(2022, 8, 3),
                 * "Zurich", "René Weber", ""));
                 * listeObservations.add(new Observation("Autour des palombes",
                 * LocalDate.of(2024, 7, 22), "Bâle", "Estelle Wild",
                 * "dans les bois"));
                 * listeObservations.add(new Observation("Autour des palombes",
                 * LocalDate.of(2023, 9, 14), "Schaffhouse",
                 * "Dominique Brunner", ""));
                 * listeObservations.add(new Observation("Bergeronnette grise",
                 * LocalDate.of(2022, 5, 9), "Genève",
                 * "Hélène Burkhard", "vue près d'un cours d'eau"));
                 * listeObservations.add(
                 * new Observation("Bergeronnette grise", LocalDate.of(2024, 7, 28), "Meyrin",
                 * "Jean-Marc Zwahlen", ""));
                 * listeObservations
                 * .add(new Observation("Bergeronnette grise", LocalDate.of(2023, 12, 15),
                 * "Bienne", "Anita Schmid", ""));
                 * listeObservations.add(new Observation("Bergeronnette grise",
                 * LocalDate.of(2024, 6, 11), "Montreux",
                 * "Pierre Vuilleumier", "observée à l'aube"));
                 * listeObservations.add(new Observation("Bouvreuil pivoine", LocalDate.of(2023,
                 * 8, 6), "Soleure",
                 * "Laurence Widmer", "vue dans les jardins"));
                 * listeObservations
                 * .add(new Observation("Bouvreuil pivoine", LocalDate.of(2022, 10, 13),
                 * "Morges", "Fanny Keller", ""));
                 * listeObservations
                 * .add(new Observation("Bouvreuil pivoine", LocalDate.of(2024, 11, 8), "Aarau",
                 * "Antoine Benz", ""));
                 * listeObservations
                 * .add(new Observation("Bouvreuil pivoine", LocalDate.of(2023, 9, 17),
                 * "Lausanne", "Anouk Müller", ""));
                 * listeObservations.add(new Observation("Chardonneret élégant",
                 * LocalDate.of(2023, 7, 27), "Sion", "Lucas Huber",
                 * "près des champs"));
                 * listeObservations
                 * .add(new Observation("Chardonneret élégant", LocalDate.of(2022, 2, 20),
                 * "Nyon", "Marine Gerber", ""));
                 * listeObservations.add(new Observation("Chevêchette d'Europe",
                 * LocalDate.of(2023, 8, 24), "Vevey", "Corinne Ruf",
                 * "dans une zone forestière"));
                 * listeObservations
                 * .add(new Observation("Fauvette à tête noire", LocalDate.of(2022, 9, 5),
                 * "Fribourg", "Yves Gehrig", ""));
                 * listeObservations.add(
                 * new Observation("Fauvette à tête noire", LocalDate.of(2024, 5, 14),
                 * "Neuchâtel", "Marc Thalmann", ""));
                 * listeObservations.add(
                 * new Observation("Fauvette à tête noire", LocalDate.of(2023, 6, 12),
                 * "Porrentruy", "Aline Perret", ""));
                 * listeObservations.add(
                 * new Observation("Huppe fasciée", LocalDate.of(2022, 7, 1), "Bulle",
                 * "Didier Zürcher", "près des bois"));
                 * listeObservations
                 * .add(new Observation("Huppe fasciée", LocalDate.of(2024, 2, 21), "Fribourg",
                 * "Gabriel Schmid", ""));
                 * listeObservations
                 * .add(new Observation("Mésange bleue", LocalDate.of(2023, 12, 9), "Lausanne",
                 * "Martine Ruf", ""));
                 * listeObservations.add(new Observation("Mésange bleue", LocalDate.of(2022, 1,
                 * 5), "Sion", "Lucie Jost",
                 * "près des habitations"));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2023, 6, 18), "Charmey",
                 * "Benoît Frei", "observée dans les marais"));
                 * listeObservations.add(
                 * new Observation("Bécassine des marais", LocalDate.of(2024, 8, 12), "Rolle",
                 * "Émilie Kaufmann", ""));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2022, 9, 22), "Gruyères",
                 * "Patrick Brunner", "vue près d'une rivière"));
                 * listeObservations
                 * .add(new Observation("Bécassine des marais", LocalDate.of(2023, 11, 9),
                 * "Broc", "Damien Gautier", ""));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2024, 7, 7), "Estavayer-le-Lac",
                 * "Elise Köhler", "à proximité de l'eau"));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2022, 4, 10), "Les Diablerets",
                 * "Louis Moser", "dans un champ ouvert"));
                 * listeObservations.add(
                 * new Observation("Pie-grièche à tête rousse", LocalDate.of(2023, 9, 15),
                 * "La Fouly", "Sarah Huber", ""));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2024, 6, 11), "Riaz",
                 * "Jérôme Wenger", "vue en vol"));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2023, 12, 1), "Avenches",
                 * "Lucienne Forster", ""));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2022, 10, 30), "Rüschlikon",
                 * "Nadia Meyer", ""));
                 * listeObservations.add(new Observation("Mésange bleue", LocalDate.of(2023, 4,
                 * 25), "Cully", "Basile Isler",
                 * "observé au bord du lac"));
                 * listeObservations
                 * .add(new Observation("Mésange bleue", LocalDate.of(2024, 5, 2), "Morcote",
                 * "Lionel Affolter", ""));
                 * listeObservations.add(new Observation("Grand Tétras", LocalDate.of(2022, 12,
                 * 10), "Val d'Illiez",
                 * "Mireille Wenger", "dans une forêt dense"));
                 * listeObservations
                 * .add(new Observation("Grand Tétras", LocalDate.of(2023, 6, 30), "Zinal",
                 * "Arthur Steiner", ""));
                 * listeObservations.add(new Observation("Grand Tétras", LocalDate.of(2024, 3,
                 * 19), "Liddes", "Éric Gerber", ""));
                 * listeObservations.add(new Observation("Aigle royal", LocalDate.of(2023, 7,
                 * 24), "Anzère", "Christophe Rey",
                 * "en vol majestueux"));
                 * listeObservations.add(new Observation("Aigle royal", LocalDate.of(2022, 8,
                 * 3), "Leysin", "Odile Petit", ""));
                 * listeObservations.add(
                 * new Observation("Aigle royal", LocalDate.of(2024, 1, 9),
                 * "Moléson-sur-Gruyères", "Nicolas Favre", ""));
                 * listeObservations.add(new Observation("Effraie des clochers",
                 * LocalDate.of(2023, 11, 5), "Orsières",
                 * "Solène Fischer", "vue au crépuscule"));
                 * listeObservations.add(new Observation("Effraie des clochers",
                 * LocalDate.of(2022, 7, 19), "Vernier",
                 * "Valentin Montandon", ""));
                 * listeObservations.add(
                 * new Observation("Effraie des clochers", LocalDate.of(2024, 6, 9), "Moutier",
                 * "Laetitia Bühler", ""));
                 * listeObservations.add(new Observation("Autour des palombes",
                 * LocalDate.of(2023, 10, 18), "Oron-la-Ville",
                 * "Myriam Brunner", "dans une forêt"));
                 * listeObservations.add(
                 * new Observation("Autour des palombes", LocalDate.of(2022, 5, 22), "Saviese",
                 * "Quentin Hofmann", ""));
                 * listeObservations.add(new Observation("Bergeronnette grise",
                 * LocalDate.of(2024, 4, 4), "Chexbres",
                 * "Thomas Zürcher", "près d'un ruisseau"));
                 * listeObservations
                 * .add(new Observation("Bergeronnette grise", LocalDate.of(2023, 8, 15),
                 * "Epesses", "Emma Wyss", ""));
                 * listeObservations.add(new Observation("Bouvreuil pivoine", LocalDate.of(2022,
                 * 3, 3), "Fully", "Bernard Jacot",
                 * "observé dans un verger"));
                 * listeObservations
                 * .add(new Observation("Bouvreuil pivoine", LocalDate.of(2024, 5, 8),
                 * "Savognin", "Yvette Maurer", ""));
                 * listeObservations
                 * .add(new Observation("Bouvreuil pivoine", LocalDate.of(2023, 10, 22),
                 * "Lugnez", "Pascal Mathis", ""));
                 * listeObservations.add(new Observation("Chardonneret élégant",
                 * LocalDate.of(2022, 11, 4), "Couvet",
                 * "Manon Egger", "vue dans un champ fleuri"));
                 * listeObservations.add(
                 * new Observation("Chardonneret élégant", LocalDate.of(2024, 8, 6), "Romont",
                 * "Fabienne Habegger", ""));
                 * listeObservations
                 * .add(new Observation("Chardonneret élégant", LocalDate.of(2023, 12, 11),
                 * "Belfaux", "René Wüst", ""));
                 * listeObservations.add(new Observation("Chevêchette d'Europe",
                 * LocalDate.of(2022, 2, 18), "Murten",
                 * "Jean-Luc Berger", "dans une petite forêt"));
                 * listeObservations
                 * .add(new Observation("Chevêchette d'Europe", LocalDate.of(2024, 1, 26),
                 * "Gland", "Sabine Meyer", ""));
                 * listeObservations.add(new Observation("Fauvette à tête noire",
                 * LocalDate.of(2023, 9, 2), "Crans-Montana",
                 * "Lucie Schaller", "dans un bosquet isolé"));
                 * listeObservations.add(new Observation("Fauvette à tête noire",
                 * LocalDate.of(2022, 4, 15), "Les Haudères",
                 * "Gabriel Thalmann", ""));
                 * listeObservations.add(new Observation("Huppe fasciée", LocalDate.of(2023, 7,
                 * 29), "Chamoson",
                 * "Vincent Hofstetter", "vue à proximité des champs"));
                 * listeObservations
                 * .add(new Observation("Huppe fasciée", LocalDate.of(2022, 9, 10),
                 * "Grandvillard", "Élodie Weiss", ""));
                 * listeObservations
                 * .add(new Observation("Huppe fasciée", LocalDate.of(2024, 4, 6), "Bossonnens",
                 * "André Monnier", ""));
                 * listeObservations.add(new Observation("Mésange bleue", LocalDate.of(2023, 3,
                 * 12), "Aproz",
                 * "Marie-Claude Martinet", "près d'un village"));
                 * listeObservations
                 * .add(new Observation("Mésange bleue", LocalDate.of(2022, 8, 21), "Neyruz",
                 * "Christian Bischoff", ""));
                 * listeObservations
                 * .add(new Observation("Mésange bleue", LocalDate.of(2024, 7, 20), "Semsales",
                 * "Delphine Reynaud", ""));
                 * listeObservations.add(
                 * new Observation("Mésange bleue", LocalDate.of(2023, 5, 19),
                 * "Vufflens-la-Ville", "Valérie Joly", ""));
                 * listeObservations.add(new Observation("Bécassine des marais",
                 * LocalDate.of(2024, 9, 10), "Valangin",
                 * "Jérôme Suter", "à proximité des marécages"));
                 * listeObservations.add(
                 * new Observation("Bécassine des marais", LocalDate.of(2023, 12, 2),
                 * "Lignerolle", "Diane Fuchs", ""));
                 * listeObservations.add(
                 * new Observation("Bécassine des marais", LocalDate.of(2022, 6, 16), "Marly",
                 * "Georges Stauffer", ""));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2023, 8, 26), "Forel (Lavaux)",
                 * "Aline Jordi", "vue en pleine campagne"));
                 * listeObservations.add(new Observation("Pie-grièche à tête rousse",
                 * LocalDate.of(2024, 1, 14), "Epalinges",
                 * "Corinne Pfister", ""));
                 * listeObservations.add(new Observation("Mésange bleue", LocalDate.of(2022, 9,
                 * 21), "Champéry", "Jérôme Wyss",
                 * "vue depuis les hauteurs"));
                 * listeObservations
                 * .add(new Observation("Mésange bleue", LocalDate.of(2024, 5, 8), "Savièse",
                 * "Lucienne Stein", ""));
                 * listeObservations.add(new Observation("Grand Tétras", LocalDate.of(2023, 6,
                 * 3), "Montbovon", "Bernard Iseli",
                 * "dans une forêt profonde"));
                 * listeObservations.add(new Observation("Grand Tétras", LocalDate.of(2024, 2,
                 * 22), "Bourg-Saint-Pierre",
                 * "Philippe Baechler", ""));
                 * listeObservations.add(new Observation("Aigle royal", LocalDate.of(2023, 11,
                 * 23), "Verbier", "Dominique Keller",
                 * "en vol majestueux"));
                 * listeObservations
                 * .add(new Observation("Aigle royal", LocalDate.of(2022, 12, 6), "Mase",
                 * "Jean-Pierre Perren", ""));
                 * listeObservations.add(new Observation("Effraie des clochers",
                 * LocalDate.of(2024, 4, 16), "Chippis",
                 * "Christiane Buchs", "vue à la tombée de la nuit"));
                 * listeObservations.add(new Observation("Effraie des clochers",
                 * LocalDate.of(2023, 7, 7), "Brione sopra Minusio",
                 * "Alexandre Marchand", ""));
                 * listeObservations.add(new Observation("Autour des palombes",
                 * LocalDate.of(2022, 8, 14), "Bevaix",
                 * "Jacques Haller", "en chasse dans les bois"));
                 * listeObservations.add(new Observation("Autour des palombes",
                 * LocalDate.of(2023, 10, 29), "Corsier-sur-Vevey",
                 * "Christelle Hofer", ""));
                 * listeObservations.add(new Observation("Bergeronnette grise",
                 * LocalDate.of(2024, 9, 1), "Perroy",
                 * "Amandine Kuhn", "vue près d'une petite rivière"));
                 * listeObservations
                 * .add(new Observation("Bergeronnette grise", LocalDate.of(2023, 5, 27),
                 * "Praz", "Olivier Marchal", ""));
                 * listeObservations.add(new Observation("Bouvreuil pivoine", LocalDate.of(2022,
                 * 7, 8), "Belprahon", "Sylvie Küng",
                 * "dans une prairie fleurie"));
                 * listeObservations.add(
                 * new Observation("Bouvreuil pivoine", LocalDate.of(2023, 12, 19),
                 * "Montfaucon", "Michel Perren", ""));
                 * listeObservations.add(new Observation("Chardonneret élégant",
                 * LocalDate.of(2024, 6, 1), "Aarberg",
                 * "Nathalie Burkhalter", "près des jardins"));
                 * listeObservations
                 * .add(new Observation("Chardonneret élégant", LocalDate.of(2022, 9, 28),
                 * "Coppet", "Romain Gysin", ""));
                 * listeObservations.add(new Observation("Chevêchette d'Europe",
                 * LocalDate.of(2024, 9, 1), "Troistorrents",
                 * "Alain Rey", "observée en lisière de forêt"));
                 * listeObservations
                 * .add(new Observation("Chevêchette d'Europe", LocalDate.of(2023, 2, 5),
                 * "Gryon", "Valérie Martin", ""));
                 * listeObservations.add(new Observation("Fauvette à tête noire",
                 * LocalDate.of(2023, 3, 27), "Riddes",
                 * "Clémence Schlup", "dans une haie bocagère"));
                 * listeObservations
                 * .add(new Observation("Fauvette à tête noire", LocalDate.of(2022, 11, 1),
                 * "Marly", "Denis Frei", ""));
                 * listeObservations.add(new Observation("Huppe fasciée", LocalDate.of(2024, 8,
                 * 14), "Moiry", "Marc Aeberli",
                 * "près des pâturages"));
                 * listeObservations
                 * .add(new Observation("Huppe fasciée", LocalDate.of(2023, 6, 18),
                 * "Rossinière", "Séverine Amstutz", ""));
                 * listeObservations.add(new Observation("Mésange bleue", LocalDate.of(2022, 12,
                 * 20), "Evilard", "Sandrine Gloor",
                 * "près des habitations"));
                 * listeObservations
                 * .add(new Observation("Mésange bleue", LocalDate.of(2024, 7, 6),
                 * "Les Cullayes", "Nicolas Jordi", ""));
                 * 
                 */
        }



       
}
