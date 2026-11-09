package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.s1;
import tg.y;
public final class d implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean D;
    public boolean E;
    public boolean F;
    public final s1 G;
    public final a f56175a;
    public final AccelerateInterpolator f56176b;
    public final s1 f56177c;
    public y d;
    public final float[] f56178e;
    public final float[] f56179f;
    public final int h;
    public final int f56180n;
    public final float[] f56181r;
    public final float[] f56182s;
    public final float[] f56183w;
    public boolean f56184x;
    public boolean f56185y;

    public d(s1 s1Var) {
        ?? obj = new Object();
        obj.f56171e = Long.MIN_VALUE;
        obj.f56173g = -1L;
        obj.f56172f = 0L;
        this.f56175a = obj;
        this.f56176b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f56178e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f56179f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f56181r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f56182s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f56183w = fArr5;
        this.f56177c = s1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f56180n = H;
        obj.f56168a = 500;
        obj.f56169b = 500;
        this.G = s1Var;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        if (f10 < f11) {
            return f11;
        }
        return f10;
    }

    public final float a(float r4, float r5, float r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: u0.d.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i7 = this.h;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2 && f10 < 0.0f) {
                    return f10 / (-f11);
                }
            } else if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.E && i7 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f56185y) {
            this.E = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f56175a;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f56171e);
        int i11 = aVar.f56169b;
        if (i10 > i11) {
            i7 = i11;
        } else if (i10 >= 0) {
            i7 = i10;
        }
        aVar.f56174i = i7;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f56173g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        s1 s1Var;
        int count;
        a aVar = this.f56175a;
        float f10 = aVar.d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f56170c);
        if (abs != 0 && (count = (s1Var = this.G).getCount()) != 0) {
            int childCount = s1Var.getChildCount();
            int firstVisiblePosition = s1Var.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && s1Var.getChildAt(0).getTop() >= 0)) : !(i7 >= count && s1Var.getChildAt(childCount - 1).getBottom() <= s1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: u0.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
