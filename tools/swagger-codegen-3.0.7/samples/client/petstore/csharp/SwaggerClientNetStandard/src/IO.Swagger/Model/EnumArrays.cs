/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// EnumArrays
    /// </summary>
    [DataContract]
        public partial class EnumArrays :  IEquatable<EnumArrays>
    {
        /// <summary>
        /// Defines JustSymbol
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
                public enum JustSymbolEnum
        {
            /// <summary>
            /// Enum _ for value: ">="
            /// </summary>
            [EnumMember(Value = "">="")]
            _ = 0,
            /// <summary>
            /// Enum _ for value: "$"
            /// </summary>
            [EnumMember(Value = ""$"")]
            _ = 1        }
        /// <summary>
        /// Gets or Sets JustSymbol
        /// </summary>
        [DataMember(Name="just_symbol", EmitDefaultValue=false)]
        public JustSymbolEnum? JustSymbol { get; set; }
        /// <summary>
        /// Defines ArrayEnum
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
                public enum ArrayEnumEnum
        {
            /// <summary>
            /// Enum FISH for value: "fish"
            /// </summary>
            [EnumMember(Value = ""fish"")]
            FISH = 0,
            /// <summary>
            /// Enum CRAB for value: "crab"
            /// </summary>
            [EnumMember(Value = ""crab"")]
            CRAB = 1        }
        /// <summary>
        /// Gets or Sets ArrayEnum
        /// </summary>
        [DataMember(Name="array_enum", EmitDefaultValue=false)]
        public List<ArrayEnumEnum> ArrayEnum { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EnumArrays" /> class.
        /// </summary>
        /// <param name="">.</param>
        /// <param name="">.</param>
        public EnumArrays(JustSymbolEnum?  = default(JustSymbolEnum?), List<ArrayEnumEnum>  = default(List<ArrayEnumEnum>))
        {
            this.JustSymbol = ;
            this.ArrayEnum = ;
        }
        


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnumArrays {\n");
            sb.Append("  JustSymbol: ").Append(JustSymbol).Append("\n");
            sb.Append("  ArrayEnum: ").Append(ArrayEnum).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as EnumArrays);
        }

        /// <summary>
        /// Returns true if EnumArrays instances are equal
        /// </summary>
        /// <param name="input">Instance of EnumArrays to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnumArrays input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.JustSymbol == input.JustSymbol ||
                    (this.JustSymbol != null &&
                    this.JustSymbol.Equals(input.JustSymbol))
                ) && 
                (
                    this.ArrayEnum == input.ArrayEnum ||
                    this.ArrayEnum != null &&
                    this.ArrayEnum.SequenceEqual(input.ArrayEnum)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.JustSymbol != null)
                    hashCode = hashCode * 59 + this.JustSymbol.GetHashCode();
                if (this.ArrayEnum != null)
                    hashCode = hashCode * 59 + this.ArrayEnum.GetHashCode();
                return hashCode;
            }
        }
    }
}
