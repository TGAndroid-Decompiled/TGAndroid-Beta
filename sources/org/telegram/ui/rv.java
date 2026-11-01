package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rv implements org.telegram.messenger.as, org.telegram.messenger.ds {
    public final int f41155a;
    public final long f41156b;
    public final boolean f41157c;
    public final org.telegram.messenger.vs d;
    public final Object e;

    public rv(org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, boolean z10) {
        this.d = x1Var;
        this.e = k2Var;
        this.f41155a = i10;
        this.f41156b = j10;
        this.f41157c = z10;
    }

    @Override
    public void i(boolean z10) {
        zx zxVar = (zx) this.d;
        long j10 = this.f41156b;
        boolean z11 = this.f41157c;
        zx.x0(this.f41155a, j10, (TLRPC.Chat) this.e, zxVar, z11, z10);
    }

    @Override
    public void run(long j10) {
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
        ((org.telegram.ui.ActionBar.x1) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        org.telegram.messenger.wp.r1(this.f41155a).O2(-j10, this.f41156b, false, this.f41157c, new z70(k2Var, j10, 2));
    }

    public rv(zx zxVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = zxVar;
        this.f41155a = i10;
        this.e = chat;
        this.f41156b = j10;
        this.f41157c = z10;
    }
}
