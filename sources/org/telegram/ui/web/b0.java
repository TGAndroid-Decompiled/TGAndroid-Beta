package org.telegram.ui.web;

import android.webkit.WebView;
import java.io.Serializable;
import nh.j7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f39374a;
    public final Object f39375b;
    public final Object f39376c;
    public final Serializable d;
    public final Object e;
    public final Object f39377f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f39374a = i10;
        this.f39375b = obj;
        this.e = webView;
        this.f39377f = obj2;
        this.d = str;
        this.f39376c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f39374a = i10;
        this.f39375b = obj;
        this.d = str;
        this.e = serializable;
        this.f39377f = str2;
        this.f39376c = str3;
    }

    public b0(c1 c1Var, TLObject tLObject, j7 j7Var, String str, String str2) {
        this.f39374a = 1;
        this.f39375b = c1Var;
        this.f39376c = tLObject;
        this.e = j7Var;
        this.d = str;
        this.f39377f = str2;
    }

    public b0(c1 c1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f39374a = 3;
        this.f39375b = c1Var;
        this.f39376c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f39377f = d2Var;
    }

    public b0(c1 c1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f39374a = 0;
        this.f39375b = c1Var;
        this.e = tL_error;
        this.d = str;
        this.f39377f = tL_inputInvoiceSlug;
        this.f39376c = tLObject;
    }
}
