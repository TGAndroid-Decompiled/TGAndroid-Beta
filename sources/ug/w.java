package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.le;
import org.telegram.ui.sn;
public final class w implements Utilities.Callback {
    public final y f47791a;
    public final TL_stories.TL_prepaidStarsGiveaway f47792b;
    public final long f47793c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public w(y yVar, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f47791a = yVar;
        this.f47792b = tL_prepaidStarsGiveaway;
        this.f47793c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        y yVar = this.f47791a;
        yVar.dismiss();
        if (this.f47792b != null) {
            n2 U = LaunchActivity.U();
            if (U != null) {
                sn W9 = sn.W9(this.f47793c);
                W9.whenFullyVisible(new le(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new uf.c(6, yVar, this.e), 220L);
    }
}
