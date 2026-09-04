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
public final class t3 implements Utilities.Callback {
    public final int f40607a;
    public final Object f40608b;

    public t3(Object obj, int i10) {
        this.f40607a = i10;
        this.f40608b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.f40607a) {
            case 0:
                i4 i4Var = ((v3) this.f40608b).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.f37226o0 = z10;
                return;
            case 1:
                bd bdVar = (bd) this.f40608b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bdVar.E = wallPaper;
                bdVar.F = wallPaper;
                bdVar.G = wallPaper;
                bdVar.X0(false);
                bdVar.a1(false);
                AndroidUtilities.runOnUIThread(new fc(bdVar, 1), 350L);
                return;
            case 2:
                ((pq) this.f40608b).f39616e.S = (String) obj;
                return;
            case 3:
                vr vrVar = ((rr) this.f40608b).d;
                vrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(vrVar.f41635c, vrVar.f41668r0);
                return;
            case 4:
                ss.U((ss) this.f40608b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((e20) this.f40608b).f35912e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((w50) this.f40608b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((nc0) this.f40608b).Y();
                return;
            case 8:
                fg0 fg0Var = (fg0) this.f40608b;
                String str = (String) obj;
                fg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    fg0Var.f36396b.setLoading(false);
                    return;
                }
                return;
            case 9:
                cj0 cj0Var = (cj0) this.f40608b;
                Integer num = (Integer) obj;
                cj0Var.getClass();
                if (num.intValue() - cj0Var.f35134e.d > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cj0Var.f35130b0 = z11;
                if (z11) {
                    f7 = Math.min(cj0Var.f35132c0, (cj0Var.F.getHeight() - num.intValue()) - cj0Var.f35133d0.getMeasuredHeight());
                } else {
                    f7 = cj0Var.f35132c0;
                }
                cj0Var.f35133d0.animate().translationY(f7 - cj0Var.f35133d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f21275w).start();
                return;
            case 10:
                tj0 tj0Var = (tj0) this.f40608b;
                tj0Var.f40777j0 = (String) obj;
                w5 w5Var = tj0Var.f40786t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                return;
            case 11:
                ek0 ek0Var = (ek0) this.f40608b;
                ek0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ek0Var.r();
                    return;
                }
                return;
            case 12:
                qp0.b((qp0) this.f40608b, (Canvas) obj);
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((tp0) this.f40608b).f40811c.e();
                return;
            case 14:
                ((di.i1) this.f40608b).D(((Integer) obj).intValue());
                return;
            case 15:
                tw0 tw0Var = (tw0) this.f40608b;
                tw0Var.f40849s = ((Integer) obj).intValue();
                View x12 = tw0Var.d.x1(4);
                if (x12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) x12;
                    if (e9Var.getFixedSize() <= 0 && tw0Var.f40849s > 0) {
                        e9Var.setText(tw0Var.W());
                        tw0Var.V(true);
                        return;
                    }
                }
                tw0Var.d.Y2.N(true);
                tw0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f40608b;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.d90[] d90VarArr = (org.telegram.ui.Components.d90[]) this.f40608b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = d90VarArr[0].animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (bool4.booleanValue()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (bool4.booleanValue()) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (bool4.booleanValue()) {
                    f12 = 0.8f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                org.telegram.messenger.wl.q(scaleY, prVar, 600L);
                ViewPropertyAnimator animate2 = d90VarArr[1].animate();
                if (bool4.booleanValue()) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (!bool4.booleanValue()) {
                    f13 = 0.8f;
                } else {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!bool4.booleanValue()) {
                    f15 = 0.8f;
                }
                scaleX2.scaleY(f15).setInterpolator(prVar).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new rx0(21, (a31) this.f40608b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f40608b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f40608b, (TL_account.contentSettings) obj);
                return;
            case 21:
                wd1 wd1Var = (wd1) this.f40608b;
                wd1Var.getClass();
                wd1Var.f41954n1 = ((Float) obj).floatValue();
                wd1Var.f41977x0.invalidate();
                wd1Var.V0();
                return;
            case 22:
                ((di.i1) this.f40608b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ui1) this.f40608b).E(true);
                return;
        }
    }
}
