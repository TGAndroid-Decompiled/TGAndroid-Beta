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
    public final int f37189a;
    public final Object f37190b;

    public s3(Object obj, int i10) {
        this.f37189a = i10;
        this.f37190b = obj;
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
        switch (this.f37189a) {
            case 0:
                h4 h4Var = ((u3) this.f37190b).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.f34068o0 = z10;
                return;
            case 1:
                bd bdVar = (bd) this.f37190b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bdVar.E = wallPaper;
                bdVar.F = wallPaper;
                bdVar.G = wallPaper;
                bdVar.X0(false);
                bdVar.a1(false);
                AndroidUtilities.runOnUIThread(new gc(bdVar, 1), 350L);
                return;
            case 2:
                ((mq) this.f37190b).e.S = (String) obj;
                return;
            case 3:
                sr srVar = ((or) this.f37190b).d;
                srVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(srVar.f37398c, srVar.f37430r0);
                return;
            case 4:
                ss.U((ss) this.f37190b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((e20) this.f37190b).e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((v50) this.f37190b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((oc0) this.f37190b).Y();
                return;
            case 8:
                gg0 gg0Var = (gg0) this.f37190b;
                String str = (String) obj;
                gg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    gg0Var.f33837b.setLoading(false);
                    return;
                }
                return;
            case 9:
                cj0 cj0Var = (cj0) this.f37190b;
                Integer num = (Integer) obj;
                cj0Var.getClass();
                if (num.intValue() - cj0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cj0Var.f32674b0 = z11;
                if (z11) {
                    f7 = Math.min(cj0Var.f32676c0, (cj0Var.F.getHeight() - num.intValue()) - cj0Var.f32677d0.getMeasuredHeight());
                } else {
                    f7 = cj0Var.f32676c0;
                }
                cj0Var.f32677d0.animate().translationY(f7 - cj0Var.f32677d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f19667w).start();
                return;
            case 10:
                sj0 sj0Var = (sj0) this.f37190b;
                sj0Var.f37354j0 = (String) obj;
                w5 w5Var = sj0Var.f37363t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                return;
            case 11:
                ek0 ek0Var = (ek0) this.f37190b;
                ek0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ek0Var.r();
                    return;
                }
                return;
            case 12:
                rp0.b((rp0) this.f37190b, (Canvas) obj);
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((up0) this.f37190b).f38082c.e();
                return;
            case 14:
                ((ci.i1) this.f37190b).E(((Integer) obj).intValue());
                return;
            case 15:
                tw0 tw0Var = (tw0) this.f37190b;
                tw0Var.f37822s = ((Integer) obj).intValue();
                View z12 = tw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && tw0Var.f37822s > 0) {
                        e9Var.setText(tw0Var.W());
                        tw0Var.V(true);
                        return;
                    }
                }
                tw0Var.d.Y2.N(true);
                tw0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37190b;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.l90[] l90VarArr = (org.telegram.ui.Components.l90[]) this.f37190b;
                Boolean bool4 = (Boolean) obj;
                ViewPropertyAnimator animate = l90VarArr[0].animate();
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
                org.telegram.messenger.wh.r(scaleY, qrVar, 600L);
                ViewPropertyAnimator animate2 = l90VarArr[1].animate();
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
                AndroidUtilities.runOnUIThread(new cy0(19, (y21) this.f37190b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f37190b, (View) obj);
                return;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f37190b, (TL_account.contentSettings) obj);
                return;
            case 21:
                vd1 vd1Var = (vd1) this.f37190b;
                vd1Var.getClass();
                vd1Var.f38506n1 = ((Float) obj).floatValue();
                vd1Var.f38529x0.invalidate();
                vd1Var.V0();
                return;
            case 22:
                ((ci.i1) this.f37190b).E(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((si1) this.f37190b).E(true);
                return;
        }
    }
}
