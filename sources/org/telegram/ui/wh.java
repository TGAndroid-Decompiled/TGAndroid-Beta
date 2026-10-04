package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class wh implements FlagSecureReason.FlagSecureCondition, hv0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final yn f42465a;

    public wh(yn ynVar) {
        this.f42465a = ynVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f11525a;
        int i11 = defaultWindowInsets.f11527c;
        yn ynVar = this.f42465a;
        if (ynVar.Ra != i10 || ynVar.Sa != i11) {
            ynVar.Ra = i10;
            ynVar.Sa = i11;
            ynVar.V0.requestLayout();
        }
        ynVar.v.i(l1Var);
        hh.f fVar = ynVar.I3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        ynVar.n7();
        ynVar.r7();
        ynVar.p9();
        boolean p5 = l1Var.f45609a.p(8);
        if (ynVar.Qa != p5) {
            ynVar.Qa = p5;
            ynVar.V0.S();
        }
        ci.i1 i1Var = ynVar.f43437o1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.f45608b;
    }

    @Override
    public void a(float[] fArr) {
        yn ynVar = this.f42465a;
        fArr[1] = ynVar.f43525v0.getBottom() - ynVar.f43573ya;
        fArr[0] = (ynVar.f43525v0.getTop() + ynVar.f43468q9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yn ynVar = this.f42465a;
        ynVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            ynVar.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public boolean run() {
        yn ynVar = this.f42465a;
        if (ynVar.h == null && !ynVar.x9()) {
            return false;
        }
        return true;
    }
}
