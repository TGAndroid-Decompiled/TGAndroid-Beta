package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotLocation;

public final class BotWebViewContainer$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;

    public BotWebViewContainer$$ExternalSyntheticLambda5(BotWebViewContainer botWebViewContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer botWebViewContainer = this.f$0;
                BotLocation botLocation = botWebViewContainer.location;
                botLocation.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", botLocation.deviceHasLocation());
                    if (botLocation.deviceHasLocation()) {
                        jSONObject.put("access_requested", botLocation.requested);
                        if (botLocation.requested) {
                            jSONObject.put("access_granted", botLocation.granted && botLocation.appHasPermission());
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                botWebViewContainer.notifyEvent("location_checked", jSONObject);
                break;
            case 1:
                BotWebViewContainer botWebViewContainer2 = this.f$0;
                BotBiometry botBiometry = botWebViewContainer2.biometry;
                botBiometry.access_requested = true;
                botBiometry.save();
                botWebViewContainer2.notifyBiometryReceived();
                break;
            case 2:
                BotWebViewContainer botWebViewContainer3 = this.f$0;
                if (botWebViewContainer3.isSettingsButtonVisible) {
                    botWebViewContainer3.isSettingsButtonVisible = false;
                    BotWebViewContainer.Delegate delegate = botWebViewContainer3.delegate;
                    if (delegate != null) {
                        delegate.onSetSettingsButtonVisible(false);
                    }
                }
                botWebViewContainer3.checkCreateWebView();
                botWebViewContainer3.isPageLoaded = false;
                botWebViewContainer3.lastClickMs = 0L;
                botWebViewContainer3.hasUserPermissions = false;
                BotWebViewContainer.MyWebView myWebView = botWebViewContainer3.webView;
                if (myWebView != null) {
                    myWebView.onResume();
                    botWebViewContainer3.webView.reload();
                }
                break;
            default:
                BotWebViewContainer.Delegate delegate2 = this.f$0.delegate;
                if (delegate2 != null) {
                    delegate2.onCloseToTabs();
                }
                LaunchActivity.dismissAllWeb();
                break;
        }
    }
}
