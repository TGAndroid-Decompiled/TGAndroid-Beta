package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f38719a;
    public final Object f38720b;
    public final Object f38721c;
    public final Serializable d;
    public final Object e;
    public final Object f38722f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f38719a = i10;
        this.f38720b = obj;
        this.e = webView;
        this.f38722f = obj2;
        this.d = str;
        this.f38721c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f38719a = i10;
        this.f38720b = obj;
        this.d = str;
        this.e = serializable;
        this.f38722f = str2;
        this.f38721c = str3;
    }

    public b0(d1 d1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f38719a = 1;
        this.f38720b = d1Var;
        this.f38721c = tLObject;
        this.e = daVar;
        this.d = str;
        this.f38722f = str2;
    }

    public b0(d1 d1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38719a = 3;
        this.f38720b = d1Var;
        this.f38721c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f38722f = c2Var;
    }

    public b0(d1 d1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f38719a = 0;
        this.f38720b = d1Var;
        this.e = tL_error;
        this.d = str;
        this.f38722f = tL_inputInvoiceSlug;
        this.f38721c = tLObject;
    }
}
