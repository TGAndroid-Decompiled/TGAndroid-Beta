package org.telegram.ui.web;

import ai.ea;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f43163a;
    public final Object f43164b;
    public final Object f43165c;
    public final Serializable d;
    public final Object f43166e;
    public final Object f43167f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43163a = i10;
        this.f43164b = obj;
        this.f43166e = webView;
        this.f43167f = obj2;
        this.d = str;
        this.f43165c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43163a = i10;
        this.f43164b = obj;
        this.d = str;
        this.f43166e = serializable;
        this.f43167f = str2;
        this.f43165c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, ea eaVar, String str, String str2) {
        this.f43163a = 1;
        this.f43164b = b1Var;
        this.f43165c = tLObject;
        this.f43166e = eaVar;
        this.d = str;
        this.f43167f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43163a = 3;
        this.f43164b = b1Var;
        this.f43165c = tLObject;
        this.d = strArr;
        this.f43166e = tL_error;
        this.f43167f = a2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43163a = 0;
        this.f43164b = b1Var;
        this.f43166e = tL_error;
        this.d = str;
        this.f43167f = tL_inputInvoiceSlug;
        this.f43165c = tLObject;
    }
}
