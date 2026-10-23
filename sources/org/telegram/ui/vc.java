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
    public final int f42724a;
    public final Object f42725b;
    public final Object f42726c;

    public vc(int i10, Object obj, Object obj2) {
        this.f42724a = i10;
        this.f42725b = obj;
        this.f42726c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f42724a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1((zc) this.f42725b, tLObject, (org.telegram.ui.ActionBar.j6) this.f42726c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new s1((ie) this.f42725b, tLObject, (Context) this.f42726c, 12));
                return;
            case 2:
                sn snVar = (sn) this.f42725b;
                TLObject tLObject2 = (TLObject) this.f42726c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    if (!messages_messages.messages.isEmpty()) {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset;
                    } else {
                        i10 = ((TLRPC.messages_Messages) tLObject2).offset_id_offset;
                    }
                    AndroidUtilities.runOnUIThread(new bf(snVar, i10, 5));
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new s1((sn) this.f42725b, tLObject, (TLRPC.User) this.f42726c, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((sn) this.f42725b, tLObject, tL_error, (MessagesStorage) this.f42726c, 13));
                return;
            case 5:
                sn snVar2 = (sn) this.f42725b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f42726c;
                if (tL_error == null) {
                    snVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new eh(1, snVar2, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new eh(2, snVar2, tL_error));
                    return;
                } else {
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new s1((ul) this.f42725b, tLObject, (MessageObject) this.f42726c, 23));
                return;
            case 7:
                ko koVar = (ko) this.f42725b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f42726c;
                TLRPC.UserFull userFull = koVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    koVar.getMessagesStorage().updateUserInfo(koVar.D0, false);
                }
                AndroidUtilities.runOnUIThread(new eo(koVar, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new eh(14, (kp) this.f42725b, (org.telegram.ui.ActionBar.c2[]) this.f42726c));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((dq) this.f42725b, tL_error, tLObject, (TwoStepVerificationActivity) this.f42726c, 16));
                return;
            case 10:
                org.telegram.ui.Components.n5 n5Var = (org.telegram.ui.Components.n5) this.f42725b;
                NotificationCenter.getInstance(n5Var.e).doOnIdle(new org.telegram.ui.Components.m5(n5Var, (ArrayList) this.f42726c, tLObject, 0));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ig.d2((org.telegram.ui.Components.k8) this.f42725b, (org.telegram.ui.ActionBar.c2) this.f42726c, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(6, (org.telegram.ui.Components.ti) this.f42725b, (org.telegram.ui.Components.mi) this.f42726c));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(7, (org.telegram.ui.Components.ti) this.f42725b, (TLRPC.TL_attachMenuBot) this.f42726c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.up) this.f42725b, tLObject, (org.telegram.ui.ActionBar.j6) this.f42726c, 3));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yt(11, (org.telegram.ui.Components.k10) this.f42725b, (Pair) this.f42726c));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.k10) this.f42725b, tL_error, tLObject, (Utilities.Callback) this.f42726c, 26));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.a40) this.f42725b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f42726c, 28));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((org.telegram.ui.Components.r90) this.f42725b, (TLRPC.TL_chatInviteExported) this.f42726c, tL_error, tLObject, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.oh0) this.f42725b, (org.telegram.ui.Components.nh0) this.f42726c, tLObject, 17));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ko0((org.telegram.ui.Components.ir0) this.f42725b, tLObject, (Context) this.f42726c, 5));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((org.telegram.ui.Components.ty0) this.f42725b), tL_error, tLObject, (Object) ((MediaDataController) this.f42726c), 6));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((as0) this.f42725b), tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) this.f42726c), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((KeyEvent.Callback) ((org.telegram.ui.Components.h11) this.f42725b), (Object) ((org.telegram.ui.ActionBar.c2) this.f42726c), tLObject, tL_error, 8));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90((Object) ((org.telegram.ui.Components.y41) this.f42725b), tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) this.f42726c), 10));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new lq((qy) this.f42725b, tLObject, (MessageObject) this.f42726c, 4));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new ot(12, (mz) this.f42725b, (org.telegram.ui.ActionBar.c2) this.f42726c));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ot(16, (q00) this.f42725b, (org.telegram.ui.ActionBar.c2) this.f42726c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new lq((j00) this.f42725b, tL_error, (i00) this.f42726c, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ot(18, (FiltersSetupActivity) this.f42725b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f42726c));
                return;
        }
    }
}
