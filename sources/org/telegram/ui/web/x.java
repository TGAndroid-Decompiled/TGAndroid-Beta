package org.telegram.ui.web;

import android.webkit.WebView;
import fi.f7;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f53343a;
    public final Object f53344b;
    public final Object f53345c;
    public final Serializable d;
    public final Object f53346e;
    public final Object f53347f;

    public x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.f53343a = i7;
        this.f53344b = obj;
        this.f53346e = webView;
        this.f53347f = obj2;
        this.d = str;
        this.f53345c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x.run():void");
    }

    public x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.f53343a = i7;
        this.f53344b = obj;
        this.d = str;
        this.f53346e = serializable;
        this.f53347f = str2;
        this.f53345c = str3;
    }

    public x(v0 v0Var, TLObject tLObject, f7 f7Var, String str, String str2) {
        this.f53343a = 1;
        this.f53344b = v0Var;
        this.f53345c = tLObject;
        this.f53346e = f7Var;
        this.d = str;
        this.f53347f = str2;
    }

    public x(v0 v0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f53343a = 3;
        this.f53344b = v0Var;
        this.f53345c = tLObject;
        this.d = strArr;
        this.f53346e = tL_error;
        this.f53347f = u1Var;
    }

    public x(v0 v0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f53343a = 0;
        this.f53344b = v0Var;
        this.f53346e = tL_error;
        this.d = str;
        this.f53347f = tL_inputInvoiceSlug;
        this.f53345c = tLObject;
    }
}
