package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class wz0 implements Runnable {
    public final int f53558a;
    public final s11 f53559b;

    public wz0(s11 s11Var, int i7) {
        this.f53558a = i7;
        this.f53559b = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f53558a) {
            case 0:
                s11 s11Var = this.f53559b;
                s11Var.getClass();
                HashSet hashSet = ch.f0.f5379a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.ec.D().f23717p;
                if (((CountDownLatch) b0Var.f6516c) == null) {
                    b0Var.f6516c = new CountDownLatch(1);
                }
                ch.f0.f5380b = true;
                ch.f0.f5382e = false;
                ch.f0.f5384g = false;
                org.telegram.messenger.g0.h3(new wz0(s11Var, 2), 0L);
                return;
            case 1:
                s11 s11Var2 = this.f53559b;
                ArrayList arrayList = s11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = s11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = s11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                s11Var2.f51857r0.E(true);
                return;
            case 2:
                this.f53559b.W1.start();
                return;
            case 3:
                this.f53559b.B(true, true, true);
                return;
            default:
                s11 s11Var3 = this.f53559b;
                org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
                wz0 wz0Var = s11Var3.T1;
                e10.f25269e.remove(wz0Var);
                org.telegram.messenger.ks.e().d(wz0Var);
                return;
        }
    }
}
