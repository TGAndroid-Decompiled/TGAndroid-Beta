package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ve implements Runnable {
    public final int f41715a;
    public final yn f41716b;
    public final MessageObject f41717c;

    public ve(yn ynVar, MessageObject messageObject, int i10) {
        this.f41715a = i10;
        this.f41716b = ynVar;
        this.f41717c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f41715a) {
            case 0:
                MessageObject messageObject = this.f41717c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f41716b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                yn ynVar = this.f41716b;
                ynVar.getClass();
                MessageObject messageObject2 = this.f41717c;
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
                message.destroyTime = ynVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = ynVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (ynVar.h != null) {
                    ynVar.getMessagesController().markMessageAsRead(ynVar.R5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    ynVar.getMessagesController().markMessageAsRead2(ynVar.R5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                yn ynVar2 = this.f41716b;
                ynVar2.getClass();
                MessageObject messageObject3 = this.f41717c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f20063id;
                if (messageObject3.getDialogId() == ynVar2.J6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                ynVar2.Wa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 3:
                yn ynVar3 = this.f41716b;
                ynVar3.getClass();
                MessageObject messageObject4 = this.f41717c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f20063id;
                if (messageObject4.getDialogId() == ynVar3.J6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                ynVar3.Wa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 4:
                yn ynVar4 = this.f41716b;
                ynVar4.getClass();
                MessageObject messageObject5 = this.f41717c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f20063id;
                if (messageObject5.getDialogId() == ynVar4.J6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                ynVar4.D(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 5:
                int id2 = this.f41717c.getId();
                yn ynVar5 = this.f41716b;
                ynVar5.Wa(id2, 0, true, 0, true, 0, null, null, new yf(ynVar5, 13));
                if (ynVar5.f43341f6.isEmpty()) {
                    ynVar5.Kb(false);
                    return;
                }
                return;
            case 6:
                yn ynVar6 = this.f41716b;
                ynVar6.getClass();
                MessageObject messageObject6 = this.f41717c;
                if (messageObject6.isVideo()) {
                    ynVar6.ga(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                yn ynVar7 = this.f41716b;
                ynVar7.getMessagesController().pinMessage(ynVar7.f43322e, ynVar7.f43334f, this.f41717c.getId(), true, false, false);
                ynVar7.y3 = null;
                return;
            default:
                yn ynVar8 = this.f41716b;
                org.telegram.ui.Components.yc.a0(ynVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f41717c;
                ynVar8.Ea(messageObject7);
                ynVar8.Ga(messageObject7);
                return;
        }
    }
}
