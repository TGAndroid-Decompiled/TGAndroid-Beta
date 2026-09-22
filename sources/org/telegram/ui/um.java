package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class um extends org.telegram.ui.Cells.r9 {
    public bo B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        bo boVar = this.B0;
        if (boVar != null) {
            int min = Math.min(i11, boVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject != null) {
                rn b10 = rn.b(i10, min, messageObject);
                if (b10.f37176i != null) {
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
                            mkVar2.I0();
                            return;
                        }
                        return;
                    }
                    bo boVar2 = this.B0;
                    boVar2.f32372l5 = b10;
                    boVar2.f32398n5 = messageObject;
                    if (boVar2.h != null) {
                        z10 = true;
                    }
                    boVar2.f32301f5 = new MessagePreviewParams(z10, boVar2.y9(), ChatObject.isMonoForum(this.B0.e));
                    bo boVar3 = this.B0;
                    boVar3.f32301f5.updateReply(boVar3.f32398n5, boVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.f32372l5);
                    Bundle e = org.telegram.messenger.y0.e(3, "onlySelect", "dialogsType", true);
                    e.putBoolean("quote", true);
                    e.putInt("messagesCount", 1);
                    e.putBoolean("canSelectTopics", true);
                    uy uyVar = new uy(e);
                    bo boVar4 = this.B0;
                    uyVar.C2 = boVar4;
                    boVar4.presentFragment(uyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        bo boVar;
        bo boVar2 = this.B0;
        if ((boVar2 == null || boVar2.a() != 489000) && (boVar = this.B0) != null) {
            if (boVar.a() >= 0 || !this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
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

    public final void d0(bo boVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f20803u0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = boVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.y9 y9Var;
        boolean z10;
        bo boVar;
        org.telegram.ui.Cells.y9 y9Var2;
        TLRPC.Chat chat;
        bo boVar2 = this.B0;
        if (boVar2 == null || boVar2.a() != 489000) {
            bo boVar3 = this.B0;
            if ((boVar3 != null && boVar3.y9()) || ((y9Var = this.W) != null && ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f20806x0 && (boVar = this.B0) != null && boVar.h == null && (((y9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.f32268c9.f20804v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        bo boVar = this.B0;
        if (boVar == null) {
            return 0;
        }
        return boVar.Aa;
    }

    @Override
    public final int q() {
        bo boVar = this.B0;
        if (boVar == null) {
            return 0;
        }
        return (int) boVar.f32464s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 r() {
        bo boVar = this.B0;
        if (boVar != null) {
            return boVar.f32293ea;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.i6.v0(i10, this.B0.f32293ea);
    }
}
