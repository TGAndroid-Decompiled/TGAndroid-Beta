package rh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s61;
import org.telegram.ui.un;
public final class n1 implements Runnable {
    public final int f47230a = 1;
    public final e4 f47231b;
    public final TLObject f47232c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f47233f;
    public final long h;
    public final Object f47234n;

    public n1(e4 e4Var, TLObject tLObject, long j10, long j11, r20 r20Var, TLRPC.TL_error tL_error, long j12) {
        this.f47231b = e4Var;
        this.f47232c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f47234n = r20Var;
        this.f47233f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f47230a) {
            case 0:
                e4 e4Var = this.f47231b;
                TLObject tLObject = this.f47232c;
                long j10 = this.d;
                long j11 = this.e;
                long j12 = this.h;
                TLRPC.TL_error tL_error = this.f47233f;
                ((org.telegram.ui.ActionBar.x1) this.f47234n).c(400L);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        e4Var.dismiss();
                        e6.y(e4Var.f21584a, false).P(j10);
                        if (j10 >= 0) {
                            TLRPC.UserFull a2 = wp.r1(e4Var.f21584a).a2(j11);
                            if (a2 != null) {
                                int max = Math.max(0, a2.stargifts_count - 1);
                                a2.stargifts_count = max;
                                if (max <= 0) {
                                    a2.flags2 &= -257;
                                }
                            }
                            e6.y(e4Var.f21584a, false).O();
                            e6.y(e4Var.f21584a, false).S(true);
                            if (!(T instanceof h8)) {
                                h8 h8Var = new h8();
                                h8Var.whenFullyVisible(new bi.e(h8Var, j12, 21));
                                T.presentFragment(h8Var);
                                return;
                            }
                            cc.a0(T).I(2131624224, dd.L0(2131750230, null), dd.H(',', "Gift2Converted", (int) j12)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j10);
                        bundle.putBoolean("start_from_monetization", true);
                        s61 s61Var = new s61(bundle);
                        r.g(e4Var.f21584a).h(j10, true);
                        r.g(e4Var.f21584a).l(j10);
                        s61Var.whenFullyVisible(new bi.e(s61Var, j12, 22));
                        T.presentFragment(s61Var);
                        return;
                    } else if (tL_error != null) {
                        e4Var.k().t(dd.a0(null, null, 2131743903, tL_error.text), null).k(false);
                        return;
                    } else {
                        e4Var.k().t(dd.L0(2131743904, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                e4 e4Var2 = this.f47231b;
                TLObject tLObject2 = this.f47232c;
                long j13 = this.d;
                long j14 = this.e;
                r20 r20Var = (r20) this.f47234n;
                TLRPC.TL_error tL_error2 = this.f47233f;
                long j15 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    wp.r1(e4Var2.f21584a).V3(tL_payments_paymentResult.updates.users, false);
                    wp.r1(e4Var2.f21584a).P3(tL_payments_paymentResult.updates.chats, false);
                    e6.y(e4Var2.f21584a, false).S(false);
                    e6.y(e4Var2.f21584a, false).P(j13);
                    e6.y(e4Var2.f21584a, false).P(j14);
                    e6.y(e4Var2.f21584a, false).O();
                    r20Var.a(null);
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j13 >= 0 && j14 >= 0) {
                            un ma2 = un.ma(j13);
                            ma2.whenFullyVisible(new v1(e4Var2, ma2, j13, 1));
                            T2.presentFragment(ma2);
                        } else {
                            wb I = cc.a0(T2).I(2131624027, dd.L0(2131749906, null), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749907, e4Var2.z1(), org.telegram.messenger.o5.t(j13))));
                            I.f32211t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new y1(e4Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (wp.r1(e4Var2.f21584a).f19174k7) {
                        e4Var2.f46815c2.setLoading(false);
                        e6.c0(e4Var2.getContext(), e4Var2.I0);
                        return;
                    }
                    e6 y3 = e6.y(e4Var2.f21584a, false);
                    a3.h0 h0Var = new a3.h0(e4Var2, j15, j13, r20Var, 7);
                    y3.e = false;
                    y3.q(h0Var, false, true);
                    y3.e = true;
                    return;
                } else {
                    r20Var.a(tL_error2);
                    e4Var2.k().f0(tL_error2, false);
                    return;
                }
        }
    }

    public n1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f47231b = e4Var;
        this.f47234n = x1Var;
        this.f47232c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f47233f = tL_error;
    }
}
