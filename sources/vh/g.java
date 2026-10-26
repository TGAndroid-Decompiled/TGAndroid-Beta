package vh;

import android.app.Activity;
import hi.e2;
import li.s2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.i91;
import org.telegram.ui.w91;
public final class g extends bb {
    public j71 X;
    public final i91 Y;
    public boolean Z;
    public int f50329a0;

    public g(Activity activity, u6 u6Var, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, 2, u6Var);
        setBackgroundColor(y6.w0(y6.f23299a7, u6Var));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.Y = w91.e0(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.setSections(true);
        z l4 = this.e.l();
        l4.a(-1, R.drawable.ic_close_white);
        l4.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.X.O(false);
    }

    public static int P(int i10, long j10, int i11, s2 s2Var) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_statsGetPollStats.msg_id = i11;
        return ConnectionsManager.getInstance(i10).sendRequestTyped(tL_statsGetPollStats, new Object(), new e2(s2Var, 24));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int w02 = y6.w0(y6.f23299a7, this.resourcesProvider);
            if (this.Z && w02 == this.f50329a0) {
                return;
            }
            this.Z = true;
            this.f50329a0 = w02;
            setBackgroundColor(w02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new e2(this, 23), this.resourcesProvider);
        this.X = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
