package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class sd implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final de f42360a;

    public sd(de deVar) {
        this.f42360a = deVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f42360a.f37521s0.presentFragment(new cg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.w41 w41Var = (org.telegram.ui.Components.w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f42360a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        de deVar = this.f42360a;
        jd jdVar = deVar.f37520r1;
        int i10 = deVar.f37524u0;
        long j10 = deVar.f37525v0;
        int i11 = ((org.telegram.ui.Components.w41) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                deVar.f37521s0.presentFragment(new ph.d3(j10));
            }
        } else if (deVar.f37527x0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (deVar.f37526w0 == null) {
                return;
            }
            t91 t91Var = deVar.f37521s0;
            cg.v0 v0Var = new cg.v0(30, deVar.f37524u0, deVar.getContext(), t91Var, deVar.f37523t0);
            v0Var.H1(j10);
            v0Var.F1(deVar.f37526w0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, deVar.f37526w0, new lh.y1(3, deVar, v0Var));
        } else {
            deVar.f37512i1 = !deVar.f37512i1;
            AndroidUtilities.cancelRunOnUIThread(jdVar);
            AndroidUtilities.runOnUIThread(jdVar, 1000L);
            deVar.W0.U2.N(true);
        }
    }
}
