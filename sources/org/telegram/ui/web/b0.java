package org.telegram.ui.web;

import android.webkit.WebView;
import ci.y7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f43028a;
    public final Object f43029b;
    public final Object f43030c;
    public final Serializable d;
    public final Object e;
    public final Object f43031f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f43028a = i10;
        this.f43029b = obj;
        this.e = webView;
        this.f43031f = obj2;
        this.d = str;
        this.f43030c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f43028a = i10;
        this.f43029b = obj;
        this.d = str;
        this.e = serializable;
        this.f43031f = str2;
        this.f43030c = str3;
    }

    public b0(b1 b1Var, TLObject tLObject, y7 y7Var, String str, String str2) {
        this.f43028a = 1;
        this.f43029b = b1Var;
        this.f43030c = tLObject;
        this.e = y7Var;
        this.d = str;
        this.f43031f = str2;
    }

    public b0(b1 b1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f43028a = 3;
        this.f43029b = b1Var;
        this.f43030c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f43031f = c2Var;
    }

    public b0(b1 b1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f43028a = 0;
        this.f43029b = b1Var;
        this.e = tL_error;
        this.d = str;
        this.f43031f = tL_inputInvoiceSlug;
        this.f43030c = tLObject;
    }
}
