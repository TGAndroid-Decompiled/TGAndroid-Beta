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
public final class y3 implements Utilities.Callback {
    public final int f40129a;
    public final Object f40130b;

    public y3(Object obj, int i10) {
        this.f40129a = i10;
        this.f40130b = obj;
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
        switch (this.f40129a) {
            case 0:
                n4 n4Var = ((a4) this.f40130b).H;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                n4Var.f36370l0 = z4;
                return;
            case 1:
                dd ddVar = (dd) this.f40130b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                ddVar.B = wallPaper;
                ddVar.C = wallPaper;
                ddVar.D = wallPaper;
                ddVar.X0(false);
                ddVar.a1(false);
                AndroidUtilities.runOnUIThread(new fc(ddVar, 1), 350L);
                return;
            case 2:
                ((kq) this.f40130b).e.P = (String) obj;
                return;
            case 3:
                rr rrVar = ((nr) this.f40130b).d;
                rrVar.f38009x1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(rrVar.f37961c, rrVar.f37986o0);
                return;
            case 4:
                ps.U((ps) this.f40130b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((b20) this.f40130b).e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((r50) this.f40130b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((gc0) this.f40130b).Y();
                return;
            case 8:
                yf0 yf0Var = (yf0) this.f40130b;
                String str = (String) obj;
                yf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    yf0Var.f40260b.setLoading(false);
                    return;
                }
                return;
            case 9:
                ui0 ui0Var = (ui0) this.f40130b;
                Integer num = (Integer) obj;
                ui0Var.getClass();
                if (num.intValue() - ui0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ui0Var.Y = z10;
                if (z10) {
                    f10 = Math.min(ui0Var.Z, (ui0Var.C.getHeight() - num.intValue()) - ui0Var.f38826a0.getMeasuredHeight());
                } else {
                    f10 = ui0Var.Z;
                }
                ui0Var.f38826a0.animate().translationY(f10 - ui0Var.f38826a0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f20518w).start();
                return;
            case 10:
                jj0 jj0Var = (jj0) this.f40130b;
                jj0Var.f35304g0 = (String) obj;
                b6 b6Var = jj0Var.f35313q0;
                AndroidUtilities.cancelRunOnUIThread(b6Var);
                AndroidUtilities.runOnUIThread(b6Var, 100L);
                return;
            case 11:
                uj0 uj0Var = (uj0) this.f40130b;
                uj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    uj0Var.r();
                    return;
                }
                return;
            case 12:
                cp0.b((cp0) this.f40130b, (Canvas) obj);
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((fp0) this.f40130b).f34205c.e();
                return;
            case 14:
                ((gk) this.f40130b).D(((Integer) obj).intValue());
                return;
            case 15:
                fw0 fw0Var = (fw0) this.f40130b;
                fw0Var.f34244s = ((Integer) obj).intValue();
                View x12 = fw0Var.d.x1(4);
                if (x12 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) x12;
                    if (z8Var.getFixedSize() <= 0 && fw0Var.f34244s > 0) {
                        z8Var.setText(fw0Var.W());
                        fw0Var.V(true);
                        return;
                    }
                }
                fw0Var.d.V2.N(true);
                fw0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f40130b;
                ArrayList arrayList = privacySettingsActivity.M;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.f90[] f90VarArr = (org.telegram.ui.Components.f90[]) this.f40130b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = f90VarArr[0].animate();
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
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
                b.p(scaleY, mrVar, 600L);
                ViewPropertyAnimator animate2 = f90VarArr[1].animate();
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
                scaleX2.scaleY(f16).setInterpolator(mrVar).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new b11(2, (o21) this.f40130b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f40130b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f40130b, (TL_account.contentSettings) obj);
                return;
            case 21:
                jd1 jd1Var = (jd1) this.f40130b;
                jd1Var.getClass();
                jd1Var.f35210k1 = ((Float) obj).floatValue();
                jd1Var.f35230u0.invalidate();
                jd1Var.V0();
                return;
            case 22:
                ((gk) this.f40130b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ii1) this.f40130b).E(true);
                return;
        }
    }
}
