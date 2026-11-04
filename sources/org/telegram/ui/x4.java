package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class x4 extends a5 {
    @Override
    public final void a() {
        org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).V2(this.d, ((TLRPC.Chat) this.f43598c).f27001id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f27002id == ((TLRPC.Chat) this.f43598c).f27001id && (z10 = this.f43601g)) {
            if (z10) {
                this.f43601g = false;
                this.f43597b.n(this.f43596a, this.f43599e);
            }
            this.f43600f.accept(chatFull);
        }
    }
}
