package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends w7.a6 {
    public MessageObject f41673a;
    public int f41674b = 0;
    public boolean f41675c = true;
    public int d = 0;
    public int f41676e;
    public final wb f41677f;

    public vb(wb wbVar) {
        this.f41677f = wbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41673a;
        wb wbVar = this.f41677f;
        if (messageObject != null) {
            int indexOf = wbVar.f42032o0.indexOf(messageObject) + wbVar.E.f40440f;
            if (indexOf >= 0) {
                wbVar.f42044x.i1(indexOf, this.f41676e, false);
            }
        } else {
            wbVar.f42044x.i1(this.f41674b, this.d, this.f41675c);
        }
        this.f41673a = null;
        wbVar.V = true;
        wbVar.d1();
        AndroidUtilities.runOnUIThread(new hu0(this, 21));
    }

    @Override
    public final void c() {
        wb wbVar = this.f41677f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f41677f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
