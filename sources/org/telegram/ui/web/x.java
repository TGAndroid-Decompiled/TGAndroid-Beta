package org.telegram.ui.web;

import android.webkit.WebView;
import fi.f7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f53390a;
    public final Object f53391b;
    public final Object f53392c;
    public final Serializable d;
    public final Object f53393e;
    public final Object f53394f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f53390a = i7;
        this.f53391b = obj;
        this.f53393e = webView;
        this.f53394f = obj2;
        this.d = str;
        this.f53392c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f53390a = i7;
        this.f53391b = obj;
        this.d = str;
        this.f53393e = serializable;
        this.f53394f = str2;
        this.f53392c = str3;
    }

    public x(v0 v0Var, TLObject tLObject, f7 f7Var, String str, String str2) {
        this.f53390a = 1;
        this.f53391b = v0Var;
        this.f53392c = tLObject;
        this.f53393e = f7Var;
        this.d = str;
        this.f53394f = str2;
    }

    public x(v0 v0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f53390a = 3;
        this.f53391b = v0Var;
        this.f53392c = tLObject;
        this.d = strArr;
        this.f53393e = tL_error;
        this.f53394f = t1Var;
    }

    public x(v0 v0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f53390a = 0;
        this.f53391b = v0Var;
        this.f53393e = tL_error;
        this.d = str;
        this.f53394f = tL_inputInvoiceSlug;
        this.f53392c = tLObject;
    }
}
