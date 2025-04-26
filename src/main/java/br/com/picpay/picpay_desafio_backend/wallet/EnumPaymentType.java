package br.com.picpay.picpay_desafio_backend.wallet;

public enum EnumPaymentType {
    PIX("PIX"),
    BOLETO("BOLETO"),
    TRANSFER("TRANSFER"),
    DEPOSIT("DEPOSIT");

    private final String type;

    EnumPaymentType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return type;
    }
}
