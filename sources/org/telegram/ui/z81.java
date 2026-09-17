package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class z81 extends org.telegram.ui.Components.iq0 {
    public final g91 f40156b1;

    public z81(g91 g91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f40156b1 = g91Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ky0(this, iVar, i10, 26), 250L);
    }
}
