package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class v50 implements Runnable {
    public final int f50498a;
    public final jg.q1 f50499b;
    public final String f50500c;

    public v50(jg.q1 q1Var, String str, int i7) {
        this.f50498a = i7;
        this.f50499b = q1Var;
        this.f50500c = str;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f50498a) {
            case 0:
                Utilities.f21338g.c(new v50(this.f50499b, this.f50500c, 1));
                return;
            default:
                jg.q1 q1Var = this.f50499b;
                String str = this.f50500c;
                w50 w50Var = (w50) q1Var.f16898c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    w50Var.getClass();
                    org.telegram.messenger.g0.h3(new rp(w50Var, arrayList, arrayList2, 12));
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
                while (i11 < w50Var.f50905n.f52463w.size()) {
                    org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) w50Var.f50905n.f52463w.get(i11);
                    String lowerCase2 = org.telegram.messenger.g5.m(0, d5Var.f21992i, d5Var.f21993j).toLowerCase();
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
                                arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f21992i, d5Var.f21993j, str2));
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
