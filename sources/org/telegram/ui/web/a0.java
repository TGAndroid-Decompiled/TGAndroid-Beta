package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f38616a;
    public final Object f38617b;
    public final Object f38618c;
    public final Serializable d;
    public final Object e;
    public final Object f38619f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f38616a = i10;
        this.f38617b = obj;
        this.e = webView;
        this.f38619f = obj2;
        this.d = str;
        this.f38618c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f38616a = i10;
        this.f38617b = obj;
        this.d = str;
        this.e = serializable;
        this.f38619f = str2;
        this.f38618c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f38616a = 1;
        this.f38617b = b1Var;
        this.f38618c = tLObject;
        this.e = daVar;
        this.d = str;
        this.f38619f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f38616a = 3;
        this.f38617b = b1Var;
        this.f38618c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f38619f = b2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f38616a = 0;
        this.f38617b = b1Var;
        this.e = tL_error;
        this.d = str;
        this.f38619f = tL_inputInvoiceSlug;
        this.f38618c = tLObject;
    }
}
