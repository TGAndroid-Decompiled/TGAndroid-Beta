package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40061c).f18112id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18113id == ((TLRPC.Chat) this.f40061c).f18112id && (z10 = this.f40063g)) {
            if (z10) {
                this.f40063g = false;
                this.f40060b.removeObserver(this.f40059a, this.e);
            }
            this.f40062f.accept(chatFull);
        }
    }
}
