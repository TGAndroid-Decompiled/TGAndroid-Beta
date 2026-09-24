package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ke;
import org.telegram.ui.wn;
public final class y implements Utilities.Callback {
    public final a0 f43494a;
    public final TL_stories.TL_prepaidStarsGiveaway f43495b;
    public final long f43496c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f43494a = a0Var;
        this.f43495b = tL_prepaidStarsGiveaway;
        this.f43496c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f43494a;
        a0Var.dismiss();
        if (this.f43495b != null) {
            m2 U = LaunchActivity.U();
            if (U != null) {
                wn R9 = wn.R9(this.f43496c);
                R9.whenFullyVisible(new ke(R9, this.d, 6));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f1(28, a0Var, this.e), 220L);
    }
}
