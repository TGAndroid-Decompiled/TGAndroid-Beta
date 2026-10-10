package vc;

import w7.z8;
public final class a {
    public static final String[] f49563o = {"34", "37"};
    public static final String[] f49564p = {"60", "62", "64", "65"};
    public static final String[] f49565q = {"35"};
    public static final String[] f49566r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f49567s = {"4"};
    public static final String[] f49568t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f49569a;
    public final String f49570b;
    public final Integer f49571c;
    public final Integer d;
    public final String f49572e;
    public final String f49573f;
    public final String f49574g;
    public final String h;
    public final String f49575i;
    public final String f49576j;
    public final String f49577k;
    public String f49578l;
    public String f49579m;
    public final String f49580n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f49569a = z8.e(replaceAll);
        this.f49571c = num;
        this.d = num2;
        this.f49570b = z8.e(str2);
        this.f49572e = z8.e(str3);
        this.f49573f = z8.e(str4);
        this.f49574g = z8.e(str5);
        this.h = z8.e(str6);
        this.f49575i = z8.e(str7);
        this.f49576j = z8.e(str8);
        this.f49577k = z8.e(str9);
        this.f49579m = z8.a(str10) == null ? a() : str10;
        if (z8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f49578l = str16;
        z8.e(str12);
        z8.b(str13);
        z8.e(str14);
        this.f49580n = z8.e(str15);
    }

    public final String a() {
        String str;
        if (z8.d(this.f49579m)) {
            String str2 = this.f49569a;
            if (!z8.d(str2)) {
                if (z8.c(str2, f49563o)) {
                    str = "American Express";
                } else if (z8.c(str2, f49564p)) {
                    str = "Discover";
                } else if (z8.c(str2, f49565q)) {
                    str = "JCB";
                } else if (z8.c(str2, f49566r)) {
                    str = "Diners Club";
                } else if (z8.c(str2, f49567s)) {
                    str = "Visa";
                } else if (z8.c(str2, f49568t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f49579m = str;
            }
        }
        return this.f49579m;
    }

    public final String b() {
        if (!z8.d(this.f49578l)) {
            return this.f49578l;
        }
        String str = this.f49569a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f49578l = substring;
            return substring;
        }
        return null;
    }
}
