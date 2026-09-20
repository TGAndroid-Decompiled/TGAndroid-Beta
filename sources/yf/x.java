package yf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class x extends View {
    public tf.a E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final p8.b I;
    public int f47164a;
    public long f47165b;
    public int f47166c;
    public pf.b d;
    public final AtomicInteger e;
    public int f47167f;
    public final Paint h;
    public final Paint f47168n;
    public WindowManager f47169r;
    public WindowManager.LayoutParams f47170s;
    public Window v;
    public HandlerThread f47171w;
    public v f47172x;
    public View f47173y;

    public x(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f47164a = 0;
        this.f47165b = 0L;
        this.f47166c = 0;
        this.e = new AtomicInteger(0);
        this.f47167f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f47168n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new p8.b(this, 12);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        w[] values;
        for (w wVar : w.values()) {
            if (Build.VERSION.SDK_INT >= wVar.f47163c) {
                long metric = frameMetrics.getMetric(wVar.f47161a);
                wVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = wVar.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    wVar.e = d;
                }
            } else {
                wVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static x b(LaunchActivity launchActivity, org.telegram.ui.j0 j0Var) {
        x xVar = new x(launchActivity);
        xVar.setObservedView(j0Var);
        xVar.f47169r = (WindowManager) launchActivity.getSystemService("window");
        xVar.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        xVar.f47170s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = xVar.f47170s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        xVar.f47169r.addView(xVar, xVar.f47170s);
        xVar.G.set(true);
        if (xVar.F.getAndSet(true)) {
            return xVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        xVar.f47171w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(xVar.f47171w.getLooper());
        ?? obj = new Object();
        xVar.f47172x = obj;
        xVar.v.addOnFrameMetricsAvailableListener(obj, handler);
        xVar.d = new pf.b(xVar, 3);
        Choreographer.getInstance().postFrameCallback(xVar.d);
        View view = xVar.f47173y;
        if (view != null) {
            xVar.E = new tf.a(1, xVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(xVar.E);
            }
        }
        xVar.H.post(xVar.I);
        return xVar;
    }

    public final void c() {
        v vVar;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.v;
        if (window != null && (vVar = this.f47172x) != null) {
            window.removeOnFrameMetricsAvailableListener(vVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f47173y;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.f47171w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f47169r != null && this.G.getAndSet(false)) {
            try {
                this.f47169r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f47169r = null;
        this.f47170s = null;
        this.v = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        String str;
        boolean z10;
        String format;
        double d;
        x xVar = this;
        float dp2 = AndroidUtilities.dp(8.0f);
        float dp3 = AndroidUtilities.dp(11.0f);
        int length = w.values().length + 9;
        if (xVar.getWidth() > 0) {
            dp = xVar.getWidth();
        } else {
            dp = AndroidUtilities.dp(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, dp, (length * dp3) + (2.0f * dp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), xVar.h);
        float f7 = dp2 + dp3;
        w[] values = w.values();
        int length2 = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f10 = dp3;
        long j3 = 0;
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            float f11 = f10;
            Paint paint = xVar.f47168n;
            if (i10 < length2) {
                int i11 = length2;
                w wVar = values[i10];
                int i12 = i10;
                if (Build.VERSION.SDK_INT >= wVar.f47163c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = wVar.f47162b;
                long j13 = j12;
                if (z10) {
                    long j14 = wVar.d;
                    if (j14 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j14 / 1000000.0d), Double.valueOf(wVar.e));
                        switch (wVar.ordinal()) {
                            case 0:
                            case 7:
                                j12 = j13 + wVar.d;
                                d10 += wVar.e;
                                continue;
                                canvas.drawText(format, dp2, f7, paint);
                                f7 += f11;
                                i10 = i12 + 1;
                                xVar = this;
                                f10 = f11;
                                length2 = i11;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j3 += wVar.d;
                                d11 += wVar.e;
                                break;
                            case 5:
                                long j15 = wVar.d;
                                j3 += j15;
                                d = wVar.e;
                                d11 += d;
                                j10 += j15;
                                d13 += d;
                                break;
                            case 6:
                                j10 += wVar.d;
                                d = wVar.e;
                                d13 += d;
                                break;
                            case 8:
                                j11 += wVar.d;
                                d12 += wVar.e;
                                break;
                        }
                        j12 = j13;
                        canvas.drawText(format, dp2, f7, paint);
                        f7 += f11;
                        i10 = i12 + 1;
                        xVar = this;
                        f10 = f11;
                        length2 = i11;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j12 = j13;
                canvas.drawText(format, dp2, f7, paint);
                f7 += f11;
                i10 = i12 + 1;
                xVar = this;
                f10 = f11;
                length2 = i11;
            } else {
                long j16 = j12;
                long max = Math.max(j3, Math.max(j10, j11));
                double d14 = d12;
                long j17 = j11;
                double d15 = d13;
                long j18 = j10;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f12 = f7 + f11;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j3 / 1000000.0d), Double.valueOf(d16)), dp2, f12, paint);
                float f13 = f12 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d15)), dp2, f13, paint);
                float f14 = f13 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j17 / 1000000.0d), Double.valueOf(d14)), dp2, f14, paint);
                float f15 = f14 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j16 / 1000000.0d), Double.valueOf(d10)), dp2, f15, paint);
                float f16 = f15 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp2, f16, paint);
                float f17 = f16 + f11 + f11;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f47166c)), dp2, f17, paint);
                float f18 = f17 + f11;
                if (this.f47173y != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f47167f)), dp2, f18, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((w.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.f47173y;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.f47173y = view;
        if (this.F.get() && (view2 = this.f47173y) != null) {
            this.E = new tf.a(1, this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.E);
            }
        }
    }
}
