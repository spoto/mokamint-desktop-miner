package it.univr.mokamintminer.gui;

import it.univr.mokamintminer.services.MinerService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GUIController {

    @FXML
    private TextField endpointField;

    @FXML
    private Label statusLabel;

    private MinerService minerService = new MinerService();

    @FXML
    private void onGenerateKey() {
        statusLabel.setText("Generate key...");
        // per ora è solo una funzione finta
        minerService.generateKeyPair();
        statusLabel.setText("Key generated");
    }

    @FXML
    private void onCreateMiner() {
        String endpoint = endpointField.getText().trim();

        if (endpoint.isEmpty()) {
            statusLabel.setText("Error: please enter an endpoint");
            return;
        }

        statusLabel.setText("Creating miner...");
        // anche questa ancora da creare
        minerService.createMiner(endpoint);
        statusLabel.setText("Miner created");
    }
}
