package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class vh0 implements org.telegram.messenger.u10 {
    public final int[] f50527a;
    public final gi.d f50528b;
    public final gi.d f50529c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.t2 f50530e;
    public final boolean f50531f;
    public final String f50532g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f50533i;
    public final boolean f50534j;
    public final org.telegram.ui.web.w0 f50535k;
    public final String f50536l;
    public final org.telegram.ui.ActionBar.e6 f50537m;

    public vh0(int[] iArr, gi.d dVar, gi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.t2 t2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.w0 w0Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f50527a = iArr;
        this.f50528b = dVar;
        this.f50529c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.f50530e = t2Var;
        this.f50531f = z10;
        this.f50532g = str;
        this.h = urlAuthResult;
        this.f50533i = strArr;
        this.f50534j = z11;
        this.f50535k = w0Var;
        this.f50536l = str2;
        this.f50537m = e6Var;
    }

    @Override
    public final void a(Object obj) {
        int[] iArr = this.f50527a;
        gi.d dVar = this.f50528b;
        gi.d dVar2 = this.f50529c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.t2 t2Var = this.f50530e;
        final boolean z10 = this.f50531f;
        final String str = this.f50532g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f50533i;
        final boolean z11 = this.f50534j;
        final org.telegram.ui.web.w0 w0Var = this.f50535k;
        final String str2 = this.f50536l;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f50537m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.R && !dVar2.R) {
            final org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, org.telegram.messenger.t0.f25457b, null);
            s1Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new c3.b(1), new org.telegram.messenger.n10() {
                @Override
                public final void a(Object obj2, Object obj3) {
                    CharSequence P2;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.s1.this.dismiss();
                    org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                    if (urlAuthResult2 != null) {
                        t2Var2.dismiss();
                        yh0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, w0Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            t2Var2.dismiss();
                            org.telegram.ui.Components.fc a10 = yh0.a();
                            String M0 = org.telegram.messenger.bd.M0(2131753128, null);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                P2 = org.telegram.messenger.bd.M0(2131753129, null);
                            } else {
                                P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), org.telegram.messenger.bd.a0(null, null, 2131753130, str3));
                            }
                            a10.I(2131624011, M0, P2).j();
                            return;
                        }
                        org.telegram.ui.Cells.f1.v(t2Var2.F, t2Var2.J0, tL_error, false);
                    }
                }
            });
        }
    }
}
