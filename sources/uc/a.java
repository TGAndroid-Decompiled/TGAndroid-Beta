package uc;

import w7.u8;
public final class a {
    public static final String[] f47585o = {"34", "37"};
    public static final String[] f47586p = {"60", "62", "64", "65"};
    public static final String[] f47587q = {"35"};
    public static final String[] f47588r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f47589s = {"4"};
    public static final String[] f47590t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47591a;
    public final String f47592b;
    public final Integer f47593c;
    public final Integer d;
    public final String f47594e;
    public final String f47595f;
    public final String f47596g;
    public final String h;
    public final String f47597i;
    public final String f47598j;
    public final String f47599k;
    public String f47600l;
    public String f47601m;
    public final String f47602n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f47591a = u8.e(replaceAll);
        this.f47593c = num;
        this.d = num2;
        this.f47592b = u8.e(str2);
        this.f47594e = u8.e(str3);
        this.f47595f = u8.e(str4);
        this.f47596g = u8.e(str5);
        this.h = u8.e(str6);
        this.f47597i = u8.e(str7);
        this.f47598j = u8.e(str8);
        this.f47599k = u8.e(str9);
        this.f47601m = u8.a(str10) == null ? a() : str10;
        if (u8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f47600l = str16;
        u8.e(str12);
        u8.b(str13);
        u8.e(str14);
        this.f47602n = u8.e(str15);
    }

    public final String a() {
        String str;
        if (u8.d(this.f47601m)) {
            String str2 = this.f47591a;
            if (!u8.d(str2)) {
                if (u8.c(str2, f47585o)) {
                    str = "American Express";
                } else if (u8.c(str2, f47586p)) {
                    str = "Discover";
                } else if (u8.c(str2, f47587q)) {
                    str = "JCB";
                } else if (u8.c(str2, f47588r)) {
                    str = "Diners Club";
                } else if (u8.c(str2, f47589s)) {
                    str = "Visa";
                } else if (u8.c(str2, f47590t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47601m = str;
            }
        }
        return this.f47601m;
    }

    public final String b() {
        if (!u8.d(this.f47600l)) {
            return this.f47600l;
        }
        String str = this.f47591a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47600l = substring;
            return substring;
        }
        return null;
    }
}
