package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class za1 extends org.telegram.ui.Components.m60 {
    public final long f44069r2;
    public final bb1 f44070s2;

    public za1(bb1 bb1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.k2 k2Var, long j11) {
        super(context, i10, hVar, j10, k2Var, null);
        this.f44070s2 = bb1Var;
        this.f44069r2 = j11;
    }

    @Override
    public final boolean R0() {
        TLRPC.Chat L0 = this.f44070s2.f36164b.getMessagesController().L0(Long.valueOf(this.f44069r2));
        if (L0 != null && org.telegram.messenger.w3.y(3, L0)) {
            return true;
        }
        return false;
    }
}
