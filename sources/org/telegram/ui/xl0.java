package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class xl0 extends Drawable {
    public static final int f52042j = 0;
    public float f52043a = org.telegram.messenger.g0.N(10.6665f);
    public final boolean f52044b;
    public Paint f52045c;
    public final Paint d;
    public final Paint f52046e;
    public final Paint f52047f;
    public final Path f52048g;
    public final Path h;
    public final org.telegram.ui.Components.e5 f52049i;

    public xl0(int i3, int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f52046e = paint2;
        Paint paint3 = new Paint(1);
        this.f52047f = paint3;
        this.f52048g = new Path();
        this.h = new Path();
        this.f52044b = i11 != i3;
        paint.setColor(i3);
        paint2.setColor(i10);
        paint3.setColor(i11);
        this.f52049i = null;
        d();
    }

    public static xl0 a(int i3, int i10) {
        org.telegram.messenger.wo woVar = null;
        if (i10 < 7) {
            int[] iArr = org.telegram.ui.ActionBar.k6.f28142r8;
            return new xl0(org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false), org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false));
        }
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(i3).f23099q4;
        if (xoVar != null) {
            woVar = xoVar.d(i10);
        }
        return b(woVar, false);
    }

    public static xl0 b(org.telegram.messenger.wo woVar, boolean z10) {
        int g7;
        int i3;
        if (woVar == null) {
            return new xl0(0, 0, 0);
        }
        int f10 = woVar.f();
        if (z10 && !woVar.o(org.telegram.ui.ActionBar.k6.I.q())) {
            g7 = woVar.f();
        } else {
            g7 = woVar.g();
        }
        if (z10) {
            i3 = woVar.f();
        } else {
            i3 = woVar.i();
        }
        return new xl0(f10, g7, i3);
    }

    public static xl0 c(int i3, int i10) {
        org.telegram.messenger.wo d;
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(i3).f23109r4;
        if (xoVar == null) {
            d = null;
        } else {
            d = xoVar.d(i10);
        }
        return b(d, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f10 = this.f52043a;
        path.addCircle(f10, f10, f10, Path.Direction.CW);
        Path path2 = this.f52048g;
        path2.rewind();
        path2.moveTo(this.f52043a * 2.0f, 0.0f);
        float f11 = this.f52043a;
        path2.lineTo(f11 * 2.0f, f11 * 2.0f);
        path2.lineTo(0.0f, this.f52043a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.f52043a, getBounds().centerY() - this.f52043a);
        Paint paint = this.f52045c;
        if (paint != null) {
            float f10 = this.f52043a;
            canvas.drawCircle(f10, f10, f10, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.f52048g, this.f52046e);
        if (this.f52044b) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.f52043a - org.telegram.messenger.g0.L(3.66f), this.f52043a - org.telegram.messenger.g0.L(3.66f), this.f52043a + org.telegram.messenger.g0.L(3.66f), this.f52043a + org.telegram.messenger.g0.L(3.66f));
            float f11 = this.f52043a;
            canvas.rotate(45.0f, f11, f11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), this.f52047f);
        }
        canvas.restore();
        org.telegram.ui.Components.e5 e5Var = this.f52049i;
        if (e5Var != null) {
            int L = org.telegram.messenger.g0.L(14.0f) / 2;
            e5Var.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            e5Var.draw(canvas);
        }
    }

    public final void e(View view) {
        org.telegram.ui.Components.e5 e5Var = this.f52049i;
        if (view == null) {
            if (e5Var != null) {
                e5Var.b();
                e5Var.l(null);
                return;
            }
            return;
        }
        if (e5Var != null) {
            e5Var.l(view);
        }
        view.addOnAttachStateChangeListener(new g5(this, 4));
    }

    public final void f(float f10, int i3) {
        if (this.f52045c == null) {
            Paint paint = new Paint(1);
            this.f52045c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.f52045c.setStrokeWidth(f10);
        this.f52045c.setColor(i3);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f52043a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f52043a * 2.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public xl0(int i3, int i10, int i11, long j10) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f52046e = paint2;
        Paint paint3 = new Paint(1);
        this.f52047f = paint3;
        this.f52048g = new Path();
        this.h = new Path();
        this.f52044b = i11 != i3;
        paint.setColor(i3);
        paint2.setColor(i10);
        paint3.setColor(i11);
        d();
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(14.0f), null);
        this.f52049i = e5Var;
        e5Var.j(j10, false);
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
