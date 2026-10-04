package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends w7.a6 {
    public MessageObject f41674a;
    public int f41675b = 0;
    public boolean f41676c = true;
    public int d = 0;
    public int f41677e;
    public final wb f41678f;

    public vb(wb wbVar) {
        this.f41678f = wbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41674a;
        wb wbVar = this.f41678f;
        if (messageObject != null) {
            int indexOf = wbVar.f42033o0.indexOf(messageObject) + wbVar.E.f40441f;
            if (indexOf >= 0) {
                wbVar.f42045x.i1(indexOf, this.f41677e, false);
            }
        } else {
            wbVar.f42045x.i1(this.f41675b, this.d, this.f41676c);
        }
        this.f41674a = null;
        wbVar.V = true;
        wbVar.d1();
        AndroidUtilities.runOnUIThread(new hu0(this, 21));
    }

    @Override
    public final void c() {
        wb wbVar = this.f41678f;
        wbVar.K0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.K0, wb.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f41678f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
