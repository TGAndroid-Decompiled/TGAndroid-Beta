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
    public final int f43079a;
    public final Object f43080b;
    public final Object f43081c;

    public xc(int i10, Object obj, Object obj2) {
        this.f43079a = i10;
        this.f43080b = obj;
        this.f43081c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f43079a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((bd) this.f43080b, tLObject, (org.telegram.ui.ActionBar.g6) this.f43081c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((ke) this.f43080b, tLObject, (Context) this.f43081c, 12));
                return;
            case 2:
                sn snVar = (sn) this.f43080b;
                TLObject tLObject2 = (TLObject) this.f43081c;
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
                AndroidUtilities.runOnUIThread(new t1((sn) this.f43080b, tLObject, (TLRPC.User) this.f43081c, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((sn) this.f43080b, tLObject, tL_error, (MessagesStorage) this.f43081c, 13));
                return;
            case 5:
                sn snVar2 = (sn) this.f43080b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f43081c;
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
                AndroidUtilities.runOnUIThread(new t1((vl) this.f43080b, tLObject, (MessageObject) this.f43081c, 23));
                return;
            case 7:
                ko koVar = (ko) this.f43080b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f43081c;
                TLRPC.UserFull userFull = koVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    koVar.getMessagesStorage().updateUserInfo(koVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new eo(koVar, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gh(14, (kp) this.f43080b, (org.telegram.ui.ActionBar.b2[]) this.f43081c));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((dq) this.f43080b, tL_error, tLObject, (TwoStepVerificationActivity) this.f43081c, 16));
                return;
            case 10:
                org.telegram.ui.Components.n5 n5Var = (org.telegram.ui.Components.n5) this.f43080b;
                NotificationCenter.getInstance(n5Var.e).doOnIdle(new org.telegram.ui.Components.m5(n5Var, (ArrayList) this.f43081c, tLObject, 0));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ig.c2((org.telegram.ui.Components.k8) this.f43080b, (org.telegram.ui.ActionBar.b2) this.f43081c, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(6, (org.telegram.ui.Components.ti) this.f43080b, (org.telegram.ui.Components.mi) this.f43081c));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(7, (org.telegram.ui.Components.ti) this.f43080b, (TLRPC.TL_attachMenuBot) this.f43081c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.up) this.f43080b, tLObject, (org.telegram.ui.ActionBar.g6) this.f43081c, 3));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yt(11, (org.telegram.ui.Components.k10) this.f43080b, (Pair) this.f43081c));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.k10) this.f43080b, tL_error, tLObject, (Utilities.Callback) this.f43081c, 26));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.a40) this.f43080b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f43081c, 28));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((org.telegram.ui.Components.q90) this.f43080b, (TLRPC.TL_chatInviteExported) this.f43081c, tL_error, tLObject, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.kh0) this.f43080b, (org.telegram.ui.Components.jh0) this.f43081c, tLObject, 17));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.go0((org.telegram.ui.Components.dr0) this.f43080b, tLObject, (Context) this.f43081c, 5));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((org.telegram.ui.Components.oy0) this.f43080b), tL_error, tLObject, (Object) ((MediaDataController) this.f43081c), 6));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((zr0) this.f43080b), tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) this.f43081c), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((KeyEvent.Callback) ((org.telegram.ui.Components.c11) this.f43080b), (Object) ((org.telegram.ui.ActionBar.b2) this.f43081c), tLObject, tL_error, 8));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((org.telegram.ui.Components.r41) this.f43080b), tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) this.f43081c), 10));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new lq((qy) this.f43080b, tLObject, (MessageObject) this.f43081c, 4));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new nt(12, (lz) this.f43080b, (org.telegram.ui.ActionBar.b2) this.f43081c));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new nt(16, (p00) this.f43080b, (org.telegram.ui.ActionBar.b2) this.f43081c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new lq((i00) this.f43080b, tL_error, (h00) this.f43081c, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nt(18, (FiltersSetupActivity) this.f43080b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f43081c));
                return;
        }
    }
}
