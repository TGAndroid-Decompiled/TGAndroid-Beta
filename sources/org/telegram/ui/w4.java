package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class w4 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f40113c).f18343id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18344id == ((TLRPC.Chat) this.f40113c).f18343id && (z10 = this.f40115g)) {
            if (z10) {
                this.f40115g = false;
                this.f40112b.removeObserver(this.f40111a, this.e);
            }
            this.f40114f.accept(chatFull);
        }
    }
}
