package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.je;
import org.telegram.ui.sn;
public final class w implements Utilities.Callback {
    public final y f48216a;
    public final TL_stories.TL_prepaidStarsGiveaway f48217b;
    public final long f48218c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public w(y yVar, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f48216a = yVar;
        this.f48217b = tL_prepaidStarsGiveaway;
        this.f48218c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        y yVar = this.f48216a;
        yVar.dismiss();
        if (this.f48217b != null) {
            o2 U = LaunchActivity.U();
            if (U != null) {
                sn W9 = sn.W9(this.f48218c);
                W9.whenFullyVisible(new je(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new u2.k0(8, yVar, this.e), 220L);
    }
}
