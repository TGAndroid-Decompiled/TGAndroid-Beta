package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40316c).f18321id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18322id == ((TLRPC.Chat) this.f40316c).f18321id && (z10 = this.f40318g)) {
            if (z10) {
                this.f40318g = false;
                this.f40315b.removeObserver(this.f40314a, this.e);
            }
            this.f40317f.accept(chatFull);
        }
    }
}
