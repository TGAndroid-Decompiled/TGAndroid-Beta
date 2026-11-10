package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class xz0 implements Runnable {
    public final int f51844a;
    public final t11 f51845b;

    public xz0(t11 t11Var, int i7) {
        this.f51844a = i7;
        this.f51845b = t11Var;
    }

    @Override
    public final void run() {
        switch (this.f51844a) {
            case 0:
                t11 t11Var = this.f51845b;
                t11Var.getClass();
                HashSet hashSet = ch.e0.f6234a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().f22652p;
                if (((CountDownLatch) b0Var.f6818c) == null) {
                    b0Var.f6818c = new CountDownLatch(1);
                }
                ch.e0.f6235b = true;
                ch.e0.f6237e = false;
                ch.e0.f6239g = false;
                org.telegram.messenger.g0.i3(new xz0(t11Var, 2), 0L);
                return;
            case 1:
                t11 t11Var2 = this.f51845b;
                ArrayList arrayList = t11Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = t11Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = t11Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                t11Var2.f50052q0.E(true);
                return;
            case 2:
                this.f51845b.V1.start();
                return;
            case 3:
                this.f51845b.B(true, true, true);
                return;
            default:
                t11 t11Var3 = this.f51845b;
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                xz0 xz0Var = t11Var3.S1;
                e10.f25131e.remove(xz0Var);
                org.telegram.messenger.qs.e().d(xz0Var);
                return;
        }
    }
}
