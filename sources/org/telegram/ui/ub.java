package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.a6 {
    public MessageObject f41912a;
    public int f41913b = 0;
    public boolean f41914c = true;
    public int d = 0;
    public int e;
    public final vb f41915f;

    public ub(vb vbVar) {
        this.f41915f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41912a;
        vb vbVar = this.f41915f;
        if (messageObject != null) {
            int indexOf = vbVar.f42172o0.indexOf(messageObject) + vbVar.E.f41104f;
            if (indexOf >= 0) {
                vbVar.f42184x.i1(indexOf, this.e, false);
            }
        } else {
            vbVar.f42184x.i1(this.f41913b, this.d, this.f41914c);
        }
        this.f41912a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new st0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f41915f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f41915f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
