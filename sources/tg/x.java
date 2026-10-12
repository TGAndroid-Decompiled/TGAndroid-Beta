package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.pe;
public final class x implements Utilities.Callback {
    public final a0 f48663a;
    public final TL_stories.TL_prepaidStarsGiveaway f48664b;
    public final long f48665c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f48666e;

    public x(a0 a0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f48663a = a0Var;
        this.f48664b = tL_prepaidStarsGiveaway;
        this.f48665c = j3;
        this.d = j10;
        this.f48666e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        a0 a0Var = this.f48663a;
        a0Var.dismiss();
        if (this.f48664b != null) {
            m2 U = LaunchActivity.U();
            if (U != null) {
                eo W9 = eo.W9(this.f48665c);
                W9.whenFullyVisible(new pe(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new y(1, a0Var, this.f48666e), 220L);
    }
}
