package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;
public final class zk extends org.telegram.ui.Components.rb0 {
    public final tn D;

    public zk(tn tnVar, Context context, tn tnVar2, lg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.nb0 nb0Var, int i11, boolean z10) {
        super(context, tnVar2, aVar, messagePreviewParams, user, chat, i10, nb0Var, i11, z10);
        this.D = tnVar;
    }

    @Override
    public final void b() {
        MessageObject messageObject;
        jn jnVar;
        tn tnVar = this.D;
        jn jnVar2 = tnVar.f42831h5;
        if (jnVar2 != null && (messageObject = jnVar2.f39590a) != null && ((jnVar = tnVar.f42755b5.quote) == null || jnVar.f39590a == null || messageObject.getId() == tnVar.f42755b5.quote.f39590a.getId())) {
            return;
        }
        tnVar.f42831h5 = tnVar.f42755b5.quote;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        long peerDialogId;
        int i11;
        MessagePreviewParams.Messages messages;
        int i12 = 0;
        a(false);
        tn tnVar = this.D;
        MessagePreviewParams messagePreviewParams = tnVar.f42755b5;
        if (messagePreviewParams != null) {
            if (!z10) {
                tnVar.f42843i5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject messageObject = tnVar.f42755b5.forwardMessages.messages.get(i13);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            if (messageObject.isPublicPoll()) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    tnVar.S5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
            e10.putBoolean("quote", !z10);
            if (!z10 && (messages = tnVar.f42755b5.replyMessage) != null && !messages.messages.isEmpty() && tnVar.f42755b5.quote == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            e10.putBoolean("reply_to", z12);
            if (z12 && (DialogObject.getPeerDialogId(tnVar.f42755b5.replyMessage.messages.get(0).getFromPeer())) != 0 && peerDialogId != tnVar.a() && peerDialogId != tnVar.getUserConfig().getClientUserId() && i11 > 0) {
                e10.putLong("reply_to_author", peerDialogId);
            }
            e10.putInt("hasPoll", i10);
            e10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = tnVar.f42755b5.forwardMessages;
            if (messages3 != null) {
                i12 = messages3.messages.size();
            }
            e10.putInt("messagesCount", i12);
            e10.putBoolean("canSelectTopics", true);
            fy fyVar = new fy(e10);
            fyVar.f38379y2 = tnVar;
            tnVar.presentFragment(fyVar);
        }
    }
}
