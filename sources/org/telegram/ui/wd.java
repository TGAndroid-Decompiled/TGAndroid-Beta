package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class wd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final je f38594a;

    public wd(je jeVar) {
        this.f38594a = jeVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f38594a.f34437w0.presentFragment(new zg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f38594a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        je jeVar = this.f38594a;
        nd ndVar = jeVar.f34436v1;
        int i10 = jeVar.f34440y0;
        long j3 = jeVar.f34441z0;
        int i11 = ((org.telegram.ui.Components.h51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                jeVar.f34437w0.presentFragment(new ei.e4(j3));
            }
        } else if (jeVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (jeVar.A0 == null) {
                return;
            }
            ra1 ra1Var = jeVar.f34437w0;
            rg.j0 j0Var = new rg.j0(30, jeVar.f34440y0, jeVar.getContext(), ra1Var, jeVar.f34439x0);
            j0Var.H1(j3);
            j0Var.F1(jeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, jeVar.A0, new oc(1, jeVar, j0Var));
        } else {
            jeVar.f34427m1 = !jeVar.f34427m1;
            AndroidUtilities.cancelRunOnUIThread(ndVar);
            AndroidUtilities.runOnUIThread(ndVar, 1000L);
            jeVar.f34416a1.Y2.N(true);
        }
    }
}
