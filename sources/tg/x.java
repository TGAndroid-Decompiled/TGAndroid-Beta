package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.pe;
public final class x implements Utilities.Callback {
    public final z f48635a;
    public final TL_stories.TL_prepaidStarsGiveaway f48636b;
    public final long f48637c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f48638e;

    public x(z zVar, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f48635a = zVar;
        this.f48636b = tL_prepaidStarsGiveaway;
        this.f48637c = j3;
        this.d = j10;
        this.f48638e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        z zVar = this.f48635a;
        zVar.dismiss();
        if (this.f48636b != null) {
            m2 U = LaunchActivity.U();
            if (U != null) {
                eo W9 = eo.W9(this.f48637c);
                W9.whenFullyVisible(new pe(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new p2.b(29, zVar, this.f48638e), 220L);
    }
}
