package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f39207c).f17195id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f17196id == ((TLRPC.Chat) this.f39207c).f17195id && (z10 = this.f39209g)) {
            if (z10) {
                this.f39209g = false;
                this.f39206b.removeObserver(this.f39205a, this.e);
            }
            this.f39208f.accept(chatFull);
        }
    }
}
