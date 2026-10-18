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
public final class xc implements RequestDelegate {
    public final int f43063a;
    public final Object f43064b;
    public final Object f43065c;

    public xc(int i10, Object obj, Object obj2) {
        this.f43063a = i10;
        this.f43064b = obj;
        this.f43065c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f43063a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((bd) this.f43064b, tLObject, (org.telegram.ui.ActionBar.g6) this.f43065c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((ke) this.f43064b, tLObject, (Context) this.f43065c, 12));
                return;
            case 2:
                sn snVar = (sn) this.f43064b;
                TLObject tLObject2 = (TLObject) this.f43065c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new df(snVar, i10, 5));
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t1((sn) this.f43064b, tLObject, (TLRPC.User) this.f43065c, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((sn) this.f43064b, tLObject, tL_error, (MessagesStorage) this.f43065c, 13));
                return;
            case 5:
                sn snVar2 = (sn) this.f43064b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f43065c;
                if (tL_error == null) {
                    snVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new gh(1, snVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new gh(2, snVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new t1((vl) this.f43064b, tLObject, (MessageObject) this.f43065c, 23));
                return;
            case 7:
                ko koVar = (ko) this.f43064b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f43065c;
                TLRPC.UserFull userFull = koVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    koVar.getMessagesStorage().updateUserInfo(koVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new eo(koVar, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gh(14, (kp) this.f43064b, (org.telegram.ui.ActionBar.b2[]) this.f43065c));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((dq) this.f43064b, tL_error, tLObject, (TwoStepVerificationActivity) this.f43065c, 16));
                return;
            case 10:
                org.telegram.ui.Components.n5 n5Var = (org.telegram.ui.Components.n5) this.f43064b;
                NotificationCenter.getInstance(n5Var.e).doOnIdle(new org.telegram.ui.Components.m5(n5Var, (ArrayList) this.f43065c, tLObject, 0));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ig.e2((org.telegram.ui.Components.k8) this.f43064b, (org.telegram.ui.ActionBar.b2) this.f43065c, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(6, (org.telegram.ui.Components.ti) this.f43064b, (org.telegram.ui.Components.mi) this.f43065c));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(7, (org.telegram.ui.Components.ti) this.f43064b, (TLRPC.TL_attachMenuBot) this.f43065c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.up) this.f43064b, tLObject, (org.telegram.ui.ActionBar.g6) this.f43065c, 3));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yt(11, (org.telegram.ui.Components.k10) this.f43064b, (Pair) this.f43065c));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.k10) this.f43064b, tL_error, tLObject, (Utilities.Callback) this.f43065c, 26));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.a40) this.f43064b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f43065c, 28));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((org.telegram.ui.Components.q90) this.f43064b, (TLRPC.TL_chatInviteExported) this.f43065c, tL_error, tLObject, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.kh0) this.f43064b, (org.telegram.ui.Components.jh0) this.f43065c, tLObject, 17));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.go0((org.telegram.ui.Components.dr0) this.f43064b, tLObject, (Context) this.f43065c, 5));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((org.telegram.ui.Components.oy0) this.f43064b), tL_error, tLObject, (Object) ((MediaDataController) this.f43065c), 6));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((zr0) this.f43064b), tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) this.f43065c), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((KeyEvent.Callback) ((org.telegram.ui.Components.c11) this.f43064b), (Object) ((org.telegram.ui.ActionBar.b2) this.f43065c), tLObject, tL_error, 8));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((org.telegram.ui.Components.r41) this.f43064b), tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) this.f43065c), 10));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new lq((qy) this.f43064b, tLObject, (MessageObject) this.f43065c, 4));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new nt(12, (lz) this.f43064b, (org.telegram.ui.ActionBar.b2) this.f43065c));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new nt(16, (p00) this.f43064b, (org.telegram.ui.ActionBar.b2) this.f43065c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new lq((i00) this.f43064b, tL_error, (h00) this.f43065c, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nt(18, (FiltersSetupActivity) this.f43064b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f43065c));
                return;
        }
    }
}
