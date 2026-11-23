package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).b3(this.d, ((TLRPC.Chat) this.f54186c).f28492id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28493id == ((TLRPC.Chat) this.f54186c).f28492id && (z10 = this.f54189g)) {
            if (z10) {
                this.f54189g = false;
                this.f54185b.n(this.f54184a, this.f54187e);
            }
            this.f54188f.accept(chatFull);
        }
    }
}
