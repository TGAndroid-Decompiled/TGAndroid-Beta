package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mk;
import org.telegram.ui.un;
public final class y7 extends ha implements vs {
    public final FrameLayout P1;
    public q51 Q1;
    public boolean R1;

    public y7(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, false, false, p6Var);
        uk0 uk0Var = this.f26724k1;
        int i10 = this.f21616t0;
        uk0Var.setPadding(i10, 0, i10, 0);
        this.f26724k1.setOnItemClickListener(new ag.y0(this, 15));
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f26724k1.setItemAnimator(jVar);
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        w0(i11);
        Q(i11);
        this.l1.setTitle(dd.L0(2131745169, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        p80 p80Var = new p80(context, p6Var);
        frameLayout.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f));
        p80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.B6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setText(org.telegram.messenger.i0.T2(dd.L0(2131744985, null), new ph.x1(this, 27)));
        p80Var.setGravity(17);
        p80Var.setMaxWidth(vh.p2.a(p80Var.getText(), p80Var.getPaint()));
        frameLayout.addView(p80Var, w7.b6.e(-2, -1, 17));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, frameLayout, p6Var);
        this.f21587b.addView(new xz(getContext()), w7.b6.c(-1.0f, -1));
        q51 q51Var = this.Q1;
        if (q51Var != null) {
            q51Var.O(false);
        }
    }

    @Override
    public final void L() {
        super.L();
        at.f(this.f21584a).n(this, at.f14803v3);
        at.f(this.f21584a).n(this, at.y3);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, true, new qh.d(this, 11), this.I0);
        this.Q1 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return dd.L0(2131745169, null);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        q51 q51Var;
        if ((i10 == at.f14803v3 || i10 == at.y3) && (q51Var = this.Q1) != null) {
            q51Var.O(true);
        }
    }

    @Override
    public final void show() {
        mk mkVar;
        long j10 = e6.y(this.f21584a, false).p().amount;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q instanceof un) {
            un unVar = (un) Q;
            if (unVar.O9() && (mkVar = unVar.Z) != null) {
                mkVar.K();
            }
        }
        super.show();
        at.f(this.f21584a).c(this, at.f14803v3);
        at.f(this.f21584a).c(this, at.y3);
    }
}
