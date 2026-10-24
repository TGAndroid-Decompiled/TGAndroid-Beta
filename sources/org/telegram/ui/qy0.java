package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class qy0 extends org.telegram.ui.Components.hr0 {
    public final ry0 f40960e1;

    public qy0(ry0 ry0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f40960e1 = ry0Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new lv0(this, hVar, i10, 15), 250L);
    }
}
