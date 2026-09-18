package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f39966c).f18296id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18297id == ((TLRPC.Chat) this.f39966c).f18296id && (z10 = this.f39968g)) {
            if (z10) {
                this.f39968g = false;
                this.f39965b.removeObserver(this.f39964a, this.e);
            }
            this.f39967f.accept(chatFull);
        }
    }
}
