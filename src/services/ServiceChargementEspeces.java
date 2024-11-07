package services;

import java.util.ArrayList;

import models.Caracteristiques;
import models.CriteresIdentification;
import models.EspeceDetail;
import models.ImageSource;
import models.Population;
import models.StatutDeMenace;

public class ServiceChargementEspeces {

    private final ArrayList<EspeceDetail> listDesEspeces;

    /**
     * Constructeur, initialise les attributs de la classe.
     */
    public ServiceChargementEspeces() {

        listDesEspeces = new ArrayList<>();
  
        listDesEspeces.add(creerBecassineDesMarais());
        listDesEspeces.add(creerPieGriecheATeteRousse());
        listDesEspeces.add(creerBalbuzardPecheur());
        listDesEspeces.add(creerGrandTetras());
        listDesEspeces.add(creerAigleRoyal());
        listDesEspeces.add(creerEffraieDesClochers());
        listDesEspeces.add(creerAutourDesPalombes());
        listDesEspeces.add(creerBergeronnetteGrise());
        listDesEspeces.add(creerChardonneretElegant());
        listDesEspeces.add(creerChevechetteDEurope());
        listDesEspeces.add(creerFauvetteATeteNoire());
        listDesEspeces.add(creerHuppeFasciee());
        listDesEspeces.add(creerMesangeBleue());
        listDesEspeces.add(creerBouvreuilPivoine());
    }


    /**
    * Fourni une liste d'instance de la classe EspeceDetail. Ces objets sont remplis avec 
    * toutes les données concernant chaque espèces d'oiseaux.
    *
    * @return un liste d'espèces.
    */
    public ArrayList<EspeceDetail> getListDesEspeces() {
        return listDesEspeces;
    }

    private EspeceDetail creerBecassineDesMarais() {
        String nomCommun = "Bécassine des marais";
        String nomScientifique = "Gallinago gallinago";

        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace(
                "CR",
                "au bord de l'extinction (CR)",
                true);

        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
                "brun rayé et marqueté",
                "très long bec droit",
                "fortement rayée",
                "courte queue bordée de blanc",
                "en zigzag avec cris rauques",
                "identiques");

        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
                "Chevaliers et Bécasseaux",
                "23-28",
                "44-47",
                "80-120",
                "insectes, vers",
                "zone agricole, lacs, zones humides, cours d'eau",
                "de migrateur à courte distance à migrateur au long cours",
                "sol",
                20,
                1,
                4,
                21,
                "18 années 3 mois",
                "-",
                "migrateur régulier, hivernant fréquent");

        // Création de l'objet Population
        Population population = new Population(
                "0-1 couples");

        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
                "views/img/" + nomCommun + ".jpg",
                "views/img/" + nomCommun + "_rep.jpg");

        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
                nomCommun,
                nomScientifique,
                "Personne ne se douterait de leur présence si les Bécassines des marais, invisibles lorsqu’elles sont au sol ne jaillissaient, comme catapultées en l’air à quelques mètres de l’Homme qui s’approche. Les unes après les autres, elles fusent dans le ciel comme un feu d’artifice, fendant l’air de leur bec en aiguille. Comme si elles redoutaient un coup de fusil, elles montent en zigzag, prennent vite de l’altitude et font mine de disparaître au loin. En fait, elles reviennent rapidement dès que le terrain est libre, au plus tard à la nuit tombée.",
                statutDeMenace,
                criteresIdentification,
                caracteristiques,
                population,
                imageSource);
    }

    private EspeceDetail creerPieGriecheATeteRousse() {
        String nomCommun = "Pie-grièche à tête rousse";
        String nomScientifique = "Lanius senator";

        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace(
                "CR",
                "au bord de l'extinction (CR)",
                true);

        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
                "dessus de la tête et nuque roux vif",
                "dessus brun sombre avec épaules et croupion blancs",
                "dessous blanc",
                "", // champ "queue" vide car non fourni
                "", // champ "vol" vide car non fourni
                "" // champ "sexes" vide car non fourni
        );

        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
                "Pies-grièches",
                "17-19",
                "26-28",
                "35-45",
                "insectes, petits mammifères, reptiles",
                "vergers",
                "migrateur au long cours",
                "arbres",
                16,
                1,
                5, // Conversion du nombre d'œufs "5-6" en un entier (5)
                19,
                "5 années 8 mois",
                "-",
                "migrateur rare, éteint comme nicheur");

        // Création de l'objet Population
        Population population = new Population(
                "0 couples");

        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
                "views/img/" + nomCommun + ".jpg",
                "views/img/" + nomCommun + "_rep.jpg");

        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
                nomCommun,
                nomScientifique,
                "Avec le temps s’en va la Pie-grièche à tête rousse, dans l’effrayante accélération d’un monde qui oublie ses repères. A l’agonie en Suisse, elle a disparu notamment suite au massacre des vergers et des hannetons, désertant tour à tour le Moyen-Pays, le Tessin, le Valais, et même les grands vergers bâlois et argoviens, ses fiefs d’autrefois. Se retirant aujourd’hui vers ses bastions méditerranéens, la plus musicienne de nos pies-grièches avait pourtant bien sa place parmi nous, apportant une note supplémentaire de couleur dans les vergers en fleurs.",
                statutDeMenace,
                criteresIdentification,
                caracteristiques,
                population,
                imageSource);
    }

    private EspeceDetail creerBalbuzardPecheur() {
        String nomCommun = "Balbuzard pêcheur";
        String nomScientifique = "Pandion haliaetus";

        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace(
                "RE",
                "éteint en Suisse (RE)",
                false);

        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
                "dessus brun chocolat, en contraste avec le blanc pur du dessous",
                "bec noir à base bleuâtre",
                "tête blanc crème bridée de noir",
                "", // champ "queue" vide car non fourni
                "", // champ "vol" vide car non fourni
                "identiques");

        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
                "Balbuzard",
                "52-60",
                "152-167",
                "1200-2050",
                "poissons",
                "lacs, cours d'eau",
                "migrateur au long cours",
                "arbres, pylônes",
                37,
                1,
                2, // Conversion du nombre d'œufs "2-3" en un entier (2)
                44,
                "26 années 1 mois",
                "-",
                "migrateur régulier, éteint comme nicheur");

        // Création de l'objet Population
        Population population = new Population(
                "0 couples");

        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
                "views/img/" + nomCommun + ".jpg",
                "views/img/" + nomCommun + "_rep.jpg");

        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
                nomCommun,
                nomScientifique,
                "L’oeil bandé par un foulard lui donnant un air de corsaire aux multiples exploits, le Balbuzard est l’un des rapaces les plus démonstratifs, prodigue de vertigineuses scènes de pêche: après une chute en piqué, il projette ses énormes pattes en avant et déploie ses ailes juste avant l’impact, faisant jaillir l’écume. Ses serres démesurément longues et recourbées agrippent les poissons les plus lisses, ce qui n’est pas sans risque pour le prédateur: il disparaît parfois entièrement sous l’eau et il peut arriver qu’il se noie en restant accroché à un poisson trop lourd.",
                statutDeMenace,
                criteresIdentification,
                caracteristiques,
                population,
                imageSource);
    }

    private EspeceDetail creerGrandTetras() {
        String nomCommun = "Grand Tétras";
        String nomScientifique = "Tetrao urogallus";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("EN", "en danger (EN)", true);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "brun-noir à réflets verts sur la poitrine", 
            "", 
            "femelle plus petite et brun-roux tacheté", 
            "large queue en éventail", 
            "", 
            ""
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Tétras", "60-87", "87-125", "1500-4400", 
            "végétaux, baies", "forêt", "sédentaire", 
            "sol", 24, 1, 7, 14, "10 années 9 mois", 
            "10 années 9 mois", "rare toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("380-480 masculins");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Comme envoûté par une force suprême venue du fond des âges, devenu l’instrument d’un instinct irrépressible, le Grand Tétras fait la roue, les ailes pendantes, le bec fièrement levé et la barbiche hérissée, se pavanant presque en secret dans l’alcôve de la forêt. C’est l’image d’Epinal la plus connue du public et pourtant, la rencontre avec ce géant secret se résume le plus souvent à l’envol fracassant d’un bolide noir qui surprend le promeneur passant à proximité de l’arbre sur lequel l’oiseau était perché.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }

    private EspeceDetail creerAigleRoyal() {
        String nomCommun = "Aigle royal";
        String nomScientifique = "Aquila chrysaetos";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("NT", "potentiellement menacé (NT)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "uniformément brun foncé, sauf la nuque, ocre doré", 
            "bec puissant et épais", 
            "femelle plus grande que le mâle", 
            "tête et queue proéminentes", 
            "au vol, ailes longues et larges de grande taille", 
            ""
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Milans, Vautours, Buses et alliés", "75-88", "190-225", "2850-6700", 
            "mammifères, oiseaux, charognes", "montagne", "sédentaire", 
            "anfractuosités rocheuses, arbres", 43, 1, 2, 74, 
            "32 années 0 mois", "-", "peu fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("350-360 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "L’Aigle royal est le plus grand prédateur ayant survécu dans notre pays. Il est là pour nous rappeler le temps où la nature était intacte, avec ses Loups et ses Ours. Son inaccessibilité dans la montagne, son royaume, l’a partiellement protégé des assauts de la civilisation et des persécutions humaines. C’est un des rapaces les plus faciles à identifier grâce à sa silhouette en dièdre, bras et doigts relevés, sa queue relativement longue et sa tête proéminente.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }
    private EspeceDetail creerEffraieDesClochers() {
        String nomCommun = "Effraie des clochers";
        String nomScientifique = "Tyto alba";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("NT", "potentiellement menacé (NT)", true);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "dessus roux doré", 
            "", 
            "femelle légèrement plus grisâtre", 
            "", 
            "", 
            ""
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Effraies", "33-35", "85-93", "290-460", 
            "petits mammifères, oiseaux", "zone agricole, agglomérations", 
            "essentiellement sédentaire", "bâtiments", 33, 1, 4, 63, 
            "17 années 11 mois", "-", "peu fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("200-1'000 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Le faciès fantomatique de la «dame blanche», ses moeurs strictement nocturnes et ses chuintements étranges dans les greniers ont fait naître des légendes insensées à son sujet. Ainsi, une croyance populaire prétendait que le fait de clouer l’Effraie sur la porte de sa maison en éloignait les mauvais esprits! La discrétion de cette chouette à magnifique robe perlée, qui vit pourtant à proximité de l’Homme dans les fermes, a longtemps alimenté le mythe: ses apparitions se limitent le plus souvent à une silhouette furtive, éclatante de blancheur dans la lueur des phares.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }
   
    
    private EspeceDetail creerAutourDesPalombes() {
        String nomCommun = "Autour des palombes";
        String nomScientifique = "Accipiter gentilis";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("NT", "potentiellement menacé (NT)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "silhouette d'Epervier; dessus brun-gris ardoisé; sourcil clair; dessous blanc rayé sur la gorge et barré sur le ventre de brun-noir; soucaudales blanches; queue barrée de sombre; bec sombre à cire jaune; pattes jaunes; iris jaune-orangé", 
            "bec sombre à cire jaune", 
            "sourcil clair, iris jaune-orangé", 
            "queue barrée de sombre", 
            "", 
            "La femelle est plus corpulente que le mâle"
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Milans, Vautours, Buses et alliés", "48-62", "93-127", "500-1350", 
            "petits mammifères, oiseaux", "forêt", "sédentaire", 
            "arbres", 36, 1, 3, 36, 
            "19 années 9 mois", "-", "peu fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("1’300-1’700 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Puissant, rapide et fougueux prédateur capable de terrasser un renard, l’Autour est le rapace de «bas vol» le plus apprécié en fauconnerie pour ses redoutables capacités de chasseur. D’une sauvagerie farouche, il se tient le plus souvent caché à l’affût dans la forêt, dont il ne sort que brièvement lors de ses chasses ou de ses parades amoureuses. La férocité de son regard est accentuée par le large sourcil blanc.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }
        
    private EspeceDetail creerBergeronnetteGrise() {
        String nomCommun = "Bergeronnette grise";
        String nomScientifique = "Motacilla alba";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("LC", "non menacé (LC)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "parties supérieures gris clair; parties inférieures et face blanches; dessus de la tête, nuque, menton et gorge noir (en plumage nuptial); ailes noires avec deux barres blanches; longue queue noire à rectrices externes blanches; en hiver, menton et haut de la poitrine blancs", 
            "", 
            "dessus de la tête, nuque, menton et gorge noir (en plumage nuptial); en hiver, menton et haut de la poitrine blancs", 
            "longue queue noire à rectrices externes blanches", 
            "", 
            ""
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Pipits et Bergeronnettes", "17-19", "25-30", "19-27", 
            "insectes", "zone agricole, lacs, zones humides, cours d'eau, agglomérations", 
            "essentiellement migrateur à courte distance", "bâtiments", 12, 2, 5, 13, 
            "12 années 3 mois", "-", "fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("90’000-110’000 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Les noms d’oiseaux ne sont qu’une affaire de mode: autrefois appelée «lavandière» en raison de son attrait pour l’eau, puis «hochequeue» en référence à son tic, on lui a finalement préféré le qualificatif de «bergeronnette». Celui-ci sied bien à une habituée des rivages, bien qu’elle soit très éclectique dans le choix de ses habitats. C’est la deuxième espèce non forestière la plus fréquente derrière le Rougequeue noir, et son penchant pour les habitations rurales en fait une des mieux connues du grand public.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }
    private EspeceDetail creerBouvreuilPivoine() {
        String nomCommun = "Bouvreuil pivoine";
        String nomScientifique = "Pyrrhula pyrrhula";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("LC", "non menacé (LC)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "calotte noire; ailes noires barrées de gris clair; queue noire; croupion blanc; mâle à poitrine rose vif; femelle à poitrine gris-brun", 
            "", 
            "calotte noire", 
            "queue noire", 
            "", 
            "mâle à poitrine rose vif; femelle à poitrine gris-brun"
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Fringilles", "14-16", "22-26", "21-27", 
            "bourgeons, graines", "forêt décidue, agglomérations", 
            "sédentaire et migrateur à courte distance", "arbres, buissons", 13, 2, 4, 16, 
            "12 années 7 mois", "-", "fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("40’000-75’000 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Le Bouvreuil est le joyau de nos forêts: les couleurs vives du mâle, un régal pour les yeux, contrastent avec la sobriété élégante de la femelle. Mais c’est un oiseau émotif et discret qui ne se montre pas volontiers à découvert, le mâle surtout étant avare d’exhibitions. A croire que le bandit cagoulé, émondeur de bourgeons sait qu’il est mal-aimé des arboriculteurs. Souvent caché et paisible, il se signale surtout par son cri doux et mélancolique et ce n’est que tenaillé par la faim qu’il daigne se montrer aux mangeoires.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }
    private EspeceDetail creerChardonneretElegant() {
        String nomCommun = "Chardonneret élégant";
        String nomScientifique = "Carduelis carduelis";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("LC", "non menacé (LC)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "plumage bariolé; queue noire et blanche; ailes noires, avec une large bande jaune; masque rouge; reste de la tête blanc et noir; sexes identiques. Les jeunes sont grisâtres, striés de brun foncé, et n'ont pas de rouge ni de noir à la tête.", 
            "", 
            "masque rouge; reste de la tête blanc et noir", 
            "queue noire et blanche", 
            "", 
            "sexes identiques"
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Fringilles", "12-13", "21-25", "12-18", 
            "graines", "gravières, zone agricole, agglomérations", 
            "sédentaire et migrateur à courte distance", "arbres, buissons", 12, 2, 4, 12, 
            "11 années 9 mois", "-", "fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("50’000-70’000 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "«De grâce épargnez les chardons!» semblent implorer les bandes cliquetantes de Chardonnerets peinturlurés, qui apportent un peu de fantaisie aux côtés des derniers papillons survivant dans nos plaines aseptisées. Laissons fleurir les chardons, ils nous enchanteront de leur cortège d’amateurs ailés. De nos jours encore, le petit Ibère expatrié est souvent fait prisonnier afin d’être admiré à loisir dans sa patrie de cœur, mais alors quel pathétique spectacle en comparaison de l’être libre virevoltant dans la prairie fleurie!",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }

    private EspeceDetail creerChevechetteDEurope() {
        String nomCommun = "Chevêchette d'Europe";
        String nomScientifique = "Glaucidium passerinum";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("LC", "non menacé (LC)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "hibou minuscule, sans aigrettes; disques fasciaux très nets; yeux jaunes, sourcils blancs; les jeunes sont moins barrés mais plus bruns.", 
            "", 
            "yeux jaunes, sourcils blancs", 
            "", 
            "", 
            "les jeunes sont moins barrés mais plus bruns"
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Chouettes et Hiboux", "16-17", "34-36", "50-80", 
            "petits mammifères, oiseaux", "forêt", 
            "sédentaire", "cavités d'arbres", 28, 1, 4, 27, 
            "6 années 0 mois", "-", "peu fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("800-2’000 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Pygmée parmi les chouettes, la Chevêchette témoigne pourtant d’une férocité peu commune, s’attaquant sans hésitation à des oiseaux plus gros qu’elle. Lorsqu’une proie passe à sa portée, la boule de plumes immobile à la pointe des sapins se transforme en obus meurtrier, fonçant en ondulant dans le sous-bois. C’est le plus diurne de nos rapaces nocturnes, se montrant volontiers en plein jour, alors houspillé sans relâche par les passereaux dont il est la terreur nocturne.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }

    private EspeceDetail creerFauvetteATeteNoire() {
        String nomCommun = "Fauvette à tête noire";
        String nomScientifique = "Sylvia atricapilla";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("LC", "non menacé (LC)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "brun grisâtre dessus, blanchâtre dessous; calotte noire chez le mâle, brune chez la femelle et les jeunes.", 
            "", 
            "calotte noire chez le mâle, brune chez la femelle et les jeunes", 
            "", 
            "", 
            ""
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Fauvettes et alliés", "13-15", "22-24", "14-20", 
            "insectes, baies", "haies, forêt, zones humides, agglomérations", 
            "essentiellement migrateur à courte distance", "arbres, buissons", 13, 1, 3, 10, 
            "11 années 4 mois", "8 années 1 mois", "nicheur fréquent, hivernant rare"
        );
    
        // Création de l'objet Population
        Population population = new Population("700’000-800’000 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Résolument optimiste jusque dans sa conclusion flûtée, le chant de la Fauvette à tête noire est parmi les plus gais qui soient. La plus arboricole de nos fauvettes, à l’aise dans la canopée, n’a en effet guère de souci à se faire, ses moeurs peu spécialisées en faisant l’un des dix passereaux les plus abondants en Europe. Son potentiel d’adaptation particulièrement élevé lui a permis de s’accommoder des milieux façonnés par l’Homme et même de développer de nouvelles stratégies migratoires.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }
    
    private EspeceDetail creerHuppeFasciee() {
        String nomCommun = "Huppe fasciée";
        String nomScientifique = "Upupa epops";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("VU", "vulnérable (VU)", true);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "plumage brun rosé avec le bas du dos, les ailes et la queue largement rayés de noir et de blanc", 
            "long bec courbe noirâtre", 
            "", 
            "", 
            "", 
            "sexes identiques"
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Huppes", "26-28", "42-46", "55-80", 
            "insectes", "zone agricole, vergers", 
            "migrateur au long cours", "bâtiments, cavités", 15, 1, 5, 21, 
            "11 années 1 mois", "5 années 0 mois", "nicheur rare, migrateur régulier"
        );
    
        // Création de l'objet Population
        Population population = new Population("180-260 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Combien de fois encore le vol papillonnant de la Huppe nous surprendra-t-il au détour d’un chemin, pour combien de temps la verra-t-on opiner du chef en délivrant son chant si particulier, ou déployer l’éventail de sa huppe dans l’excitation d’une trouvaille alléchante? Autrefois répandue dans toute la Suisse, cette espèce singulière ne niche pratiquement plus qu’en Valais central, où elle trouve encore les Courtilières et autres grands insectes qui lui sont indispensables.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }

    private EspeceDetail creerMesangeBleue() {
        String nomCommun = "Mésange bleue";
        String nomScientifique = "Cyanistes caeruleus";
    
        // Création de l'objet StatutDeMenace
        StatutDeMenace statutDeMenace = new StatutDeMenace("LC", "non menacé (LC)", false);
    
        // Création de l'objet CriteresIdentification
        CriteresIdentification criteresIdentification = new CriteresIdentification(
            "plumage bleuté, vert olive et jaune", 
            "", 
            "calotte séparée du masque noir par une bande blanche", 
            "", 
            "", 
            "sexes identiques"
        );
    
        // Création de l'objet Caracteristiques
        Caracteristiques caracteristiques = new Caracteristiques(
            "Mésanges", "11-12", "18-20", "9-12", 
            "insectes, graines", "forêt de feuillus, vergers, agglomérations", 
            "sédentaire et migrateur à courte distance", "cavités", 13, 1, 6, 19, 
            "14 années 7 mois", "9 années 5 mois", "fréquent toute l'année"
        );
    
        // Création de l'objet Population
        Population population = new Population("200'000-300'000 couples");
    
        // Création de l'objet ImageSource
        ImageSource imageSource = new ImageSource(
            "views/img/" + nomCommun + ".jpg", 
            "views/img/" + nomCommun + "_rep.jpg"
        );
    
        // Instanciation de l'objet EspeceDetail
        return new EspeceDetail(
            nomCommun,
            nomScientifique,
            "Emerveillements de l’enfance que sont les allées et venues des mésanges, toutes si semblables et si différentes à la fois, se succédant à la mangeoire. La petite bleue est souvent la plus guettée, ses couleurs vives étant des plus attractives, avec un délicat trait de pinceau prolongeant l’oeil et lui apportant une touche de féminité. Son caractère de chipie lui permet de tenir tête à sa grande concurrente Charbonnière et donne lieu à des intimidations aux issues incertaines, en regard desquelles les lions à la télévision sont bien ennuyeux.",
            statutDeMenace, 
            criteresIdentification, 
            caracteristiques, 
            population, 
            imageSource
        );
    }
    
              
       
            
            
}
