package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40115c).f18121id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18122id == ((TLRPC.Chat) this.f40115c).f18121id && (z10 = this.f40117g)) {
            if (z10) {
                this.f40117g = false;
                this.f40114b.removeObserver(this.f40113a, this.e);
            }
            this.f40116f.accept(chatFull);
        }
    }
}
