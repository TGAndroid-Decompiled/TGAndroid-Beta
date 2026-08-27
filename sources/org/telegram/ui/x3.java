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

    public final int f44269a;

    public final Object f44270b;

    public x3(Object obj, int i10) {
        this.f44269a = i10;
        this.f44270b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44269a) {
            case 0:
                ((z3) this.f44270b).G.f40342k0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                xc xcVar = (xc) this.f44270b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                xcVar.A = wallPaper;
                xcVar.B = wallPaper;
                xcVar.C = wallPaper;
                xcVar.X0(false);
                xcVar.a1(false);
                AndroidUtilities.runOnUIThread(new bc(xcVar, 1), 350L);
                break;
            case 2:
                ((cq) this.f44270b).f37130e.O = (String) obj;
                break;
            case 3:
                lr lrVar = ((hr) this.f44270b).d;
                lrVar.f40231w1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(lrVar.f40185c, lrVar.f40209n0);
                break;
            case 4:
                js.U((js) this.f44270b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((o10) this.f44270b).f40974e.Z(true);
                break;
            case 6:
                ((e50) this.f44270b).c();
                break;
            case 7:
                ((xb0) this.f44270b).Y();
                break;
            case 8:
                rf0 rf0Var = (rf0) this.f44270b;
                String str = (String) obj;
                rf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    rf0Var.f41919b.setLoading(false);
                }
                break;
            case 9:
                ni0 ni0Var = (ni0) this.f44270b;
                Integer num = (Integer) obj;
                ni0Var.getClass();
                boolean z10 = num.intValue() - ni0Var.f40847e.d > AndroidUtilities.dp(20.0f);
                ni0Var.X = z10;
                ni0Var.Z.animate().translationY((z10 ? Math.min(ni0Var.Y, (ni0Var.B.getHeight() - num.intValue()) - ni0Var.Z.getMeasuredHeight()) : ni0Var.Y) - ni0Var.Z.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f23706w).start();
                break;
            case 10:
                dj0 dj0Var = (dj0) this.f44270b;
                dj0Var.f37422f0 = (String) obj;
                w5 w5Var = dj0Var.f37431p0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 11:
                oj0 oj0Var = (oj0) this.f44270b;
                oj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    oj0Var.s();
                }
                break;
            case 12:
                Integer num2 = (Integer) obj;
                lh.h1 h1Var = ((ap0) this.f44270b).f36595y;
                if (h1Var != null) {
                    h1Var.D(num2.intValue());
                }
                break;
            case 13:
                ((to0) this.f44270b).f42987c.e();
                break;
            case 14:
                ((lh.h1) this.f44270b).D(((Integer) obj).intValue());
                break;
            case 15:
                qv0 qv0Var = (qv0) this.f44270b;
                qv0Var.f41757s = ((Integer) obj).intValue();
                View viewY1 = qv0Var.d.y1(4);
                if (viewY1 instanceof org.telegram.ui.Cells.x8) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) viewY1;
                    if (x8Var.getFixedSize() > 0 || qv0Var.f41757s <= 0) {
                        qv0Var.d.U2.N(true);
                    } else {
                        x8Var.setText(qv0Var.W());
                    }
                } else {
                    qv0Var.d.U2.N(true);
                }
                qv0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f44270b;
                ArrayList arrayList = privacySettingsActivity.L;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.p80[] p80VarArr = (org.telegram.ui.Components.p80[]) this.f44270b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator viewPropertyAnimatorScaleY = p80VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.rl.o(viewPropertyAnimatorScaleY, erVar, 600L);
                p80VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(erVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new zs0(27, (t11) this.f44270b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.f44270b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.f44270b, (TL_account.contentSettings) obj);
                break;
            case 21:
                nc1 nc1Var = (nc1) this.f44270b;
                nc1Var.getClass();
                nc1Var.f40764j1 = ((Float) obj).floatValue();
                nc1Var.f40784t0.invalidate();
                nc1Var.V0();
                break;
            case 22:
                ((lh.h1) this.f44270b).D(((Integer) obj).intValue());
                break;
            default:
                ((lh1) this.f44270b).E(true);
                break;
        }
    }
}
