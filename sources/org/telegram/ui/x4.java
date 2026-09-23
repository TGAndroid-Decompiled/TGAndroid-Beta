package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class x4 extends a5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f31662c).f18083id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18084id == ((TLRPC.Chat) this.f31662c).f18083id && (z10 = this.f31664g)) {
            if (z10) {
                this.f31664g = false;
                this.f31661b.removeObserver(this.f31660a, this.e);
            }
            this.f31663f.accept(chatFull);
        }
    }
}
