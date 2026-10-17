package org.telegram.ui.web;

import android.webkit.WebView;
import ci.z7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f42510a;
    public final Object f42511b;
    public final Object f42512c;
    public final Serializable d;
    public final Object e;
    public final Object f42513f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42510a = i10;
        this.f42511b = obj;
        this.e = webView;
        this.f42513f = obj2;
        this.d = str;
        this.f42512c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42510a = i10;
        this.f42511b = obj;
        this.d = str;
        this.e = serializable;
        this.f42513f = str2;
        this.f42512c = str3;
    }

    public a0(a1 a1Var, TLObject tLObject, z7 z7Var, String str, String str2) {
        this.f42510a = 1;
        this.f42511b = a1Var;
        this.f42512c = tLObject;
        this.e = z7Var;
        this.d = str;
        this.f42513f = str2;
    }

    public a0(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42510a = 3;
        this.f42511b = a1Var;
        this.f42512c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f42513f = b2Var;
    }

    public a0(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42510a = 0;
        this.f42511b = a1Var;
        this.e = tL_error;
        this.d = str;
        this.f42513f = tL_inputInvoiceSlug;
        this.f42512c = tLObject;
    }
}
