package uc;

import c8.ud;
public final class a {
    public static final String[] f58577o = {"34", "37"};
    public static final String[] f58578p = {"60", "62", "64", "65"};
    public static final String[] f58579q = {"35"};
    public static final String[] f58580r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f58581s = {"4"};
    public static final String[] f58582t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f58583a;
    public final String f58584b;
    public final Integer f58585c;
    public final Integer d;
    public final String f58586e;
    public final String f58587f;
    public final String f58588g;
    public final String h;
    public final String f58589i;
    public final String f58590j;
    public final String f58591k;
    public String f58592l;
    public String f58593m;
    public final String f58594n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f58583a = ud.e(replaceAll);
        this.f58585c = num;
        this.d = num2;
        this.f58584b = ud.e(str2);
        this.f58586e = ud.e(str3);
        this.f58587f = ud.e(str4);
        this.f58588g = ud.e(str5);
        this.h = ud.e(str6);
        this.f58589i = ud.e(str7);
        this.f58590j = ud.e(str8);
        this.f58591k = ud.e(str9);
        this.f58593m = ud.a(str10) == null ? a() : str10;
        if (ud.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f58592l = str16;
        ud.e(str12);
        ud.b(str13);
        ud.e(str14);
        this.f58594n = ud.e(str15);
    }

    public final String a() {
        String str;
        if (ud.d(this.f58593m)) {
            String str2 = this.f58583a;
            if (!ud.d(str2)) {
                if (ud.c(str2, f58577o)) {
                    str = "American Express";
                } else if (ud.c(str2, f58578p)) {
                    str = "Discover";
                } else if (ud.c(str2, f58579q)) {
                    str = "JCB";
                } else if (ud.c(str2, f58580r)) {
                    str = "Diners Club";
                } else if (ud.c(str2, f58581s)) {
                    str = "Visa";
                } else if (ud.c(str2, f58582t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f58593m = str;
            }
        }
        return this.f58593m;
    }

    public final String b() {
        if (!ud.d(this.f58592l)) {
            return this.f58592l;
        }
        String str = this.f58583a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f58592l = substring;
            return substring;
        }
        return null;
    }
}
