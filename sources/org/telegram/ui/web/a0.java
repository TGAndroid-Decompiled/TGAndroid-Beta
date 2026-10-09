package org.telegram.ui.web;

import ai.ea;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f43218a;
    public final Object f43219b;
    public final Object f43220c;
    public final Serializable d;
    public final Object f43221e;
    public final Object f43222f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43218a = i10;
        this.f43219b = obj;
        this.f43221e = webView;
        this.f43222f = obj2;
        this.d = str;
        this.f43220c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43218a = i10;
        this.f43219b = obj;
        this.d = str;
        this.f43221e = serializable;
        this.f43222f = str2;
        this.f43220c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, ea eaVar, String str, String str2) {
        this.f43218a = 1;
        this.f43219b = b1Var;
        this.f43220c = tLObject;
        this.f43221e = eaVar;
        this.d = str;
        this.f43222f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f43218a = 3;
        this.f43219b = b1Var;
        this.f43220c = tLObject;
        this.d = strArr;
        this.f43221e = tL_error;
        this.f43222f = b2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43218a = 0;
        this.f43219b = b1Var;
        this.f43221e = tL_error;
        this.d = str;
        this.f43222f = tL_inputInvoiceSlug;
        this.f43220c = tLObject;
    }
}
