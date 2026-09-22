package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class zc implements org.telegram.ui.ActionBar.e6 {
    public final ad f40151a;

    public zc(ad adVar) {
        this.f40151a = adVar;
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f40151a.f31768y0;
        }
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override
    public final int G0(int i10) {
        ad adVar = this.f40151a;
        int indexOfKey = adVar.f31757r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return adVar.f31757r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = adVar.f31755q0;
        if (e6Var != null) {
            return e6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return this.f40151a.J;
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
        ad adVar = this.f40151a;
        Drawable drawable = adVar.f31766x0;
        Drawable drawable2 = adVar.f31764w0;
        if (str.equals("drawableMsgIn")) {
            return adVar.f31759s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return adVar.f31760t0;
        }
        if (str.equals("drawableMsgOut")) {
            return adVar.f31761u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return adVar.f31762v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.i6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = adVar.f31755q0;
            if (e6Var != null) {
                return e6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.i6.O0(str);
        }
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f19160v3;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
