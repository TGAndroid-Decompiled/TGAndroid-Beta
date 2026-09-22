package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f38064a;
    public final zn f38065b;
    public final MessageObject f38066c;

    public ue(zn znVar, MessageObject messageObject, int i10) {
        this.f38064a = i10;
        this.f38065b = znVar;
        this.f38066c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f38064a) {
            case 0:
                MessageObject messageObject = this.f38066c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f38065b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zn znVar = this.f38065b;
                znVar.getClass();
                MessageObject messageObject2 = this.f38066c;
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
                message.destroyTime = znVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = znVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (znVar.h != null) {
                    znVar.getMessagesController().markMessageAsRead(znVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    znVar.getMessagesController().markMessageAsRead2(znVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f38066c.getId();
                zn znVar2 = this.f38065b;
                znVar2.Xa(id2, 0, true, 0, true, 0, null, null, new ug(znVar2, 13));
                if (znVar2.f40357h6.isEmpty()) {
                    znVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                zn znVar3 = this.f38065b;
                znVar3.getClass();
                MessageObject messageObject3 = this.f38066c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f18364id;
                if (messageObject3.getDialogId() == znVar3.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                znVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                zn znVar4 = this.f38065b;
                znVar4.getClass();
                MessageObject messageObject4 = this.f38066c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f18364id;
                if (messageObject4.getDialogId() == znVar4.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                znVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                zn znVar5 = this.f38065b;
                znVar5.getClass();
                MessageObject messageObject5 = this.f38066c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f18364id;
                if (messageObject5.getDialogId() == znVar5.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                znVar5.E(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 6:
                zn znVar6 = this.f38065b;
                znVar6.getClass();
                MessageObject messageObject6 = this.f38066c;
                if (messageObject6.isVideo()) {
                    znVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                zn znVar7 = this.f38065b;
                znVar7.getMessagesController().pinMessage(znVar7.e, znVar7.f40326f, this.f38066c.getId(), true, false, false);
                znVar7.A3 = null;
                return;
            default:
                zn znVar8 = this.f38065b;
                org.telegram.ui.Components.xc.a0(znVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f38066c;
                znVar8.Fa(messageObject7);
                znVar8.Ha(messageObject7);
                return;
        }
    }
}
