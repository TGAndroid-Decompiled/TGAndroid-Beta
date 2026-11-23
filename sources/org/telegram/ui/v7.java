package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class v7 implements RequestDelegate {
    public final int f52832a;
    public final Object f52833b;
    public final Object f52834c;

    public v7(int i7, Object obj, Object obj2) {
        this.f52832a = i7;
        this.f52833b = obj;
        this.f52834c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f52832a) {
            case 0:
                org.telegram.messenger.g0.g3(new oi.h((j8) this.f52833b, tL_error, tLObject, (Calendar) this.f52834c, 8));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new o1((oc) this.f52833b, tLObject, (org.telegram.ui.ActionBar.m6) this.f52834c, 10));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new o1((xd) this.f52833b, tLObject, (Context) this.f52834c, 13));
                return;
            case 3:
                bn bnVar = (bn) this.f52833b;
                TLObject tLObject2 = (TLObject) this.f52834c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    org.telegram.messenger.g0.g3(new re(bnVar, i7, 6));
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.g0.g3(new o1((bn) this.f52833b, tLObject, (TLRPC.User) this.f52834c, 21));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new oi.h((bn) this.f52833b, tLObject, tL_error, (org.telegram.messenger.tr) this.f52834c, 14));
                return;
            case 6:
                bn bnVar2 = (bn) this.f52833b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f52834c;
                if (tL_error == null) {
                    bnVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new u5(28, bnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new u5(29, bnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.messenger.g0.g3(new o1((el) this.f52833b, tLObject, (org.telegram.messenger.fj) this.f52834c, 23));
                return;
            case 8:
                rn rnVar = (rn) this.f52833b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f52834c;
                TLRPC.UserFull userFull = rnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    rnVar.getMessagesStorage().j2(rnVar.E0, false);
                }
                org.telegram.messenger.g0.g3(new mn(rnVar, 2));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new ah(11, (uo) this.f52833b, (org.telegram.ui.ActionBar.t1[]) this.f52834c));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new oi.h((np) this.f52833b, tL_error, tLObject, (TwoStepVerificationActivity) this.f52834c, 17));
                return;
            case 11:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) this.f52833b;
                org.telegram.messenger.ks.f(k5Var.f36650e).d(new org.telegram.ui.Components.j5(k5Var, (ArrayList) this.f52834c, tLObject, 0));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((org.telegram.ui.Components.e8) this.f52833b, (org.telegram.ui.ActionBar.t1) this.f52834c, tLObject, 2));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xd(9, (org.telegram.ui.Components.ti) this.f52833b, (TLRPC.TL_attachMenuBot) this.f52834c));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xd(8, (org.telegram.ui.Components.ti) this.f52833b, (org.telegram.ui.Components.mi) this.f52834c));
                return;
            case 15:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((org.telegram.ui.Components.ip) this.f52833b, tLObject, (org.telegram.ui.ActionBar.m6) this.f52834c));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.bt(12, (org.telegram.ui.Components.g00) this.f52833b, (Pair) this.f52834c));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new oi.h((org.telegram.ui.Components.g00) this.f52833b, tL_error, tLObject, (org.telegram.messenger.w10) this.f52834c, 29));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((org.telegram.ui.Components.s20) this.f52833b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f52834c, 1));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((org.telegram.ui.Components.d80) this.f52833b, (TLRPC.TL_chatInviteExported) this.f52834c, tL_error, tLObject, 3));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa((org.telegram.ui.Components.ef0) this.f52833b, (org.telegram.ui.Components.df0) this.f52834c, tLObject, 23));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.sh0((org.telegram.ui.Components.zo0) this.f52833b, tLObject, (Context) this.f52834c, 6));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((org.telegram.ui.Components.jw0) this.f52833b, tL_error, tLObject, (org.telegram.messenger.ri) this.f52834c, 9));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((qo0) this.f52833b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f52834c, 10));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((org.telegram.ui.Components.vy0) this.f52833b, (org.telegram.ui.ActionBar.t1) this.f52834c, tLObject, tL_error, 11));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((org.telegram.ui.Components.a31) this.f52833b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f52834c, 13));
                return;
            case 26:
                org.telegram.messenger.g0.g3(new up((mx) this.f52833b, tLObject, (org.telegram.messenger.fj) this.f52834c, 4));
                return;
            case 27:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.voip.o(17, (hy) this.f52833b, (org.telegram.ui.ActionBar.t1) this.f52834c));
                return;
            case 28:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.voip.o(21, (jz) this.f52833b, (org.telegram.ui.ActionBar.t1) this.f52834c));
                return;
            default:
                org.telegram.messenger.g0.g3(new up((dz) this.f52833b, tL_error, (cz) this.f52834c, 8));
                return;
        }
    }
}
