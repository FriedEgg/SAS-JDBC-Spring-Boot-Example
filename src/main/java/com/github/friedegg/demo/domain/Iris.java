package com.github.friedegg.demo.domain;


import java.io.Serializable;

public class Iris implements Serializable {

  private static final long serialVersionUID = 1L;

  private String species;
  private Double sepalLength;
  private Double sepalWidth;
  private Double petalLength;
  private Double petalWidth;

  public Iris(String species, Double sepalLength, Double sepalWidth, Double petalLength, Double petalWidth) {
    this.species = species;
    this.sepalLength = sepalLength;
    this.sepalWidth = sepalWidth;
    this.petalLength = petalLength;
    this.petalWidth = petalWidth;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public Double getSepalLength() {
    return sepalLength;
  }

  public void setSepalLength(Double sepalLength) {
    this.sepalLength = sepalLength;
  }

  public Double getSepalWidth() {
    return sepalWidth;
  }

  public void setSepalWidth(Double sepalWidth) {
    this.sepalWidth = sepalWidth;
  }

  public Double getPetalLength() {
    return petalLength;
  }

  public void setPetalLength(Double petalLength) {
    this.petalLength = petalLength;
  }

  public Double getPetalWidth() {
    return petalWidth;
  }

  public void setPetalWidth(Double petalWidth) {
    this.petalWidth = petalWidth;
  }

  @Override
  public String toString() {
    return getSpecies() + "," + getSepalLength() + "," + getSepalWidth() + "," + getPetalLength() + "," + getPetalWidth();
  }
}
