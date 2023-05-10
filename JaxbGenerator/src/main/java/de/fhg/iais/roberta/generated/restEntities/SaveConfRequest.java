/*
 * This is a class GENERATED by the TransportGenerator maven plugin. DON'T MODIFY IT.
 * IF you modify it, your work may be lost: the class will be overwritten automatically
 * when the maven plugin is re-executed for any reasons.
 */
package de.fhg.iais.roberta.generated.restEntities;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * the request description for the /saveC and /saveAsC REST request<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class SaveConfRequest extends BaseRequest {
    protected String name;
    protected String configuration;

    /**
     * the request description for the /saveC and /saveAsC REST request
     */
    public static SaveConfRequest make() {
        return new SaveConfRequest();
    }

    /**
     * the request description for the /saveC and /saveAsC REST request
     */
    public static SaveConfRequest makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }

    /**
     * the request description for the /saveC and /saveAsC REST request
     */
    public static SaveConfRequest makeFromProperties(String cmd, String name, String configuration) {
        SaveConfRequest entity = new SaveConfRequest();
        entity.setCmd(cmd);
        entity.setName(name);
        entity.setConfiguration(configuration);
        entity.immutable();
        return entity;
    }

    /**
     * the request description for the /saveC and /saveAsC REST request
     */
    public static SaveConfRequest make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }

    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public SaveConfRequest merge(JSONObject jsonO) {
        try {
            for ( String key : JSONObject.getNames(jsonO) ) {
                if ( "_version".equals(key) ) {
                } else if ( "cmd".equals(key) ) {
                    setCmd(jsonO.optString(key));
                } else if ( "name".equals(key) ) {
                    setName(jsonO.getString(key));
                } else if ( "configuration".equals(key) ) {
                    setConfiguration(jsonO.getString(key));
                } else {
                    throw new RuntimeException("JSON parse error. Found invalid key: " + key + " in " + jsonO);
                }
            }
            return this;
        } catch ( Exception e ) {
            throw new RuntimeException("JSON parse / casting error when parsing: " + jsonO, e);
        }
    }

    /**
     * moves a bean from state "under construction" to state "immutable".<br>
     * Checks whether all required fields are set. All lists are made immutable.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public SaveConfRequest immutable() {
        if ( this.immutable ) {
            return this;
        }
        this.immutable = true;
        return validate();
    }

    /**
     * Checks whether all required fields are set.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    private SaveConfRequest validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "SaveConfRequest-object is already immutable: " + this;
        }
        if ( name == null ) {
            _message = "required property name of SaveConfRequest-object is not set: " + this;
        }
        if ( configuration == null ) {
            _message = "required property configuration of SaveConfRequest-object is not set: " + this;
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }

    /**
     * GET name. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getName() {
        if ( !this.immutable ) {
            throw new RuntimeException("no name from an object under construction: " + this);
        }
        return this.name;
    }

    /**
     * SET name. Object must be mutable.
     */
    public SaveConfRequest setName(String name) {
        if ( this.immutable ) {
            throw new RuntimeException("name assigned to an immutable object: " + this);
        }
        this.name = name;
        return this;
    }

    /**
     * GET configuration. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getConfiguration() {
        if ( !this.immutable ) {
            throw new RuntimeException("no configuration from an object under construction: " + this);
        }
        return this.configuration;
    }

    /**
     * SET configuration. Object must be mutable.
     */
    public SaveConfRequest setConfiguration(String configuration) {
        if ( this.immutable ) {
            throw new RuntimeException("configuration assigned to an immutable object: " + this);
        }
        this.configuration = configuration;
        return this;
    }

    /**
     * generates a JSON-object from an immutable bean.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public JSONObject toJson() {
        if ( !this.immutable ) {
            throw new RuntimeException("no JSON from an object under construction: " + this);
        }
        JSONObject jsonO = new JSONObject();
        try {
            jsonO.put("_version", "1");
            if ( this.cmd != null ) {
                jsonO.put("cmd", this.cmd);
            }
            jsonO.put("name", this.name);
            jsonO.put("configuration", this.configuration);
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }

    @Override
    public String toString() {
        return "SaveConfRequest [immutable=" + this.immutable + ", cmd=" + this.cmd + ", name=" + this.name + ", configuration=" + this.configuration + " ]";
    }

    @Override
    public int hashCode() {
        throw new RuntimeException("no hashCode from transport beans!");
    }

    @Override
    public boolean equals(Object obj) {
        throw new RuntimeException("no equals from transport beans!");
    }

}
