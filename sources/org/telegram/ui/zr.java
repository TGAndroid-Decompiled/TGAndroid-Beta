package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class zr extends Drawable {
    public final org.telegram.ui.ActionBar.f6 f43494a;
    public final Paint f43495b = new Paint(1);
    public final Paint f43496c;
    public final Drawable d;
    public final RectF f43497e;
    public final org.telegram.ui.Components.p6 f43498f;
    public final org.telegram.ui.Components.p6 f43499g;
    public final Paint h;
    public final Path f43500i;
    public final Drawable f43501j;
    public int f43502k;
    public boolean f43503l;
    public final org.telegram.ui.Components.e6 f43504m;

    public zr(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f43496c = paint;
        this.f43497e = new RectF();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false, false);
        this.f43498f = p6Var;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, false, false, false);
        this.f43499g = p6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f43500i = path;
        this.f43504m = new org.telegram.ui.Components.e6(new dj(this, 12), 320L, org.telegram.ui.Components.pr.h, 0);
        yr yrVar = new yr(0, this);
        this.f43494a = f6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f43501j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.r(-16777216);
        p6Var.t(AndroidUtilities.dp(7.0f));
        p6Var.setCallback(yrVar);
        p6Var.f29285b = 17;
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var2.r(-16777216);
        p6Var2.t(AndroidUtilities.dp(7.0f));
        p6Var2.setCallback(yrVar);
        p6Var2.f29285b = 17;
        p6Var2.G = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f43503l == z10) {
            return;
        }
        this.f43503l = z10;
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
        float e7 = this.f43504m.e(this.f43503l);
        org.telegram.ui.Components.p6 p6Var = this.f43498f;
        float d = p6Var.d() + (p6Var.g() * AndroidUtilities.dp(5.0f));
        org.telegram.ui.Components.p6 p6Var2 = this.f43499g;
        float d10 = p6Var2.d() + (p6Var2.g() * AndroidUtilities.dp(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i11 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i11 <= 0 && d10 <= 0.0f && e7 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        }
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (bounds.width() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f), (bounds.height() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.f43495b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.f43496c;
        RectF rectF = this.f43497e;
        if (i11 > 0) {
            f7 = dp;
            float f13 = f7 / 2.0f;
            f10 = height;
            f11 = height2;
            rectF.set(width - d, f10 - f13, width, f10 + f13);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f7 = dp;
            f10 = height;
            f11 = height2;
        }
        int i12 = (d10 > 0.0f ? 1 : (d10 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            float f14 = f7 / 2.0f;
            i10 = i12;
            rectF.set(width - d10, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            i10 = i12;
        }
        float f15 = 1.0f - e7;
        if (d * f15 > 0.0f) {
            paint.setAlpha((int) (p6Var.g() * 255.0f * f15));
            p6Var.f29303w = (int) (p6Var.g() * 255.0f * f15);
            float f16 = f7 / 2.0f;
            rectF.set(width - d, f10 - f16, width, f10 + f16);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            p6Var.m(rectF);
            p6Var.draw(canvas2);
        }
        if (e7 > 0.0f) {
            canvas2.save();
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f43494a);
            int i13 = this.f43502k;
            Drawable drawable2 = this.f43501j;
            if (i13 != v02) {
                this.f43502k = v02;
                drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            f12 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e7 * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e7);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e7 > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f43500i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f12 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (p6Var2.g() * f12));
            p6Var2.f29303w = (int) (p6Var2.g() * f12);
            float f17 = f7 / 2.0f;
            rectF.set(width - d10, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            p6Var2.m(rectF);
            p6Var2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicWidth();
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
