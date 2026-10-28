package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f43607a;
    public final wn f43608b;
    public final MessageObject f43609c;

    public te(wn wnVar, MessageObject messageObject, int i10) {
        this.f43607a = i10;
        this.f43608b = wnVar;
        this.f43609c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f43607a) {
            case 0:
                MessageObject messageObject = this.f43609c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                        this.f43608b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wn wnVar = this.f43608b;
                wnVar.getClass();
                MessageObject messageObject2 = this.f43609c;
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
                message.destroyTime = wnVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = wnVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (wnVar.h != null) {
                    wnVar.getMessagesController().markMessageAsRead(wnVar.f45168j6, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    wnVar.getMessagesController().markMessageAsRead2(wnVar.f45168j6, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f43609c.getId();
                wn wnVar2 = this.f43608b;
                wnVar2.kb(id2, 0, true, 0, true, 0, null, null, new ig(wnVar2, 15));
                if (wnVar2.f45345x6.isEmpty()) {
                    wnVar2.bc(false);
                    return;
                }
                return;
            case 3:
                wn wnVar3 = this.f43608b;
                wnVar3.getClass();
                MessageObject messageObject3 = this.f43609c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f22049id;
                if (messageObject3.getDialogId() == wnVar3.f45065b7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                wnVar3.kb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                wn wnVar4 = this.f43608b;
                wnVar4.getClass();
                MessageObject messageObject4 = this.f43609c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f22049id;
                if (messageObject4.getDialogId() == wnVar4.f45065b7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                wnVar4.kb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                wn wnVar5 = this.f43608b;
                wnVar5.getClass();
                MessageObject messageObject5 = this.f43609c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f22049id;
                if (messageObject5.getDialogId() == wnVar5.f45065b7) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                wnVar5.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 6:
                wn wnVar6 = this.f43608b;
                wnVar6.getClass();
                MessageObject messageObject6 = this.f43609c;
                if (messageObject6.isVideo()) {
                    wnVar6.ua(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                wn wnVar7 = this.f43608b;
                wnVar7.getMessagesController().pinMessage(wnVar7.e, wnVar7.f45113f, this.f43609c.getId(), true, false, false);
                wnVar7.M3 = null;
                return;
            default:
                wn wnVar8 = this.f43608b;
                org.telegram.ui.Components.wc.b0(wnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f43609c;
                wnVar8.Ra(messageObject7);
                wnVar8.Ta(messageObject7);
                return;
        }
    }
}
