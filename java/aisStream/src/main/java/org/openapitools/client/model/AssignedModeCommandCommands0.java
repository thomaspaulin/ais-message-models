/*
 * Ais-Stream WebsocketObjects
 * OpenAPI 3.0 definitions for the data models used by aisstream.io.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * AssignedModeCommandCommands0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-27T20:57:25.293422-07:00[America/Vancouver]")
public class AssignedModeCommandCommands0 {
  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_DESTINATION_I_D = "DestinationID";
  @SerializedName(SERIALIZED_NAME_DESTINATION_I_D)
  private Integer destinationID;

  public static final String SERIALIZED_NAME_OFFSET = "Offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_INCREMENT = "Increment";
  @SerializedName(SERIALIZED_NAME_INCREMENT)
  private Integer increment;

  public AssignedModeCommandCommands0() { 
  }

  public AssignedModeCommandCommands0 valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public AssignedModeCommandCommands0 destinationID(Integer destinationID) {
    
    this.destinationID = destinationID;
    return this;
  }

   /**
   * Get destinationID
   * @return destinationID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDestinationID() {
    return destinationID;
  }


  public void setDestinationID(Integer destinationID) {
    this.destinationID = destinationID;
  }


  public AssignedModeCommandCommands0 offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public AssignedModeCommandCommands0 increment(Integer increment) {
    
    this.increment = increment;
    return this;
  }

   /**
   * Get increment
   * @return increment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getIncrement() {
    return increment;
  }


  public void setIncrement(Integer increment) {
    this.increment = increment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedModeCommandCommands0 assignedModeCommandCommands0 = (AssignedModeCommandCommands0) o;
    return Objects.equals(this.valid, assignedModeCommandCommands0.valid) &&
        Objects.equals(this.destinationID, assignedModeCommandCommands0.destinationID) &&
        Objects.equals(this.offset, assignedModeCommandCommands0.offset) &&
        Objects.equals(this.increment, assignedModeCommandCommands0.increment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, destinationID, offset, increment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedModeCommandCommands0 {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    destinationID: ").append(toIndentedString(destinationID)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    increment: ").append(toIndentedString(increment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Valid");
    openapiFields.add("DestinationID");
    openapiFields.add("Offset");
    openapiFields.add("Increment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Valid");
    openapiRequiredFields.add("DestinationID");
    openapiRequiredFields.add("Offset");
    openapiRequiredFields.add("Increment");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssignedModeCommandCommands0
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssignedModeCommandCommands0.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssignedModeCommandCommands0 is not found in the empty JSON string", AssignedModeCommandCommands0.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssignedModeCommandCommands0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssignedModeCommandCommands0` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssignedModeCommandCommands0.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssignedModeCommandCommands0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssignedModeCommandCommands0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssignedModeCommandCommands0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssignedModeCommandCommands0.class));

       return (TypeAdapter<T>) new TypeAdapter<AssignedModeCommandCommands0>() {
           @Override
           public void write(JsonWriter out, AssignedModeCommandCommands0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssignedModeCommandCommands0 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssignedModeCommandCommands0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssignedModeCommandCommands0
  * @throws IOException if the JSON string is invalid with respect to AssignedModeCommandCommands0
  */
  public static AssignedModeCommandCommands0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssignedModeCommandCommands0.class);
  }

 /**
  * Convert an instance of AssignedModeCommandCommands0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

