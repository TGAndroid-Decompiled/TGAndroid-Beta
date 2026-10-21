package uh;

import android.app.Activity;
import hg.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.b91;
import org.telegram.ui.p91;
public final class g extends bb {
    public u61 X;
    public final b91 Y;

    public g(Activity activity, d6 d6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, d6Var);
        setBackgroundColor(h6.w0(h6.f20932a7, d6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = p91.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        jm0 jm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        y n10 = this.e.n();
        n10.a(-1, R.drawable.ic_close_white);
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int Q(int i10, long j10, int i11, j3 j3Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new o(j3Var, 21));
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(jm0Var, getContext(), this.currentAccount, 0, true, new o(this, 20), this.resourcesProvider);
        this.X = u61Var;
        u61Var.f30861r = false;
        return u61Var;
    }
}
