package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).b3(this.d, ((TLRPC.Chat) this.f54019c).f28405id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28406id == ((TLRPC.Chat) this.f54019c).f28405id && (z10 = this.f54022g)) {
            if (z10) {
                this.f54022g = false;
                this.f54018b.n(this.f54017a, this.f54020e);
            }
            this.f54021f.accept(chatFull);
        }
    }
}
