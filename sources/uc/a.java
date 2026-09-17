package uc;

import w7.s8;
public final class a {
    public static final String[] f46995o = {"34", "37"};
    public static final String[] f46996p = {"60", "62", "64", "65"};
    public static final String[] f46997q = {"35"};
    public static final String[] f46998r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f46999s = {"4"};
    public static final String[] f47000t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47001a;
    public final String f47002b;
    public final Integer f47003c;
    public final Integer d;
    public final String f47004e;
    public final String f47005f;
    public final String f47006g;
    public final String h;
    public final String f47007i;
    public final String f47008j;
    public final String f47009k;
    public String f47010l;
    public String f47011m;
    public final String f47012n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f47001a = s8.e(replaceAll);
        this.f47003c = num;
        this.d = num2;
        this.f47002b = s8.e(str2);
        this.f47004e = s8.e(str3);
        this.f47005f = s8.e(str4);
        this.f47006g = s8.e(str5);
        this.h = s8.e(str6);
        this.f47007i = s8.e(str7);
        this.f47008j = s8.e(str8);
        this.f47009k = s8.e(str9);
        this.f47011m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f47010l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f47012n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f47011m)) {
            String str2 = this.f47001a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f46995o)) {
                    str = "American Express";
                } else if (s8.c(str2, f46996p)) {
                    str = "Discover";
                } else if (s8.c(str2, f46997q)) {
                    str = "JCB";
                } else if (s8.c(str2, f46998r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f46999s)) {
                    str = "Visa";
                } else if (s8.c(str2, f47000t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47011m = str;
            }
        }
        return this.f47011m;
    }

    public final String b() {
        if (!s8.d(this.f47010l)) {
            return this.f47010l;
        }
        String str = this.f47001a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47010l = substring;
            return substring;
        }
        return null;
    }
}
