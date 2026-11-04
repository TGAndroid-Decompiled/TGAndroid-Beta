package org.telegram.ui.web;

import android.webkit.WebView;
import ei.p7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements Runnable {
    public final int f51106a;
    public final Object f51107b;
    public final Object f51108c;
    public final Serializable d;
    public final Object f51109e;
    public final Object f51110f;

    public y(Object obj, WebView webView, Object obj2, String str, Object obj3, int i3) {
        this.f51106a = i3;
        this.f51107b = obj;
        this.f51109e = webView;
        this.f51110f = obj2;
        this.d = str;
        this.f51108c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.y.run():void");
    }

    public y(Object obj, String str, Serializable serializable, String str2, String str3, int i3) {
        this.f51106a = i3;
        this.f51107b = obj;
        this.d = str;
        this.f51109e = serializable;
        this.f51110f = str2;
        this.f51108c = str3;
    }

    public y(w0 w0Var, TLObject tLObject, p7 p7Var, String str, String str2) {
        this.f51106a = 1;
        this.f51107b = w0Var;
        this.f51108c = tLObject;
        this.f51109e = p7Var;
        this.d = str;
        this.f51110f = str2;
    }

    public y(w0 w0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.s1 s1Var) {
        this.f51106a = 3;
        this.f51107b = w0Var;
        this.f51108c = tLObject;
        this.d = strArr;
        this.f51109e = tL_error;
        this.f51110f = s1Var;
    }

    public y(w0 w0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f51106a = 0;
        this.f51107b = w0Var;
        this.f51109e = tL_error;
        this.d = str;
        this.f51110f = tL_inputInvoiceSlug;
        this.f51108c = tLObject;
    }
}
