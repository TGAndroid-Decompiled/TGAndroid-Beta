package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class xm extends org.telegram.ui.Cells.p9 {
    public eo f44041w0;

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        eo eoVar = this.f44041w0;
        if (eoVar != null) {
            int min = Math.min(i11, eoVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.f44041w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject != null) {
                tn b10 = tn.b(i10, min, messageObject);
                if (b10.f42248i != null) {
                    sk skVar = this.f44041w0.Y;
                    boolean z10 = false;
                    if (skVar != null && skVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.m2) this.f44041w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.m2) this.f44041w0).actionBar;
                            if (kVar2.u()) {
                                this.f44041w0.C7(false);
                            }
                        }
                        this.f44041w0.Gb(messageObject, b10);
                        sk skVar2 = this.f44041w0.Y;
                        if (skVar2 != null) {
                            skVar2.J0();
                            return;
                        }
                        return;
                    }
                    eo eoVar2 = this.f44041w0;
                    eoVar2.f37330l5 = b10;
                    eoVar2.f37356n5 = messageObject;
                    if (eoVar2.h != null) {
                        z10 = true;
                    }
                    eoVar2.f37259f5 = new MessagePreviewParams(z10, eoVar2.D9(), ChatObject.isMonoForum(this.f44041w0.f37241e));
                    eo eoVar3 = this.f44041w0;
                    eoVar3.f37259f5.updateReply(eoVar3.f37356n5, eoVar3.D8(messageObject.getGroupId()), this.f44041w0.a(), this.f44041w0.f37330l5);
                    Bundle e7 = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
                    e7.putBoolean("quote", true);
                    e7.putInt("messagesCount", 1);
                    e7.putBoolean("canSelectTopics", true);
                    vy vyVar = new vy(e7);
                    eo eoVar4 = this.f44041w0;
                    vyVar.C2 = eoVar4;
                    eoVar4.presentFragment(vyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        eo eoVar;
        eo eoVar2 = this.f44041w0;
        if ((eoVar2 == null || eoVar2.a() != 489000) && (eoVar = this.f44041w0) != null) {
            if (eoVar.a() >= 0 || !this.f44041w0.getMessagesController().isPeerNoForwards(this.f44041w0.a())) {
                org.telegram.ui.Cells.w9 w9Var = this.W;
                if (w9Var != null && ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c0(eo eoVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f22424p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f44041w0 = eoVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.w9 w9Var;
        boolean z10;
        eo eoVar;
        org.telegram.ui.Cells.w9 w9Var2;
        TLRPC.Chat chat;
        eo eoVar2 = this.f44041w0;
        if (eoVar2 == null || eoVar2.a() != 489000) {
            eo eoVar3 = this.f44041w0;
            if ((eoVar3 != null && eoVar3.D9()) || ((w9Var = this.W) != null && ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22427s0 && (eoVar = this.f44041w0) != null && eoVar.h == null && (((w9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.f44041w0.f37225c9.f22425q0)) && !this.f44041w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f44041w0.T5) && !UserObject.isService(this.f44041w0.T5) && (!z10 || (chat = this.f44041w0.f37241e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        eo eoVar = this.f44041w0;
        if (eoVar == null) {
            return 0;
        }
        return eoVar.Ba;
    }

    @Override
    public final int p() {
        eo eoVar = this.f44041w0;
        if (eoVar == null) {
            return 0;
        }
        return (int) eoVar.f37422s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 q() {
        eo eoVar = this.f44041w0;
        if (eoVar != null) {
            return eoVar.f37251ea;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.f44041w0.f37251ea);
    }
}
