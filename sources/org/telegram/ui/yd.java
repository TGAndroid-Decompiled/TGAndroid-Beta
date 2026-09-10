package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class yd implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final le f38975a;

    public yd(le leVar) {
        this.f38975a = leVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f38975a.f34683w0.presentFragment(new mh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f38975a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        le leVar = this.f38975a;
        pd pdVar = leVar.f34682v1;
        int i10 = leVar.f34686y0;
        long j3 = leVar.f34687z0;
        int i11 = ((org.telegram.ui.Components.v51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                leVar.f34683w0.presentFragment(new di.h4(j3));
            }
        } else if (leVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (leVar.A0 == null) {
                return;
            }
            fb1 fb1Var = leVar.f34683w0;
            qg.k0 k0Var = new qg.k0(30, leVar.f34686y0, leVar.getContext(), fb1Var, leVar.f34685x0);
            k0Var.H1(j3);
            k0Var.F1(leVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, leVar.A0, new m4.q0(4, leVar, k0Var));
        } else {
            leVar.f34673m1 = !leVar.f34673m1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            leVar.f34662a1.Y2.N(true);
        }
    }
}
