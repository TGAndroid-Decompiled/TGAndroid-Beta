package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
public final class to implements RequestDelegate {
    public final int f40423a;
    public final Object f40424b;
    public final Object f40425c;

    public to(int i10, Object obj, Object obj2) {
        this.f40423a = i10;
        this.f40424b = obj;
        this.f40425c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40423a;
        Object obj = this.f40425c;
        Object obj2 = this.f40424b;
        switch (i10) {
            case 0:
                zo zoVar = (zo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = zoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    zoVar.getMessagesStorage().updateUserInfo(zoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new ro(zoVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rp(0, (aq) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new p6((tq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 11));
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj2;
                NotificationCenter.getInstance(o5Var.e).doOnIdle(new org.telegram.ui.Components.n5(o5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new n2.h((org.telegram.ui.Components.m8) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new rp(22, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new rp(23, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new n2.h((org.telegram.ui.Components.xp) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 21));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sk(27, (org.telegram.ui.Components.o10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.o10) obj2, tL_error, tLObject, (Utilities.Callback) obj, 21));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.e40) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 23));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.w90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 25));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v70((org.telegram.ui.Components.qh0) obj2, (org.telegram.ui.Components.ph0) obj, tLObject, 5));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.f60((org.telegram.ui.Components.jr0) obj2, tLObject, (Context) obj));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.Components.ty0) obj2, tL_error, tLObject, (MediaDataController) obj, 1));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((ys0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 2));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.Components.g11) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, tL_error, 3));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.Components.x41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 5));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new br((kz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k31(29, (f00) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new o00(3, (l10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new br((e10) obj2, tL_error, (d10) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new o00(5, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((u50) obj2, tL_error, tLObject, (String) obj, 9));
                return;
            case 24:
                u70 u70Var = (u70) obj2;
                if (Objects.equals(u70Var.f40556a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new o00(13, u70Var, tLObject));
                    return;
                }
                return;
            case 25:
                h80 h80Var = (h80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new br(h80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new br((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gq0((org.telegram.ui.ActionBar.a2) obj2, tLObject, (h) obj, tL_error, 13));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new br((jc0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new br((gc0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
