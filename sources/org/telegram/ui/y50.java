package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class y50 implements Runnable {
    public final int f51897a;
    public final jg.q1 f51898b;
    public final String f51899c;

    public y50(jg.q1 q1Var, String str, int i7) {
        this.f51897a = i7;
        this.f51898b = q1Var;
        this.f51899c = str;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f51897a) {
            case 0:
                Utilities.f21343g.c(new y50(this.f51898b, this.f51899c, 1));
                return;
            default:
                jg.q1 q1Var = this.f51898b;
                String str = this.f51899c;
                z50 z50Var = (z50) q1Var.f16898c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    z50Var.getClass();
                    org.telegram.messenger.g0.h3(new tp(z50Var, arrayList, arrayList2, 12));
                    return;
                }
                boolean z9 = true;
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
                while (i11 < z50Var.f52269n.f44260w.size()) {
                    org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) z50Var.f52269n.f44260w.get(i11);
                    String lowerCase2 = org.telegram.messenger.g5.m(0, d5Var.f21996i, d5Var.f21997j).toLowerCase();
                    String S02 = org.telegram.messenger.id.E0().S0(lowerCase2, z9, false);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i12 = 0;
                    boolean z10 = false;
                    while (true) {
                        if (i12 < i10) {
                            String str2 = strArr[i12];
                            if (lowerCase2.startsWith(str2) || jg.g.A(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || jg.g.A(" ", str2, S02)))) {
                                z10 = true;
                            }
                            if (z10) {
                                arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f21996i, d5Var.f21997j, str2));
                                arrayList3.add(d5Var);
                            } else {
                                i12++;
                            }
                        }
                    }
                    i11++;
                    z9 = true;
                }
                org.telegram.messenger.g0.h3(new tp(z50Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
