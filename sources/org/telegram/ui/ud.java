package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ud implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final fe f43220a;

    public ud(fe feVar) {
        this.f43220a = feVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f43220a.f38235s0.presentFragment(new ag1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f43220a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        fe feVar = this.f43220a;
        kd kdVar = feVar.f38234r1;
        int i9 = feVar.f38238u0;
        long j10 = feVar.f38239v0;
        int i10 = ((org.telegram.ui.Components.l41) obj).d;
        if (i10 != 1) {
            if (i10 == 4) {
                feVar.f38235s0.presentFragment(new mh.u3(j10));
            }
        } else if (feVar.f38241x0 < MessagesController.getInstance(i9).channelRestrictSponsoredLevelMin) {
            if (feVar.f38240w0 == null) {
                return;
            }
            s91 s91Var = feVar.f38235s0;
            zf.j0 j0Var = new zf.j0(30, feVar.f38238u0, feVar.getContext(), s91Var, feVar.f38237t0);
            j0Var.H1(j10);
            j0Var.F1(feVar.f38240w0, true);
            MessagesController.getInstance(i9).getBoostsController().userCanBoostChannel(j10, feVar.f38240w0, new ih.a2(3, feVar, j0Var));
        } else {
            feVar.f38226i1 = !feVar.f38226i1;
            AndroidUtilities.cancelRunOnUIThread(kdVar);
            AndroidUtilities.runOnUIThread(kdVar, 1000L);
            feVar.W0.U2.N(true);
        }
    }
}
