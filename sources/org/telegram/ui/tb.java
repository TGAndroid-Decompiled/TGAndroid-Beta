package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f40705a;
    public int f40706b = 0;
    public boolean f40707c = true;
    public int d = 0;
    public int f40708e;
    public final ub f40709f;

    public tb(ub ubVar) {
        this.f40709f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40705a;
        ub ubVar = this.f40709f;
        if (messageObject != null) {
            int indexOf = ubVar.f41041s0.indexOf(messageObject) + ubVar.I.f39822f;
            if (indexOf >= 0) {
                ubVar.G.i1(indexOf, this.f40708e, false);
            }
        } else {
            ubVar.G.i1(this.f40706b, this.d, this.f40707c);
        }
        this.f40705a = null;
        ubVar.Z = true;
        ubVar.e1();
        AndroidUtilities.runOnUIThread(new lu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f40709f;
        ubVar.O0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.O0, ub.Y0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f40709f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
