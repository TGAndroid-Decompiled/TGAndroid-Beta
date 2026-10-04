package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class rm extends org.telegram.ui.Cells.r9 {
    public yn B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages z82;
        yn ynVar = this.B0;
        if (ynVar != null) {
            int min = Math.min(i11, ynVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (z82 = this.B0.z8(messageObject.getGroupId())) != null && !z82.isDocuments) {
                messageObject = z82.captionMessage;
            }
            if (messageObject != null) {
                on b10 = on.b(i10, min, messageObject);
                if (b10.f39247i != null) {
                    jk jkVar = this.B0.W;
                    boolean z10 = false;
                    if (jkVar != null && jkVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                            if (kVar2.s()) {
                                this.B0.z7(false);
                            }
                        }
                        this.B0.Bb(messageObject, b10);
                        jk jkVar2 = this.B0.W;
                        if (jkVar2 != null) {
                            jkVar2.H0();
                            return;
                        }
                        return;
                    }
                    yn ynVar2 = this.B0;
                    ynVar2.f43388j5 = b10;
                    ynVar2.f43412l5 = messageObject;
                    if (ynVar2.h != null) {
                        z10 = true;
                    }
                    ynVar2.f43314d5 = new MessagePreviewParams(z10, ynVar2.x9(), ChatObject.isMonoForum(this.B0.f43322e));
                    yn ynVar3 = this.B0;
                    ynVar3.f43314d5.updateReply(ynVar3.f43412l5, ynVar3.z8(messageObject.getGroupId()), this.B0.a(), this.B0.f43388j5);
                    Bundle d = org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true);
                    d.putBoolean("quote", true);
                    d.putInt("messagesCount", 1);
                    d.putBoolean("canSelectTopics", true);
                    uy uyVar = new uy(d);
                    yn ynVar4 = this.B0;
                    uyVar.C2 = ynVar4;
                    ynVar4.presentFragment(uyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        yn ynVar;
        yn ynVar2 = this.B0;
        if ((ynVar2 == null || ynVar2.a() != 489000) && (ynVar = this.B0) != null) {
            if (ynVar.a() >= 0 || !this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
                org.telegram.ui.Cells.y9 y9Var = this.W;
                if (y9Var != null && ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(yn ynVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f22735u0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = ynVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.y9 y9Var;
        boolean z10;
        yn ynVar;
        org.telegram.ui.Cells.y9 y9Var2;
        TLRPC.Chat chat;
        yn ynVar2 = this.B0;
        if (ynVar2 == null || ynVar2.a() != 489000) {
            yn ynVar3 = this.B0;
            if ((ynVar3 != null && ynVar3.x9()) || ((y9Var = this.W) != null && ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22738x0 && (ynVar = this.B0) != null && ynVar.h == null && (((y9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.B0.f43278a9.f22736v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.R5) && !UserObject.isService(this.B0.R5) && (!z10 || (chat = this.B0.f43322e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        yn ynVar = this.B0;
        if (ynVar == null) {
            return 0;
        }
        return ynVar.f43581ya;
    }

    @Override
    public final int q() {
        yn ynVar = this.B0;
        if (ynVar == null) {
            return 0;
        }
        return (int) ynVar.f43476q9;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 r() {
        yn ynVar = this.B0;
        if (ynVar != null) {
            return ynVar.f43307ca;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.i6.v0(i10, this.B0.f43307ca);
    }
}
