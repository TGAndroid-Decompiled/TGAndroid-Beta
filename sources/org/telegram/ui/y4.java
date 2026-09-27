package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class y4 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f32239c).f18329id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18330id == ((TLRPC.Chat) this.f32239c).f18329id && (z10 = this.f32241g)) {
            if (z10) {
                this.f32241g = false;
                this.f32238b.removeObserver(this.f32237a, this.e);
            }
            this.f32240f.accept(chatFull);
        }
    }
}
