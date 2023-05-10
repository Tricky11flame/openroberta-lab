/*
 * This is a class GENERATED by the TransportGenerator maven plugin. DON'T MODIFY IT.
 * IF you modify it, your work may be lost: the class will be overwritten automatically
 * when the maven plugin is re-executed for any reasons.
 */
package de.fhg.iais.roberta.generated.restEntities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class ChangeUserGroupRequest extends BaseRequest {
    protected String groupName;
    protected List<String> groupMemberNames;

    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest make() {
        return new ChangeUserGroupRequest();
    }

    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }

    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest makeFromProperties(String cmd, String groupName, List<String> groupMemberNames) {
        ChangeUserGroupRequest entity = new ChangeUserGroupRequest();
        entity.setCmd(cmd);
        entity.setGroupName(groupName);
        entity.setGroupMemberNames(groupMemberNames);
        entity.immutable();
        return entity;
    }

    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }

    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public ChangeUserGroupRequest merge(JSONObject jsonO) {
        try {
            for ( String key : JSONObject.getNames(jsonO) ) {
                if ( "_version".equals(key) ) {
                } else if ( "cmd".equals(key) ) {
                    setCmd(jsonO.optString(key));
                } else if ( "groupName".equals(key) ) {
                    setGroupName(jsonO.getString(key));
                } else if ( "groupMemberNames".equals(key) ) {
                    JSONArray array = jsonO.optJSONArray(key);
                    if ( array != null && array.length() > 0 ) {
                        for ( int i = 0; i < array.length(); i++ ) {
                            addGroupMemberNames(array.getString(i));
                        }
                    } else {
                        setGroupMemberNames(new ArrayList<String>());
                    }
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
    public ChangeUserGroupRequest immutable() {
        if ( this.immutable ) {
            return this;
        }
        this.immutable = true;
        this.groupMemberNames = (this.groupMemberNames != null) ? Collections.unmodifiableList(this.groupMemberNames) : null;
        return validate();
    }

    /**
     * Checks whether all required fields are set.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    private ChangeUserGroupRequest validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "ChangeUserGroupRequest-object is already immutable: " + this;
        }
        if ( groupName == null ) {
            _message = "required property groupName of ChangeUserGroupRequest-object is not set: " + this;
        }
        if ( groupMemberNames == null ) {
            _message = "required property groupMemberNames of ChangeUserGroupRequest-object is not set: " + this;
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }

    /**
     * GET groupName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getGroupName() {
        if ( !this.immutable ) {
            throw new RuntimeException("no groupName from an object under construction: " + this);
        }
        return this.groupName;
    }

    /**
     * SET groupName. Object must be mutable.
     */
    public ChangeUserGroupRequest setGroupName(String groupName) {
        if ( this.immutable ) {
            throw new RuntimeException("groupName assigned to an immutable object: " + this);
        }
        this.groupName = groupName;
        return this;
    }

    /**
     * GET groupMemberNames. Object must be immutable. Never return null or an undefined/default value.
     */
    public List<String> getGroupMemberNames() {
        if ( !this.immutable ) {
            throw new RuntimeException("no groupMemberNames from an object under construction: " + this);
        }
        return this.groupMemberNames;
    }

    /**
     * SET groupMemberNames. Object must be mutable.
     */
    public ChangeUserGroupRequest setGroupMemberNames(List<String> groupMemberNames) {
        if ( this.immutable ) {
            throw new RuntimeException("groupMemberNames assigned to an immutable object: " + this);
        }
        if ( this.groupMemberNames == null ) {
            this.groupMemberNames = new ArrayList<String>();
        }
        this.groupMemberNames.addAll(groupMemberNames);
        return this;
    }

    /**
     * ADD groupMemberNames. Object must be mutable.
     */
    public ChangeUserGroupRequest addGroupMemberNames(String groupMemberNames) {
        if ( this.immutable ) {
            throw new RuntimeException("groupMemberNames assigned to an immutable object: " + this);
        }
        if ( this.groupMemberNames == null ) {
            this.groupMemberNames = new ArrayList<String>();
        }
        this.groupMemberNames.add(groupMemberNames);
        return this;
    }

    /**
     * ADD ALL groupMemberNames. Object must be mutable.
     */
    public ChangeUserGroupRequest addAllGroupMemberNames(List<String> groupMemberNames) {
        if ( this.immutable ) {
            throw new RuntimeException("groupMemberNames assigned to an immutable object: " + this);
        }
        if ( this.groupMemberNames == null ) {
            this.groupMemberNames = new ArrayList<String>();
        }
        this.groupMemberNames.addAll(groupMemberNames);
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
            jsonO.put("groupName", this.groupName);
            {
                JSONArray array = new JSONArray();
                for ( String item : this.groupMemberNames ) {
                    array.put(item);
                }
                jsonO.put("groupMemberNames", array);
            }
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }

    @Override
    public String toString() {
        return "ChangeUserGroupRequest [immutable=" + this.immutable + ", cmd=" + this.cmd + ", groupName=" + this.groupName + ", groupMemberNames=" + this.groupMemberNames + " ]";
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
