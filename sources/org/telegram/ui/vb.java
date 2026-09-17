package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends w7.y5 {
    public MessageObject f38371a;
    public int f38372b = 0;
    public boolean f38373c = true;
    public int d = 0;
    public int e;
    public final wb f38374f;

    public vb(wb wbVar) {
        this.f38374f = wbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38371a;
        wb wbVar = this.f38374f;
        if (messageObject != null) {
            int indexOf = wbVar.f38662o0.indexOf(messageObject) + wbVar.E.f37446f;
            if (indexOf >= 0) {
                wbVar.f38674x.i1(indexOf, this.e, false);
            }
        } else {
            wbVar.f38674x.i1(this.f38372b, this.d, this.f38373c);
        }
        this.f38371a = null;
        wbVar.V = true;
        wbVar.d1();
        AndroidUtilities.runOnUIThread(new ou0(this, 21));
    }

    @Override
    public final void c() {
        wb wbVar = this.f38374f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f38374f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
