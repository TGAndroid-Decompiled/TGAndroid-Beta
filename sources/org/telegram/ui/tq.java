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
public final class tq extends Drawable {
    public final org.telegram.ui.ActionBar.e6 f49865a;
    public final Paint f49866b = new Paint(1);
    public final Paint f49867c;
    public final Drawable d;
    public final RectF f49868e;
    public final org.telegram.ui.Components.g6 f49869f;
    public final org.telegram.ui.Components.g6 f49870g;
    public final Paint h;
    public final Path f49871i;
    public final Drawable f49872j;
    public int f49873k;
    public boolean f49874l;
    public final org.telegram.ui.Components.u5 f49875m;

    public tq(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f49867c = paint;
        this.f49868e = new RectF();
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.f49869f = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, false, false);
        this.f49870g = g6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f49871i = path;
        this.f49875m = new org.telegram.ui.Components.u5(new xg(this, 13), 320L, org.telegram.ui.Components.xq.h, 0);
        sq sqVar = new sq(0, this);
        this.f49865a = e6Var;
        this.d = k2.p1.g(context, i3);
        this.f49872j = k2.p1.g(context, 2131231936);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.u(-16777216);
        g6Var.w(org.telegram.messenger.g0.L(7.0f));
        g6Var.setCallback(sqVar);
        g6Var.f33983b = 17;
        Point point = org.telegram.messenger.g0.f22608q;
        g6Var.M = point.x;
        g6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var2.u(-16777216);
        g6Var2.w(org.telegram.messenger.g0.L(7.0f));
        g6Var2.setCallback(sqVar);
        g6Var2.f33983b = 17;
        g6Var2.M = point.x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.33f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.66f), org.telegram.messenger.g0.L(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f49874l == z10) {
            return;
        }
        this.f49874l = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i3;
        float f13;
        float d = this.f49875m.d(this.f49874l);
        org.telegram.ui.Components.g6 g6Var = this.f49869f;
        float c2 = g6Var.c() + (g6Var.i() * org.telegram.messenger.g0.L(5.0f));
        org.telegram.ui.Components.g6 g6Var2 = this.f49870g;
        float c10 = g6Var2.c() + (g6Var2.i() * org.telegram.messenger.g0.L(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i10 = (c2 > 0.0f ? 1 : (c2 == 0.0f ? 0 : -1));
        if (i10 <= 0 && c10 <= 0.0f && d <= 0.0f) {
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
        Paint paint = this.f49866b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float L = org.telegram.messenger.g0.L(10.0f);
        Paint paint2 = this.f49867c;
        RectF rectF = this.f49868e;
        if (i10 > 0) {
            f10 = L;
            float f14 = f10 / 2.0f;
            f11 = height;
            f12 = height2;
            rectF.set(width - c2, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint2);
        } else {
            f10 = L;
            f11 = height;
            f12 = height2;
        }
        int i11 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            float f15 = f10 / 2.0f;
            i3 = i11;
            rectF.set(width - c10, f12 - f15, width, f12 + f15);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint2);
        } else {
            i3 = i11;
        }
        float f16 = 1.0f - d;
        if (c2 * f16 > 0.0f) {
            paint.setAlpha((int) (g6Var.i() * 255.0f * f16));
            g6Var.B = (int) (g6Var.i() * 255.0f * f16);
            float f17 = f10 / 2.0f;
            rectF.set(width - c2, f11 - f17, width, f11 + f17);
            rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
            rectF.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            g6Var.p(rectF);
            g6Var.draw(canvas2);
        }
        if (d > 0.0f) {
            canvas2.save();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f49865a);
            int i12 = this.f49873k;
            Drawable drawable2 = this.f49872j;
            if (i12 != w02) {
                this.f49873k = w02;
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
                canvas2.drawPath(this.f49871i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f13 = 255.0f;
        }
        if (i3 > 0) {
            paint.setAlpha((int) (g6Var2.i() * f13));
            g6Var2.B = (int) (g6Var2.i() * f13);
            float f18 = f10 / 2.0f;
            rectF.set(width - c10, f12 - f18, width, f12 + f18);
            rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
            rectF.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
            g6Var2.p(rectF);
            g6Var2.draw(canvas2);
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
    public final void setAlpha(int i3) {
        this.d.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
