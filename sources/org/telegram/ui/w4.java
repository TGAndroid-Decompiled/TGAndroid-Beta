package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f45065c).f22392id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f22393id == ((TLRPC.Chat) this.f45065c).f22392id && (z10 = this.f45068g)) {
            if (z10) {
                this.f45068g = false;
                this.f45064b.removeObserver(this.f45063a, this.f45066e);
            }
            this.f45067f.accept(chatFull);
        }
    }
}
