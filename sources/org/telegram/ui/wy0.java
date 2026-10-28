package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class wy0 extends org.telegram.ui.Components.nr0 {
    public final xy0 f45428a1;

    public wy0(xy0 xy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f45428a1 = xy0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new by0(this, hVar, i10, 6), 250L);
    }
}
