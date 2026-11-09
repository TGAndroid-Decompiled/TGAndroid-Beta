package org.telegram.ui;

import java.util.ArrayList;
public final class w31 implements Runnable {
    public final int f50846a;
    public final d51 f50847b;
    public final ArrayList f50848c;

    public w31(d51 d51Var, ArrayList arrayList, int i7) {
        this.f50846a = i7;
        this.f50847b = d51Var;
        this.f50848c = arrayList;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f50846a) {
            case 0:
                d51 d51Var = this.f50847b;
                di.r6 r6Var = d51Var.C0;
                r6Var.getClass();
                ArrayList arrayList = this.f50848c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!r6Var.f9695j.containsKey((Integer) obj)) {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (!r6Var.q(0, arrayList, z9)) {
                    d51Var.m0();
                    d51Var.r0();
                    return;
                }
                return;
            default:
                d51 d51Var2 = this.f50847b;
                ArrayList arrayList2 = d51Var2.f44853v0;
                ArrayList arrayList3 = d51Var2.f44852u0;
                int i10 = 0;
                d51Var2.f44860z0 = false;
                ArrayList arrayList4 = this.f50848c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(i11);
                        int i12 = d51Var2.f44850s0.get(ijVar.e1(), -1);
                        if (i12 >= 0 && ((a51) arrayList3.get(i12)).b() == ijVar.e1()) {
                            ((a51) arrayList3.get(i12)).f43589b = ijVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            a51 a51Var = (a51) arrayList3.get(i10);
                            if (a51Var.f43589b == null) {
                                d51Var2.f44848r0 = a51Var.b();
                            } else {
                                arrayList2.add(a51Var);
                                i10++;
                            }
                        }
                    }
                    d51Var2.r0();
                    d51Var2.S.setItemAnimator(null);
                    d51Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
