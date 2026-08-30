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
    public final int f39320a;
    public final Object f39321b;

    public w3(Object obj, int i10) {
        this.f39320a = i10;
        this.f39321b = obj;
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
        switch (this.f39320a) {
            case 0:
                l4 l4Var = ((y3) this.f39321b).H;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                l4Var.f35940l0 = z4;
                return;
            case 1:
                bd bdVar = (bd) this.f39321b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bdVar.B = wallPaper;
                bdVar.C = wallPaper;
                bdVar.D = wallPaper;
                bdVar.X0(false);
                bdVar.a1(false);
                AndroidUtilities.runOnUIThread(new ec(bdVar, 1), 350L);
                return;
            case 2:
                ((iq) this.f39321b).e.P = (String) obj;
                return;
            case 3:
                pr prVar = ((lr) this.f39321b).d;
                prVar.f37498x1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(prVar.f37450c, prVar.f37475o0);
                return;
            case 4:
                ns.U((ns) this.f39321b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((z10) this.f39321b).e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((p50) this.f39321b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((ec0) this.f39321b).Y();
                return;
            case 8:
                wf0 wf0Var = (wf0) this.f39321b;
                String str = (String) obj;
                wf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    wf0Var.f39726b.setLoading(false);
                    return;
                }
                return;
            case 9:
                si0 si0Var = (si0) this.f39321b;
                Integer num = (Integer) obj;
                si0Var.getClass();
                if (num.intValue() - si0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                si0Var.Y = z10;
                if (z10) {
                    f10 = Math.min(si0Var.Z, (si0Var.C.getHeight() - num.intValue()) - si0Var.f38351a0.getMeasuredHeight());
                } else {
                    f10 = si0Var.Z;
                }
                si0Var.f38351a0.animate().translationY(f10 - si0Var.f38351a0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f20543w).start();
                return;
            case 10:
                hj0 hj0Var = (hj0) this.f39321b;
                hj0Var.f34897g0 = (String) obj;
                z5 z5Var = hj0Var.f34906q0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 100L);
                return;
            case 11:
                sj0 sj0Var = (sj0) this.f39321b;
                sj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    sj0Var.r();
                    return;
                }
                return;
            case 12:
                Integer num2 = (Integer) obj;
                ek ekVar = ((gp0) this.f39321b).f34662y;
                if (ekVar != null) {
                    ekVar.D(num2.intValue());
                    return;
                }
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((zo0) this.f39321b).f40846c.e();
                return;
            case 14:
                ((ek) this.f39321b).D(((Integer) obj).intValue());
                return;
            case 15:
                yv0 yv0Var = (yv0) this.f39321b;
                yv0Var.f40590s = ((Integer) obj).intValue();
                View y12 = yv0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.a9) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) y12;
                    if (a9Var.getFixedSize() <= 0 && yv0Var.f40590s > 0) {
                        a9Var.setText(yv0Var.W());
                        yv0Var.V(true);
                        return;
                    }
                }
                yv0Var.d.V2.N(true);
                yv0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f39321b;
                ArrayList arrayList = privacySettingsActivity.M;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.e90[] e90VarArr = (org.telegram.ui.Components.e90[]) this.f39321b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = e90VarArr[0].animate();
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
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                b.p(scaleY, nrVar, 600L);
                ViewPropertyAnimator animate2 = e90VarArr[1].animate();
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
                scaleX2.scaleY(f16).setInterpolator(nrVar).setDuration(600L).start();
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new l01(3, (h21) this.f39321b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f39321b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f39321b, (TL_account.contentSettings) obj);
                return;
            case 21:
                cd1 cd1Var = (cd1) this.f39321b;
                cd1Var.getClass();
                cd1Var.f33318k1 = ((Float) obj).floatValue();
                cd1Var.f33338u0.invalidate();
                cd1Var.V0();
                return;
            case 22:
                ((ek) this.f39321b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ai1) this.f39321b).E(true);
                return;
        }
    }
}
