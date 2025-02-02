package de.fhg.iais.roberta.syntax.configuration;

import de.fhg.iais.roberta.transformer.forClass.NepoConfiguration;
import de.fhg.iais.roberta.util.dbc.DbcException;

@NepoConfiguration(name = "AIFES", category = "CONFIGURATION_BLOCK",
    blocklyNames = {"robConf_aifes"})
public class Aifes extends ConfigurationComponent {

    public Aifes() {
        super(null, true, null, null, null);
        throw new DbcException("should NEVER be called");
    }
}