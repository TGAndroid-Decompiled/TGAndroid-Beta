package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class ym extends org.telegram.ui.Cells.p9 {
    public fo f41850w0;

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        fo foVar = this.f41850w0;
        if (foVar != null) {
            int min = Math.min(i11, foVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.f41850w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject != null) {
                un b10 = un.b(i10, min, messageObject);
                if (b10.f40450i != null) {
                    sk skVar = this.f41850w0.Y;
                    boolean z10 = false;
                    if (skVar != null && skVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.m2) this.f41850w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.m2) this.f41850w0).actionBar;
                            if (kVar2.t()) {
                                this.f41850w0.C7(false);
                            }
                        }
                        this.f41850w0.Gb(messageObject, b10);
                        sk skVar2 = this.f41850w0.Y;
                        if (skVar2 != null) {
                            skVar2.F0();
                            return;
                        }
                        return;
                    }
                    fo foVar2 = this.f41850w0;
                    foVar2.f35713l5 = b10;
                    foVar2.f35739n5 = messageObject;
                    if (foVar2.h != null) {
                        z10 = true;
                    }
                    foVar2.f35642f5 = new MessagePreviewParams(z10, foVar2.D9(), ChatObject.isMonoForum(this.f41850w0.e));
                    fo foVar3 = this.f41850w0;
                    foVar3.f35642f5.updateReply(foVar3.f35739n5, foVar3.D8(messageObject.getGroupId()), this.f41850w0.a(), this.f41850w0.f35713l5);
                    Bundle d = org.telegram.messenger.sk.d(3, "onlySelect", "dialogsType", true);
                    d.putBoolean("quote", true);
                    d.putInt("messagesCount", 1);
                    d.putBoolean("canSelectTopics", true);
                    yy yyVar = new yy(d);
                    fo foVar4 = this.f41850w0;
                    yyVar.C2 = foVar4;
                    foVar4.presentFragment(yyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        fo foVar;
        fo foVar2 = this.f41850w0;
        if ((foVar2 == null || foVar2.a() != 489000) && (foVar = this.f41850w0) != null) {
            if (foVar.a() >= 0 || !this.f41850w0.getMessagesController().isPeerNoForwards(this.f41850w0.a())) {
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

    public final void c0(fo foVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f21403p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f41850w0 = foVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.w9 w9Var;
        boolean z10;
        fo foVar;
        org.telegram.ui.Cells.w9 w9Var2;
        TLRPC.Chat chat;
        fo foVar2 = this.f41850w0;
        if (foVar2 == null || foVar2.a() != 489000) {
            fo foVar3 = this.f41850w0;
            if ((foVar3 != null && foVar3.D9()) || ((w9Var = this.W) != null && ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f21406s0 && (foVar = this.f41850w0) != null && foVar.h == null && (((w9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.f41850w0.f35608c9.f21404q0)) && !this.f41850w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f41850w0.T5) && !UserObject.isService(this.f41850w0.T5) && (!z10 || (chat = this.f41850w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        fo foVar = this.f41850w0;
        if (foVar == null) {
            return 0;
        }
        return foVar.Ba;
    }

    @Override
    public final int p() {
        fo foVar = this.f41850w0;
        if (foVar == null) {
            return 0;
        }
        return (int) foVar.f35805s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 q() {
        fo foVar = this.f41850w0;
        if (foVar != null) {
            return foVar.f35633ea;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.g6.w0(i10, this.f41850w0.f35633ea);
    }
}
