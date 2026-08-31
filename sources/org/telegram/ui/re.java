package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class re implements Runnable {
    public final int f40941a;
    public final xn f40942b;
    public final MessageObject f40943c;

    public re(xn xnVar, MessageObject messageObject, int i10) {
        this.f40941a = i10;
        this.f40942b = xnVar;
        this.f40943c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f40941a) {
            case 0:
                MessageObject messageObject = this.f40943c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                        this.f40942b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xn xnVar = this.f40942b;
                xnVar.getClass();
                MessageObject messageObject2 = this.f40943c;
                TLRPC.Message message = messageObject2.messageOwner;
                int i14 = message.ttl;
                if (i14 != Integer.MAX_VALUE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i14 == Integer.MAX_VALUE) {
                    i10 = 0;
                } else {
                    i10 = i14;
                }
                message.destroyTime = xnVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = xnVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (xnVar.h != null) {
                    xnVar.getMessagesController().markMessageAsRead(xnVar.Q5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    xnVar.getMessagesController().markMessageAsRead2(xnVar.Q5, messageObject2.getId(), null, i10, 0L, z4);
                    return;
                }
            case 2:
                int id2 = this.f40943c.getId();
                xn xnVar2 = this.f40942b;
                xnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ng(xnVar2, 13));
                if (xnVar2.e6.isEmpty()) {
                    xnVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                xn xnVar3 = this.f40942b;
                xnVar3.getClass();
                MessageObject messageObject3 = this.f40943c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f20864id;
                if (messageObject3.getDialogId() == xnVar3.I6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                xnVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                xn xnVar4 = this.f40942b;
                xnVar4.getClass();
                MessageObject messageObject4 = this.f40943c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f20864id;
                if (messageObject4.getDialogId() == xnVar4.I6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                xnVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                xn xnVar5 = this.f40942b;
                xnVar5.getClass();
                MessageObject messageObject5 = this.f40943c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f20864id;
                if (messageObject5.getDialogId() == xnVar5.I6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                xnVar5.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 6:
                xn xnVar6 = this.f40942b;
                xnVar6.getClass();
                MessageObject messageObject6 = this.f40943c;
                if (messageObject6.isVideo()) {
                    xnVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                xn xnVar7 = this.f40942b;
                xnVar7.getMessagesController().pinMessage(xnVar7.f43165e, xnVar7.f43178f, this.f40943c.getId(), true, false, false);
                xnVar7.f43406x3 = null;
                return;
            default:
                xn xnVar8 = this.f40942b;
                org.telegram.ui.Components.qc.a0(xnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f40943c;
                xnVar8.Fa(messageObject7);
                xnVar8.Ha(messageObject7);
                return;
        }
    }
}
