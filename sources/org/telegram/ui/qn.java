package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class qn extends w7.x5 {
    public MessageObject f41365a;
    public int f41366b = 0;
    public boolean f41367c = true;
    public int d = 0;
    public int f41368e;
    public boolean f41369f;
    public int f41370g;
    public final eo h;

    public qn(eo eoVar) {
        this.h = eoVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41365a;
        eo eoVar = this.h;
        if (messageObject != null) {
            eoVar.A0.T();
            int indexOf = eoVar.f37444u6.indexOf(this.f41365a) + eoVar.A0.J;
            if (indexOf >= 0) {
                eoVar.f37502z0.i1(indexOf, (int) ((this.f41368e + this.f41370g) - eoVar.f37422s9), this.f41369f);
            }
        } else {
            eoVar.A0.T();
            eoVar.f37502z0.i1(this.f41366b, this.d, this.f41367c);
        }
        this.f41365a = null;
        eoVar.f37340m3 = true;
        eoVar.ad(false);
        AndroidUtilities.runOnUIThread(new gj(this, 9));
    }

    @Override
    public final void c() {
        eo eoVar = this.h;
        eoVar.I9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.I9, eo.Nc);
        bl blVar = eoVar.f37474wa;
        if (blVar.f42003n) {
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
