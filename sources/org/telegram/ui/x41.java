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
    public String f51747a;
    public String f51748b;
    public String f51749c;
    public boolean d;
    public String f51750e;
    public String f51751f;
    public String f51752g;
    public boolean h;
    public String f51753i;
    public String f51754j;
    public String f51755k;
    public boolean f51756l;
    public String f51757m;
    public String f51758n;
    public String f51759o;
    public String f51760p;
    public String f51761q;
    public boolean f51762r;
    public boolean f51763s;
    public String f51764t;
    public String f51765u;
    public String v;
    public boolean f51766w;
    public boolean f51767x;
    public String f51768y;
    public String f51769z;

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
