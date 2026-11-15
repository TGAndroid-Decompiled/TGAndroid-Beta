package org.telegram.ui;

import java.util.ArrayList;
public final class t31 implements Runnable {
    public final int f51344a;
    public final z41 f51345b;
    public final ArrayList f51346c;

    public t31(z41 z41Var, ArrayList arrayList, int i7) {
        this.f51344a = i7;
        this.f51345b = z41Var;
        this.f51346c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f51344a) {
            case 0:
                z41 z41Var = this.f51345b;
                fi.k6 k6Var = z41Var.D0;
                k6Var.getClass();
                ArrayList arrayList = this.f51346c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!k6Var.f11945j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!k6Var.q(0, arrayList, z10)) {
                    z41Var.m0();
                    z41Var.r0();
                    return;
                }
                return;
            default:
                z41 z41Var2 = this.f51345b;
                ArrayList arrayList2 = z41Var2.f53872w0;
                ArrayList arrayList3 = z41Var2.f53870v0;
                int i10 = 0;
                z41Var2.A0 = false;
                ArrayList arrayList4 = this.f51346c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList4.get(i11);
                        int i12 = z41Var2.f53868t0.get(gjVar.e1(), -1);
                        if (i12 >= 0 && ((w41) arrayList3.get(i12)).b() == gjVar.e1()) {
                            ((w41) arrayList3.get(i12)).f52431b = gjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            w41 w41Var = (w41) arrayList3.get(i10);
                            if (w41Var.f52431b == null) {
                                z41Var2.f53867s0 = w41Var.b();
                            } else {
                                arrayList2.add(w41Var);
                                i10++;
                            }
                        }
                    }
                    z41Var2.r0();
                    z41Var2.T.setItemAnimator(null);
                    z41Var2.C0.f();
                    return;
                }
                return;
        }
    }
}
