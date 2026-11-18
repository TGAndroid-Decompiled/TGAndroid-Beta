package vh;

import android.app.Activity;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.c51;
import org.telegram.ui.o41;
public final class h extends sa {
    public z41 T1;
    public final o41 U1;
    public boolean V1;
    public int W1;

    public h(Activity activity, i6 i6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, i6Var);
        v0(n6.w0(n6.f29339a7, i6Var));
        this.f30231x = true;
        this.f30217n = false;
        this.G1 = false;
        this.F1 = g0.L(12.0f);
        this.U1 = c51.i0(tL_statsPollStats.votes_graph, gd.M0(2131746926, null), 2, false);
        ck0 ck0Var = this.f39534o1;
        int i7 = this.f30227u0;
        ck0Var.setPadding(i7, 0, i7, g0.f24116n);
        this.f39534o1.setClipToPadding(false);
        this.f39534o1.setSections(true);
        z t6 = this.f39535p1.t();
        t6.a(-1, 2131231269);
        t6.setTranslationX(-g0.L(5.0f));
        this.T1.O(false);
    }

    public static int e1(int i7, long j3, int i10, li.d dVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = mp.u1(i7).l1(j3);
        tL_statsGetPollStats.msg_id = i10;
        return ConnectionsManager.getInstance(i7).sendRequestTyped(tL_statsGetPollStats, new d3.b(1), new org.telegram.ui.web.b(dVar, 4));
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30189a, 0, true, new org.telegram.ui.web.b(this, 3), this.J0);
        this.T1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131746927, null);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = n6.w0(n6.f29339a7, this.J0);
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
