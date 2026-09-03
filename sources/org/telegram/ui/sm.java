package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class sm extends org.telegram.ui.Cells.m9 {
    public zn B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        zn znVar = this.B0;
        if (znVar != null) {
            int min = Math.min(i11, znVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject != null) {
                pn b10 = pn.b(i10, min, messageObject);
                if (b10.f37194i != null) {
                    lk lkVar = this.B0.V;
                    boolean z4 = false;
                    if (lkVar != null && lkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.p2) this.B0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.p2) this.B0).actionBar;
                            if (kVar2.s()) {
                                this.B0.z7(false);
                            }
                        }
                        this.B0.Cb(messageObject, b10);
                        lk lkVar2 = this.B0.V;
                        if (lkVar2 != null) {
                            lkVar2.H0();
                            return;
                        }
                        return;
                    }
                    zn znVar2 = this.B0;
                    znVar2.f40618i5 = b10;
                    znVar2.f40642k5 = messageObject;
                    if (znVar2.h != null) {
                        z4 = true;
                    }
                    znVar2.f40542c5 = new MessagePreviewParams(z4, znVar2.y9(), ChatObject.isMonoForum(this.B0.e));
                    zn znVar3 = this.B0;
                    znVar3.f40542c5.updateReply(znVar3.f40642k5, znVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.f40618i5);
                    Bundle e = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
                    e.putBoolean("quote", true);
                    e.putInt("messagesCount", 1);
                    e.putBoolean("canSelectTopics", true);
                    qy qyVar = new qy(e);
                    zn znVar4 = this.B0;
                    qyVar.f37649z2 = znVar4;
                    znVar4.presentFragment(qyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        zn znVar;
        zn znVar2 = this.B0;
        if ((znVar2 == null || znVar2.a() != 489000) && (znVar = this.B0) != null) {
            if (znVar.a() >= 0 || !this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
                org.telegram.ui.Cells.t9 t9Var = this.W;
                if (t9Var != null && ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(zn znVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f21374u0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = znVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.t9 t9Var;
        boolean z4;
        zn znVar;
        org.telegram.ui.Cells.t9 t9Var2;
        TLRPC.Chat chat;
        zn znVar2 = this.B0;
        if (znVar2 == null || znVar2.a() != 489000) {
            zn znVar3 = this.B0;
            if ((znVar3 != null && znVar3.y9()) || ((t9Var = this.W) != null && ((org.telegram.ui.Cells.s1) t9Var).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().messageOwner.noforwards)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!this.f21377x0 && (znVar = this.B0) != null && znVar.h == null && (((t9Var2 = this.W) == null || (((org.telegram.ui.Cells.s1) t9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.s1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.s1) this.W).getMessageObject().richLayout == null && !this.B0.Z8.f21375v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.Q5) && !UserObject.isService(this.B0.Q5) && (!z4 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        zn znVar = this.B0;
        if (znVar == null) {
            return 0;
        }
        return znVar.f40810xa;
    }

    @Override
    public final int q() {
        zn znVar = this.B0;
        if (znVar == null) {
            return 0;
        }
        return (int) znVar.f40707p9;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        zn znVar = this.B0;
        if (znVar != null) {
            return znVar.f40534ba;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.B0.f40534ba);
    }
}
