package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;
public final class x41 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f53609a;
    public String f53610b;
    public String f53611c;
    public boolean d;
    public String f53612e;
    public String f53613f;
    public String f53614g;
    public boolean h;
    public String f53615i;
    public String f53616j;
    public String f53617k;
    public boolean f53618l;
    public String f53619m;
    public String f53620n;
    public String f53621o;
    public String f53622p;
    public String f53623q;
    public boolean f53624r;
    public boolean f53625s;
    public String f53626t;
    public String f53627u;
    public String v;
    public boolean f53628w;
    public boolean f53629x;
    public String f53630y;
    public String f53631z;

    public static xi.e a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z10;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i7 = (int) (d - d2);
        if (d2 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i7 / ((float) d2)) * 100.0f);
        }
        boolean z11 = false;
        String o02 = org.telegram.messenger.g0.o0((int) tL_statsAbsValueAndPrev.current, 0);
        String str = "";
        if (i7 != 0 && abs != 0.0f) {
            int i10 = (int) abs;
            if (abs == i10) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i7 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(org.telegram.messenger.g0.o0(i7, 0));
                str = sb2.toString() + " (" + i10 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i7 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(org.telegram.messenger.g0.o0(i7, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 != 0 || tL_statsAbsValueAndPrev.current != 0.0d) {
            z11 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        ?? obj = new Object();
        obj.f60666a = o02;
        obj.f60667b = str;
        obj.f60668c = valueOf;
        obj.d = valueOf2;
        return obj;
    }
}
