package xf;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.ui.ActionBar.j6;
public final class z extends Drawable {
    public static final PathInterpolator f45189i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final Interpolator f45190a;
    public final GradientDrawable f45191b;
    public final int e;
    public final int[] f45193f;
    public int f45194g;
    public final Paint f45192c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public z(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f45191b = gradientDrawable;
        this.f45190a = f45189i;
        this.f45193f = new int[8];
        this.e = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                    }
                } else {
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                }
            } else {
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            }
        } else {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        }
        b(0);
    }

    public static void a(Interpolator interpolator, int i10, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i10);
        for (int i11 = length; i11 >= 0; i11--) {
            iArr[i11] = i0.a.k(i10, (int) (interpolator.getInterpolation((length - i11) / length) * alpha));
        }
    }

    public final void b(int i10) {
        if (this.f45194g == i10) {
            return;
        }
        this.f45194g = i10;
        Interpolator interpolator = this.f45190a;
        int[] iArr = this.f45193f;
        a(interpolator, i10, iArr);
        this.f45191b.setColors(iArr);
        this.f45192c.setColor(j6.l1(this.h / 255.0f, this.f45194g));
    }

    public final void c(int i10, int i11) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i10 && rect.right == 0 && rect.bottom == i11) {
            return;
        }
        rect.set(0, i10, 0, i11);
        onBoundsChange(getBounds());
    }

    @Override
    public final void draw(android.graphics.Canvas r9) {
        throw new UnsupportedOperationException("Method not decompiled: xf.z.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getAlpha() {
        return this.h;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i10 = rect.left;
        Rect rect2 = this.d;
        int i11 = rect.bottom - rect2.bottom;
        this.f45191b.setBounds(i10 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, i11);
    }

    @Override
    public final void setAlpha(int i10) {
        this.h = i10;
        this.f45191b.setAlpha(i10);
        this.f45192c.setColor(j6.l1(this.h / 255.0f, this.f45194g));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f45191b.setColorFilter(colorFilter);
        this.f45192c.setColorFilter(colorFilter);
    }
}
