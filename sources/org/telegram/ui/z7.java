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
    public final int f46190a;
    public final Object f46191b;
    public final Object f46192c;

    public z7(int i10, Object obj, Object obj2) {
        this.f46190a = i10;
        this.f46191b = obj;
        this.f46192c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f46190a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4.v0((n8) this.f46191b, tL_error, tLObject, (Calendar) this.f46192c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new q1((zc) this.f46191b, tLObject, (org.telegram.ui.ActionBar.x6) this.f46192c, 10));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q1((ke) this.f46191b, tLObject, (Context) this.f46192c, 13));
                return;
            case 3:
                un unVar = (un) this.f46191b;
                TLObject tLObject2 = (TLObject) this.f46192c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new ze(unVar, i10, 5));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new q1((un) this.f46191b, tLObject, (TLRPC.User) this.f46192c, 20));
                return;
            case 5:
                un unVar2 = (un) this.f46191b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f46192c;
                if (tL_error == null) {
                    unVar2.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ed(12, unVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ed(13, unVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new m4.v0((un) this.f46191b, tLObject, tL_error, (MessagesStorage) this.f46192c, 16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new q1((vl) this.f46191b, tLObject, (MessageObject) this.f46192c, 23));
                return;
            case 8:
                mo moVar = (mo) this.f46191b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f46192c;
                TLRPC.UserFull userFull = moVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    moVar.getMessagesStorage().updateUserInfo(moVar.D0, false);
                }
                AndroidUtilities.runOnUIThread(new go(moVar, 2));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ed(25, (np) this.f46191b, (org.telegram.ui.ActionBar.e2[]) this.f46192c));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new m4.v0((gq) this.f46191b, tL_error, tLObject, (TwoStepVerificationActivity) this.f46192c, 19));
                return;
            case 11:
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) this.f46191b;
                NotificationCenter.getInstance(p5Var.e).doOnIdle(new org.telegram.ui.Components.o5(p5Var, (ArrayList) this.f46192c, tLObject, 0));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new jg.f1((org.telegram.ui.Components.m8) this.f46191b, (org.telegram.ui.ActionBar.e2) this.f46192c, tLObject, 28));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ip(17, (org.telegram.ui.Components.ti) this.f46191b, (TLRPC.TL_attachMenuBot) this.f46192c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ip(18, (org.telegram.ui.Components.ti) this.f46191b, (org.telegram.ui.Components.mi) this.f46192c));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kg((org.telegram.ui.Components.wp) this.f46191b, tLObject, (org.telegram.ui.ActionBar.x6) this.f46192c, 4));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.so(21, (org.telegram.ui.Components.n10) this.f46191b, (Pair) this.f46192c));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new m4.v0((org.telegram.ui.Components.n10) this.f46191b, tL_error, tLObject, (Utilities.Callback) this.f46192c, 29));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.c40) this.f46191b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f46192c, 1));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.r90) this.f46191b, (TLRPC.TL_chatInviteExported) this.f46192c, tL_error, tLObject, 3));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kg((org.telegram.ui.Components.nh0) this.f46191b, (org.telegram.ui.Components.mh0) this.f46192c, tLObject, 18));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t90((org.telegram.ui.Components.mr0) this.f46191b, tLObject, (Context) this.f46192c, 15));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.cz0) this.f46191b, tL_error, tLObject, (MediaDataController) this.f46192c, 9));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((es0) this.f46191b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f46192c, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.p11) this.f46191b, (org.telegram.ui.ActionBar.e2) this.f46192c, tLObject, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.f51) this.f46191b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f46192c, 13));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new nq((oy) this.f46191b, tLObject, (MessageObject) this.f46192c, 4));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c71(29, (jz) this.f46191b, (org.telegram.ui.ActionBar.e2) this.f46192c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new sz(3, (o00) this.f46191b, (org.telegram.ui.ActionBar.e2) this.f46192c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nq((h00) this.f46191b, tL_error, (g00) this.f46192c, 8));
                return;
        }
    }
}
