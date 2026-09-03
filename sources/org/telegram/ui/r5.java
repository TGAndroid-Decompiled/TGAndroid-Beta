package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class r5 implements h5.d {
    public final int f37700a;
    public final a6 f37701b;

    public r5(a6 a6Var, int i10) {
        this.f37700a = i10;
        this.f37701b = a6Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37700a) {
            case 0:
                this.f37701b.P = (ChannelBoostsController.CanApplyBoost) obj;
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(18, this.f37701b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
