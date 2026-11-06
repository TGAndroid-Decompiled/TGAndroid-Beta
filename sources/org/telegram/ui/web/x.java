package org.telegram.ui.web;

import android.webkit.WebView;
import di.o7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f51348a;
    public final Object f51349b;
    public final Object f51350c;
    public final Serializable d;
    public final Object f51351e;
    public final Object f51352f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f51348a = i7;
        this.f51349b = obj;
        this.f51351e = webView;
        this.f51352f = obj2;
        this.d = str;
        this.f51350c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f51348a = i7;
        this.f51349b = obj;
        this.d = str;
        this.f51351e = serializable;
        this.f51352f = str2;
        this.f51350c = str3;
    }

    public x(x0 x0Var, TLObject tLObject, o7 o7Var, String str, String str2) {
        this.f51348a = 1;
        this.f51349b = x0Var;
        this.f51350c = tLObject;
        this.f51351e = o7Var;
        this.d = str;
        this.f51352f = str2;
    }

    public x(x0 x0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f51348a = 3;
        this.f51349b = x0Var;
        this.f51350c = tLObject;
        this.d = strArr;
        this.f51351e = tL_error;
        this.f51352f = u1Var;
    }

    public x(x0 x0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f51348a = 0;
        this.f51349b = x0Var;
        this.f51351e = tL_error;
        this.d = str;
        this.f51352f = tL_inputInvoiceSlug;
        this.f51350c = tLObject;
    }
}
