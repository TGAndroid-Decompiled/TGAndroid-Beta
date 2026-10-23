package uh;

import android.app.Activity;
import hg.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.g91;
import org.telegram.ui.u91;
public final class g extends bb {
    public b71 X;
    public final g91 Y;
    public boolean Z;
    public int f48296a0;

    public g(Activity activity, g6 g6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, g6Var);
        setBackgroundColor(k6.w0(k6.f21125a7, g6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = u91.f0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        y m10 = this.e.m();
        m10.a(-1, R.drawable.ic_close_white);
        m10.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.N(false);
    }

    public static int P(int i10, long j10, int i11, m3 m3Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new o(m3Var, 21));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int w02 = k6.w0(k6.f21125a7, this.resourcesProvider);
            if (this.Z && w02 == this.f48296a0) {
                return;
            }
            this.Z = true;
            this.f48296a0 = w02;
            setBackgroundColor(w02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, true, new o(this, 20), this.resourcesProvider);
        this.X = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
