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
public final class ro implements RequestDelegate {
    public final int f40210a;
    public final Object f40211b;
    public final Object f40212c;

    public ro(int i10, Object obj, Object obj2) {
        this.f40210a = i10;
        this.f40211b = obj;
        this.f40212c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40210a;
        Object obj = this.f40212c;
        Object obj2 = this.f40211b;
        switch (i10) {
            case 0:
                xo xoVar = (xo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = xoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    xoVar.getMessagesStorage().updateUserInfo(xoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new po(xoVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fh(17, (xp) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((qq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) obj2;
                NotificationCenter.getInstance(m5Var.f28384e).doOnIdle(new org.telegram.ui.Components.l5(m5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.k8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, 7));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uc(8, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uc(9, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.jp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zu(10, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((org.telegram.ui.Components.c10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((org.telegram.ui.Components.r30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.w80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.pg0) obj2, (org.telegram.ui.Components.og0) obj, tLObject, 26));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.hq0) obj2, tLObject, (Context) obj, 5));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((org.telegram.ui.Components.ux0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((qs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((org.telegram.ui.Components.e01) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((org.telegram.ui.Components.u31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new yq((gz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new yt(13, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new yt(17, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new yq((y00) obj2, tL_error, (x00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new yt(19, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((q50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                q70 q70Var = (q70) obj2;
                if (Objects.equals(q70Var.f39748a.f40087e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new yt(27, q70Var, tLObject));
                    return;
                }
                return;
            case 25:
                d80 d80Var = (d80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new yq(d80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new yq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
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
