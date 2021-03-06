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
package com.ibm.watson.developer_cloud.discovery.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * A notice produced by the ingestion process.
 */
public class Notice extends GenericModel {

  /**
   * Severity level of the notice.
   */
  public interface Severity {
    /** warning. */
    String WARNING = "warning";
    /** error. */
    String ERROR = "error";
  }

  /**
   * Identifies the notice. Many notices may have the same ID. This field exists so that user applications can
   * programmatically identify a notice and take automatic corrective action.
   */
  @SerializedName("notice_id")
  private String noticeId;
  /** The creation date of the collection in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  private Date created;
  /** Unique identifier of the ingested document. */
  @SerializedName("document_id")
  private String documentId;
  /** Severity level of the notice. */
  private String severity;
  /** Ingestion step in which the notice occurred. */
  private String step;
  /** The description of the notice. */
  private String description;

  /**
   * Gets the noticeId.
   *
   * @return the noticeId
   */
  public String getNoticeId() {
    return noticeId;
  }

  /**
   * Gets the created.
   *
   * @return the created
   */
  public Date getCreated() {
    return created;
  }

  /**
   * Gets the documentId.
   *
   * @return the documentId
   */
  public String getDocumentId() {
    return documentId;
  }

  /**
   * Gets the severity.
   *
   * @return the severity
   */
  public String getSeverity() {
    return severity;
  }

  /**
   * Gets the step.
   *
   * @return the step
   */
  public String getStep() {
    return step;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }
}
