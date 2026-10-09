package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f44476c).f20038id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20039id == ((TLRPC.Chat) this.f44476c).f20038id && (z10 = this.f44479g)) {
            if (z10) {
                this.f44479g = false;
                this.f44475b.removeObserver(this.f44474a, this.f44477e);
            }
            this.f44478f.accept(chatFull);
        }
    }
}
