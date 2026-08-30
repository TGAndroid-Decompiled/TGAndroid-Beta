package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class zd implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final ke f40768a;

    public zd(ke keVar) {
        this.f40768a = keVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f40768a.f35648t0.presentFragment(new og1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f40768a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ke keVar = this.f40768a;
        pd pdVar = keVar.f35647s1;
        int i10 = keVar.f35651v0;
        long j10 = keVar.f35652w0;
        int i11 = ((org.telegram.ui.Components.i51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.f35648t0.presentFragment(new rh.e3(j10));
            }
        } else if (keVar.f35654y0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (keVar.f35653x0 == null) {
                return;
            }
            ga1 ga1Var = keVar.f35648t0;
            eg.v0 v0Var = new eg.v0(30, keVar.f35651v0, keVar.getContext(), ga1Var, keVar.f35650u0);
            v0Var.H1(j10);
            v0Var.F1(keVar.f35653x0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.f35653x0, new nh.z1(3, keVar, v0Var));
        } else {
            keVar.f35639j1 = !keVar.f35639j1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            keVar.X0.V2.N(true);
        }
    }
}
