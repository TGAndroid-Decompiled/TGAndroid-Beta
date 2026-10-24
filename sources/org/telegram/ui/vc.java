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
    public final int f42692a;
    public final Object f42693b;
    public final Object f42694c;

    public vc(int i10, Object obj, Object obj2) {
        this.f42692a = i10;
        this.f42693b = obj;
        this.f42694c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f42692a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1((zc) this.f42693b, tLObject, (org.telegram.ui.ActionBar.j6) this.f42694c, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new s1((ie) this.f42693b, tLObject, (Context) this.f42694c, 12));
                return;
            case 2:
                sn snVar = (sn) this.f42693b;
                TLObject tLObject2 = (TLObject) this.f42694c;
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
                AndroidUtilities.runOnUIThread(new s1((sn) this.f42693b, tLObject, (TLRPC.User) this.f42694c, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((sn) this.f42693b, tLObject, tL_error, (MessagesStorage) this.f42694c, 13));
                return;
            case 5:
                sn snVar2 = (sn) this.f42693b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f42694c;
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
                AndroidUtilities.runOnUIThread(new s1((ul) this.f42693b, tLObject, (MessageObject) this.f42694c, 23));
                return;
            case 7:
                ko koVar = (ko) this.f42693b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f42694c;
                TLRPC.UserFull userFull = koVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    koVar.getMessagesStorage().updateUserInfo(koVar.D0, false);
                }
                AndroidUtilities.runOnUIThread(new eo(koVar, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new eh(14, (kp) this.f42693b, (org.telegram.ui.ActionBar.c2[]) this.f42694c));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((dq) this.f42693b, tL_error, tLObject, (TwoStepVerificationActivity) this.f42694c, 16));
                return;
            case 10:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) this.f42693b;
                NotificationCenter.getInstance(l5Var.e).doOnIdle(new org.telegram.ui.Components.k5(l5Var, (ArrayList) this.f42694c, tLObject, 0));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ig.d2((org.telegram.ui.Components.i8) this.f42693b, (org.telegram.ui.ActionBar.c2) this.f42694c, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ce(6, (org.telegram.ui.Components.ri) this.f42693b, (org.telegram.ui.Components.ki) this.f42694c));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ce(7, (org.telegram.ui.Components.ri) this.f42693b, (TLRPC.TL_attachMenuBot) this.f42694c));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jg((org.telegram.ui.Components.sp) this.f42693b, tLObject, (org.telegram.ui.ActionBar.j6) this.f42694c, 3));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wt(11, (org.telegram.ui.Components.i10) this.f42693b, (Pair) this.f42694c));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.i10) this.f42693b, tL_error, tLObject, (Utilities.Callback) this.f42694c, 26));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.y30) this.f42693b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f42694c, 28));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h90((org.telegram.ui.Components.p90) this.f42693b, (TLRPC.TL_chatInviteExported) this.f42694c, tL_error, tLObject, 0));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jg((org.telegram.ui.Components.nh0) this.f42693b, (org.telegram.ui.Components.mh0) this.f42694c, tLObject, 17));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jo0((org.telegram.ui.Components.hr0) this.f42693b, tLObject, (Context) this.f42694c, 5));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h90((Object) ((org.telegram.ui.Components.sy0) this.f42693b), tL_error, tLObject, (Object) ((MediaDataController) this.f42694c), 6));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h90((Object) ((zr0) this.f42693b), tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) this.f42694c), 7));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h90((KeyEvent.Callback) ((org.telegram.ui.Components.g11) this.f42693b), (Object) ((org.telegram.ui.ActionBar.c2) this.f42694c), tLObject, tL_error, 8));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h90((Object) ((org.telegram.ui.Components.x41) this.f42693b), tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) this.f42694c), 10));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new lq((qy) this.f42693b, tLObject, (MessageObject) this.f42694c, 4));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new ot(12, (mz) this.f42693b, (org.telegram.ui.ActionBar.c2) this.f42694c));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ot(16, (q00) this.f42693b, (org.telegram.ui.ActionBar.c2) this.f42694c));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new lq((j00) this.f42693b, tL_error, (i00) this.f42694c, 8));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ot(18, (FiltersSetupActivity) this.f42693b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f42694c));
                return;
        }
    }
}
