package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ne;
import org.telegram.ui.web.g2;
import org.telegram.ui.xn;
public final class y implements Utilities.Callback {
    public final a0 f43554a;
    public final TL_stories.TL_prepaidStarsGiveaway f43555b;
    public final long f43556c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f43554a = a0Var;
        this.f43555b = tL_prepaidStarsGiveaway;
        this.f43556c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f43554a;
        a0Var.dismiss();
        if (this.f43555b != null) {
            o2 U = LaunchActivity.U();
            if (U != null) {
                xn R9 = xn.R9(this.f43556c);
                R9.whenFullyVisible(new ne(R9, this.d, 6));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new g2(25, a0Var, this.e), 220L);
    }
}
