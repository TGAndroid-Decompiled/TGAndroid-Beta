package sh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.fb1;
import org.telegram.ui.pf;
import org.telegram.ui.ra1;
public final class g extends ab {
    public j61 X;
    public final ra1 Y;

    public g(Activity activity, f6 f6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, f6Var);
        setBackgroundColor(j6.v0(j6.f17872a7, f6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = fb1.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        z n10 = this.e.n();
        n10.a(-1, R.drawable.ic_close_white);
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int P(int i10, long j3, int i11, pf pfVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new gi.a(pfVar, 10));
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new gi.a(this, 9), this.resourcesProvider);
        this.X = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
