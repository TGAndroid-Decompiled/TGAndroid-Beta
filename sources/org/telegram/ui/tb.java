package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f37632a;
    public int f37633b = 0;
    public boolean f37634c = true;
    public int d = 0;
    public int e;
    public final ub f37635f;

    public tb(ub ubVar) {
        this.f37635f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37632a;
        ub ubVar = this.f37635f;
        if (messageObject != null) {
            int indexOf = ubVar.f37955o0.indexOf(messageObject) + ubVar.E.f36833f;
            if (indexOf >= 0) {
                ubVar.f37967x.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.f37967x.i1(this.f37633b, this.d, this.f37634c);
        }
        this.f37632a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f37635f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f37635f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
