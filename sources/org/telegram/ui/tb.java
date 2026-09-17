package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f40732a;
    public int f40733b = 0;
    public boolean f40734c = true;
    public int d = 0;
    public int f40735e;
    public final ub f40736f;

    public tb(ub ubVar) {
        this.f40736f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40732a;
        ub ubVar = this.f40736f;
        if (messageObject != null) {
            int indexOf = ubVar.f41068s0.indexOf(messageObject) + ubVar.I.f39849f;
            if (indexOf >= 0) {
                ubVar.G.i1(indexOf, this.f40735e, false);
            }
        } else {
            ubVar.G.i1(this.f40733b, this.d, this.f40734c);
        }
        this.f40732a = null;
        ubVar.Z = true;
        ubVar.e1();
        AndroidUtilities.runOnUIThread(new lu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f40736f;
        ubVar.O0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.O0, ub.Y0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f40736f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
