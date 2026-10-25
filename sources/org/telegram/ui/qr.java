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
public final class qr extends Drawable {
    public final org.telegram.ui.ActionBar.u6 f42895a;
    public final Paint f42896b = new Paint(1);
    public final Paint f42897c;
    public final Drawable d;
    public final RectF e;
    public final org.telegram.ui.Components.r6 f42898f;
    public final org.telegram.ui.Components.r6 f42899g;
    public final Paint h;
    public final Path f42900i;
    public final Drawable f42901j;
    public int f42902k;
    public boolean f42903l;
    public final org.telegram.ui.Components.h6 f42904m;

    public qr(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint(1);
        this.f42897c = paint;
        this.e = new RectF();
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, false, false);
        this.f42898f = r6Var;
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, false, false);
        this.f42899g = r6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f42900i = path;
        this.f42904m = new org.telegram.ui.Components.h6(new ui(this, 13), 320L, org.telegram.ui.Components.ds.h, 0);
        pr prVar = new pr(0, this);
        this.f42895a = u6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f42901j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var.u(-16777216);
        r6Var.w(AndroidUtilities.dp(7.0f));
        r6Var.setCallback(prVar);
        r6Var.f32119b = 17;
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var2.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var2.u(-16777216);
        r6Var2.w(AndroidUtilities.dp(7.0f));
        r6Var2.setCallback(prVar);
        r6Var2.f32119b = 17;
        r6Var2.M = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f42903l == z10) {
            return;
        }
        this.f42903l = z10;
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
        float e = this.f42904m.e(this.f42903l);
        org.telegram.ui.Components.r6 r6Var = this.f42898f;
        float c10 = r6Var.c() + (r6Var.i() * AndroidUtilities.dp(5.0f));
        org.telegram.ui.Components.r6 r6Var2 = this.f42899g;
        float c11 = r6Var2.c() + (r6Var2.i() * AndroidUtilities.dp(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i11 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        if (i11 <= 0 && c11 <= 0.0f && e <= 0.0f) {
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
        Paint paint = this.f42896b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.f42897c;
        RectF rectF = this.e;
        if (i11 > 0) {
            f7 = dp;
            float f13 = f7 / 2.0f;
            f10 = height;
            f11 = height2;
            rectF.set(width - c10, f10 - f13, width, f10 + f13);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f7 = dp;
            f10 = height;
            f11 = height2;
        }
        int i12 = (c11 > 0.0f ? 1 : (c11 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            float f14 = f7 / 2.0f;
            i10 = i12;
            rectF.set(width - c11, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            i10 = i12;
        }
        float f15 = 1.0f - e;
        if (c10 * f15 > 0.0f) {
            paint.setAlpha((int) (r6Var.i() * 255.0f * f15));
            r6Var.B = (int) (r6Var.i() * 255.0f * f15);
            float f16 = f7 / 2.0f;
            rectF.set(width - c10, f10 - f16, width, f10 + f16);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            r6Var.p(rectF);
            r6Var.draw(canvas2);
        }
        if (e > 0.0f) {
            canvas2.save();
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f42895a);
            int i13 = this.f42902k;
            Drawable drawable2 = this.f42901j;
            if (i13 != w02) {
                this.f42902k = w02;
                drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            f12 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f42900i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f12 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (r6Var2.i() * f12));
            r6Var2.B = (int) (r6Var2.i() * f12);
            float f17 = f7 / 2.0f;
            rectF.set(width - c11, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            r6Var2.p(rectF);
            r6Var2.draw(canvas2);
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
