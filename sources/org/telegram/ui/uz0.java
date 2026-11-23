package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class uz0 implements Runnable {
    public final int f52763a;
    public final q11 f52764b;

    public uz0(q11 q11Var, int i7) {
        this.f52763a = i7;
        this.f52764b = q11Var;
    }

    @Override
    public final void run() {
        switch (this.f52763a) {
            case 0:
                q11 q11Var = this.f52764b;
                q11Var.getClass();
                HashSet hashSet = ch.f0.f5345a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.ec.D().f23794p;
                if (((CountDownLatch) b0Var.f6481c) == null) {
                    b0Var.f6481c = new CountDownLatch(1);
                }
                ch.f0.f5346b = true;
                ch.f0.f5348e = false;
                ch.f0.f5350g = false;
                org.telegram.messenger.g0.h3(new uz0(q11Var, 2), 0L);
                return;
            case 1:
                q11 q11Var2 = this.f52764b;
                ArrayList arrayList = q11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = q11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = q11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                q11Var2.f51264r0.E(true);
                return;
            case 2:
                this.f52764b.W1.start();
                return;
            case 3:
                this.f52764b.B(true, true, true);
                return;
            default:
                q11 q11Var3 = this.f52764b;
                org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
                uz0 uz0Var = q11Var3.T1;
                e10.f25340e.remove(uz0Var);
                org.telegram.messenger.ks.e().d(uz0Var);
                return;
        }
    }
}
