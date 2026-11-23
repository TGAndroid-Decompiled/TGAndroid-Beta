package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class vz0 implements Runnable {
    public final int f52891a;
    public final r11 f52892b;

    public vz0(r11 r11Var, int i7) {
        this.f52891a = i7;
        this.f52892b = r11Var;
    }

    @Override
    public final void run() {
        switch (this.f52891a) {
            case 0:
                r11 r11Var = this.f52892b;
                r11Var.getClass();
                HashSet hashSet = ch.f0.f5345a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.fc.D().f23862p;
                if (((CountDownLatch) b0Var.f6482c) == null) {
                    b0Var.f6482c = new CountDownLatch(1);
                }
                ch.f0.f5346b = true;
                ch.f0.f5348e = false;
                ch.f0.f5350g = false;
                org.telegram.messenger.g0.h3(new vz0(r11Var, 2), 0L);
                return;
            case 1:
                r11 r11Var2 = this.f52892b;
                ArrayList arrayList = r11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = r11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = r11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r11Var2.f51439r0.E(true);
                return;
            case 2:
                this.f52892b.W1.start();
                return;
            case 3:
                this.f52892b.B(true, true, true);
                return;
            default:
                r11 r11Var3 = this.f52892b;
                org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                vz0 vz0Var = r11Var3.T1;
                e10.f25399e.remove(vz0Var);
                org.telegram.messenger.ls.e().d(vz0Var);
                return;
        }
    }
}
