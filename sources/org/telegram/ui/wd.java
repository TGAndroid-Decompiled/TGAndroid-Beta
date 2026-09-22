package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class wd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final je f38782a;

    public wd(je jeVar) {
        this.f38782a = jeVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f38782a.f34891w0.presentFragment(new hh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f38782a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        je jeVar = this.f38782a;
        nd ndVar = jeVar.f34890v1;
        int i10 = jeVar.f34894y0;
        long j3 = jeVar.f34895z0;
        int i11 = ((org.telegram.ui.Components.i51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                jeVar.f34891w0.presentFragment(new ei.e4(j3));
            }
        } else if (jeVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (jeVar.A0 == null) {
                return;
            }
            za1 za1Var = jeVar.f34891w0;
            rg.j0 j0Var = new rg.j0(30, jeVar.f34894y0, jeVar.getContext(), za1Var, jeVar.f34893x0);
            j0Var.H1(j3);
            j0Var.F1(jeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, jeVar.A0, new ai.g3(5, jeVar, j0Var));
        } else {
            jeVar.f34881m1 = !jeVar.f34881m1;
            AndroidUtilities.cancelRunOnUIThread(ndVar);
            AndroidUtilities.runOnUIThread(ndVar, 1000L);
            jeVar.f34870a1.Y2.N(true);
        }
    }
}
