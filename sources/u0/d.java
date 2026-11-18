package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.r1;
import s4.s0;
public final class d implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public boolean G;
    public final r1 H;
    public final a f58241a;
    public final AccelerateInterpolator f58242b;
    public final r1 f58243c;
    public s0 d;
    public final float[] f58244e;
    public final float[] f58245f;
    public final int h;
    public final int f58246n;
    public final float[] f58247r;
    public final float[] f58248s;
    public final float[] f58249w;
    public boolean f58250x;
    public boolean f58251y;

    public d(r1 r1Var) {
        ?? obj = new Object();
        obj.f58237e = Long.MIN_VALUE;
        obj.f58239g = -1L;
        obj.f58238f = 0L;
        this.f58241a = obj;
        this.f58242b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f58244e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f58245f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f58247r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f58248s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f58249w = fArr5;
        this.f58243c = r1Var;
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
        this.f58246n = I;
        obj.f58234a = 500;
        obj.f58235b = 500;
        this.H = r1Var;
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
                if (this.F && i7 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f58251y) {
            this.F = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f58241a;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f58237e);
        int i11 = aVar.f58235b;
        if (i10 > i11) {
            i7 = i11;
        } else if (i10 >= 0) {
            i7 = i10;
        }
        aVar.f58240i = i7;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f58239g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.f58241a;
        float f10 = aVar.d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f58236c);
        if (abs != 0 && (count = (r1Var = this.H).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i7 >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
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
