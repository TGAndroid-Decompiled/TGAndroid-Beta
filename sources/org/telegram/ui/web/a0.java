package org.telegram.ui.web;

import ai.ea;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f43410a;
    public final Object f43411b;
    public final Object f43412c;
    public final Serializable d;
    public final Object f43413e;
    public final Object f43414f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43410a = i10;
        this.f43411b = obj;
        this.f43413e = webView;
        this.f43414f = obj2;
        this.d = str;
        this.f43412c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43410a = i10;
        this.f43411b = obj;
        this.d = str;
        this.f43413e = serializable;
        this.f43414f = str2;
        this.f43412c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, ea eaVar, String str, String str2) {
        this.f43410a = 1;
        this.f43411b = b1Var;
        this.f43412c = tLObject;
        this.f43413e = eaVar;
        this.d = str;
        this.f43414f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43410a = 3;
        this.f43411b = b1Var;
        this.f43412c = tLObject;
        this.d = strArr;
        this.f43413e = tL_error;
        this.f43414f = a2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43410a = 0;
        this.f43411b = b1Var;
        this.f43413e = tL_error;
        this.d = str;
        this.f43414f = tL_inputInvoiceSlug;
        this.f43412c = tLObject;
    }
}
