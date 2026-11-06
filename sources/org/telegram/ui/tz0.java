package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class tz0 implements Runnable {
    public final int f50162a;
    public final q11 f50163b;

    public tz0(q11 q11Var, int i7) {
        this.f50162a = i7;
        this.f50163b = q11Var;
    }

    @Override
    public final void run() {
        switch (this.f50162a) {
            case 0:
                q11 q11Var = this.f50163b;
                q11Var.getClass();
                HashSet hashSet = ch.e0.f6231a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().f22622p;
                if (((CountDownLatch) b0Var.f6815c) == null) {
                    b0Var.f6815c = new CountDownLatch(1);
                }
                ch.e0.f6232b = true;
                ch.e0.f6234e = false;
                ch.e0.f6236g = false;
                org.telegram.messenger.g0.i3(new tz0(q11Var, 2), 0L);
                return;
            case 1:
                q11 q11Var2 = this.f50163b;
                ArrayList arrayList = q11Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = q11Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = q11Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                q11Var2.f49024q0.E(true);
                return;
            case 2:
                this.f50163b.V1.start();
                return;
            case 3:
                this.f50163b.B(true, true, true);
                return;
            default:
                q11 q11Var3 = this.f50163b;
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                tz0 tz0Var = q11Var3.S1;
                e10.f25110e.remove(tz0Var);
                org.telegram.messenger.qs.e().d(tz0Var);
                return;
        }
    }
}
