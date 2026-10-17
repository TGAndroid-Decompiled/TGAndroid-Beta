package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f41967a;
    public final sn f41968b;
    public final MessageObject f41969c;

    public ue(sn snVar, MessageObject messageObject, int i10) {
        this.f41967a = i10;
        this.f41968b = snVar;
        this.f41969c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f41967a) {
            case 0:
                MessageObject messageObject = this.f41969c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                        this.f41968b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sn snVar = this.f41968b;
                snVar.getClass();
                MessageObject messageObject2 = this.f41969c;
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
                message.destroyTime = snVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = snVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (snVar.h != null) {
                    snVar.getMessagesController().markMessageAsRead(snVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    snVar.getMessagesController().markMessageAsRead2(snVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                sn snVar2 = this.f41968b;
                snVar2.getClass();
                MessageObject messageObject3 = this.f41969c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f20293id;
                if (messageObject3.getDialogId() == snVar2.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                snVar2.bb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 3:
                sn snVar3 = this.f41968b;
                snVar3.getClass();
                MessageObject messageObject4 = this.f41969c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f20293id;
                if (messageObject4.getDialogId() == snVar3.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                snVar3.bb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 4:
                sn snVar4 = this.f41968b;
                snVar4.getClass();
                MessageObject messageObject5 = this.f41969c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f20293id;
                if (messageObject5.getDialogId() == snVar4.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                snVar4.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 5:
                int id2 = this.f41969c.getId();
                sn snVar5 = this.f41968b;
                snVar5.bb(id2, 0, true, 0, true, 0, null, null, new mf(snVar5, 23));
                if (snVar5.f41239h6.isEmpty()) {
                    snVar5.Pb(false);
                    return;
                }
                return;
            case 6:
                sn snVar6 = this.f41968b;
                snVar6.getClass();
                MessageObject messageObject6 = this.f41969c;
                if (messageObject6.isVideo()) {
                    snVar6.ma(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                sn snVar7 = this.f41968b;
                snVar7.getMessagesController().pinMessage(snVar7.e, snVar7.f41208f, this.f41969c.getId(), true, false, false);
                snVar7.A3 = null;
                return;
            default:
                sn snVar8 = this.f41968b;
                org.telegram.ui.Components.xc.a0(snVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f41969c;
                snVar8.Ja(messageObject7);
                snVar8.La(messageObject7);
                return;
        }
    }
}
