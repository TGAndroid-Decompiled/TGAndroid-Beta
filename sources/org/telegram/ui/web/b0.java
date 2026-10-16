package org.telegram.ui.web;

import android.webkit.WebView;
import bi.n9;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f40970a;
    public final Object f40971b;
    public final Object f40972c;
    public final Serializable d;
    public final Object e;
    public final Object f40973f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f40970a = i10;
        this.f40971b = obj;
        this.e = webView;
        this.f40973f = obj2;
        this.d = str;
        this.f40972c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f40970a = i10;
        this.f40971b = obj;
        this.d = str;
        this.e = serializable;
        this.f40973f = str2;
        this.f40972c = str3;
    }

    public b0(c1 c1Var, TLObject tLObject, n9 n9Var, String str, String str2) {
        this.f40970a = 1;
        this.f40971b = c1Var;
        this.f40972c = tLObject;
        this.e = n9Var;
        this.d = str;
        this.f40973f = str2;
    }

    public b0(c1 c1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f40970a = 3;
        this.f40971b = c1Var;
        this.f40972c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f40973f = a2Var;
    }

    public b0(c1 c1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f40970a = 0;
        this.f40971b = c1Var;
        this.e = tL_error;
        this.d = str;
        this.f40973f = tL_inputInvoiceSlug;
        this.f40972c = tLObject;
    }
}
