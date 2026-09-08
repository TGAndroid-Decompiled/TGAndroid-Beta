package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f40731a;
    public int f40732b = 0;
    public boolean f40733c = true;
    public int d = 0;
    public int f40734e;
    public final ub f40735f;

    public tb(ub ubVar) {
        this.f40735f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40731a;
        ub ubVar = this.f40735f;
        if (messageObject != null) {
            int indexOf = ubVar.f41067s0.indexOf(messageObject) + ubVar.I.f39848f;
            if (indexOf >= 0) {
                ubVar.G.i1(indexOf, this.f40734e, false);
            }
        } else {
            ubVar.G.i1(this.f40732b, this.d, this.f40733c);
        }
        this.f40731a = null;
        ubVar.Z = true;
        ubVar.e1();
        AndroidUtilities.runOnUIThread(new lu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f40735f;
        ubVar.O0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.O0, ub.Y0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f40735f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
