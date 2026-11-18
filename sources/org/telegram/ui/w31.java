package org.telegram.ui;

import java.util.ArrayList;
public final class w31 implements Runnable {
    public final int f52921a;
    public final c51 f52922b;
    public final ArrayList f52923c;

    public w31(c51 c51Var, ArrayList arrayList, int i7) {
        this.f52921a = i7;
        this.f52922b = c51Var;
        this.f52923c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f52921a) {
            case 0:
                c51 c51Var = this.f52922b;
                fi.h6 h6Var = c51Var.D0;
                h6Var.getClass();
                ArrayList arrayList = this.f52923c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!h6Var.f12049j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!h6Var.q(0, arrayList, z10)) {
                    c51Var.m0();
                    c51Var.r0();
                    return;
                }
                return;
            default:
                c51 c51Var2 = this.f52922b;
                ArrayList arrayList2 = c51Var2.f46435w0;
                ArrayList arrayList3 = c51Var2.f46433v0;
                int i10 = 0;
                c51Var2.A0 = false;
                ArrayList arrayList4 = this.f52923c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(i11);
                        int i12 = c51Var2.f46431t0.get(fjVar.e1(), -1);
                        if (i12 >= 0 && ((z41) arrayList3.get(i12)).b() == fjVar.e1()) {
                            ((z41) arrayList3.get(i12)).f54430b = fjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            z41 z41Var = (z41) arrayList3.get(i10);
                            if (z41Var.f54430b == null) {
                                c51Var2.f46430s0 = z41Var.b();
                            } else {
                                arrayList2.add(z41Var);
                                i10++;
                            }
                        }
                    }
                    c51Var2.r0();
                    c51Var2.T.setItemAnimator(null);
                    c51Var2.C0.f();
                    return;
                }
                return;
        }
    }
}
