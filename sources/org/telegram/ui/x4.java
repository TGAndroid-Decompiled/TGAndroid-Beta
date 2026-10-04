package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class x4 extends a5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f34665c).f20037id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20038id == ((TLRPC.Chat) this.f34665c).f20037id && (z10 = this.f34668g)) {
            if (z10) {
                this.f34668g = false;
                this.f34664b.removeObserver(this.f34663a, this.f34666e);
            }
            this.f34667f.accept(chatFull);
        }
    }
}
