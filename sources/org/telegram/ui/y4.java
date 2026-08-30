package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class y4 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f32792c).f19184id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z4;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19185id == ((TLRPC.Chat) this.f32792c).f19184id && (z4 = this.f32794g)) {
            if (z4) {
                this.f32794g = false;
                this.f32791b.removeObserver(this.f32790a, this.e);
            }
            this.f32793f.accept(chatFull);
        }
    }
}
