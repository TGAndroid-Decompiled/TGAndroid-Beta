package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f44804a;
    public final eo f44805b;
    public final MessageObject f44806c;

    public ze(eo eoVar, MessageObject messageObject, int i10) {
        this.f44804a = i10;
        this.f44805b = eoVar;
        this.f44806c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f44804a) {
            case 0:
                MessageObject messageObject = this.f44806c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f44805b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                eo eoVar = this.f44805b;
                eoVar.getClass();
                MessageObject messageObject2 = this.f44806c;
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
                message.destroyTime = eoVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = eoVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (eoVar.h != null) {
                    eoVar.getMessagesController().markMessageAsRead(eoVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    eoVar.getMessagesController().markMessageAsRead2(eoVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                eo eoVar2 = this.f44805b;
                eoVar2.getClass();
                MessageObject messageObject3 = this.f44806c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f19824id;
                if (messageObject3.getDialogId() == eoVar2.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                eoVar2.bb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 3:
                eo eoVar3 = this.f44805b;
                eoVar3.getClass();
                MessageObject messageObject4 = this.f44806c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f19824id;
                if (messageObject4.getDialogId() == eoVar3.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                eoVar3.bb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 4:
                eo eoVar4 = this.f44805b;
                eoVar4.getClass();
                MessageObject messageObject5 = this.f44806c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f19824id;
                if (messageObject5.getDialogId() == eoVar4.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                eoVar4.F(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 5:
                int id2 = this.f44806c.getId();
                eo eoVar5 = this.f44805b;
                eoVar5.bb(id2, 0, true, 0, true, 0, null, null, new vf(eoVar5, 23));
                if (eoVar5.f37288h6.isEmpty()) {
                    eoVar5.Pb(false);
                    return;
                }
                return;
            case 6:
                eo eoVar6 = this.f44805b;
                eoVar6.getClass();
                MessageObject messageObject6 = this.f44806c;
                if (messageObject6.isVideo()) {
                    eoVar6.ma(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                eo eoVar7 = this.f44805b;
                eoVar7.getMessagesController().pinMessage(eoVar7.f37246e, eoVar7.f37258f, this.f44806c.getId(), true, false, false);
                eoVar7.A3 = null;
                return;
            default:
                eo eoVar8 = this.f44805b;
                org.telegram.ui.Components.zc.a0(eoVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f44806c;
                eoVar8.Ja(messageObject7);
                eoVar8.La(messageObject7);
                return;
        }
    }
}
