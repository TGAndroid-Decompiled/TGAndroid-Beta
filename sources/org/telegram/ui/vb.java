package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends org.telegram.ui.Components.kb1 {
    public MessageObject f44226c;
    public int d = 0;
    public boolean e = true;
    public int f44227f = 0;
    public int f44228g;
    public final wb h;

    public vb(wb wbVar) {
        this.h = wbVar;
    }

    @Override
    public final void N() {
        MessageObject messageObject = this.f44226c;
        wb wbVar = this.h;
        if (messageObject != null) {
            int indexOf = wbVar.f44604o0.indexOf(messageObject) + wbVar.E.f43287f;
            if (indexOf >= 0) {
                wbVar.f44616x.i1(indexOf, this.f44228g, false);
            }
        } else {
            wbVar.f44616x.i1(this.d, this.f44227f, this.e);
        }
        this.f44226c = null;
        wbVar.V = true;
        wbVar.e1();
        AndroidUtilities.runOnUIThread(new bu0(this, 21));
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
