package uc;

import w7.s8;
public final class a {
    public static final String[] f43657o = {"34", "37"};
    public static final String[] f43658p = {"60", "62", "64", "65"};
    public static final String[] f43659q = {"35"};
    public static final String[] f43660r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43661s = {"4"};
    public static final String[] f43662t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43663a;
    public final String f43664b;
    public final Integer f43665c;
    public final Integer d;
    public final String e;
    public final String f43666f;
    public final String f43667g;
    public final String h;
    public final String f43668i;
    public final String f43669j;
    public final String f43670k;
    public String f43671l;
    public String f43672m;
    public final String f43673n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43663a = s8.e(replaceAll);
        this.f43665c = num;
        this.d = num2;
        this.f43664b = s8.e(str2);
        this.e = s8.e(str3);
        this.f43666f = s8.e(str4);
        this.f43667g = s8.e(str5);
        this.h = s8.e(str6);
        this.f43668i = s8.e(str7);
        this.f43669j = s8.e(str8);
        this.f43670k = s8.e(str9);
        this.f43672m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f43671l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f43673n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f43672m)) {
            String str2 = this.f43663a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f43657o)) {
                    str = "American Express";
                } else if (s8.c(str2, f43658p)) {
                    str = "Discover";
                } else if (s8.c(str2, f43659q)) {
                    str = "JCB";
                } else if (s8.c(str2, f43660r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f43661s)) {
                    str = "Visa";
                } else if (s8.c(str2, f43662t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f43672m = str;
            }
        }
        return this.f43672m;
    }

    public final String b() {
        if (!s8.d(this.f43671l)) {
            return this.f43671l;
        }
        String str = this.f43663a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f43671l = substring;
            return substring;
        }
        return null;
    }
}
