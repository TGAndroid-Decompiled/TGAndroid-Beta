package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class zb extends w7.b6 {
    public MessageObject f42585a;
    public int f42586b = 0;
    public boolean f42587c = true;
    public int d = 0;
    public int e;
    public final ac f42588f;

    public zb(ac acVar) {
        this.f42588f = acVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42585a;
        ac acVar = this.f42588f;
        if (messageObject != null) {
            int indexOf = acVar.f34148o0.indexOf(messageObject) + acVar.E.f41233f;
            if (indexOf >= 0) {
                acVar.f34160x.i1(indexOf, this.e, false);
            }
        } else {
            acVar.f34160x.i1(this.f42586b, this.d, this.f42587c);
        }
        this.f42585a = null;
        acVar.V = true;
        acVar.d1();
        AndroidUtilities.runOnUIThread(new tu0(this, 21));
    }

    @Override
    public final void c() {
        ac acVar = this.f42588f;
        acVar.K0 = acVar.getNotificationCenter().setAnimationInProgress(acVar.K0, ac.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f42588f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
