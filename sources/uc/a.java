package uc;

import w7.u8;
public final class a {
    public static final String[] f43963o = {"34", "37"};
    public static final String[] f43964p = {"60", "62", "64", "65"};
    public static final String[] f43965q = {"35"};
    public static final String[] f43966r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43967s = {"4"};
    public static final String[] f43968t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43969a;
    public final String f43970b;
    public final Integer f43971c;
    public final Integer d;
    public final String e;
    public final String f43972f;
    public final String f43973g;
    public final String h;
    public final String f43974i;
    public final String f43975j;
    public final String f43976k;
    public String f43977l;
    public String f43978m;
    public final String f43979n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43969a = u8.e(replaceAll);
        this.f43971c = num;
        this.d = num2;
        this.f43970b = u8.e(str2);
        this.e = u8.e(str3);
        this.f43972f = u8.e(str4);
        this.f43973g = u8.e(str5);
        this.h = u8.e(str6);
        this.f43974i = u8.e(str7);
        this.f43975j = u8.e(str8);
        this.f43976k = u8.e(str9);
        this.f43978m = u8.a(str10) == null ? a() : str10;
        if (u8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f43977l = str16;
        u8.e(str12);
        u8.b(str13);
        u8.e(str14);
        this.f43979n = u8.e(str15);
    }

    public final String a() {
        String str;
        if (u8.d(this.f43978m)) {
            String str2 = this.f43969a;
            if (!u8.d(str2)) {
                if (u8.c(str2, f43963o)) {
                    str = "American Express";
                } else if (u8.c(str2, f43964p)) {
                    str = "Discover";
                } else if (u8.c(str2, f43965q)) {
                    str = "JCB";
                } else if (u8.c(str2, f43966r)) {
                    str = "Diners Club";
                } else if (u8.c(str2, f43967s)) {
                    str = "Visa";
                } else if (u8.c(str2, f43968t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f43978m = str;
            }
        }
        return this.f43978m;
    }

    public final String b() {
        if (!u8.d(this.f43977l)) {
            return this.f43977l;
        }
        String str = this.f43969a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f43977l = substring;
            return substring;
        }
        return null;
    }
}
