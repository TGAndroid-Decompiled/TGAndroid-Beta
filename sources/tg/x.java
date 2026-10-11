package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ke;
import org.telegram.ui.web.f2;
import org.telegram.ui.zn;
public final class x implements Utilities.Callback {
    public final z f48528a;
    public final TL_stories.TL_prepaidStarsGiveaway f48529b;
    public final long f48530c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f48531e;

    public x(z zVar, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f48528a = zVar;
        this.f48529b = tL_prepaidStarsGiveaway;
        this.f48530c = j3;
        this.d = j10;
        this.f48531e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        z zVar = this.f48528a;
        zVar.dismiss();
        if (this.f48529b != null) {
            m2 U = LaunchActivity.U();
            if (U != null) {
                zn W9 = zn.W9(this.f48530c);
                W9.whenFullyVisible(new ke(W9, this.d, 6));
                U.presentFragment(W9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new f2(29, zVar, this.f48531e), 220L);
    }
}
