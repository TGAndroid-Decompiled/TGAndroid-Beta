package org.telegram.ui.web;

import android.webkit.WebView;
import bi.n9;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f41269a;
    public final Object f41270b;
    public final Object f41271c;
    public final Serializable d;
    public final Object e;
    public final Object f41272f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f41269a = i10;
        this.f41270b = obj;
        this.e = webView;
        this.f41272f = obj2;
        this.d = str;
        this.f41271c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f41269a = i10;
        this.f41270b = obj;
        this.d = str;
        this.e = serializable;
        this.f41272f = str2;
        this.f41271c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, n9 n9Var, String str, String str2) {
        this.f41269a = 1;
        this.f41270b = b1Var;
        this.f41271c = tLObject;
        this.e = n9Var;
        this.d = str;
        this.f41272f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f41269a = 3;
        this.f41270b = b1Var;
        this.f41271c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f41272f = a2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f41269a = 0;
        this.f41270b = b1Var;
        this.e = tL_error;
        this.d = str;
        this.f41272f = tL_inputInvoiceSlug;
        this.f41271c = tLObject;
    }
}
