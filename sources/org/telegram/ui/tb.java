package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.z5 {
    public MessageObject f38147a;
    public int f38148b = 0;
    public boolean f38149c = true;
    public int d = 0;
    public int e;
    public final ub f38150f;

    public tb(ub ubVar) {
        this.f38150f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38147a;
        ub ubVar = this.f38150f;
        if (messageObject != null) {
            int indexOf = ubVar.f38495o0.indexOf(messageObject) + ubVar.E.f36947f;
            if (indexOf >= 0) {
                ubVar.f38507x.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.f38507x.i1(this.f38148b, this.d, this.f38149c);
        }
        this.f38147a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new eu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f38150f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f38150f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
