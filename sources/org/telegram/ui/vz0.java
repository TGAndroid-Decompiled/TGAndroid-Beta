package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class vz0 implements Runnable {
    public final int f52888a;
    public final r11 f52889b;

    public vz0(r11 r11Var, int i7) {
        this.f52888a = i7;
        this.f52889b = r11Var;
    }

    @Override
    public final void run() {
        switch (this.f52888a) {
            case 0:
                r11 r11Var = this.f52889b;
                r11Var.getClass();
                HashSet hashSet = ch.f0.f5353a;
                com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.ec.D().f23692p;
                if (((CountDownLatch) b0Var.f6490c) == null) {
                    b0Var.f6490c = new CountDownLatch(1);
                }
                ch.f0.f5354b = true;
                ch.f0.f5356e = false;
                ch.f0.f5358g = false;
                org.telegram.messenger.g0.h3(new vz0(r11Var, 2), 0L);
                return;
            case 1:
                r11 r11Var2 = this.f52889b;
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
                r11Var2.f51455r0.E(true);
                return;
            case 2:
                this.f52889b.W1.start();
                return;
            case 3:
                this.f52889b.B(true, true, true);
                return;
            default:
                r11 r11Var3 = this.f52889b;
                org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
                vz0 vz0Var = r11Var3.T1;
                e10.f25243e.remove(vz0Var);
                org.telegram.messenger.ks.e().d(vz0Var);
                return;
        }
    }
}
