package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class tb1 implements h5.d {
    public final int f38633a;
    public final cd1 f38634b;

    public tb1(cd1 cd1Var, int i10) {
        this.f38633a = i10;
        this.f38634b = cd1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f38633a) {
            case 0:
                cd1 cd1Var = this.f38634b;
                cd1Var.S1 = (TL_stories.TL_premium_boostsStatus) obj;
                cd1Var.R1 = true;
                cd1Var.h1(true);
                cd1Var.Q1 = false;
                return;
            default:
                cd1.X(this.f38634b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
