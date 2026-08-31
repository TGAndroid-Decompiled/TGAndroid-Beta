package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class zd implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final ke f43905a;

    public zd(ke keVar) {
        this.f43905a = keVar;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f43905a.f38376t0.presentFragment(new qg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f43905a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        ke keVar = this.f43905a;
        pd pdVar = keVar.f38375s1;
        int i10 = keVar.f38379v0;
        long j10 = keVar.f38380w0;
        int i11 = ((org.telegram.ui.Components.j51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.f38376t0.presentFragment(new sh.d3(j10));
            }
        } else if (keVar.f38382y0 < MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
            if (keVar.f38381x0 == null) {
                return;
            }
            ha1 ha1Var = keVar.f38376t0;
            fg.v0 v0Var = new fg.v0(30, keVar.f38379v0, keVar.getContext(), ha1Var, keVar.f38378u0);
            v0Var.H1(j10);
            v0Var.F1(keVar.f38381x0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.f38381x0, new oh.a2(3, keVar, v0Var));
        } else {
            keVar.f38367j1 = !keVar.f38367j1;
            AndroidUtilities.cancelRunOnUIThread(pdVar);
            AndroidUtilities.runOnUIThread(pdVar, 1000L);
            keVar.X0.V2.N(true);
        }
    }
}
