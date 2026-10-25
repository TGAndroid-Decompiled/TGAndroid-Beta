package org.telegram.ui.web;

import android.webkit.WebView;
import di.x7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f45192a;
    public final Object f45193b;
    public final Object f45194c;
    public final Serializable d;
    public final Object e;
    public final Object f45195f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f45192a = i10;
        this.f45193b = obj;
        this.e = webView;
        this.f45195f = obj2;
        this.d = str;
        this.f45194c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f45192a = i10;
        this.f45193b = obj;
        this.d = str;
        this.e = serializable;
        this.f45195f = str2;
        this.f45194c = str3;
    }

    public b0(a1 a1Var, TLObject tLObject, x7 x7Var, String str, String str2) {
        this.f45192a = 1;
        this.f45193b = a1Var;
        this.f45194c = tLObject;
        this.e = x7Var;
        this.d = str;
        this.f45195f = str2;
    }

    public b0(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f45192a = 3;
        this.f45193b = a1Var;
        this.f45194c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f45195f = e2Var;
    }

    public b0(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f45192a = 0;
        this.f45193b = a1Var;
        this.e = tL_error;
        this.d = str;
        this.f45195f = tL_inputInvoiceSlug;
        this.f45194c = tLObject;
    }
}
