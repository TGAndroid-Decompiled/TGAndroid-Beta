package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class w81 implements Runnable {
    public final int f38726a;
    public final Object f38727b;
    public final Object f38728c;

    public w81(int i10, Object obj, Object obj2) {
        this.f38726a = i10;
        this.f38727b = obj;
        this.f38728c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        org.telegram.ui.Components.fl0 fl0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.f38726a;
        int i13 = 0;
        Object obj = this.f38728c;
        Object obj2 = this.f38727b;
        switch (i12) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((i91) obj2).k(false).j();
                return;
            case 1:
                i91.X((i91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                b91 b91Var = (b91) obj2;
                a0.i iVar = (a0.i) obj;
                i91 i91Var = b91Var.f32295b1;
                Activity parentActivity = i91Var.getParentActivity();
                x8 x8Var = i91Var.f34504b;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18332id;
                } else {
                    j3 = 0;
                }
                org.telegram.ui.Components.xc.x(parentActivity, x8Var, m10, j3, b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new t91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (of) obj).show();
                return;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.n8) obj);
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.f19436w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.f19436w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.f19453x), Double.valueOf(org.telegram.ui.ActionBar.j6.f19471y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.vl0 vl0Var = themeActivity2.f31835b;
                if (vl0Var != null && (fl0Var = (org.telegram.ui.Components.fl0) vl0Var.L(themeActivity2.Y)) != null) {
                    View view2 = fl0Var.f42974a;
                    if (view2 instanceof org.telegram.ui.Cells.fa) {
                        ((org.telegram.ui.Cells.fa) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f19436w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                xd1 xd1Var = (xd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (xd1Var.f39507n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    xd1Var.A0.f(xd1Var.K0[0], true);
                    return;
                }
                return;
            case 8:
                ce1.X((ce1) obj2, (String) obj);
                return;
            case 9:
                ce1.V((ce1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                me1 me1Var = (me1) obj2;
                me1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                me1Var.c(true);
                return;
            case 11:
                me1 me1Var2 = (me1) obj2;
                me1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                me1Var2.c(true);
                return;
            case 12:
                lf1 lf1Var = (lf1) obj2;
                lf1Var.getClass();
                Bundle bundle = new Bundle();
                fg1 fg1Var = lf1Var.f35436b;
                bundle.putLong("dialog_id", -fg1Var.f33596a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18380id);
                fg1Var.presentFragment(new w11(bundle, null));
                return;
            case 13:
                bg1 bg1Var = (bg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = bg1Var.f32443d0;
                fg1 fg1Var2 = bg1Var.f32459u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = fg1Var2.f33599b;
                    if (i14 < arrayList3.size()) {
                        if (((wf1) arrayList3.get(i14)).f39142c != null && ((wf1) arrayList3.get(i14)).f39142c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((wf1) arrayList3.get(i14)).f39142c);
                            ((wf1) arrayList3.get(i14)).f39142c.searchQuery = lowerCase;
                        }
                        i14++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        bg1Var.M();
                        if (!arrayList.isEmpty()) {
                            bg1Var.m0 = false;
                            bg1Var.f32454p0.b(0);
                        }
                        bg1Var.K(str2);
                        return;
                    }
                }
                break;
            case 14:
                ig1 ig1Var = ((hg1) obj2).f34203b;
                ig1Var.f34562a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18380id));
                ig1Var.f34562a.V();
                return;
            case 15:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 17:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 18:
                ih1.g0((ih1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable = (Runnable) obj;
                gs[] gsVarArr = ((ih1) obj2).f34587w.f33125f;
                int length = gsVarArr.length;
                while (i13 < length) {
                    gsVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                return;
            case 20:
                ph1 ph1Var = (ph1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ph1Var.f36573f;
                ArrayList<TLRPC.Chat> arrayList5 = ph1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ph1Var.f36570a).putChats(arrayList5, false);
                ph1Var.d = false;
                ph1Var.f36572c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                ti1 ti1Var = (ti1) obj2;
                ti1Var.U.a(new ci1(ti1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                ti1 ti1Var2 = (ti1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ti1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27642f;
                duration.setInterpolator(qrVar).start();
                ti1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.f37791j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.f37787h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.f37789i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new hi1(ti1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                return;
            case 23:
                cj1 cj1Var = (cj1) obj2;
                int[] iArr = (int[]) obj;
                cj1Var.getClass();
                int i15 = iArr[0] - 1;
                iArr[0] = i15;
                if (i15 == 0) {
                    WallpapersListActivity wallpapersListActivity = cj1Var.f32777a;
                    int[][] iArr2 = WallpapersListActivity.f31902i0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 24:
                ij1 ij1Var = (ij1) obj2;
                String str3 = (String) obj;
                ij1Var.d.clear();
                ij1Var.e.clear();
                ij1Var.f34597f = true;
                ij1Var.F(str3, "", true);
                ij1Var.h = str3;
                ij1Var.l();
                ij1Var.f34603y = null;
                return;
            case 25:
                ij1 ij1Var2 = (ij1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ij1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = ij1Var2.f34602x;
                ij1Var2.f34602x = null;
                ij1Var2.F(str4, "", false);
                return;
            case 26:
                String str5 = (String) obj;
                oj1 oj1Var = ((nj1) obj2).f36046a;
                Activity parentActivity2 = oj1Var.getParentActivity();
                MessageObject messageObject = oj1Var.f36329n;
                if (parentActivity2 != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str5);
                    }
                    str5.getClass();
                    if (!str5.equals("share_game")) {
                        if (str5.equals("share_score")) {
                            messageObject.messageOwner.with_my_score = true;
                        }
                    } else {
                        messageObject.messageOwner.with_my_score = false;
                    }
                    oj1Var.showDialog(org.telegram.ui.Components.uq0.N0(oj1Var.getParentActivity(), messageObject, null, false, oj1Var.h));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.f38864j0;
                rVar.f8581f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                return;
            case 28:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.f38810a) != null && (h0Var = d1Var.f38855c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            default:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.f38902c.addAll(0, arrayList7);
                for (int i16 = 0; i16 < longSparseArray.size(); i16++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i16), (org.telegram.ui.web.e1) longSparseArray.valueAt(i16));
                }
                org.telegram.ui.web.f1.f38901b = true;
                org.telegram.ui.web.f1.f38900a = false;
                ArrayList arrayList8 = org.telegram.ui.web.f1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList8.get(i13);
                        i13++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.f1.e = null;
                    return;
                }
                return;
        }
    }

    public w81(b91 b91Var, a0.i iVar, int i10) {
        this.f38726a = 2;
        this.f38727b = b91Var;
        this.f38728c = iVar;
    }
}
