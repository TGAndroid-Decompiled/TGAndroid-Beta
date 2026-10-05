package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends w7.a6 {
    public MessageObject f41688a;
    public int f41689b = 0;
    public boolean f41690c = true;
    public int d = 0;
    public int f41691e;
    public final wb f41692f;

    public vb(wb wbVar) {
        this.f41692f = wbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41688a;
        wb wbVar = this.f41692f;
        if (messageObject != null) {
            int indexOf = wbVar.f42055o0.indexOf(messageObject) + wbVar.E.f40429f;
            if (indexOf >= 0) {
                wbVar.f42067x.i1(indexOf, this.f41691e, false);
            }
        } else {
            wbVar.f42067x.i1(this.f41689b, this.d, this.f41690c);
        }
        this.f41688a = null;
        wbVar.V = true;
        wbVar.d1();
        AndroidUtilities.runOnUIThread(new hu0(this, 21));
    }

    @Override
    public final void c() {
        wb wbVar = this.f41692f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f41692f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
