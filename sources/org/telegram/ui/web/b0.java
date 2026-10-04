package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f42104a;
    public final Object f42105b;
    public final Object f42106c;
    public final Serializable d;
    public final Object f42107e;
    public final Object f42108f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42104a = i10;
        this.f42105b = obj;
        this.f42107e = webView;
        this.f42108f = obj2;
        this.d = str;
        this.f42106c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42104a = i10;
        this.f42105b = obj;
        this.d = str;
        this.f42107e = serializable;
        this.f42108f = str2;
        this.f42106c = str3;
    }

    public b0(c1 c1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f42104a = 1;
        this.f42105b = c1Var;
        this.f42106c = tLObject;
        this.f42107e = daVar;
        this.d = str;
        this.f42108f = str2;
    }

    public b0(c1 c1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42104a = 3;
        this.f42105b = c1Var;
        this.f42106c = tLObject;
        this.d = strArr;
        this.f42107e = tL_error;
        this.f42108f = b2Var;
    }

    public b0(c1 c1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42104a = 0;
        this.f42105b = c1Var;
        this.f42107e = tL_error;
        this.d = str;
        this.f42108f = tL_inputInvoiceSlug;
        this.f42106c = tLObject;
    }
}
