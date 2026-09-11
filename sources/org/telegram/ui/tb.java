package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.y5 {
    public MessageObject f40704a;
    public int f40705b = 0;
    public boolean f40706c = true;
    public int d = 0;
    public int f40707e;
    public final ub f40708f;

    public tb(ub ubVar) {
        this.f40708f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40704a;
        ub ubVar = this.f40708f;
        if (messageObject != null) {
            int indexOf = ubVar.f41040s0.indexOf(messageObject) + ubVar.I.f39821f;
            if (indexOf >= 0) {
                ubVar.G.i1(indexOf, this.f40707e, false);
            }
        } else {
            ubVar.G.i1(this.f40705b, this.d, this.f40706c);
        }
        this.f40704a = null;
        ubVar.Z = true;
        ubVar.e1();
        AndroidUtilities.runOnUIThread(new lu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f40708f;
        ubVar.O0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.O0, ub.Y0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f40708f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
