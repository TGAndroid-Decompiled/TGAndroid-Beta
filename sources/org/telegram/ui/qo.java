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
public final class qo implements RequestDelegate {
    public final int f36920a;
    public final Object f36921b;
    public final Object f36922c;

    public qo(int i10, Object obj, Object obj2) {
        this.f36920a = i10;
        this.f36921b = obj;
        this.f36922c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36920a;
        Object obj = this.f36922c;
        Object obj2 = this.f36921b;
        switch (i10) {
            case 0:
                wo woVar = (wo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = woVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    woVar.getMessagesStorage().updateUserInfo(woVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new oo(woVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new uh(11, (wp) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((pq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj2;
                NotificationCenter.getInstance(k5Var.e).doOnIdle(new org.telegram.ui.Components.j5(k5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.h8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, 7));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(2, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(3, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny(4, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((org.telegram.ui.Components.c10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((org.telegram.ui.Components.r30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.v80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.pg0) obj2, (org.telegram.ui.Components.og0) obj, tLObject, 26));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny((org.telegram.ui.Components.hq0) obj2, tLObject, (Context) obj));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.vx0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((rs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.f01) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.v31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new xq((gz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new kw(7, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new kw(11, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new xq((y00) obj2, tL_error, (x00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new kw(13, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((p50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                p70 p70Var = (p70) obj2;
                if (Objects.equals(p70Var.f36455a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new kw(21, p70Var, tLObject));
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
                            AndroidUtilities.runOnUIThread(new xq(d80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new xq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new xq((fc0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xq((cc0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
