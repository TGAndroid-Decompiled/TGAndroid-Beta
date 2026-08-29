package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class ul0 extends pt0 {
    public final vm0 f43285a;

    public ul0(vm0 vm0Var) {
        this.f43285a = vm0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        vm0 vm0Var = this.f43285a;
        int i11 = vm0Var.O0;
        if (i11 == 1) {
            secureDocument = vm0Var.f43638f1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) vm0Var.f43640g1.get(i10);
        } else if (i11 == 2) {
            secureDocument = vm0Var.f43642h1;
        } else if (i11 == 3) {
            secureDocument = vm0Var.f43644i1;
        } else {
            secureDocument = (SecureDocument) vm0Var.f43635e1.get(i10);
        }
        tm0 tm0Var = (tm0) vm0Var.f43646j1.remove(secureDocument);
        if (tm0Var == null) {
            return;
        }
        String n12 = vm0.n1(secureDocument);
        int i12 = vm0Var.O0;
        String str = null;
        if (i12 == 1) {
            vm0Var.f43638f1 = null;
            str = u3.c.e("selfie", n12);
        } else if (i12 == 4) {
            str = u3.c.e("translation", n12);
        } else if (i12 == 2) {
            vm0Var.f43642h1 = null;
            str = u3.c.e("front", n12);
        } else if (i12 == 3) {
            vm0Var.f43644i1 = null;
            str = u3.c.e("reverse", n12);
        } else if (i12 == 0) {
            str = u3.c.e("files", n12);
        }
        if (str != null) {
            HashMap hashMap = vm0Var.f43667t1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = vm0Var.f43669u1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        vm0Var.S1(vm0Var.O0);
        vm0Var.f43634e0.removeView(tm0Var);
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            vm0 vm0Var = this.f43285a;
            if (i10 < vm0Var.f43634e0.getChildCount()) {
                tm0 tm0Var = (tm0) vm0Var.f43634e0.getChildAt(i10);
                int[] iArr = new int[2];
                tm0Var.f42732c.getLocationInWindow(iArr);
                zt0 zt0Var = new zt0();
                zt0Var.f45317b = iArr[0];
                zt0Var.f45318c = iArr[1];
                zt0Var.d = vm0Var.f43634e0;
                ImageReceiver imageReceiver = tm0Var.f42732c.getImageReceiver();
                zt0Var.f45316a = imageReceiver;
                zt0Var.f45319e = imageReceiver.getBitmapSafe();
                return zt0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f43285a.O0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
