package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vb extends w7.b6 {
    public MessageObject f37520a;
    public int f37521b = 0;
    public boolean f37522c = true;
    public int d = 0;
    public int e;
    public final wb f37523f;

    public vb(wb wbVar) {
        this.f37523f = wbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37520a;
        wb wbVar = this.f37523f;
        if (messageObject != null) {
            int indexOf = wbVar.f37813s0.indexOf(messageObject) + wbVar.I.f36637f;
            if (indexOf >= 0) {
                wbVar.G.i1(indexOf, this.e, false);
            }
        } else {
            wbVar.G.i1(this.f37521b, this.d, this.f37522c);
        }
        this.f37520a = null;
        wbVar.Z = true;
        wbVar.e1();
        AndroidUtilities.runOnUIThread(new mu0(this, 21));
    }

    @Override
    public final void c() {
        wb wbVar = this.f37523f;
        wbVar.O0 = wbVar.getNotificationCenter().setAnimationInProgress(wbVar.O0, wb.Y0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f37523f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
