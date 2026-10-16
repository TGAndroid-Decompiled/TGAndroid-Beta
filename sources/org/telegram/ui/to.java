package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
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
    public final int f40156a;
    public final Object f40157b;
    public final Object f40158c;

    public to(int i10, Object obj, Object obj2) {
        this.f40156a = i10;
        this.f40157b = obj;
        this.f40158c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40156a;
        Object obj = this.f40158c;
        Object obj2 = this.f40157b;
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
                AndroidUtilities.runOnUIThread(new jd(25, (aq) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new p6((tq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 10));
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj2;
                NotificationCenter.getInstance(o5Var.e).doOnIdle(new org.telegram.ui.Components.n5(o5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.m8) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, 12));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new vp(17, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new vp(18, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.xp) obj2, tLObject, (org.telegram.ui.ActionBar.f6) obj, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vm(22, (org.telegram.ui.Components.o10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.o10) obj2, tL_error, tLObject, (Utilities.Callback) obj, 20));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.e40) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 22));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new p6((org.telegram.ui.Components.w90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 24));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ze0((org.telegram.ui.Components.qh0) obj2, (org.telegram.ui.Components.ph0) obj, tLObject, 2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g90((org.telegram.ui.Components.ir0) obj2, tLObject, (Context) obj, 17));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((org.telegram.ui.Components.uy0) obj2, tL_error, tLObject, (MediaDataController) obj, 0));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((Object) ((xs0) obj2), (Object) tL_error, (Object) tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) obj), 1));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((KeyEvent.Callback) ((org.telegram.ui.Components.h11) obj2), (Object) ((org.telegram.ui.ActionBar.a2) obj), tLObject, tL_error, 2));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((Object) ((org.telegram.ui.Components.x41) obj2), (Object) tL_error, (Object) tLObject, (Object) ((TLRPC.TL_textWithEntities) obj), 4));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new br((kz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(24, (f00) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(28, (k10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new br((d10) obj2, tL_error, (c10) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new d20(0, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((u50) obj2, tL_error, tLObject, (String) obj, 8));
                return;
            case 24:
                u70 u70Var = (u70) obj2;
                if (Objects.equals(u70Var.f40282a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new d20(8, u70Var, tLObject));
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((Object) ((org.telegram.ui.ActionBar.a2) obj2), tLObject, (Object) ((h) obj), tL_error, 12));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new br((ic0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new br((fc0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
