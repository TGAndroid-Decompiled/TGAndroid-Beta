package ph;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
public final class d2 {
    public final Context f41421a;
    public final a2 f41422b;
    public final a2 f41423c;
    public final WindowManager e;
    public final View f41424f;
    public final WindowManager.LayoutParams f41425g;
    public ValueAnimator f41426i;
    public int f41427j;
    public int f41428k;
    public int f41429l;
    public float f41430m;
    public int f41431n;
    public RadialGradient f41435r;
    public final Paint f41436s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f41432o = 0.75f;
    public float f41433p = 1.0f;
    public final Matrix f41434q = new Matrix();

    public d2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f41436s = paint;
        this.f41421a = context;
        this.e = windowManager;
        this.f41424f = view;
        this.f41425g = layoutParams;
        this.f41422b = new a2(this, context, 0);
        this.f41423c = new a2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        if (f10 < 0.5f) {
            return i0.a.d(Utilities.clamp(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(c2 c2Var) {
        c2Var.setInvert(this.h);
        this.d.add(c2Var);
    }

    public final void b(Canvas canvas, boolean z4) {
        if (this.f41435r != null) {
            g();
            this.f41435r.setLocalMatrix(this.f41434q);
            Paint paint = this.f41436s;
            if (z4) {
                canvas.drawRect(0.0f, 0.0f, this.f41427j, this.f41428k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            a2 a2Var = this.f41423c;
            rectF.set(0.0f, 0.0f, a2Var.getMeasuredWidth(), a2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(z8 z8Var) {
        h(this.f41433p);
        e(1.0f, 320L, z8Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f41426i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41426i = null;
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
        this.f41426i = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 14));
        this.f41426i.addListener(new lh.k5(this, f10, runnable, 3));
        this.f41426i.setDuration(j10);
        this.f41426i.setInterpolator(nr.f27348i);
        this.f41426i.start();
    }

    public final void g() {
        int i10 = this.f41429l;
        int i11 = this.f41431n;
        a2 a2Var = this.f41422b;
        if (i10 != i11 || this.f41427j != a2Var.getMeasuredWidth() || this.f41428k != a2Var.getMeasuredHeight() || Math.abs(this.f41430m - this.h) > 0.005f) {
            this.f41429l = this.f41431n;
            this.f41427j = a2Var.getMeasuredWidth();
            int measuredHeight = a2Var.getMeasuredHeight();
            this.f41428k = measuredHeight;
            this.f41430m = this.h;
            if (this.f41427j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f41427j;
                    int i13 = this.f41428k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f41435r = android.support.v4.media.session.y.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f41431n) / 255.0f, Color.green(this.f41431n) / 255.0f, Color.blue(this.f41431n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f41431n) / 255.0f, Color.green(this.f41431n) / 255.0f, Color.blue(this.f41431n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f41427j;
                    int i15 = this.f41428k;
                    this.f41435r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f41431n, 0), this.f41431n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f41436s.setShader(this.f41435r);
                a2Var.invalidate();
                this.f41423c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f41424f;
        if (view != null && (layoutParams = this.f41425g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f41421a);
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
                ((c2) arrayList.get(i10)).setInvert(this.h);
                ((c2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f41436s.setAlpha((int) (this.f41433p * 255.0f * this.h));
                this.f41422b.invalidate();
                this.f41423c.invalidate();
                return;
            }
        }
    }
}
