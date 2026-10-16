package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class sc1 implements Utilities.Callback {
    public final int f39758a;
    public final ce1 f39759b;

    public sc1(ce1 ce1Var, int i10) {
        this.f39758a = i10;
        this.f39759b = ce1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39758a) {
            case 0:
                ce1 ce1Var = this.f39759b;
                ce1Var.getClass();
                ce1Var.f34616n1 = ((Float) obj).floatValue();
                ce1Var.f34639x0.invalidate();
                ce1Var.V0();
                return;
            case 1:
                ce1 ce1Var2 = this.f39759b;
                ce1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                ce1Var2.U1 = true;
                ce1Var2.h1(true);
                ce1Var2.T1 = false;
                return;
            default:
                ce1.U(this.f39759b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
