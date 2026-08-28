package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.s1;
import org.telegram.ui.Components.ju0;
public final class d implements View.OnTouchListener {
    public static final int D = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public final s1 C;
    public final a f47942a;
    public final AccelerateInterpolator f47943b;
    public final s1 f47944c;
    public ju0 d;
    public final float[] f47945e;
    public final float[] f47946f;
    public final int h;
    public final int f47947n;
    public final float[] f47948r;
    public final float[] f47949s;
    public final float[] v;
    public boolean f47950w;
    public boolean f47951x;
    public boolean f47952y;

    public d(s1 s1Var) {
        ?? obj = new Object();
        obj.f47938e = Long.MIN_VALUE;
        obj.f47940g = -1L;
        obj.f47939f = 0L;
        this.f47942a = obj;
        this.f47943b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f47945e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f47946f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f47948r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f47949s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v = fArr5;
        this.f47944c = s1Var;
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
        this.f47947n = D;
        obj.f47935a = 500;
        obj.f47936b = 500;
        this.C = s1Var;
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
            int i9 = this.h;
            if (i9 != 0 && i9 != 1) {
                if (i9 == 2 && f10 < 0.0f) {
                    return f10 / (-f11);
                }
            } else if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.A && i9 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i9 = 0;
        if (this.f47951x) {
            this.A = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f47942a;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f47938e);
        int i11 = aVar.f47936b;
        if (i10 > i11) {
            i9 = i11;
        } else if (i10 >= 0) {
            i9 = i10;
        }
        aVar.f47941i = i9;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f47940g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        s1 s1Var;
        int count;
        a aVar = this.f47942a;
        float f10 = aVar.d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f47937c);
        if (abs != 0 && (count = (s1Var = this.C).getCount()) != 0) {
            int childCount = s1Var.getChildCount();
            int firstVisiblePosition = s1Var.getFirstVisiblePosition();
            int i9 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && s1Var.getChildAt(0).getTop() >= 0)) : !(i9 >= count && s1Var.getChildAt(childCount - 1).getBottom() <= s1Var.getHeight())) {
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
