package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class wd implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final je f38962a;

    public wd(je jeVar) {
        this.f38962a = jeVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f38962a.f34773w0.presentFragment(new zg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f38962a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        je jeVar = this.f38962a;
        nd ndVar = jeVar.f34772v1;
        int i10 = jeVar.f34776y0;
        long j3 = jeVar.f34777z0;
        int i11 = ((org.telegram.ui.Components.v51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                jeVar.f34773w0.presentFragment(new ei.e4(j3));
            }
        } else if (jeVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (jeVar.A0 == null) {
                return;
            }
            sa1 sa1Var = jeVar.f34773w0;
            rg.j0 j0Var = new rg.j0(30, jeVar.f34776y0, jeVar.getContext(), sa1Var, jeVar.f34775x0);
            j0Var.H1(j3);
            j0Var.F1(jeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, jeVar.A0, new oc(1, jeVar, j0Var));
        } else {
            jeVar.f34763m1 = !jeVar.f34763m1;
            AndroidUtilities.cancelRunOnUIThread(ndVar);
            AndroidUtilities.runOnUIThread(ndVar, 1000L);
            jeVar.f34752a1.Y2.N(true);
        }
    }
}
