package com.example;

public enum VerificationTypesEnum {
  BANK_CHEQUE_CAPTURE("BANK CHEQUE CAPTURE"),
  PAN_CAPTURE("PAN CAPTURE")
  ;

  String value;
  VerificationTypesEnum(String value) { this.value = value; }
}