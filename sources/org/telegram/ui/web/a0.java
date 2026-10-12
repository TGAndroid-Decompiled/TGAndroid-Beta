package org.telegram.ui.web;

import ai.ea;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f43165a;
    public final Object f43166b;
    public final Object f43167c;
    public final Serializable d;
    public final Object f43168e;
    public final Object f43169f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43165a = i10;
        this.f43166b = obj;
        this.f43168e = webView;
        this.f43169f = obj2;
        this.d = str;
        this.f43167c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43165a = i10;
        this.f43166b = obj;
        this.d = str;
        this.f43168e = serializable;
        this.f43169f = str2;
        this.f43167c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, ea eaVar, String str, String str2) {
        this.f43165a = 1;
        this.f43166b = b1Var;
        this.f43167c = tLObject;
        this.f43168e = eaVar;
        this.d = str;
        this.f43169f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43165a = 3;
        this.f43166b = b1Var;
        this.f43167c = tLObject;
        this.d = strArr;
        this.f43168e = tL_error;
        this.f43169f = a2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43165a = 0;
        this.f43166b = b1Var;
        this.f43168e = tL_error;
        this.d = str;
        this.f43169f = tL_inputInvoiceSlug;
        this.f43167c = tLObject;
    }
}
