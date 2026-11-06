package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).V2(this.d, ((TLRPC.Chat) this.f52070c).f26953id, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z9;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f26954id == ((TLRPC.Chat) this.f52070c).f26953id && (z9 = this.f52073g)) {
            if (z9) {
                this.f52073g = false;
                this.f52069b.n(this.f52068a, this.f52071e);
            }
            this.f52072f.accept(chatFull);
        }
    }
}
