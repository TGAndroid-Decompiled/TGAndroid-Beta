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
public final class vr extends Drawable {
    public final org.telegram.ui.ActionBar.p6 f42586a;
    public final Paint f42587b = new Paint(1);
    public final Paint f42588c;
    public final Drawable d;
    public final RectF e;
    public final org.telegram.ui.Components.e6 f42589f;
    public final org.telegram.ui.Components.e6 f42590g;
    public final Paint h;
    public final Path f42591i;
    public final Drawable f42592j;
    public int f42593k;
    public boolean f42594l;
    public final org.telegram.ui.Components.t5 f42595m;

    public vr(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.f42588c = paint;
        this.e = new RectF();
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.f42589f = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, false, false);
        this.f42590g = e6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f42591i = path;
        this.f42595m = new org.telegram.ui.Components.t5(new rh(this, 14), 320L, org.telegram.ui.Components.gr.h, 0);
        ur urVar = new ur(0, this);
        this.f42586a = p6Var;
        this.d = i0.a.f(context, i10);
        this.f42592j = i0.a.f(context, 2131231935);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.u(-16777216);
        e6Var.w(org.telegram.messenger.i0.L(7.0f));
        e6Var.setCallback(urVar);
        e6Var.f25744b = 17;
        Point point = org.telegram.messenger.i0.f16172q;
        e6Var.M = point.x;
        e6Var2.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var2.u(-16777216);
        e6Var2.w(org.telegram.messenger.i0.L(7.0f));
        e6Var2.setCallback(urVar);
        e6Var2.f25744b = 17;
        e6Var2.M = point.x;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(org.telegram.messenger.i0.L(0.66f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.33f));
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(2.66f), org.telegram.messenger.i0.L(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f42594l == z10) {
            return;
        }
        this.f42594l = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float d = this.f42595m.d(this.f42594l);
        org.telegram.ui.Components.e6 e6Var = this.f42589f;
        float c10 = e6Var.c() + (e6Var.i() * org.telegram.messenger.i0.L(5.0f));
        org.telegram.ui.Components.e6 e6Var2 = this.f42590g;
        float c11 = e6Var2.c() + (e6Var2.i() * org.telegram.messenger.i0.L(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i11 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        if (i11 <= 0 && c11 <= 0.0f && d <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        }
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), (bounds.width() + org.telegram.messenger.i0.L(6.0f)) - org.telegram.messenger.i0.L(12.0f), (bounds.height() + org.telegram.messenger.i0.L(6.0f)) - org.telegram.messenger.i0.L(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.f42587b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float L = org.telegram.messenger.i0.L(10.0f);
        Paint paint2 = this.f42588c;
        RectF rectF = this.e;
        if (i11 > 0) {
            f7 = L;
            float f13 = f7 / 2.0f;
            f10 = height;
            f11 = height2;
            rectF.set(width - c10, f10 - f13, width, f10 + f13);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint2);
        } else {
            f7 = L;
            f10 = height;
            f11 = height2;
        }
        int i12 = (c11 > 0.0f ? 1 : (c11 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            float f14 = f7 / 2.0f;
            i10 = i12;
            rectF.set(width - c11, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint2);
        } else {
            i10 = i12;
        }
        float f15 = 1.0f - d;
        if (c10 * f15 > 0.0f) {
            paint.setAlpha((int) (e6Var.i() * 255.0f * f15));
            e6Var.B = (int) (e6Var.i() * 255.0f * f15);
            float f16 = f7 / 2.0f;
            rectF.set(width - c10, f10 - f16, width, f10 + f16);
            rectF.inset(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint);
            rectF.inset(-org.telegram.messenger.i0.L(1.0f), -org.telegram.messenger.i0.L(1.0f));
            e6Var.p(rectF);
            e6Var.draw(canvas2);
        }
        if (d > 0.0f) {
            canvas2.save();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f42586a);
            int i13 = this.f42593k;
            Drawable drawable2 = this.f42592j;
            if (i13 != w02) {
                this.f42593k = w02;
                drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            f12 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(0.66f) + bounds.top, bounds.right - org.telegram.messenger.i0.L(3.0f), drawable2.getIntrinsicHeight() + org.telegram.messenger.i0.L(0.66f) + bounds.top);
            drawable2.setAlpha((int) (d * 255.0f));
            float T1 = org.telegram.messenger.i0.T1(0.8f, 1.0f, d);
            canvas2.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (d > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f42591i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f12 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (e6Var2.i() * f12));
            e6Var2.B = (int) (e6Var2.i() * f12);
            float f17 = f7 / 2.0f;
            rectF.set(width - c11, f11 - f17, width, f11 + f17);
            rectF.inset(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint);
            rectF.inset(-org.telegram.messenger.i0.L(1.0f), -org.telegram.messenger.i0.L(1.0f));
            e6Var2.p(rectF);
            e6Var2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(12.0f) + this.d.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
