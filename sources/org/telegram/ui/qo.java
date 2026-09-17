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
    public final int f37002a;
    public final Object f37003b;
    public final Object f37004c;

    public qo(int i10, Object obj, Object obj2) {
        this.f37002a = i10;
        this.f37003b = obj;
        this.f37004c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f37002a;
        Object obj = this.f37004c;
        Object obj2 = this.f37003b;
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
                AndroidUtilities.runOnUIThread(new wh(11, (wp) obj2, (org.telegram.ui.ActionBar.c2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((Object) ((pq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj2;
                NotificationCenter.getInstance(k5Var.e).doOnIdle(new org.telegram.ui.Components.j5(k5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((org.telegram.ui.Components.h8) obj2, (org.telegram.ui.ActionBar.c2) obj, tLObject, 7));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(2, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oh(3, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny(4, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((Object) ((org.telegram.ui.Components.c10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((Object) ((org.telegram.ui.Components.r30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5((org.telegram.ui.Components.v80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((org.telegram.ui.Components.qg0) obj2, (org.telegram.ui.Components.pg0) obj, tLObject, 26));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ny((org.telegram.ui.Components.iq0) obj2, tLObject, (Context) obj));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.wx0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((ts0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.g01) obj2, (org.telegram.ui.ActionBar.c2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.Components.w31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new xq((iz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new mw(7, (c00) obj2, (org.telegram.ui.ActionBar.c2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new mw(11, (h10) obj2, (org.telegram.ui.ActionBar.c2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new xq((a10) obj2, tL_error, (z00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new mw(13, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((r50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                r70 r70Var = (r70) obj2;
                if (Objects.equals(r70Var.f37104a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new mw(21, r70Var, tLObject));
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
                            AndroidUtilities.runOnUIThread(new xq(f80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new xq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0((org.telegram.ui.ActionBar.c2) obj2, tLObject, (h) obj, tL_error, 14));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new xq((hc0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xq((ec0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
