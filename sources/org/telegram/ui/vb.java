package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends org.telegram.ui.Components.gb1 {
    public MessageObject f44760c;
    public int d = 0;
    public boolean e = true;
    public int f44761f = 0;
    public int f44762g;
    public final wb h;

    public vb(wb wbVar) {
        this.h = wbVar;
    }

    @Override
    public final void N() {
        MessageObject messageObject = this.f44760c;
        wb wbVar = this.h;
        if (messageObject != null) {
            int indexOf = wbVar.f45078o0.indexOf(messageObject) + wbVar.E.f43443f;
            if (indexOf >= 0) {
                wbVar.f45090x.i1(indexOf, this.f44762g, false);
            }
        } else {
            wbVar.f45090x.i1(this.d, this.f44761f, this.e);
        }
        this.f44760c = null;
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
