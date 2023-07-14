package com.astra.polytechnic.helper;

import com.astra.polytechnic.model.Booking;
import com.astra.polytechnic.model.Koleksi;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DLAHelper {
    public static String getString(String text){
        return text != null ? text : "";
    }

    public static List<Koleksi> getNewestBook(List<Koleksi> koleksis){
        return koleksis == null ? Collections.emptyList() : koleksis.stream().limit(10).collect(Collectors.toList());
    }
    public static List<Koleksi> getPopularBooks(List<Koleksi> koleksis){
        return koleksis == null ? Collections.emptyList() : koleksis.stream().limit(10).collect(Collectors.toList());
    }
    public static List<Booking> getUnconBookList(List<Booking> bookingList){
        return bookingList == null ? Collections.emptyList() : bookingList.stream().collect(Collectors.toList());
    }
}