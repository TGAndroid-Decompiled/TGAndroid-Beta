package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class qn extends w7.b6 {
    public MessageObject f36101a;
    public int f36102b = 0;
    public boolean f36103c = true;
    public int d = 0;
    public int e;
    public boolean f36104f;
    public int f36105g;
    public final eo h;

    public qn(eo eoVar) {
        this.h = eoVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36101a;
        eo eoVar = this.h;
        if (messageObject != null) {
            eoVar.A0.T();
            int indexOf = eoVar.f32509u6.indexOf(this.f36101a) + eoVar.A0.J;
            if (indexOf >= 0) {
                eoVar.f32567z0.i1(indexOf, (int) ((this.e + this.f36105g) - eoVar.f32487s9), this.f36104f);
            }
        } else {
            eoVar.A0.T();
            eoVar.f32567z0.i1(this.f36102b, this.d, this.f36103c);
        }
        this.f36101a = null;
        eoVar.f32405m3 = true;
        eoVar.Wc(false);
        AndroidUtilities.runOnUIThread(new fj(this, 8));
    }

    @Override
    public final void c() {
        eo eoVar = this.h;
        eoVar.I9 = eoVar.getNotificationCenter().setAnimationInProgress(eoVar.I9, eo.Nc);
        xk xkVar = eoVar.f32539wa;
        if (xkVar.f36468n) {
            xkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
