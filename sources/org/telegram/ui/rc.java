package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
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
public final class rc implements RequestDelegate {
    public final int f42359a;
    public final Object f42360b;
    public final Object f42361c;

    public rc(int i9, Object obj, Object obj2) {
        this.f42359a = i9;
        this.f42360b = obj;
        this.f42361c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9;
        switch (this.f42359a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((vc) this.f42360b, tLObject, (org.telegram.ui.ActionBar.e6) this.f42361c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((fe) this.f42360b, tLObject, (Context) this.f42361c, 12));
                return;
            case 2:
                qn qnVar = (qn) this.f42360b;
                TLObject tLObject2 = (TLObject) this.f42361c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i9 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i9 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new ve(qnVar, i9, 5));
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t1((qn) this.f42360b, tLObject, (TLRPC.User) this.f42361c, 20));
                return;
            case 4:
                qn qnVar2 = (qn) this.f42360b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f42361c;
                if (tL_error == null) {
                    qnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rd(10, qnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new rd(11, qnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 5:
                AndroidUtilities.runOnUIThread(new k6((qn) this.f42360b, tLObject, tL_error, (MessagesStorage) this.f42361c, 8));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new t1((sl) this.f42360b, tLObject, (MessageObject) this.f42361c, 23));
                return;
            case 7:
                ho hoVar = (ho) this.f42360b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f42361c;
                TLRPC.UserFull userFull = hoVar.A0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    hoVar.getMessagesStorage().updateUserInfo(hoVar.A0, false);
                }
                AndroidUtilities.runOnUIThread(new bo(hoVar, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new rd(23, (hp) this.f42360b, (org.telegram.ui.ActionBar.c2[]) this.f42361c));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new k6((bq) this.f42360b, tL_error, tLObject, (TwoStepVerificationActivity) this.f42361c, 11));
                return;
            case 10:
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) this.f42360b;
                NotificationCenter.getInstance(g5Var.f28654e).doOnIdle(new org.telegram.ui.Components.f5(g5Var, (ArrayList) this.f42361c, tLObject, 0));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((org.telegram.ui.Components.c8) this.f42360b, (org.telegram.ui.ActionBar.c2) this.f42361c, tLObject, 12));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new wq(14, (org.telegram.ui.Components.ki) this.f42360b, (org.telegram.ui.Components.di) this.f42361c));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new wq(15, (org.telegram.ui.Components.ki) this.f42360b, (TLRPC.TL_attachMenuBot) this.f42361c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((org.telegram.ui.Components.ap) this.f42360b, tLObject, (org.telegram.ui.ActionBar.e6) this.f42361c, 18));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zq(16, (org.telegram.ui.Components.n00) this.f42360b, (Pair) this.f42361c));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new k6((org.telegram.ui.Components.n00) this.f42360b, tL_error, tLObject, (Utilities.Callback) this.f42361c, 21));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new k6((org.telegram.ui.Components.b30) this.f42360b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f42361c, 23));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new k6((org.telegram.ui.Components.e80) this.f42360b, (TLRPC.TL_chatInviteExported) this.f42361c, tL_error, tLObject, 25));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue0((org.telegram.ui.Components.ag0) this.f42360b, (org.telegram.ui.Components.zf0) this.f42361c, tLObject, 1));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jg0((org.telegram.ui.Components.rp0) this.f42360b, tLObject, (Context) this.f42361c, 11));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.Components.cx0) this.f42360b, tL_error, tLObject, (MediaDataController) this.f42361c, 1));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((or0) this.f42360b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f42361c, 2));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.Components.mz0) this.f42360b, (org.telegram.ui.ActionBar.c2) this.f42361c, tLObject, tL_error, 3));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.Components.z21) this.f42360b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f42361c, 5));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new jq((py) this.f42360b, tLObject, (MessageObject) this.f42361c, 4));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(19, (jz) this.f42360b, (org.telegram.ui.ActionBar.c2) this.f42361c));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(23, (n00) this.f42360b, (org.telegram.ui.ActionBar.c2) this.f42361c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new jq((g00) this.f42360b, tL_error, (f00) this.f42361c, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(25, (FiltersSetupActivity) this.f42360b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f42361c));
                return;
        }
    }
}
