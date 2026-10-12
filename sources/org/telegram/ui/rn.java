package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class rn extends w7.b6 {
    public MessageObject f39829a;
    public int f39830b = 0;
    public boolean f39831c = true;
    public int d = 0;
    public int e;
    public boolean f39832f;
    public int f39833g;
    public final fo h;

    public rn(fo foVar) {
        this.h = foVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39829a;
        fo foVar = this.h;
        if (messageObject != null) {
            foVar.A0.T();
            int indexOf = foVar.f36127u6.indexOf(this.f39829a) + foVar.A0.J;
            if (indexOf >= 0) {
                foVar.f36185z0.i1(indexOf, (int) ((this.e + this.f39833g) - foVar.f36104s9), this.f39832f);
            }
        } else {
            foVar.A0.T();
            foVar.f36185z0.i1(this.f39830b, this.d, this.f39831c);
        }
        this.f39829a = null;
        foVar.f36022m3 = true;
        foVar.ad(false);
        AndroidUtilities.runOnUIThread(new gj(this, 9));
    }

    @Override
    public final void c() {
        fo foVar = this.h;
        foVar.I9 = foVar.getNotificationCenter().setAnimationInProgress(foVar.I9, fo.Nc);
        bl blVar = foVar.f36156wa;
        if (blVar.f41674n) {
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
