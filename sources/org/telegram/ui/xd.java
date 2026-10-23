package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class xd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final ie f43195a;

    public xd(ie ieVar) {
        this.f43195a = ieVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f43195a.f37956w0.presentFragment(new vf1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.h61 h61Var = (org.telegram.ui.Components.h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f43195a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ie ieVar = this.f43195a;
        od odVar = ieVar.f37955v1;
        int i10 = ieVar.f37959y0;
        long j10 = ieVar.f37960z0;
        int i11 = ((org.telegram.ui.Components.h61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                ieVar.f37956w0.presentFragment(new gi.u3(j10));
            }
        } else if (ieVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (ieVar.A0 == null) {
                return;
            }
            p91 p91Var = ieVar.f37956w0;
            sg.k0 k0Var = new sg.k0(30, ieVar.f37959y0, ieVar.getContext(), p91Var, ieVar.f37958x0);
            k0Var.I1(j10);
            k0Var.G1(ieVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, ieVar.A0, new org.telegram.ui.ActionBar.j3(7, ieVar, k0Var));
        } else {
            ieVar.f37946m1 = !ieVar.f37946m1;
            AndroidUtilities.cancelRunOnUIThread(odVar);
            AndroidUtilities.runOnUIThread(odVar, 1000L);
            ieVar.f37935a1.W2.N(true);
        }
    }
}
