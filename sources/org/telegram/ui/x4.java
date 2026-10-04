package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class x4 extends a5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f34672c).f20042id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20043id == ((TLRPC.Chat) this.f34672c).f20042id && (z10 = this.f34675g)) {
            if (z10) {
                this.f34675g = false;
                this.f34671b.removeObserver(this.f34670a, this.f34673e);
            }
            this.f34674f.accept(chatFull);
        }
    }
}
