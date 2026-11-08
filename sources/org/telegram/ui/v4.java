package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).V2(this.d, ((TLRPC.Chat) this.f52063c).f26956id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z9;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f26957id == ((TLRPC.Chat) this.f52063c).f26956id && (z9 = this.f52066g)) {
            if (z9) {
                this.f52066g = false;
                this.f52062b.n(this.f52061a, this.f52064e);
            }
            this.f52065f.accept(chatFull);
        }
    }
}
