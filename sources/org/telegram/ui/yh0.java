package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class yh0 implements org.telegram.messenger.c20 {
    public final int[] f52220a;
    public final fi.d f52221b;
    public final fi.d f52222c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.v2 f52223e;
    public final boolean f52224f;
    public final String f52225g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f52226i;
    public final boolean f52227j;
    public final org.telegram.ui.web.x0 f52228k;
    public final String f52229l;
    public final org.telegram.ui.ActionBar.f6 f52230m;

    public yh0(int[] iArr, fi.d dVar, fi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.x0 x0Var, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f52220a = iArr;
        this.f52221b = dVar;
        this.f52222c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f52223e = v2Var;
        this.f52224f = z9;
        this.f52225g = str;
        this.h = urlAuthResult;
        this.f52226i = strArr;
        this.f52227j = z10;
        this.f52228k = x0Var;
        this.f52229l = str2;
        this.f52230m = f6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f52220a;
        fi.d dVar = this.f52221b;
        fi.d dVar2 = this.f52222c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.v2 v2Var = this.f52223e;
        final boolean z9 = this.f52224f;
        final String str = this.f52225g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f52226i;
        final boolean z10 = this.f52227j;
        final org.telegram.ui.web.x0 x0Var = this.f52228k;
        final String str2 = this.f52229l;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f52230m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f25555b, null);
            u1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.v10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.u1.this.dismiss();
                    org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                    if (urlAuthResult2 != null) {
                        v2Var2.dismiss();
                        bi0.b(z9, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z10, x0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            v2Var2.dismiss();
                            org.telegram.ui.Components.hc a10 = bi0.a();
                            String M0 = org.telegram.messenger.hd.M0(2131753128, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.hd.M0(2131753129, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var), org.telegram.messenger.hd.a0(null, null, 2131753130, str3));
                            }
                            a10.I(2131624011, M0, P2).j();
                            return;
                        }
                        org.telegram.ui.Cells.f1.r(v2Var2.E, v2Var2.I0, tL_error, false);
                    }
                }
            });
        }
    }
}
