package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class xb extends w7.x5 {
    public MessageObject f43875a;
    public int f43876b = 0;
    public boolean f43877c = true;
    public int d = 0;
    public int f43878e;
    public final yb f43879f;

    public xb(yb ybVar) {
        this.f43879f = ybVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f43875a;
        yb ybVar = this.f43879f;
        if (messageObject != null) {
            int indexOf = ybVar.f44424o0.indexOf(messageObject) + ybVar.E.f42478f;
            if (indexOf >= 0) {
                ybVar.f44436x.i1(indexOf, this.f43878e, false);
            }
        } else {
            ybVar.f44436x.i1(this.f43876b, this.d, this.f43877c);
        }
        this.f43875a = null;
        ybVar.V = true;
        ybVar.d1();
        AndroidUtilities.runOnUIThread(new pu0(this, 21));
    }

    @Override
    public final void c() {
        yb ybVar = this.f43879f;
        ybVar.K0 = ybVar.getNotificationCenter().setAnimationInProgress(ybVar.K0, yb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f43879f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
