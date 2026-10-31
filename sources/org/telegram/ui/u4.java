package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class u4 extends x4 {
    @Override
    public final void a() {
        org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).T2(this.d, ((TLRPC.Chat) this.f43436c).f19793id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19794id == ((TLRPC.Chat) this.f43436c).f19793id && (z10 = this.f43438g)) {
            if (z10) {
                this.f43438g = false;
                this.f43435b.n(this.f43434a, this.e);
            }
            this.f43437f.accept(chatFull);
        }
    }
}
