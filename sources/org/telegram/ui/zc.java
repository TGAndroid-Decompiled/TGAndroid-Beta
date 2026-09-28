package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class zc implements org.telegram.ui.ActionBar.d6 {
    public final ad f40444a;

    public zc(ad adVar) {
        this.f40444a = adVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f40444a.f32133y0;
        }
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    @Override
    public final int G0(int i10) {
        ad adVar = this.f40444a;
        int indexOfKey = adVar.f32122r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return adVar.f32122r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = adVar.f32120q0;
        if (d6Var != null) {
            return d6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f40444a.J;
    }

    @Override
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        ad adVar = this.f40444a;
        Drawable drawable = adVar.f32131x0;
        Drawable drawable2 = adVar.f32129w0;
        if (str.equals("drawableMsgIn")) {
            return adVar.f32124s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return adVar.f32125t0;
        }
        if (str.equals("drawableMsgOut")) {
            return adVar.f32126u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return adVar.f32127v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = adVar.f32120q0;
            if (d6Var != null) {
                return d6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.h6.O0(str);
        }
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f19388v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
