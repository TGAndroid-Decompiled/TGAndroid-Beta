package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).V2(this.d, ((TLRPC.Chat) this.f52072c).f26952id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z9;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f26953id == ((TLRPC.Chat) this.f52072c).f26952id && (z9 = this.f52075g)) {
            if (z9) {
                this.f52075g = false;
                this.f52071b.n(this.f52070a, this.f52073e);
            }
            this.f52074f.accept(chatFull);
        }
    }
}
