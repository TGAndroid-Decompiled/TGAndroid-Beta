package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;

public final class BotWebViewContainer$$ExternalSyntheticLambda25 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;
    public final String f$1;

    public BotWebViewContainer$$ExternalSyntheticLambda25(BotWebViewContainer botWebViewContainer, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
        this.f$1 = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onEventReceived$52(this.f$1, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.f$0.lambda$onEventReceived$57(this.f$1, (TL_keyboard.KeyboardButton) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f$0.lambda$onEventReceived$55(this.f$1, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
