package org.telegram.ui.web;

import ai.ea;
import android.webkit.WebView;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f43444a;
    public final Object f43445b;
    public final Object f43446c;
    public final Serializable d;
    public final Object f43447e;
    public final Object f43448f;

    public a0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43444a = i10;
        this.f43445b = obj;
        this.f43447e = webView;
        this.f43448f = obj2;
        this.d = str;
        this.f43446c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a0.run():void");
    }

    public a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43444a = i10;
        this.f43445b = obj;
        this.d = str;
        this.f43447e = serializable;
        this.f43448f = str2;
        this.f43446c = str3;
    }

    public a0(b1 b1Var, TLObject tLObject, ea eaVar, String str, String str2) {
        this.f43444a = 1;
        this.f43445b = b1Var;
        this.f43446c = tLObject;
        this.f43447e = eaVar;
        this.d = str;
        this.f43448f = str2;
    }

    public a0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43444a = 3;
        this.f43445b = b1Var;
        this.f43446c = tLObject;
        this.d = strArr;
        this.f43447e = tL_error;
        this.f43448f = a2Var;
    }

    public a0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43444a = 0;
        this.f43445b = b1Var;
        this.f43447e = tL_error;
        this.d = str;
        this.f43448f = tL_inputInvoiceSlug;
        this.f43446c = tLObject;
    }
}
