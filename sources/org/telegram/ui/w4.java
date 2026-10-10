package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f44522c).f20042id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20043id == ((TLRPC.Chat) this.f44522c).f20042id && (z10 = this.f44525g)) {
            if (z10) {
                this.f44525g = false;
                this.f44521b.removeObserver(this.f44520a, this.f44523e);
            }
            this.f44524f.accept(chatFull);
        }
    }
}
