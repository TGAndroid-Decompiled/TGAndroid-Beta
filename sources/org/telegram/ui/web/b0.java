package org.telegram.ui.web;

import android.webkit.WebView;
import di.x7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f44706a;
    public final Object f44707b;
    public final Object f44708c;
    public final Serializable d;
    public final Object e;
    public final Object f44709f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f44706a = i10;
        this.f44707b = obj;
        this.e = webView;
        this.f44709f = obj2;
        this.d = str;
        this.f44708c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f44706a = i10;
        this.f44707b = obj;
        this.d = str;
        this.e = serializable;
        this.f44709f = str2;
        this.f44708c = str3;
    }

    public b0(a1 a1Var, TLObject tLObject, x7 x7Var, String str, String str2) {
        this.f44706a = 1;
        this.f44707b = a1Var;
        this.f44708c = tLObject;
        this.e = x7Var;
        this.d = str;
        this.f44709f = str2;
    }

    public b0(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f44706a = 3;
        this.f44707b = a1Var;
        this.f44708c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f44709f = e2Var;
    }

    public b0(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f44706a = 0;
        this.f44707b = a1Var;
        this.e = tL_error;
        this.d = str;
        this.f44709f = tL_inputInvoiceSlug;
        this.f44708c = tLObject;
    }
}
