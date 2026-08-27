package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f45019c).f22380id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f22381id == ((TLRPC.Chat) this.f45019c).f22380id && (z10 = this.f45022g)) {
            if (z10) {
                this.f45022g = false;
                this.f45018b.removeObserver(this.f45017a, this.f45020e);
            }
            this.f45021f.accept(chatFull);
        }
    }
}
