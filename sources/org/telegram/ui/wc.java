package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class wc implements org.telegram.ui.ActionBar.c6 {

    public final xc f43700a;

    public wc(xc xcVar) {
        this.f43700a = xcVar;
    }

    @Override
    public final ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.f23371v3;
    }

    @Override
    public final Paint N(String str) {
        return str.equals("paintDivider") ? this.f43700a.f44407u0 : org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override
    public final int N0(int i10) {
        xc xcVar = this.f43700a;
        int iIndexOfKey = xcVar.f44398n0.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            return xcVar.f44398n0.valueAt(iIndexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = xcVar.m0;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f43700a.F;
    }

    @Override
    public final Drawable getDrawable(String str) {
        xc xcVar = this.f43700a;
        Drawable drawable = xcVar.f44406t0;
        Drawable drawable2 = xcVar.f44405s0;
        if (str.equals("drawableMsgIn")) {
            return xcVar.f44399o0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return xcVar.f44400p0;
        }
        if (str.equals("drawableMsgOut")) {
            return xcVar.f44401q0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return xcVar.f44403r0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(N0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(N0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.c6 c6Var = xcVar.m0;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override
    public final void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override
    public final int o1(int i10) {
        return N0(i10);
    }

    @Override
    public final int q0(int i10) {
        return N0(i10);
    }

    @Override
    public final boolean u0() {
        return false;
    }

    @Override
    public final void c1(int i10, int i11) {
    }
}
