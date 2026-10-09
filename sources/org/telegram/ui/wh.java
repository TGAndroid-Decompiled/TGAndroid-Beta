package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class wh implements FlagSecureReason.FlagSecureCondition, nv0, r0.n, yf.a0, org.telegram.ui.ActionBar.a2 {
    public final zn f43603a;

    public wh(zn znVar) {
        this.f43603a = znVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        zn znVar = this.f43603a;
        r0.k1 z82 = znVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.f11576a;
        int i11 = defaultWindowInsets.f11578c;
        if (znVar.Ua != i10 || znVar.Va != i11) {
            znVar.Ua = i10;
            znVar.Va = i11;
            znVar.X0.requestLayout();
        }
        znVar.v.k(z82);
        ai.f0 f0Var = znVar.K3;
        if (f0Var != null) {
            f0Var.setPadding(i10, 0, i11, 0);
        }
        znVar.q7();
        znVar.u7();
        znVar.u9();
        boolean p5 = z82.f46775a.p(8);
        if (znVar.Ta != p5) {
            znVar.Ta = p5;
            znVar.X0.S();
        }
        ci.h1 h1Var = znVar.f44897q1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.f46774b;
    }

    @Override
    public void a(int i10) {
        zn.X0(this.f43603a, i10);
    }

    @Override
    public void b(float[] fArr) {
        zn znVar = this.f43603a;
        fArr[1] = znVar.f44988x0.getBottom() - znVar.Ba;
        fArr[0] = (znVar.f44988x0.getTop() + znVar.f44932s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zn znVar = this.f43603a;
        znVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            znVar.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public boolean run() {
        zn znVar = this.f43603a;
        if (znVar.h == null && !znVar.D9()) {
            return false;
        }
        return true;
    }
}
