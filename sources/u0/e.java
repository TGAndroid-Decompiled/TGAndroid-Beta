package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.r1;
public final class e implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean D;
    public boolean E;
    public boolean F;
    public final r1 G;
    public final a f49799a;
    public final AccelerateInterpolator f49800b;
    public final r1 f49801c;
    public b d;
    public final float[] e;
    public final float[] f49802f;
    public final int h;
    public final int f49803n;
    public final float[] f49804r;
    public final float[] f49805s;
    public final float[] f49806w;
    public boolean f49807x;
    public boolean f49808y;

    public e(r1 r1Var) {
        ?? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.f49795g = -1L;
        obj.f49794f = 0L;
        this.f49799a = obj;
        this.f49800b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f49802f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f49804r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f49805s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f49806w = fArr5;
        this.f49801c = r1Var;
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
        this.f49803n = H;
        obj.f49791a = 500;
        obj.f49792b = 500;
        this.G = r1Var;
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
        throw new UnsupportedOperationException("Method not decompiled: u0.e.a(float, float, float, int):float");
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
        if (this.f49808y) {
            this.E = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f49799a;
        int i11 = (int) (currentAnimationTimeMillis - aVar.e);
        int i12 = aVar.f49792b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f49796i = i10;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f49795g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.f49799a;
        float f7 = aVar.d;
        int abs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.f49793c);
        if (abs != 0 && (count = (r1Var = this.G).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: u0.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
