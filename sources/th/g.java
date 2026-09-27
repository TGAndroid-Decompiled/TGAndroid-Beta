package th;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.a0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.da1;
import org.telegram.ui.qc;
import org.telegram.ui.ra1;
public final class g extends bb {
    public l61 X;
    public final da1 Y;

    public g(Activity activity, e6 e6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, e6Var);
        setBackgroundColor(i6.v0(i6.f19001a7, e6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = ra1.d0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        a0 o9 = this.e.o();
        o9.a(-1, R.drawable.ic_close_white);
        o9.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int P(int i10, long j3, int i11, qc qcVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new hi.a(qcVar, 10));
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        l61 l61Var = new l61(yl0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 9), this.resourcesProvider);
        this.X = l61Var;
        l61Var.f25959r = false;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
