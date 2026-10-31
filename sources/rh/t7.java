package rh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mk;
import org.telegram.ui.un;
import org.telegram.ui.vl0;
import org.telegram.ui.w90;
public final class t7 extends ha implements us {
    public final ai.b P1;
    public final FrameLayout Q1;
    public final TLRPC.User R1;
    public final mg.w1 S1;
    public p51 T1;
    public boolean U1;

    public t7(Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.User user, mg.w1 w1Var) {
        super(context, null, false, false, p6Var);
        this.R1 = user;
        this.S1 = w1Var;
        this.f26672r1 = 0.2f;
        zs.f(this.f21583a).c(this, zs.f19714w3);
        zs.f(this.f21583a).c(this, zs.y3);
        O();
        tk0 tk0Var = this.f26666k1;
        int i10 = this.f21615t0;
        tk0Var.setPadding(i10, 0, i10, 0);
        this.f26666k1.setOnItemClickListener(new ag.y0(this, 13));
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f26666k1.setItemAnimator(jVar);
        w0(org.telegram.ui.ActionBar.t6.f21019i5);
        ai.b bVar = new ai.b(4, context, p6Var);
        this.P1 = bVar;
        ((TextView) bVar.f834c).setText(cd.L0(2131749616, null));
        p80 p80Var = (p80) bVar.d;
        p80Var.setText(TextUtils.concat(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749618, h20.k(user))), " ", org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.L0(2131749617, null).replace(' ', (char) 160), new Runnable(this) {
            public final t7 f47457b;

            {
                this.f47457b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k2 k2Var;
                int i11 = r2;
                t7 t7Var = this.f47457b;
                switch (i11) {
                    case 0:
                        jv0 jv0Var = new jv0(t7Var.getContext());
                        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(t7Var.f21598f1) && (k2Var = t7Var.f21598f1) != null) {
                            jv0Var.a0(k2Var);
                        }
                        jv0Var.show();
                        return;
                    default:
                        gf.f.r(t7Var.getContext(), cd.L0(2131744984, null));
                        return;
                }
            }
        }), true)));
        p80Var.setMaxWidth(vh.p2.a(p80Var.getText(), p80Var.getPaint()) + 1);
        this.l1.setTitle(O0());
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.r(user);
        ((g9) bVar.f833b).e(user, r8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q1 = frameLayout;
        p80 p80Var2 = new p80(context, p6Var);
        frameLayout.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f));
        p80Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.B6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var2.setText(org.telegram.messenger.i0.T2(cd.L0(2131744985, null), new Runnable(this) {
            public final t7 f47457b;

            {
                this.f47457b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k2 k2Var;
                int i11 = r2;
                t7 t7Var = this.f47457b;
                switch (i11) {
                    case 0:
                        jv0 jv0Var = new jv0(t7Var.getContext());
                        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(t7Var.f21598f1) && (k2Var = t7Var.f21598f1) != null) {
                            jv0Var.a0(k2Var);
                        }
                        jv0Var.show();
                        return;
                    default:
                        gf.f.r(t7Var.getContext(), cd.L0(2131744984, null));
                        return;
                }
            }
        }));
        p80Var2.setGravity(17);
        p80Var2.setMaxWidth(vh.p2.a(p80Var2.getText(), p80Var2.getPaint()));
        frameLayout.addView(p80Var2, w7.b6.e(-2, -1, 17));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, frameLayout, p6Var);
        this.f21586b.addView(new xz(getContext()), w7.b6.c(-1.0f, -1));
        p51 p51Var = this.T1;
        if (p51Var != null) {
            p51Var.O(false);
        }
    }

    public static void d1(t7 t7Var, a51 a51Var, long j10, Boolean bool, String str) {
        mg.w1 w1Var;
        if (t7Var.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (w1Var = t7Var.S1) != null) {
                w1Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            w90 w90Var = LaunchActivity.I1.f33391x0;
            if (T != null) {
                if (bool.booleanValue()) {
                    wb L = cc.a0(T).L(2131624223, cd.L0(2131745118, null), org.telegram.messenger.i0.W2(cd.G((int) a51Var.B, "StarsGiftSentPopupInfo", h20.k(t7Var.R1))), cd.L0(2131743578, null), new vl0(j10, 3));
                    L.f32135j = 5000;
                    L.k(true);
                    if (w90Var != null) {
                        w90Var.c(true);
                    }
                    e6.y(t7Var.f21583a, false).S(true);
                } else if (str != null) {
                    cc.a0(T).Q(2131624011, 36, cd.a0(null, null, 2131743903, str)).j();
                }
            }
        }
    }

    @Override
    public final void L() {
        super.L();
        zs.f(this.f21583a).n(this, zs.f19714w3);
        zs.f(this.f21583a).n(this, zs.y3);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.f26666k1, getContext(), this.f21583a, 0, true, new qh.d(this, 9), this.I0);
        this.T1 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        ai.b bVar = this.P1;
        if (bVar == null) {
            return null;
        }
        return ((TextView) bVar.f834c).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if ((i10 == zs.f19714w3 || i10 == zs.y3) && (p51Var = this.T1) != null) {
            p51Var.O(true);
        }
    }

    @Override
    public final void show() {
        mk mkVar;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q instanceof un) {
            un unVar = (un) Q;
            if (unVar.J9() && (mkVar = unVar.Z) != null) {
                mkVar.L();
            }
        }
        super.show();
    }
}
