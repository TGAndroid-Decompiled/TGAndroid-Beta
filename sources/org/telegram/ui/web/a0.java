package org.telegram.ui.web;

import ai.da;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f38968a;
    public final Object f38969b;
    public final Object f38970c;
    public final Serializable d;
    public final Object e;
    public final Object f38971f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f38968a = i10;
        this.f38969b = obj;
        this.e = webView;
        this.f38971f = obj2;
        this.d = str;
        this.f38970c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f38968a = i10;
        this.f38969b = obj;
        this.d = str;
        this.e = serializable;
        this.f38971f = str2;
        this.f38970c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.f38968a = 1;
        this.f38969b = b1Var;
        this.f38970c = tLObject;
        this.e = daVar;
        this.d = str;
        this.f38971f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f38968a = 3;
        this.f38969b = b1Var;
        this.f38970c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f38971f = a2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f38968a = 0;
        this.f38969b = b1Var;
        this.e = tL_error;
        this.d = str;
        this.f38971f = tL_inputInvoiceSlug;
        this.f38970c = tLObject;
    }
}
