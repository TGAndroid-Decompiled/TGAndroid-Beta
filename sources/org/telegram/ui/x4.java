package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class x4 extends a5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f34682c).f20047id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20048id == ((TLRPC.Chat) this.f34682c).f20047id && (z10 = this.f34685g)) {
            if (z10) {
                this.f34685g = false;
                this.f34681b.removeObserver(this.f34680a, this.f34683e);
            }
            this.f34684f.accept(chatFull);
        }
    }
}
