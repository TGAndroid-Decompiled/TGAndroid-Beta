package uh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.hb1;
import org.telegram.ui.ta1;
import org.telegram.ui.vc;
public final class g extends db {
    public z61 X;
    public final ta1 Y;

    public g(Activity activity, c6 c6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, c6Var);
        setBackgroundColor(g6.w0(g6.f19843a7, c6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = hb1.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        y n10 = this.e.n();
        n10.a(-1, R.drawable.ic_close_white);
        n10.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int Q(int i10, long j10, int i11, vc vcVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new ii.a(vcVar, 10));
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, true, new ii.a(this, 9), this.resourcesProvider);
        this.X = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
