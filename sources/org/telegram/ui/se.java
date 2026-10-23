package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class se implements Runnable {
    public final int f41391a;
    public final sn f41392b;
    public final MessageObject f41393c;

    public se(sn snVar, MessageObject messageObject, int i10) {
        this.f41391a = i10;
        this.f41392b = snVar;
        this.f41393c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f41391a) {
            case 0:
                MessageObject messageObject = this.f41393c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.J1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.J1.P().l(messageObject) == null) {
                        this.f41392b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sn snVar = this.f41392b;
                snVar.getClass();
                MessageObject messageObject2 = this.f41393c;
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
                    snVar.getMessagesController().markMessageAsRead(snVar.f41519f6, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    snVar.getMessagesController().markMessageAsRead2(snVar.f41519f6, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                sn snVar2 = this.f41392b;
                snVar2.getClass();
                MessageObject messageObject3 = this.f41393c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f20364id;
                if (messageObject3.getDialogId() == snVar2.X6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                snVar2.bb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 3:
                sn snVar3 = this.f41392b;
                snVar3.getClass();
                MessageObject messageObject4 = this.f41393c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f20364id;
                if (messageObject4.getDialogId() == snVar3.X6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                snVar3.bb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 4:
                sn snVar4 = this.f41392b;
                snVar4.getClass();
                MessageObject messageObject5 = this.f41393c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f20364id;
                if (messageObject5.getDialogId() == snVar4.X6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                snVar4.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 5:
                int id2 = this.f41393c.getId();
                sn snVar5 = this.f41392b;
                snVar5.bb(id2, 0, true, 0, true, 0, null, null, new kf(snVar5, 24));
                if (snVar5.f41691t6.isEmpty()) {
                    snVar5.Rb(false);
                    return;
                }
                return;
            case 6:
                sn snVar6 = this.f41392b;
                snVar6.getClass();
                MessageObject messageObject6 = this.f41393c;
                if (messageObject6.isVideo()) {
                    snVar6.ma(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                sn snVar7 = this.f41392b;
                snVar7.getMessagesController().pinMessage(snVar7.e, snVar7.f41512f, this.f41393c.getId(), true, false, false);
                snVar7.M3 = null;
                return;
            default:
                sn snVar8 = this.f41392b;
                org.telegram.ui.Components.xc.a0(snVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f41393c;
                snVar8.Ja(messageObject7);
                snVar8.La(messageObject7);
                return;
        }
    }
}
