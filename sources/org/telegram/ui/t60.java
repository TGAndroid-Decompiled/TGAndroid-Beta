package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class t60 implements Runnable {
    public final int f41551a;
    public final org.telegram.messenger.we f41552b;
    public final String f41553c;

    public t60(org.telegram.messenger.we weVar, String str, int i10) {
        this.f41551a = i10;
        this.f41552b = weVar;
        this.f41553c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41551a) {
            case 0:
                Utilities.f14523g.c(new t60(this.f41552b, this.f41553c, 1));
                return;
            default:
                org.telegram.messenger.we weVar = this.f41552b;
                String str = this.f41553c;
                u60 u60Var = (u60) weVar.f19039c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    u60Var.getClass();
                    org.telegram.messenger.i0.g3(new qq(u60Var, arrayList, arrayList2, 12));
                    return;
                }
                boolean z10 = true;
                String R0 = org.telegram.messenger.dd.D0().R0(lowerCase, true, false);
                if (lowerCase.equals(R0) || R0.isEmpty()) {
                    R0 = null;
                }
                if (R0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i11 = i10 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (R0 != null) {
                    strArr[1] = R0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i12 = 0;
                while (i12 < u60Var.f41837n.f43271w.size()) {
                    org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) u60Var.f41837n.f43271w.get(i12);
                    String lowerCase2 = org.telegram.messenger.i5.m(0, f5Var.f15697i, f5Var.f15698j).toLowerCase();
                    String R02 = org.telegram.messenger.dd.D0().R0(lowerCase2, z10, false);
                    if (lowerCase2.equals(R02)) {
                        R02 = null;
                    }
                    int i13 = 0;
                    boolean z11 = false;
                    while (true) {
                        if (i13 < i11) {
                            String str2 = strArr[i13];
                            if (lowerCase2.startsWith(str2) || sc.e.y(" ", str2, lowerCase2) || (R02 != null && (R02.startsWith(str2) || sc.e.y(" ", str2, R02)))) {
                                z11 = true;
                            }
                            if (z11) {
                                arrayList4.add(org.telegram.messenger.i0.r0(f5Var.f15697i, f5Var.f15698j, str2));
                                arrayList3.add(f5Var);
                            } else {
                                i13++;
                            }
                        }
                    }
                    i12++;
                    z10 = true;
                }
                org.telegram.messenger.i0.g3(new qq(u60Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
