package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class x4 extends a5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f34666c).f20038id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20039id == ((TLRPC.Chat) this.f34666c).f20038id && (z10 = this.f34669g)) {
            if (z10) {
                this.f34669g = false;
                this.f34665b.removeObserver(this.f34664a, this.f34667e);
            }
            this.f34668f.accept(chatFull);
        }
    }
}
