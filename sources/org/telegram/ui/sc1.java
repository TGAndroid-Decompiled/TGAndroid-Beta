package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class sc1 implements e2.h {
    public final int f36653a;
    public final ae1 f36654b;

    public sc1(ae1 ae1Var, int i10) {
        this.f36653a = i10;
        this.f36654b = ae1Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36653a) {
            case 0:
                ae1 ae1Var = this.f36654b;
                ae1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                ae1Var.U1 = true;
                ae1Var.h1(true);
                ae1Var.T1 = false;
                return;
            default:
                ae1.V(this.f36654b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
