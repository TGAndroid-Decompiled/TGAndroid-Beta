package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class y implements Utilities.Callback {
    public final a0 f50278a;
    public final TL_stories.TL_prepaidStarsGiveaway f50279b;
    public final long f50280c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f50278a = a0Var;
        this.f50279b = tL_prepaidStarsGiveaway;
        this.f50280c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r6 = (Void) obj;
        a0 a0Var = this.f50278a;
        a0Var.dismiss();
        if (this.f50279b != null) {
            r2 U = LaunchActivity.U();
            if (U != null) {
                un ba2 = un.ba(this.f50280c);
                ba2.whenFullyVisible(new ag.o0(ba2, this.d, 7));
                U.presentFragment(ba2);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new sg.u(24, a0Var, this.e), 220L);
    }
}
