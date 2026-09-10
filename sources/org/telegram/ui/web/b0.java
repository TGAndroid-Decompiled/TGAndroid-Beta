package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f37865a;
    public final Object f37866b;
    public final Object f37867c;
    public final Serializable d;
    public final Object e;
    public final Object f37868f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f37865a = i10;
        this.f37866b = obj;
        this.e = webView;
        this.f37868f = obj2;
        this.d = str;
        this.f37867c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f37865a = i10;
        this.f37866b = obj;
        this.d = str;
        this.e = serializable;
        this.f37868f = str2;
        this.f37867c = str3;
    }

    public b0(c1 c1Var, TLObject tLObject, a1 a1Var, String str, String str2) {
        this.f37865a = 1;
        this.f37866b = c1Var;
        this.f37867c = tLObject;
        this.e = a1Var;
        this.d = str;
        this.f37868f = str2;
    }

    public b0(c1 c1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f37865a = 3;
        this.f37866b = c1Var;
        this.f37867c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f37868f = d2Var;
    }

    public b0(c1 c1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f37865a = 0;
        this.f37866b = c1Var;
        this.e = tL_error;
        this.d = str;
        this.f37868f = tL_inputInvoiceSlug;
        this.f37867c = tLObject;
    }
}
