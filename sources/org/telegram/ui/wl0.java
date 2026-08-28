package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class wl0 extends rt0 {
    public final wm0 f44147a;

    public wl0(wm0 wm0Var) {
        this.f44147a = wm0Var;
    }

    @Override
    public final void B(int i9) {
        SecureDocument secureDocument;
        wm0 wm0Var = this.f44147a;
        int i10 = wm0Var.O0;
        if (i10 == 1) {
            secureDocument = wm0Var.f44164f1;
        } else if (i10 == 4) {
            secureDocument = (SecureDocument) wm0Var.f44166g1.get(i9);
        } else if (i10 == 2) {
            secureDocument = wm0Var.f44168h1;
        } else if (i10 == 3) {
            secureDocument = wm0Var.f44170i1;
        } else {
            secureDocument = (SecureDocument) wm0Var.f44161e1.get(i9);
        }
        um0 um0Var = (um0) wm0Var.f44172j1.remove(secureDocument);
        if (um0Var == null) {
            return;
        }
        String n12 = wm0.n1(secureDocument);
        int i11 = wm0Var.O0;
        String str = null;
        if (i11 == 1) {
            wm0Var.f44164f1 = null;
            str = ta.b.d("selfie", n12);
        } else if (i11 == 4) {
            str = ta.b.d("translation", n12);
        } else if (i11 == 2) {
            wm0Var.f44168h1 = null;
            str = ta.b.d("front", n12);
        } else if (i11 == 3) {
            wm0Var.f44170i1 = null;
            str = ta.b.d("reverse", n12);
        } else if (i11 == 0) {
            str = ta.b.d("files", n12);
        }
        if (str != null) {
            HashMap hashMap = wm0Var.f44193t1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = wm0Var.f44195u1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        wm0Var.S1(wm0Var.O0);
        wm0Var.f44160e0.removeView(um0Var);
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        if (i9 >= 0) {
            wm0 wm0Var = this.f44147a;
            if (i9 < wm0Var.f44160e0.getChildCount()) {
                um0 um0Var = (um0) wm0Var.f44160e0.getChildAt(i9);
                int[] iArr = new int[2];
                um0Var.f43270c.getLocationInWindow(iArr);
                bu0 bu0Var = new bu0();
                bu0Var.f36979b = iArr[0];
                bu0Var.f36980c = iArr[1];
                bu0Var.d = wm0Var.f44160e0;
                ImageReceiver imageReceiver = um0Var.f43270c.getImageReceiver();
                bu0Var.f36978a = imageReceiver;
                bu0Var.f36981e = imageReceiver.getBitmapSafe();
                return bu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f44147a.O0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
