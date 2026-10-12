package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.s1;
import p4.t0;
public final class d implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public final s1 G;
    public final a f48728a;
    public final AccelerateInterpolator f48729b;
    public final s1 f48730c;
    public t0 d;
    public final float[] f48731e;
    public final float[] f48732f;
    public final int h;
    public final int f48733n;
    public final float[] f48734r;
    public final float[] f48735s;
    public final float[] v;
    public boolean f48736w;
    public boolean f48737x;
    public boolean f48738y;

    public d(s1 s1Var) {
        ?? obj = new Object();
        obj.f48724e = Long.MIN_VALUE;
        obj.f48726g = -1L;
        obj.f48725f = 0L;
        this.f48728a = obj;
        this.f48729b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f48731e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f48732f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f48734r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f48735s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v = fArr5;
        this.f48730c = s1Var;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f48733n = H;
        obj.f48721a = 500;
        obj.f48722b = 500;
        this.G = s1Var;
    }

    public static float b(float f7, float f10, float f11) {
        if (f7 > f11) {
            return f11;
        }
        if (f7 < f10) {
            return f10;
        }
        return f7;
    }

    public final float a(float r4, float r5, float r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: u0.d.a(float, float, float, int):float");
    }

    public final float c(float f7, float f10) {
        if (f10 != 0.0f) {
            int i10 = this.h;
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2 && f7 < 0.0f) {
                    return f7 / (-f10);
                }
            } else if (f7 < f10) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f10);
                }
                if (this.E && i10 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f48737x) {
            this.E = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f48728a;
        int i11 = (int) (currentAnimationTimeMillis - aVar.f48724e);
        int i12 = aVar.f48722b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f48727i = i10;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f48726g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        s1 s1Var;
        int count;
        a aVar = this.f48728a;
        float f7 = aVar.d;
        int abs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.f48723c);
        if (abs != 0 && (count = (s1Var = this.G).getCount()) != 0) {
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
