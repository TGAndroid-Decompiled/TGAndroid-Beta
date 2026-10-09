package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f44478c).f20038id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20039id == ((TLRPC.Chat) this.f44478c).f20038id && (z10 = this.f44481g)) {
            if (z10) {
                this.f44481g = false;
                this.f44477b.removeObserver(this.f44476a, this.f44479e);
            }
            this.f44480f.accept(chatFull);
        }
    }
}
