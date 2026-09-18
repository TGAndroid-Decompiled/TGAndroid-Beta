package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40120c).f18121id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18122id == ((TLRPC.Chat) this.f40120c).f18121id && (z10 = this.f40122g)) {
            if (z10) {
                this.f40122g = false;
                this.f40119b.removeObserver(this.f40118a, this.e);
            }
            this.f40121f.accept(chatFull);
        }
    }
}
