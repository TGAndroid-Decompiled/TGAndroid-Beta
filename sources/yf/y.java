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
public final class y extends View {
    public w E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final rg.b0 I;
    public int f50169a;
    public long f50170b;
    public int f50171c;
    public qf.b d;
    public final AtomicInteger f50172e;
    public int f50173f;
    public final Paint h;
    public final Paint f50174n;
    public WindowManager f50175r;
    public WindowManager.LayoutParams f50176s;
    public Window v;
    public HandlerThread f50177w;
    public v f50178x;
    public View f50179y;

    public y(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f50169a = 0;
        this.f50170b = 0L;
        this.f50171c = 0;
        this.f50172e = new AtomicInteger(0);
        this.f50173f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f50174n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new rg.b0(this, 10);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        x[] values;
        for (x xVar : x.values()) {
            if (Build.VERSION.SDK_INT >= xVar.f50167c) {
                long metric = frameMetrics.getMetric(xVar.f50165a);
                xVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = xVar.f50168e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    xVar.f50168e = d;
                }
            } else {
                xVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static y b(LaunchActivity launchActivity, org.telegram.ui.j0 j0Var) {
        y yVar = new y(launchActivity);
        yVar.setObservedView(j0Var);
        yVar.f50175r = (WindowManager) launchActivity.getSystemService("window");
        yVar.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        yVar.f50176s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = yVar.f50176s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        yVar.f50175r.addView(yVar, yVar.f50176s);
        yVar.G.set(true);
        if (yVar.F.getAndSet(true)) {
            return yVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        yVar.f50177w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(yVar.f50177w.getLooper());
        ?? obj = new Object();
        yVar.f50178x = obj;
        yVar.v.addOnFrameMetricsAvailableListener(obj, handler);
        yVar.d = new qf.b(yVar, 3);
        Choreographer.getInstance().postFrameCallback(yVar.d);
        View view = yVar.f50179y;
        if (view != null) {
            yVar.E = new w(yVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(yVar.E);
            }
        }
        yVar.H.post(yVar.I);
        return yVar;
    }

    public final void c() {
        v vVar;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.v;
        if (window != null && (vVar = this.f50178x) != null) {
            window.removeOnFrameMetricsAvailableListener(vVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f50179y;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.f50177w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f50175r != null && this.G.getAndSet(false)) {
            try {
                this.f50175r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f50175r = null;
        this.f50176s = null;
        this.v = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        String str;
        boolean z10;
        String format;
        double d;
        y yVar = this;
        float dp2 = AndroidUtilities.dp(8.0f);
        float dp3 = AndroidUtilities.dp(11.0f);
        int length = x.values().length + 9;
        if (yVar.getWidth() > 0) {
            dp = yVar.getWidth();
        } else {
            dp = AndroidUtilities.dp(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, dp, (length * dp3) + (2.0f * dp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), yVar.h);
        float f7 = dp2 + dp3;
        x[] values = x.values();
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
            Paint paint = yVar.f50174n;
            if (i10 < length2) {
                int i11 = length2;
                x xVar = values[i10];
                int i12 = i10;
                if (Build.VERSION.SDK_INT >= xVar.f50167c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = xVar.f50166b;
                long j13 = j12;
                if (z10) {
                    long j14 = xVar.d;
                    if (j14 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j14 / 1000000.0d), Double.valueOf(xVar.f50168e));
                        switch (xVar.ordinal()) {
                            case 0:
                            case 7:
                                j12 = j13 + xVar.d;
                                d10 += xVar.f50168e;
                                continue;
                                canvas.drawText(format, dp2, f7, paint);
                                f7 += f11;
                                i10 = i12 + 1;
                                yVar = this;
                                f10 = f11;
                                length2 = i11;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j3 += xVar.d;
                                d11 += xVar.f50168e;
                                break;
                            case 5:
                                long j15 = xVar.d;
                                j3 += j15;
                                d = xVar.f50168e;
                                d11 += d;
                                j10 += j15;
                                d13 += d;
                                break;
                            case 6:
                                j10 += xVar.d;
                                d = xVar.f50168e;
                                d13 += d;
                                break;
                            case 8:
                                j11 += xVar.d;
                                d12 += xVar.f50168e;
                                break;
                        }
                        j12 = j13;
                        canvas.drawText(format, dp2, f7, paint);
                        f7 += f11;
                        i10 = i12 + 1;
                        yVar = this;
                        f10 = f11;
                        length2 = i11;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j12 = j13;
                canvas.drawText(format, dp2, f7, paint);
                f7 += f11;
                i10 = i12 + 1;
                yVar = this;
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
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f50171c)), dp2, f17, paint);
                float f18 = f17 + f11;
                if (this.f50179y != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f50173f)), dp2, f18, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((x.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.f50179y;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.f50179y = view;
        if (this.F.get() && (view2 = this.f50179y) != null) {
            this.E = new w(this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.E);
            }
        }
    }
}
