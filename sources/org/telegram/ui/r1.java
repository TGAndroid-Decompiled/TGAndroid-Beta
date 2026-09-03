package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class r1 implements org.telegram.ui.Components.b91 {
    public final w1 f37674a;

    public r1(w1 w1Var) {
        this.f37674a = w1Var;
    }

    @Override
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        w1 w1Var = this.f37674a;
        n4 n4Var = w1Var.f39241x;
        if (z4) {
            n4Var.O.addView(n4Var.N, k7.b6.c(-1.0f, -1));
            n4Var.O.setVisibility(0);
            n4Var.O.a(f10, i10);
            n4Var.B0 = w1Var.f39234b;
            n4Var.M.addView(view, k7.b6.c(-1.0f, -1));
            n4Var.M.setVisibility(0);
        } else {
            n4Var.O.removeView(n4Var.N);
            n4Var.B0 = null;
            n4Var.O.setVisibility(8);
            n4Var.M.setVisibility(4);
        }
        return n4Var.N;
    }

    @Override
    public final void c(float f10, int i10) {
        this.f37674a.f39241x.O.a(f10, i10);
    }

    @Override
    public final void d() {
        this.f37674a.f39233a.setVisibility(0);
        this.f37674a.f39234b.setVisibility(4);
        this.f37674a.f39234b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        w1 w1Var = this.f37674a;
        w1Var.f39233a.loadUrl(w1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.e91 e91Var, boolean z4) {
        n4 n4Var = this.f37674a.f39241x;
        if (z4) {
            org.telegram.ui.Components.e91 e91Var2 = n4Var.A0;
            if (e91Var2 != null && e91Var2 != e91Var) {
                e91Var2.f24530a.B();
                e91Var2.n();
                e91Var2.f24535c0.d(true, true);
            }
            n4Var.A0 = e91Var;
            try {
                n4Var.I.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (n4Var.A0 == e91Var) {
            n4Var.A0 = null;
        }
        try {
            n4Var.I.getWindow().clearFlags(128);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
        return null;
    }

    @Override
    public final ViewGroup g() {
        return null;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i(boolean z4, org.telegram.ui.Components.w81 w81Var, float f10, boolean z10) {
    }
}
