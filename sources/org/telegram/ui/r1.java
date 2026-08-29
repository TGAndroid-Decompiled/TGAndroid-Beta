package org.telegram.ui;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class r1 implements org.telegram.ui.Components.p81 {
    public final w1 f41840a;

    public r1(w1 w1Var) {
        this.f41840a = w1Var;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f9, int i10, boolean z11) {
        w1 w1Var = this.f41840a;
        m4 m4Var = w1Var.f43819x;
        if (z10) {
            m4Var.N.addView(m4Var.M, i7.f6.c(-1.0f, -1));
            m4Var.N.setVisibility(0);
            m4Var.N.a(f9, i10);
            m4Var.A0 = w1Var.f43811b;
            m4Var.L.addView(view, i7.f6.c(-1.0f, -1));
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
    public final void c(float f9, int i10) {
        this.f41840a.f43819x.N.a(f9, i10);
    }

    @Override
    public final void d() {
        this.f41840a.f43810a.setVisibility(0);
        this.f41840a.f43811b.setVisibility(4);
        this.f41840a.f43811b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
        w1 w1Var = this.f41840a;
        w1Var.f43810a.loadUrl(w1Var.v.url, hashMap);
    }

    @Override
    public final void e(org.telegram.ui.Components.s81 s81Var, boolean z10) {
        m4 m4Var = this.f41840a.f43819x;
        if (z10) {
            org.telegram.ui.Components.s81 s81Var2 = m4Var.f40413z0;
            if (s81Var2 != null && s81Var2 != s81Var) {
                s81Var2.f32569a.C();
                s81Var2.n();
                s81Var2.f32572b0.d(true, true);
            }
            m4Var.f40413z0 = s81Var;
            try {
                m4Var.H.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (m4Var.f40413z0 == s81Var) {
            m4Var.f40413z0 = null;
        }
        try {
            m4Var.H.getWindow().clearFlags(128);
        } catch (Exception e11) {
            FileLog.e(e11);
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
    public final void i(boolean z10, org.telegram.ui.Components.k81 k81Var, float f9, boolean z11) {
    }
}
