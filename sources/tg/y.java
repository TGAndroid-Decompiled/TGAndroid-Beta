package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.le;
import org.telegram.ui.zn;
public final class y implements Utilities.Callback {
    public final a0 f43523a;
    public final TL_stories.TL_prepaidStarsGiveaway f43524b;
    public final long f43525c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f43523a = a0Var;
        this.f43524b = tL_prepaidStarsGiveaway;
        this.f43525c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f43523a;
        a0Var.dismiss();
        if (this.f43524b != null) {
            n2 U = LaunchActivity.U();
            if (U != null) {
                zn R9 = zn.R9(this.f43525c);
                R9.whenFullyVisible(new le(R9, this.d, 6));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(28, a0Var, this.e), 220L);
    }
}
