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
public final class wr extends Drawable {
    public final org.telegram.ui.ActionBar.d6 f43856a;
    public final Paint f43857b = new Paint(1);
    public final Paint f43858c;
    public final Drawable d;
    public final RectF f43859e;
    public final org.telegram.ui.Components.q6 f43860f;
    public final org.telegram.ui.Components.q6 f43861g;
    public final Paint h;
    public final Path f43862i;
    public final Drawable f43863j;
    public int f43864k;
    public boolean f43865l;
    public final org.telegram.ui.Components.g6 f43866m;

    public wr(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.f43858c = paint;
        this.f43859e = new RectF();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
        this.f43860f = q6Var;
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, false, false);
        this.f43861g = q6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f43862i = path;
        this.f43866m = new org.telegram.ui.Components.g6(new cj(this, 13), 320L, org.telegram.ui.Components.is.h, 0);
        vr vrVar = new vr(0, this);
        this.f43856a = d6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f43863j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.u(-16777216);
        q6Var.w(AndroidUtilities.dp(7.0f));
        q6Var.setCallback(vrVar);
        q6Var.f30019b = 17;
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var2.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var2.u(-16777216);
        q6Var2.w(AndroidUtilities.dp(7.0f));
        q6Var2.setCallback(vrVar);
        q6Var2.f30019b = 17;
        q6Var2.M = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f43865l == z10) {
            return;
        }
        this.f43865l = z10;
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
        float e7 = this.f43866m.e(this.f43865l);
        org.telegram.ui.Components.q6 q6Var = this.f43860f;
        float c10 = q6Var.c() + (q6Var.i() * AndroidUtilities.dp(5.0f));
        org.telegram.ui.Components.q6 q6Var2 = this.f43861g;
        float c11 = q6Var2.c() + (q6Var2.i() * AndroidUtilities.dp(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i11 = (c10 > 0.0f ? 1 : (c10 == 0.0f ? 0 : -1));
        if (i11 <= 0 && c11 <= 0.0f && e7 <= 0.0f) {
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
        Paint paint = this.f43857b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.f43858c;
        RectF rectF = this.f43859e;
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
        float f15 = 1.0f - e7;
        if (c10 * f15 > 0.0f) {
            paint.setAlpha((int) (q6Var.i() * 255.0f * f15));
            q6Var.B = (int) (q6Var.i() * 255.0f * f15);
            float f16 = f7 / 2.0f;
            rectF.set(width - c10, f10 - f16, width, f10 + f16);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            q6Var.p(rectF);
            q6Var.draw(canvas2);
        }
        if (e7 > 0.0f) {
            canvas2.save();
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f43856a);
            int i13 = this.f43864k;
            Drawable drawable2 = this.f43863j;
            if (i13 != w02) {
                this.f43864k = w02;
                drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            f12 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e7 * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e7);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e7 > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f43862i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f12 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (q6Var2.i() * f12));
            q6Var2.B = (int) (q6Var2.i() * f12);
            float f17 = f7 / 2.0f;
            rectF.set(width - c11, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            q6Var2.p(rectF);
            q6Var2.draw(canvas2);
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
