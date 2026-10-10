package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.y5 {
    public MessageObject f42433a;
    public int f42434b = 0;
    public boolean f42435c = true;
    public int d = 0;
    public int f42436e;
    public final vb f42437f;

    public ub(vb vbVar) {
        this.f42437f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42433a;
        vb vbVar = this.f42437f;
        if (messageObject != null) {
            int indexOf = vbVar.f42831o0.indexOf(messageObject) + vbVar.E.f41411f;
            if (indexOf >= 0) {
                vbVar.f42843x.i1(indexOf, this.f42436e, false);
            }
        } else {
            vbVar.f42843x.i1(this.f42434b, this.d, this.f42435c);
        }
        this.f42433a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new nu0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f42437f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f42437f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
