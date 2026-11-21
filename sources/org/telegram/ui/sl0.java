package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class sl0 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int f52067a;
    public final org.telegram.ui.ActionBar.h6 f52068b;
    public float f52069c;
    public boolean d;
    public int f52070e;
    public int f52071f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f52072n;
    public int f52073r;
    public int f52074s;
    public int f52075w;
    public int f52076x;
    public RadialGradient f52077y;

    public sl0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f52069c = 0.0f;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.h = new org.telegram.ui.Components.g5(this, 350L, nrVar);
        this.f52072n = new org.telegram.ui.Components.g5(this, 350L, nrVar);
        this.E = new Paint(1);
        this.f52068b = h6Var;
        this.f52067a = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29658s8, h6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z10) {
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp bpVar = null;
        if (i10 >= 0 && i7 >= 0 && (cpVar = org.telegram.messenger.mp.u1(i7).f25803u4) != null) {
            bpVar = cpVar.d(i10);
        }
        c(bpVar, z10);
    }

    public final void c(org.telegram.messenger.bp bpVar, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.h6 h6Var = this.f52068b;
        if (bpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29658s8, h6Var);
            this.f52071f = w02;
            this.f52070e = w02;
        } else {
            if (h6Var != null) {
                q10 = h6Var.d();
            } else {
                q10 = org.telegram.ui.ActionBar.m6.I.q();
            }
            this.f52070e = bpVar.c(q10);
            this.f52071f = bpVar.d(q10);
        }
        if (!z10) {
            this.h.a(this.f52070e, true);
            this.f52072n.a(this.f52071f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.g5 g5Var = this.f52072n;
        org.telegram.ui.Components.g5 g5Var2 = this.h;
        if (z10 && (this.f52070e != (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29658s8, this.f52068b)) || this.f52071f != w02)) {
            this.f52071f = w02;
            this.f52070e = w02;
            g5Var2.a(w02, true);
            g5Var.a(w02, true);
        }
        int a10 = g5Var2.a(this.f52070e, false);
        int a11 = g5Var.a(this.f52071f, false);
        RadialGradient radialGradient = this.f52077y;
        Paint paint = this.E;
        if (radialGradient == null || this.f52073r != a10 || this.f52074s != a11 || this.f52075w != getWidth() || this.f52076x != getHeight()) {
            this.f52075w = getWidth();
            this.f52076x = getHeight();
            float f10 = this.f52075w;
            float f11 = f10 / 2.0f;
            float f12 = this.f52076x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f24118a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f52074s = a11;
            this.f52073r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f52077y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f52069c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.f52067a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i7 = 255;
        } else {
            i7 = (int) (this.f52069c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.m6.f29715v8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f52068b;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f52069c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f52069c, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29658s8, this.f52068b), i0.a.f(0.75f, this.h.f35403c, this.f52072n.f35403c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.m6.f29658s8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f52068b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29715v8, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        }
        org.telegram.ui.Components.g5 g5Var = this.h;
        int i10 = g5Var.f35403c;
        org.telegram.ui.Components.g5 g5Var2 = this.f52072n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, g5Var2.f35403c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29713v6, h6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, i0.a.f(0.75f, g5Var.f35403c, g5Var2.f35403c));
        }
        return i0.a.f(this.f52069c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.n10.C(230.0f, org.telegram.messenger.g0.f24140m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f52069c - f10) > 0.001f) {
            this.f52069c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
