package vc;

import w7.z8;
public final class a {
    public static final String[] f49640o = {"34", "37"};
    public static final String[] f49641p = {"60", "62", "64", "65"};
    public static final String[] f49642q = {"35"};
    public static final String[] f49643r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f49644s = {"4"};
    public static final String[] f49645t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f49646a;
    public final String f49647b;
    public final Integer f49648c;
    public final Integer d;
    public final String f49649e;
    public final String f49650f;
    public final String f49651g;
    public final String h;
    public final String f49652i;
    public final String f49653j;
    public final String f49654k;
    public String f49655l;
    public String f49656m;
    public final String f49657n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f49646a = z8.e(replaceAll);
        this.f49648c = num;
        this.d = num2;
        this.f49647b = z8.e(str2);
        this.f49649e = z8.e(str3);
        this.f49650f = z8.e(str4);
        this.f49651g = z8.e(str5);
        this.h = z8.e(str6);
        this.f49652i = z8.e(str7);
        this.f49653j = z8.e(str8);
        this.f49654k = z8.e(str9);
        this.f49656m = z8.a(str10) == null ? a() : str10;
        if (z8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f49655l = str16;
        z8.e(str12);
        z8.b(str13);
        z8.e(str14);
        this.f49657n = z8.e(str15);
    }

    public final String a() {
        String str;
        if (z8.d(this.f49656m)) {
            String str2 = this.f49646a;
            if (!z8.d(str2)) {
                if (z8.c(str2, f49640o)) {
                    str = "American Express";
                } else if (z8.c(str2, f49641p)) {
                    str = "Discover";
                } else if (z8.c(str2, f49642q)) {
                    str = "JCB";
                } else if (z8.c(str2, f49643r)) {
                    str = "Diners Club";
                } else if (z8.c(str2, f49644s)) {
                    str = "Visa";
                } else if (z8.c(str2, f49645t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f49656m = str;
            }
        }
        return this.f49656m;
    }

    public final String b() {
        if (!z8.d(this.f49655l)) {
            return this.f49655l;
        }
        String str = this.f49646a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f49655l = substring;
            return substring;
        }
        return null;
    }
}
