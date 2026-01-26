/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides.model;

import java.util.Objects;
import com.aspose.slides.model.MathElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Specifies an instance of mathematical text that contained within a MathParagraph and starts on its own line.
 */
@ApiModel(description = "Specifies an instance of mathematical text that contained within a MathParagraph and starts on its own line.")
public class PhantomElement extends MathElement {
  @SerializedName(value = "base", alternate = { "Base" })
  private MathElement base;

  @SerializedName(value = "show", alternate = { "Show" })
  private Boolean show;

  @SerializedName(value = "zeroWidth", alternate = { "ZeroWidth" })
  private Boolean zeroWidth;

  @SerializedName(value = "zeroAsc", alternate = { "ZeroAsc" })
  private Boolean zeroAsc;

  @SerializedName(value = "zeroDesc", alternate = { "ZeroDesc" })
  private Boolean zeroDesc;

  @SerializedName(value = "transp", alternate = { "Transp" })
  private Boolean transp;


  public PhantomElement() {
    super();
    setType(TypeEnum.PHANTOM);
  }

  public PhantomElement base(MathElement base) {
    this.base = base;
    return this;
  }

   /**
   * Base element
   * @return base
  **/
  @ApiModelProperty(value = "Base element")
  public MathElement getBase() {
    return base;
  }

  public void setBase(MathElement base) {
    this.base = base;
  }

  public PhantomElement show(Boolean show) {
    this.show = show;
    return this;
  }

   /**
   * true if the base element is displayed.
   * @return show
  **/
  @ApiModelProperty(value = "true if the base element is displayed.")
  public Boolean isShow() {
    return show;
  }

  public void setShow(Boolean show) {
    this.show = show;
  }

  public PhantomElement zeroWidth(Boolean zeroWidth) {
    this.zeroWidth = zeroWidth;
    return this;
  }

   /**
   * true if the the width of the base element should be treated as zero.
   * @return zeroWidth
  **/
  @ApiModelProperty(value = "true if the the width of the base element should be treated as zero.")
  public Boolean isZeroWidth() {
    return zeroWidth;
  }

  public void setZeroWidth(Boolean zeroWidth) {
    this.zeroWidth = zeroWidth;
  }

  public PhantomElement zeroAsc(Boolean zeroAsc) {
    this.zeroAsc = zeroAsc;
    return this;
  }

   /**
   * true if the the ascent (height above baseline) of the base element should be treated as zero.
   * @return zeroAsc
  **/
  @ApiModelProperty(value = "true if the the ascent (height above baseline) of the base element should be treated as zero.")
  public Boolean isZeroAsc() {
    return zeroAsc;
  }

  public void setZeroAsc(Boolean zeroAsc) {
    this.zeroAsc = zeroAsc;
  }

  public PhantomElement zeroDesc(Boolean zeroDesc) {
    this.zeroDesc = zeroDesc;
    return this;
  }

   /**
   * true if the the descent (depth below baseline) of the base element should be treated as zero.
   * @return zeroDesc
  **/
  @ApiModelProperty(value = "true if the the descent (depth below baseline) of the base element should be treated as zero.")
  public Boolean isZeroDesc() {
    return zeroDesc;
  }

  public void setZeroDesc(Boolean zeroDesc) {
    this.zeroDesc = zeroDesc;
  }

  public PhantomElement transp(Boolean transp) {
    this.transp = transp;
    return this;
  }

   /**
   * true if operators and symbols inside the phantom still affect mathematical spacing around the phantom (as if visible).
   * @return transp
  **/
  @ApiModelProperty(value = "true if operators and symbols inside the phantom still affect mathematical spacing around the phantom (as if visible).")
  public Boolean isTransp() {
    return transp;
  }

  public void setTransp(Boolean transp) {
    this.transp = transp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhantomElement phantomElement = (PhantomElement) o;
    return true && Objects.equals(this.base, phantomElement.base) && Objects.equals(this.show, phantomElement.show) && Objects.equals(this.zeroWidth, phantomElement.zeroWidth) && Objects.equals(this.zeroAsc, phantomElement.zeroAsc) && Objects.equals(this.zeroDesc, phantomElement.zeroDesc) && Objects.equals(this.transp, phantomElement.transp) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, show, zeroWidth, zeroAsc, zeroDesc, transp, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhantomElement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    zeroWidth: ").append(toIndentedString(zeroWidth)).append("\n");
    sb.append("    zeroAsc: ").append(toIndentedString(zeroAsc)).append("\n");
    sb.append("    zeroDesc: ").append(toIndentedString(zeroDesc)).append("\n");
    sb.append("    transp: ").append(toIndentedString(transp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }



  private static final Map<String, Object> typeDeterminers = new Hashtable<String, Object>();

  static {
      typeDeterminers.put("Type", TypeEnum.PHANTOM);
  }
}
