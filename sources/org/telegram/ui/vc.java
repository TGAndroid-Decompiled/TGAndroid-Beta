package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
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
public final class vc implements RequestDelegate {
    public final int f42192a;
    public final Object f42193b;
    public final Object f42194c;

    public vc(int i10, Object obj, Object obj2) {
        this.f42192a = i10;
        this.f42193b = obj;
        this.f42194c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f42192a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((zc) this.f42193b, tLObject, (org.telegram.ui.ActionBar.g6) this.f42194c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((ie) this.f42193b, tLObject, (Context) this.f42194c, 12));
                return;
            case 2:
                qn qnVar = (qn) this.f42193b;
                TLObject tLObject2 = (TLObject) this.f42194c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new bf(qnVar, i10, 5));
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t1((qn) this.f42193b, tLObject, (TLRPC.User) this.f42194c, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((qn) this.f42193b, tLObject, tL_error, (MessagesStorage) this.f42194c, 13));
                return;
            case 5:
                qn qnVar2 = (qn) this.f42193b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f42194c;
                if (tL_error == null) {
                    qnVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new eh(1, qnVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new eh(2, qnVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new t1((tl) this.f42193b, tLObject, (MessageObject) this.f42194c, 23));
                return;
            case 7:
                io ioVar = (io) this.f42193b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f42194c;
                TLRPC.UserFull userFull = ioVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    ioVar.getMessagesStorage().updateUserInfo(ioVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new bo(ioVar, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new eh(14, (ip) this.f42193b, (org.telegram.ui.ActionBar.b2[]) this.f42194c));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((bq) this.f42193b, tL_error, tLObject, (TwoStepVerificationActivity) this.f42194c, 16));
                return;
            case 10:
                org.telegram.ui.Components.n5 n5Var = (org.telegram.ui.Components.n5) this.f42193b;
                NotificationCenter.getInstance(n5Var.e).doOnIdle(new org.telegram.ui.Components.m5(n5Var, (ArrayList) this.f42194c, tLObject, 0));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ig.e2((org.telegram.ui.Components.k8) this.f42193b, (org.telegram.ui.ActionBar.b2) this.f42194c, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(6, (org.telegram.ui.Components.ti) this.f42193b, (org.telegram.ui.Components.mi) this.f42194c));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(7, (org.telegram.ui.Components.ti) this.f42193b, (TLRPC.TL_attachMenuBot) this.f42194c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.up) this.f42193b, tLObject, (org.telegram.ui.ActionBar.g6) this.f42194c, 3));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yt(11, (org.telegram.ui.Components.k10) this.f42193b, (Pair) this.f42194c));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.k10) this.f42193b, tL_error, tLObject, (Utilities.Callback) this.f42194c, 26));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.a40) this.f42193b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f42194c, 28));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((org.telegram.ui.Components.q90) this.f42193b, (TLRPC.TL_chatInviteExported) this.f42194c, tL_error, tLObject, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.kh0) this.f42193b, (org.telegram.ui.Components.jh0) this.f42194c, tLObject, 17));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.go0((org.telegram.ui.Components.er0) this.f42193b, tLObject, (Context) this.f42194c, 5));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((org.telegram.ui.Components.py0) this.f42193b), tL_error, tLObject, (Object) ((MediaDataController) this.f42194c), 6));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((xr0) this.f42193b), tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) this.f42194c), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((KeyEvent.Callback) ((org.telegram.ui.Components.d11) this.f42193b), (Object) ((org.telegram.ui.ActionBar.b2) this.f42194c), tLObject, tL_error, 8));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((org.telegram.ui.Components.s41) this.f42193b), tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) this.f42194c), 10));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new jq((oy) this.f42193b, tLObject, (MessageObject) this.f42194c, 4));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new lt(12, (jz) this.f42193b, (org.telegram.ui.ActionBar.b2) this.f42194c));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new lt(16, (n00) this.f42193b, (org.telegram.ui.ActionBar.b2) this.f42194c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new jq((g00) this.f42193b, tL_error, (f00) this.f42194c, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lt(18, (FiltersSetupActivity) this.f42193b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f42194c));
                return;
        }
    }
}
