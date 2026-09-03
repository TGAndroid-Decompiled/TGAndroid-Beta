package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f42747a;
    public final Object f42748b;
    public final Object f42749c;
    public final Object d;
    public final Serializable f42750e;
    public final Object f42751f;

    public z(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42747a = i10;
        this.f42748b = obj;
        this.f42750e = str;
        this.d = serializable;
        this.f42751f = str2;
        this.f42749c = str3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.z.run():void");
    }

    public z(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f42747a = 1;
        this.f42748b = a1Var;
        this.f42749c = tLObject;
        this.f42750e = strArr;
        this.d = tL_error;
        this.f42751f = d2Var;
    }

    public z(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42747a = 0;
        this.f42748b = a1Var;
        this.d = tL_error;
        this.f42750e = str;
        this.f42751f = tL_inputInvoiceSlug;
        this.f42749c = tLObject;
    }

    public z(boolean[] zArr, WebView webView, b2 b2Var, String str, y1 y1Var) {
        this.f42747a = 4;
        this.f42748b = zArr;
        this.d = webView;
        this.f42751f = b2Var;
        this.f42750e = str;
        this.f42749c = y1Var;
    }
}
