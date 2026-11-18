package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).b3(this.d, ((TLRPC.Chat) this.f53987c).f28403id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28404id == ((TLRPC.Chat) this.f53987c).f28403id && (z10 = this.f53990g)) {
            if (z10) {
                this.f53990g = false;
                this.f53986b.n(this.f53985a, this.f53988e);
            }
            this.f53989f.accept(chatFull);
        }
    }
}
