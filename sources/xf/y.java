package xf;

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
import sg.a1;
public final class y extends View {
    public w E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final a1 I;
    public int f45179a;
    public long f45180b;
    public int f45181c;
    public pf.b d;
    public final AtomicInteger e;
    public int f45182f;
    public final Paint h;
    public final Paint f45183n;
    public WindowManager f45184r;
    public WindowManager.LayoutParams f45185s;
    public Window v;
    public HandlerThread f45186w;
    public v f45187x;
    public View f45188y;

    public y(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f45179a = 0;
        this.f45180b = 0L;
        this.f45181c = 0;
        this.e = new AtomicInteger(0);
        this.f45182f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f45183n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new a1(this, 6);
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
            if (Build.VERSION.SDK_INT >= xVar.f45178c) {
                long metric = frameMetrics.getMetric(xVar.f45176a);
                xVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = xVar.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    xVar.e = d;
                }
            } else {
                xVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static y b(LaunchActivity launchActivity, org.telegram.ui.k0 k0Var) {
        y yVar = new y(launchActivity);
        yVar.setObservedView(k0Var);
        yVar.f45184r = (WindowManager) launchActivity.getSystemService("window");
        yVar.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        yVar.f45185s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = yVar.f45185s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        yVar.f45184r.addView(yVar, yVar.f45185s);
        yVar.G.set(true);
        if (yVar.F.getAndSet(true)) {
            return yVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        yVar.f45186w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(yVar.f45186w.getLooper());
        ?? obj = new Object();
        yVar.f45187x = obj;
        yVar.v.addOnFrameMetricsAvailableListener(obj, handler);
        yVar.d = new pf.b(yVar, 3);
        Choreographer.getInstance().postFrameCallback(yVar.d);
        View view = yVar.f45188y;
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
        if (window != null && (vVar = this.f45187x) != null) {
            window.removeOnFrameMetricsAvailableListener(vVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f45188y;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.f45186w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f45184r != null && this.G.getAndSet(false)) {
            try {
                this.f45184r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f45184r = null;
        this.f45185s = null;
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
            Paint paint = yVar.f45183n;
            if (i10 < length2) {
                int i11 = length2;
                x xVar = values[i10];
                int i12 = i10;
                if (Build.VERSION.SDK_INT >= xVar.f45178c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = xVar.f45177b;
                long j13 = j12;
                if (z10) {
                    long j14 = xVar.d;
                    if (j14 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j14 / 1000000.0d), Double.valueOf(xVar.e));
                        switch (xVar.ordinal()) {
                            case 0:
                            case 7:
                                j12 = j13 + xVar.d;
                                d10 += xVar.e;
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
                                d11 += xVar.e;
                                break;
                            case 5:
                                long j15 = xVar.d;
                                j3 += j15;
                                d = xVar.e;
                                d11 += d;
                                j10 += j15;
                                d13 += d;
                                break;
                            case 6:
                                j10 += xVar.d;
                                d = xVar.e;
                                d13 += d;
                                break;
                            case 8:
                                j11 += xVar.d;
                                d12 += xVar.e;
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
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f45181c)), dp2, f17, paint);
                float f18 = f17 + f11;
                if (this.f45188y != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f45182f)), dp2, f18, paint);
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
        View view3 = this.f45188y;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.f45188y = view;
        if (this.F.get() && (view2 = this.f45188y) != null) {
            this.E = new w(this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.E);
            }
        }
    }
}
