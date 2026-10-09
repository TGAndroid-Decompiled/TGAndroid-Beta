package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.y5 {
    public MessageObject f42389a;
    public int f42390b = 0;
    public boolean f42391c = true;
    public int d = 0;
    public int f42392e;
    public final vb f42393f;

    public ub(vb vbVar) {
        this.f42393f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42389a;
        vb vbVar = this.f42393f;
        if (messageObject != null) {
            int indexOf = vbVar.f42787o0.indexOf(messageObject) + vbVar.E.f41367f;
            if (indexOf >= 0) {
                vbVar.f42799x.i1(indexOf, this.f42392e, false);
            }
        } else {
            vbVar.f42799x.i1(this.f42390b, this.d, this.f42391c);
        }
        this.f42389a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new nu0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f42393f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f42393f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
