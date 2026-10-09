package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.le;
import org.telegram.ui.web.w1;
import org.telegram.ui.zn;
public final class y implements Utilities.Callback {
    public final a0 f48428a;
    public final TL_stories.TL_prepaidStarsGiveaway f48429b;
    public final long f48430c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f48431e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f48428a = a0Var;
        this.f48429b = tL_prepaidStarsGiveaway;
        this.f48430c = j3;
        this.d = j10;
        this.f48431e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f48428a;
        a0Var.dismiss();
        if (this.f48429b != null) {
            n2 U = LaunchActivity.U();
            if (U != null) {
                zn W9 = zn.W9(this.f48430c);
                W9.whenFullyVisible(new le(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new w1(27, a0Var, this.f48431e), 220L);
    }
}
