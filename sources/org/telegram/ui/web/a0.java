package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f38934a;
    public final Object f38935b;
    public final Object f38936c;
    public final Serializable d;
    public final Object e;
    public final Object f38937f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f38934a = i10;
        this.f38935b = obj;
        this.e = webView;
        this.f38937f = obj2;
        this.d = str;
        this.f38936c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f38934a = i10;
        this.f38935b = obj;
        this.d = str;
        this.e = serializable;
        this.f38937f = str2;
        this.f38936c = str3;
    }

    public a0(c1 c1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f38934a = 1;
        this.f38935b = c1Var;
        this.f38936c = tLObject;
        this.e = daVar;
        this.d = str;
        this.f38937f = str2;
    }

    public a0(c1 c1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38934a = 3;
        this.f38935b = c1Var;
        this.f38936c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f38937f = c2Var;
    }

    public a0(c1 c1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f38934a = 0;
        this.f38935b = c1Var;
        this.e = tL_error;
        this.d = str;
        this.f38937f = tL_inputInvoiceSlug;
        this.f38936c = tLObject;
    }
}
