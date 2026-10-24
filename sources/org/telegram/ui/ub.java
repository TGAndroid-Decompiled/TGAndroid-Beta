package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.a6 {
    public MessageObject f42366a;
    public int f42367b = 0;
    public boolean f42368c = true;
    public int d = 0;
    public int e;
    public final vb f42369f;

    public ub(vb vbVar) {
        this.f42369f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42366a;
        vb vbVar = this.f42369f;
        if (messageObject != null) {
            int indexOf = vbVar.f42664o0.indexOf(messageObject) + vbVar.E.f41084f;
            if (indexOf >= 0) {
                vbVar.f42676x.i1(indexOf, this.e, false);
            }
        } else {
            vbVar.f42676x.i1(this.f42367b, this.d, this.f42368c);
        }
        this.f42366a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new ut0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f42369f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f42369f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
