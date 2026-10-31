package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sv implements org.telegram.messenger.zr, org.telegram.messenger.cs {
    public final int f41650a;
    public final long f41651b;
    public final boolean f41652c;
    public final org.telegram.messenger.us d;
    public final Object e;

    public sv(org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, boolean z10) {
        this.d = x1Var;
        this.e = k2Var;
        this.f41650a = i10;
        this.f41651b = j10;
        this.f41652c = z10;
    }

    @Override
    public void i(boolean z10) {
        ay ayVar = (ay) this.d;
        long j10 = this.f41651b;
        boolean z11 = this.f41652c;
        ay.w0(this.f41650a, j10, (TLRPC.Chat) this.e, ayVar, z11, z10);
    }

    @Override
    public void run(long j10) {
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
        ((org.telegram.ui.ActionBar.x1) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        org.telegram.messenger.vp.r1(this.f41650a).O2(-j10, this.f41651b, false, this.f41652c, new a80(k2Var, j10, 2));
    }

    public sv(ay ayVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = ayVar;
        this.f41650a = i10;
        this.e = chat;
        this.f41651b = j10;
        this.f41652c = z10;
    }
}
