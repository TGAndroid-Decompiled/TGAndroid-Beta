package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

public final class BotWebViewContainer$$ExternalSyntheticLambda21 implements Utilities.Callback {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;

    public BotWebViewContainer$$ExternalSyntheticLambda21(BotWebViewContainer botWebViewContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onEventReceived$40((JSONObject) obj);
                break;
            case 1:
                this.f$0.lambda$onEventReceived$42((JSONObject) obj);
                break;
            default:
                this.f$0.lambda$onEventReceived$37((Boolean) obj);
                break;
        }
    }
}
