package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class z4 extends c5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f38263c).f22027id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f22028id == ((TLRPC.Chat) this.f38263c).f22027id && (z10 = this.f38265g)) {
            if (z10) {
                this.f38265g = false;
                this.f38262b.removeObserver(this.f38261a, this.e);
            }
            this.f38264f.accept(chatFull);
        }
    }
}
