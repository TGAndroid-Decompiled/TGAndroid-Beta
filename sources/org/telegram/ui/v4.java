package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).b3(this.d, ((TLRPC.Chat) this.f54034c).f28431id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f28432id == ((TLRPC.Chat) this.f54034c).f28431id && (z10 = this.f54037g)) {
            if (z10) {
                this.f54037g = false;
                this.f54033b.n(this.f54032a, this.f54035e);
            }
            this.f54036f.accept(chatFull);
        }
    }
}
