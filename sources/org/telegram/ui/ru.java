package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ru extends org.telegram.ui.Components.op0 {
    public final su R2;

    public ru(su suVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = suVar;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new xs(this, hVar, i10), 250L);
    }
}
