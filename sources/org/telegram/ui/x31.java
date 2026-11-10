package org.telegram.ui;

import java.util.ArrayList;
public final class x31 implements Runnable {
    public final int f51506a;
    public final e51 f51507b;
    public final ArrayList f51508c;

    public x31(e51 e51Var, ArrayList arrayList, int i7) {
        this.f51506a = i7;
        this.f51507b = e51Var;
        this.f51508c = arrayList;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f51506a) {
            case 0:
                e51 e51Var = this.f51507b;
                di.r6 r6Var = e51Var.C0;
                r6Var.getClass();
                ArrayList arrayList = this.f51508c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!r6Var.f9700j.containsKey((Integer) obj)) {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (!r6Var.q(0, arrayList, z9)) {
                    e51Var.m0();
                    e51Var.r0();
                    return;
                }
                return;
            default:
                e51 e51Var2 = this.f51507b;
                ArrayList arrayList2 = e51Var2.f45166v0;
                ArrayList arrayList3 = e51Var2.f45165u0;
                int i10 = 0;
                e51Var2.f45173z0 = false;
                ArrayList arrayList4 = this.f51508c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i11);
                        int i12 = e51Var2.f45163s0.get(ijVar.e1(), -1);
                        if (i12 >= 0 && ((b51) arrayList3.get(i12)).b() == ijVar.e1()) {
                            ((b51) arrayList3.get(i12)).f43931b = ijVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            b51 b51Var = (b51) arrayList3.get(i10);
                            if (b51Var.f43931b == null) {
                                e51Var2.f45161r0 = b51Var.b();
                            } else {
                                arrayList2.add(b51Var);
                                i10++;
                            }
                        }
                    }
                    e51Var2.r0();
                    e51Var2.S.setItemAnimator(null);
                    e51Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
