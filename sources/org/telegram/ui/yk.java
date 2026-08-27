package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

public final class yk extends org.telegram.ui.Components.gb0 {
    public final rn D;

    public yk(rn rnVar, Context context, rn rnVar2, jg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.cb0 cb0Var, int i11, boolean z10) {
        super(context, rnVar2, aVar, messagePreviewParams, user, chat, i10, cb0Var, i11, z10);
        this.D = rnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        hn hnVar;
        rn rnVar = this.D;
        hn hnVar2 = rnVar.f42069h5;
        if (hnVar2 == null || (messageObject = hnVar2.f38861a) == null || !((hnVar = rnVar.f41992b5.quote) == null || hnVar.f38861a == null || messageObject.getId() == rnVar.f41992b5.quote.f38861a.getId())) {
            rnVar.f42069h5 = rnVar.f41992b5.quote;
        }
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        rn rnVar = this.D;
        MessagePreviewParams messagePreviewParams = rnVar.f41992b5;
        if (messagePreviewParams != null) {
            if (!z10) {
                rnVar.f42082i5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = rnVar.f41992b5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    rnVar.S5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle bundleE = org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true);
            bundleE.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = rnVar.f41992b5.replyMessage) == null || messages.messages.isEmpty() || rnVar.f41992b5.quote != null) ? false : true;
            bundleE.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(rnVar.f41992b5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != rnVar.a() && peerDialogId != rnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    bundleE.putLong("reply_to_author", peerDialogId);
                }
            }
            bundleE.putInt("hasPoll", i10);
            bundleE.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = rnVar.f41992b5.forwardMessages;
            bundleE.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            bundleE.putBoolean("canSelectTopics", true);
            gy gyVar = new gy(bundleE);
            gyVar.f38621y2 = rnVar;
            rnVar.presentFragment(gyVar);
        }
    }
}
