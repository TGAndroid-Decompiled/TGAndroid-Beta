package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f42782a;
    public final Object f42783b;
    public final Object f42784c;
    public final Object d;
    public final Serializable f42785e;
    public final Object f42786f;

    public z(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42782a = i10;
        this.f42783b = obj;
        this.f42785e = str;
        this.d = serializable;
        this.f42786f = str2;
        this.f42784c = str3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.z.run():void");
    }

    public z(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f42782a = 1;
        this.f42783b = a1Var;
        this.f42784c = tLObject;
        this.f42785e = strArr;
        this.d = tL_error;
        this.f42786f = d2Var;
    }

    public z(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42782a = 0;
        this.f42783b = a1Var;
        this.d = tL_error;
        this.f42785e = str;
        this.f42786f = tL_inputInvoiceSlug;
        this.f42784c = tLObject;
    }

    public z(boolean[] zArr, WebView webView, b2 b2Var, String str, z1 z1Var) {
        this.f42782a = 4;
        this.f42783b = zArr;
        this.d = webView;
        this.f42786f = b2Var;
        this.f42785e = str;
        this.f42784c = z1Var;
    }
}
