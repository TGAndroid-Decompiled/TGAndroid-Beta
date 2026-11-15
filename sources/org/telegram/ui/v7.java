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
    public final int f52144a;
    public final Object f52145b;
    public final Object f52146c;

    public v7(int i7, Object obj, Object obj2) {
        this.f52144a = i7;
        this.f52145b = obj;
        this.f52146c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f52144a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5((Object) ((i8) this.f52145b), (Object) tL_error, tLObject, (Object) ((Calendar) this.f52146c), 4));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new o1((oc) this.f52145b, tLObject, (org.telegram.ui.ActionBar.i6) this.f52146c, 10));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new o1((xd) this.f52145b, tLObject, (Context) this.f52146c, 13));
                return;
            case 3:
                an anVar = (an) this.f52145b;
                TLObject tLObject2 = (TLObject) this.f52146c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i7 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    org.telegram.messenger.g0.h3(new oe(anVar, i7, 6));
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.g0.h3(new o1((an) this.f52145b, tLObject, (TLRPC.User) this.f52146c, 21));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5((org.telegram.ui.ActionBar.e2) ((an) this.f52145b), tLObject, (TLObject) tL_error, (Object) ((org.telegram.messenger.vr) this.f52146c), 10));
                return;
            case 6:
                an anVar2 = (an) this.f52145b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f52146c;
                if (tL_error == null) {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new u5(28, anVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new u5(29, anVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.messenger.g0.h3(new o1((dl) this.f52145b, tLObject, (org.telegram.messenger.gj) this.f52146c, 23));
                return;
            case 8:
                qn qnVar = (qn) this.f52145b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f52146c;
                TLRPC.UserFull userFull = qnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    qnVar.getMessagesStorage().j2(qnVar.E0, false);
                }
                org.telegram.messenger.g0.h3(new ln(qnVar, 2));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new zg(11, (to) this.f52145b, (org.telegram.ui.ActionBar.t1[]) this.f52146c));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5((Object) ((mp) this.f52145b), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f52146c), 13));
                return;
            case 11:
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) this.f52145b;
                org.telegram.messenger.ns.f(c5Var.f33508e).d(new org.telegram.ui.Components.b5(c5Var, (ArrayList) this.f52146c, tLObject, 0));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new ki.n((org.telegram.ui.Components.y7) this.f52145b, (org.telegram.ui.ActionBar.t1) this.f52146c, tLObject, 27));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(9, (org.telegram.ui.Components.ki) this.f52145b, (TLRPC.TL_attachMenuBot) this.f52146c));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(8, (org.telegram.ui.Components.ki) this.f52145b, (org.telegram.ui.Components.di) this.f52146c));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.yf((org.telegram.ui.Components.cp) this.f52145b, tLObject, (org.telegram.ui.ActionBar.i6) this.f52146c, 4));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(12, (org.telegram.ui.Components.zz) this.f52145b, (Pair) this.f52146c));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5((Object) ((org.telegram.ui.Components.zz) this.f52145b), (Object) tL_error, tLObject, (Object) ((org.telegram.messenger.z10) this.f52146c), 25));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5((Object) ((org.telegram.ui.Components.k20) this.f52145b), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) this.f52146c), 27));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.t70) this.f52145b, (TLRPC.TL_chatInviteExported) this.f52146c, tL_error, tLObject));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.yf((org.telegram.ui.Components.te0) this.f52145b, (org.telegram.ui.Components.se0) this.f52146c, tLObject, 18));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.hh0((org.telegram.ui.Components.po0) this.f52145b, tLObject, (Context) this.f52146c, 6));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((org.telegram.ui.Components.bw0) this.f52145b, tL_error, tLObject, (org.telegram.messenger.si) this.f52146c, 5));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((no0) this.f52145b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f52146c, 6));
                return;
            case 24:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((org.telegram.ui.Components.ny0) this.f52145b, (org.telegram.ui.ActionBar.t1) this.f52146c, tLObject, tL_error, 7));
                return;
            case 25:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((org.telegram.ui.Components.p21) this.f52145b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f52146c, 9));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new tp((jx) this.f52145b, tLObject, (org.telegram.messenger.gj) this.f52146c, 4));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(16, (fy) this.f52145b, (org.telegram.ui.ActionBar.t1) this.f52146c));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(20, (hz) this.f52145b, (org.telegram.ui.ActionBar.t1) this.f52146c));
                return;
            default:
                org.telegram.messenger.g0.h3(new tp((bz) this.f52145b, tL_error, (az) this.f52146c, 8));
                return;
        }
    }
}
