package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class r5 implements Utilities.Callback {
    public final int f41066a;
    public final z5 f41067b;

    public r5(z5 z5Var, int i10) {
        this.f41066a = i10;
        this.f41067b = z5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41066a) {
            case 0:
                this.f41067b.S = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new i0(3, this.f41067b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
