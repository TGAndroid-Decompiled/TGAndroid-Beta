package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class xd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final ke f39433a;

    public xd(ke keVar) {
        this.f39433a = keVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f39433a.f35062w0.presentFragment(new gh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f39433a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ke keVar = this.f39433a;
        od odVar = keVar.f35061v1;
        int i10 = keVar.f35065y0;
        long j3 = keVar.f35066z0;
        int i11 = ((org.telegram.ui.Components.x51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.f35062w0.presentFragment(new ei.e4(j3));
            }
        } else if (keVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (keVar.A0 == null) {
                return;
            }
            za1 za1Var = keVar.f35062w0;
            rg.j0 j0Var = new rg.j0(30, keVar.f35065y0, keVar.getContext(), za1Var, keVar.f35064x0);
            j0Var.H1(j3);
            j0Var.F1(keVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, keVar.A0, new ai.g3(5, keVar, j0Var));
        } else {
            keVar.f35052m1 = !keVar.f35052m1;
            AndroidUtilities.cancelRunOnUIThread(odVar);
            AndroidUtilities.runOnUIThread(odVar, 1000L);
            keVar.f35041a1.Y2.N(true);
        }
    }
}
