package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f43286c).f19869id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19870id == ((TLRPC.Chat) this.f43286c).f19869id && (z10 = this.f43289g)) {
            if (z10) {
                this.f43289g = false;
                this.f43285b.removeObserver(this.f43284a, this.f43287e);
            }
            this.f43288f.accept(chatFull);
        }
    }
}
