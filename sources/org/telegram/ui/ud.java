package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

public final class ud implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {

    public final fe f43189a;

    public ud(fe feVar) {
        this.f43189a = feVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f43189a.f38097s0.presentFragment(new zf1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f43189a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        fe feVar = this.f43189a;
        kd kdVar = feVar.f38096r1;
        int i10 = feVar.f38100u0;
        long j10 = feVar.f38101v0;
        int i11 = ((org.telegram.ui.Components.n41) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                feVar.f38097s0.presentFragment(new nh.s3(j10));
            }
        } else {
            if (feVar.f38103x0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                feVar.f38088i1 = !feVar.f38088i1;
                AndroidUtilities.cancelRunOnUIThread(kdVar);
                AndroidUtilities.runOnUIThread(kdVar, 1000L);
                feVar.W0.U2.N(true);
                return;
            }
            if (feVar.f38102w0 == null) {
                return;
            }
            ag.i1 i1Var = new ag.i1(30, feVar.f38100u0, feVar.getContext(), feVar.f38097s0, feVar.f38099t0);
            i1Var.H1(j10);
            i1Var.F1(feVar.f38102w0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, feVar.f38102w0, new jh.y1(3, feVar, i1Var));
        }
    }
}
