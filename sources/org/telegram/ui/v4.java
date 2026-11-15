package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).V2(this.d, ((TLRPC.Chat) this.f53406c).f28051id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28052id == ((TLRPC.Chat) this.f53406c).f28051id && (z10 = this.f53409g)) {
            if (z10) {
                this.f53409g = false;
                this.f53405b.n(this.f53404a, this.f53407e);
            }
            this.f53408f.accept(chatFull);
        }
    }
}
