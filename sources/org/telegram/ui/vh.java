package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class vh implements FlagSecureReason.FlagSecureCondition, ev0, r0.n, yf.a0, org.telegram.ui.ActionBar.z1 {
    public final wn f38719a;

    public vh(wn wnVar) {
        this.f38719a = wnVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10576a;
        int i11 = defaultWindowInsets.f10578c;
        wn wnVar = this.f38719a;
        if (wnVar.Ta != i10 || wnVar.Ua != i11) {
            wnVar.Ta = i10;
            wnVar.Ua = i11;
            wnVar.X0.requestLayout();
        }
        wnVar.v.i(l1Var);
        hh.f fVar = wnVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        wnVar.n7();
        wnVar.r7();
        wnVar.p9();
        boolean p5 = l1Var.f42140a.p(8);
        if (wnVar.Sa != p5) {
            wnVar.Sa = p5;
            wnVar.X0.S();
        }
        ci.i1 i1Var = wnVar.f39605q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.f42139b;
    }

    @Override
    public void a(int i10) {
        wn.U0(this.f38719a, i10);
    }

    @Override
    public void b(float[] fArr) {
        wn wnVar = this.f38719a;
        fArr[1] = wnVar.f39695x0.getBottom() - wnVar.Aa;
        fArr[0] = (wnVar.f39695x0.getTop() + wnVar.f39640s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        wn wnVar = this.f38719a;
        wnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            wnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean run() {
        wn wnVar = this.f38719a;
        if (wnVar.h == null && !wnVar.y9()) {
            return false;
        }
        return true;
    }
}
