package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class yh implements FlagSecureReason.FlagSecureCondition, hv0, r0.n, yf.a0, org.telegram.ui.ActionBar.b2 {
    public final xn f40216a;

    public yh(xn xnVar) {
        this.f40216a = xnVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10579a;
        int i11 = defaultWindowInsets.f10581c;
        xn xnVar = this.f40216a;
        if (xnVar.Ta != i10 || xnVar.Ua != i11) {
            xnVar.Ta = i10;
            xnVar.Ua = i11;
            xnVar.X0.requestLayout();
        }
        xnVar.v.i(l1Var);
        hh.f fVar = xnVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        xnVar.n7();
        xnVar.r7();
        xnVar.p9();
        boolean p5 = l1Var.f42185a.p(8);
        if (xnVar.Sa != p5) {
            xnVar.Sa = p5;
            xnVar.X0.S();
        }
        ci.i1 i1Var = xnVar.f39887q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.f42184b;
    }

    @Override
    public void a(int i10) {
        xn.U0(this.f40216a, i10);
    }

    @Override
    public void b(float[] fArr) {
        xn xnVar = this.f40216a;
        fArr[1] = xnVar.f39977x0.getBottom() - xnVar.Aa;
        fArr[0] = (xnVar.f39977x0.getTop() + xnVar.f39922s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        xn xnVar = this.f40216a;
        xnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            xnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean run() {
        xn xnVar = this.f40216a;
        if (xnVar.h == null && !xnVar.y9()) {
            return false;
        }
        return true;
    }
}
