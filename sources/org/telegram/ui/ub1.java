package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class ub1 implements h5.d {
    public final int f41878a;
    public final ed1 f41879b;

    public ub1(ed1 ed1Var, int i10) {
        this.f41878a = i10;
        this.f41879b = ed1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41878a) {
            case 0:
                ed1 ed1Var = this.f41879b;
                ed1Var.S1 = (TL_stories.TL_premium_boostsStatus) obj;
                ed1Var.R1 = true;
                ed1Var.h1(true);
                ed1Var.Q1 = false;
                return;
            default:
                ed1.X(this.f41879b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
