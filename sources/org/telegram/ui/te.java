package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f38473a;
    public final zn f38474b;
    public final MessageObject f38475c;

    public te(zn znVar, MessageObject messageObject, int i10) {
        this.f38473a = i10;
        this.f38474b = znVar;
        this.f38475c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f38473a) {
            case 0:
                MessageObject messageObject = this.f38475c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                        this.f38474b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zn znVar = this.f38474b;
                znVar.getClass();
                MessageObject messageObject2 = this.f38475c;
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
                message.destroyTime = znVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = znVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (znVar.h != null) {
                    znVar.getMessagesController().markMessageAsRead(znVar.Q5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    znVar.getMessagesController().markMessageAsRead2(znVar.Q5, messageObject2.getId(), null, i10, 0L, z4);
                    return;
                }
            case 2:
                int id2 = this.f38475c.getId();
                zn znVar2 = this.f38474b;
                znVar2.Xa(id2, 0, true, 0, true, 0, null, null, new pg(znVar2, 13));
                if (znVar2.e6.isEmpty()) {
                    znVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                zn znVar3 = this.f38474b;
                znVar3.getClass();
                MessageObject messageObject3 = this.f38475c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f19180id;
                if (messageObject3.getDialogId() == znVar3.I6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                znVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                zn znVar4 = this.f38474b;
                znVar4.getClass();
                MessageObject messageObject4 = this.f38475c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f19180id;
                if (messageObject4.getDialogId() == znVar4.I6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                znVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                zn znVar5 = this.f38474b;
                znVar5.getClass();
                MessageObject messageObject5 = this.f38475c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f19180id;
                if (messageObject5.getDialogId() == znVar5.I6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                znVar5.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 6:
                zn znVar6 = this.f38474b;
                znVar6.getClass();
                MessageObject messageObject6 = this.f38475c;
                if (messageObject6.isVideo()) {
                    znVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                zn znVar7 = this.f38474b;
                znVar7.getMessagesController().pinMessage(znVar7.e, znVar7.f40575f, this.f38475c.getId(), true, false, false);
                znVar7.f40803x3 = null;
                return;
            default:
                zn znVar8 = this.f38474b;
                org.telegram.ui.Components.qc.a0(znVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f38475c;
                znVar8.Fa(messageObject7);
                znVar8.Ha(messageObject7);
                return;
        }
    }
}
