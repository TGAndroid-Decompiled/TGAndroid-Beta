package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40044c).f18109id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18110id == ((TLRPC.Chat) this.f40044c).f18109id && (z10 = this.f40046g)) {
            if (z10) {
                this.f40046g = false;
                this.f40043b.removeObserver(this.f40042a, this.e);
            }
            this.f40045f.accept(chatFull);
        }
    }
}
