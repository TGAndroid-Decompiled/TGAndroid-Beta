package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f43970a;
    public final Object f43971b;
    public final Object f43972c;
    public final Object d;
    public final Serializable f43973e;
    public final Object f43974f;

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43970a = i10;
        this.f43971b = obj;
        this.f43973e = str;
        this.d = serializable;
        this.f43974f = str2;
        this.f43972c = str3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(z0 z0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f43970a = 1;
        this.f43971b = z0Var;
        this.f43972c = tLObject;
        this.f43973e = strArr;
        this.d = tL_error;
        this.f43974f = c2Var;
    }

    public a0(z0 z0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43970a = 0;
        this.f43971b = z0Var;
        this.d = tL_error;
        this.f43973e = str;
        this.f43974f = tL_inputInvoiceSlug;
        this.f43972c = tLObject;
    }

    public a0(boolean[] zArr, WebView webView, z1 z1Var, String str, x1 x1Var) {
        this.f43970a = 4;
        this.f43971b = zArr;
        this.d = webView;
        this.f43974f = z1Var;
        this.f43973e = str;
        this.f43972c = x1Var;
    }
}
