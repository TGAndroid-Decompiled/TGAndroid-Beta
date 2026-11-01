package rf;

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
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ew;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l0;
public final class v extends View {
    public View D;
    public nf.a E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final ew I;
    public int f46570a;
    public long f46571b;
    public int f46572c;
    public jf.b d;
    public final AtomicInteger e;
    public int f46573f;
    public final Paint h;
    public final Paint f46574n;
    public WindowManager f46575r;
    public WindowManager.LayoutParams f46576s;
    public Window f46577w;
    public HandlerThread f46578x;
    public t f46579y;

    public v(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f46570a = 0;
        this.f46571b = 0L;
        this.f46572c = 0;
        this.e = new AtomicInteger(0);
        this.f46573f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f46574n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new ew(this, 25);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(i0.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(i0.o1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        u[] values;
        for (u uVar : u.values()) {
            if (Build.VERSION.SDK_INT >= uVar.f46569c) {
                long metric = frameMetrics.getMetric(uVar.f46567a);
                uVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = uVar.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    uVar.e = d;
                }
            } else {
                uVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static v b(LaunchActivity launchActivity, l0 l0Var) {
        v vVar = new v(launchActivity);
        vVar.setObservedView(l0Var);
        vVar.f46575r = (WindowManager) launchActivity.getSystemService("window");
        vVar.f46577w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        vVar.f46576s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = i0.L(12);
        WindowManager.LayoutParams layoutParams2 = vVar.f46576s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = i0.L(260.0f);
        vVar.f46575r.addView(vVar, vVar.f46576s);
        vVar.G.set(true);
        if (vVar.F.getAndSet(true)) {
            return vVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        vVar.f46578x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(vVar.f46578x.getLooper());
        ?? obj = new Object();
        vVar.f46579y = obj;
        vVar.f46577w.addOnFrameMetricsAvailableListener(obj, handler);
        vVar.d = new jf.b(vVar, 3);
        Choreographer.getInstance().postFrameCallback(vVar.d);
        View view = vVar.D;
        if (view != null) {
            vVar.E = new nf.a(1, vVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(vVar.E);
            }
        }
        vVar.H.post(vVar.I);
        return vVar;
    }

    public final void c() {
        t tVar;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.f46577w;
        if (window != null && (tVar = this.f46579y) != null) {
            window.removeOnFrameMetricsAvailableListener(tVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.D;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.f46578x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f46575r != null && this.G.getAndSet(false)) {
            try {
                this.f46575r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f46575r = null;
        this.f46576s = null;
        this.f46577w = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        String str;
        boolean z10;
        String format;
        double d;
        v vVar = this;
        float L2 = i0.L(8.0f);
        float L3 = i0.L(11.0f);
        int length = u.values().length + 9;
        if (vVar.getWidth() > 0) {
            L = vVar.getWidth();
        } else {
            L = i0.L(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, L, (length * L3) + (2.0f * L2), i0.L(10.0f), i0.L(10.0f), vVar.h);
        float f7 = L2 + L3;
        u[] values = u.values();
        int length2 = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f10 = L3;
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f11 = f10;
            Paint paint = vVar.f46574n;
            if (i10 < length2) {
                int i11 = length2;
                u uVar = values[i10];
                int i12 = i10;
                if (Build.VERSION.SDK_INT >= uVar.f46569c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = uVar.f46568b;
                long j14 = j13;
                if (z10) {
                    long j15 = uVar.d;
                    if (j15 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j15 / 1000000.0d), Double.valueOf(uVar.e));
                        switch (uVar.ordinal()) {
                            case 0:
                            case 7:
                                j13 = j14 + uVar.d;
                                d10 += uVar.e;
                                continue;
                                canvas.drawText(format, L2, f7, paint);
                                f7 += f11;
                                i10 = i12 + 1;
                                vVar = this;
                                f10 = f11;
                                length2 = i11;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j10 += uVar.d;
                                d11 += uVar.e;
                                break;
                            case 5:
                                long j16 = uVar.d;
                                j10 += j16;
                                d = uVar.e;
                                d11 += d;
                                j11 += j16;
                                d13 += d;
                                break;
                            case 6:
                                j11 += uVar.d;
                                d = uVar.e;
                                d13 += d;
                                break;
                            case 8:
                                j12 += uVar.d;
                                d12 += uVar.e;
                                break;
                        }
                        j13 = j14;
                        canvas.drawText(format, L2, f7, paint);
                        f7 += f11;
                        i10 = i12 + 1;
                        vVar = this;
                        f10 = f11;
                        length2 = i11;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j13 = j14;
                canvas.drawText(format, L2, f7, paint);
                f7 += f11;
                i10 = i12 + 1;
                vVar = this;
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
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), L2, f12, paint);
                float f13 = f12 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j19 / 1000000.0d), Double.valueOf(d15)), L2, f13, paint);
                float f14 = f13 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d14)), L2, f14, paint);
                float f15 = f14 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j17 / 1000000.0d), Double.valueOf(d10)), L2, f15, paint);
                float f16 = f15 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L2, f16, paint);
                float f17 = f16 + f11 + f11;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f46572c)), L2, f17, paint);
                float f18 = f17 + f11;
                if (this.D != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f46573f)), L2, f18, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i0.L(210.0f), ((u.values().length + 9) * i0.L(11.0f)) + (i0.L(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.D;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.D = view;
        if (this.F.get() && (view2 = this.D) != null) {
            this.E = new nf.a(1, this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.E);
            }
        }
    }
}
