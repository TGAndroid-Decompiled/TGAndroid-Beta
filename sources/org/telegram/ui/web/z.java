package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f39713a;
    public final Object f39714b;
    public final Object f39715c;
    public final Object d;
    public final Serializable e;
    public final Object f39716f;

    public z(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f39713a = i10;
        this.f39714b = obj;
        this.e = str;
        this.d = serializable;
        this.f39716f = str2;
        this.f39715c = str3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.z.run():void");
    }

    public z(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f39713a = 1;
        this.f39714b = a1Var;
        this.f39715c = tLObject;
        this.e = strArr;
        this.d = tL_error;
        this.f39716f = d2Var;
    }

    public z(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f39713a = 0;
        this.f39714b = a1Var;
        this.d = tL_error;
        this.e = str;
        this.f39716f = tL_inputInvoiceSlug;
        this.f39715c = tLObject;
    }

    public z(boolean[] zArr, WebView webView, a2 a2Var, String str, y1 y1Var) {
        this.f39713a = 4;
        this.f39714b = zArr;
        this.d = webView;
        this.f39716f = a2Var;
        this.e = str;
        this.f39715c = y1Var;
    }
}
