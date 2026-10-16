package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class rm0 extends zu0 {
    public final sn0 f39552a;

    public rm0(sn0 sn0Var) {
        this.f39552a = sn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        sn0 sn0Var = this.f39552a;
        int i11 = sn0Var.S0;
        if (i11 == 1) {
            secureDocument = sn0Var.f39877j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) sn0Var.f39879k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = sn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = sn0Var.f39881m1;
        } else {
            secureDocument = (SecureDocument) sn0Var.f39875i1.get(i10);
        }
        qn0 qn0Var = (qn0) sn0Var.f39884n1.remove(secureDocument);
        if (qn0Var == null) {
            return;
        }
        String m12 = sn0.m1(secureDocument);
        int i12 = sn0Var.S0;
        String str = null;
        if (i12 == 1) {
            sn0Var.f39877j1 = null;
            str = t8.b.h("selfie", m12);
        } else if (i12 == 4) {
            str = t8.b.h("translation", m12);
        } else if (i12 == 2) {
            sn0Var.l1 = null;
            str = t8.b.h("front", m12);
        } else if (i12 == 3) {
            sn0Var.f39881m1 = null;
            str = t8.b.h("reverse", m12);
        } else if (i12 == 0) {
            str = t8.b.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = sn0Var.f39908x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = sn0Var.f39911y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        sn0Var.R1(sn0Var.S0);
        sn0Var.f39874i0.removeView(qn0Var);
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            sn0 sn0Var = this.f39552a;
            if (i10 < sn0Var.f39874i0.getChildCount()) {
                qn0 qn0Var = (qn0) sn0Var.f39874i0.getChildAt(i10);
                int[] iArr = new int[2];
                qn0Var.f39193c.getLocationInWindow(iArr);
                jv0 jv0Var = new jv0();
                jv0Var.f37146b = iArr[0];
                jv0Var.f37147c = iArr[1];
                jv0Var.d = sn0Var.f39874i0;
                ImageReceiver imageReceiver = qn0Var.f39193c.getImageReceiver();
                jv0Var.f37145a = imageReceiver;
                jv0Var.e = imageReceiver.getBitmapSafe();
                return jv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f39552a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
