package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.le;
public final class z implements Utilities.Callback {
    public final b0 f47232a;
    public final TL_stories.TL_prepaidStarsGiveaway f47233b;
    public final long f47234c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f47235e;

    public z(b0 b0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f47232a = b0Var;
        this.f47233b = tL_prepaidStarsGiveaway;
        this.f47234c = j3;
        this.d = j10;
        this.f47235e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        b0 b0Var = this.f47232a;
        b0Var.dismiss();
        if (this.f47233b != null) {
            n2 U = LaunchActivity.U();
            if (U != null) {
                co R9 = co.R9(this.f47234c);
                R9.whenFullyVisible(new le(R9, this.d, 6));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new r(4, b0Var, this.f47235e), 220L);
    }
}
