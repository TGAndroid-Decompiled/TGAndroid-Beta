package uc;

import w7.u8;
public final class a {
    public static final String[] f47584o = {"34", "37"};
    public static final String[] f47585p = {"60", "62", "64", "65"};
    public static final String[] f47586q = {"35"};
    public static final String[] f47587r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f47588s = {"4"};
    public static final String[] f47589t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47590a;
    public final String f47591b;
    public final Integer f47592c;
    public final Integer d;
    public final String f47593e;
    public final String f47594f;
    public final String f47595g;
    public final String h;
    public final String f47596i;
    public final String f47597j;
    public final String f47598k;
    public String f47599l;
    public String f47600m;
    public final String f47601n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f47590a = u8.e(replaceAll);
        this.f47592c = num;
        this.d = num2;
        this.f47591b = u8.e(str2);
        this.f47593e = u8.e(str3);
        this.f47594f = u8.e(str4);
        this.f47595g = u8.e(str5);
        this.h = u8.e(str6);
        this.f47596i = u8.e(str7);
        this.f47597j = u8.e(str8);
        this.f47598k = u8.e(str9);
        this.f47600m = u8.a(str10) == null ? a() : str10;
        if (u8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f47599l = str16;
        u8.e(str12);
        u8.b(str13);
        u8.e(str14);
        this.f47601n = u8.e(str15);
    }

    public final String a() {
        String str;
        if (u8.d(this.f47600m)) {
            String str2 = this.f47590a;
            if (!u8.d(str2)) {
                if (u8.c(str2, f47584o)) {
                    str = "American Express";
                } else if (u8.c(str2, f47585p)) {
                    str = "Discover";
                } else if (u8.c(str2, f47586q)) {
                    str = "JCB";
                } else if (u8.c(str2, f47587r)) {
                    str = "Diners Club";
                } else if (u8.c(str2, f47588s)) {
                    str = "Visa";
                } else if (u8.c(str2, f47589t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47600m = str;
            }
        }
        return this.f47600m;
    }

    public final String b() {
        if (!u8.d(this.f47599l)) {
            return this.f47599l;
        }
        String str = this.f47590a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47599l = substring;
            return substring;
        }
        return null;
    }
}
