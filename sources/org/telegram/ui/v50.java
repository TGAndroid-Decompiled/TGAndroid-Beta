package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class v50 implements Runnable {
    public final int f50576a;
    public final jg.q1 f50577b;
    public final String f50578c;

    public v50(jg.q1 q1Var, String str, int i7) {
        this.f50576a = i7;
        this.f50577b = q1Var;
        this.f50578c = str;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f50576a) {
            case 0:
                Utilities.f21335g.c(new v50(this.f50577b, this.f50578c, 1));
                return;
            default:
                jg.q1 q1Var = this.f50577b;
                String str = this.f50578c;
                w50 w50Var = (w50) q1Var.f16895c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    w50Var.getClass();
                    org.telegram.messenger.g0.h3(new rp(w50Var, arrayList, arrayList2, 12));
                    return;
                }
                boolean z9 = true;
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
                while (i11 < w50Var.f50962n.f52485w.size()) {
                    org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) w50Var.f50962n.f52485w.get(i11);
                    String lowerCase2 = org.telegram.messenger.g5.m(0, d5Var.f21962i, d5Var.f21963j).toLowerCase();
                    String S02 = org.telegram.messenger.hd.E0().S0(lowerCase2, z9, false);
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
                                arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f21962i, d5Var.f21963j, str2));
                                arrayList3.add(d5Var);
                            } else {
                                i12++;
                            }
                        }
                    }
                    i11++;
                    z9 = true;
                }
                org.telegram.messenger.g0.h3(new rp(w50Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
