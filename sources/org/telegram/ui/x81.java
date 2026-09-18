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
public final class x81 implements Runnable {
    public final int f39385a;
    public final Object f39386b;
    public final Object f39387c;

    public x81(int i10, Object obj, Object obj2) {
        this.f39385a = i10;
        this.f39386b = obj;
        this.f39387c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        org.telegram.ui.Components.gl0 gl0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.f39385a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f39387c;
        Object obj2 = this.f39386b;
        switch (i12) {
            case 0:
                y81 y81Var = (y81) obj2;
                a0.i iVar = (a0.i) obj;
                f91 f91Var = y81Var.f39728b1;
                Activity parentActivity = f91Var.getParentActivity();
                x8 x8Var = f91Var.f33481b;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18300id;
                } else {
                    j3 = 0;
                }
                org.telegram.ui.Components.xc.x(parentActivity, x8Var, m10, j3, y81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), y81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new r91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (of) obj).show();
                return;
            case 2:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 3:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 4:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.f19404w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.f19404w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.f19421x), Double.valueOf(org.telegram.ui.ActionBar.j6.f19439y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.wl0 wl0Var = themeActivity2.f31795b;
                if (wl0Var != null && (gl0Var = (org.telegram.ui.Components.gl0) wl0Var.L(themeActivity2.Y)) != null) {
                    View view2 = gl0Var.f42929a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f19404w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                vd1 vd1Var = (vd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (vd1Var.f38504n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    vd1Var.A0.f(vd1Var.K0[0], true);
                    return;
                }
                return;
            case 6:
                ae1.X((ae1) obj2, (String) obj);
                return;
            case 7:
                ae1.V((ae1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 8:
                ke1 ke1Var = (ke1) obj2;
                ke1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ke1Var.c(true);
                return;
            case 9:
                ke1 ke1Var2 = (ke1) obj2;
                ke1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ke1Var2.c(true);
                return;
            case 10:
                jf1 jf1Var = (jf1) obj2;
                jf1Var.getClass();
                Bundle bundle = new Bundle();
                dg1 dg1Var = jf1Var.f34868b;
                bundle.putLong("dialog_id", -dg1Var.f32970a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18348id);
                dg1Var.presentFragment(new w11(bundle, null));
                return;
            case 11:
                zf1 zf1Var = (zf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = zf1Var.f40117d0;
                dg1 dg1Var2 = zf1Var.f40133u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = dg1Var2.f32973b;
                    if (i15 < arrayList3.size()) {
                        if (((uf1) arrayList3.get(i15)).f37987c != null && ((uf1) arrayList3.get(i15)).f37987c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((uf1) arrayList3.get(i15)).f37987c);
                            ((uf1) arrayList3.get(i15)).f37987c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        zf1Var.M();
                        if (!arrayList.isEmpty()) {
                            zf1Var.m0 = false;
                            zf1Var.f40128p0.b(0);
                        }
                        zf1Var.K(str2);
                        return;
                    }
                }
                break;
            case 12:
                gg1 gg1Var = ((fg1) obj2).f33535b;
                gg1Var.f33843a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18348id));
                gg1Var.f33843a.V();
                return;
            case 13:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 14:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 15:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 16:
                gh1.g0((gh1) obj2, (String) obj);
                return;
            case 17:
                Runnable runnable = (Runnable) obj;
                for (gs gsVar : ((gh1) obj2).f33863w.f33074f) {
                    gsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 18:
                nh1 nh1Var = (nh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = nh1Var.f35948f;
                ArrayList<TLRPC.Chat> arrayList5 = nh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(nh1Var.f35945a).putChats(arrayList5, false);
                nh1Var.d = false;
                nh1Var.f35947c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 19:
                si1 si1Var = (si1) obj2;
                si1Var.U.a(new bi1(si1Var, (VoIPService) obj, 1), true);
                return;
            case 20:
                si1 si1Var2 = (si1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = si1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27715f;
                duration.setInterpolator(qrVar).start();
                si1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.f37317j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.f37313h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                si1Var2.f37315i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                si1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new gi1(si1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                return;
            case 21:
                bj1 bj1Var = (bj1) obj2;
                int[] iArr = (int[]) obj;
                bj1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = bj1Var.f32395a;
                    int[][] iArr2 = WallpapersListActivity.f31862i0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 22:
                hj1 hj1Var = (hj1) obj2;
                String str3 = (String) obj;
                hj1Var.d.clear();
                hj1Var.e.clear();
                hj1Var.f34174f = true;
                hj1Var.F(str3, "", true);
                hj1Var.h = str3;
                hj1Var.l();
                hj1Var.f34180y = null;
                return;
            case 23:
                hj1 hj1Var2 = (hj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = hj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = hj1Var2.f34179x;
                hj1Var2.f34179x = null;
                hj1Var2.F(str4, "", false);
                return;
            case 24:
                String str5 = (String) obj;
                nj1 nj1Var = ((mj1) obj2).f35684a;
                Activity parentActivity2 = nj1Var.getParentActivity();
                MessageObject messageObject = nj1Var.f35971n;
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
                    nj1Var.showDialog(org.telegram.ui.Components.vq0.N0(nj1Var.getParentActivity(), messageObject, null, false, nj1Var.h));
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.f38864j0;
                rVar.f8580f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                return;
            case 26:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.f38810a) != null && (h0Var = d1Var.f38855c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 27:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.f38902c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.e1) longSparseArray.valueAt(i17));
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
            case 28:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.f38916n = false;
                org.telegram.ui.Components.n61 n61Var = h1Var.f26891a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                if (((org.telegram.ui.web.h2) obj).b() != null) {
                    z10 = true;
                }
                f1Var.setEnabled(z10);
                ViewPropertyAnimator animate = f1Var.animate();
                if (!f1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
        }
    }

    public x81(y81 y81Var, a0.i iVar, int i10) {
        this.f39385a = 0;
        this.f39386b = y81Var;
        this.f39387c = iVar;
    }
}
