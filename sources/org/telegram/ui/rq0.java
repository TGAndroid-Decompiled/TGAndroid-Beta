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
public final class rq0 extends View {
    public final Paint f49551a;
    public final org.telegram.ui.Components.i6 f49552b;
    public final TextPaint f49553c;
    public StaticLayout d;
    public float f49554e;
    public float f49555f;
    public final org.telegram.ui.Components.i6 h;
    public String f49556n;
    public boolean f49557r;
    public final org.telegram.ui.Components.w5 f49558s;
    public boolean f49559w;
    public int f49560x;

    public rq0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f49551a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f49553c = textPaint;
        this.f49557r = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f49558s = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f49552b = i6Var;
        i6Var.n(0.3f, 320L, xqVar);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.setCallback(this);
        i6Var.t("0", true, true);
        Point point = org.telegram.messenger.g0.f22537q;
        i6Var.M = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        c();
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true);
        this.h = i6Var2;
        i6Var2.n(0.3f, 320L, xqVar);
        i6Var2.u(-1);
        i6Var2.w(org.telegram.messenger.g0.L(14.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var2.setCallback(this);
        i6Var2.t("0", true, true);
        i6Var2.M = point.x;
    }

    public final void a(int i7, int i10) {
        b(i7, i10, true);
    }

    public final void b(int i7, int i10, boolean z9) {
        int i11;
        boolean z10;
        boolean z11 = false;
        int max = Math.max(0, i7);
        int max2 = Math.max(max, i10);
        if (org.telegram.messenger.hd.E0().B != null && !TextUtils.equals(this.f49556n, org.telegram.messenger.hd.E0().B.f22176c)) {
            c();
        }
        if (org.telegram.messenger.hd.f22871a0) {
            i11 = max2;
        } else {
            i11 = max;
        }
        String format = String.format("%d", Integer.valueOf(i11));
        if (z9 && !this.f49559w && !org.telegram.messenger.hd.f22871a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49552b.t(format, z10, true);
        if (!org.telegram.messenger.hd.f22871a0) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z9 && !this.f49559w && !org.telegram.messenger.hd.f22871a0) {
            z11 = true;
        }
        this.h.t(format2, z11, true);
        this.f49559w = !z9;
    }

    public final void c() {
        this.f49556n = org.telegram.messenger.hd.E0().B.f22176c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.hd.M0(2131747828, null).replace("%1$d", "").replace("%2$d", ""), this.f49553c, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f49554e = this.d.getLineWidth(0);
            this.f49555f = this.d.getLineDescent(0);
            return;
        }
        this.f49554e = 0.0f;
        this.f49555f = 0.0f;
    }

    public final void d(boolean z9, boolean z10) {
        float f10;
        if (this.f49557r != z9) {
            this.f49557r = z9;
            if (!z9) {
                this.f49559w = true;
            }
            if (!z10) {
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f49558s.e(true, f10);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f49557r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f49557r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f49558s.e(false, f10);
        if (e10 <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.i6 i6Var = this.f49552b;
        float c10 = i6Var.c() + this.f49554e;
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        float c11 = i6Var2.c() + c10 + org.telegram.messenger.g0.L(18.0f);
        float f11 = ((1.0f - e10) * (-org.telegram.messenger.g0.L(8.0f))) + this.f49560x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c11) / 2.0f, org.telegram.messenger.g0.N(10.0f) + f11, (getWidth() + c11) / 2.0f, org.telegram.messenger.g0.N(33.0f) + f11);
        Paint paint = this.f49551a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + org.telegram.messenger.g0.L(9.0f), f11 + org.telegram.messenger.g0.L(9.5f));
        i6Var.setBounds(0, 0, (int) i6Var.c(), org.telegram.messenger.g0.L(23.0f));
        int i7 = (int) (e10 * 255.0f);
        i6Var.B = i7;
        i6Var.draw(canvas);
        canvas.translate(i6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f49554e)) / 2.0f, ((this.f49555f / 2.0f) + (org.telegram.messenger.g0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.f49553c.setAlpha(i7);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f49554e, 0.0f);
        i6Var2.setBounds(0, 0, (int) i6Var2.c(), org.telegram.messenger.g0.L(23.0f));
        i6Var2.B = i7;
        i6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f49560x = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22531m;
        this.f49552b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.camera.q.B(43.0f, this.f49560x, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f49552b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
