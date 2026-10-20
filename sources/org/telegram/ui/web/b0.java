package org.telegram.ui.web;

import android.webkit.WebView;
import ci.z7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f42602a;
    public final Object f42603b;
    public final Object f42604c;
    public final Serializable d;
    public final Object e;
    public final Object f42605f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42602a = i10;
        this.f42603b = obj;
        this.e = webView;
        this.f42605f = obj2;
        this.d = str;
        this.f42604c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42602a = i10;
        this.f42603b = obj;
        this.d = str;
        this.e = serializable;
        this.f42605f = str2;
        this.f42604c = str3;
    }

    public b0(a1 a1Var, TLObject tLObject, z7 z7Var, String str, String str2) {
        this.f42602a = 1;
        this.f42603b = a1Var;
        this.f42604c = tLObject;
        this.e = z7Var;
        this.d = str;
        this.f42605f = str2;
    }

    public b0(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42602a = 3;
        this.f42603b = a1Var;
        this.f42604c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f42605f = b2Var;
    }

    public b0(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42602a = 0;
        this.f42603b = a1Var;
        this.e = tL_error;
        this.d = str;
        this.f42605f = tL_inputInvoiceSlug;
        this.f42604c = tLObject;
    }
}
