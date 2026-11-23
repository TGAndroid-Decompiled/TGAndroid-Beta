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
    public int f52040a;
    public final org.telegram.ui.ActionBar.h6 f52041b;
    public float f52042c;
    public boolean d;
    public int f52043e;
    public int f52044f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f52045n;
    public int f52046r;
    public int f52047s;
    public int f52048w;
    public int f52049x;
    public RadialGradient f52050y;

    public sl0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f52042c = 0.0f;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.h = new org.telegram.ui.Components.g5(this, 350L, nrVar);
        this.f52045n = new org.telegram.ui.Components.g5(this, 350L, nrVar);
        this.E = new Paint(1);
        this.f52041b = h6Var;
        this.f52040a = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, h6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z10) {
        org.telegram.messenger.dp dpVar;
        org.telegram.messenger.cp cpVar = null;
        if (i10 >= 0 && i7 >= 0 && (dpVar = org.telegram.messenger.np.u1(i7).f25938u4) != null) {
            cpVar = dpVar.d(i10);
        }
        c(cpVar, z10);
    }

    public final void c(org.telegram.messenger.cp cpVar, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.h6 h6Var = this.f52041b;
        if (cpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, h6Var);
            this.f52044f = w02;
            this.f52043e = w02;
        } else {
            if (h6Var != null) {
                q10 = h6Var.d();
            } else {
                q10 = org.telegram.ui.ActionBar.m6.I.q();
            }
            this.f52043e = cpVar.c(q10);
            this.f52044f = cpVar.d(q10);
        }
        if (!z10) {
            this.h.a(this.f52043e, true);
            this.f52045n.a(this.f52044f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.g5 g5Var = this.f52045n;
        org.telegram.ui.Components.g5 g5Var2 = this.h;
        if (z10 && (this.f52043e != (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, this.f52041b)) || this.f52044f != w02)) {
            this.f52044f = w02;
            this.f52043e = w02;
            g5Var2.a(w02, true);
            g5Var.a(w02, true);
        }
        int a10 = g5Var2.a(this.f52043e, false);
        int a11 = g5Var.a(this.f52044f, false);
        RadialGradient radialGradient = this.f52050y;
        Paint paint = this.E;
        if (radialGradient == null || this.f52046r != a10 || this.f52047s != a11 || this.f52048w != getWidth() || this.f52049x != getHeight()) {
            this.f52048w = getWidth();
            this.f52049x = getHeight();
            float f10 = this.f52048w;
            float f11 = f10 / 2.0f;
            float f12 = this.f52049x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f23982a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f52047s = a11;
            this.f52046r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f52050y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f52042c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.f52040a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i7 = 255;
        } else {
            i7 = (int) (this.f52042c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.m6.f29684v8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f52041b;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f52042c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f52042c, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29627s8, this.f52041b), i0.a.f(0.75f, this.h.f35384c, this.f52045n.f35384c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.m6.f29627s8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f52041b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29684v8, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        }
        org.telegram.ui.Components.g5 g5Var = this.h;
        int i10 = g5Var.f35384c;
        org.telegram.ui.Components.g5 g5Var2 = this.f52045n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, g5Var2.f35384c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29682v6, h6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, i0.a.f(0.75f, g5Var.f35384c, g5Var2.f35384c));
        }
        return i0.a.f(this.f52042c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.o10.C(230.0f, org.telegram.messenger.g0.f24004m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f52042c - f10) > 0.001f) {
            this.f52042c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
