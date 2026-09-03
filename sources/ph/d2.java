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
import org.telegram.ui.Components.mr;
import org.telegram.ui.LaunchActivity;
public final class d2 {
    public final Context f41471a;
    public final a2 f41472b;
    public final a2 f41473c;
    public final WindowManager e;
    public final View f41474f;
    public final WindowManager.LayoutParams f41475g;
    public ValueAnimator f41476i;
    public int f41477j;
    public int f41478k;
    public int f41479l;
    public float f41480m;
    public int f41481n;
    public RadialGradient f41485r;
    public final Paint f41486s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f41482o = 0.75f;
    public float f41483p = 1.0f;
    public final Matrix f41484q = new Matrix();

    public d2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f41486s = paint;
        this.f41471a = context;
        this.e = windowManager;
        this.f41474f = view;
        this.f41475g = layoutParams;
        this.f41472b = new a2(this, context, 0);
        this.f41473c = new a2(this, context, 1);
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
        if (this.f41485r != null) {
            g();
            this.f41485r.setLocalMatrix(this.f41484q);
            Paint paint = this.f41486s;
            if (z4) {
                canvas.drawRect(0.0f, 0.0f, this.f41477j, this.f41478k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            a2 a2Var = this.f41473c;
            rectF.set(0.0f, 0.0f, a2Var.getMeasuredWidth(), a2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(y8 y8Var) {
        h(this.f41483p);
        e(1.0f, 320L, y8Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f41476i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41476i = null;
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
        this.f41476i = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 14));
        this.f41476i.addListener(new lh.k5(this, f10, runnable, 3));
        this.f41476i.setDuration(j10);
        this.f41476i.setInterpolator(mr.f27124i);
        this.f41476i.start();
    }

    public final void g() {
        int i10 = this.f41479l;
        int i11 = this.f41481n;
        a2 a2Var = this.f41472b;
        if (i10 != i11 || this.f41477j != a2Var.getMeasuredWidth() || this.f41478k != a2Var.getMeasuredHeight() || Math.abs(this.f41480m - this.h) > 0.005f) {
            this.f41479l = this.f41481n;
            this.f41477j = a2Var.getMeasuredWidth();
            int measuredHeight = a2Var.getMeasuredHeight();
            this.f41478k = measuredHeight;
            this.f41480m = this.h;
            if (this.f41477j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f41477j;
                    int i13 = this.f41478k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f41485r = android.support.v4.media.session.y.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f41481n) / 255.0f, Color.green(this.f41481n) / 255.0f, Color.blue(this.f41481n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f41481n) / 255.0f, Color.green(this.f41481n) / 255.0f, Color.blue(this.f41481n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f41477j;
                    int i15 = this.f41478k;
                    this.f41485r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f41481n, 0), this.f41481n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f41486s.setShader(this.f41485r);
                a2Var.invalidate();
                this.f41473c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f41474f;
        if (view != null && (layoutParams = this.f41475g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f41471a);
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
                this.f41486s.setAlpha((int) (this.f41483p * 255.0f * this.h));
                this.f41472b.invalidate();
                this.f41473c.invalidate();
                return;
            }
        }
    }
}
