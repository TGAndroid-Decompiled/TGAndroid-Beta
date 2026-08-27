package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

public final class xl0 extends st0 {

    public final xm0 f44478a;

    public xl0(xm0 xm0Var) {
        this.f44478a = xm0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        xm0 xm0Var = this.f44478a;
        int i11 = xm0Var.O0;
        if (i11 == 1) {
            secureDocument = xm0Var.f44495f1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) xm0Var.f44497g1.get(i10);
        } else if (i11 == 2) {
            secureDocument = xm0Var.f44499h1;
        } else {
            secureDocument = i11 == 3 ? xm0Var.f44501i1 : (SecureDocument) xm0Var.f44492e1.get(i10);
        }
        vm0 vm0Var = (vm0) xm0Var.f44503j1.remove(secureDocument);
        if (vm0Var == null) {
            return;
        }
        String strN1 = xm0.n1(secureDocument);
        int i12 = xm0Var.O0;
        String strE = null;
        if (i12 == 1) {
            xm0Var.f44495f1 = null;
            strE = s3.c.e("selfie", strN1);
        } else if (i12 == 4) {
            strE = s3.c.e("translation", strN1);
        } else if (i12 == 2) {
            xm0Var.f44499h1 = null;
            strE = s3.c.e("front", strN1);
        } else if (i12 == 3) {
            xm0Var.f44501i1 = null;
            strE = s3.c.e("reverse", strN1);
        } else if (i12 == 0) {
            strE = s3.c.e("files", strN1);
        }
        if (strE != null) {
            HashMap map = xm0Var.f44524t1;
            if (map != null) {
                map.remove(strE);
            }
            HashMap map2 = xm0Var.f44526u1;
            if (map2 != null) {
                map2.remove(strE);
            }
        }
        xm0Var.S1(xm0Var.O0);
        xm0Var.f44491e0.removeView(vm0Var);
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        xm0 xm0Var = this.f44478a;
        if (i10 >= xm0Var.f44491e0.getChildCount()) {
            return null;
        }
        vm0 vm0Var = (vm0) xm0Var.f44491e0.getChildAt(i10);
        int[] iArr = new int[2];
        vm0Var.f43487c.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = xm0Var.f44491e0;
        ImageReceiver imageReceiver = vm0Var.f43487c.getImageReceiver();
        cu0Var.f37153a = imageReceiver;
        cu0Var.f37156e = imageReceiver.getBitmapSafe();
        return cu0Var;
    }

    @Override
    public final String a0() {
        return this.f44478a.O0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
