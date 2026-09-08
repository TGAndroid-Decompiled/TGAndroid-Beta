package org.telegram.ui.web;

import android.webkit.WebView;
import bi.k9;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f42048a;
    public final Object f42049b;
    public final Object f42050c;
    public final Serializable d;
    public final Object f42051e;
    public final Object f42052f;

    public c0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42048a = i10;
        this.f42049b = obj;
        this.f42051e = webView;
        this.f42052f = obj2;
        this.d = str;
        this.f42050c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.c0.run():void");
    }

    public c0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42048a = i10;
        this.f42049b = obj;
        this.d = str;
        this.f42051e = serializable;
        this.f42052f = str2;
        this.f42050c = str3;
    }

    public c0(d1 d1Var, TLObject tLObject, k9 k9Var, String str, String str2) {
        this.f42048a = 1;
        this.f42049b = d1Var;
        this.f42050c = tLObject;
        this.f42051e = k9Var;
        this.d = str;
        this.f42052f = str2;
    }

    public c0(d1 d1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42048a = 3;
        this.f42049b = d1Var;
        this.f42050c = tLObject;
        this.d = strArr;
        this.f42051e = tL_error;
        this.f42052f = b2Var;
    }

    public c0(d1 d1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42048a = 0;
        this.f42049b = d1Var;
        this.f42051e = tL_error;
        this.d = str;
        this.f42052f = tL_inputInvoiceSlug;
        this.f42050c = tLObject;
    }
}
