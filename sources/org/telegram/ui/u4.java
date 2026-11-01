package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class u4 extends x4 {
    @Override
    public final void a() {
        org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).T2(this.d, ((TLRPC.Chat) this.f43224c).f19794id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19795id == ((TLRPC.Chat) this.f43224c).f19794id && (z10 = this.f43226g)) {
            if (z10) {
                this.f43226g = false;
                this.f43223b.n(this.f43222a, this.e);
            }
            this.f43225f.accept(chatFull);
        }
    }
}
