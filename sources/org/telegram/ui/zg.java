package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
public final class zg implements RequestDelegate {
    public final int f45210a;
    public final Object f45211b;
    public final Object f45212c;

    public zg(int i10, Object obj, Object obj2) {
        this.f45210a = i10;
        this.f45211b = obj;
        this.f45212c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f45210a;
        Object obj = this.f45212c;
        Object obj2 = this.f45211b;
        switch (i10) {
            case 0:
                tn tnVar = (tn) obj2;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) obj;
                if (tL_error == null) {
                    tnVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new vf(7, tnVar, tL_messages_sendScheduledMessages));
                    return;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new vf(8, tnVar, tL_error));
                    return;
                } else {
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new gg((tn) obj2, tLObject, tL_error, (MessagesStorage) obj, 2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new u1((ul) obj2, tLObject, (MessageObject) obj, 23));
                return;
            case 3:
                ko koVar = (ko) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = koVar.A0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    koVar.getMessagesStorage().updateUserInfo(koVar.A0, false);
                }
                AndroidUtilities.runOnUIThread(new fo(koVar, 2));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new vf(20, (kp) obj2, (org.telegram.ui.ActionBar.c2[]) obj));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gg((dq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 5));
                return;
            case 6:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) obj2;
                NotificationCenter.getInstance(l5Var.f30232e).doOnIdle(new org.telegram.ui.Components.k5(l5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g((org.telegram.ui.Components.g8) obj2, (org.telegram.ui.ActionBar.c2) obj, tLObject, 1));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.z2(11, (org.telegram.ui.Components.ni) obj2, (org.telegram.ui.Components.gi) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.z2(12, (org.telegram.ui.Components.ni) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g((org.telegram.ui.Components.ep) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 7));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gt(13, (org.telegram.ui.Components.y00) obj2, (Pair) obj));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new gg((org.telegram.ui.Components.y00) obj2, tL_error, tLObject, (Utilities.Callback) obj, 15));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gg((org.telegram.ui.Components.p30) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 17));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg((org.telegram.ui.Components.r80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 19));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g((org.telegram.ui.Components.lg0) obj2, (org.telegram.ui.Components.kg0) obj, tLObject, 20));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ii0((org.telegram.ui.Components.dq0) obj2, tLObject, (Context) obj, 8));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new gg((org.telegram.ui.Components.nx0) obj2, tL_error, tLObject, (MediaDataController) obj, 25));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new gg((nr0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 26));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new gg((org.telegram.ui.Components.yz0) obj2, (org.telegram.ui.ActionBar.c2) obj, tLObject, tL_error, 27));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new gg((org.telegram.ui.Components.k31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 29));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new lq((ry) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(16, (lz) obj2, (org.telegram.ui.ActionBar.c2) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(20, (p00) obj2, (org.telegram.ui.ActionBar.c2) obj));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new lq((i00) obj2, tL_error, (h00) obj, 8));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(22, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new n20((y40) obj2, tL_error, tLObject, (String) obj, 3));
                return;
            case 27:
                y60 y60Var = (y60) obj2;
                if (Objects.equals(y60Var.f44755a.f45091e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new x60(0, y60Var, tLObject));
                    return;
                }
                return;
            case 28:
                k70 k70Var = (k70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new lq(k70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new lq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 17));
                return;
        }
    }
}
