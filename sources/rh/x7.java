package rh;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m10;
import org.telegram.ui.mk;
import org.telegram.ui.un;
public final class x7 extends ha implements us {
    public final long P1;
    public final m10 Q1;
    public final FrameLayout R1;
    public final xz S1;
    public Runnable T1;
    public final TLRPC.InputPeer U1;
    public final boolean V1;
    public p51 W1;
    public boolean X1;

    public x7(android.content.Context r17, org.telegram.ui.ActionBar.p6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: rh.x7.<init>(android.content.Context, org.telegram.ui.ActionBar.p6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void L() {
        super.L();
        zs.f(this.f21583a).n(this, zs.f19707v3);
        zs.f(this.f21583a).n(this, zs.y3);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.f26666k1, getContext(), this.f21583a, 0, true, new qh.d(this, 10), this.I0);
        this.W1 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        m10 m10Var = this.Q1;
        if (m10Var == null) {
            return null;
        }
        return ((TextView) m10Var.f39451b).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == zs.f19707v3 || i10 == zs.y3) {
            p51 p51Var = this.W1;
            if (p51Var != null) {
                p51Var.O(true);
            }
            long j10 = e6.y(this.f21583a, false).p().amount;
            long j11 = this.P1;
            ((TextView) this.Q1.f39451b).setText(cd.H(',', "StarsNeededTitle", (int) (j11 - j10)));
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
        m10 m10Var = this.Q1;
        if (m10Var != null) {
            ((lg.q) m10Var.f39452c).setPaused(true);
        }
    }

    @Override
    public final void show() {
        mk mkVar;
        if (!this.V1) {
            org.telegram.messenger.m5.n(null, 2131747413, new cc(ra.a(getContext()), this.I0), 2131624224, 36);
        } else if (e6.y(this.f21583a, false).p().amount >= this.P1) {
            Runnable runnable = this.T1;
            if (runnable != null) {
                runnable.run();
                this.T1 = null;
            }
        } else {
            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
            if (Q instanceof un) {
                un unVar = (un) Q;
                if (unVar.J9() && (mkVar = unVar.Z) != null) {
                    mkVar.L();
                }
            }
            super.show();
            zs.f(this.f21583a).c(this, zs.f19707v3);
            zs.f(this.f21583a).c(this, zs.y3);
        }
    }
}
