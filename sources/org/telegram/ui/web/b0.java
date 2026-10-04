package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f42111a;
    public final Object f42112b;
    public final Object f42113c;
    public final Serializable d;
    public final Object f42114e;
    public final Object f42115f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42111a = i10;
        this.f42112b = obj;
        this.f42114e = webView;
        this.f42115f = obj2;
        this.d = str;
        this.f42113c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42111a = i10;
        this.f42112b = obj;
        this.d = str;
        this.f42114e = serializable;
        this.f42115f = str2;
        this.f42113c = str3;
    }

    public b0(c1 c1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f42111a = 1;
        this.f42112b = c1Var;
        this.f42113c = tLObject;
        this.f42114e = daVar;
        this.d = str;
        this.f42115f = str2;
    }

    public b0(c1 c1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42111a = 3;
        this.f42112b = c1Var;
        this.f42113c = tLObject;
        this.d = strArr;
        this.f42114e = tL_error;
        this.f42115f = b2Var;
    }

    public b0(c1 c1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42111a = 0;
        this.f42112b = c1Var;
        this.f42114e = tL_error;
        this.d = str;
        this.f42115f = tL_inputInvoiceSlug;
        this.f42113c = tLObject;
    }
}
