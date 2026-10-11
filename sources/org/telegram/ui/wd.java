package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class wd implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final je f43320a;

    public wd(je jeVar) {
        this.f43320a = jeVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f43320a.f39016w0.presentFragment(new hh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.r61 r61Var = (org.telegram.ui.Components.r61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f43320a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        je jeVar = this.f43320a;
        nd ndVar = jeVar.f39015v1;
        int i10 = jeVar.f39019y0;
        long j3 = jeVar.f39020z0;
        int i11 = ((org.telegram.ui.Components.r61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                jeVar.f39016w0.presentFragment(new ei.e4(j3));
            }
        } else if (jeVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (jeVar.A0 == null) {
                return;
            }
            ab1 ab1Var = jeVar.f39016w0;
            rg.j0 j0Var = new rg.j0(30, jeVar.f39019y0, jeVar.getContext(), ab1Var, jeVar.f39018x0);
            j0Var.I1(j3);
            j0Var.G1(jeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, jeVar.A0, new oc(1, jeVar, j0Var));
        } else {
            jeVar.f39006m1 = !jeVar.f39006m1;
            AndroidUtilities.cancelRunOnUIThread(ndVar);
            AndroidUtilities.runOnUIThread(ndVar, 1000L);
            jeVar.f38995a1.W2.N(true);
        }
    }
}
