/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.tone_analyzer.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * ToneScore.
 */
public class ToneScore extends GenericModel {

  /**
   * The score for the tone in the range of 0 to 1. A score less than 0.5 indicates that the tone is unlikely to be
   * perceived in the content; a score greater than 0.75 indicates a high likelihood that the tone is perceived.
   */
  private Double score;
  /**
   * The unique, non-localized identifier of the tone for the results. The service can return results for the following
   * tone IDs of the different categories: * For the `emotion` category: `anger`, `disgust`, `fear`, `joy`, and
   * `sadness` * For the `language` category: `analytical`, `confident`, and `tentative` * For the `social` category:
   * `openness_big5`, `conscientiousness_big5`, `extraversion_big5`, `agreeableness_big5`, and `emotional_range_big5`
   * The service returns scores for all tones of a category, regardless of their values.
   */
  @SerializedName("tone_id")
  private String toneId;
  /** The user-visible, localized name of the tone. */
  @SerializedName("tone_name")
  private String toneName;

  /**
   * Gets the score.
   *
   * @return the score
   */
  public Double getScore() {
    return score;
  }

  /**
   * Gets the toneId.
   *
   * @return the toneId
   */
  public String getToneId() {
    return toneId;
  }

  /**
   * Gets the toneName.
   *
   * @return the toneName
   */
  public String getToneName() {
    return toneName;
  }

  /**
   * Sets the score.
   *
   * @param score the new score
   */
  public void setScore(final Double score) {
    this.score = score;
  }

  /**
   * Sets the toneId.
   *
   * @param toneId the new toneId
   */
  public void setToneId(final String toneId) {
    this.toneId = toneId;
  }

  /**
   * Sets the toneName.
   *
   * @param toneName the new toneName
   */
  public void setToneName(final String toneName) {
    this.toneName = toneName;
  }
}
