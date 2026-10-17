package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class xl0 extends bu0 {
    public final xm0 f43161a;

    public xl0(xm0 xm0Var) {
        this.f43161a = xm0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        xm0 xm0Var = this.f43161a;
        int i11 = xm0Var.S0;
        if (i11 == 1) {
            secureDocument = xm0Var.f43186j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) xm0Var.f43188k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = xm0Var.l1;
        } else if (i11 == 3) {
            secureDocument = xm0Var.f43190m1;
        } else {
            secureDocument = (SecureDocument) xm0Var.f43184i1.get(i10);
        }
        vm0 vm0Var = (vm0) xm0Var.f43193n1.remove(secureDocument);
        if (vm0Var == null) {
            return;
        }
        String m12 = xm0.m1(secureDocument);
        int i12 = xm0Var.S0;
        String str = null;
        if (i12 == 1) {
            xm0Var.f43186j1 = null;
            str = r.c.g("selfie", m12);
        } else if (i12 == 4) {
            str = r.c.g("translation", m12);
        } else if (i12 == 2) {
            xm0Var.l1 = null;
            str = r.c.g("front", m12);
        } else if (i12 == 3) {
            xm0Var.f43190m1 = null;
            str = r.c.g("reverse", m12);
        } else if (i12 == 0) {
            str = r.c.g("files", m12);
        }
        if (str != null) {
            HashMap hashMap = xm0Var.f43217x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = xm0Var.f43220y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        xm0Var.R1(xm0Var.S0);
        xm0Var.f43183i0.removeView(vm0Var);
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            xm0 xm0Var = this.f43161a;
            if (i10 < xm0Var.f43183i0.getChildCount()) {
                vm0 vm0Var = (vm0) xm0Var.f43183i0.getChildAt(i10);
                int[] iArr = new int[2];
                vm0Var.f42234c.getLocationInWindow(iArr);
                lu0 lu0Var = new lu0();
                lu0Var.f38938b = iArr[0];
                lu0Var.f38939c = iArr[1];
                lu0Var.d = xm0Var.f43183i0;
                ImageReceiver imageReceiver = vm0Var.f42234c.getImageReceiver();
                lu0Var.f38937a = imageReceiver;
                lu0Var.e = imageReceiver.getBitmapSafe();
                return lu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f43161a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
