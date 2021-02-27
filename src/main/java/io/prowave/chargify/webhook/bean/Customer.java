/*
 * Copyright 2016 Prowave Consulting, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package io.prowave.chargify.webhook.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	private Long id;
	private String organization;
	private String reference;
	private String phone;
	private String email;
	private String address;

	@JsonProperty("address_2")
	private String address2;

	private String city;
	private String state;
	private String zip;
	private String country;
	private Boolean verified;

	@JsonProperty("cc_emails")
	private String ccEmails;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("updated_at")
	private Date updatedAt;

	@JsonProperty("portal_invite_last_accepted_at")
	private Date portalInviteLastAcceptedAt;

	@JsonProperty("portal_customer_created_at")
	private Date portalCustomerCreatedAt;

	@JsonProperty("portal_invite_last_sent_at")
	private Date portalInviteLastSentAt;

	@JsonProperty("vat_number")
	private String vatNumber;

	@JsonProperty("tax_exempt")
	private Boolean taxExempt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public String getCcEmails() {
		return ccEmails;
	}

	public void setCcEmails(String ccEmails) {
		this.ccEmails = ccEmails;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getPortalInviteLastAcceptedAt() {
		return portalInviteLastAcceptedAt;
	}

	public void setPortalInviteLastAcceptedAt(Date portalInviteLastAcceptedAt) {
		this.portalInviteLastAcceptedAt = portalInviteLastAcceptedAt;
	}

	public Date getPortalCustomerCreatedAt() {
		return portalCustomerCreatedAt;
	}

	public void setPortalCustomerCreatedAt(Date portalCustomerCreatedAt) {
		this.portalCustomerCreatedAt = portalCustomerCreatedAt;
	}

	public Date getPortalInviteLastSentAt() {
		return portalInviteLastSentAt;
	}

	public void setPortalInviteLastSentAt(Date portalInviteLastSentAt) {
		this.portalInviteLastSentAt = portalInviteLastSentAt;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public Boolean getTaxExempt() {
		return taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

}
