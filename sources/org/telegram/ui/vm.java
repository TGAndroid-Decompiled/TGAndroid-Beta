package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class vm extends org.telegram.ui.Cells.r9 {
    public co B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        co coVar = this.B0;
        if (coVar != null) {
            int min = Math.min(i11, coVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject != null) {
                sn b10 = sn.b(i10, min, messageObject);
                if (b10.f40510i != null) {
                    mk mkVar = this.B0.Y;
                    boolean z10 = false;
                    if (mkVar != null && mkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                            if (kVar2.s()) {
                                this.B0.z7(false);
                            }
                        }
                        this.B0.Cb(messageObject, b10);
                        mk mkVar2 = this.B0.Y;
                        if (mkVar2 != null) {
                            mkVar2.H0();
                            return;
                        }
                        return;
                    }
                    co coVar2 = this.B0;
                    coVar2.f35353l5 = b10;
                    coVar2.f35379n5 = messageObject;
                    if (coVar2.h != null) {
                        z10 = true;
                    }
                    coVar2.f35282f5 = new MessagePreviewParams(z10, coVar2.y9(), ChatObject.isMonoForum(this.B0.f35264e));
                    co coVar3 = this.B0;
                    coVar3.f35282f5.updateReply(coVar3.f35379n5, coVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.f35353l5);
                    Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
                    e7.putBoolean("quote", true);
                    e7.putInt("messagesCount", 1);
                    e7.putBoolean("canSelectTopics", true);
                    uy uyVar = new uy(e7);
                    co coVar4 = this.B0;
                    uyVar.C2 = coVar4;
                    coVar4.presentFragment(uyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        co coVar;
        co coVar2 = this.B0;
        if ((coVar2 == null || coVar2.a() != 489000) && (coVar = this.B0) != null) {
            if (coVar.a() >= 0 || !this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
                org.telegram.ui.Cells.y9 y9Var = this.W;
                if (y9Var != null && ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(co coVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f22718u0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = coVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.y9 y9Var;
        boolean z10;
        co coVar;
        org.telegram.ui.Cells.y9 y9Var2;
        TLRPC.Chat chat;
        co coVar2 = this.B0;
        if (coVar2 == null || coVar2.a() != 489000) {
            co coVar3 = this.B0;
            if ((coVar3 != null && coVar3.y9()) || ((y9Var = this.W) != null && ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22721x0 && (coVar = this.B0) != null && coVar.h == null && (((y9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.f35248c9.f22719v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.f35264e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        co coVar = this.B0;
        if (coVar == null) {
            return 0;
        }
        return coVar.Aa;
    }

    @Override
    public final int q() {
        co coVar = this.B0;
        if (coVar == null) {
            return 0;
        }
        return (int) coVar.f35445s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        co coVar = this.B0;
        if (coVar != null) {
            return coVar.f35274ea;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.B0.f35274ea);
    }
}
