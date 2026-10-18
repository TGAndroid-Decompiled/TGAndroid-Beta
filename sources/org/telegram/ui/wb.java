package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class wb extends w7.a6 {
    public MessageObject f42471a;
    public int f42472b = 0;
    public boolean f42473c = true;
    public int d = 0;
    public int e;
    public final xb f42474f;

    public wb(xb xbVar) {
        this.f42474f = xbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f42471a;
        xb xbVar = this.f42474f;
        if (messageObject != null) {
            int indexOf = xbVar.f43044o0.indexOf(messageObject) + xbVar.E.f41632f;
            if (indexOf >= 0) {
                xbVar.f43056x.i1(indexOf, this.e, false);
            }
        } else {
            xbVar.f43056x.i1(this.f42472b, this.d, this.f42473c);
        }
        this.f42471a = null;
        xbVar.V = true;
        xbVar.d1();
        AndroidUtilities.runOnUIThread(new ut0(this, 21));
    }

    @Override
    public final void c() {
        xb xbVar = this.f42474f;
        xbVar.K0 = xbVar.getNotificationCenter().setAnimationInProgress(xbVar.K0, xb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f42474f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
