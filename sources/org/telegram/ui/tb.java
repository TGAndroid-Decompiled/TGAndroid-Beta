package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f42144a;
    public int f42145b = 0;
    public boolean f42146c = true;
    public int d = 0;
    public int f42147e;
    public final ub f42148f;

    public tb(ub ubVar) {
        this.f42148f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42144a;
        ub ubVar = this.f42148f;
        if (messageObject != null) {
            int indexOf = ubVar.f42487o0.indexOf(messageObject) + ubVar.E.f41127f;
            if (indexOf >= 0) {
                ubVar.f42499x.i1(indexOf, this.f42147e, false);
            }
        } else {
            ubVar.f42499x.i1(this.f42145b, this.d, this.f42146c);
        }
        this.f42144a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f42148f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f42148f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
