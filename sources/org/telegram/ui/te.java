package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f38063a;
    public final wn f38064b;
    public final MessageObject f38065c;

    public te(wn wnVar, MessageObject messageObject, int i10) {
        this.f38063a = i10;
        this.f38064b = wnVar;
        this.f38065c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f38063a) {
            case 0:
                MessageObject messageObject = this.f38065c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                        this.f38064b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wn wnVar = this.f38064b;
                wnVar.getClass();
                MessageObject messageObject2 = this.f38065c;
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
                    wnVar.getMessagesController().markMessageAsRead(wnVar.T5, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    wnVar.getMessagesController().markMessageAsRead2(wnVar.T5, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f38065c.getId();
                wn wnVar2 = this.f38064b;
                wnVar2.Xa(id2, 0, true, 0, true, 0, null, null, new rg(wnVar2, 13));
                if (wnVar2.f39501h6.isEmpty()) {
                    wnVar2.Lb(false);
                    return;
                }
                return;
            case 3:
                wn wnVar3 = this.f38064b;
                wnVar3.getClass();
                MessageObject messageObject3 = this.f38065c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f18356id;
                if (messageObject3.getDialogId() == wnVar3.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                wnVar3.Xa(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                wn wnVar4 = this.f38064b;
                wnVar4.getClass();
                MessageObject messageObject4 = this.f38065c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f18356id;
                if (messageObject4.getDialogId() == wnVar4.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                wnVar4.Xa(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                wn wnVar5 = this.f38064b;
                wnVar5.getClass();
                MessageObject messageObject5 = this.f38065c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f18356id;
                if (messageObject5.getDialogId() == wnVar5.L6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                wnVar5.F(replyMsgId3, i17, i13, 0, true, false);
                return;
            case 6:
                wn wnVar6 = this.f38064b;
                wnVar6.getClass();
                MessageObject messageObject6 = this.f38065c;
                if (messageObject6.isVideo()) {
                    wnVar6.ha(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                wn wnVar7 = this.f38064b;
                wnVar7.getMessagesController().pinMessage(wnVar7.e, wnVar7.f39471f, this.f38065c.getId(), true, false, false);
                wnVar7.A3 = null;
                return;
            default:
                wn wnVar8 = this.f38064b;
                org.telegram.ui.Components.xc.a0(wnVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f38065c;
                wnVar8.Fa(messageObject7);
                wnVar8.Ha(messageObject7);
                return;
        }
    }
}
