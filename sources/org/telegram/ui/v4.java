package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).b3(this.d, ((TLRPC.Chat) this.f54012c).f28398id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28399id == ((TLRPC.Chat) this.f54012c).f28398id && (z10 = this.f54015g)) {
            if (z10) {
                this.f54015g = false;
                this.f54011b.n(this.f54010a, this.f54013e);
            }
            this.f54014f.accept(chatFull);
        }
    }
}
