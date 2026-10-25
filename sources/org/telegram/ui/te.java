package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class te implements Runnable {
    public final int f43810a;
    public final un f43811b;
    public final MessageObject f43812c;

    public te(un unVar, MessageObject messageObject, int i10) {
        this.f43810a = i10;
        this.f43811b = unVar;
        this.f43812c = messageObject;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f43810a) {
            case 0:
                MessageObject messageObject = this.f43812c;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                        this.f43811b.createArticleViewer(false).N(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                un unVar = this.f43811b;
                unVar.getClass();
                MessageObject messageObject2 = this.f43812c;
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
                message.destroyTime = unVar.getConnectionsManager().getCurrentTime() + i10;
                messageObject2.messageOwner.destroyTimeMillis = unVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (unVar.h != null) {
                    unVar.getMessagesController().markMessageAsRead(unVar.f44249f6, messageObject2.messageOwner.random_id, i10);
                    return;
                } else {
                    unVar.getMessagesController().markMessageAsRead2(unVar.f44249f6, messageObject2.getId(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int id2 = this.f43812c.getId();
                un unVar2 = this.f43811b;
                unVar2.gb(id2, 0, true, 0, true, 0, null, null, new jg(unVar2, 15));
                if (unVar2.f44421t6.isEmpty()) {
                    unVar2.Xb(false);
                    return;
                }
                return;
            case 3:
                un unVar3 = this.f43811b;
                unVar3.getClass();
                MessageObject messageObject3 = this.f43812c;
                int replyMsgId = messageObject3.getReplyMsgId();
                int i15 = messageObject3.messageOwner.f22048id;
                if (messageObject3.getDialogId() == unVar3.X6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                unVar3.gb(replyMsgId, i15, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject3.messageOwner.action).answer.option, null);
                return;
            case 4:
                un unVar4 = this.f43811b;
                unVar4.getClass();
                MessageObject messageObject4 = this.f43812c;
                int replyMsgId2 = messageObject4.getReplyMsgId();
                int i16 = messageObject4.messageOwner.f22048id;
                if (messageObject4.getDialogId() == unVar4.X6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                unVar4.gb(replyMsgId2, i16, true, i12, false, 0, null, null, null);
                return;
            case 5:
                un unVar5 = this.f43811b;
                unVar5.getClass();
                MessageObject messageObject5 = this.f43812c;
                int replyMsgId3 = messageObject5.getReplyMsgId();
                int i17 = messageObject5.messageOwner.f22048id;
                if (messageObject5.getDialogId() == unVar5.X6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                unVar5.j(replyMsgId3, i17, true, i13, false, 0);
                return;
            case 6:
                un unVar6 = this.f43811b;
                unVar6.getClass();
                MessageObject messageObject6 = this.f43812c;
                if (messageObject6.isVideo()) {
                    unVar6.ra(null, messageObject6);
                    return;
                } else {
                    MediaController.getInstance().playMessage(messageObject6);
                    return;
                }
            case 7:
                un unVar7 = this.f43811b;
                unVar7.getMessagesController().pinMessage(unVar7.e, unVar7.f44242f, this.f43812c.getId(), true, false, false);
                unVar7.M3 = null;
                return;
            default:
                un unVar8 = this.f43811b;
                org.telegram.ui.Components.wc.b0(unVar8).c(LocaleController.getString(R.string.AdHidden)).j();
                MessageObject messageObject7 = this.f43812c;
                unVar8.Oa(messageObject7);
                unVar8.Qa(messageObject7);
                return;
        }
    }
}
