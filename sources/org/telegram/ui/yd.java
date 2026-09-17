package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class yd implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final le f39857a;

    public yd(le leVar) {
        this.f39857a = leVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f39857a.f35525w0.presentFragment(new ih1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f39857a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        le leVar = this.f39857a;
        pd pdVar = leVar.f35524v1;
        int i10 = leVar.f35528y0;
        long j3 = leVar.f35529z0;
        int i11 = ((org.telegram.ui.Components.j51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                leVar.f35525w0.presentFragment(new ei.e4(j3));
            }
        } else if (leVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (leVar.A0 == null) {
                return;
            }
            ab1 ab1Var = leVar.f35525w0;
            rg.j0 j0Var = new rg.j0(30, leVar.f35528y0, leVar.getContext(), ab1Var, leVar.f35527x0);
            j0Var.H1(j3);
            j0Var.F1(leVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, leVar.A0, new ai.g3(5, leVar, j0Var));
        } else {
            leVar.f35515m1 = !leVar.f35515m1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            leVar.f35504a1.Y2.N(true);
        }
    }
}
