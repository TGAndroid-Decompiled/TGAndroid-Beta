package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class zc implements org.telegram.ui.ActionBar.d6 {
    public final ad f44671a;

    public zc(ad adVar) {
        this.f44671a = adVar;
    }

    @Override
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.f44671a.f36072y0;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public final boolean a() {
        return this.f44671a.J;
    }

    @Override
    public final int a1(int i10) {
        return x0(i10);
    }

    @Override
    public final int c0(int i10) {
        return x0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        ad adVar = this.f44671a;
        Drawable drawable = adVar.f36070x0;
        Drawable drawable2 = adVar.f36068w0;
        if (str.equals("drawableMsgIn")) {
            return adVar.f36063s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return adVar.f36064t0;
        }
        if (str.equals("drawableMsgOut")) {
            return adVar.f36065u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return adVar.f36066v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(x0(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(x0(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = adVar.f36059q0;
            if (d6Var != null) {
                return d6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.h6.P0(str);
        }
    }

    @Override
    public final boolean k0() {
        return false;
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f21151v3;
    }

    @Override
    public final int x0(int i10) {
        ad adVar = this.f44671a;
        int indexOfKey = adVar.f36061r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return adVar.f36061r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = adVar.f36059q0;
        if (d6Var != null) {
            return d6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override
    public final void I0(int i10, int i11) {
    }
}
