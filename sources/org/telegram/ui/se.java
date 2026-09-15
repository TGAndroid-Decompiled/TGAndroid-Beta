package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class se implements Runnable {
    public final int f37362a;
    public final bo f37363b;
    public final MessageObject f37364c;

    public se(bo boVar, MessageObject messageObject, int i10) {
        this.f37362a = i10;
        this.f37363b = boVar;
        this.f37364c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f37362a) {
            case 0:
                MessageObject messageObject = this.f37364c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f37363b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                bo boVar = this.f37363b;
                boVar.getClass();
                MessageObject messageObject2 = this.f37364c;
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
                message.destroyTime = boVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = boVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (boVar.h != null) {
                    boVar.getMessagesController().markMessageAsRead(boVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    boVar.getMessagesController().markMessageAsRead2(boVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f37364c.getId();
                bo boVar2 = this.f37363b;
                boVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ug(boVar2, 13));
                if (boVar2.f32330h6.isEmpty()) {
                    boVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                bo boVar3 = this.f37363b;
                boVar3.getClass();
                MessageObject messageObject3 = this.f37364c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f18133id;
                if (messageObject3.getDialogId() == boVar3.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                boVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                bo boVar4 = this.f37363b;
                boVar4.getClass();
                MessageObject messageObject4 = this.f37364c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f18133id;
                if (messageObject4.getDialogId() == boVar4.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                boVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                bo boVar5 = this.f37363b;
                boVar5.getClass();
                MessageObject messageObject5 = this.f37364c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f18133id;
                if (messageObject5.getDialogId() == boVar5.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                boVar5.F(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 6:
                bo boVar6 = this.f37363b;
                boVar6.getClass();
                MessageObject messageObject6 = this.f37364c;
                if (messageObject6.isVideo()) {
                    boVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                bo boVar7 = this.f37363b;
                boVar7.getMessagesController().pinMessage(boVar7.e, boVar7.f32299f, this.f37364c.getId(), true, false, false);
                boVar7.A3 = null;
                return;
            default:
                bo boVar8 = this.f37363b;
                org.telegram.ui.Components.vc.a0(boVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f37364c;
                boVar8.Fa(messageObject7);
                boVar8.Ha(messageObject7);
                return;
        }
    }
}
