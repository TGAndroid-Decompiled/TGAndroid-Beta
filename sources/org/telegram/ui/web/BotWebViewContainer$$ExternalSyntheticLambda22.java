package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class BotWebViewContainer$$ExternalSyntheticLambda22 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;

    public BotWebViewContainer$$ExternalSyntheticLambda22(BotWebViewContainer botWebViewContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onEventReceived$27((Boolean) obj, (String) obj2);
                break;
            case 1:
                this.f$0.lambda$onEventReceived$41((Boolean) obj, (Boolean) obj2);
                break;
            case 2:
                this.f$0.lambda$onEventReceived$31((Boolean) obj, (String) obj2);
                break;
            case 3:
                this.f$0.lambda$onEventReceived$39((Boolean) obj, (String) obj2);
                break;
            default:
                this.f$0.lambda$onEventReceived$38((String) obj, (TLRPC.Document) obj2);
                break;
        }
    }
}
