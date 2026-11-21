package vh;

import android.app.Activity;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.o41;
public final class h extends sa {
    public c51 T1;
    public final o41 U1;
    public boolean V1;
    public int W1;

    public h(Activity activity, h6 h6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, h6Var);
        v0(m6.w0(m6.f29321a7, h6Var));
        this.f30212x = true;
        this.f30198n = false;
        this.G1 = false;
        this.F1 = g0.L(12.0f);
        this.U1 = org.telegram.ui.c51.i0(tL_statsPollStats.votes_graph, gd.N0(2131746925, null), 2, false);
        ek0 ek0Var = this.f39539o1;
        int i7 = this.f30208u0;
        ek0Var.setPadding(i7, 0, i7, g0.f24141n);
        this.f39539o1.setClipToPadding(false);
        this.f39539o1.setSections(true);
        y s5 = this.f39540p1.s();
        s5.a(-1, 2131231269);
        s5.setTranslationX(-g0.L(5.0f));
        this.T1.O(false);
    }

    public static int e1(int i7, long j3, int i10, li.d dVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = mp.u1(i7).l1(j3);
        tL_statsGetPollStats.msg_id = i10;
        return ConnectionsManager.getInstance(i7).sendRequestTyped(tL_statsGetPollStats, new d3.b(1), new org.telegram.ui.web.b(dVar, 4));
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30170a, 0, true, new org.telegram.ui.web.b(this, 3), this.J0);
        this.T1 = c51Var;
        c51Var.f34068r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131746926, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = m6.w0(m6.f29321a7, this.J0);
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
