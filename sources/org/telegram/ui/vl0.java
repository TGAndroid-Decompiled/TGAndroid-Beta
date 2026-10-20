package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class vl0 extends zt0 {
    public final vm0 f42279a;

    public vl0(vm0 vm0Var) {
        this.f42279a = vm0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        vm0 vm0Var = this.f42279a;
        int i11 = vm0Var.S0;
        if (i11 == 1) {
            secureDocument = vm0Var.f42304j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) vm0Var.f42306k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = vm0Var.l1;
        } else if (i11 == 3) {
            secureDocument = vm0Var.f42308m1;
        } else {
            secureDocument = (SecureDocument) vm0Var.f42302i1.get(i10);
        }
        tm0 tm0Var = (tm0) vm0Var.f42311n1.remove(secureDocument);
        if (tm0Var == null) {
            return;
        }
        String m12 = vm0.m1(secureDocument);
        int i12 = vm0Var.S0;
        String str = null;
        if (i12 == 1) {
            vm0Var.f42304j1 = null;
            str = r4.c.h("selfie", m12);
        } else if (i12 == 4) {
            str = r4.c.h("translation", m12);
        } else if (i12 == 2) {
            vm0Var.l1 = null;
            str = r4.c.h("front", m12);
        } else if (i12 == 3) {
            vm0Var.f42308m1 = null;
            str = r4.c.h("reverse", m12);
        } else if (i12 == 0) {
            str = r4.c.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = vm0Var.f42335x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = vm0Var.f42338y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        vm0Var.R1(vm0Var.S0);
        vm0Var.f42301i0.removeView(tm0Var);
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            vm0 vm0Var = this.f42279a;
            if (i10 < vm0Var.f42301i0.getChildCount()) {
                tm0 tm0Var = (tm0) vm0Var.f42301i0.getChildAt(i10);
                int[] iArr = new int[2];
                tm0Var.f41701c.getLocationInWindow(iArr);
                ju0 ju0Var = new ju0();
                ju0Var.f38351b = iArr[0];
                ju0Var.f38352c = iArr[1];
                ju0Var.d = vm0Var.f42301i0;
                ImageReceiver imageReceiver = tm0Var.f41701c.getImageReceiver();
                ju0Var.f38350a = imageReceiver;
                ju0Var.e = imageReceiver.getBitmapSafe();
                return ju0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f42279a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
