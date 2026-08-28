package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class wc implements org.telegram.ui.ActionBar.b6 {
    public final xc f43726a;

    public wc(xc xcVar) {
        this.f43726a = xcVar;
    }

    @Override
    public final ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.f23317v3;
    }

    @Override
    public final int N0(int i9) {
        xc xcVar = this.f43726a;
        int indexOfKey = xcVar.f44478n0.indexOfKey(i9);
        if (indexOfKey >= 0) {
            return xcVar.f44478n0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.b6 b6Var = xcVar.m0;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override
    public final Paint O(String str) {
        if (str.equals("paintDivider")) {
            return this.f43726a.f44487u0;
        }
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override
    public final boolean a() {
        return this.f43726a.F;
    }

    @Override
    public final Drawable getDrawable(String str) {
        xc xcVar = this.f43726a;
        Drawable drawable = xcVar.f44486t0;
        Drawable drawable2 = xcVar.f44485s0;
        if (str.equals("drawableMsgIn")) {
            return xcVar.f44479o0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return xcVar.f44480p0;
        }
        if (str.equals("drawableMsgOut")) {
            return xcVar.f44481q0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return xcVar.f44483r0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(N0(org.telegram.ui.ActionBar.f6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(N0(org.telegram.ui.ActionBar.f6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = xcVar.m0;
            if (b6Var != null) {
                return b6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.f6.O0(str);
        }
    }

    @Override
    public final void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override
    public final int p0(int i9) {
        return N0(i9);
    }

    @Override
    public final int q1(int i9) {
        return N0(i9);
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void c1(int i9, int i10) {
    }
}
