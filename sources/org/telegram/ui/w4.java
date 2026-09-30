package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40442c).f18352id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18353id == ((TLRPC.Chat) this.f40442c).f18352id && (z10 = this.f40444g)) {
            if (z10) {
                this.f40444g = false;
                this.f40441b.removeObserver(this.f40440a, this.e);
            }
            this.f40443f.accept(chatFull);
        }
    }
}
