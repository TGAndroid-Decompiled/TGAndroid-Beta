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
public final class r91 implements Runnable {
    public final int f36269a;
    public final Object f36270b;
    public final Object f36271c;

    public r91(int i10, Object obj, Object obj2) {
        this.f36269a = i10;
        this.f36270b = obj;
        this.f36271c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.fl0 fl0Var;
        int i10;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.f36269a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f36271c;
        Object obj2 = this.f36270b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                new x91(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider(), (pf) obj).show();
                return;
            case 1:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.n8) obj);
                return;
            case 2:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 3:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.f18264w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.f18264w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.f18282x), Double.valueOf(org.telegram.ui.ActionBar.j6.f18300y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.vl0 vl0Var = themeActivity2.f30663b;
                if (vl0Var != null && (fl0Var = (org.telegram.ui.Components.fl0) vl0Var.K(themeActivity2.Y)) != null) {
                    View view2 = fl0Var.f41610a;
                    if (view2 instanceof org.telegram.ui.Cells.ga) {
                        ((org.telegram.ui.Cells.ga) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f18264w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ae1 ae1Var = (ae1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (ae1Var.f30951n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    ae1Var.A0.f(ae1Var.K0[0], true);
                    return;
                }
                return;
            case 5:
                fe1.X((fe1) obj2, (String) obj);
                return;
            case 6:
                fe1.V((fe1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 7:
                pe1 pe1Var = (pe1) obj2;
                pe1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                pe1Var.c(true);
                return;
            case 8:
                pe1 pe1Var2 = (pe1) obj2;
                pe1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                pe1Var2.c(true);
                return;
            case 9:
                of1 of1Var = (of1) obj2;
                of1Var.getClass();
                Bundle bundle = new Bundle();
                ig1 ig1Var = of1Var.f35486b;
                bundle.putLong("dialog_id", -ig1Var.f33681a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f17247id);
                ig1Var.presentFragment(new c21(bundle, null));
                return;
            case 10:
                eg1 eg1Var = (eg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = eg1Var.f32189c0;
                ig1 ig1Var2 = eg1Var.f32205t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = ig1Var2.f33684b;
                    if (i15 < arrayList3.size()) {
                        if (((zf1) arrayList3.get(i15)).f39309c != null && ((zf1) arrayList3.get(i15)).f39309c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((zf1) arrayList3.get(i15)).f39309c);
                            ((zf1) arrayList3.get(i15)).f39309c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        eg1Var.L();
                        if (!arrayList.isEmpty()) {
                            eg1Var.f32198l0 = false;
                            eg1Var.f32200o0.b(0);
                        }
                        eg1Var.J(str2);
                        return;
                    }
                }
                break;
            case 11:
                lg1 lg1Var = ((kg1) obj2).f34368b;
                lg1Var.f34714a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f17247id));
                lg1Var.f34714a.V();
                return;
            case 12:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 13:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 14:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 15:
                mh1.g0((mh1) obj2, (String) obj);
                return;
            case 16:
                Runnable runnable = (Runnable) obj;
                for (hs hsVar : ((mh1) obj2).f34969w.f32906f) {
                    hsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 17:
                th1 th1Var = (th1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = th1Var.f36945f;
                ArrayList<TLRPC.Chat> arrayList5 = th1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(th1Var.f36942a).putChats(arrayList5, false);
                th1Var.d = false;
                th1Var.f36944c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 18:
                zi1 zi1Var = (zi1) obj2;
                zi1Var.U.a(new ii1(zi1Var, (VoIPService) obj, 1), true);
                return;
            case 19:
                zi1 zi1Var2 = (zi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.l2.T = false;
                org.telegram.ui.Components.voip.l2.i();
                ViewPropertyAnimator duration = zi1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
                duration.setInterpolator(wrVar).start();
                zi1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
                zi1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
                zi1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
                zi1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
                zi1Var2.f39378j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar).start();
                zi1Var2.f39374h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(wrVar).start();
                zi1Var2.f39376i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(wrVar).start();
                zi1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(wrVar).start();
                valueAnimator.addListener(new ni1(zi1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(wrVar);
                valueAnimator.start();
                return;
            case 20:
                hj1 hj1Var = (hj1) obj2;
                int[] iArr = (int[]) obj;
                hj1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = hj1Var.f33403a;
                    int[][] iArr2 = WallpapersListActivity.f30730k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 21:
                nj1 nj1Var = (nj1) obj2;
                String str3 = (String) obj;
                nj1Var.d.clear();
                nj1Var.e.clear();
                nj1Var.f35294f = true;
                nj1Var.F(str3, "", true);
                nj1Var.h = str3;
                nj1Var.l();
                nj1Var.f35300y = null;
                return;
            case 22:
                nj1 nj1Var2 = (nj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = nj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = nj1Var2.f35299x;
                nj1Var2.f35299x = null;
                nj1Var2.F(str4, "", false);
                return;
            case 23:
                String str5 = (String) obj;
                tj1 tj1Var = ((sj1) obj2).f36713a;
                Activity parentActivity = tj1Var.getParentActivity();
                MessageObject messageObject = tj1Var.f36957n;
                if (parentActivity != null) {
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
                    tj1Var.showDialog(org.telegram.ui.Components.sq0.N0(tj1Var.getParentActivity(), messageObject, null, false, tj1Var.h));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) obj2;
                di.u uVar = c1Var2.f37889j0;
                uVar.f6931f = true;
                uVar.k();
                c1Var2.w((org.telegram.ui.web.a1) obj);
                return;
            case 25:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (c1Var = botWebViewContainer$BotWebViewProxy.f37844a) != null && (h0Var = c1Var.f37880c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 26:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.f37934c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.e1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.f1.f37933b = true;
                org.telegram.ui.web.f1.f37932a = false;
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
            case 27:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.f37943f;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.h = false;
                org.telegram.ui.Components.l61 l61Var = h1Var.f25171a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                if (((org.telegram.ui.web.i2) obj).b() != null) {
                    z10 = true;
                }
                g1Var.setEnabled(z10);
                ViewPropertyAnimator animate = g1Var.animate();
                if (!g1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            default:
                ((l0) obj2).f38109f0.run((Integer) obj);
                return;
        }
    }
}
