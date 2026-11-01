package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
public final class vb implements Runnable {
    public final int f42469a;
    public final zb f42470b;

    public vb(zb zbVar, int i10) {
        this.f42469a = i10;
        this.f42470b = zbVar;
    }

    @Override
    public final void run() {
        switch (this.f42469a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                zb zbVar = this.f42470b;
                zbVar.a(countDownLatch, null);
                zbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                org.telegram.messenger.i0.g3(new vb(zbVar, 3));
                return;
            case 1:
                zb zbVar2 = this.f42470b;
                zbVar2.G = false;
                zbVar2.d(true);
                return;
            case 2:
                zb zbVar3 = this.f42470b;
                zbVar3.G = false;
                zbVar3.d(true);
                return;
            default:
                zb zbVar4 = this.f42470b;
                zbVar4.G = false;
                zbVar4.d(true);
                return;
        }
    }
}
