package vh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k40;
public final class z1 {
    public final Context f52244a;
    public final w1 f52245b;
    public final w1 f52246c;
    public final WindowManager e;
    public final View f52247f;
    public final WindowManager.LayoutParams f52248g;
    public ValueAnimator f52249i;
    public int f52250j;
    public int f52251k;
    public int f52252l;
    public float f52253m;
    public int f52254n;
    public RadialGradient f52258r;
    public final Paint f52259s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f52255o = 0.75f;
    public float f52256p = 1.0f;
    public final Matrix f52257q = new Matrix();

    public z1(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f52259s = paint;
        this.f52244a = context;
        this.e = windowManager;
        this.f52247f = view;
        this.f52248g = layoutParams;
        this.f52245b = new w1(this, context, 0);
        this.f52246c = new w1(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        if (f7 < 0.5f) {
            return i0.b.f(Utilities.i(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.b.f(Utilities.i((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(y1 y1Var) {
        y1Var.setInvert(this.h);
        this.d.add(y1Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f52258r != null) {
            g();
            this.f52258r.setLocalMatrix(this.f52257q);
            Paint paint = this.f52259s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f52250j, this.f52251k, paint);
                return;
            }
            RectF rectF = org.telegram.messenger.i0.P;
            w1 w1Var = this.f52246c;
            rectF.set(0.0f, 0.0f, w1Var.getMeasuredWidth(), w1Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) - 2, org.telegram.messenger.i0.L(12.0f) - 2, paint);
        }
    }

    public final void c(n7 n7Var) {
        h(this.f52256p);
        e(1.0f, 320L, n7Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f52249i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52249i = null;
        }
        if (j10 <= 0) {
            this.h = f7;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f52249i = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 26));
        this.f52249i.addListener(new k40(this, f7, runnable, 4));
        this.f52249i.setDuration(j10);
        this.f52249i.setInterpolator(gr.f26525i);
        this.f52249i.start();
    }

    public final void g() {
        int i10 = this.f52252l;
        int i11 = this.f52254n;
        w1 w1Var = this.f52245b;
        if (i10 != i11 || this.f52250j != w1Var.getMeasuredWidth() || this.f52251k != w1Var.getMeasuredHeight() || Math.abs(this.f52253m - this.h) > 0.005f) {
            this.f52252l = this.f52254n;
            this.f52250j = w1Var.getMeasuredWidth();
            int measuredHeight = w1Var.getMeasuredHeight();
            this.f52251k = measuredHeight;
            this.f52253m = this.h;
            if (this.f52250j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f52250j;
                    int i13 = this.f52251k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {org.telegram.messenger.i0.T1(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f52258r = android.support.v4.media.session.w.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f52254n) / 255.0f, Color.green(this.f52254n) / 255.0f, Color.blue(this.f52254n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f52254n) / 255.0f, Color.green(this.f52254n) / 255.0f, Color.blue(this.f52254n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f52250j;
                    int i15 = this.f52251k;
                    this.f52258r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.b.o(this.f52254n, 0), this.f52254n}, new float[]{org.telegram.messenger.i0.T1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f52259s.setShader(this.f52258r);
                w1Var.invalidate();
                this.f52246c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f52247f;
        if (view != null && (layoutParams = this.f52248g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = org.telegram.messenger.i0.W(this.f52244a);
        if (W == null) {
            W = LaunchActivity.I1;
        }
        if (W != null && !W.isFinishing() && (window = W.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f7;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((y1) arrayList.get(i10)).setInvert(this.h);
                ((y1) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f52259s.setAlpha((int) (this.f52256p * 255.0f * this.h));
                this.f52245b.invalidate();
                this.f52246c.invalidate();
                return;
            }
        }
    }
}
