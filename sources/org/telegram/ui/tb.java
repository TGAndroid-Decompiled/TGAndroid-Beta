package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f37595a;
    public int f37596b = 0;
    public boolean f37597c = true;
    public int d = 0;
    public int e;
    public final ub f37598f;

    public tb(ub ubVar) {
        this.f37598f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37595a;
        ub ubVar = this.f37598f;
        if (messageObject != null) {
            int indexOf = ubVar.f38027o0.indexOf(messageObject) + ubVar.E.f36379f;
            if (indexOf >= 0) {
                ubVar.f38039x.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.f38039x.i1(this.f37596b, this.d, this.f37597c);
        }
        this.f37595a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new fu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f37598f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f37598f.h.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
