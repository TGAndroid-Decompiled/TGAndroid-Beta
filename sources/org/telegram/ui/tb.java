package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f42178a;
    public int f42179b = 0;
    public boolean f42180c = true;
    public int d = 0;
    public int f42181e;
    public final ub f42182f;

    public tb(ub ubVar) {
        this.f42182f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42178a;
        ub ubVar = this.f42182f;
        if (messageObject != null) {
            int indexOf = ubVar.f42521o0.indexOf(messageObject) + ubVar.E.f41161f;
            if (indexOf >= 0) {
                ubVar.f42533x.i1(indexOf, this.f42181e, false);
            }
        } else {
            ubVar.f42533x.i1(this.f42179b, this.d, this.f42180c);
        }
        this.f42178a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f42182f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f42182f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
