package org.telegram.ui.web;

import android.webkit.WebView;
import fi.f7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f53626a;
    public final Object f53627b;
    public final Object f53628c;
    public final Serializable d;
    public final Object f53629e;
    public final Object f53630f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f53626a = i7;
        this.f53627b = obj;
        this.f53629e = webView;
        this.f53630f = obj2;
        this.d = str;
        this.f53628c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f53626a = i7;
        this.f53627b = obj;
        this.d = str;
        this.f53629e = serializable;
        this.f53630f = str2;
        this.f53628c = str3;
    }

    public x(v0 v0Var, TLObject tLObject, f7 f7Var, String str, String str2) {
        this.f53626a = 1;
        this.f53627b = v0Var;
        this.f53628c = tLObject;
        this.f53629e = f7Var;
        this.d = str;
        this.f53630f = str2;
    }

    public x(v0 v0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f53626a = 3;
        this.f53627b = v0Var;
        this.f53628c = tLObject;
        this.d = strArr;
        this.f53629e = tL_error;
        this.f53630f = t1Var;
    }

    public x(v0 v0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f53626a = 0;
        this.f53627b = v0Var;
        this.f53629e = tL_error;
        this.d = str;
        this.f53630f = tL_inputInvoiceSlug;
        this.f53628c = tLObject;
    }
}
