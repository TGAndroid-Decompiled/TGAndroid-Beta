package org.telegram.ui.web;

import android.webkit.WebView;
import bi.k9;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f42021a;
    public final Object f42022b;
    public final Object f42023c;
    public final Serializable d;
    public final Object f42024e;
    public final Object f42025f;

    public c0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42021a = i10;
        this.f42022b = obj;
        this.f42024e = webView;
        this.f42025f = obj2;
        this.d = str;
        this.f42023c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.c0.run():void");
    }

    public c0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42021a = i10;
        this.f42022b = obj;
        this.d = str;
        this.f42024e = serializable;
        this.f42025f = str2;
        this.f42023c = str3;
    }

    public c0(d1 d1Var, TLObject tLObject, k9 k9Var, String str, String str2) {
        this.f42021a = 1;
        this.f42022b = d1Var;
        this.f42023c = tLObject;
        this.f42024e = k9Var;
        this.d = str;
        this.f42025f = str2;
    }

    public c0(d1 d1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42021a = 3;
        this.f42022b = d1Var;
        this.f42023c = tLObject;
        this.d = strArr;
        this.f42024e = tL_error;
        this.f42025f = b2Var;
    }

    public c0(d1 d1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42021a = 0;
        this.f42022b = d1Var;
        this.f42024e = tL_error;
        this.d = str;
        this.f42025f = tL_inputInvoiceSlug;
        this.f42023c = tLObject;
    }
}
