package org.telegram.ui.web;

import android.webkit.WebView;
import bi.k9;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f42049a;
    public final Object f42050b;
    public final Object f42051c;
    public final Serializable d;
    public final Object f42052e;
    public final Object f42053f;

    public c0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42049a = i10;
        this.f42050b = obj;
        this.f42052e = webView;
        this.f42053f = obj2;
        this.d = str;
        this.f42051c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.c0.run():void");
    }

    public c0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42049a = i10;
        this.f42050b = obj;
        this.d = str;
        this.f42052e = serializable;
        this.f42053f = str2;
        this.f42051c = str3;
    }

    public c0(d1 d1Var, TLObject tLObject, k9 k9Var, String str, String str2) {
        this.f42049a = 1;
        this.f42050b = d1Var;
        this.f42051c = tLObject;
        this.f42052e = k9Var;
        this.d = str;
        this.f42053f = str2;
    }

    public c0(d1 d1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42049a = 3;
        this.f42050b = d1Var;
        this.f42051c = tLObject;
        this.d = strArr;
        this.f42052e = tL_error;
        this.f42053f = b2Var;
    }

    public c0(d1 d1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42049a = 0;
        this.f42050b = d1Var;
        this.f42052e = tL_error;
        this.d = str;
        this.f42053f = tL_inputInvoiceSlug;
        this.f42051c = tLObject;
    }
}
