package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class y4 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f35332c).f20843id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z4;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20844id == ((TLRPC.Chat) this.f35332c).f20843id && (z4 = this.f35335g)) {
            if (z4) {
                this.f35335g = false;
                this.f35331b.removeObserver(this.f35330a, this.f35333e);
            }
            this.f35334f.accept(chatFull);
        }
    }
}
