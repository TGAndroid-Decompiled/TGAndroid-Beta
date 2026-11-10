package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class rl0 extends View {
    public final Paint D;
    public boolean E;
    public boolean F;
    public int f49433a;
    public final org.telegram.ui.ActionBar.h6 f49434b;
    public float f49435c;
    public boolean d;
    public int f49436e;
    public int f49437f;
    public final org.telegram.ui.Components.y4 h;
    public final org.telegram.ui.Components.y4 f49438n;
    public int f49439r;
    public int f49440s;
    public int f49441w;
    public int f49442x;
    public RadialGradient f49443y;

    public rl0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f49435c = 0.0f;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.h = new org.telegram.ui.Components.y4(this, 350L, wqVar);
        this.f49438n = new org.telegram.ui.Components.y4(this, 350L, wqVar);
        this.D = new Paint(1);
        this.f49434b = h6Var;
        this.f49433a = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28170s8, h6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z9) {
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp fpVar = null;
        if (i10 >= 0 && i7 >= 0 && (gpVar = org.telegram.messenger.qp.s1(i7).f24888r4) != null) {
            fpVar = gpVar.d(i10);
        }
        c(fpVar, z9);
    }

    public final void c(org.telegram.messenger.fp fpVar, boolean z9) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.h6 h6Var = this.f49434b;
        if (fpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28170s8, h6Var);
            this.f49437f = w02;
            this.f49436e = w02;
        } else {
            if (h6Var != null) {
                q10 = h6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.m6.I.q();
            }
            this.f49436e = fpVar.c(q10);
            this.f49437f = fpVar.d(q10);
        }
        if (!z9) {
            this.h.a(this.f49436e, true);
            this.f49438n.a(this.f49437f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z9 = this.d;
        org.telegram.ui.Components.y4 y4Var = this.f49438n;
        org.telegram.ui.Components.y4 y4Var2 = this.h;
        if (z9 && (this.f49436e != (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28170s8, this.f49434b)) || this.f49437f != w02)) {
            this.f49437f = w02;
            this.f49436e = w02;
            y4Var2.a(w02, true);
            y4Var.a(w02, true);
        }
        int a10 = y4Var2.a(this.f49436e, false);
        int a11 = y4Var.a(this.f49437f, false);
        RadialGradient radialGradient = this.f49443y;
        Paint paint = this.D;
        if (radialGradient == null || this.f49439r != a10 || this.f49440s != a11 || this.f49441w != getWidth() || this.f49442x != getHeight()) {
            this.f49441w = getWidth();
            this.f49442x = getHeight();
            float f10 = this.f49441w;
            float f11 = f10 / 2.0f;
            float f12 = this.f49442x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f22539a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f49440s = a11;
            this.f49439r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f49443y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f49435c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f49433a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i7 = 255;
        } else {
            i7 = (int) (this.f49435c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.m6.f28227v8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f49434b;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f49435c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f49435c, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28170s8, this.f49434b), i0.a.f(0.75f, this.h.f40490c, this.f49438n.f40490c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.m6.f28170s8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f49434b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28227v8, h6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        }
        org.telegram.ui.Components.y4 y4Var = this.h;
        int i10 = y4Var.f40490c;
        org.telegram.ui.Components.y4 y4Var2 = this.f49438n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, y4Var2.f40490c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28225v6, h6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.m6.b(0.08f, -0.08f, i0.a.f(0.75f, y4Var.f40490c, y4Var2.f40490c));
        }
        return i0.a.f(this.f49435c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.F) {
            i10 = org.telegram.messenger.camera.q.B(230.0f, org.telegram.messenger.g0.f22561m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f49435c - f10) > 0.001f) {
            this.f49435c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
