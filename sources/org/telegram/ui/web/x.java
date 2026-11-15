package org.telegram.ui.web;

import android.webkit.WebView;
import fi.i7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f52860a;
    public final Object f52861b;
    public final Object f52862c;
    public final Serializable d;
    public final Object f52863e;
    public final Object f52864f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f52860a = i7;
        this.f52861b = obj;
        this.f52863e = webView;
        this.f52864f = obj2;
        this.d = str;
        this.f52862c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f52860a = i7;
        this.f52861b = obj;
        this.d = str;
        this.f52863e = serializable;
        this.f52864f = str2;
        this.f52862c = str3;
    }

    public x(v0 v0Var, TLObject tLObject, i7 i7Var, String str, String str2) {
        this.f52860a = 1;
        this.f52861b = v0Var;
        this.f52862c = tLObject;
        this.f52863e = i7Var;
        this.d = str;
        this.f52864f = str2;
    }

    public x(v0 v0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f52860a = 3;
        this.f52861b = v0Var;
        this.f52862c = tLObject;
        this.d = strArr;
        this.f52863e = tL_error;
        this.f52864f = t1Var;
    }

    public x(v0 v0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f52860a = 0;
        this.f52861b = v0Var;
        this.f52863e = tL_error;
        this.d = str;
        this.f52864f = tL_inputInvoiceSlug;
        this.f52862c = tLObject;
    }
}
