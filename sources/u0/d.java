package u0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.r1;
import org.telegram.ui.Wallet.p5;
public final class d implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public final r1 G;
    public final a f48579a;
    public final AccelerateInterpolator f48580b;
    public final r1 f48581c;
    public p5 d;
    public final float[] f48582e;
    public final float[] f48583f;
    public final int h;
    public final int f48584n;
    public final float[] f48585r;
    public final float[] f48586s;
    public final float[] v;
    public boolean f48587w;
    public boolean f48588x;
    public boolean f48589y;

    public d(r1 r1Var) {
        ?? obj = new Object();
        obj.f48575e = Long.MIN_VALUE;
        obj.f48577g = -1L;
        obj.f48576f = 0L;
        this.f48579a = obj;
        this.f48580b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f48582e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f48583f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f48585r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f48586s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.v = fArr5;
        this.f48581c = r1Var;
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
        this.f48584n = H;
        obj.f48572a = 500;
        obj.f48573b = 500;
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
        if (this.f48588x) {
            this.E = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f48579a;
        int i11 = (int) (currentAnimationTimeMillis - aVar.f48575e);
        int i12 = aVar.f48573b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f48578i = i10;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f48577g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.f48579a;
        float f7 = aVar.d;
        int abs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.f48574c);
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
        throw new UnsupportedOperationException("Method not decompiled: u0.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
