package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f39072a;
    public final Object f39073b;
    public final Object f39074c;
    public final Serializable d;
    public final Object e;
    public final Object f39075f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f39072a = i10;
        this.f39073b = obj;
        this.e = webView;
        this.f39075f = obj2;
        this.d = str;
        this.f39074c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f39072a = i10;
        this.f39073b = obj;
        this.d = str;
        this.e = serializable;
        this.f39075f = str2;
        this.f39074c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f39072a = 1;
        this.f39073b = b1Var;
        this.f39074c = tLObject;
        this.e = daVar;
        this.d = str;
        this.f39075f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f39072a = 3;
        this.f39073b = b1Var;
        this.f39074c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f39075f = a2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f39072a = 0;
        this.f39073b = b1Var;
        this.e = tL_error;
        this.d = str;
        this.f39075f = tL_inputInvoiceSlug;
        this.f39074c = tLObject;
    }
}
