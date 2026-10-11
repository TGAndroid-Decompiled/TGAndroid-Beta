package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f42535a;
    public final zn f42536b;
    public final MessageObject f42537c;

    public ue(zn znVar, MessageObject messageObject, int i10) {
        this.f42535a = i10;
        this.f42536b = znVar;
        this.f42537c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f42535a) {
            case 0:
                MessageObject messageObject = this.f42537c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f42536b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zn znVar = this.f42536b;
                znVar.getClass();
                MessageObject messageObject2 = this.f42537c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i14 = message.ttl;
                if (i14 != Integer.MAX_VALUE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 == Integer.MAX_VALUE) {
                    i10 = 0;
                } else {
                    i10 = i14;
                }
                message.destroyTime = znVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = znVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (znVar.h != null) {
                    znVar.getMessagesController().markMessageAsRead(znVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    znVar.getMessagesController().markMessageAsRead2(znVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                zn znVar2 = this.f42536b;
                znVar2.getClass();
                MessageObject messageObject3 = this.f42537c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f20053id;
                if (messageObject3.getDialogId() == znVar2.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                znVar2.bb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 3:
                zn znVar3 = this.f42536b;
                znVar3.getClass();
                MessageObject messageObject4 = this.f42537c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f20053id;
                if (messageObject4.getDialogId() == znVar3.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                znVar3.bb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 4:
                zn znVar4 = this.f42536b;
                znVar4.getClass();
                MessageObject messageObject5 = this.f42537c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f20053id;
                if (messageObject5.getDialogId() == znVar4.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                znVar4.F(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 5:
                int id2 = this.f42537c.getId();
                zn znVar5 = this.f42536b;
                znVar5.bb(id2, 0, true, 0, true, 0, null, null, new qf(znVar5, 23));
                if (znVar5.f44794h6.isEmpty()) {
                    znVar5.Pb(false);
                    return;
                }
                return;
            case 6:
                zn znVar6 = this.f42536b;
                znVar6.getClass();
                MessageObject messageObject6 = this.f42537c;
                if (messageObject6.isVideo()) {
                    znVar6.ma(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                zn znVar7 = this.f42536b;
                znVar7.getMessagesController().pinMessage(znVar7.f44752e, znVar7.f44764f, this.f42537c.getId(), true, false, false);
                znVar7.A3 = null;
                return;
            default:
                zn znVar8 = this.f42536b;
                org.telegram.ui.Components.ad.a0(znVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f42537c;
                znVar8.Ja(messageObject7);
                znVar8.La(messageObject7);
                return;
        }
    }
}
