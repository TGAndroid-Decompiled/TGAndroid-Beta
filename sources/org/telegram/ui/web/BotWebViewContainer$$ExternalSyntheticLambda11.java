package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

public final class BotWebViewContainer$$ExternalSyntheticLambda11 implements Utilities.Callback {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;

    public BotWebViewContainer$$ExternalSyntheticLambda11(BotWebViewContainer botWebViewContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.notifyEvent("location_requested", (JSONObject) obj);
                break;
            case 1:
                BotWebViewContainer botWebViewContainer = this.f$0;
                botWebViewContainer.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    botWebViewContainer.notifyEvent("home_screen_failed", BotWebViewContainer.obj("UNSUPPORTED", "error"));
                } else {
                    botWebViewContainer.notifyEvent("home_screen_added", null);
                }
                break;
            default:
                this.f$0.notifyEvent("location_requested", (JSONObject) obj);
                break;
        }
    }
}
