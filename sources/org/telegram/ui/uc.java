package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class uc implements org.telegram.ui.ActionBar.c6 {
    public final vc f43223a;

    public uc(vc vcVar) {
        this.f43223a = vcVar;
    }

    @Override
    public final ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.f23380v3;
    }

    @Override
    public final int C0(int i10) {
        vc vcVar = this.f43223a;
        int indexOfKey = vcVar.f43520n0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return vcVar.f43520n0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = vcVar.m0;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f43223a.f43529u0;
        }
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override
    public final boolean a() {
        return this.f43223a.F;
    }

    @Override
    public final int g1(int i10) {
        return C0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        vc vcVar = this.f43223a;
        Drawable drawable = vcVar.f43528t0;
        Drawable drawable2 = vcVar.f43527s0;
        if (str.equals("drawableMsgIn")) {
            return vcVar.f43521o0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return vcVar.f43522p0;
        }
        if (str.equals("drawableMsgOut")) {
            return vcVar.f43523q0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return vcVar.f43525r0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(C0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(C0(org.telegram.ui.ActionBar.g6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = vcVar.m0;
            if (c6Var != null) {
                return c6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.g6.O0(str);
        }
    }

    @Override
    public final int h0(int i10) {
        return C0(i10);
    }

    @Override
    public final void l(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
