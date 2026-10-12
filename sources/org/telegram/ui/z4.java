package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class z4 extends c5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36324c).f19802id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19803id == ((TLRPC.Chat) this.f36324c).f19802id && (z10 = this.f36327g)) {
            if (z10) {
                this.f36327g = false;
                this.f36323b.removeObserver(this.f36322a, this.f36325e);
            }
            this.f36326f.accept(chatFull);
        }
    }
}
