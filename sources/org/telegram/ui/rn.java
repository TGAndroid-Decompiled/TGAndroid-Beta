package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class rn extends w7.a6 {
    public MessageObject f39553a;
    public int f39554b = 0;
    public boolean f39555c = true;
    public int d = 0;
    public int e;
    public boolean f39556f;
    public int f39557g;
    public final fo h;

    public rn(fo foVar) {
        this.h = foVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39553a;
        fo foVar = this.h;
        if (messageObject != null) {
            foVar.A0.T();
            int indexOf = foVar.f35828u6.indexOf(this.f39553a) + foVar.A0.J;
            if (indexOf >= 0) {
                foVar.f35886z0.i1(indexOf, (int) ((this.e + this.f39557g) - foVar.f35805s9), this.f39556f);
            }
        } else {
            foVar.A0.T();
            foVar.f35886z0.i1(this.f39554b, this.d, this.f39555c);
        }
        this.f39553a = null;
        foVar.f35723m3 = true;
        foVar.ad(false);
        AndroidUtilities.runOnUIThread(new gj(this, 9));
    }

    @Override
    public final void c() {
        fo foVar = this.h;
        foVar.I9 = foVar.getNotificationCenter().setAnimationInProgress(foVar.I9, fo.Nc);
        bl blVar = foVar.f35857wa;
        if (blVar.f40779n) {
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
