package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class tm extends org.telegram.ui.Cells.p9 {
    public zn f42028w0;

    @Override
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        zn znVar = this.f42028w0;
        if (znVar != null) {
            int min = Math.min(i11, znVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.f42028w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject != null) {
                pn b10 = pn.b(i10, min, messageObject);
                if (b10.f40849i != null) {
                    ok okVar = this.f42028w0.Y;
                    boolean z10 = false;
                    if (okVar != null && okVar.getVisibility() == 0) {
                        kVar = ((org.telegram.ui.ActionBar.n2) this.f42028w0).actionBar;
                        if (kVar != null) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) this.f42028w0).actionBar;
                            if (kVar2.t()) {
                                this.f42028w0.C7(false);
                            }
                        }
                        this.f42028w0.Gb(messageObject, b10);
                        ok okVar2 = this.f42028w0.Y;
                        if (okVar2 != null) {
                            okVar2.F0();
                            return;
                        }
                        return;
                    }
                    zn znVar2 = this.f42028w0;
                    znVar2.f44840l5 = b10;
                    znVar2.f44866n5 = messageObject;
                    if (znVar2.h != null) {
                        z10 = true;
                    }
                    znVar2.f44769f5 = new MessagePreviewParams(z10, znVar2.D9(), ChatObject.isMonoForum(this.f42028w0.f44751e));
                    zn znVar3 = this.f42028w0;
                    znVar3.f44769f5.updateReply(znVar3.f44866n5, znVar3.D8(messageObject.getGroupId()), this.f42028w0.a(), this.f42028w0.f44840l5);
                    Bundle d = org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true);
                    d.putBoolean("quote", true);
                    d.putInt("messagesCount", 1);
                    d.putBoolean("canSelectTopics", true);
                    ty tyVar = new ty(d);
                    zn znVar4 = this.f42028w0;
                    tyVar.C2 = znVar4;
                    znVar4.presentFragment(tyVar);
                }
            }
        }
    }

    @Override
    public final boolean b() {
        zn znVar;
        zn znVar2 = this.f42028w0;
        if ((znVar2 == null || znVar2.a() != 489000) && (znVar = this.f42028w0) != null) {
            if (znVar.a() >= 0 || !this.f42028w0.getMessagesController().isPeerNoForwards(this.f42028w0.a())) {
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

    public final void c0(zn znVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f22661p0;
            if (i10 < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
                i10++;
            } else {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.f42028w0 = znVar;
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Cells.w9 w9Var;
        boolean z10;
        zn znVar;
        org.telegram.ui.Cells.w9 w9Var2;
        TLRPC.Chat chat;
        zn znVar2 = this.f42028w0;
        if (znVar2 == null || znVar2.a() != 489000) {
            zn znVar3 = this.f42028w0;
            if ((znVar3 != null && znVar3.D9()) || ((w9Var = this.W) != null && ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f22664s0 && (znVar = this.f42028w0) != null && znVar.h == null && (((w9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.f42028w0.f44735c9.f22662q0)) && !this.f42028w0.getMessagesController().getTranslateController().isTranslatingDialog(this.f42028w0.T5) && !UserObject.isService(this.f42028w0.T5) && (!z10 || (chat = this.f42028w0.f44751e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int o() {
        zn znVar = this.f42028w0;
        if (znVar == null) {
            return 0;
        }
        return znVar.Ba;
    }

    @Override
    public final int p() {
        zn znVar = this.f42028w0;
        if (znVar == null) {
            return 0;
        }
        return (int) znVar.f44932s9;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 q() {
        zn znVar = this.f42028w0;
        if (znVar != null) {
            return znVar.f44761ea;
        }
        return null;
    }

    @Override
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.i6.w0(i10, this.f42028w0.f44761ea);
    }
}
