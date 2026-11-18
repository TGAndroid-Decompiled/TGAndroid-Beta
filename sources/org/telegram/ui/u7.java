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
    public final int f52453a;
    public final Object f52454b;
    public final Object f52455c;

    public u7(int i7, Object obj, Object obj2) {
        this.f52453a = i7;
        this.f52454b = obj;
        this.f52455c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f52453a) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((i8) this.f52454b, tL_error, tLObject, (Calendar) this.f52455c, 7));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new o1((oc) this.f52454b, tLObject, (org.telegram.ui.ActionBar.m6) this.f52455c, 10));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new o1((xd) this.f52454b, tLObject, (Context) this.f52455c, 13));
                return;
            case 3:
                bn bnVar = (bn) this.f52454b;
                TLObject tLObject2 = (TLObject) this.f52455c;
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
                org.telegram.messenger.g0.g3(new o1((bn) this.f52454b, tLObject, (TLRPC.User) this.f52455c, 21));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((bn) this.f52454b, tLObject, tL_error, (org.telegram.messenger.tr) this.f52455c, 13));
                return;
            case 6:
                bn bnVar2 = (bn) this.f52454b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f52455c;
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
                org.telegram.messenger.g0.g3(new o1((el) this.f52454b, tLObject, (org.telegram.messenger.fj) this.f52455c, 23));
                return;
            case 8:
                rn rnVar = (rn) this.f52454b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f52455c;
                TLRPC.UserFull userFull = rnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    rnVar.getMessagesStorage().j2(rnVar.E0, false);
                }
                org.telegram.messenger.g0.g3(new mn(rnVar, 2));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new ci(7, (vo) this.f52454b, (org.telegram.ui.ActionBar.u1[]) this.f52455c));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((np) this.f52454b, tL_error, tLObject, (TwoStepVerificationActivity) this.f52455c, 16));
                return;
            case 11:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) this.f52454b;
                org.telegram.messenger.ks.f(k5Var.f36681e).d(new org.telegram.ui.Components.j5(k5Var, (ArrayList) this.f52455c, tLObject, 0));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7((org.telegram.ui.Components.g8) this.f52454b, (org.telegram.ui.ActionBar.u1) this.f52455c, tLObject, 0));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.mg(5, (org.telegram.ui.Components.si) this.f52454b, (TLRPC.TL_attachMenuBot) this.f52455c));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.mg(4, (org.telegram.ui.Components.si) this.f52454b, (org.telegram.ui.Components.li) this.f52455c));
                return;
            case 15:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7((Object) ((org.telegram.ui.Components.jp) this.f52454b), tLObject, (Object) ((org.telegram.ui.ActionBar.m6) this.f52455c), 7));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.dw(8, (org.telegram.ui.Components.g00) this.f52454b, (Pair) this.f52455c));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((org.telegram.ui.Components.g00) this.f52454b, tL_error, tLObject, (org.telegram.messenger.x10) this.f52455c, 28));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.s20) this.f52454b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f52455c, 0));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.e80) this.f52454b, (TLRPC.TL_chatInviteExported) this.f52455c, tL_error, tLObject));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7((org.telegram.ui.Components.df0) this.f52454b, (org.telegram.ui.Components.cf0) this.f52455c, tLObject, 21));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.hn0((org.telegram.ui.Components.yo0) this.f52454b, tLObject, (Context) this.f52455c, 2));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.iw0) this.f52454b, tL_error, tLObject, (org.telegram.messenger.ri) this.f52455c, 8));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((qo0) this.f52454b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f52455c, 9));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((KeyEvent.Callback) ((org.telegram.ui.Components.uy0) this.f52454b), (Object) ((org.telegram.ui.ActionBar.u1) this.f52455c), tLObject, tL_error, 10));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.y21) this.f52454b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f52455c, 12));
                return;
            case 26:
                org.telegram.messenger.g0.g3(new up((nx) this.f52454b, tLObject, (org.telegram.messenger.fj) this.f52455c, 4));
                return;
            case 27:
                org.telegram.messenger.g0.g3(new vs(11, (iy) this.f52454b, (org.telegram.ui.ActionBar.u1) this.f52455c));
                return;
            case 28:
                org.telegram.messenger.g0.g3(new vs(15, (kz) this.f52454b, (org.telegram.ui.ActionBar.u1) this.f52455c));
                return;
            default:
                org.telegram.messenger.g0.g3(new up((ez) this.f52454b, tL_error, (dz) this.f52455c, 8));
                return;
        }
    }
}
