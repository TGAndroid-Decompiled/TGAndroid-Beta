package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class xb extends w7.x5 {
    public MessageObject f43880a;
    public int f43881b = 0;
    public boolean f43882c = true;
    public int d = 0;
    public int f43883e;
    public final yb f43884f;

    public xb(yb ybVar) {
        this.f43884f = ybVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f43880a;
        yb ybVar = this.f43884f;
        if (messageObject != null) {
            int indexOf = ybVar.f44429o0.indexOf(messageObject) + ybVar.E.f42480f;
            if (indexOf >= 0) {
                ybVar.f44441x.i1(indexOf, this.f43883e, false);
            }
        } else {
            ybVar.f44441x.i1(this.f43881b, this.d, this.f43882c);
        }
        this.f43880a = null;
        ybVar.V = true;
        ybVar.d1();
        AndroidUtilities.runOnUIThread(new pu0(this, 21));
    }

    @Override
    public final void c() {
        yb ybVar = this.f43884f;
        ybVar.K0 = ybVar.getNotificationCenter().setAnimationInProgress(ybVar.K0, yb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f43884f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
