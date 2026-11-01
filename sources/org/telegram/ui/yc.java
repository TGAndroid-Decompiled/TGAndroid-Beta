package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class yc implements org.telegram.ui.ActionBar.p6 {
    public final zc f43636a;

    public yc(zc zcVar) {
        this.f43636a = zcVar;
    }

    @Override
    public final boolean a() {
        return this.f43636a.J;
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.t6.f21257v3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f43636a.f43922y0;
        }
        return org.telegram.ui.ActionBar.t6.V0(str);
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.uz.H0;
    }

    @Override
    public final int f(int i10) {
        return h(i10);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        zc zcVar = this.f43636a;
        Drawable drawable = zcVar.f43920x0;
        Drawable drawable2 = zcVar.f43918w0;
        if (str.equals("drawableMsgIn")) {
            return zcVar.f43913s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return zcVar.f43914t0;
        }
        if (str.equals("drawableMsgOut")) {
            return zcVar.f43915u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return zcVar.f43916v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.t6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.t6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = zcVar.f43909q0;
            if (p6Var != null) {
                return p6Var.getDrawable(str);
            }
            return org.telegram.ui.ActionBar.t6.R0(str);
        }
    }

    @Override
    public final int h(int i10) {
        zc zcVar = this.f43636a;
        int indexOfKey = zcVar.f43911r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return zcVar.f43911r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.p6 p6Var = zcVar.f43909q0;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.v0(i10);
    }

    @Override
    public final int j(int i10) {
        return h(i10);
    }

    @Override
    public final void i(int i10, int i11) {
    }
}
