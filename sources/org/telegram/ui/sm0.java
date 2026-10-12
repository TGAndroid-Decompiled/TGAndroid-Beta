package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class sm0 extends av0 {
    public final un0 f40175a;

    public sm0(un0 un0Var) {
        this.f40175a = un0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        un0 un0Var = this.f40175a;
        int i11 = un0Var.S0;
        if (i11 == 1) {
            secureDocument = un0Var.f40742j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) un0Var.f40744k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = un0Var.l1;
        } else if (i11 == 3) {
            secureDocument = un0Var.f40746m1;
        } else {
            secureDocument = (SecureDocument) un0Var.f40740i1.get(i10);
        }
        sn0 sn0Var = (sn0) un0Var.f40749n1.remove(secureDocument);
        if (sn0Var == null) {
            return;
        }
        String m12 = un0.m1(secureDocument);
        int i12 = un0Var.S0;
        String str = null;
        if (i12 == 1) {
            un0Var.f40742j1 = null;
            str = t8.b.h("selfie", m12);
        } else if (i12 == 4) {
            str = t8.b.h("translation", m12);
        } else if (i12 == 2) {
            un0Var.l1 = null;
            str = t8.b.h("front", m12);
        } else if (i12 == 3) {
            un0Var.f40746m1 = null;
            str = t8.b.h("reverse", m12);
        } else if (i12 == 0) {
            str = t8.b.h("files", m12);
        }
        if (str != null) {
            HashMap hashMap = un0Var.f40773x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = un0Var.f40776y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        un0Var.R1(un0Var.S0);
        un0Var.f40739i0.removeView(sn0Var);
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            un0 un0Var = this.f40175a;
            if (i10 < un0Var.f40739i0.getChildCount()) {
                sn0 sn0Var = (sn0) un0Var.f40739i0.getChildAt(i10);
                int[] iArr = new int[2];
                sn0Var.f40181c.getLocationInWindow(iArr);
                kv0 kv0Var = new kv0();
                kv0Var.f37752b = iArr[0];
                kv0Var.f37753c = iArr[1];
                kv0Var.d = un0Var.f40739i0;
                ImageReceiver imageReceiver = sn0Var.f40181c.getImageReceiver();
                kv0Var.f37751a = imageReceiver;
                kv0Var.e = imageReceiver.getBitmapSafe();
                return kv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f40175a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
