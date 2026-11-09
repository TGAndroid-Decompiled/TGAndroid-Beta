package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class wz0 implements Runnable {
    public final int f51506a;
    public final s11 f51507b;

    public wz0(s11 s11Var, int i7) {
        this.f51506a = i7;
        this.f51507b = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f51506a) {
            case 0:
                s11 s11Var = this.f51507b;
                s11Var.getClass();
                HashSet hashSet = ch.e0.f6229a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().f22648p;
                if (((CountDownLatch) b0Var.f6813c) == null) {
                    b0Var.f6813c = new CountDownLatch(1);
                }
                ch.e0.f6230b = true;
                ch.e0.f6232e = false;
                ch.e0.f6234g = false;
                org.telegram.messenger.g0.i3(new wz0(s11Var, 2), 0L);
                return;
            case 1:
                s11 s11Var2 = this.f51507b;
                ArrayList arrayList = s11Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = s11Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = s11Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                s11Var2.f49696q0.E(true);
                return;
            case 2:
                this.f51507b.V1.start();
                return;
            case 3:
                this.f51507b.B(true, true, true);
                return;
            default:
                s11 s11Var3 = this.f51507b;
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                wz0 wz0Var = s11Var3.S1;
                e10.f25127e.remove(wz0Var);
                org.telegram.messenger.qs.e().d(wz0Var);
                return;
        }
    }
}
