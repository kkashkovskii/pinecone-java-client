/*
 * Pinecone Control Plane API
 * Pinecone is a vector database that makes it easy to search and retrieve billions of high-dimensional vectors.
 *
 * The version of the OpenAPI document: 2024-07
 * Contact: support@pinecone.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.control.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.control.client.model.PodSpecMetadataConfig;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.control.client.JSON;

/**
 * Configuration needed to deploy a pod-based index.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-18T20:37:01.807093Z[Etc/UTC]")
public class PodSpec {
  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas = 1;

  public static final String SERIALIZED_NAME_SHARDS = "shards";
  @SerializedName(SERIALIZED_NAME_SHARDS)
  private Integer shards = 1;

  public static final String SERIALIZED_NAME_POD_TYPE = "pod_type";
  @SerializedName(SERIALIZED_NAME_POD_TYPE)
  private String podType = "p1.x1";

  public static final String SERIALIZED_NAME_PODS = "pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  private Integer pods = 1;

  public static final String SERIALIZED_NAME_METADATA_CONFIG = "metadata_config";
  @SerializedName(SERIALIZED_NAME_METADATA_CONFIG)
  private PodSpecMetadataConfig metadataConfig;

  public static final String SERIALIZED_NAME_SOURCE_COLLECTION = "source_collection";
  @SerializedName(SERIALIZED_NAME_SOURCE_COLLECTION)
  private String sourceCollection;

  public PodSpec() {
  }

  public PodSpec environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * The environment where the index is hosted.
   * @return environment
  **/
  @javax.annotation.Nonnull
  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public PodSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * The number of replicas. Replicas duplicate your index. They provide higher availability and throughput. Replicas can be scaled up or down as your needs change.
   * minimum: 1
   * @return replicas
  **/
  @javax.annotation.Nonnull
  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public PodSpec shards(Integer shards) {
    
    this.shards = shards;
    return this;
  }

   /**
   * The number of shards. Shards split your data across multiple pods so you can fit more data into an index.
   * minimum: 1
   * @return shards
  **/
  @javax.annotation.Nonnull
  public Integer getShards() {
    return shards;
  }


  public void setShards(Integer shards) {
    this.shards = shards;
  }


  public PodSpec podType(String podType) {
    
    this.podType = podType;
    return this;
  }

   /**
   * The type of pod to use. One of &#x60;s1&#x60;, &#x60;p1&#x60;, or &#x60;p2&#x60; appended with &#x60;.&#x60; and one of &#x60;x1&#x60;, &#x60;x2&#x60;, &#x60;x4&#x60;, or &#x60;x8&#x60;.
   * @return podType
  **/
  @javax.annotation.Nonnull
  public String getPodType() {
    return podType;
  }


  public void setPodType(String podType) {
    this.podType = podType;
  }


  public PodSpec pods(Integer pods) {
    
    this.pods = pods;
    return this;
  }

   /**
   * The number of pods to be used in the index. This should be equal to &#x60;shards&#x60; x &#x60;replicas&#x60;.&#39;
   * minimum: 1
   * @return pods
  **/
  @javax.annotation.Nonnull
  public Integer getPods() {
    return pods;
  }


  public void setPods(Integer pods) {
    this.pods = pods;
  }


  public PodSpec metadataConfig(PodSpecMetadataConfig metadataConfig) {
    
    this.metadataConfig = metadataConfig;
    return this;
  }

   /**
   * Get metadataConfig
   * @return metadataConfig
  **/
  @javax.annotation.Nullable
  public PodSpecMetadataConfig getMetadataConfig() {
    return metadataConfig;
  }


  public void setMetadataConfig(PodSpecMetadataConfig metadataConfig) {
    this.metadataConfig = metadataConfig;
  }


  public PodSpec sourceCollection(String sourceCollection) {
    
    this.sourceCollection = sourceCollection;
    return this;
  }

   /**
   * The name of the collection to be used as the source for the index.
   * @return sourceCollection
  **/
  @javax.annotation.Nullable
  public String getSourceCollection() {
    return sourceCollection;
  }


  public void setSourceCollection(String sourceCollection) {
    this.sourceCollection = sourceCollection;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PodSpec instance itself
   */
  public PodSpec putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodSpec podSpec = (PodSpec) o;
    return Objects.equals(this.environment, podSpec.environment) &&
        Objects.equals(this.replicas, podSpec.replicas) &&
        Objects.equals(this.shards, podSpec.shards) &&
        Objects.equals(this.podType, podSpec.podType) &&
        Objects.equals(this.pods, podSpec.pods) &&
        Objects.equals(this.metadataConfig, podSpec.metadataConfig) &&
        Objects.equals(this.sourceCollection, podSpec.sourceCollection)&&
        Objects.equals(this.additionalProperties, podSpec.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, replicas, shards, podType, pods, metadataConfig, sourceCollection, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodSpec {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
    sb.append("    podType: ").append(toIndentedString(podType)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    metadataConfig: ").append(toIndentedString(metadataConfig)).append("\n");
    sb.append("    sourceCollection: ").append(toIndentedString(sourceCollection)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("environment");
    openapiFields.add("replicas");
    openapiFields.add("shards");
    openapiFields.add("pod_type");
    openapiFields.add("pods");
    openapiFields.add("metadata_config");
    openapiFields.add("source_collection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("environment");
    openapiRequiredFields.add("replicas");
    openapiRequiredFields.add("shards");
    openapiRequiredFields.add("pod_type");
    openapiRequiredFields.add("pods");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PodSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PodSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodSpec is not found in the empty JSON string", PodSpec.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PodSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if (!jsonObj.get("pod_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pod_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pod_type").toString()));
      }
      // validate the optional field `metadata_config`
      if (jsonObj.get("metadata_config") != null && !jsonObj.get("metadata_config").isJsonNull()) {
        PodSpecMetadataConfig.validateJsonElement(jsonObj.get("metadata_config"));
      }
      if ((jsonObj.get("source_collection") != null && !jsonObj.get("source_collection").isJsonNull()) && !jsonObj.get("source_collection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_collection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_collection").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<PodSpec>() {
           @Override
           public void write(JsonWriter out, PodSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PodSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PodSpec instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PodSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PodSpec
  * @throws IOException if the JSON string is invalid with respect to PodSpec
  */
  public static PodSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodSpec.class);
  }

 /**
  * Convert an instance of PodSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

