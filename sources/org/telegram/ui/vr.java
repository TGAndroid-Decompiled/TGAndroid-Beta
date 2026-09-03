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
public final class vr extends Drawable {
    public final org.telegram.ui.ActionBar.f6 f39170a;
    public final Paint f39171b = new Paint(1);
    public final Paint f39172c;
    public final Drawable d;
    public final RectF e;
    public final org.telegram.ui.Components.j6 f39173f;
    public final org.telegram.ui.Components.j6 f39174g;
    public final Paint h;
    public final Path f39175i;
    public final Drawable f39176j;
    public int f39177k;
    public boolean f39178l;
    public final org.telegram.ui.Components.z5 f39179m;

    public vr(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f39172c = paint;
        this.e = new RectF();
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.f39173f = j6Var;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, false, false, false);
        this.f39174g = j6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f39175i = path;
        this.f39179m = new org.telegram.ui.Components.z5(new bj(this, 12), 320L, org.telegram.ui.Components.mr.h, 0);
        ur urVar = new ur(0, this);
        this.f39170a = f6Var;
        this.d = context.getResources().getDrawable(i10).mutate();
        this.f39176j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.r(-16777216);
        j6Var.t(AndroidUtilities.dp(7.0f));
        j6Var.setCallback(urVar);
        j6Var.f25847b = 17;
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var2.r(-16777216);
        j6Var2.t(AndroidUtilities.dp(7.0f));
        j6Var2.setCallback(urVar);
        j6Var2.f25847b = 17;
        j6Var2.G = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z4) {
        if (this.f39178l == z4) {
            return;
        }
        this.f39178l = z4;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float e = this.f39179m.e(this.f39178l);
        org.telegram.ui.Components.j6 j6Var = this.f39173f;
        float d = j6Var.d() + (j6Var.g() * AndroidUtilities.dp(5.0f));
        org.telegram.ui.Components.j6 j6Var2 = this.f39174g;
        float d10 = j6Var2.d() + (j6Var2.g() * AndroidUtilities.dp(5.0f));
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
        Paint paint = this.f39171b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.f39172c;
        RectF rectF = this.e;
        if (i11 > 0) {
            f10 = dp;
            float f14 = f10 / 2.0f;
            f11 = height;
            f12 = height2;
            rectF.set(width - d, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f10 = dp;
            f11 = height;
            f12 = height2;
        }
        int i12 = (d10 > 0.0f ? 1 : (d10 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            float f15 = f10 / 2.0f;
            i10 = i12;
            rectF.set(width - d10, f12 - f15, width, f12 + f15);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            i10 = i12;
        }
        float f16 = 1.0f - e;
        if (d * f16 > 0.0f) {
            paint.setAlpha((int) (j6Var.g() * 255.0f * f16));
            j6Var.f25864w = (int) (j6Var.g() * 255.0f * f16);
            float f17 = f10 / 2.0f;
            rectF.set(width - d, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            j6Var.m(rectF);
            j6Var.draw(canvas2);
        }
        if (e > 0.0f) {
            canvas2.save();
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f39170a);
            int i13 = this.f39177k;
            Drawable drawable2 = this.f39176j;
            if (i13 != v02) {
                this.f39177k = v02;
                drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            f13 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f39175i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f13 = 255.0f;
        }
        if (i10 > 0) {
            paint.setAlpha((int) (j6Var2.g() * f13));
            j6Var2.f25864w = (int) (j6Var2.g() * f13);
            float f18 = f10 / 2.0f;
            rectF.set(width - d10, f12 - f18, width, f12 + f18);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            j6Var2.m(rectF);
            j6Var2.draw(canvas2);
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
