package vh;

import android.app.Activity;
import hi.u1;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.k;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.c51;
import org.telegram.ui.o41;
public final class h extends na {
    public f41 P1;
    public final o41 Q1;
    public boolean R1;
    public int S1;

    public h(Activity activity, f6 f6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, f6Var);
        v0(k6.w0(k6.f27792a7, f6Var));
        this.f28650x = true;
        this.f28636n = false;
        this.C1 = false;
        this.B1 = g0.L(12.0f);
        this.Q1 = c51.i0(tL_statsPollStats.votes_graph, hd.M0(2131747118, null), 2, false);
        pj0 pj0Var = this.f36328k1;
        int i7 = this.f28645t0;
        pj0Var.setPadding(i7, 0, i7, g0.f22532n);
        this.f36328k1.setClipToPadding(false);
        this.f36328k1.setSections(true);
        y q10 = this.l1.q();
        q10.a(-1, 2131231269);
        q10.setTranslationX(-g0.L(5.0f));
        this.P1.O(false);
    }

    public static int d1(int i7, long j3, int i10, k kVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = qp.s1(i7).j1(j3);
        tL_statsGetPollStats.msg_id = i10;
        return ConnectionsManager.getInstance(i7).sendRequestTyped(tL_statsGetPollStats, new d3.b(1), new u1(kVar, 24));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        f41 f41Var = new f41(pj0Var, getContext(), this.f28612a, 0, true, new u1(this, 23), this.I0);
        this.P1 = f41Var;
        f41Var.f33473r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131747119, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = k6.w0(k6.f27792a7, this.I0);
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
