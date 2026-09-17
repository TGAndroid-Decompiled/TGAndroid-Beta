package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f43313c).f19896id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19897id == ((TLRPC.Chat) this.f43313c).f19896id && (z10 = this.f43316g)) {
            if (z10) {
                this.f43316g = false;
                this.f43312b.removeObserver(this.f43311a, this.f43314e);
            }
            this.f43315f.accept(chatFull);
        }
    }
}
