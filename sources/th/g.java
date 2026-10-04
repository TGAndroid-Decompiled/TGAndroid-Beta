package th;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ha1;
import org.telegram.ui.qc;
import org.telegram.ui.va1;
public final class g extends cb {
    public u61 X;
    public final ha1 Y;

    public g(Activity activity, d6 d6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, d6Var);
        setBackgroundColor(i6.v0(i6.f20766a7, d6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = va1.d0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        z n10 = this.f25307e.n();
        n10.a(-1, R.drawable.ic_close_white);
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int N(int i10, long j3, int i11, qc qcVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new hi.a(qcVar, 10));
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 9), this.resourcesProvider);
        this.X = u61Var;
        u61Var.f31313r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
