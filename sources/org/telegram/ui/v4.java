package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).V2(this.d, ((TLRPC.Chat) this.f53410c).f28051id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28052id == ((TLRPC.Chat) this.f53410c).f28051id && (z10 = this.f53413g)) {
            if (z10) {
                this.f53413g = false;
                this.f53409b.n(this.f53408a, this.f53411e);
            }
            this.f53412f.accept(chatFull);
        }
    }
}
