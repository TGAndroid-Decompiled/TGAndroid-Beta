package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f37623a;
    public int f37624b = 0;
    public boolean f37625c = true;
    public int d = 0;
    public int e;
    public final ub f37626f;

    public tb(ub ubVar) {
        this.f37626f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37623a;
        ub ubVar = this.f37626f;
        if (messageObject != null) {
            int indexOf = ubVar.f37921o0.indexOf(messageObject) + ubVar.E.f36823f;
            if (indexOf >= 0) {
                ubVar.f37933x.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.f37933x.i1(this.f37624b, this.d, this.f37625c);
        }
        this.f37623a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f37626f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f37626f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
