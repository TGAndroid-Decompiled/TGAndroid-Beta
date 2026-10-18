package org.telegram.ui.web;

import android.webkit.WebView;
import ci.y7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f42560a;
    public final Object f42561b;
    public final Object f42562c;
    public final Serializable d;
    public final Object e;
    public final Object f42563f;

    public c0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42560a = i10;
        this.f42561b = obj;
        this.e = webView;
        this.f42563f = obj2;
        this.d = str;
        this.f42562c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.c0.run():void");
    }

    public c0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42560a = i10;
        this.f42561b = obj;
        this.d = str;
        this.e = serializable;
        this.f42563f = str2;
        this.f42562c = str3;
    }

    public c0(b1 b1Var, TLObject tLObject, y7 y7Var, String str, String str2) {
        this.f42560a = 1;
        this.f42561b = b1Var;
        this.f42562c = tLObject;
        this.e = y7Var;
        this.d = str;
        this.f42563f = str2;
    }

    public c0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42560a = 3;
        this.f42561b = b1Var;
        this.f42562c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f42563f = b2Var;
    }

    public c0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42560a = 0;
        this.f42561b = b1Var;
        this.e = tL_error;
        this.d = str;
        this.f42563f = tL_inputInvoiceSlug;
        this.f42562c = tLObject;
    }
}
