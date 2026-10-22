package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.je;
import org.telegram.ui.qn;
public final class x implements Utilities.Callback {
    public final z f47782a;
    public final TL_stories.TL_prepaidStarsGiveaway f47783b;
    public final long f47784c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public x(z zVar, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f47782a = zVar;
        this.f47783b = tL_prepaidStarsGiveaway;
        this.f47784c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        z zVar = this.f47782a;
        zVar.dismiss();
        if (this.f47783b != null) {
            n2 U = LaunchActivity.U();
            if (U != null) {
                qn W9 = qn.W9(this.f47784c);
                W9.whenFullyVisible(new je(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new u2.j0(8, zVar, this.e), 220L);
    }
}
