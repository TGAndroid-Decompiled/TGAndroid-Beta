package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class xd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final ke f42689a;

    public xd(ke keVar) {
        this.f42689a = keVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f42689a.f38034w0.presentFragment(new hh1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f42689a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ke keVar = this.f42689a;
        od odVar = keVar.f38033v1;
        int i10 = keVar.f38037y0;
        long j3 = keVar.f38038z0;
        int i11 = ((org.telegram.ui.Components.h51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.f38034w0.presentFragment(new fi.e4(j3));
            }
        } else if (keVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (keVar.A0 == null) {
                return;
            }
            bb1 bb1Var = keVar.f38034w0;
            sg.k0 k0Var = new sg.k0(30, keVar.f38037y0, keVar.getContext(), bb1Var, keVar.f38036x0);
            k0Var.H1(j3);
            k0Var.F1(keVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, keVar.A0, new bi.t2(5, keVar, k0Var));
        } else {
            keVar.f38024m1 = !keVar.f38024m1;
            AndroidUtilities.cancelRunOnUIThread(odVar);
            AndroidUtilities.runOnUIThread(odVar, 1000L);
            keVar.f38013a1.Y2.N(true);
        }
    }
}
