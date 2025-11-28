# Mokamint Desktop Miner

Progetto desktop JavaFX per la tesi di Laurea Triennale in Informatica.

## Descrizione

Questo progetto è la versione desktop di un miner Mokamint, basata sull'applicazione Android Mokaminter. 
L'obiettivo attuale è mostrare la struttura dell'app desktopcon GUI funzionante e la logica di base, pronta per essere completata.

## Funzionalità implementate (al momento)

- GUI JavaFX minimale con:
  - Pulsante "Create miner" (stub)
  - Campo Endpoint per inserire l'URL del nodo Mokamint
  - Label per lo Status dell'operazione che mostra messaggi come:
    - "Status: waiting..."
    - "Generating key..."
    - "Key generated"
    - "Creating miner..."
    - "Miner created"
    - "Error: please enter an endpoint"
    
- Classe 'MinerService' con metodi stub: 
  - 'generateKeyPair()'
  - 'createMiner(String endpoint)'

## Struttura del progetto


>     mokamint-desktop-miner/
>     pom.xml
>     README.md                                         # Documentazione
>     .gitignore                                        
> 
>       src/ 
>       main/
>         java/
>           it/univr/mokamintminer/
>             gui/
>               Main.java
>               GUIController.java
> 
>             services/
>               MinerService.java
> 
>             core/                                     # Vuoto per ora, logica miner futura
>             util/                                     # Vuoto per ora, utility future
> 
>         resources/
>           layout/
>             gui.fxml
>     
>       test/                                           # Test futuri
>         java/ 

## Come eseguire il progetto

1. Aprire il progetto con Intellij IDEA o Eclipse con supporto Maven.
2. Assicurarsi di avere Java 17 installato
3. Eseguire 'Main.java' come applicazione JavaFX.

>Al momento, la logica del miner è solo stub. I metodi reali verranno implementati in fasi successive.

## Note

- Maven è utilizzato per gestire le dipendenze e l'avvio di JavaFX. 
- Tutti i file principali sono già presenti e compilabili. 

