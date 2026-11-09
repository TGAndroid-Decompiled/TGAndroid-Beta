package org.telegram.ui.web;

import android.webkit.WebView;
import di.p7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f51336a;
    public final Object f51337b;
    public final Object f51338c;
    public final Serializable d;
    public final Object f51339e;
    public final Object f51340f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f51336a = i7;
        this.f51337b = obj;
        this.f51339e = webView;
        this.f51340f = obj2;
        this.d = str;
        this.f51338c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f51336a = i7;
        this.f51337b = obj;
        this.d = str;
        this.f51339e = serializable;
        this.f51340f = str2;
        this.f51338c = str3;
    }

    public x(x0 x0Var, TLObject tLObject, p7 p7Var, String str, String str2) {
        this.f51336a = 1;
        this.f51337b = x0Var;
        this.f51338c = tLObject;
        this.f51339e = p7Var;
        this.d = str;
        this.f51340f = str2;
    }

    public x(x0 x0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f51336a = 3;
        this.f51337b = x0Var;
        this.f51338c = tLObject;
        this.d = strArr;
        this.f51339e = tL_error;
        this.f51340f = u1Var;
    }

    public x(x0 x0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f51336a = 0;
        this.f51337b = x0Var;
        this.f51339e = tL_error;
        this.d = str;
        this.f51340f = tL_inputInvoiceSlug;
        this.f51338c = tLObject;
    }
}
