package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg;
import org.telegram.ui.web.x1;
import org.telegram.ui.yn;
public final class y implements Utilities.Callback {
    public final a0 f47116a;
    public final TL_stories.TL_prepaidStarsGiveaway f47117b;
    public final long f47118c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f47119e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f47116a = a0Var;
        this.f47117b = tL_prepaidStarsGiveaway;
        this.f47118c = j3;
        this.d = j10;
        this.f47119e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f47116a;
        a0Var.dismiss();
        if (this.f47117b != null) {
            n2 U = LaunchActivity.U();
            if (U != null) {
                yn Q9 = yn.Q9(this.f47118c);
                Q9.whenFullyVisible(new gg(Q9, this.d, 6));
                U.presentFragment(Q9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new x1(28, a0Var, this.f47119e), 220L);
    }
}
