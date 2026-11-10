package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).V2(this.d, ((TLRPC.Chat) this.f51887c).f26960id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z9;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f26961id == ((TLRPC.Chat) this.f51887c).f26960id && (z9 = this.f51890g)) {
            if (z9) {
                this.f51890g = false;
                this.f51886b.n(this.f51885a, this.f51888e);
            }
            this.f51889f.accept(chatFull);
        }
    }
}
