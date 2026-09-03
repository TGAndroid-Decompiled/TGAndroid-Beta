package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class y4 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f35353c).f20845id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z4;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20846id == ((TLRPC.Chat) this.f35353c).f20845id && (z4 = this.f35356g)) {
            if (z4) {
                this.f35356g = false;
                this.f35352b.removeObserver(this.f35351a, this.f35354e);
            }
            this.f35355f.accept(chatFull);
        }
    }
}
