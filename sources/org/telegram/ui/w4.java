package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40333c).f18336id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18337id == ((TLRPC.Chat) this.f40333c).f18336id && (z10 = this.f40335g)) {
            if (z10) {
                this.f40335g = false;
                this.f40332b.removeObserver(this.f40331a, this.e);
            }
            this.f40334f.accept(chatFull);
        }
    }
}
