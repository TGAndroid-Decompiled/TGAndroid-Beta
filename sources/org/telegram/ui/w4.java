package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f43312c).f19896id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19897id == ((TLRPC.Chat) this.f43312c).f19896id && (z10 = this.f43315g)) {
            if (z10) {
                this.f43315g = false;
                this.f43311b.removeObserver(this.f43310a, this.f43313e);
            }
            this.f43314f.accept(chatFull);
        }
    }
}
