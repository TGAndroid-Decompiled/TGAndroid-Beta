package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class yh0 implements org.telegram.messenger.c20 {
    public final int[] f52239a;
    public final fi.d f52240b;
    public final fi.d f52241c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.v2 f52242e;
    public final boolean f52243f;
    public final String f52244g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f52245i;
    public final boolean f52246j;
    public final org.telegram.ui.web.x0 f52247k;
    public final String f52248l;
    public final org.telegram.ui.ActionBar.f6 f52249m;

    public yh0(int[] iArr, fi.d dVar, fi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.x0 x0Var, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f52239a = iArr;
        this.f52240b = dVar;
        this.f52241c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f52242e = v2Var;
        this.f52243f = z9;
        this.f52244g = str;
        this.h = urlAuthResult;
        this.f52245i = strArr;
        this.f52246j = z10;
        this.f52247k = x0Var;
        this.f52248l = str2;
        this.f52249m = f6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f52239a;
        fi.d dVar = this.f52240b;
        fi.d dVar2 = this.f52241c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.v2 v2Var = this.f52242e;
        final boolean z9 = this.f52243f;
        final String str = this.f52244g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f52245i;
        final boolean z10 = this.f52246j;
        final org.telegram.ui.web.x0 x0Var = this.f52247k;
        final String str2 = this.f52248l;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f52249m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f25563b, null);
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
