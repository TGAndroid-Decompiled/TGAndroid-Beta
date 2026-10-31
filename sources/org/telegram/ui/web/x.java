package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f43237a;
    public final Object f43238b;
    public final Object f43239c;
    public final Serializable d;
    public final Object e;
    public final Object f43240f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43237a = i10;
        this.f43238b = obj;
        this.e = webView;
        this.f43240f = obj2;
        this.d = str;
        this.f43239c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43237a = i10;
        this.f43238b = obj;
        this.d = str;
        this.e = serializable;
        this.f43240f = str2;
        this.f43239c = str3;
    }

    public x(z0 z0Var, TLObject tLObject, x0 x0Var, String str, String str2) {
        this.f43237a = 1;
        this.f43238b = z0Var;
        this.f43239c = tLObject;
        this.e = x0Var;
        this.d = str;
        this.f43240f = str2;
    }

    public x(z0 z0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f43237a = 3;
        this.f43238b = z0Var;
        this.f43239c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f43240f = x1Var;
    }

    public x(z0 z0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43237a = 0;
        this.f43238b = z0Var;
        this.e = tL_error;
        this.d = str;
        this.f43240f = tL_inputInvoiceSlug;
        this.f43239c = tLObject;
    }
}
