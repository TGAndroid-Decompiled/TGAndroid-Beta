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
public final class so implements RequestDelegate {
    public final int f41964a;
    public final Object f41965b;
    public final Object f41966c;

    public so(int i10, Object obj, Object obj2) {
        this.f41964a = i10;
        this.f41965b = obj;
        this.f41966c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41964a;
        Object obj = this.f41966c;
        Object obj2 = this.f41965b;
        switch (i10) {
            case 0:
                xo xoVar = (xo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = xoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    xoVar.getMessagesStorage().updateUserInfo(xoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new qo(xoVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new nh(16, (xp) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((qq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj2;
                NotificationCenter.getInstance(o5Var.f29074e).doOnIdle(new org.telegram.ui.Components.n5(o5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((Object) ((org.telegram.ui.Components.l8) obj2), (Object) ((org.telegram.ui.ActionBar.a2) obj), tLObject, 10));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.md(8, (org.telegram.ui.Components.aj) obj2, (org.telegram.ui.Components.ti) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.md(9, (org.telegram.ui.Components.aj) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.h((org.telegram.ui.Components.cq) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 16));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hu(13, (org.telegram.ui.Components.v10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((org.telegram.ui.Components.v10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((org.telegram.ui.Components.l40) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.ba0) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mh0((org.telegram.ui.Components.wh0) obj2, (org.telegram.ui.Components.vh0) obj, tLObject, 0));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sj0((org.telegram.ui.Components.sr0) obj2, tLObject, (Context) obj, 8));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0((org.telegram.ui.Components.dz0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0((ts0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0((org.telegram.ui.Components.q11) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0((org.telegram.ui.Components.g51) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new yq((hz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.y(15, (c00) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.y(19, (h10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new yq((a10) obj2, tL_error, (z00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.y(21, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0((p50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                q70 q70Var = (q70) obj2;
                if (Objects.equals(q70Var.f41203a.f41522e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.y(29, q70Var, tLObject));
                    return;
                }
                return;
            case 25:
                f80 f80Var = (f80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new yq(f80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new yq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0((org.telegram.ui.ActionBar.a2) obj2, tLObject, (h) obj, tL_error, 14));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new yq((fc0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yq((cc0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
