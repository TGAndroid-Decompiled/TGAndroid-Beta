package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.z5 {
    public MessageObject f37954a;
    public int f37955b = 0;
    public boolean f37956c = true;
    public int d = 0;
    public int e;
    public final vb f37957f;

    public ub(vb vbVar) {
        this.f37957f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37954a;
        vb vbVar = this.f37957f;
        if (messageObject != null) {
            int indexOf = vbVar.f38429o0.indexOf(messageObject) + vbVar.E.f37018f;
            if (indexOf >= 0) {
                vbVar.f38441x.i1(indexOf, this.e, false);
            }
        } else {
            vbVar.f38441x.i1(this.f37955b, this.d, this.f37956c);
        }
        this.f37954a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f37957f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f37957f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
