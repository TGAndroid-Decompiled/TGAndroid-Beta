package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w31 implements Runnable {
    public final int f43031a;
    public final Object f43032b;
    public final Object f43033c;

    public w31(int i10, Object obj, Object obj2) {
        this.f43031a = i10;
        this.f43032b = obj;
        this.f43033c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        org.telegram.ui.Components.gm0 gm0Var;
        int i10 = this.f43031a;
        int i11 = 0;
        Object obj = this.f43033c;
        Object obj2 = this.f43032b;
        switch (i10) {
            case 0:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.zc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 1:
                org.telegram.ui.Components.zc.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.sj0) obj);
                return;
            case 2:
                ((SecretMediaViewer) obj2).M = false;
                ((gv0) obj).f38147a.setVisible(false, true);
                return;
            case 3:
                ((SecretMediaViewer) ((n6.k) obj2).f16433c).h((File) obj);
                return;
            case 4:
                n71 n71Var = (n71) obj2;
                n71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.m2) obj).presentFragment(new StickersActivity(5, n71Var.L0));
                Runnable runnable = n71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.zc.a0((k91) obj2).k(false).j();
                return;
            case 6:
                k91.W((k91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 7:
                d91 d91Var = (d91) obj2;
                a0.i iVar = (a0.i) obj;
                k91 k91Var = d91Var.f36702b1;
                Activity parentActivity = k91Var.getParentActivity();
                y8 y8Var = k91Var.f39415b;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f19806id;
                } else {
                    j3 = 0;
                }
                org.telegram.ui.Components.zc.x(parentActivity, y8Var, m10, j3, d91Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), d91Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 8:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                new v91(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getResourceProvider(), (tc) obj).show();
                return;
            case 9:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 10:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 11:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.h6.f20903w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.f20903w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.f20922x), Double.valueOf(org.telegram.ui.ActionBar.h6.f20939y));
                }
                org.telegram.ui.ActionBar.h6.r1();
                org.telegram.ui.Components.wm0 wm0Var = themeActivity2.f34368b;
                if (wm0Var != null && (gm0Var = (org.telegram.ui.Components.gm0) wm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = gm0Var.f47889a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.f20903w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                zd1 zd1Var = (zd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (zd1Var.f44767n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    zd1Var.A0.f(zd1Var.K0[0], true);
                    return;
                }
                return;
            case 13:
                ee1.X((ee1) obj2, (String) obj);
                return;
            case 14:
                ee1.V((ee1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 15:
                oe1 oe1Var = (oe1) obj2;
                oe1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                oe1Var.c(true);
                return;
            case 16:
                oe1 oe1Var2 = (oe1) obj2;
                oe1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                oe1Var2.c(true);
                return;
            case 17:
                nf1 nf1Var = (nf1) obj2;
                nf1Var.getClass();
                Bundle bundle = new Bundle();
                hg1 hg1Var = nf1Var.f40403b;
                bundle.putLong("dialog_id", -hg1Var.f38376a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f19854id);
                hg1Var.presentFragment(new x11(bundle, null));
                return;
            case 18:
                dg1 dg1Var = (dg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = dg1Var.f36807c0;
                hg1 hg1Var2 = dg1Var.f36823t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = hg1Var2.f38379b;
                    if (i12 < arrayList3.size()) {
                        if (((yf1) arrayList3.get(i12)).f44469c != null && ((yf1) arrayList3.get(i12)).f44469c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((yf1) arrayList3.get(i12)).f44469c);
                            ((yf1) arrayList3.get(i12)).f44469c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        dg1Var.L();
                        if (!arrayList.isEmpty()) {
                            dg1Var.f36816l0 = false;
                            dg1Var.f36818o0.b(0);
                        }
                        dg1Var.J(str2);
                        return;
                    }
                }
                break;
            case 19:
                kg1 kg1Var = ((jg1) obj2).f39207b;
                kg1Var.f39491a.f40412e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f19854id));
                kg1Var.f39491a.V();
                return;
            case 20:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 21:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 22:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 23:
                kh1.g0((kh1) obj2, (String) obj);
                return;
            case 24:
                Runnable runnable2 = (Runnable) obj;
                hs[] hsVarArr = ((kh1) obj2).f39515w.f37837f;
                int length = hsVarArr.length;
                while (i11 < length) {
                    hsVarArr[i11].l(0.0f);
                    i11++;
                }
                runnable2.run();
                return;
            case 25:
                rh1 rh1Var = (rh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = rh1Var.f41659f;
                ArrayList<TLRPC.Chat> arrayList5 = rh1Var.f41658e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(rh1Var.f41655a).putChats(arrayList5, false);
                rh1Var.d = false;
                rh1Var.f41657c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 26:
                xi1 xi1Var = (xi1) obj2;
                xi1Var.U.a(new gi1(xi1Var, (VoIPService) obj, 1), true);
                return;
            case 27:
                xi1 xi1Var2 = (xi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.U = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = xi1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27627f;
                duration.setInterpolator(jsVar).start();
                xi1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar).start();
                xi1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar).start();
                xi1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar).start();
                xi1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar).start();
                xi1Var2.f44001j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar).start();
                xi1Var2.f43997h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(jsVar).start();
                xi1Var2.f43999i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(jsVar).start();
                xi1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(jsVar).start();
                valueAnimator.addListener(new li1(xi1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(jsVar);
                valueAnimator.start();
                return;
            case 28:
                MessagesController.getInstance(((org.telegram.ui.Wallet.l0) obj2).f34994a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            default:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.l0.E("enable backup: ready! getting secret phrase...");
                l0Var.x(new ai.m0(20, l0Var, (org.telegram.ui.Wallet.d7) obj), false, true);
                return;
        }
    }

    public w31(d91 d91Var, a0.i iVar, int i10) {
        this.f43031a = 7;
        this.f43032b = d91Var;
        this.f43033c = iVar;
    }
}
