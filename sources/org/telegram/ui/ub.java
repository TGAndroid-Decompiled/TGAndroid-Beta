package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.a6 {
    public MessageObject f41928a;
    public int f41929b = 0;
    public boolean f41930c = true;
    public int d = 0;
    public int e;
    public final vb f41931f;

    public ub(vb vbVar) {
        this.f41931f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41928a;
        vb vbVar = this.f41931f;
        if (messageObject != null) {
            int indexOf = vbVar.f42173o0.indexOf(messageObject) + vbVar.E.f41112f;
            if (indexOf >= 0) {
                vbVar.f42185x.i1(indexOf, this.e, false);
            }
        } else {
            vbVar.f42185x.i1(this.f41929b, this.d, this.f41930c);
        }
        this.f41928a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new st0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f41931f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f41931f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
