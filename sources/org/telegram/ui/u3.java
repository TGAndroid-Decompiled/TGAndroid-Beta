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
public final class u3 implements Utilities.Callback {
    public final int f37099a;
    public final Object f37100b;

    public u3(Object obj, int i10) {
        this.f37099a = i10;
        this.f37100b = obj;
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
        switch (this.f37099a) {
            case 0:
                j4 j4Var = ((w3) this.f37100b).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.f33914o0 = z10;
                return;
            case 1:
                cd cdVar = (cd) this.f37100b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                cdVar.E = wallPaper;
                cdVar.F = wallPaper;
                cdVar.G = wallPaper;
                cdVar.X0(false);
                cdVar.a1(false);
                AndroidUtilities.runOnUIThread(new hc(cdVar, 1), 350L);
                return;
            case 2:
                ((qq) this.f37100b).e.S = (String) obj;
                return;
            case 3:
                wr wrVar = ((sr) this.f37100b).d;
                wrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(wrVar.f38323c, wrVar.f38355r0);
                return;
            case 4:
                ts.U((ts) this.f37100b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((f20) this.f37100b).e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((w50) this.f37100b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((nc0) this.f37100b).Y();
                return;
            case 8:
                fg0 fg0Var = (fg0) this.f37100b;
                String str = (String) obj;
                fg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    fg0Var.f32813b.setLoading(false);
                    return;
                }
                return;
            case 9:
                cj0 cj0Var = (cj0) this.f37100b;
                Integer num = (Integer) obj;
                cj0Var.getClass();
                if (num.intValue() - cj0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cj0Var.f31685b0 = z11;
                if (z11) {
                    f7 = Math.min(cj0Var.f31687c0, (cj0Var.F.getHeight() - num.intValue()) - cj0Var.f31688d0.getMeasuredHeight());
                } else {
                    f7 = cj0Var.f31687c0;
                }
                cj0Var.f31688d0.animate().translationY(f7 - cj0Var.f31688d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f18592w).start();
                return;
            case 10:
                sj0 sj0Var = (sj0) this.f37100b;
                sj0Var.f36703j0 = (String) obj;
                x5 x5Var = sj0Var.f36712t0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 100L);
                return;
            case 11:
                ek0 ek0Var = (ek0) this.f37100b;
                ek0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ek0Var.r();
                    return;
                }
                return;
            case 12:
                pp0.b((pp0) this.f37100b, (Canvas) obj);
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((sp0) this.f37100b).f36740c.e();
                return;
            case 14:
                ((bi.p1) this.f37100b).D(((Integer) obj).intValue());
                return;
            case 15:
                vw0 vw0Var = (vw0) this.f37100b;
                vw0Var.f37641s = ((Integer) obj).intValue();
                View x12 = vw0Var.d.x1(4);
                if (x12 instanceof org.telegram.ui.Cells.f9) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) x12;
                    if (f9Var.getFixedSize() <= 0 && vw0Var.f37641s > 0) {
                        f9Var.setText(vw0Var.W());
                        vw0Var.V(true);
                        return;
                    }
                }
                vw0Var.d.Y2.N(true);
                vw0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37100b;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.m90[] m90VarArr = (org.telegram.ui.Components.m90[]) this.f37100b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = m90VarArr[0].animate();
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
                org.telegram.ui.Components.wr wrVar2 = org.telegram.ui.Components.wr.h;
                org.telegram.messenger.em.q(scaleY, wrVar2, 600L);
                ViewPropertyAnimator animate2 = m90VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(wrVar2).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ey0(18, (e31) this.f37100b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f37100b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f37100b, (TL_account.contentSettings) obj);
                return;
            case 21:
                ae1 ae1Var = (ae1) this.f37100b;
                ae1Var.getClass();
                ae1Var.f30953n1 = ((Float) obj).floatValue();
                ae1Var.f30976x0.invalidate();
                ae1Var.V0();
                return;
            case 22:
                ((bi.p1) this.f37100b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((zi1) this.f37100b).E(true);
                return;
        }
    }
}
