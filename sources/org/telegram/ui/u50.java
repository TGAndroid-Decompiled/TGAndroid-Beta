package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class u50 implements Runnable {
    public final int f51768a;
    public final jg.q1 f51769b;
    public final String f51770c;

    public u50(jg.q1 q1Var, String str, int i7) {
        this.f51768a = i7;
        this.f51769b = q1Var;
        this.f51770c = str;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f51768a) {
            case 0:
                Utilities.f22418g.c(new u50(this.f51769b, this.f51770c, 1));
                return;
            default:
                jg.q1 q1Var = this.f51769b;
                String str = this.f51770c;
                v50 v50Var = (v50) q1Var.f17250c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    v50Var.getClass();
                    org.telegram.messenger.g0.h3(new tp(v50Var, arrayList, arrayList2, 12));
                    return;
                }
                boolean z10 = true;
                String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
                while (i11 < v50Var.f52136n.f53425w.size()) {
                    org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) v50Var.f52136n.f53425w.get(i11);
                    String lowerCase2 = org.telegram.messenger.g5.m(0, d5Var.f23037i, d5Var.f23038j).toLowerCase();
                    String S02 = org.telegram.messenger.hd.E0().S0(lowerCase2, z10, false);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i12 = 0;
                    boolean z11 = false;
                    while (true) {
                        if (i12 < i10) {
                            String str2 = strArr[i12];
                            if (lowerCase2.startsWith(str2) || i5.c.A(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || i5.c.A(" ", str2, S02)))) {
                                z11 = true;
                            }
                            if (z11) {
                                arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f23037i, d5Var.f23038j, str2));
                                arrayList3.add(d5Var);
                            } else {
                                i12++;
                            }
                        }
                    }
                    i11++;
                    z10 = true;
                }
                org.telegram.messenger.g0.h3(new tp(v50Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
