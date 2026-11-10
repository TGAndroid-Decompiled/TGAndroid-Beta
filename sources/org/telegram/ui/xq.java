package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class xq extends Drawable {
    public final org.telegram.ui.ActionBar.h6 f51781a;
    public final Paint f51782b = new Paint(1);
    public final Paint f51783c;
    public final Drawable d;
    public final RectF f51784e;
    public final org.telegram.ui.Components.h6 f51785f;
    public final org.telegram.ui.Components.h6 f51786g;
    public final Paint h;
    public final Path f51787i;
    public final Drawable f51788j;
    public int f51789k;
    public boolean f51790l;
    public final org.telegram.ui.Components.v5 f51791m;

    public xq(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.f51783c = paint;
        this.f51784e = new RectF();
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(false, false, false);
        this.f51785f = h6Var2;
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(false, false, false);
        this.f51786g = h6Var3;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f51787i = path;
        this.f51791m = new org.telegram.ui.Components.v5(new dh(this, 13), 320L, org.telegram.ui.Components.wq.h, 0);
        wq wqVar = new wq(0, this);
        this.f51781a = h6Var;
        this.d = jg.g.h(context, i7);
        this.f51788j = jg.g.h(context, 2131231936);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        h6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        h6Var2.u(-16777216);
        h6Var2.w(org.telegram.messenger.g0.L(7.0f));
        h6Var2.setCallback(wqVar);
        h6Var2.f34187b = 17;
        Point point = org.telegram.messenger.g0.f22567q;
        h6Var2.M = point.x;
        h6Var3.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        h6Var3.u(-16777216);
        h6Var3.w(org.telegram.messenger.g0.L(7.0f));
        h6Var3.setCallback(wqVar);
        h6Var3.f34187b = 17;
        h6Var3.M = point.x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.33f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.66f), org.telegram.messenger.g0.L(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z9) {
        if (this.f51790l == z9) {
            return;
        }
        this.f51790l = z9;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i7;
        float f13;
        float d = this.f51791m.d(this.f51790l);
        org.telegram.ui.Components.h6 h6Var = this.f51785f;
        float c10 = h6Var.c() + (h6Var.i() * org.telegram.messenger.g0.L(5.0f));
        org.telegram.ui.Components.h6 h6Var2 = this.f51786g;
        float c11 = h6Var2.c() + (h6Var2.i() * org.telegram.messenger.g0.L(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i10 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        if (i10 <= 0 && c11 <= 0.0f && d <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        }
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), (bounds.width() + org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.L(12.0f), (bounds.height() + org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.L(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.f51782b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float L = org.telegram.messenger.g0.L(10.0f);
        Paint paint2 = this.f51783c;
        RectF rectF = this.f51784e;
        if (i10 > 0) {
            f10 = L;
            float f14 = f10 / 2.0f;
            f11 = height;
            f12 = height2;
            rectF.set(width - c10, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint2);
        } else {
            f10 = L;
            f11 = height;
            f12 = height2;
        }
        int i11 = (c11 > 0.0f ? 1 : (c11 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            float f15 = f10 / 2.0f;
            i7 = i11;
            rectF.set(width - c11, f12 - f15, width, f12 + f15);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint2);
        } else {
            i7 = i11;
        }
        float f16 = 1.0f - d;
        if (c10 * f16 > 0.0f) {
            paint.setAlpha((int) (h6Var.i() * 255.0f * f16));
            h6Var.B = (int) (h6Var.i() * 255.0f * f16);
            float f17 = f10 / 2.0f;
            rectF.set(width - c10, f11 - f17, width, f11 + f17);
            rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
            rectF.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            h6Var.p(rectF);
            h6Var.draw(canvas2);
        }
        if (d > 0.0f) {
            canvas2.save();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.f51781a);
            int i12 = this.f51789k;
            Drawable drawable2 = this.f51788j;
            if (i12 != w02) {
                this.f51789k = w02;
                drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            f13 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(0.66f) + bounds.top, bounds.right - org.telegram.messenger.g0.L(3.0f), drawable2.getIntrinsicHeight() + org.telegram.messenger.g0.L(0.66f) + bounds.top);
            drawable2.setAlpha((int) (d * 255.0f));
            float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, d);
            canvas2.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (d > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f51787i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f13 = 255.0f;
        }
        if (i7 > 0) {
            paint.setAlpha((int) (h6Var2.i() * f13));
            h6Var2.B = (int) (h6Var2.i() * f13);
            float f18 = f10 / 2.0f;
            rectF.set(width - c11, f12 - f18, width, f12 + f18);
            rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
            rectF.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            h6Var2.p(rectF);
            h6Var2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(12.0f) + this.d.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.d.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
