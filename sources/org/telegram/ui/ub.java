package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ub extends w7.z5 {
    public MessageObject f38046a;
    public int f38047b = 0;
    public boolean f38048c = true;
    public int d = 0;
    public int e;
    public final vb f38049f;

    public ub(vb vbVar) {
        this.f38049f = vbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38046a;
        vb vbVar = this.f38049f;
        if (messageObject != null) {
            int indexOf = vbVar.f38511o0.indexOf(messageObject) + vbVar.E.f37119f;
            if (indexOf >= 0) {
                vbVar.f38523x.i1(indexOf, this.e, false);
            }
        } else {
            vbVar.f38523x.i1(this.f38047b, this.d, this.f38048c);
        }
        this.f38046a = null;
        vbVar.V = true;
        vbVar.d1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override
    public final void c() {
        vb vbVar = this.f38049f;
        vbVar.K0 = vbVar.getNotificationCenter().setAnimationInProgress(vbVar.K0, vb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f38049f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
