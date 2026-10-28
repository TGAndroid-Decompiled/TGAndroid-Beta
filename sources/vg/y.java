package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class y implements Utilities.Callback {
    public final a0 f50313a;
    public final TL_stories.TL_prepaidStarsGiveaway f50314b;
    public final long f50315c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f50313a = a0Var;
        this.f50314b = tL_prepaidStarsGiveaway;
        this.f50315c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r6 = (Void) obj;
        a0 a0Var = this.f50313a;
        a0Var.dismiss();
        if (this.f50314b != null) {
            r2 U = LaunchActivity.U();
            if (U != null) {
                wn ea2 = wn.ea(this.f50315c);
                ea2.whenFullyVisible(new ag.o0(ea2, this.d, 7));
                U.presentFragment(ea2);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new s9.g(25, a0Var, this.e), 220L);
    }
}
