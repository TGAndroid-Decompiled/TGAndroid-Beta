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
public final class qq0 extends View {
    public final Paint f50769a;
    public final org.telegram.ui.Components.g6 f50770b;
    public final TextPaint f50771c;
    public StaticLayout d;
    public float f50772e;
    public float f50773f;
    public final org.telegram.ui.Components.g6 h;
    public String f50774n;
    public boolean f50775r;
    public final org.telegram.ui.Components.u5 f50776s;
    public boolean f50777w;
    public int f50778x;

    public qq0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f50769a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f50771c = textPaint;
        this.f50775r = false;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f50776s = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f50770b = g6Var;
        g6Var.n(0.3f, 320L, erVar);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.setCallback(this);
        g6Var.t("0", true, true);
        Point point = org.telegram.messenger.g0.f23609q;
        g6Var.N = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        c();
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, true);
        this.h = g6Var2;
        g6Var2.n(0.3f, 320L, erVar);
        g6Var2.u(-1);
        g6Var2.w(org.telegram.messenger.g0.L(14.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.setCallback(this);
        g6Var2.t("0", true, true);
        g6Var2.N = point.x;
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
        if (org.telegram.messenger.hd.E0().B != null && !TextUtils.equals(this.f50774n, org.telegram.messenger.hd.E0().B.f23060c)) {
            c();
        }
        if (org.telegram.messenger.hd.f24101a0) {
            i11 = max2;
        } else {
            i11 = max;
        }
        String format = String.format("%d", Integer.valueOf(i11));
        if (z10 && !this.f50777w && !org.telegram.messenger.hd.f24101a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f50770b.t(format, z11, true);
        if (!org.telegram.messenger.hd.f24101a0) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.f50777w && !org.telegram.messenger.hd.f24101a0) {
            z12 = true;
        }
        this.h.t(format2, z12, true);
        this.f50777w = !z10;
    }

    public final void c() {
        this.f50774n = org.telegram.messenger.hd.E0().B.f23060c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.hd.M0(2131747829, null).replace("%1$d", "").replace("%2$d", ""), this.f50771c, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f50772e = this.d.getLineWidth(0);
            this.f50773f = this.d.getLineDescent(0);
            return;
        }
        this.f50772e = 0.0f;
        this.f50773f = 0.0f;
    }

    public final void d(boolean z10, boolean z11) {
        float f10;
        if (this.f50775r != z10) {
            this.f50775r = z10;
            if (!z10) {
                this.f50777w = true;
            }
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f50776s.e(true, f10);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f50775r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f50775r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f50776s.e(false, f10);
        if (e10 <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.g6 g6Var = this.f50770b;
        float c10 = g6Var.c() + this.f50772e;
        org.telegram.ui.Components.g6 g6Var2 = this.h;
        float c11 = g6Var2.c() + c10 + org.telegram.messenger.g0.L(18.0f);
        float f11 = ((1.0f - e10) * (-org.telegram.messenger.g0.L(8.0f))) + this.f50778x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c11) / 2.0f, org.telegram.messenger.g0.N(10.0f) + f11, (getWidth() + c11) / 2.0f, org.telegram.messenger.g0.N(33.0f) + f11);
        Paint paint = this.f50769a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + org.telegram.messenger.g0.L(9.0f), f11 + org.telegram.messenger.g0.L(9.5f));
        g6Var.setBounds(0, 0, (int) g6Var.c(), org.telegram.messenger.g0.L(23.0f));
        int i7 = (int) (e10 * 255.0f);
        g6Var.C = i7;
        g6Var.draw(canvas);
        canvas.translate(g6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f50772e)) / 2.0f, ((this.f50773f / 2.0f) + (org.telegram.messenger.g0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.f50771c.setAlpha(i7);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f50772e, 0.0f);
        g6Var2.setBounds(0, 0, (int) g6Var2.c(), org.telegram.messenger.g0.L(23.0f));
        g6Var2.C = i7;
        g6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f50778x = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m;
        this.f50770b.N = size;
        this.h.N = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.i20.B(43.0f, this.f50778x, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f50770b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
