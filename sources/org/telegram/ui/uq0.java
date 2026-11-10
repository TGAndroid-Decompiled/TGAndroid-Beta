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
public final class uq0 extends View {
    public final Paint f50546a;
    public final org.telegram.ui.Components.h6 f50547b;
    public final TextPaint f50548c;
    public StaticLayout d;
    public float f50549e;
    public float f50550f;
    public final org.telegram.ui.Components.h6 h;
    public String f50551n;
    public boolean f50552r;
    public final org.telegram.ui.Components.v5 f50553s;
    public boolean f50554w;
    public int f50555x;

    public uq0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f50546a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f50548c = textPaint;
        this.f50552r = false;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.f50553s = new org.telegram.ui.Components.v5(this, 0L, 350L, wqVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, true, true);
        this.f50547b = h6Var;
        h6Var.n(0.3f, 320L, wqVar);
        h6Var.u(-1);
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.setCallback(this);
        h6Var.t("0", true, true);
        Point point = org.telegram.messenger.g0.f22567q;
        h6Var.M = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        c();
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(false, true, true);
        this.h = h6Var2;
        h6Var2.n(0.3f, 320L, wqVar);
        h6Var2.u(-1);
        h6Var2.w(org.telegram.messenger.g0.L(14.0f));
        h6Var2.x(org.telegram.messenger.g0.o());
        h6Var2.setCallback(this);
        h6Var2.t("0", true, true);
        h6Var2.M = point.x;
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
        if (org.telegram.messenger.id.E0().B != null && !TextUtils.equals(this.f50551n, org.telegram.messenger.id.E0().B.f22402c)) {
            c();
        }
        if (org.telegram.messenger.id.f23161a0) {
            i11 = max2;
        } else {
            i11 = max;
        }
        String format = String.format("%d", Integer.valueOf(i11));
        if (z9 && !this.f50554w && !org.telegram.messenger.id.f23161a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50547b.t(format, z10, true);
        if (!org.telegram.messenger.id.f23161a0) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z9 && !this.f50554w && !org.telegram.messenger.id.f23161a0) {
            z11 = true;
        }
        this.h.t(format2, z11, true);
        this.f50554w = !z9;
    }

    public final void c() {
        this.f50551n = org.telegram.messenger.id.E0().B.f22402c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.id.M0(2131747829, null).replace("%1$d", "").replace("%2$d", ""), this.f50548c, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f50549e = this.d.getLineWidth(0);
            this.f50550f = this.d.getLineDescent(0);
            return;
        }
        this.f50549e = 0.0f;
        this.f50550f = 0.0f;
    }

    public final void d(boolean z9, boolean z10) {
        float f10;
        if (this.f50552r != z9) {
            this.f50552r = z9;
            if (!z9) {
                this.f50554w = true;
            }
            if (!z10) {
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f50553s.e(true, f10);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f50552r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f50552r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f50553s.e(false, f10);
        if (e10 <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.h6 h6Var = this.f50547b;
        float c10 = h6Var.c() + this.f50549e;
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        float c11 = h6Var2.c() + c10 + org.telegram.messenger.g0.L(18.0f);
        float f11 = ((1.0f - e10) * (-org.telegram.messenger.g0.L(8.0f))) + this.f50555x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c11) / 2.0f, org.telegram.messenger.g0.N(10.0f) + f11, (getWidth() + c11) / 2.0f, org.telegram.messenger.g0.N(33.0f) + f11);
        Paint paint = this.f50546a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + org.telegram.messenger.g0.L(9.0f), f11 + org.telegram.messenger.g0.L(9.5f));
        h6Var.setBounds(0, 0, (int) h6Var.c(), org.telegram.messenger.g0.L(23.0f));
        int i7 = (int) (e10 * 255.0f);
        h6Var.B = i7;
        h6Var.draw(canvas);
        canvas.translate(h6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f50549e)) / 2.0f, ((this.f50550f / 2.0f) + (org.telegram.messenger.g0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.f50548c.setAlpha(i7);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f50549e, 0.0f);
        h6Var2.setBounds(0, 0, (int) h6Var2.c(), org.telegram.messenger.g0.L(23.0f));
        h6Var2.B = i7;
        h6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f50555x = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
        this.f50547b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.camera.q.B(43.0f, this.f50555x, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f50547b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
