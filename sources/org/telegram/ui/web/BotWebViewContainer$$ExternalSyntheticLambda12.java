package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bots.BotBiometry;

public final class BotWebViewContainer$$ExternalSyntheticLambda12 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;

    public BotWebViewContainer$$ExternalSyntheticLambda12(BotWebViewContainer botWebViewContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        BotWebViewContainer.Delegate delegate;
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                BotWebViewContainer botWebViewContainer = this.f$0;
                if (botWebViewContainer.delegate != null && bool.booleanValue()) {
                    botWebViewContainer.delegate.onLocationGranted(bool2.booleanValue());
                }
                botWebViewContainer.location.requestObject(new BotWebViewContainer$$ExternalSyntheticLambda11(botWebViewContainer, 2));
                break;
            case 1:
                Boolean bool3 = (Boolean) obj;
                String str = (String) obj2;
                BotWebViewContainer botWebViewContainer2 = this.f$0;
                botWebViewContainer2.getClass();
                if (bool3.booleanValue()) {
                    botWebViewContainer2.biometry.access_granted = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str);
                    botWebViewContainer2.notifyEvent("biometry_auth_requested", jSONObject);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
                String str2 = (String) obj2;
                BotWebViewContainer botWebViewContainer3 = this.f$0;
                botWebViewContainer3.getClass();
                botWebViewContainer3.notifyEvent("emoji_status_access_requested", BotWebViewContainer.obj(str2, "status"));
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (delegate = botWebViewContainer3.delegate) != null) {
                    delegate.onEmojiStatusGranted();
                    break;
                }
                break;
            case 3:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                BotWebViewContainer botWebViewContainer4 = this.f$0;
                if (str3 != null) {
                    botWebViewContainer4.getClass();
                    botWebViewContainer4.notifyEvent("emoji_status_failed", BotWebViewContainer.obj(str3, "error"));
                } else {
                    botWebViewContainer4.notifyEvent("emoji_status_set", null);
                    BotWebViewContainer.Delegate delegate2 = botWebViewContainer4.delegate;
                    if (delegate2 != null) {
                        delegate2.onEmojiStatusSet(document);
                    }
                }
                break;
            default:
                BotWebViewContainer botWebViewContainer5 = this.f$0;
                botWebViewContainer5.getClass();
                if (((Boolean) obj).booleanValue()) {
                    BotBiometry botBiometry = botWebViewContainer5.biometry;
                    botBiometry.access_granted = true;
                    botBiometry.save();
                }
                botWebViewContainer5.notifyBiometryReceived();
                break;
        }
    }
}
