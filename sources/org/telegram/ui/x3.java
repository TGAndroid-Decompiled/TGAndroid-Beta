package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x3 implements Utilities.Callback {
    public final int f44450a;
    public final Object f44451b;

    public x3(Object obj, int i10) {
        this.f44450a = i10;
        this.f44451b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.f44450a) {
            case 0:
                m4 m4Var = ((z3) this.f44451b).G;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m4Var.f40399k0 = z10;
                return;
            case 1:
                vc vcVar = (vc) this.f44451b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                vcVar.A = wallPaper;
                vcVar.B = wallPaper;
                vcVar.C = wallPaper;
                vcVar.X0(false);
                vcVar.a1(false);
                AndroidUtilities.runOnUIThread(new zb(vcVar, 1), 350L);
                return;
            case 2:
                ((cq) this.f44451b).f37192e.O = (String) obj;
                return;
            case 3:
                jr jrVar = ((fr) this.f44451b).d;
                jrVar.f39670w1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(jrVar.f39624c, jrVar.f39648n0);
                return;
            case 4:
                hs.U((hs) this.f44451b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((n10) this.f44451b).f40685e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((d50) this.f44451b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((ub0) this.f44451b).Y();
                return;
            case 8:
                of0 of0Var = (of0) this.f44451b;
                String str = (String) obj;
                of0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    of0Var.f41111b.setLoading(false);
                    return;
                }
                return;
            case 9:
                ki0 ki0Var = (ki0) this.f44451b;
                Integer num = (Integer) obj;
                ki0Var.getClass();
                if (num.intValue() - ki0Var.f39879e.d > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ki0Var.X = z11;
                if (z11) {
                    f9 = Math.min(ki0Var.Y, (ki0Var.B.getHeight() - num.intValue()) - ki0Var.Z.getMeasuredHeight());
                } else {
                    f9 = ki0Var.Y;
                }
                ki0Var.Z.animate().translationY(f9 - ki0Var.Z.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f23735w).start();
                return;
            case 10:
                zi0 zi0Var = (zi0) this.f44451b;
                zi0Var.f45242f0 = (String) obj;
                w5 w5Var = zi0Var.f45251p0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                return;
            case 11:
                kj0 kj0Var = (kj0) this.f44451b;
                kj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    kj0Var.r();
                    return;
                }
                return;
            case 12:
                Integer num2 = (Integer) obj;
                nh.g1 g1Var = ((yo0) this.f44451b).f44951y;
                if (g1Var != null) {
                    g1Var.D(num2.intValue());
                    return;
                }
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((ro0) this.f44451b).f42169c.e();
                return;
            case 14:
                ((nh.g1) this.f44451b).D(((Integer) obj).intValue());
                return;
            case 15:
                pv0 pv0Var = (pv0) this.f44451b;
                pv0Var.f41479s = ((Integer) obj).intValue();
                View y12 = pv0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) y12;
                    if (y8Var.getFixedSize() <= 0 && pv0Var.f41479s > 0) {
                        y8Var.setText(pv0Var.W());
                        pv0Var.V(true);
                        return;
                    }
                }
                pv0Var.d.U2.N(true);
                pv0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f44451b;
                ArrayList arrayList = privacySettingsActivity.L;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.y80[] y80VarArr = (org.telegram.ui.Components.y80[]) this.f44451b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = y80VarArr[0].animate();
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
                org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.h;
                b.q(scaleY, jrVar2, 600L);
                ViewPropertyAnimator animate2 = y80VarArr[1].animate();
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
                scaleX2.scaleY(f15).setInterpolator(jrVar2).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new av0(24, (v11) this.f44451b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f44451b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f44451b, (TL_account.contentSettings) obj);
                return;
            case 21:
                qc1 qc1Var = (qc1) this.f44451b;
                qc1Var.getClass();
                qc1Var.f41652j1 = ((Float) obj).floatValue();
                qc1Var.f41672t0.invalidate();
                qc1Var.V0();
                return;
            case 22:
                ((nh.g1) this.f44451b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((oh1) this.f44451b).E(true);
                return;
        }
    }
}
