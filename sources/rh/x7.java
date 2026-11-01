package rh;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l10;
import org.telegram.ui.mk;
import org.telegram.ui.un;
public final class x7 extends ha implements vs {
    public final long P1;
    public final l10 Q1;
    public final FrameLayout R1;
    public final xz S1;
    public Runnable T1;
    public final TLRPC.InputPeer U1;
    public final boolean V1;
    public q51 W1;
    public boolean X1;

    public x7(android.content.Context r17, org.telegram.ui.ActionBar.p6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: rh.x7.<init>(android.content.Context, org.telegram.ui.ActionBar.p6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void L() {
        super.L();
        at.f(this.f21584a).n(this, at.f14803v3);
        at.f(this.f21584a).n(this, at.y3);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, true, new qh.d(this, 10), this.I0);
        this.W1 = q51Var;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        l10 l10Var = this.Q1;
        if (l10Var == null) {
            return null;
        }
        return ((TextView) l10Var.f39050b).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == at.f14803v3 || i10 == at.y3) {
            q51 q51Var = this.W1;
            if (q51Var != null) {
                q51Var.O(true);
            }
            long j10 = e6.y(this.f21584a, false).p().amount;
            long j11 = this.P1;
            ((TextView) this.Q1.f39050b).setText(dd.H(',', "StarsNeededTitle", (int) (j11 - j10)));
            da daVar = this.l1;
            if (daVar != null) {
                daVar.setTitle(O0());
            }
            if (j10 >= j11 && (runnable = this.T1) != null) {
                runnable.run();
                this.T1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        l10 l10Var = this.Q1;
        if (l10Var != null) {
            ((lg.q) l10Var.f39051c).setPaused(true);
        }
    }

    @Override
    public final void show() {
        mk mkVar;
        if (!this.V1) {
            org.telegram.messenger.m5.n(null, 2131747413, new cc(ra.a(getContext()), this.I0), 2131624224, 36);
        } else if (e6.y(this.f21584a, false).p().amount >= this.P1) {
            Runnable runnable = this.T1;
            if (runnable != null) {
                runnable.run();
                this.T1 = null;
            }
        } else {
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
}
