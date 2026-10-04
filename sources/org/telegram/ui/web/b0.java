package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f42103a;
    public final Object f42104b;
    public final Object f42105c;
    public final Serializable d;
    public final Object f42106e;
    public final Object f42107f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42103a = i10;
        this.f42104b = obj;
        this.f42106e = webView;
        this.f42107f = obj2;
        this.d = str;
        this.f42105c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42103a = i10;
        this.f42104b = obj;
        this.d = str;
        this.f42106e = serializable;
        this.f42107f = str2;
        this.f42105c = str3;
    }

    public b0(c1 c1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f42103a = 1;
        this.f42104b = c1Var;
        this.f42105c = tLObject;
        this.f42106e = daVar;
        this.d = str;
        this.f42107f = str2;
    }

    public b0(c1 c1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42103a = 3;
        this.f42104b = c1Var;
        this.f42105c = tLObject;
        this.d = strArr;
        this.f42106e = tL_error;
        this.f42107f = b2Var;
    }

    public b0(c1 c1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42103a = 0;
        this.f42104b = c1Var;
        this.f42106e = tL_error;
        this.d = str;
        this.f42107f = tL_inputInvoiceSlug;
        this.f42105c = tLObject;
    }
}
