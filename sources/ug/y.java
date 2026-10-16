package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.re;
public final class y implements Utilities.Callback {
    public final a0 f46410a;
    public final TL_stories.TL_prepaidStarsGiveaway f46411b;
    public final long f46412c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public y(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f46410a = a0Var;
        this.f46411b = tL_prepaidStarsGiveaway;
        this.f46412c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f46410a;
        a0Var.dismiss();
        if (this.f46411b != null) {
            m2 U = LaunchActivity.U();
            if (U != null) {
                fo W9 = fo.W9(this.f46412c);
                W9.whenFullyVisible(new re(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new s9.b(15, a0Var, this.e), 220L);
    }
}
