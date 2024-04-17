# Votre mission si vous l'acceptez !
![image](https://github.com/emf-info-226b/Telephone-Javadoc/assets/3630367/40a41ffe-6526-4b19-a700-8e7d220c6ad5)

Vous êtes le "Product Owner" de l'équipe de développement de la société FluxMedia. Vous travaillez aujourd'hui depuis la maison et vous devez transmettre une spécification à un développeur de votre équipe sur un ticket bien précis de la "Product Backlog".
L'objectif est de rédiger une spécification la plus précise possible pour que le développeur ait le moins de question en codant la méthode.

Récupérez le projet GitHub ci-dessous contenant la méthode et faites-en une Javadoc soignée et le plus complet possible. 

Il manque intentionnellement des informations ci-dessous. Vous devez choisir le comportement souhaité. A vous de définir le comportement de tous les cas possibles.

Méthode Numéro de téléphone mobile

```
public boolean controleNumeroTelMobile( String prefix, String numero) {}
	
Les seuls 4 préfixes standard à utiliser sont +4176, +4177, +4178 et +4179 et les seuls caractères autorisés pour le numéro sont les caractères 0-9 et les espaces. 
Comportement souhaité de la méthode :
	
prefix	  numero	      resultat souhaité
"+4177"	  "744 92 31"	  true
"+4171"	  "798 76 67"	  false
"+4176"	  "7973331"	    false
"079"	    "733.12.33"	  false
```
Dès que vous avez terminé la spécification de la méthode vous pouvez réaliser un git push pour déposer la spécification de la méthode.
