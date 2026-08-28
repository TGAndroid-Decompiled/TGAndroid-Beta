package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f44713c).f22380id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f22381id == ((TLRPC.Chat) this.f44713c).f22380id && (z10 = this.f44716g)) {
            if (z10) {
                this.f44716g = false;
                this.f44712b.removeObserver(this.f44711a, this.f44714e);
            }
            this.f44715f.accept(chatFull);
        }
    }
}
