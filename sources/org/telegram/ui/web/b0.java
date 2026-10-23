package org.telegram.ui.web;

import android.webkit.WebView;
import ci.z7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f42606a;
    public final Object f42607b;
    public final Object f42608c;
    public final Serializable d;
    public final Object e;
    public final Object f42609f;

    public b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.f42606a = i10;
        this.f42607b = obj;
        this.e = webView;
        this.f42609f = obj2;
        this.d = str;
        this.f42608c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b0.run():void");
    }

    public b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f42606a = i10;
        this.f42607b = obj;
        this.d = str;
        this.e = serializable;
        this.f42609f = str2;
        this.f42608c = str3;
    }

    public b0(a1 a1Var, TLObject tLObject, z7 z7Var, String str, String str2) {
        this.f42606a = 1;
        this.f42607b = a1Var;
        this.f42608c = tLObject;
        this.e = z7Var;
        this.d = str;
        this.f42609f = str2;
    }

    public b0(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42606a = 3;
        this.f42607b = a1Var;
        this.f42608c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f42609f = b2Var;
    }

    public b0(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f42606a = 0;
        this.f42607b = a1Var;
        this.e = tL_error;
        this.d = str;
        this.f42609f = tL_inputInvoiceSlug;
        this.f42608c = tLObject;
    }
}
