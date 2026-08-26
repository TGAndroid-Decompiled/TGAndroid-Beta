package org.telegram.ui.web;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticLambda12;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;

public final class BotWebViewContainer$$ExternalSyntheticLambda45 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;

    public BotWebViewContainer$$ExternalSyntheticLambda45(Object obj, int i, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, ChatObject$Call$$ExternalSyntheticLambda12 chatObject$Call$$ExternalSyntheticLambda12) {
        this.$r8$classId = 1;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = tL_messages_getAttachedStickers;
        this.f$3 = chatObject$Call$$ExternalSyntheticLambda12;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Object obj = this.f$3;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((BotWebViewContainer) obj3).lambda$onEventReceived$21((String) obj2, this.f$2, (BotWebViewContainer.MyWebView) obj, tLObject, tL_error);
                break;
            case 1:
                ChatObject$Call$$ExternalSyntheticLambda12 chatObject$Call$$ExternalSyntheticLambda12 = (ChatObject$Call$$ExternalSyntheticLambda12) obj;
                if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj3 == null) {
                    chatObject$Call$$ExternalSyntheticLambda12.run(tLObject, tL_error);
                } else {
                    FileRefController.getInstance(this.f$2).requestReference(obj3, (TLRPC.TL_messages_getAttachedStickers) obj2, chatObject$Call$$ExternalSyntheticLambda12);
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f$2, (TL_account.updateEmojiStatus) obj));
                break;
        }
    }

    public BotWebViewContainer$$ExternalSyntheticLambda45(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = obj3;
    }
}
