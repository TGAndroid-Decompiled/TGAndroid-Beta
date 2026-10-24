package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class xd implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final ie f43528a;

    public xd(ie ieVar) {
        this.f43528a = ieVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f43528a.f38260w0.presentFragment(new ag1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f43528a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ie ieVar = this.f43528a;
        od odVar = ieVar.f38259v1;
        int i10 = ieVar.f38263y0;
        long j10 = ieVar.f38264z0;
        int i11 = ((org.telegram.ui.Components.l61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                ieVar.f38260w0.presentFragment(new gi.u3(j10));
            }
        } else if (ieVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (ieVar.A0 == null) {
                return;
            }
            t91 t91Var = ieVar.f38260w0;
            sg.j0 j0Var = new sg.j0(30, ieVar.f38263y0, ieVar.getContext(), t91Var, ieVar.f38262x0);
            j0Var.L1(j10);
            j0Var.J1(ieVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, ieVar.A0, new org.telegram.ui.ActionBar.m3(7, ieVar, j0Var));
        } else {
            ieVar.f38250m1 = !ieVar.f38250m1;
            AndroidUtilities.cancelRunOnUIThread(odVar);
            AndroidUtilities.runOnUIThread(odVar, 1000L);
            ieVar.f38239a1.Z2.N(true);
        }
    }
}
