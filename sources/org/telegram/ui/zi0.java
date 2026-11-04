package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class zi0 extends eq0 {
    public final yj0 f52686a;

    public zi0(yj0 yj0Var) {
        this.f52686a = yj0Var;
    }

    @Override
    public final void B(int i3) {
        org.telegram.messenger.wv wvVar;
        yj0 yj0Var = this.f52686a;
        int i10 = yj0Var.T0;
        if (i10 == 1) {
            wvVar = yj0Var.k1;
        } else if (i10 == 4) {
            wvVar = (org.telegram.messenger.wv) yj0Var.f52311l1.get(i3);
        } else if (i10 == 2) {
            wvVar = yj0Var.m1;
        } else if (i10 == 3) {
            wvVar = yj0Var.f52314n1;
        } else {
            wvVar = (org.telegram.messenger.wv) yj0Var.f52308j1.get(i3);
        }
        wj0 wj0Var = (wj0) yj0Var.f52316o1.remove(wvVar);
        if (wj0Var == null) {
            return;
        }
        String r12 = yj0.r1(wvVar);
        int i11 = yj0Var.T0;
        String str = null;
        if (i11 == 1) {
            yj0Var.k1 = null;
            str = t4.c.f("selfie", r12);
        } else if (i11 == 4) {
            str = t4.c.f("translation", r12);
        } else if (i11 == 2) {
            yj0Var.m1 = null;
            str = t4.c.f("front", r12);
        } else if (i11 == 3) {
            yj0Var.f52314n1 = null;
            str = t4.c.f("reverse", r12);
        } else if (i11 == 0) {
            str = t4.c.f("files", r12);
        }
        if (str != null) {
            HashMap hashMap = yj0Var.f52341y1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = yj0Var.f52343z1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        yj0Var.X1(yj0Var.T0);
        yj0Var.f52307j0.removeView(wj0Var);
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        if (i3 >= 0) {
            yj0 yj0Var = this.f52686a;
            if (i3 < yj0Var.f52307j0.getChildCount()) {
                wj0 wj0Var = (wj0) yj0Var.f52307j0.getChildAt(i3);
                int[] iArr = new int[2];
                wj0Var.f51186c.getLocationInWindow(iArr);
                mq0 mq0Var = new mq0();
                mq0Var.f47752b = iArr[0];
                mq0Var.f47753c = iArr[1];
                mq0Var.d = yj0Var.f52307j0;
                ImageReceiver imageReceiver = wj0Var.f51186c.getImageReceiver();
                mq0Var.f47751a = imageReceiver;
                mq0Var.f47754e = imageReceiver.p();
                return mq0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f52686a.T0 == 1) {
            return org.telegram.messenger.bd.a0("PassportDeleteSelfieAlert", null, 2131747589, new Object[0]);
        }
        return org.telegram.messenger.bd.a0("PassportDeleteScanAlert", null, 2131747591, new Object[0]);
    }
}
