package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.r1;
import org.telegram.ui.Components.lt;
public final class d implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public boolean G;
    public final r1 H;
    public final a f55454a;
    public final AccelerateInterpolator f55455b;
    public final r1 f55456c;
    public lt d;
    public final float[] f55457e;
    public final float[] f55458f;
    public final int h;
    public final int f55459n;
    public final float[] f55460r;
    public final float[] f55461s;
    public final float[] f55462w;
    public boolean f55463x;
    public boolean f55464y;

    public d(r1 r1Var) {
        ?? obj = new Object();
        obj.f55450e = Long.MIN_VALUE;
        obj.f55452g = -1L;
        obj.f55451f = 0L;
        this.f55454a = obj;
        this.f55455b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f55457e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f55458f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f55460r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f55461s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f55462w = fArr5;
        this.f55456c = r1Var;
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
        this.f55459n = I;
        obj.f55447a = 500;
        obj.f55448b = 500;
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
            int i3 = this.h;
            if (i3 != 0 && i3 != 1) {
                if (i3 == 2 && f10 < 0.0f) {
                    return f10 / (-f11);
                }
            } else if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.F && i3 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f55464y) {
            this.F = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f55454a;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f55450e);
        int i11 = aVar.f55448b;
        if (i10 > i11) {
            i3 = i11;
        } else if (i10 >= 0) {
            i3 = i10;
        }
        aVar.f55453i = i3;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f55452g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.f55454a;
        float f10 = aVar.d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f55449c);
        if (abs != 0 && (count = (r1Var = this.H).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i3 >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
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
