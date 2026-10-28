package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class z4 extends c5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f38173c).f22028id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f22029id == ((TLRPC.Chat) this.f38173c).f22028id && (z10 = this.f38175g)) {
            if (z10) {
                this.f38175g = false;
                this.f38172b.removeObserver(this.f38171a, this.e);
            }
            this.f38174f.accept(chatFull);
        }
    }
}
