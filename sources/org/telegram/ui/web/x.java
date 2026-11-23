package org.telegram.ui.web;

import android.webkit.WebView;
import fi.f7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f53354a;
    public final Object f53355b;
    public final Object f53356c;
    public final Serializable d;
    public final Object f53357e;
    public final Object f53358f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f53354a = i7;
        this.f53355b = obj;
        this.f53357e = webView;
        this.f53358f = obj2;
        this.d = str;
        this.f53356c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f53354a = i7;
        this.f53355b = obj;
        this.d = str;
        this.f53357e = serializable;
        this.f53358f = str2;
        this.f53356c = str3;
    }

    public x(v0 v0Var, TLObject tLObject, f7 f7Var, String str, String str2) {
        this.f53354a = 1;
        this.f53355b = v0Var;
        this.f53356c = tLObject;
        this.f53357e = f7Var;
        this.d = str;
        this.f53358f = str2;
    }

    public x(v0 v0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f53354a = 3;
        this.f53355b = v0Var;
        this.f53356c = tLObject;
        this.d = strArr;
        this.f53357e = tL_error;
        this.f53358f = t1Var;
    }

    public x(v0 v0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f53354a = 0;
        this.f53355b = v0Var;
        this.f53357e = tL_error;
        this.d = str;
        this.f53358f = tL_inputInvoiceSlug;
        this.f53356c = tLObject;
    }
}
