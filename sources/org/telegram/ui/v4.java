package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).V2(this.d, ((TLRPC.Chat) this.f51851c).f26956id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z9;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f26957id == ((TLRPC.Chat) this.f51851c).f26956id && (z9 = this.f51854g)) {
            if (z9) {
                this.f51854g = false;
                this.f51850b.n(this.f51849a, this.f51852e);
            }
            this.f51853f.accept(chatFull);
        }
    }
}
