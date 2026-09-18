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
public final class s3 implements Utilities.Callback {
    public final int f37376a;
    public final Object f37377b;

    public s3(Object obj, int i10) {
        this.f37376a = i10;
        this.f37377b = obj;
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
        switch (this.f37376a) {
            case 0:
                h4 h4Var = ((u3) this.f37377b).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.f34167o0 = z10;
                return;
            case 1:
                cd cdVar = (cd) this.f37377b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                cdVar.E = wallPaper;
                cdVar.F = wallPaper;
                cdVar.G = wallPaper;
                cdVar.X0(false);
                cdVar.a1(false);
                AndroidUtilities.runOnUIThread(new hc(cdVar, 1), 350L);
                return;
            case 2:
                ((oq) this.f37377b).e.S = (String) obj;
                return;
            case 3:
                ur urVar = ((qr) this.f37377b).d;
                urVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(urVar.f38128c, urVar.f38160r0);
                return;
            case 4:
                us.U((us) this.f37377b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((g20) this.f37377b).e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((x50) this.f37377b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((pc0) this.f37377b).Y();
                return;
            case 8:
                hg0 hg0Var = (hg0) this.f37377b;
                String str = (String) obj;
                hg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    hg0Var.f34268b.setLoading(false);
                    return;
                }
                return;
            case 9:
                dj0 dj0Var = (dj0) this.f37377b;
                Integer num = (Integer) obj;
                dj0Var.getClass();
                if (num.intValue() - dj0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dj0Var.f33142b0 = z11;
                if (z11) {
                    f7 = Math.min(dj0Var.f33144c0, (dj0Var.F.getHeight() - num.intValue()) - dj0Var.f33145d0.getMeasuredHeight());
                } else {
                    f7 = dj0Var.f33144c0;
                }
                dj0Var.f33145d0.animate().translationY(f7 - dj0Var.f33145d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f19508w).start();
                return;
            case 10:
                tj0 tj0Var = (tj0) this.f37377b;
                tj0Var.f37820j0 = (String) obj;
                w5 w5Var = tj0Var.f37829t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                return;
            case 11:
                ek0 ek0Var = (ek0) this.f37377b;
                ek0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ek0Var.r();
                    return;
                }
                return;
            case 12:
                rp0.b((rp0) this.f37377b, (Canvas) obj);
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((up0) this.f37377b).f38114c.e();
                return;
            case 14:
                ((ci.i1) this.f37377b).E(((Integer) obj).intValue());
                return;
            case 15:
                vw0 vw0Var = (vw0) this.f37377b;
                vw0Var.f38523s = ((Integer) obj).intValue();
                View z12 = vw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && vw0Var.f38523s > 0) {
                        e9Var.setText(vw0Var.W());
                        vw0Var.V(true);
                        return;
                    }
                }
                vw0Var.d.Y2.N(true);
                vw0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37377b;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.c90[] c90VarArr = (org.telegram.ui.Components.c90[]) this.f37377b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = c90VarArr[0].animate();
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
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.wl.q(scaleY, qrVar, 600L);
                ViewPropertyAnimator animate2 = c90VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(qrVar).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ky0(15, (a31) this.f37377b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f37377b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f37377b, (TL_account.contentSettings) obj);
                return;
            case 21:
                xd1 xd1Var = (xd1) this.f37377b;
                xd1Var.getClass();
                xd1Var.f39575n1 = ((Float) obj).floatValue();
                xd1Var.f39598x0.invalidate();
                xd1Var.V0();
                return;
            case 22:
                ((ci.i1) this.f37377b).E(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ti1) this.f37377b).E(true);
                return;
        }
    }
}
