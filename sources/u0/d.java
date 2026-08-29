package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.s1;
import org.telegram.ui.Components.rk0;
public final class d implements View.OnTouchListener {
    public static final int D = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public final s1 C;
    public final a f48940a;
    public final AccelerateInterpolator f48941b;
    public final s1 f48942c;
    public rk0 d;
    public final float[] f48943e;
    public final float[] f48944f;
    public final int h;
    public final int f48945n;
    public final float[] f48946r;
    public final float[] f48947s;
    public final float[] v;
    public boolean f48948w;
    public boolean f48949x;
    public boolean f48950y;

    public d(s1 s1Var) {
        ?? obj = new Object();
        obj.f48936e = Long.MIN_VALUE;
        obj.f48938g = -1L;
        obj.f48937f = 0L;
        this.f48940a = obj;
        this.f48941b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f48943e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f48944f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f48946r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f48947s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v = fArr5;
        this.f48942c = s1Var;
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f9) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f9 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f48945n = D;
        obj.f48933a = 500;
        obj.f48934b = 500;
        this.C = s1Var;
    }

    public static float b(float f9, float f10, float f11) {
        if (f9 > f11) {
            return f11;
        }
        if (f9 < f10) {
            return f10;
        }
        return f9;
    }

    public final float a(float r4, float r5, float r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: u0.d.a(float, float, float, int):float");
    }

    public final float c(float f9, float f10) {
        if (f10 != 0.0f) {
            int i10 = this.h;
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2 && f9 < 0.0f) {
                    return f9 / (-f10);
                }
            } else if (f9 < f10) {
                if (f9 >= 0.0f) {
                    return 1.0f - (f9 / f10);
                }
                if (this.A && i10 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f48949x) {
            this.A = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f48940a;
        int i11 = (int) (currentAnimationTimeMillis - aVar.f48936e);
        int i12 = aVar.f48934b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f48939i = i10;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f48938g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        s1 s1Var;
        int count;
        a aVar = this.f48940a;
        float f9 = aVar.d;
        int abs = (int) (f9 / Math.abs(f9));
        Math.abs(aVar.f48935c);
        if (abs != 0 && (count = (s1Var = this.C).getCount()) != 0) {
            int childCount = s1Var.getChildCount();
            int firstVisiblePosition = s1Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && s1Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && s1Var.getChildAt(childCount - 1).getBottom() <= s1Var.getHeight())) {
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
