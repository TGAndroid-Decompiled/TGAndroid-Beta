package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40091c).f18328id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18329id == ((TLRPC.Chat) this.f40091c).f18328id && (z10 = this.f40093g)) {
            if (z10) {
                this.f40093g = false;
                this.f40090b.removeObserver(this.f40089a, this.e);
            }
            this.f40092f.accept(chatFull);
        }
    }
}
