package zf;

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
import p4.s0;
public final class y extends View {
    public vf.a E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final s0 I;
    public int f50219a;
    public long f50220b;
    public int f50221c;
    public r4.e d;
    public final AtomicInteger e;
    public int f50222f;
    public final Paint h;
    public final Paint f50223n;
    public WindowManager f50224r;
    public WindowManager.LayoutParams f50225s;
    public Window v;
    public HandlerThread f50226w;
    public w f50227x;
    public View f50228y;

    public y(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f50219a = 0;
        this.f50220b = 0L;
        this.f50221c = 0;
        this.e = new AtomicInteger(0);
        this.f50222f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f50223n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new s0(this, 16);
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
            if (Build.VERSION.SDK_INT >= xVar.f50218c) {
                long metric = frameMetrics.getMetric(xVar.f50216a);
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

    public static y b(LaunchActivity launchActivity, org.telegram.ui.l0 l0Var) {
        y yVar = new y(launchActivity);
        yVar.setObservedView(l0Var);
        yVar.f50224r = (WindowManager) launchActivity.getSystemService("window");
        yVar.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        yVar.f50225s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = yVar.f50225s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        yVar.f50224r.addView(yVar, yVar.f50225s);
        yVar.G.set(true);
        if (yVar.F.getAndSet(true)) {
            return yVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        yVar.f50226w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(yVar.f50226w.getLooper());
        ?? obj = new Object();
        yVar.f50227x = obj;
        yVar.v.addOnFrameMetricsAvailableListener(obj, handler);
        yVar.d = new r4.e(yVar, 3);
        Choreographer.getInstance().postFrameCallback(yVar.d);
        View view = yVar.f50228y;
        if (view != null) {
            yVar.E = new vf.a(1, yVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(yVar.E);
            }
        }
        yVar.H.post(yVar.I);
        return yVar;
    }

    public final void c() {
        w wVar;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.v;
        if (window != null && (wVar = this.f50227x) != null) {
            window.removeOnFrameMetricsAvailableListener(wVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f50228y;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.f50226w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f50224r != null && this.G.getAndSet(false)) {
            try {
                this.f50224r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f50224r = null;
        this.f50225s = null;
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
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f11 = f10;
            Paint paint = yVar.f50223n;
            if (i10 < length2) {
                int i11 = length2;
                x xVar = values[i10];
                int i12 = i10;
                if (Build.VERSION.SDK_INT >= xVar.f50218c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = xVar.f50217b;
                long j14 = j13;
                if (z10) {
                    long j15 = xVar.d;
                    if (j15 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j15 / 1000000.0d), Double.valueOf(xVar.e));
                        switch (xVar.ordinal()) {
                            case 0:
                            case 7:
                                j13 = j14 + xVar.d;
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
                                j10 += xVar.d;
                                d11 += xVar.e;
                                break;
                            case 5:
                                long j16 = xVar.d;
                                j10 += j16;
                                d = xVar.e;
                                d11 += d;
                                j11 += j16;
                                d13 += d;
                                break;
                            case 6:
                                j11 += xVar.d;
                                d = xVar.e;
                                d13 += d;
                                break;
                            case 8:
                                j12 += xVar.d;
                                d12 += xVar.e;
                                break;
                        }
                        j13 = j14;
                        canvas.drawText(format, dp2, f7, paint);
                        f7 += f11;
                        i10 = i12 + 1;
                        yVar = this;
                        f10 = f11;
                        length2 = i11;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j13 = j14;
                canvas.drawText(format, dp2, f7, paint);
                f7 += f11;
                i10 = i12 + 1;
                yVar = this;
                f10 = f11;
                length2 = i11;
            } else {
                long j17 = j13;
                long max = Math.max(j10, Math.max(j11, j12));
                double d14 = d12;
                long j18 = j12;
                double d15 = d13;
                long j19 = j11;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f12 = f7 + f11;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), dp2, f12, paint);
                float f13 = f12 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j19 / 1000000.0d), Double.valueOf(d15)), dp2, f13, paint);
                float f14 = f13 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d14)), dp2, f14, paint);
                float f15 = f14 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j17 / 1000000.0d), Double.valueOf(d10)), dp2, f15, paint);
                float f16 = f15 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp2, f16, paint);
                float f17 = f16 + f11 + f11;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f50221c)), dp2, f17, paint);
                float f18 = f17 + f11;
                if (this.f50228y != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f50222f)), dp2, f18, paint);
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
        View view3 = this.f50228y;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.f50228y = view;
        if (this.F.get() && (view2 = this.f50228y) != null) {
            this.E = new vf.a(1, this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.E);
            }
        }
    }
}
