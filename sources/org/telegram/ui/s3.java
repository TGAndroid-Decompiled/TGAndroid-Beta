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
    public final int f37243a;
    public final Object f37244b;

    public s3(Object obj, int i10) {
        this.f37243a = i10;
        this.f37244b = obj;
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
        switch (this.f37243a) {
            case 0:
                h4 h4Var = ((u3) this.f37244b).K;
                if (((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.f34145o0 = z10;
                return;
            case 1:
                ad adVar = (ad) this.f37244b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                adVar.E = wallPaper;
                adVar.F = wallPaper;
                adVar.G = wallPaper;
                adVar.X0(false);
                adVar.a1(false);
                AndroidUtilities.runOnUIThread(new fc(adVar, 1), 350L);
                return;
            case 2:
                ((oq) this.f37244b).e.S = (String) obj;
                return;
            case 3:
                ur urVar = ((qr) this.f37244b).d;
                urVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(urVar.f38099c, urVar.f38131r0);
                return;
            case 4:
                ss.U((ss) this.f37244b, (TL_account.TL_birthday) obj);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((e20) this.f37244b).e.Z(true);
                return;
            case 6:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((v50) this.f37244b).c();
                return;
            case 7:
                Boolean bool2 = (Boolean) obj;
                ((nc0) this.f37244b).Y();
                return;
            case 8:
                fg0 fg0Var = (fg0) this.f37244b;
                String str = (String) obj;
                fg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    fg0Var.f33567b.setLoading(false);
                    return;
                }
                return;
            case 9:
                bj0 bj0Var = (bj0) this.f37244b;
                Integer num = (Integer) obj;
                bj0Var.getClass();
                if (num.intValue() - bj0Var.e.d > AndroidUtilities.dp(20.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bj0Var.f32178b0 = z11;
                if (z11) {
                    f7 = Math.min(bj0Var.f32180c0, (bj0Var.F.getHeight() - num.intValue()) - bj0Var.f32181d0.getMeasuredHeight());
                } else {
                    f7 = bj0Var.f32180c0;
                }
                bj0Var.f32181d0.animate().translationY(f7 - bj0Var.f32181d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f19480w).start();
                return;
            case 10:
                rj0 rj0Var = (rj0) this.f37244b;
                rj0Var.f37135j0 = (String) obj;
                w5 w5Var = rj0Var.f37144t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                return;
            case 11:
                ck0 ck0Var = (ck0) this.f37244b;
                ck0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ck0Var.r();
                    return;
                }
                return;
            case 12:
                pp0.b((pp0) this.f37244b, (Canvas) obj);
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                ((sp0) this.f37244b).f37425c.e();
                return;
            case 14:
                ((ci.i1) this.f37244b).D(((Integer) obj).intValue());
                return;
            case 15:
                tw0 tw0Var = (tw0) this.f37244b;
                tw0Var.f37799s = ((Integer) obj).intValue();
                View y12 = tw0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) y12;
                    if (e9Var.getFixedSize() <= 0 && tw0Var.f37799s > 0) {
                        e9Var.setText(tw0Var.W());
                        tw0Var.V(true);
                        return;
                    }
                }
                tw0Var.d.Y2.N(true);
                tw0Var.V(true);
                return;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37244b;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                return;
            case 17:
                org.telegram.ui.Components.c90[] c90VarArr = (org.telegram.ui.Components.c90[]) this.f37244b;
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
                AndroidUtilities.runOnUIThread(new iy0(15, (y21) this.f37244b, (TLRPC.TL_exportedContactToken) obj));
                return;
            case 19:
                StickersActivity.b0((StickersActivity) this.f37244b, (View) obj);
                return;
            case 20:
                ThemeActivity.X((ThemeActivity) this.f37244b, (TL_account.contentSettings) obj);
                return;
            case 21:
                vd1 vd1Var = (vd1) this.f37244b;
                vd1Var.getClass();
                vd1Var.f38552n1 = ((Float) obj).floatValue();
                vd1Var.f38575x0.invalidate();
                vd1Var.V0();
                return;
            case 22:
                ((ci.i1) this.f37244b).D(((Integer) obj).intValue());
                return;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((ti1) this.f37244b).E(true);
                return;
        }
    }
}
