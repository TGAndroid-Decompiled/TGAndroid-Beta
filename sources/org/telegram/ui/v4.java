package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).b3(this.d, ((TLRPC.Chat) this.f54038c).f28434id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28435id == ((TLRPC.Chat) this.f54038c).f28434id && (z10 = this.f54041g)) {
            if (z10) {
                this.f54041g = false;
                this.f54037b.n(this.f54036a, this.f54039e);
            }
            this.f54040f.accept(chatFull);
        }
    }
}
