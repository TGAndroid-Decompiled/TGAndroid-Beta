package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class wm extends org.telegram.ui.Cells.t9 {
    public eo B0;

    @Override
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        MessageObject.GroupedMessages y82;
        eo eoVar = this.B0;
        if (eoVar != null) {
            int min = Math.min(i11, eoVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject != null) {
                tn b10 = tn.b(i10, min, messageObject);
                if (b10.f36972i != null) {
                    ok okVar = this.B0.Y;
                    boolean z10 = false;
                    if (okVar != null && okVar.getVisibility() == 0) {
                        lVar = ((org.telegram.ui.ActionBar.p2) this.B0).actionBar;
                        if (lVar != null) {
                            lVar2 = ((org.telegram.ui.ActionBar.p2) this.B0).actionBar;
                            if (lVar2.s()) {
                                this.B0.z7(false);
                            }
                        }
                        this.B0.Cb(messageObject, b10);
                        ok okVar2 = this.B0.Y;
                        if (okVar2 != null) {
                            okVar2.H0();
                            return;
                        }
                        return;
                    }
                    eo eoVar2 = this.B0;
                    eoVar2.f32395l5 = b10;
                    eoVar2.f32421n5 = messageObject;
                    if (eoVar2.h != null) {
                        z10 = true;
                    }
                    eoVar2.f32324f5 = new MessagePreviewParams(z10, eoVar2.y9(), ChatObject.isMonoForum(this.B0.e));
                    eo eoVar3 = this.B0;
                    eoVar3.f32324f5.updateReply(eoVar3.f32421n5, eoVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.f32395l5);
                    Bundle e = org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true);
                    e.putBoolean("quote", true);
                    e.putInt("messagesCount", 1);
                    e.putBoolean("canSelectTopics", true);
                    wy wyVar = new wy(e);
                    eo eoVar4 = this.B0;
                    wyVar.C2 = eoVar4;
                    eoVar4.presentFragment(wyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        eo eoVar;
        eo eoVar2 = this.B0;
        if ((eoVar2 == null || eoVar2.a() != 489000) && (eoVar = this.B0) != null) {
            if (eoVar.a() >= 0 || !this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
                org.telegram.ui.Cells.aa aaVar = this.W;
                if (aaVar != null && ((org.telegram.ui.Cells.t1) aaVar).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void d0(eo eoVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f20455u0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = eoVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.aa aaVar;
        boolean z10;
        eo eoVar;
        org.telegram.ui.Cells.aa aaVar2;
        TLRPC.Chat chat;
        eo eoVar2 = this.B0;
        if (eoVar2 == null || eoVar2.a() != 489000) {
            eo eoVar3 = this.B0;
            if ((eoVar3 != null && eoVar3.y9()) || ((aaVar = this.W) != null && ((org.telegram.ui.Cells.t1) aaVar).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f20458x0 && (eoVar = this.B0) != null && eoVar.h == null && (((aaVar2 = this.W) == null || (((org.telegram.ui.Cells.t1) aaVar2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.f32291c9.f20456v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int p() {
        eo eoVar = this.B0;
        if (eoVar == null) {
            return 0;
        }
        return eoVar.Aa;
    }

    @Override
    public final int q() {
        eo eoVar = this.B0;
        if (eoVar == null) {
            return 0;
        }
        return (int) eoVar.f32487s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 r() {
        eo eoVar = this.B0;
        if (eoVar != null) {
            return eoVar.f32316ea;
        }
        return null;
    }

    @Override
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.B0.f32316ea);
    }
}
