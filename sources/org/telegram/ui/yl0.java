package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class yl0 extends bu0 {
    public final zm0 f43886a;

    public yl0(zm0 zm0Var) {
        this.f43886a = zm0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        zm0 zm0Var = this.f43886a;
        int i11 = zm0Var.S0;
        if (i11 == 1) {
            secureDocument = zm0Var.f44147j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) zm0Var.f44149k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = zm0Var.l1;
        } else if (i11 == 3) {
            secureDocument = zm0Var.f44151m1;
        } else {
            secureDocument = (SecureDocument) zm0Var.f44145i1.get(i10);
        }
        xm0 xm0Var = (xm0) zm0Var.f44154n1.remove(secureDocument);
        if (xm0Var == null) {
            return;
        }
        String m12 = zm0.m1(secureDocument);
        int i12 = zm0Var.S0;
        String str = null;
        if (i12 == 1) {
            zm0Var.f44147j1 = null;
            str = si.o0.h("selfie", m12);
        } else if (i12 == 4) {
            str = si.o0.h("translation", m12);
        } else if (i12 == 2) {
            zm0Var.l1 = null;
            str = si.o0.h("front", m12);
        } else if (i12 == 3) {
            zm0Var.f44151m1 = null;
            str = si.o0.h("reverse", m12);
        } else if (i12 == 0) {
            str = si.o0.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = zm0Var.f44178x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = zm0Var.f44181y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        zm0Var.S1(zm0Var.S0);
        zm0Var.f44144i0.removeView(xm0Var);
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            zm0 zm0Var = this.f43886a;
            if (i10 < zm0Var.f44144i0.getChildCount()) {
                xm0 xm0Var = (xm0) zm0Var.f44144i0.getChildAt(i10);
                int[] iArr = new int[2];
                xm0Var.f43643c.getLocationInWindow(iArr);
                lu0 lu0Var = new lu0();
                lu0Var.f39382b = iArr[0];
                lu0Var.f39383c = iArr[1];
                lu0Var.d = zm0Var.f44144i0;
                ImageReceiver imageReceiver = xm0Var.f43643c.getImageReceiver();
                lu0Var.f39381a = imageReceiver;
                lu0Var.e = imageReceiver.getBitmapSafe();
                return lu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f43886a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
