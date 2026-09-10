package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.me;
import org.telegram.ui.web.x1;
public final class y implements Utilities.Callback {
    public final a0 f42025a;
    public final TL_stories.TL_prepaidStarsGiveaway f42026b;
    public final long f42027c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f42025a = a0Var;
        this.f42026b = tL_prepaidStarsGiveaway;
        this.f42027c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f42025a;
        a0Var.dismiss();
        if (this.f42026b != null) {
            p2 U = LaunchActivity.U();
            if (U != null) {
                eo R9 = eo.R9(this.f42027c);
                R9.whenFullyVisible(new me(R9, this.d, 6));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new x1(23, a0Var, this.e), 220L);
    }
}
