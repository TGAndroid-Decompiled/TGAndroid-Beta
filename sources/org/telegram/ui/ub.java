package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.a6 {
    public MessageObject f42354a;
    public int f42355b = 0;
    public boolean f42356c = true;
    public int d = 0;
    public int e;
    public final vb f42357f;

    public ub(vb vbVar) {
        this.f42357f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42354a;
        vb vbVar = this.f42357f;
        if (messageObject != null) {
            int indexOf = vbVar.f42696o0.indexOf(messageObject) + vbVar.E.f41077f;
            if (indexOf >= 0) {
                vbVar.f42708x.i1(indexOf, this.e, false);
            }
        } else {
            vbVar.f42708x.i1(this.f42355b, this.d, this.f42356c);
        }
        this.f42354a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new vt0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f42357f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f42357f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
