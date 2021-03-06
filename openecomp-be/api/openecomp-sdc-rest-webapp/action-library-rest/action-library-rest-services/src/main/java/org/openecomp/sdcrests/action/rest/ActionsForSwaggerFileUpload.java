/*-
 * ============LICENSE_START=======================================================
 * SDC
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.openecomp.sdcrests.action.rest;

import com.sun.jersey.multipart.FormDataParam;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.springframework.validation.annotation.Validated;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;


@Path("/workflow/v1.0/actions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@OpenAPIDefinition(info =  @Info(title = "Actions"))
@Validated
public interface ActionsForSwaggerFileUpload {

  /**
   * Upload an artifact to an action.
   *
   * @param actionInvariantUuId Invariant UuId of the action to which the artifact is uploaded
   * @param artifactName        Name of the artifact
   * @param artifactLabel       Label of the artifact
   * @param artifactCategory    Category of the artifact
   * @param artifactDescription Description  of the artifact
   * @param artifactProtection  Artifact protection mode
   * @param checksum            Checksum of the artifact
   * @param artifactToUpload    Artifact content object
   * @param servletRequest      Servlet request object
   * @return Generated UuId of the uploaded artifact
   */
  @POST
  @Path("/{actionInvariantUuId}/artifacts")
  @Operation(description = "Upload new Artifact")
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  Response uploadArtifact(@PathParam("actionInvariantUuId") String actionInvariantUuId,
                          @Multipart(value = "artifactName", required = false) String artifactName,
                          @Multipart(value = "artifactLabel", required = false)
                              String artifactLabel,
                          @Multipart(value = "artifactCategory", required = false)
                              String artifactCategory,
                          @Multipart(value = "artifactDescription", required = false)
                              String artifactDescription,
                          @Multipart(value = "artifactProtection", required = false)
                              String artifactProtection,
                          @HeaderParam("Content-MD5") String checksum,
                          @FormDataParam(value = "uploadArtifact") InputStream artifactToUpload,
                          @Context HttpServletRequest servletRequest);


  @PUT
  @Path("/{actionInvariantUuId}/artifacts/{artifactUuId}")
  @Operation(description = "Update an existing artifact")
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  Response updateArtifact(@PathParam("actionInvariantUuId") String actionInvariantUuId,
                          @PathParam("artifactUuId") String artifactUuId,
                          @Multipart(value = "artifactName", required = false) String artifactName,
                          @Multipart(value = "artifactLabel", required = false)
                              String artifactLabel,
                          @Multipart(value = "artifactCategory", required = false)
                              String artifactCategory,
                          @Multipart(value = "artifactDescription", required = false)
                              String artifactDescription,
                          @Multipart(value = "artifactProtection", required = false)
                              String artifactProtection,
                          @HeaderParam("Content-MD5") String checksum,
                          @FormDataParam(value = "updateArtifact") InputStream artifactToUpdate,
                          @Context HttpServletRequest servletRequest);

}
