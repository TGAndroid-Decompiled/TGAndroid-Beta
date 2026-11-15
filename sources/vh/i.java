package vh;

import android.app.Activity;
import li.v;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.l41;
import org.telegram.ui.z41;
public final class i extends ja {
    public p41 T1;
    public final l41 U1;
    public boolean V1;
    public int W1;

    public i(Activity activity, e6 e6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, e6Var);
        v0(j6.w0(j6.f28792a7, e6Var));
        this.f29721x = true;
        this.f29707n = false;
        this.G1 = false;
        this.F1 = g0.L(12.0f);
        this.U1 = z41.i0(tL_statsPollStats.votes_graph, hd.M0(2131747119, null), 2, false);
        uj0 uj0Var = this.f35936o1;
        int i7 = this.f29717u0;
        uj0Var.setPadding(i7, 0, i7, g0.f23604n);
        this.f35936o1.setClipToPadding(false);
        this.f35936o1.setSections(true);
        y s5 = this.f35937p1.s();
        s5.a(-1, 2131231269);
        s5.setTranslationX(-g0.L(5.0f));
        this.T1.O(false);
    }

    public static int d1(int i7, long j3, int i10, v vVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = np.s1(i7).j1(j3);
        tL_statsGetPollStats.msg_id = i10;
        return ConnectionsManager.getInstance(i7).sendRequestTyped(tL_statsGetPollStats, new d3.b(1), new org.telegram.ui.web.b(vVar, 4));
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, true, new org.telegram.ui.web.b(this, 3), this.J0);
        this.T1 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131747120, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = j6.w0(j6.f28792a7, this.J0);
            if (this.V1 && w02 == this.W1) {
                return;
            }
            this.V1 = true;
            this.W1 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
