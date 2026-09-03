package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w3 implements Utilities.Callback {
    public final int f42271a;
    public final Object f42272b;

    public w3(Object obj, int i10) {
        this.f42271a = i10;
        this.f42272b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        switch (this.f42271a) {
            case 0:
                l4 l4Var = ((y3) this.f42272b).H;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                l4Var.f38519l0 = z4;
                return;
            case 1:
                bd bdVar = (bd) this.f42272b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bdVar.B = wallPaper;
                bdVar.C = wallPaper;
                bdVar.D = wallPaper;
                bdVar.X0(false);
                bdVar.a1(false);
                AndroidUtilities.runOnUIThread(new dc(bdVar, 1), 350L);
                return;
            case 2:
                ((jq) this.f42272b).f38110e.P = (String) obj;
                return;
            case 3:
                qr qrVar = ((mr) this.f42272b).d;
                qrVar.f40622x1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(qrVar.f40573c, qrVar.f40599o0);
                return;
            case 4:
                os.U((os) this.f42272b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((a20) this.f42272b).f35001e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((q50) this.f42272b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((fc0) this.f42272b).Y();
                return;
            case 8:
                xf0 xf0Var = (xf0) this.f42272b;
                String str = (String) obj;
                xf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    xf0Var.f43026b.setLoading(false);
                    return;
                }
                return;
            case 9:
                ti0 ti0Var = (ti0) this.f42272b;
                Integer num = (Integer) obj;
                ti0Var.getClass();
                if (num.intValue() - ti0Var.f41554e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ti0Var.Y = z10;
                if (z10) {
                    f10 = Math.min(ti0Var.Z, (ti0Var.C.getHeight() - num.intValue()) - ti0Var.f41548a0.getMeasuredHeight());
                } else {
                    f10 = ti0Var.Z;
                }
                ti0Var.f41548a0.animate().translationY(f10 - ti0Var.f41548a0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f22251w).start();
                return;
            case 10:
                ij0 ij0Var = (ij0) this.f42272b;
                ij0Var.f37725g0 = (String) obj;
                z5 z5Var = ij0Var.f37734q0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 100L);
                return;
            case 11:
                uj0 uj0Var = (uj0) this.f42272b;
                uj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    uj0Var.r();
                    return;
                }
                return;
            case 12:
                cp0.b((cp0) this.f42272b, (Canvas) obj);
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((fp0) this.f42272b).f36893c.e();
                return;
            case 14:
                ((ek) this.f42272b).D(((Integer) obj).intValue());
                return;
            case 15:
                fw0 fw0Var = (fw0) this.f42272b;
                fw0Var.f36930s = ((Integer) obj).intValue();
                View x12 = fw0Var.d.x1(4);
                if (x12 instanceof org.telegram.ui.Cells.a9) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) x12;
                    if (a9Var.getFixedSize() <= 0 && fw0Var.f36930s > 0) {
                        a9Var.setText(fw0Var.W());
                        fw0Var.V(true);
                        return;
                    }
                }
                fw0Var.d.V2.N(true);
                fw0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f42272b;
                ArrayList arrayList = privacySettingsActivity.M;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.g90[] g90VarArr = (org.telegram.ui.Components.g90[]) this.f42272b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = g90VarArr[0].animate();
                float f15 = 0.0f;
                float f16 = 1.0f;
                if (bool4.booleanValue()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (bool4.booleanValue()) {
                    f12 = 0.8f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (bool4.booleanValue()) {
                    f13 = 0.8f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                b.p(scaleY, prVar, 600L);
                ViewPropertyAnimator animate2 = g90VarArr[1].animate();
                if (bool4.booleanValue()) {
                    f15 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (!bool4.booleanValue()) {
                    f14 = 0.8f;
                } else {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f14);
                if (!bool4.booleanValue()) {
                    f16 = 0.8f;
                }
                scaleX2.scaleY(f16).setInterpolator(prVar).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new h21(1, (o21) this.f42272b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f42272b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f42272b, (TL_account.contentSettings) obj);
                return;
            case 21:
                jd1 jd1Var = (jd1) this.f42272b;
                jd1Var.getClass();
                jd1Var.f37993k1 = ((Float) obj).floatValue();
                jd1Var.f38013u0.invalidate();
                jd1Var.V0();
                return;
            case 22:
                ((ek) this.f42272b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ii1) this.f42272b).E(true);
                return;
        }
    }
}
