package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class ym0 extends View {
    public final Paint D;
    public boolean E;
    public boolean F;
    public int f43685a;
    public final org.telegram.ui.ActionBar.p6 f43686b;
    public float f43687c;
    public boolean d;
    public int e;
    public int f43688f;
    public final org.telegram.ui.Components.w4 h;
    public final org.telegram.ui.Components.w4 f43689n;
    public int f43690r;
    public int f43691s;
    public int f43692w;
    public int f43693x;
    public RadialGradient f43694y;

    public ym0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f43687c = 0.0f;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.f43689n = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.D = new Paint(1);
        this.f43686b = p6Var;
        this.f43685a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, p6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z10) {
        org.telegram.messenger.mp mpVar;
        org.telegram.messenger.lp lpVar = null;
        if (i11 >= 0 && i10 >= 0 && (mpVar = org.telegram.messenger.wp.r1(i10).f19241s4) != null) {
            lpVar = mpVar.d(i11);
        }
        c(lpVar, z10);
    }

    public final void c(org.telegram.messenger.lp lpVar, boolean z10) {
        boolean q6;
        this.d = false;
        org.telegram.ui.ActionBar.p6 p6Var = this.f43686b;
        if (lpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, p6Var);
            this.f43688f = w02;
            this.e = w02;
        } else {
            if (p6Var != null) {
                q6 = p6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.t6.I.q();
            }
            this.e = lpVar.c(q6);
            this.f43688f = lpVar.d(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f43689n.a(this.f43688f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.w4 w4Var = this.f43689n;
        org.telegram.ui.Components.w4 w4Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, this.f43686b)) || this.f43688f != w02)) {
            this.f43688f = w02;
            this.e = w02;
            w4Var2.a(w02, true);
            w4Var.a(w02, true);
        }
        int a2 = w4Var2.a(this.e, false);
        int a10 = w4Var.a(this.f43688f, false);
        RadialGradient radialGradient = this.f43694y;
        Paint paint = this.D;
        if (radialGradient == null || this.f43690r != a2 || this.f43691s != a10 || this.f43692w != getWidth() || this.f43693x != getHeight()) {
            this.f43692w = getWidth();
            this.f43693x = getHeight();
            float f7 = this.f43692w;
            float f10 = f7 / 2.0f;
            float f11 = this.f43693x;
            float f12 = f11 * 0.4f;
            Typeface typeface = org.telegram.messenger.i0.f16145a;
            float f13 = f7 - 0.0f;
            float f14 = f11 - 0.0f;
            this.f43691s = a10;
            this.f43690r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f10, f12, ((float) Math.sqrt((f14 * f14) + (f13 * f13))) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f43694y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f43687c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f43685a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f43687c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.t6.f21262v8;
        org.telegram.ui.ActionBar.p6 p6Var = this.f43686b;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        } else {
            i10 = -1;
        }
        return i0.b.f(this.f43687c, w02, i10);
    }

    public int getColor() {
        return i0.b.f(this.f43687c, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, this.f43686b), i0.b.f(0.75f, this.h.f32068c, this.f43689n.f32068c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.t6.f21207s8;
        org.telegram.ui.ActionBar.p6 p6Var = this.f43686b;
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, p6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        }
        org.telegram.ui.Components.w4 w4Var = this.h;
        int i11 = w4Var.f32068c;
        org.telegram.ui.Components.w4 w4Var2 = this.f43689n;
        if (org.telegram.messenger.i0.B(i0.b.f(0.75f, i11, w4Var2.f32068c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, p6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, i0.b.f(0.75f, w4Var.f32068c, w4Var2.f32068c));
        }
        return i0.b.f(this.f43687c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.a30.B(230.0f, org.telegram.messenger.i0.f16166m, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f43687c - f7) > 0.001f) {
            this.f43687c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
