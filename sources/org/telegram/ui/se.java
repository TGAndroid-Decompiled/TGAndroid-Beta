package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class se implements Runnable {
    public final int f41443a;
    public final qn f41444b;
    public final MessageObject f41445c;

    public se(qn qnVar, MessageObject messageObject, int i10) {
        this.f41443a = i10;
        this.f41444b = qnVar;
        this.f41445c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f41443a) {
            case 0:
                MessageObject messageObject = this.f41445c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                        this.f41444b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qn qnVar = this.f41444b;
                qnVar.getClass();
                MessageObject messageObject2 = this.f41445c;
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
                message.destroyTime = qnVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = qnVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (qnVar.h != null) {
                    qnVar.getMessagesController().markMessageAsRead(qnVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    qnVar.getMessagesController().markMessageAsRead2(qnVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                qn qnVar2 = this.f41444b;
                qnVar2.getClass();
                MessageObject messageObject3 = this.f41445c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f20296id;
                if (messageObject3.getDialogId() == qnVar2.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                qnVar2.bb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 3:
                qn qnVar3 = this.f41444b;
                qnVar3.getClass();
                MessageObject messageObject4 = this.f41445c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f20296id;
                if (messageObject4.getDialogId() == qnVar3.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                qnVar3.bb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 4:
                qn qnVar4 = this.f41444b;
                qnVar4.getClass();
                MessageObject messageObject5 = this.f41445c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f20296id;
                if (messageObject5.getDialogId() == qnVar4.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                qnVar4.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 5:
                int id2 = this.f41445c.getId();
                qn qnVar5 = this.f41444b;
                qnVar5.bb(id2, 0, true, 0, true, 0, null, null, new kf(qnVar5, 23));
                if (qnVar5.f40709h6.isEmpty()) {
                    qnVar5.Pb(false);
                    return;
                }
                return;
            case 6:
                qn qnVar6 = this.f41444b;
                qnVar6.getClass();
                MessageObject messageObject6 = this.f41445c;
                if (messageObject6.isVideo()) {
                    qnVar6.ma(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                qn qnVar7 = this.f41444b;
                qnVar7.getMessagesController().pinMessage(qnVar7.e, qnVar7.f40678f, this.f41445c.getId(), true, false, false);
                qnVar7.A3 = null;
                return;
            default:
                qn qnVar8 = this.f41444b;
                org.telegram.ui.Components.xc.a0(qnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f41445c;
                qnVar8.Ja(messageObject7);
                qnVar8.La(messageObject7);
                return;
        }
    }
}
