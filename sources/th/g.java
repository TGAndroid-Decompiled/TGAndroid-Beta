package th;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.bb1;
import org.telegram.ui.na1;
import org.telegram.ui.pc;
public final class g extends eb {
    public c71 X;
    public final na1 Y;

    public g(Activity activity, e6 e6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, e6Var);
        setBackgroundColor(i6.w0(i6.f20741a7, e6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = bb1.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        qm0 qm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        z o9 = this.f26023e.o();
        o9.a(-1, R.drawable.ic_close_white);
        o9.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int Q(int i10, long j3, int i11, pc pcVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new hi.a(pcVar, 10));
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 9), this.resourcesProvider);
        this.X = c71Var;
        c71Var.f25280r = false;
        return c71Var;
    }
}
