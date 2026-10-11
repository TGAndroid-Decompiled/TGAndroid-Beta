package th;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.ab1;
import org.telegram.ui.ma1;
import org.telegram.ui.oc;
public final class g extends db {
    public e71 X;
    public final ma1 Y;

    public g(Activity activity, d6 d6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, d6Var);
        setBackgroundColor(h6.w0(h6.f20730a7, d6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = ab1.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        sm0 sm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        y o9 = this.f25521e.o();
        o9.a(-1, R.drawable.ic_close_white);
        o9.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int Q(int i10, long j3, int i11, oc ocVar) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new hi.a(ocVar, 10));
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(sm0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 9), this.resourcesProvider);
        this.X = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }
}
