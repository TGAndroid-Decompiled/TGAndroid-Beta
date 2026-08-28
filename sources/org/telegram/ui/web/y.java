package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements Runnable {
    public final int f44065a;
    public final Object f44066b;
    public final Object f44067c;
    public final Object d;
    public final Serializable f44068e;
    public final Object f44069f;

    public y(Object obj, String str, Serializable serializable, String str2, String str3, int i9) {
        this.f44065a = i9;
        this.f44066b = obj;
        this.f44068e = str;
        this.d = serializable;
        this.f44069f = str2;
        this.f44067c = str3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.y.run():void");
    }

    public y(y0 y0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f44065a = 1;
        this.f44066b = y0Var;
        this.f44067c = tLObject;
        this.f44068e = strArr;
        this.d = tL_error;
        this.f44069f = c2Var;
    }

    public y(y0 y0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f44065a = 0;
        this.f44066b = y0Var;
        this.d = tL_error;
        this.f44068e = str;
        this.f44069f = tL_inputInvoiceSlug;
        this.f44067c = tLObject;
    }

    public y(boolean[] zArr, WebView webView, x1 x1Var, String str, v1 v1Var) {
        this.f44065a = 4;
        this.f44066b = zArr;
        this.d = webView;
        this.f44069f = x1Var;
        this.f44068e = str;
        this.f44067c = v1Var;
    }
}
