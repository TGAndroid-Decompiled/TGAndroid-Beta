package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f40721a;
    public final co f40722b;
    public final MessageObject f40723c;

    public te(co coVar, MessageObject messageObject, int i10) {
        this.f40721a = i10;
        this.f40722b = coVar;
        this.f40723c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f40721a) {
            case 0:
                MessageObject messageObject = this.f40723c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f40722b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                co coVar = this.f40722b;
                coVar.getClass();
                MessageObject messageObject2 = this.f40723c;
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
                message.destroyTime = coVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = coVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (coVar.h != null) {
                    coVar.getMessagesController().markMessageAsRead(coVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    coVar.getMessagesController().markMessageAsRead2(coVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f40723c.getId();
                co coVar2 = this.f40722b;
                coVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ug(coVar2, 13));
                if (coVar2.f35279h6.isEmpty()) {
                    coVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                co coVar3 = this.f40722b;
                coVar3.getClass();
                MessageObject messageObject3 = this.f40723c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f19890id;
                if (messageObject3.getDialogId() == coVar3.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                coVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                co coVar4 = this.f40722b;
                coVar4.getClass();
                MessageObject messageObject4 = this.f40723c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f19890id;
                if (messageObject4.getDialogId() == coVar4.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                coVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                co coVar5 = this.f40722b;
                coVar5.getClass();
                MessageObject messageObject5 = this.f40723c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f19890id;
                if (messageObject5.getDialogId() == coVar5.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                coVar5.F(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 6:
                co coVar6 = this.f40722b;
                coVar6.getClass();
                MessageObject messageObject6 = this.f40723c;
                if (messageObject6.isVideo()) {
                    coVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                co coVar7 = this.f40722b;
                coVar7.getMessagesController().pinMessage(coVar7.f35237e, coVar7.f35249f, this.f40723c.getId(), true, false, false);
                coVar7.A3 = null;
                return;
            default:
                co coVar8 = this.f40722b;
                org.telegram.ui.Components.yc.a0(coVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f40723c;
                coVar8.Fa(messageObject7);
                coVar8.Ha(messageObject7);
                return;
        }
    }
}
