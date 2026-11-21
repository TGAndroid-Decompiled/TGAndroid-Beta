package org.telegram.ui.web;

import android.webkit.WebView;
import fi.f7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f53386a;
    public final Object f53387b;
    public final Object f53388c;
    public final Serializable d;
    public final Object f53389e;
    public final Object f53390f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f53386a = i7;
        this.f53387b = obj;
        this.f53389e = webView;
        this.f53390f = obj2;
        this.d = str;
        this.f53388c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f53386a = i7;
        this.f53387b = obj;
        this.d = str;
        this.f53389e = serializable;
        this.f53390f = str2;
        this.f53388c = str3;
    }

    public x(v0 v0Var, TLObject tLObject, f7 f7Var, String str, String str2) {
        this.f53386a = 1;
        this.f53387b = v0Var;
        this.f53388c = tLObject;
        this.f53389e = f7Var;
        this.d = str;
        this.f53390f = str2;
    }

    public x(v0 v0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f53386a = 3;
        this.f53387b = v0Var;
        this.f53388c = tLObject;
        this.d = strArr;
        this.f53389e = tL_error;
        this.f53390f = t1Var;
    }

    public x(v0 v0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f53386a = 0;
        this.f53387b = v0Var;
        this.f53389e = tL_error;
        this.d = str;
        this.f53390f = tL_inputInvoiceSlug;
        this.f53388c = tLObject;
    }
}
