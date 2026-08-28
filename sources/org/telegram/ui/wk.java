package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class wk extends org.telegram.ui.Components.cb0 {
    public final qn D;

    public wk(qn qnVar, Context context, qn qnVar2, ig.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i9, org.telegram.ui.Components.ya0 ya0Var, int i10, boolean z10) {
        super(context, qnVar2, aVar, messagePreviewParams, user, chat, i9, ya0Var, i10, z10);
        this.D = qnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        gn gnVar;
        qn qnVar = this.D;
        gn gnVar2 = qnVar.f41934h5;
        if (gnVar2 != null && (messageObject = gnVar2.f38572a) != null && ((gnVar = qnVar.f41857b5.quote) == null || gnVar.f38572a == null || messageObject.getId() == qnVar.f41857b5.quote.f38572a.getId())) {
            return;
        }
        qnVar.f41934h5 = qnVar.f41857b5.quote;
    }

    @Override
    public final void c(boolean z10) {
        int i9;
        boolean z11;
        boolean z12;
        long peerDialogId;
        int i10;
        MessagePreviewParams.Messages messages;
        int i11 = 0;
        a(false);
        qn qnVar = this.D;
        MessagePreviewParams messagePreviewParams = qnVar.f41857b5;
        if (messagePreviewParams != null) {
            if (!z10) {
                qnVar.f41947i5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i9 = 0;
                z11 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    MessageObject messageObject = qnVar.f41857b5.forwardMessages.messages.get(i12);
                    if (messageObject.isTodo()) {
                        i9 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i9 != 2) {
                            if (messageObject.isPublicPoll()) {
                                i9 = 2;
                            } else {
                                i9 = 1;
                            }
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    qnVar.S5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i9 = 0;
                z11 = false;
            }
            Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
            e10.putBoolean("quote", !z10);
            if (!z10 && (messages = qnVar.f41857b5.replyMessage) != null && !messages.messages.isEmpty() && qnVar.f41857b5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e10.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(qnVar.f41857b5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != qnVar.a() && peerDialogId != qnVar.getUserConfig().getClientUserId() && i10 > 0) {
                e10.putLong("reply_to_author", peerDialogId);
            }
            e10.putInt("hasPoll", i9);
            e10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = qnVar.f41857b5.forwardMessages;
            if (messages3 != null) {
                i11 = messages3.messages.size();
            }
            e10.putInt("messagesCount", i11);
            e10.putBoolean("canSelectTopics", true);
            dy dyVar = new dy(e10);
            dyVar.f37752y2 = qnVar;
            qnVar.presentFragment(dyVar);
        }
    }
}
