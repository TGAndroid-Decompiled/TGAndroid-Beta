package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.me;
public final class z implements Utilities.Callback {
    public final b0 f43268a;
    public final TL_stories.TL_prepaidStarsGiveaway f43269b;
    public final long f43270c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public z(b0 b0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f43268a = b0Var;
        this.f43269b = tL_prepaidStarsGiveaway;
        this.f43270c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        b0 b0Var = this.f43268a;
        b0Var.dismiss();
        if (this.f43269b != null) {
            o2 U = LaunchActivity.U();
            if (U != null) {
                bo R9 = bo.R9(this.f43270c);
                R9.whenFullyVisible(new me(R9, this.d, 6));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new p2.b(22, b0Var, this.e), 220L);
    }
}
