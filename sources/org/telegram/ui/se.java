package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class se implements Runnable {
    public final int f37249a;
    public final xn f37250b;
    public final MessageObject f37251c;

    public se(xn xnVar, MessageObject messageObject, int i10) {
        this.f37249a = i10;
        this.f37250b = xnVar;
        this.f37251c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f37249a) {
            case 0:
                MessageObject messageObject = this.f37251c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f37250b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xn xnVar = this.f37250b;
                xnVar.getClass();
                MessageObject messageObject2 = this.f37251c;
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
                message.destroyTime = xnVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = xnVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (xnVar.h != null) {
                    xnVar.getMessagesController().markMessageAsRead(xnVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    xnVar.getMessagesController().markMessageAsRead2(xnVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f37251c.getId();
                xn xnVar2 = this.f37250b;
                xnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new sg(xnVar2, 13));
                if (xnVar2.f39402h6.isEmpty()) {
                    xnVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                xn xnVar3 = this.f37250b;
                xnVar3.getClass();
                MessageObject messageObject3 = this.f37251c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f18104id;
                if (messageObject3.getDialogId() == xnVar3.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                xnVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                xn xnVar4 = this.f37250b;
                xnVar4.getClass();
                MessageObject messageObject4 = this.f37251c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f18104id;
                if (messageObject4.getDialogId() == xnVar4.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                xnVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                xn xnVar5 = this.f37250b;
                xnVar5.getClass();
                MessageObject messageObject5 = this.f37251c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f18104id;
                if (messageObject5.getDialogId() == xnVar5.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                xnVar5.F(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 6:
                xn xnVar6 = this.f37250b;
                xnVar6.getClass();
                MessageObject messageObject6 = this.f37251c;
                if (messageObject6.isVideo()) {
                    xnVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                xn xnVar7 = this.f37250b;
                xnVar7.getMessagesController().pinMessage(xnVar7.e, xnVar7.f39372f, this.f37251c.getId(), true, false, false);
                xnVar7.A3 = null;
                return;
            default:
                xn xnVar8 = this.f37250b;
                org.telegram.ui.Components.xc.a0(xnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f37251c;
                xnVar8.Fa(messageObject7);
                xnVar8.Ha(messageObject7);
                return;
        }
    }
}
