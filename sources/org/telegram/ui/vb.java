package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends w7.z5 {
    public MessageObject f38537a;
    public int f38538b = 0;
    public boolean f38539c = true;
    public int d = 0;
    public int e;
    public final wb f38540f;

    public vb(wb wbVar) {
        this.f38540f = wbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38537a;
        wb wbVar = this.f38540f;
        if (messageObject != null) {
            int indexOf = wbVar.f38887o0.indexOf(messageObject) + wbVar.E.f37384f;
            if (indexOf >= 0) {
                wbVar.f38899x.i1(indexOf, this.e, false);
            }
        } else {
            wbVar.f38899x.i1(this.f38538b, this.d, this.f38539c);
        }
        this.f38537a = null;
        wbVar.V = true;
        wbVar.d1();
        AndroidUtilities.runOnUIThread(new hu0(this, 21));
    }

    @Override
    public final void c() {
        wb wbVar = this.f38540f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f38540f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
