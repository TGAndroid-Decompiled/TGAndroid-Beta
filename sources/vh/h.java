package vh;

import android.app.Activity;
import hi.u1;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.k;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.d51;
import org.telegram.ui.p41;
public final class h extends na {
    public m41 P1;
    public final p41 Q1;
    public boolean R1;
    public int S1;

    public h(Activity activity, g6 g6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, g6Var);
        v0(l6.w0(l6.f27809a7, g6Var));
        this.f28659x = true;
        this.f28645n = false;
        this.C1 = false;
        this.B1 = g0.L(12.0f);
        this.Q1 = d51.i0(tL_statsPollStats.votes_graph, id.M0(2131747119, null), 2, false);
        qj0 qj0Var = this.f36303k1;
        int i7 = this.f28654t0;
        qj0Var.setPadding(i7, 0, i7, g0.f22558n);
        this.f36303k1.setClipToPadding(false);
        this.f36303k1.setSections(true);
        y r10 = this.l1.r();
        r10.a(-1, 2131231269);
        r10.setTranslationX(-g0.L(5.0f));
        this.P1.O(false);
    }

    public static int d1(int i7, long j3, int i10, k kVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = qp.s1(i7).j1(j3);
        tL_statsGetPollStats.msg_id = i10;
        return ConnectionsManager.getInstance(i7).sendRequestTyped(tL_statsGetPollStats, new d3.b(1), new u1(kVar, 24));
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.f28621a, 0, true, new u1(this, 23), this.I0);
        this.P1 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131747120, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = l6.w0(l6.f27809a7, this.I0);
            if (this.R1 && w02 == this.S1) {
                return;
            }
            this.R1 = true;
            this.S1 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
