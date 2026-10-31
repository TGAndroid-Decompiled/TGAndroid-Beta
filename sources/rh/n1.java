package rh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u61;
import org.telegram.ui.un;
public final class n1 implements Runnable {
    public final int f47219a = 1;
    public final e4 f47220b;
    public final TLObject f47221c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47222f;
    public final long h;
    public final Object f47223n;

    public n1(e4 e4Var, TLObject tLObject, long j10, long j11, q20 q20Var, TLRPC.TL_error tL_error, long j12) {
        this.f47220b = e4Var;
        this.f47221c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f47223n = q20Var;
        this.f47222f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f47219a) {
            case 0:
                e4 e4Var = this.f47220b;
                TLObject tLObject = this.f47221c;
                long j10 = this.d;
                long j11 = this.e;
                long j12 = this.h;
                TLRPC.TL_error tL_error = this.f47222f;
                ((org.telegram.ui.ActionBar.x1) this.f47223n).c(400L);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        e4Var.dismiss();
                        e6.y(e4Var.f21583a, false).P(j10);
                        if (j10 >= 0) {
                            TLRPC.UserFull a2 = vp.r1(e4Var.f21583a).a2(j11);
                            if (a2 != null) {
                                int max = Math.max(0, a2.stargifts_count - 1);
                                a2.stargifts_count = max;
                                if (max <= 0) {
                                    a2.flags2 &= -257;
                                }
                            }
                            e6.y(e4Var.f21583a, false).O();
                            e6.y(e4Var.f21583a, false).S(true);
                            if (!(T instanceof h8)) {
                                h8 h8Var = new h8();
                                h8Var.whenFullyVisible(new bi.e(h8Var, j12, 21));
                                T.presentFragment(h8Var);
                                return;
                            }
                            cc.a0(T).I(2131624224, cd.L0(2131750230, null), cd.H(',', "Gift2Converted", (int) j12)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j10);
                        bundle.putBoolean("start_from_monetization", true);
                        u61 u61Var = new u61(bundle);
                        r.g(e4Var.f21583a).h(j10, true);
                        r.g(e4Var.f21583a).l(j10);
                        u61Var.whenFullyVisible(new bi.e(u61Var, j12, 22));
                        T.presentFragment(u61Var);
                        return;
                    } else if (tL_error != null) {
                        e4Var.k().t(cd.a0(null, null, 2131743903, tL_error.text), null).k(false);
                        return;
                    } else {
                        e4Var.k().t(cd.L0(2131743904, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                e4 e4Var2 = this.f47220b;
                TLObject tLObject2 = this.f47221c;
                long j13 = this.d;
                long j14 = this.e;
                q20 q20Var = (q20) this.f47223n;
                TLRPC.TL_error tL_error2 = this.f47222f;
                long j15 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    vp.r1(e4Var2.f21583a).V3(tL_payments_paymentResult.updates.users, false);
                    vp.r1(e4Var2.f21583a).P3(tL_payments_paymentResult.updates.chats, false);
                    e6.y(e4Var2.f21583a, false).S(false);
                    e6.y(e4Var2.f21583a, false).P(j13);
                    e6.y(e4Var2.f21583a, false).P(j14);
                    e6.y(e4Var2.f21583a, false).O();
                    q20Var.a(null);
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j13 >= 0 && j14 >= 0) {
                            un ha = un.ha(j13);
                            ha.whenFullyVisible(new v1(e4Var2, ha, j13, 1));
                            T2.presentFragment(ha);
                        } else {
                            wb I = cc.a0(T2).I(2131624027, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var2.z1(), org.telegram.messenger.o5.t(j13))));
                            I.f32145t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new y1(e4Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (vp.r1(e4Var2.f21583a).f18831k7) {
                        e4Var2.f46801c2.setLoading(false);
                        e6.c0(e4Var2.getContext(), e4Var2.I0);
                        return;
                    }
                    e6 y3 = e6.y(e4Var2.f21583a, false);
                    a3.h0 h0Var = new a3.h0(e4Var2, j15, j13, q20Var, 7);
                    y3.e = false;
                    y3.q(h0Var, false, true);
                    y3.e = true;
                    return;
                } else {
                    q20Var.a(tL_error2);
                    e4Var2.k().f0(tL_error2, false);
                    return;
                }
        }
    }

    public n1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f47220b = e4Var;
        this.f47223n = x1Var;
        this.f47221c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f47222f = tL_error;
    }
}
