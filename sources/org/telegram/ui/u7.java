package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class u7 implements RequestDelegate {
    public final int f52459a;
    public final Object f52460b;
    public final Object f52461c;

    public u7(int i7, Object obj, Object obj2) {
        this.f52459a = i7;
        this.f52460b = obj;
        this.f52461c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f52459a) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((i8) this.f52460b, tL_error, tLObject, (Calendar) this.f52461c, 7));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new o1((oc) this.f52460b, tLObject, (org.telegram.ui.ActionBar.l6) this.f52461c, 10));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new o1((xd) this.f52460b, tLObject, (Context) this.f52461c, 13));
                return;
            case 3:
                bn bnVar = (bn) this.f52460b;
                TLObject tLObject2 = (TLObject) this.f52461c;
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
                org.telegram.messenger.g0.g3(new o1((bn) this.f52460b, tLObject, (TLRPC.User) this.f52461c, 21));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((bn) this.f52460b, tLObject, tL_error, (org.telegram.messenger.ur) this.f52461c, 13));
                return;
            case 6:
                bn bnVar2 = (bn) this.f52460b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f52461c;
                if (tL_error == null) {
                    bnVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new k9(24, bnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new k9(25, bnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 7:
                org.telegram.messenger.g0.g3(new o1((el) this.f52460b, tLObject, (org.telegram.messenger.gj) this.f52461c, 23));
                return;
            case 8:
                rn rnVar = (rn) this.f52460b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f52461c;
                TLRPC.UserFull userFull = rnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    rnVar.getMessagesStorage().j2(rnVar.E0, false);
                }
                org.telegram.messenger.g0.g3(new mn(rnVar, 2));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new ci(7, (uo) this.f52460b, (org.telegram.ui.ActionBar.t1[]) this.f52461c));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((np) this.f52460b, tL_error, tLObject, (TwoStepVerificationActivity) this.f52461c, 16));
                return;
            case 11:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) this.f52460b;
                org.telegram.messenger.ls.f(l5Var.f37067e).d(new org.telegram.ui.Components.k5(l5Var, (ArrayList) this.f52461c, tLObject, 0));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.g((org.telegram.ui.Components.f8) this.f52460b, (org.telegram.ui.ActionBar.t1) this.f52461c, tLObject, 1));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.og(5, (org.telegram.ui.Components.ui) this.f52460b, (TLRPC.TL_attachMenuBot) this.f52461c));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.og(4, (org.telegram.ui.Components.ui) this.f52460b, (org.telegram.ui.Components.ni) this.f52461c));
                return;
            case 15:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.g((org.telegram.ui.Components.lp) this.f52460b, tLObject, (org.telegram.ui.ActionBar.l6) this.f52461c, 8));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.fw(8, (org.telegram.ui.Components.i00) this.f52460b, (Pair) this.f52461c));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((org.telegram.ui.Components.i00) this.f52460b, tL_error, tLObject, (org.telegram.messenger.y10) this.f52461c, 28));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20((org.telegram.ui.Components.v20) this.f52460b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f52461c, 0));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20((org.telegram.ui.Components.g80) this.f52460b, (TLRPC.TL_chatInviteExported) this.f52461c, tL_error, tLObject));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.g((org.telegram.ui.Components.ff0) this.f52460b, (org.telegram.ui.Components.ef0) this.f52461c, tLObject, 22));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.ap0) this.f52460b, tLObject, (Context) this.f52461c, 2));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20((org.telegram.ui.Components.kw0) this.f52460b, tL_error, tLObject, (org.telegram.messenger.si) this.f52461c, 8));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20((ro0) this.f52460b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f52461c, 9));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20((KeyEvent.Callback) ((org.telegram.ui.Components.wy0) this.f52460b), (Object) ((org.telegram.ui.ActionBar.t1) this.f52461c), tLObject, tL_error, 10));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20((org.telegram.ui.Components.b31) this.f52460b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f52461c, 12));
                return;
            case 26:
                org.telegram.messenger.g0.g3(new up((nx) this.f52460b, tLObject, (org.telegram.messenger.gj) this.f52461c, 4));
                return;
            case 27:
                org.telegram.messenger.g0.g3(new vs(11, (iy) this.f52460b, (org.telegram.ui.ActionBar.t1) this.f52461c));
                return;
            case 28:
                org.telegram.messenger.g0.g3(new vs(15, (kz) this.f52460b, (org.telegram.ui.ActionBar.t1) this.f52461c));
                return;
            default:
                org.telegram.messenger.g0.g3(new up((ez) this.f52460b, tL_error, (dz) this.f52461c, 8));
                return;
        }
    }
}
