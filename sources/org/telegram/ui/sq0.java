package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
public final class sq0 extends View {
    public final Paint f52132a;
    public final org.telegram.ui.Components.m6 f52133b;
    public final TextPaint f52134c;
    public StaticLayout d;
    public float f52135e;
    public float f52136f;
    public final org.telegram.ui.Components.m6 h;
    public String f52137n;
    public boolean f52138r;
    public final org.telegram.ui.Components.c6 f52139s;
    public boolean f52140w;
    public int f52141x;

    public sq0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f52132a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f52134c = textPaint;
        this.f52138r = false;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.f52139s = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f52133b = m6Var;
        m6Var.n(0.3f, 320L, krVar);
        m6Var.u(-1);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.setCallback(this);
        m6Var.t("0", true, true);
        Point point = org.telegram.messenger.g0.f24226q;
        m6Var.N = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        c();
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, true, true);
        this.h = m6Var2;
        m6Var2.n(0.3f, 320L, krVar);
        m6Var2.u(-1);
        m6Var2.w(org.telegram.messenger.g0.L(14.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.setCallback(this);
        m6Var2.t("0", true, true);
        m6Var2.N = point.x;
    }

    public final void a(int i7, int i10) {
        b(i7, i10, true);
    }

    public final void b(int i7, int i10, boolean z10) {
        int i11;
        boolean z11;
        boolean z12 = false;
        int max = Math.max(0, i7);
        int max2 = Math.max(max, i10);
        if (org.telegram.messenger.gd.E0().B != null && !TextUtils.equals(this.f52137n, org.telegram.messenger.gd.E0().B.f23445c)) {
            c();
        }
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = max2;
        } else {
            i11 = max;
        }
        String format = String.format("%d", Integer.valueOf(i11));
        if (z10 && !this.f52140w && !org.telegram.messenger.gd.f24314a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f52133b.t(format, z11, true);
        if (!org.telegram.messenger.gd.f24314a0) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.f52140w && !org.telegram.messenger.gd.f24314a0) {
            z12 = true;
        }
        this.h.t(format2, z12, true);
        this.f52140w = !z10;
    }

    public final void c() {
        this.f52137n = org.telegram.messenger.gd.E0().B.f23445c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.gd.N0(2131747635, null).replace("%1$d", "").replace("%2$d", ""), this.f52134c, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f52135e = this.d.getLineWidth(0);
            this.f52136f = this.d.getLineDescent(0);
            return;
        }
        this.f52135e = 0.0f;
        this.f52136f = 0.0f;
    }

    public final void d(boolean z10, boolean z11) {
        float f10;
        if (this.f52138r != z10) {
            this.f52138r = z10;
            if (!z10) {
                this.f52140w = true;
            }
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f52139s.e(true, f10);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f52138r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f52138r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f52139s.e(false, f10);
        if (e10 <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.m6 m6Var = this.f52133b;
        float c10 = m6Var.c() + this.f52135e;
        org.telegram.ui.Components.m6 m6Var2 = this.h;
        float c11 = m6Var2.c() + c10 + org.telegram.messenger.g0.L(18.0f);
        float f11 = ((1.0f - e10) * (-org.telegram.messenger.g0.L(8.0f))) + this.f52141x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c11) / 2.0f, org.telegram.messenger.g0.N(10.0f) + f11, (getWidth() + c11) / 2.0f, org.telegram.messenger.g0.N(33.0f) + f11);
        Paint paint = this.f52132a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + org.telegram.messenger.g0.L(9.0f), f11 + org.telegram.messenger.g0.L(9.5f));
        m6Var.setBounds(0, 0, (int) m6Var.c(), org.telegram.messenger.g0.L(23.0f));
        int i7 = (int) (e10 * 255.0f);
        m6Var.C = i7;
        m6Var.draw(canvas);
        canvas.translate(m6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f52135e)) / 2.0f, ((this.f52136f / 2.0f) + (org.telegram.messenger.g0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.f52134c.setAlpha(i7);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f52135e, 0.0f);
        m6Var2.setBounds(0, 0, (int) m6Var2.c(), org.telegram.messenger.g0.L(23.0f));
        m6Var2.C = i7;
        m6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f52141x = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
        this.f52133b.N = size;
        this.h.N = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.m10.C(43.0f, this.f52141x, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f52133b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
