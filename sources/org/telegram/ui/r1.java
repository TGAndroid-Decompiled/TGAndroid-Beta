package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class r1 implements org.telegram.ui.Components.f81 {

    public final w1 f41779a;

    public r1(w1 w1Var) {
        this.f41779a = w1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i10, boolean z11) {
        w1 w1Var = this.f41779a;
        m4 m4Var = w1Var.f43570x;
        if (z10) {
            m4Var.N.addView(m4Var.M, h7.z5.c(-1.0f, -1));
            m4Var.N.setVisibility(0);
            m4Var.N.a(f10, i10);
            m4Var.A0 = w1Var.f43562b;
            m4Var.L.addView(view, h7.z5.c(-1.0f, -1));
            m4Var.L.setVisibility(0);
        } else {
            m4Var.N.removeView(m4Var.M);
            m4Var.A0 = null;
            m4Var.N.setVisibility(8);
            m4Var.L.setVisibility(4);
        }
        return m4Var.M;
    }

    @Override
    public final void c(float f10, int i10) {
        this.f41779a.f43570x.N.a(f10, i10);
    }

    @Override
    public final void d() {
        this.f41779a.f43561a.setVisibility(0);
        this.f41779a.f43562b.setVisibility(4);
        this.f41779a.f43562b.g(null, null, null, null, false);
        HashMap map = new HashMap();
        map.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        w1 w1Var = this.f41779a;
        w1Var.f43561a.loadUrl(w1Var.v.url, map);
    }

    @Override
    public final void e(org.telegram.ui.Components.i81 i81Var, boolean z10) {
        m4 m4Var = this.f41779a.f43570x;
        if (!z10) {
            if (m4Var.f40356z0 == i81Var) {
                m4Var.f40356z0 = null;
            }
            try {
                m4Var.H.getWindow().clearFlags(128);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        org.telegram.ui.Components.i81 i81Var2 = m4Var.f40356z0;
        if (i81Var2 != null && i81Var2 != i81Var) {
            i81Var2.f29295a.C();
            i81Var2.n();
            i81Var2.f29298b0.d(true, true);
        }
        m4Var.f40356z0 = i81Var;
        try {
            m4Var.H.getWindow().addFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
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
    public final void i(boolean z10, org.telegram.ui.Components.a81 a81Var, float f10, boolean z11) {
    }
}
