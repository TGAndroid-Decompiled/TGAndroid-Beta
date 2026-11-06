package org.telegram.ui;

import java.util.ArrayList;
public final class v31 implements Runnable {
    public final int f50570a;
    public final c51 f50571b;
    public final ArrayList f50572c;

    public v31(c51 c51Var, ArrayList arrayList, int i7) {
        this.f50570a = i7;
        this.f50571b = c51Var;
        this.f50572c = arrayList;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f50570a) {
            case 0:
                c51 c51Var = this.f50571b;
                di.q6 q6Var = c51Var.C0;
                q6Var.getClass();
                ArrayList arrayList = this.f50572c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!q6Var.f9644j.containsKey((Integer) obj)) {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (!q6Var.q(0, arrayList, z9)) {
                    c51Var.m0();
                    c51Var.r0();
                    return;
                }
                return;
            default:
                c51 c51Var2 = this.f50571b;
                ArrayList arrayList2 = c51Var2.f44692v0;
                ArrayList arrayList3 = c51Var2.f44691u0;
                int i10 = 0;
                c51Var2.f44699z0 = false;
                ArrayList arrayList4 = this.f50572c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i11);
                        int i12 = c51Var2.f44689s0.get(ijVar.f1(), -1);
                        if (i12 >= 0 && ((z41) arrayList3.get(i12)).b() == ijVar.f1()) {
                            ((z41) arrayList3.get(i12)).f52474b = ijVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            z41 z41Var = (z41) arrayList3.get(i10);
                            if (z41Var.f52474b == null) {
                                c51Var2.f44687r0 = z41Var.b();
                            } else {
                                arrayList2.add(z41Var);
                                i10++;
                            }
                        }
                    }
                    c51Var2.r0();
                    c51Var2.S.setItemAnimator(null);
                    c51Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
