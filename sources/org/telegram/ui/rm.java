package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class rm extends org.telegram.ui.Cells.s9 {
    public xn B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        xn xnVar = this.B0;
        if (xnVar != null) {
            int min = Math.min(i11, xnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject != null) {
                nn b10 = nn.b(i10, min, messageObject);
                if (b10.f35562i != null) {
                    jk jkVar = this.B0.Y;
                    boolean z10 = false;
                    if (jkVar != null && jkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                            if (kVar2.s()) {
                                this.B0.z7(false);
                            }
                        }
                        this.B0.Cb(messageObject, b10);
                        jk jkVar2 = this.B0.Y;
                        if (jkVar2 != null) {
                            jkVar2.I0();
                            return;
                        }
                        return;
                    }
                    xn xnVar2 = this.B0;
                    xnVar2.f39449l5 = b10;
                    xnVar2.f39475n5 = messageObject;
                    if (xnVar2.h != null) {
                        z10 = true;
                    }
                    xnVar2.f39378f5 = new MessagePreviewParams(z10, xnVar2.y9(), ChatObject.isMonoForum(this.B0.e));
                    xn xnVar3 = this.B0;
                    xnVar3.f39378f5.updateReply(xnVar3.f39475n5, xnVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.f39449l5);
                    Bundle e = org.telegram.messenger.z0.e(3, "onlySelect", "dialogsType", true);
                    e.putBoolean("quote", true);
                    e.putInt("messagesCount", 1);
                    e.putBoolean("canSelectTopics", true);
                    ry ryVar = new ry(e);
                    xn xnVar4 = this.B0;
                    ryVar.C2 = xnVar4;
                    xnVar4.presentFragment(ryVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        xn xnVar;
        xn xnVar2 = this.B0;
        if ((xnVar2 == null || xnVar2.a() != 489000) && (xnVar = this.B0) != null) {
            if (xnVar.a() >= 0 || !this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
                org.telegram.ui.Cells.z9 z9Var = this.W;
                if (z9Var != null && ((org.telegram.ui.Cells.t1) z9Var).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(xn xnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f20936u0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = xnVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.z9 z9Var;
        boolean z10;
        xn xnVar;
        org.telegram.ui.Cells.z9 z9Var2;
        TLRPC.Chat chat;
        xn xnVar2 = this.B0;
        if (xnVar2 == null || xnVar2.a() != 489000) {
            xn xnVar3 = this.B0;
            if ((xnVar3 != null && xnVar3.y9()) || ((z9Var = this.W) != null && ((org.telegram.ui.Cells.t1) z9Var).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f20939x0 && (xnVar = this.B0) != null && xnVar.h == null && (((z9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) z9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.f39345c9.f20937v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        xn xnVar = this.B0;
        if (xnVar == null) {
            return 0;
        }
        return xnVar.Aa;
    }

    @Override
    public final int q() {
        xn xnVar = this.B0;
        if (xnVar == null) {
            return 0;
        }
        return (int) xnVar.f39541s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 r() {
        xn xnVar = this.B0;
        if (xnVar != null) {
            return xnVar.f39370ea;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, this.B0.f39370ea);
    }
}
