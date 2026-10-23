package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class zl0 extends cu0 {
    public final an0 f44172a;

    public zl0(an0 an0Var) {
        this.f44172a = an0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        an0 an0Var = this.f44172a;
        int i11 = an0Var.S0;
        if (i11 == 1) {
            secureDocument = an0Var.f35724j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) an0Var.f35726k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = an0Var.l1;
        } else if (i11 == 3) {
            secureDocument = an0Var.f35728m1;
        } else {
            secureDocument = (SecureDocument) an0Var.f35722i1.get(i10);
        }
        ym0 ym0Var = (ym0) an0Var.f35731n1.remove(secureDocument);
        if (ym0Var == null) {
            return;
        }
        String m12 = an0.m1(secureDocument);
        int i12 = an0Var.S0;
        String str = null;
        if (i12 == 1) {
            an0Var.f35724j1 = null;
            str = si.o0.h("selfie", m12);
        } else if (i12 == 4) {
            str = si.o0.h("translation", m12);
        } else if (i12 == 2) {
            an0Var.l1 = null;
            str = si.o0.h("front", m12);
        } else if (i12 == 3) {
            an0Var.f35728m1 = null;
            str = si.o0.h("reverse", m12);
        } else if (i12 == 0) {
            str = si.o0.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = an0Var.f35755x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = an0Var.f35758y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        an0Var.S1(an0Var.S0);
        an0Var.f35721i0.removeView(ym0Var);
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            an0 an0Var = this.f44172a;
            if (i10 < an0Var.f35721i0.getChildCount()) {
                ym0 ym0Var = (ym0) an0Var.f35721i0.getChildAt(i10);
                int[] iArr = new int[2];
                ym0Var.f43904c.getLocationInWindow(iArr);
                mu0 mu0Var = new mu0();
                mu0Var.f39693b = iArr[0];
                mu0Var.f39694c = iArr[1];
                mu0Var.d = an0Var.f35721i0;
                ImageReceiver imageReceiver = ym0Var.f43904c.getImageReceiver();
                mu0Var.f39692a = imageReceiver;
                mu0Var.e = imageReceiver.getBitmapSafe();
                return mu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f44172a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
