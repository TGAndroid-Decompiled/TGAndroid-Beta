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
    public final int f41854a;
    public final Object f41855b;
    public final Object f41856c;

    public w81(int i10, Object obj, Object obj2) {
        this.f41854a = i10;
        this.f41855b = obj;
        this.f41856c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        org.telegram.ui.Components.vk0 vk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.i0 i0Var;
        int i12 = this.f41854a;
        int i13 = 0;
        Object obj = this.f41856c;
        Object obj2 = this.f41855b;
        switch (i12) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.yc.a0((i91) obj2).k(false).j();
                return;
            case 1:
                i91.X((i91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                b91 b91Var = (b91) obj2;
                a0.i iVar = (a0.i) obj;
                i91 i91Var = b91Var.f34696b1;
                Activity parentActivity = i91Var.getParentActivity();
                w8 w8Var = i91Var.f37294b;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f19900id;
                } else {
                    j3 = 0;
                }
                org.telegram.ui.Components.yc.x(parentActivity, w8Var, m10, j3, b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new t91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (nf) obj).show();
                return;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.f21029w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.f21029w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.f21046x), Double.valueOf(org.telegram.ui.ActionBar.j6.f21064y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.ll0 ll0Var = themeActivity2.f34204b;
                if (ll0Var != null && (vk0Var = (org.telegram.ui.Components.vk0) ll0Var.K(themeActivity2.Y)) != null) {
                    View view2 = vk0Var.f45767a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f21029w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                wd1 wd1Var = (wd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (wd1Var.f41980n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    wd1Var.A0.f(wd1Var.K0[0], true);
                    return;
                }
                return;
            case 8:
                be1.X((be1) obj2, (String) obj);
                return;
            case 9:
                be1.V((be1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                le1 le1Var = (le1) obj2;
                le1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                le1Var.c(true);
                return;
            case 11:
                le1 le1Var2 = (le1) obj2;
                le1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                le1Var2.c(true);
                return;
            case 12:
                kf1 kf1Var = (kf1) obj2;
                kf1Var.getClass();
                Bundle bundle = new Bundle();
                eg1 eg1Var = kf1Var.f38076b;
                bundle.putLong("dialog_id", -eg1Var.f36053a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f19948id);
                eg1Var.presentFragment(new y11(bundle, null));
                return;
            case 13:
                ag1 ag1Var = (ag1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ag1Var.f34457c0;
                eg1 eg1Var2 = ag1Var.f34473t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = eg1Var2.f36056b;
                    if (i14 < arrayList3.size()) {
                        if (((vf1) arrayList3.get(i14)).f41561c != null && ((vf1) arrayList3.get(i14)).f41561c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((vf1) arrayList3.get(i14)).f41561c);
                            ((vf1) arrayList3.get(i14)).f41561c.searchQuery = lowerCase;
                        }
                        i14++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ag1Var.L();
                        if (!arrayList.isEmpty()) {
                            ag1Var.f34466l0 = false;
                            ag1Var.f34468o0.b(0);
                        }
                        ag1Var.J(str2);
                        return;
                    }
                }
                break;
            case 14:
                hg1 hg1Var = ((gg1) obj2).f36698b;
                hg1Var.f37025a.f38094e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f19948id));
                hg1Var.f37025a.V();
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
                hh1.g0((hh1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable = (Runnable) obj;
                gs[] gsVarArr = ((hh1) obj2).f37048w.f36191f;
                int length = gsVarArr.length;
                while (i13 < length) {
                    gsVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                return;
            case 20:
                oh1 oh1Var = (oh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = oh1Var.f39283f;
                ArrayList<TLRPC.Chat> arrayList5 = oh1Var.f39282e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(oh1Var.f39279a).putChats(arrayList5, false);
                oh1Var.d = false;
                oh1Var.f39281c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                ui1 ui1Var = (ui1) obj2;
                ui1Var.U.a(new di1(ui1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                ui1 ui1Var2 = (ui1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.T = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = ui1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29494f;
                duration.setInterpolator(prVar).start();
                ui1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.f41158j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.f41154h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ui1Var2.f41156i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ui1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                valueAnimator.addListener(new ii1(ui1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(prVar);
                valueAnimator.start();
                return;
            case 23:
                dj1 dj1Var = (dj1) obj2;
                int[] iArr = (int[]) obj;
                dj1Var.getClass();
                int i15 = iArr[0] - 1;
                iArr[0] = i15;
                if (i15 == 0) {
                    WallpapersListActivity wallpapersListActivity = dj1Var.f35837a;
                    int[][] iArr2 = WallpapersListActivity.f34276k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 24:
                jj1 jj1Var = (jj1) obj2;
                String str3 = (String) obj;
                jj1Var.d.clear();
                jj1Var.f37815e.clear();
                jj1Var.f37816f = true;
                jj1Var.F(str3, "", true);
                jj1Var.h = str3;
                jj1Var.l();
                jj1Var.f37822y = null;
                return;
            case 25:
                jj1 jj1Var2 = (jj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = jj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = jj1Var2.f37821x;
                jj1Var2.f37821x = null;
                jj1Var2.F(str4, "", false);
                return;
            case 26:
                String str5 = (String) obj;
                qj1 qj1Var = ((pj1) obj2).f39561a;
                Activity parentActivity2 = qj1Var.getParentActivity();
                MessageObject messageObject = qj1Var.f39920n;
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
                    qj1Var.showDialog(org.telegram.ui.Components.hq0.N0(qj1Var.getParentActivity(), messageObject, null, false, qj1Var.h));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                fi.s sVar = d1Var2.f42077j0;
                sVar.f9970f = true;
                sVar.k();
                d1Var2.w((bi.k9) obj);
                return;
            case 28:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.f42016a) != null && (i0Var = d1Var.f42067c) != null) {
                    i0Var.f(arrayList6);
                    return;
                }
                return;
            default:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.f42118c.addAll(0, arrayList7);
                for (int i16 = 0; i16 < longSparseArray.size(); i16++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i16), (org.telegram.ui.web.e1) longSparseArray.valueAt(i16));
                }
                org.telegram.ui.web.f1.f42117b = true;
                org.telegram.ui.web.f1.f42116a = false;
                ArrayList arrayList8 = org.telegram.ui.web.f1.f42119e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList8.get(i13);
                        i13++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.f1.f42119e = null;
                    return;
                }
                return;
        }
    }

    public w81(b91 b91Var, a0.i iVar, int i10) {
        this.f41854a = 2;
        this.f41855b = b91Var;
        this.f41856c = iVar;
    }
}
