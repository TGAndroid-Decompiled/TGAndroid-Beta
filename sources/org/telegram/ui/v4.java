package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class v4 extends y4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f44285c).f20068id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20069id == ((TLRPC.Chat) this.f44285c).f20068id && (z10 = this.f44288g)) {
            if (z10) {
                this.f44288g = false;
                this.f44284b.removeObserver(this.f44283a, this.f44286e);
            }
            this.f44287f.accept(chatFull);
        }
    }
}
