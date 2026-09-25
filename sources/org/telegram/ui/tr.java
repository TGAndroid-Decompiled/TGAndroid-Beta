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
public final class tr extends Drawable {
    public final org.telegram.ui.ActionBar.d6 f38222a;
    public final Paint f38223b = new Paint(1);
    public final Paint f38224c;
    public final Drawable d;
    public final RectF e;
    public final org.telegram.ui.Components.o6 f38225f;
    public final org.telegram.ui.Components.o6 f38226g;
    public final Paint h;
    public final Path f38227i;
    public final Drawable f38228j;
    public int f38229k;
    public boolean f38230l;
    public final org.telegram.ui.Components.e6 f38231m;

    public tr(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.f38224c = paint;
        this.e = new RectF();
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, false, false, false);
        this.f38225f = o6Var;
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(false, false, false, false);
        this.f38226g = o6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f38227i = path;
        this.f38231m = new org.telegram.ui.Components.e6(new aj(this, 12), 320L, org.telegram.ui.Components.rr.h, 0);
        sr srVar = new sr(0, this);
        this.f38222a = d6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f38228j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.r(-16777216);
        o6Var.t(AndroidUtilities.dp(7.0f));
        o6Var.setCallback(srVar);
        o6Var.f26930b = 17;
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var2.r(-16777216);
        o6Var2.t(AndroidUtilities.dp(7.0f));
        o6Var2.setCallback(srVar);
        o6Var2.f26930b = 17;
        o6Var2.G = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f38230l == z10) {
            return;
        }
        this.f38230l = z10;
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
        float e = this.f38231m.e(this.f38230l);
        org.telegram.ui.Components.o6 o6Var = this.f38225f;
        float d = o6Var.d() + (o6Var.g() * AndroidUtilities.dp(5.0f));
        org.telegram.ui.Components.o6 o6Var2 = this.f38226g;
        float d10 = o6Var2.d() + (o6Var2.g() * AndroidUtilities.dp(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i11 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i11 <= 0 && d10 <= 0.0f && e <= 0.0f) {
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
        Paint paint = this.f38223b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.f38224c;
        RectF rectF = this.e;
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
        float f15 = 1.0f - e;
        if (d * f15 > 0.0f) {
            paint.setAlpha((int) (o6Var.g() * 255.0f * f15));
            o6Var.f26947w = (int) (o6Var.g() * 255.0f * f15);
            float f16 = f7 / 2.0f;
            rectF.set(width - d, f10 - f16, width, f10 + f16);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            o6Var.m(rectF);
            o6Var.draw(canvas2);
        }
        if (e > 0.0f) {
            canvas2.save();
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.f38222a);
            int i13 = this.f38229k;
            Drawable drawable2 = this.f38228j;
            if (i13 != v02) {
                this.f38229k = v02;
                drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            f12 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f38227i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f12 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (o6Var2.g() * f12));
            o6Var2.f26947w = (int) (o6Var2.g() * f12);
            float f17 = f7 / 2.0f;
            rectF.set(width - d10, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            o6Var2.m(rectF);
            o6Var2.draw(canvas2);
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
