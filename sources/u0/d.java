package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.r1;
import org.telegram.ui.Components.ul0;
public final class d implements View.OnTouchListener {
    public static final int E = ViewConfiguration.getTapTimeout();
    public boolean B;
    public boolean C;
    public final r1 D;
    public final a f48209a;
    public final AccelerateInterpolator f48210b;
    public final r1 f48211c;
    public ul0 d;
    public final float[] f48212e;
    public final float[] f48213f;
    public final int h;
    public final int f48214n;
    public final float[] f48215r;
    public final float[] f48216s;
    public final float[] v;
    public boolean f48217w;
    public boolean f48218x;
    public boolean f48219y;

    public d(r1 r1Var) {
        ?? obj = new Object();
        obj.f48205e = Long.MIN_VALUE;
        obj.f48207g = -1L;
        obj.f48206f = 0L;
        this.f48209a = obj;
        this.f48210b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f48212e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f48213f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f48215r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f48216s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v = fArr5;
        this.f48211c = r1Var;
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
        this.f48214n = E;
        obj.f48202a = 500;
        obj.f48203b = 500;
        this.D = r1Var;
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
            int i10 = this.h;
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2 && f10 < 0.0f) {
                    return f10 / (-f11);
                }
            } else if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.B && i10 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f48218x) {
            this.B = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f48209a;
        int i11 = (int) (currentAnimationTimeMillis - aVar.f48205e);
        int i12 = aVar.f48203b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f48208i = i10;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f48207g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.f48209a;
        float f10 = aVar.d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f48204c);
        if (abs != 0 && (count = (r1Var = this.D).getCount()) != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: u0.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
