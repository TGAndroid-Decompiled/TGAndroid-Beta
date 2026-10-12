package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class qn extends w7.x5 {
    public MessageObject f41369a;
    public int f41370b = 0;
    public boolean f41371c = true;
    public int d = 0;
    public int f41372e;
    public boolean f41373f;
    public int f41374g;
    public final eo h;

    public qn(eo eoVar) {
        this.h = eoVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41369a;
        eo eoVar = this.h;
        if (messageObject != null) {
            eoVar.A0.T();
            int indexOf = eoVar.f37449u6.indexOf(this.f41369a) + eoVar.A0.J;
            if (indexOf >= 0) {
                eoVar.f37507z0.i1(indexOf, (int) ((this.f41372e + this.f41374g) - eoVar.f37427s9), this.f41373f);
            }
        } else {
            eoVar.A0.T();
            eoVar.f37507z0.i1(this.f41370b, this.d, this.f41371c);
        }
        this.f41369a = null;
        eoVar.f37345m3 = true;
        eoVar.ad(false);
        AndroidUtilities.runOnUIThread(new gj(this, 9));
    }

    @Override
    public final void c() {
        eo eoVar = this.h;
        eoVar.I9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.I9, eo.Nc);
        bl blVar = eoVar.f37479wa;
        if (blVar.f42007n) {
            blVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
