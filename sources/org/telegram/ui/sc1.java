package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class sc1 implements Utilities.Callback {
    public final int f40061a;
    public final ce1 f40062b;

    public sc1(ce1 ce1Var, int i10) {
        this.f40061a = i10;
        this.f40062b = ce1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40061a) {
            case 0:
                ce1 ce1Var = this.f40062b;
                ce1Var.getClass();
                ce1Var.f34892n1 = ((Float) obj).floatValue();
                ce1Var.f34915x0.invalidate();
                ce1Var.V0();
                return;
            case 1:
                ce1 ce1Var2 = this.f40062b;
                ce1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                ce1Var2.U1 = true;
                ce1Var2.h1(true);
                ce1Var2.T1 = false;
                return;
            default:
                ce1.U(this.f40062b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
