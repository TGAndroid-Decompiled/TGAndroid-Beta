package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class z4 extends c5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36326c).f19803id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19804id == ((TLRPC.Chat) this.f36326c).f19803id && (z10 = this.f36329g)) {
            if (z10) {
                this.f36329g = false;
                this.f36325b.removeObserver(this.f36324a, this.f36327e);
            }
            this.f36328f.accept(chatFull);
        }
    }
}
