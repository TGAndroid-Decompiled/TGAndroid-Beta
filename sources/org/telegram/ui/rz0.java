package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class rz0 implements Runnable {
    public final int f51054a;
    public final n11 f51055b;

    public rz0(n11 n11Var, int i7) {
        this.f51054a = i7;
        this.f51055b = n11Var;
    }

    @Override
    public final void run() {
        switch (this.f51054a) {
            case 0:
                n11 n11Var = this.f51055b;
                n11Var.getClass();
                HashSet hashSet = ch.f0.f5067a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.fc.D().f23476p;
                if (((CountDownLatch) b0Var.f6207c) == null) {
                    b0Var.f6207c = new CountDownLatch(1);
                }
                ch.f0.f5068b = true;
                ch.f0.f5070e = false;
                ch.f0.f5072g = false;
                org.telegram.messenger.g0.i3(new rz0(n11Var, 2), 0L);
                return;
            case 1:
                n11 n11Var2 = this.f51055b;
                ArrayList arrayList = n11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = n11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = n11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                n11Var2.f49402r0.E(true);
                return;
            case 2:
                this.f51055b.W1.start();
                return;
            case 3:
                this.f51055b.B(true, true, true);
                return;
            default:
                n11 n11Var3 = this.f51055b;
                org.telegram.messenger.ns e10 = org.telegram.messenger.ns.e();
                rz0 rz0Var = n11Var3.T1;
                e10.f25624e.remove(rz0Var);
                org.telegram.messenger.ns.e().d(rz0Var);
                return;
        }
    }
}
