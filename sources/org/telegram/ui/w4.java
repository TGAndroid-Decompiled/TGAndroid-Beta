package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f43285c).f19869id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19870id == ((TLRPC.Chat) this.f43285c).f19869id && (z10 = this.f43288g)) {
            if (z10) {
                this.f43288g = false;
                this.f43284b.removeObserver(this.f43283a, this.f43286e);
            }
            this.f43287f.accept(chatFull);
        }
    }
}
