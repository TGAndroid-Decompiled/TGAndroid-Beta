package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w3 implements Utilities.Callback {
    public final int f43642a;
    public final Object f43643b;

    public w3(Object obj, int i9) {
        this.f43642a = i9;
        this.f43643b = obj;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        switch (this.f43642a) {
            case 0:
                l4 l4Var = ((y3) this.f43643b).G;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l4Var.f40021k0 = z10;
                return;
            case 1:
                xc xcVar = (xc) this.f43643b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                xcVar.A = wallPaper;
                xcVar.B = wallPaper;
                xcVar.C = wallPaper;
                xcVar.X0(false);
                xcVar.a1(false);
                AndroidUtilities.runOnUIThread(new ac(xcVar, 1), 350L);
                return;
            case 2:
                ((aq) this.f43643b).f36536e.O = (String) obj;
                return;
            case 3:
                jr jrVar = ((er) this.f43643b).d;
                jrVar.f39609w1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(jrVar.f39563c, jrVar.f39587n0);
                return;
            case 4:
                is.T((is) this.f43643b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((l10) this.f43643b).f39968e.Y(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((b50) this.f43643b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((sb0) this.f43643b).X();
                return;
            case 8:
                of0 of0Var = (of0) this.f43643b;
                String str = (String) obj;
                of0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    of0Var.f41140b.setLoading(false);
                    return;
                }
                return;
            case 9:
                li0 li0Var = (li0) this.f43643b;
                Integer num = (Integer) obj;
                li0Var.getClass();
                if (num.intValue() - li0Var.f40154e.d > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                li0Var.X = z11;
                if (z11) {
                    f10 = Math.min(li0Var.Y, (li0Var.B.getHeight() - num.intValue()) - li0Var.Z.getMeasuredHeight());
                } else {
                    f10 = li0Var.Y;
                }
                li0Var.Z.animate().translationY(f10 - li0Var.Z.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f23713w).start();
                return;
            case 10:
                bj0 bj0Var = (bj0) this.f43643b;
                bj0Var.f36884f0 = (String) obj;
                v5 v5Var = bj0Var.f36893p0;
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                AndroidUtilities.runOnUIThread(v5Var, 100L);
                return;
            case 11:
                nj0 nj0Var = (nj0) this.f43643b;
                nj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    nj0Var.r();
                    return;
                }
                return;
            case 12:
                Integer num2 = (Integer) obj;
                kh.j1 j1Var = ((zo0) this.f43643b).f45202y;
                if (j1Var != null) {
                    j1Var.D(num2.intValue());
                    return;
                }
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((so0) this.f43643b).f42740c.e();
                return;
            case 14:
                ((kh.j1) this.f43643b).D(((Integer) obj).intValue());
                return;
            case 15:
                pv0 pv0Var = (pv0) this.f43643b;
                pv0Var.f41604s = ((Integer) obj).intValue();
                View y12 = pv0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) y12;
                    if (b9Var.getFixedSize() <= 0 && pv0Var.f41604s > 0) {
                        b9Var.setText(pv0Var.V());
                        pv0Var.U(true);
                        return;
                    }
                }
                pv0Var.d.U2.N(true);
                pv0Var.U(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f43643b;
                ArrayList arrayList = privacySettingsActivity.L;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.z0(true);
                return;
            case 17:
                org.telegram.ui.Components.l80[] l80VarArr = (org.telegram.ui.Components.l80[]) this.f43643b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = l80VarArr[0].animate();
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
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.ll.r(scaleY, grVar, 600L);
                ViewPropertyAnimator animate2 = l80VarArr[1].animate();
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
                scaleX2.scaleY(f16).setInterpolator(grVar).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ys0(27, (u11) this.f43643b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.a0((StickersActivity) this.f43643b, (View) obj);
                return;
            case 20:
                ThemeActivity.T((ThemeActivity) this.f43643b, (TL_account.contentSettings) obj);
                return;
            case 21:
                oc1 oc1Var = (oc1) this.f43643b;
                oc1Var.getClass();
                oc1Var.f41085j1 = ((Float) obj).floatValue();
                oc1Var.f41105t0.invalidate();
                oc1Var.V0();
                return;
            case 22:
                ((kh.j1) this.f43643b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((mh1) this.f43643b).E(true);
                return;
        }
    }
}
