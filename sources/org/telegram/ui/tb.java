package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tb extends w7.z5 {
    public MessageObject f38038a;
    public int f38039b = 0;
    public boolean f38040c = true;
    public int d = 0;
    public int e;
    public final ub f38041f;

    public tb(ub ubVar) {
        this.f38041f = ubVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38038a;
        ub ubVar = this.f38041f;
        if (messageObject != null) {
            int indexOf = ubVar.f38406o0.indexOf(messageObject) + ubVar.E.f36848f;
            if (indexOf >= 0) {
                ubVar.f38418x.i1(indexOf, this.e, false);
            }
        } else {
            ubVar.f38418x.i1(this.f38039b, this.d, this.f38040c);
        }
        this.f38038a = null;
        ubVar.V = true;
        ubVar.d1();
        AndroidUtilities.runOnUIThread(new eu0(this, 21));
    }

    @Override
    public final void c() {
        ub ubVar = this.f38041f;
        ubVar.K0 = ubVar.getNotificationCenter().setAnimationInProgress(ubVar.K0, ub.R0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            this.f38041f.h.add((org.telegram.ui.Cells.u1) view);
        }
    }
}
