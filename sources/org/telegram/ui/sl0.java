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
    public int f52020a;
    public final org.telegram.ui.ActionBar.i6 f52021b;
    public float f52022c;
    public boolean d;
    public int f52023e;
    public int f52024f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 f52025n;
    public int f52026r;
    public int f52027s;
    public int f52028w;
    public int f52029x;
    public RadialGradient f52030y;

    public sl0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f52022c = 0.0f;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        this.h = new org.telegram.ui.Components.f5(this, 350L, lrVar);
        this.f52025n = new org.telegram.ui.Components.f5(this, 350L, lrVar);
        this.E = new Paint(1);
        this.f52021b = i6Var;
        this.f52020a = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29676s8, i6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z10) {
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp bpVar = null;
        if (i10 >= 0 && i7 >= 0 && (cpVar = org.telegram.messenger.mp.u1(i7).f25777u4) != null) {
            bpVar = cpVar.d(i10);
        }
        c(bpVar, z10);
    }

    public final void c(org.telegram.messenger.bp bpVar, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.i6 i6Var = this.f52021b;
        if (bpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29676s8, i6Var);
            this.f52024f = w02;
            this.f52023e = w02;
        } else {
            if (i6Var != null) {
                q10 = i6Var.d();
            } else {
                q10 = org.telegram.ui.ActionBar.n6.I.q();
            }
            this.f52023e = bpVar.c(q10);
            this.f52024f = bpVar.d(q10);
        }
        if (!z10) {
            this.h.a(this.f52023e, true);
            this.f52025n.a(this.f52024f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.f5 f5Var = this.f52025n;
        org.telegram.ui.Components.f5 f5Var2 = this.h;
        if (z10 && (this.f52023e != (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29676s8, this.f52021b)) || this.f52024f != w02)) {
            this.f52024f = w02;
            this.f52023e = w02;
            f5Var2.a(w02, true);
            f5Var.a(w02, true);
        }
        int a10 = f5Var2.a(this.f52023e, false);
        int a11 = f5Var.a(this.f52024f, false);
        RadialGradient radialGradient = this.f52030y;
        Paint paint = this.E;
        if (radialGradient == null || this.f52026r != a10 || this.f52027s != a11 || this.f52028w != getWidth() || this.f52029x != getHeight()) {
            this.f52028w = getWidth();
            this.f52029x = getHeight();
            float f10 = this.f52028w;
            float f11 = f10 / 2.0f;
            float f12 = this.f52029x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f24093a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f52027s = a11;
            this.f52026r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f52030y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f52022c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.f52020a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i7 = 255;
        } else {
            i7 = (int) (this.f52022c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.n6.f29733v8;
        org.telegram.ui.ActionBar.i6 i6Var = this.f52021b;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f52022c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f52022c, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29676s8, this.f52021b), i0.a.f(0.75f, this.h.f34940c, this.f52025n.f34940c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.n6.f29676s8;
        org.telegram.ui.ActionBar.i6 i6Var = this.f52021b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29733v8, i6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        }
        org.telegram.ui.Components.f5 f5Var = this.h;
        int i10 = f5Var.f34940c;
        org.telegram.ui.Components.f5 f5Var2 = this.f52025n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, f5Var2.f34940c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731v6, i6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, i0.a.f(0.75f, f5Var.f34940c, f5Var2.f34940c));
        }
        return i0.a.f(this.f52022c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.n10.C(230.0f, org.telegram.messenger.g0.f24115m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f52022c - f10) > 0.001f) {
            this.f52022c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
