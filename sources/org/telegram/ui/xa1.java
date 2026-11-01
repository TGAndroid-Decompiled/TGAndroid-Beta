package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class xa1 extends org.telegram.ui.Components.m60 {
    public final long f43297r2;
    public final za1 f43298s2;

    public xa1(za1 za1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.k2 k2Var, long j11) {
        super(context, i10, hVar, j10, k2Var, null);
        this.f43298s2 = za1Var;
        this.f43297r2 = j11;
    }

    @Override
    public final boolean R0() {
        TLRPC.Chat L0 = this.f43298s2.f43873b.getMessagesController().L0(Long.valueOf(this.f43297r2));
        if (L0 != null && org.telegram.messenger.w3.y(3, L0)) {
            return true;
        }
        return false;
    }
}
