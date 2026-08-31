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
public final class d2 {
    public final Context f45181a;
    public final a2 f45182b;
    public final a2 f45183c;
    public final WindowManager f45184e;
    public final View f45185f;
    public final WindowManager.LayoutParams f45186g;
    public ValueAnimator f45187i;
    public int f45188j;
    public int f45189k;
    public int f45190l;
    public float f45191m;
    public int f45192n;
    public RadialGradient f45196r;
    public final Paint f45197s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f45193o = 0.75f;
    public float f45194p = 1.0f;
    public final Matrix f45195q = new Matrix();

    public d2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f45197s = paint;
        this.f45181a = context;
        this.f45184e = windowManager;
        this.f45185f = view;
        this.f45186g = layoutParams;
        this.f45182b = new a2(this, context, 0);
        this.f45183c = new a2(this, context, 1);
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
        if (this.f45196r != null) {
            g();
            this.f45196r.setLocalMatrix(this.f45195q);
            Paint paint = this.f45197s;
            if (z4) {
                canvas.drawRect(0.0f, 0.0f, this.f45188j, this.f45189k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            a2 a2Var = this.f45183c;
            rectF.set(0.0f, 0.0f, a2Var.getMeasuredWidth(), a2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(x8 x8Var) {
        h(this.f45194p);
        e(1.0f, 320L, x8Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f45187i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45187i = null;
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
        this.f45187i = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 14));
        this.f45187i.addListener(new mh.k5(this, f10, runnable, 3));
        this.f45187i.setDuration(j10);
        this.f45187i.setInterpolator(pr.f30185i);
        this.f45187i.start();
    }

    public final void g() {
        int i10 = this.f45190l;
        int i11 = this.f45192n;
        a2 a2Var = this.f45182b;
        if (i10 != i11 || this.f45188j != a2Var.getMeasuredWidth() || this.f45189k != a2Var.getMeasuredHeight() || Math.abs(this.f45191m - this.h) > 0.005f) {
            this.f45190l = this.f45192n;
            this.f45188j = a2Var.getMeasuredWidth();
            int measuredHeight = a2Var.getMeasuredHeight();
            this.f45189k = measuredHeight;
            this.f45191m = this.h;
            if (this.f45188j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f45188j;
                    int i13 = this.f45189k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f45196r = android.support.v4.media.session.y.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f45192n) / 255.0f, Color.green(this.f45192n) / 255.0f, Color.blue(this.f45192n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f45192n) / 255.0f, Color.green(this.f45192n) / 255.0f, Color.blue(this.f45192n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f45188j;
                    int i15 = this.f45189k;
                    this.f45196r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f45192n, 0), this.f45192n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f45197s.setShader(this.f45196r);
                a2Var.invalidate();
                this.f45183c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f45185f;
        if (view != null && (layoutParams = this.f45186g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f45184e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f45181a);
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
                this.f45197s.setAlpha((int) (this.f45194p * 255.0f * this.h));
                this.f45182b.invalidate();
                this.f45183c.invalidate();
                return;
            }
        }
    }
}
