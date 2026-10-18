package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class zd implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final ke f43711a;

    public zd(ke keVar) {
        this.f43711a = keVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f43711a.f38494w0.presentFragment(new xf1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.f61 f61Var = (org.telegram.ui.Components.f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f43711a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ke keVar = this.f43711a;
        qd qdVar = keVar.f38493v1;
        int i10 = keVar.f38497y0;
        long j10 = keVar.f38498z0;
        int i11 = ((org.telegram.ui.Components.f61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.f38494w0.presentFragment(new gi.u3(j10));
            }
        } else if (keVar.B0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (keVar.A0 == null) {
                return;
            }
            r91 r91Var = keVar.f38494w0;
            sg.k0 k0Var = new sg.k0(30, keVar.f38497y0, keVar.getContext(), r91Var, keVar.f38496x0);
            k0Var.I1(j10);
            k0Var.G1(keVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.A0, new org.telegram.ui.ActionBar.j3(7, keVar, k0Var));
        } else {
            keVar.f38484m1 = !keVar.f38484m1;
            AndroidUtilities.cancelRunOnUIThread(qdVar);
            AndroidUtilities.runOnUIThread(qdVar, 1000L);
            keVar.f38473a1.W2.N(true);
        }
    }
}
