package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
public final class wg1 implements Runnable {
    public final int f43371a;
    public final int f43372b;
    public final Object f43373c;

    public wg1(int i10, Object obj, int i11) {
        this.f43371a = i11;
        this.f43372b = i10;
        this.f43373c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f43371a;
        Object obj = this.f43373c;
        final int i11 = this.f43372b;
        switch (i10) {
            case 0:
                oh1 oh1Var = (oh1) obj;
                oh1Var.F.setSignalBarCount(i11);
                if (i11 <= 1) {
                    org.telegram.ui.Components.voip.a3 a3Var = oh1Var.v;
                    if (a3Var.V != 3) {
                        a3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(a3Var.H, 255);
                        a3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var, 2));
                        a3Var.O.setDuration(500L);
                        a3Var.O.start();
                    }
                    oh1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.a3 a3Var2 = oh1Var.v;
                if (a3Var2.V != 2) {
                    a3Var2.V = 2;
                    a3Var2.c();
                    ValueAnimator valueAnimator = a3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        a3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(a3Var2.H, 0);
                    a3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var2, 0));
                    a3Var2.O.setDuration(500L);
                    a3Var2.O.start();
                }
                oh1Var.F.c(false);
                return;
            case 1:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                HashSet hashSet = l0Var.E;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    l0Var.Q();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(notificationCenter, (f80) obj, w9);
                notificationCenter.addObserver(a0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(a0Var, 10000L);
                if (w9.e == null && w9.A < 0) {
                    w9.W();
                }
                w9.U();
                a0Var.a();
                return;
            case 3:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c41(p5Var, i11, org.telegram.ui.Wallet.p5.h(p5Var.R, i11), 19));
                return;
            case 4:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                if (m6Var.f34874r && !m6Var.f34877x && i11 == m6Var.f34871k0) {
                    m6Var.postDelayed(m6Var.f34872l0, 500L);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) obj;
                ArrayList arrayList = w7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) w7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((org.telegram.ui.Wallet.ia) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        w7Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) obj;
                if (!s9Var.f35185n && i11 == s9Var.I) {
                    s9Var.K = false;
                    s9Var.f25907a.Z2.N(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    try {
                        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        c2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 8:
                rg.j jVar = (rg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, 2));
                jVar.P.start();
                return;
            case 9:
                jt0 jt0Var = (jt0) obj;
                qg.s1 s1Var = jt0Var.K1;
                jt0Var.s0(s1Var, null);
                qg.u0.e(i11).j(s1Var.f45068c);
                return;
            case 10:
                rg.o2 o2Var = (rg.o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                return;
            case 11:
                org.telegram.ui.Components.y90 y90Var = ((ug.p0) obj).e;
                try {
                    if (y90Var.getLayout().getLineForOffset(i11) == 0) {
                        y90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.h5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public wg1(Object obj, int i10, int i11) {
        this.f43371a = i11;
        this.f43373c = obj;
        this.f43372b = i10;
    }
}
