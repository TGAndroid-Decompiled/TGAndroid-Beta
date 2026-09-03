package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends k7.c6 {
    public MessageObject f38447a;
    public int f38448b = 0;
    public boolean f38449c = true;
    public int d = 0;
    public int e;
    public final ub f38450f;

    public tb(ub ubVar) {
        this.f38450f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38447a;
        ub ubVar = this.f38450f;
        if (messageObject != null) {
            int indexOf = ubVar.f38748p0.indexOf(messageObject) + ubVar.F.f37373f;
            if (indexOf >= 0) {
                ubVar.D.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.D.i1(this.f38448b, this.d, this.f38449c);
        }
        this.f38447a = null;
        ubVar.W = true;
        ubVar.e1();
        AndroidUtilities.runOnUIThread(new yt0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f38450f;
        ubVar.L0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.L0, ub.V0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.f38450f.v.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
