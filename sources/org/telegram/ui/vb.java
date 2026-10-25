package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends org.telegram.ui.Components.gb1 {
    public MessageObject f44757c;
    public int d = 0;
    public boolean e = true;
    public int f44758f = 0;
    public int f44759g;
    public final wb h;

    public vb(wb wbVar) {
        this.h = wbVar;
    }

    @Override
    public final void N() {
        MessageObject messageObject = this.f44757c;
        wb wbVar = this.h;
        if (messageObject != null) {
            int indexOf = wbVar.f45075o0.indexOf(messageObject) + wbVar.E.f43440f;
            if (indexOf >= 0) {
                wbVar.f45087x.i1(indexOf, this.f44759g, false);
            }
        } else {
            wbVar.f45087x.i1(this.d, this.f44758f, this.e);
        }
        this.f44757c = null;
        wbVar.V = true;
        wbVar.e1();
        AndroidUtilities.runOnUIThread(new zt0(this, 21));
    }

    @Override
    public final void Q() {
        wb wbVar = this.h;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override
    public final void S(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.h.h.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
