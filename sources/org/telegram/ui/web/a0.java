package org.telegram.ui.web;

import ai.ea;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f43264a;
    public final Object f43265b;
    public final Object f43266c;
    public final Serializable d;
    public final Object f43267e;
    public final Object f43268f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43264a = i10;
        this.f43265b = obj;
        this.f43267e = webView;
        this.f43268f = obj2;
        this.d = str;
        this.f43266c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43264a = i10;
        this.f43265b = obj;
        this.d = str;
        this.f43267e = serializable;
        this.f43268f = str2;
        this.f43266c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, ea eaVar, String str, String str2) {
        this.f43264a = 1;
        this.f43265b = b1Var;
        this.f43266c = tLObject;
        this.f43267e = eaVar;
        this.d = str;
        this.f43268f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f43264a = 3;
        this.f43265b = b1Var;
        this.f43266c = tLObject;
        this.d = strArr;
        this.f43267e = tL_error;
        this.f43268f = b2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43264a = 0;
        this.f43265b = b1Var;
        this.f43267e = tL_error;
        this.d = str;
        this.f43268f = tL_inputInvoiceSlug;
        this.f43266c = tLObject;
    }
}
