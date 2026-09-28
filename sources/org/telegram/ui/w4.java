package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40332c).f18335id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18336id == ((TLRPC.Chat) this.f40332c).f18335id && (z10 = this.f40334g)) {
            if (z10) {
                this.f40334g = false;
                this.f40331b.removeObserver(this.f40330a, this.e);
            }
            this.f40333f.accept(chatFull);
        }
    }
}
