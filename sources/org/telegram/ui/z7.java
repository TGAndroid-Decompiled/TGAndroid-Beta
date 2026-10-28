package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class z7 implements RequestDelegate {
    public final int f46185a;
    public final Object f46186b;
    public final Object f46187c;

    public z7(int i10, Object obj, Object obj2) {
        this.f46185a = i10;
        this.f46186b = obj;
        this.f46187c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f46185a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4.v0((n8) this.f46186b, tL_error, tLObject, (Calendar) this.f46187c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q1((zc) this.f46186b, tLObject, (org.telegram.ui.ActionBar.x6) this.f46187c, 10));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1((ke) this.f46186b, tLObject, (Context) this.f46187c, 13));
                return;
            case 3:
                wn wnVar = (wn) this.f46186b;
                TLObject tLObject2 = (TLObject) this.f46187c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new ze(wnVar, i10, 5));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new q1((wn) this.f46186b, tLObject, (TLRPC.User) this.f46187c, 21));
                return;
            case 5:
                wn wnVar2 = (wn) this.f46186b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f46187c;
                if (tL_error == null) {
                    wnVar2.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ed(12, wnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ed(13, wnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new m4.v0((wn) this.f46186b, tLObject, tL_error, (MessagesStorage) this.f46187c, 16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new q1((xl) this.f46186b, tLObject, (MessageObject) this.f46187c, 23));
                return;
            case 8:
                oo ooVar = (oo) this.f46186b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f46187c;
                TLRPC.UserFull userFull = ooVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    ooVar.getMessagesStorage().updateUserInfo(ooVar.D0, false);
                }
                AndroidUtilities.runOnUIThread(new io(ooVar, 2));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ed(25, (pp) this.f46186b, (org.telegram.ui.ActionBar.e2[]) this.f46187c));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new m4.v0((iq) this.f46186b, tL_error, tLObject, (TwoStepVerificationActivity) this.f46187c, 19));
                return;
            case 11:
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) this.f46186b;
                NotificationCenter.getInstance(p5Var.e).doOnIdle(new org.telegram.ui.Components.o5(p5Var, (ArrayList) this.f46187c, tLObject, 0));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new jg.f1((org.telegram.ui.Components.m8) this.f46186b, (org.telegram.ui.ActionBar.e2) this.f46187c, tLObject, 28));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new kp(18, (org.telegram.ui.Components.ti) this.f46186b, (TLRPC.TL_attachMenuBot) this.f46187c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new kp(17, (org.telegram.ui.Components.ti) this.f46186b, (org.telegram.ui.Components.mi) this.f46187c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kg((org.telegram.ui.Components.xp) this.f46186b, tLObject, (org.telegram.ui.ActionBar.x6) this.f46187c, 4));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.so(21, (org.telegram.ui.Components.n10) this.f46186b, (Pair) this.f46187c));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new m4.v0((org.telegram.ui.Components.n10) this.f46186b, tL_error, tLObject, (Utilities.Callback) this.f46187c, 29));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.c40) this.f46186b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f46187c, 1));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.s90) this.f46186b, (TLRPC.TL_chatInviteExported) this.f46187c, tL_error, tLObject, 3));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kg((org.telegram.ui.Components.oh0) this.f46186b, (org.telegram.ui.Components.nh0) this.f46187c, tLObject, 18));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u90((org.telegram.ui.Components.nr0) this.f46186b, tLObject, (Context) this.f46187c, 15));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.dz0) this.f46186b, tL_error, tLObject, (MediaDataController) this.f46187c, 9));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((gs0) this.f46186b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f46187c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.q11) this.f46186b, (org.telegram.ui.ActionBar.e2) this.f46187c, tLObject, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.g51) this.f46186b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f46187c, 13));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new pq((qy) this.f46186b, tLObject, (MessageObject) this.f46187c, 4));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new kz(0, (mz) this.f46186b, (org.telegram.ui.ActionBar.e2) this.f46187c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new kz(4, (q00) this.f46186b, (org.telegram.ui.ActionBar.e2) this.f46187c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pq((j00) this.f46186b, tL_error, (i00) this.f46187c, 8));
                return;
        }
    }
}
