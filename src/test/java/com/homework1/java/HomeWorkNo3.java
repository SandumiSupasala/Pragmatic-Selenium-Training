package com.homework1.java;

public class HomeWorkNo3 {

    public static void main(String[] args) {

        String addressLine1 = "No 4/83";
        String addressLine2 = "Richmond City";
        String addressLine3 = "Galle";

        String fullAddress = getFullAddress(addressLine1,addressLine2,addressLine3);

        System.out.println("FullAddress = " + fullAddress);

    }


    /**
     * Get the Full Address
     * @param addressLine1
     * @param addressLine2
     * @param addressLine3
     * @return
     */
    private static String getFullAddress(String addressLine1, String addressLine2, String addressLine3) {
        //String AddressFully = addressLine1.concat(",").concat(addressLine2).concat(",").concat(addressLine3).concat(".");
        String AddressFully = String.format("%s,%s,%s.",addressLine1,addressLine2,addressLine3);
        return AddressFully;
    }
}
