package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
public final class wg1 implements Runnable {
    public final int f45486a;
    public final int f45487b;
    public final Object f45488c;

    public wg1(int i10, wb0 wb0Var) {
        this.f45486a = 2;
        this.f45487b = i10;
        this.f45488c = wb0Var;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f45486a;
        final int i11 = this.f45487b;
        Object obj = this.f45488c;
        switch (i10) {
            case 0:
                ph1 ph1Var = (ph1) obj;
                ph1Var.F.setSignalBarCount(i11);
                if (i11 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = ph1Var.v;
                    if (d3Var.V != 3) {
                        d3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.H, 255);
                        d3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.O.setDuration(500L);
                        d3Var.O.start();
                    }
                    ph1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.d3 d3Var2 = ph1Var.v;
                if (d3Var2.V != 2) {
                    d3Var2.V = 2;
                    d3Var2.c();
                    ValueAnimator valueAnimator = d3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        d3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(d3Var2.H, 0);
                    d3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var2, 0));
                    d3Var2.O.setDuration(500L);
                    d3Var2.O.start();
                }
                ph1Var.F.c(false);
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
                org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(notificationCenter, (wb0) obj, w10);
                notificationCenter.addObserver(a0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(a0Var, 10000L);
                if (w10.e == null && w10.A < 0) {
                    w10.W();
                }
                w10.U();
                a0Var.a();
                return;
            case 3:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) obj;
                AndroidUtilities.runOnUIThread(new yx(n5Var, i11, org.telegram.ui.Wallet.n5.h(n5Var.R, i11), 17));
                return;
            case 4:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) obj;
                if (l6Var.f36860r && !l6Var.f36863x && i11 == l6Var.f36857k0) {
                    l6Var.postDelayed(l6Var.f36858l0, 500L);
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
                            ((org.telegram.ui.Wallet.ha) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        w7Var.Z();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) obj;
                if (!r9Var.f37199r && i11 == r9Var.J) {
                    r9Var.L = false;
                    r9Var.f30417a.f32150g3.O(true);
                    return;
                }
                return;
            case 7:
                ((ph.a) obj).w0(i11, 0, null);
                return;
            case 8:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    try {
                        e2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        e2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 9:
                sg.j jVar = (sg.j) obj;
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
                duration.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                jVar.P.addUpdateListener(new sg.f(jVar, 5));
                jVar.P.addListener(new sg.g(jVar, 2));
                jVar.P.start();
                return;
            case 10:
                nt0 nt0Var = (nt0) obj;
                rg.q1 q1Var = nt0Var.f48366z1;
                nt0Var.r0(q1Var, null);
                rg.s0.e(i11).j(q1Var.f47524c);
                return;
            case 11:
                sg.p2 p2Var = (sg.p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                return;
            default:
                org.telegram.ui.Components.z90 z90Var = ((vg.r0) obj).e;
                try {
                    if (z90Var.getLayout().getLineForOffset(i11) == 0) {
                        z90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }

    public wg1(Object obj, int i10, int i11) {
        this.f45486a = i11;
        this.f45488c = obj;
        this.f45487b = i10;
    }
}
