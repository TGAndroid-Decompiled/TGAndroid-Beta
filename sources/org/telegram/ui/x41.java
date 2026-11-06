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
    public String f51740a;
    public String f51741b;
    public String f51742c;
    public boolean d;
    public String f51743e;
    public String f51744f;
    public String f51745g;
    public boolean h;
    public String f51746i;
    public String f51747j;
    public String f51748k;
    public boolean f51749l;
    public String f51750m;
    public String f51751n;
    public String f51752o;
    public String f51753p;
    public String f51754q;
    public boolean f51755r;
    public boolean f51756s;
    public String f51757t;
    public String f51758u;
    public String v;
    public boolean f51759w;
    public boolean f51760x;
    public String f51761y;
    public String f51762z;

    public static ab.b0 a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z9;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i7 = (int) (d - d2);
        if (d2 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i7 / ((float) d2)) * 100.0f);
        }
        String o02 = org.telegram.messenger.g0.o0((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z10 = true;
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
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z9);
        Boolean valueOf2 = Boolean.valueOf(z10);
        ab.b0 b0Var = new ab.b0(11, false);
        b0Var.f907b = o02;
        b0Var.f909e = str;
        b0Var.f908c = valueOf;
        b0Var.d = valueOf2;
        return b0Var;
    }
}
