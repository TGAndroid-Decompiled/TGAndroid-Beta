package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class w50 implements Runnable {
    public final int f52939a;
    public final jg.q1 f52940b;
    public final String f52941c;

    public w50(jg.q1 q1Var, String str, int i7) {
        this.f52939a = i7;
        this.f52940b = q1Var;
        this.f52941c = str;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52939a) {
            case 0:
                Utilities.f22784g.c(new w50(this.f52940b, this.f52941c, 1));
                return;
            default:
                jg.q1 q1Var = this.f52940b;
                String str = this.f52941c;
                x50 x50Var = (x50) q1Var.f17636c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    x50Var.getClass();
                    org.telegram.messenger.g0.g3(new up(x50Var, arrayList, arrayList2, 12));
                    return;
                }
                boolean z10 = true;
                String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.isEmpty()) {
                    S0 = null;
                }
                if (S0 != null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                int i10 = i7 + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i11 = 0;
                while (i11 < x50Var.f53643n.f45475w.size()) {
                    org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) x50Var.f53643n.f45475w.get(i11);
                    String lowerCase2 = org.telegram.messenger.i5.m(0, f5Var.f23846i, f5Var.f23847j).toLowerCase();
                    String S02 = org.telegram.messenger.gd.E0().S0(lowerCase2, z10, false);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i12 = 0;
                    boolean z11 = false;
                    while (true) {
                        if (i12 < i10) {
                            String str2 = strArr[i12];
                            if (lowerCase2.startsWith(str2) || i5.c.B(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || i5.c.B(" ", str2, S02)))) {
                                z11 = true;
                            }
                            if (z11) {
                                arrayList4.add(org.telegram.messenger.g0.r0(f5Var.f23846i, f5Var.f23847j, str2));
                                arrayList3.add(f5Var);
                            } else {
                                i12++;
                            }
                        }
                    }
                    i11++;
                    z10 = true;
                }
                org.telegram.messenger.g0.g3(new up(x50Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
