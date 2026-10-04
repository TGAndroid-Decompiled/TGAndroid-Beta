package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends w7.a6 {
    public MessageObject f41681a;
    public int f41682b = 0;
    public boolean f41683c = true;
    public int d = 0;
    public int f41684e;
    public final wb f41685f;

    public vb(wb wbVar) {
        this.f41685f = wbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41681a;
        wb wbVar = this.f41685f;
        if (messageObject != null) {
            int indexOf = wbVar.f42040o0.indexOf(messageObject) + wbVar.E.f40446f;
            if (indexOf >= 0) {
                wbVar.f42052x.i1(indexOf, this.f41684e, false);
            }
        } else {
            wbVar.f42052x.i1(this.f41682b, this.d, this.f41683c);
        }
        this.f41681a = null;
        wbVar.V = true;
        wbVar.d1();
        AndroidUtilities.runOnUIThread(new hu0(this, 21));
    }

    @Override
    public final void c() {
        wb wbVar = this.f41685f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f41685f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
