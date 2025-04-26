package br.com.picpay.picpay_desafio_backend.wallet;

public enum EnumPaymentStatus {
    PENDING("PENDING"),
    COMPLETED("COMPLETED"),
    CANCELED("CANCELED"),
    ERROR("ERROR");

    private final String status;

    EnumPaymentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}