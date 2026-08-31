package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w01 implements Runnable {
    public final int f42331a;
    public final Object f42332b;
    public final Object f42333c;

    public w01(int i10, Object obj, Object obj2) {
        this.f42331a = i10;
        this.f42332b = obj;
        this.f42333c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        org.telegram.ui.Components.fl0 fl0Var;
        int i10 = this.f42331a;
        Object obj = this.f42333c;
        Object obj2 = this.f42332b;
        switch (i10) {
            case 0:
                x01 x01Var = (x01) obj2;
                x01Var.f42925f.add((z01) obj);
                x01Var.a();
                return;
            case 1:
                ((o21) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 2:
                j21 j21Var = (j21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    j21Var.getClass();
                    return;
                }
                int i11 = j21Var.G;
                if (i11 != 0 && i11 < tL_exportedContactToken.expires) {
                    try {
                        try {
                            Vibrator vibrator = (Vibrator) j21Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        j21Var.performHapticFeedback(0, 2);
                    }
                }
                j21Var.G = tL_exportedContactToken.expires;
                j21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 3:
                l31 l31Var = (l31) ((View[]) obj2)[0];
                l31Var.f38572b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                l31Var.f38573c = null;
                l31Var.d = null;
                l31Var.f38575f.V2.N(false);
                return;
            case 4:
                ((l31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 5:
                l31 l31Var2 = (l31) ((View[]) obj2)[0];
                l31Var2.f38572b = null;
                l31Var2.f38573c = (TLRPC.TL_reportResultChooseOption) obj;
                l31Var2.d = null;
                l31Var2.f38575f.V2.N(false);
                return;
            case 6:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.qc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 7:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.a90) obj);
                return;
            case 8:
                ((SecretMediaViewer) obj2).J = false;
                ((lu0) obj).f38864a.setVisible(false, true);
                return;
            case 9:
                ((SecretMediaViewer) ((n7.qa) obj2).f15700c).h((File) obj);
                return;
            case 10:
                r61 r61Var = (r61) obj2;
                r61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, r61Var.I0));
                Runnable runnable = r61Var.Q1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.qc.a0((p81) obj2).k(false).j();
                return;
            case 12:
                p81.W((p81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                i81 i81Var = (i81) obj2;
                a0.h hVar = (a0.h) obj;
                p81 p81Var = i81Var.Y0;
                Activity parentActivity = p81Var.getParentActivity();
                lh.j4 j4Var = p81Var.f39948b;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20847id;
                } else {
                    j10 = 0;
                }
                org.telegram.ui.Components.qc.x(parentActivity, j4Var, m9, j10, i81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), i81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 14:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                new z81(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider(), (lh.a1) obj).show();
                return;
            case 15:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.k8) obj);
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 17:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.f21991w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.f21991w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.f22010x), Double.valueOf(org.telegram.ui.ActionBar.k6.f22029y));
                }
                org.telegram.ui.ActionBar.k6.q1();
                org.telegram.ui.Components.tl0 tl0Var = themeActivity2.f34872b;
                if (tl0Var != null && (fl0Var = (org.telegram.ui.Components.fl0) tl0Var.K(themeActivity2.V)) != null) {
                    View view2 = fl0Var.f5875a;
                    if (view2 instanceof org.telegram.ui.Cells.aa) {
                        ((org.telegram.ui.Cells.aa) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.f21991w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ed1 ed1Var = (ed1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (ed1Var.f36521n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    ed1Var.f36546x0.f(ed1Var.H0[0], true);
                    return;
                }
                return;
            case 19:
                jd1.X((jd1) obj2, (String) obj);
                return;
            case 20:
                jd1.V((jd1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 21:
                ud1 ud1Var = (ud1) obj2;
                ud1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ud1Var.c(true);
                return;
            case 22:
                ud1 ud1Var2 = (ud1) obj2;
                ud1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ud1Var2.c(true);
                return;
            case 23:
                re1 re1Var = (re1) obj2;
                re1Var.getClass();
                Bundle bundle = new Bundle();
                mf1 mf1Var = re1Var.f40947b;
                bundle.putLong("dialog_id", -mf1Var.f39102a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20895id);
                mf1Var.presentFragment(new g11(bundle, null));
                return;
            case 24:
                if1 if1Var = (if1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = if1Var.W;
                mf1 mf1Var2 = if1Var.f37849q0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = mf1Var2.f39105b;
                    if (i12 < arrayList3.size()) {
                        if (((df1) arrayList3.get(i12)).f36216c != null && ((df1) arrayList3.get(i12)).f36216c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((df1) arrayList3.get(i12)).f36216c);
                            ((df1) arrayList3.get(i12)).f36216c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        if1Var.L();
                        if (!arrayList.isEmpty()) {
                            if1Var.f37842i0 = false;
                            if1Var.f37845l0.b(0);
                        }
                        if1Var.J(str2);
                        return;
                    }
                }
                break;
            case 25:
                pf1 pf1Var = ((of1) obj2).f39746b;
                pf1Var.f40030a.f41280e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20895id));
                pf1Var.f40030a.V();
                return;
            case 26:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 27:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 28:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            default:
                qg1.g0((qg1) obj2, (String) obj);
                return;
        }
    }

    public w01(i81 i81Var, a0.h hVar, int i10) {
        this.f42331a = 13;
        this.f42332b = i81Var;
        this.f42333c = hVar;
    }
}
