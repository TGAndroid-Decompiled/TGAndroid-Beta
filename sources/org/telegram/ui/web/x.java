package org.telegram.ui.web;

import android.webkit.WebView;
import di.p7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f51290a;
    public final Object f51291b;
    public final Object f51292c;
    public final Serializable d;
    public final Object f51293e;
    public final Object f51294f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f51290a = i7;
        this.f51291b = obj;
        this.f51293e = webView;
        this.f51294f = obj2;
        this.d = str;
        this.f51292c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f51290a = i7;
        this.f51291b = obj;
        this.d = str;
        this.f51293e = serializable;
        this.f51294f = str2;
        this.f51292c = str3;
    }

    public x(x0 x0Var, TLObject tLObject, p7 p7Var, String str, String str2) {
        this.f51290a = 1;
        this.f51291b = x0Var;
        this.f51292c = tLObject;
        this.f51293e = p7Var;
        this.d = str;
        this.f51294f = str2;
    }

    public x(x0 x0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f51290a = 3;
        this.f51291b = x0Var;
        this.f51292c = tLObject;
        this.d = strArr;
        this.f51293e = tL_error;
        this.f51294f = u1Var;
    }

    public x(x0 x0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f51290a = 0;
        this.f51291b = x0Var;
        this.f51293e = tL_error;
        this.d = str;
        this.f51294f = tL_inputInvoiceSlug;
        this.f51292c = tLObject;
    }
}
