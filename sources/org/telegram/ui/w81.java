package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class w81 extends org.telegram.ui.Components.t50 {
    public final long f50751s2;
    public final y81 f50752t2;

    public w81(y81 y81Var, Context context, int i3, a0.h hVar, long j10, org.telegram.ui.ActionBar.d2 d2Var, long j11) {
        super(context, i3, hVar, j10, d2Var, null);
        this.f50752t2 = y81Var;
        this.f50751s2 = j11;
    }

    @Override
    public final boolean R0() {
        TLRPC.Chat M0 = this.f50752t2.f52227b.getMessagesController().M0(Long.valueOf(this.f50751s2));
        if (M0 != null && org.telegram.messenger.t3.y(3, M0)) {
            return true;
        }
        return false;
    }
}
