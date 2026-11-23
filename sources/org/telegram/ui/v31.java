package org.telegram.ui;

import java.util.ArrayList;
public final class v31 implements Runnable {
    public final int f52798a;
    public final b51 f52799b;
    public final ArrayList f52800c;

    public v31(b51 b51Var, ArrayList arrayList, int i7) {
        this.f52798a = i7;
        this.f52799b = b51Var;
        this.f52800c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f52798a) {
            case 0:
                b51 b51Var = this.f52799b;
                fi.h6 h6Var = b51Var.D0;
                h6Var.getClass();
                ArrayList arrayList = this.f52800c;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (!h6Var.f12052j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!h6Var.q(0, arrayList, z10)) {
                    b51Var.m0();
                    b51Var.r0();
                    return;
                }
                return;
            default:
                b51 b51Var2 = this.f52799b;
                ArrayList arrayList2 = b51Var2.f45954w0;
                ArrayList arrayList3 = b51Var2.f45952v0;
                int i10 = 0;
                b51Var2.A0 = false;
                ArrayList arrayList4 = this.f52800c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(i11);
                        int i12 = b51Var2.f45950t0.get(fjVar.e1(), -1);
                        if (i12 >= 0 && ((y41) arrayList3.get(i12)).b() == fjVar.e1()) {
                            ((y41) arrayList3.get(i12)).f54223b = fjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            y41 y41Var = (y41) arrayList3.get(i10);
                            if (y41Var.f54223b == null) {
                                b51Var2.f45949s0 = y41Var.b();
                            } else {
                                arrayList2.add(y41Var);
                                i10++;
                            }
                        }
                    }
                    b51Var2.r0();
                    b51Var2.T.setItemAnimator(null);
                    b51Var2.C0.f();
                    return;
                }
                return;
        }
    }
}
