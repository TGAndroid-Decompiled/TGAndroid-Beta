package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
public final class c2 {
    public final Context f45147a;
    public final z1 f45148b;
    public final z1 f45149c;
    public final WindowManager f45150e;
    public final View f45151f;
    public final WindowManager.LayoutParams f45152g;
    public ValueAnimator f45153i;
    public int f45154j;
    public int f45155k;
    public int f45156l;
    public float f45157m;
    public int f45158n;
    public RadialGradient f45162r;
    public final Paint f45163s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f45159o = 0.75f;
    public float f45160p = 1.0f;
    public final Matrix f45161q = new Matrix();

    public c2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f45163s = paint;
        this.f45147a = context;
        this.f45150e = windowManager;
        this.f45151f = view;
        this.f45152g = layoutParams;
        this.f45148b = new z1(this, context, 0);
        this.f45149c = new z1(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        if (f10 < 0.5f) {
            return i0.a.d(Utilities.clamp(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(b2 b2Var) {
        b2Var.setInvert(this.h);
        this.d.add(b2Var);
    }

    public final void b(Canvas canvas, boolean z4) {
        if (this.f45162r != null) {
            g();
            this.f45162r.setLocalMatrix(this.f45161q);
            Paint paint = this.f45163s;
            if (z4) {
                canvas.drawRect(0.0f, 0.0f, this.f45154j, this.f45155k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            z1 z1Var = this.f45149c;
            rectF.set(0.0f, 0.0f, z1Var.getMeasuredWidth(), z1Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(w8 w8Var) {
        h(this.f45160p);
        e(1.0f, 320L, w8Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f45153i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45153i = null;
        }
        if (j10 <= 0) {
            this.h = f10;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f45153i = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 14));
        this.f45153i.addListener(new mh.k5(this, f10, runnable, 3));
        this.f45153i.setDuration(j10);
        this.f45153i.setInterpolator(pr.f30170i);
        this.f45153i.start();
    }

    public final void g() {
        int i10 = this.f45156l;
        int i11 = this.f45158n;
        z1 z1Var = this.f45148b;
        if (i10 != i11 || this.f45154j != z1Var.getMeasuredWidth() || this.f45155k != z1Var.getMeasuredHeight() || Math.abs(this.f45157m - this.h) > 0.005f) {
            this.f45156l = this.f45158n;
            this.f45154j = z1Var.getMeasuredWidth();
            int measuredHeight = z1Var.getMeasuredHeight();
            this.f45155k = measuredHeight;
            this.f45157m = this.h;
            if (this.f45154j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f45154j;
                    int i13 = this.f45155k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f45162r = android.support.v4.media.session.y.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f45158n) / 255.0f, Color.green(this.f45158n) / 255.0f, Color.blue(this.f45158n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f45158n) / 255.0f, Color.green(this.f45158n) / 255.0f, Color.blue(this.f45158n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f45154j;
                    int i15 = this.f45155k;
                    this.f45162r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f45158n, 0), this.f45158n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f45163s.setShader(this.f45162r);
                z1Var.invalidate();
                this.f45149c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f45151f;
        if (view != null && (layoutParams = this.f45152g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f45150e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f45147a);
        if (findActivity == null) {
            findActivity = LaunchActivity.D1;
        }
        if (findActivity != null && !findActivity.isFinishing() && (window = findActivity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f10;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((b2) arrayList.get(i10)).setInvert(this.h);
                ((b2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f45163s.setAlpha((int) (this.f45160p * 255.0f * this.h));
                this.f45148b.invalidate();
                this.f45149c.invalidate();
                return;
            }
        }
    }
}
