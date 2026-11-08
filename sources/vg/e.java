package vg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import di.d2;
import fi.l9;
import java.util.ArrayList;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.s81;
import ug.q1;
public abstract class e extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final int K = 0;
    public volatile boolean D;
    public volatile int E;
    public long F;
    public volatile int G;
    public final ArrayList H;
    public float I;
    public float J;
    public final f f57362a;
    public final GestureDetector f57363b;
    public q1 f57364c;
    public ValueAnimator d;
    public boolean f57365e;
    public boolean f57366f;
    public boolean h;
    public boolean f57367n;
    public volatile boolean f57368r;
    public boolean f57369s;
    public Runnable f57370w;
    public volatile float f57371x;
    public volatile boolean f57372y;

    public e(Context context) {
        super(context);
        this.f57366f = true;
        this.f57371x = 1.0f;
        this.H = new ArrayList();
        this.I = 1.0f;
        this.J = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.f57362a = new f(context, 1, 4);
        setRenderer(new d(this));
        setRenderMode(0);
        this.f57363b = new GestureDetector(context, new x9(1, this));
    }

    public static void a(e eVar, int i7) {
        if (eVar.f57365e && i7 == eVar.E) {
            b bVar = new b(eVar, i7, 0);
            if (Build.VERSION.SDK_INT >= 29 && eVar.isHardwareAccelerated()) {
                eVar.getViewTreeObserver().registerFrameCommitCallback(bVar);
                eVar.getRootView().invalidate();
                return;
            }
            eVar.postOnAnimation(bVar);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeAllListeners();
        this.d.cancel();
        this.d = null;
    }

    public final void c(ArrayList arrayList) {
        int i7;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.H) {
            try {
                int size = arrayList.size();
                i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Runnable runnable = (Runnable) obj;
                    if (this.H.remove(runnable)) {
                        arrayList2.add(runnable);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void d() {
        b();
        f fVar = this.f57362a;
        float f10 = fVar.d;
        float f11 = fVar.f57379i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new l9(this, f10, f11, 7));
        this.d.addListener(new s81(this, 21));
        this.d.start();
        q1 q1Var = this.f57364c;
        if (q1Var != null) {
            q1Var.b(Math.abs(f10 + f11));
        }
    }

    @Override
    public final void doFrame(long j3) {
        float f10;
        if (this.f57365e && !this.f57366f && !this.f57368r) {
            if (Build.VERSION.SDK_INT < 34) {
                f10 = getAlpha();
            } else {
                f10 = 1.0f;
            }
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                f10 *= ((View) parent).getAlpha();
            }
            this.f57371x = f10;
            long j10 = this.F;
            int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i7 == 0 || j3 >= j10) {
                if (i7 == 0 || j3 - j10 > 16666666) {
                    this.F = j3;
                }
                this.F += 16666666;
                requestRender();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void e() {
        if (this.f57365e && !this.f57366f && this.h && !this.f57367n && this.d == null) {
            float f10 = this.f57362a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
            this.d = ofFloat;
            ofFloat.setDuration(Math.round(10540.18445322793d));
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new ti.d(this, 4));
            this.d.start();
        }
    }

    public final void f() {
        if (this.J == 1.0f) {
            getHolder().setSizeFromLayout();
        } else if (getWidth() > 0 && getHeight() > 0) {
            getHolder().setFixedSize(Math.round(getWidth() * this.J), Math.round(getHeight() * this.J));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57365e = true;
        setPaused(this.f57366f);
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        this.f57365e = false;
        this.f57369s = false;
        this.G++;
        Choreographer.getInstance().removeFrameCallback(this);
        this.F = 0L;
        b();
        super.onDetachedFromWindow();
        synchronized (this.H) {
            arrayList = new ArrayList(this.H);
        }
        c(arrayList);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.J > 1.0f) {
            f();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.f57367n = false;
            d();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return this.f57363b.onTouchEvent(motionEvent);
    }

    public void setIdleAnimationEnabled(boolean z9) {
        this.h = z9;
        if (z9) {
            e();
        } else {
            b();
        }
    }

    public void setPaused(boolean z9) {
        this.f57366f = z9;
        Choreographer.getInstance().removeFrameCallback(this);
        this.F = 0L;
        if (z9) {
            b();
        } else if (this.f57365e && !this.f57368r) {
            e();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void setRenderScale(float f10) {
        float max = Math.max(1.0f, Math.min(this.J, f10));
        if (this.I == max) {
            return;
        }
        this.I = max;
        this.f57362a.h = max / this.J;
    }

    public void setStarParticlesView(q1 q1Var) {
        this.f57364c = q1Var;
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.E++;
        this.D = false;
        this.f57372y = false;
        this.f57369s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.E++;
        this.D = false;
        this.f57372y = false;
        this.f57369s = false;
        super.surfaceDestroyed(surfaceHolder);
        synchronized (this.H) {
            arrayList = new ArrayList(this.H);
        }
        c(arrayList);
    }

    @Override
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        ArrayList arrayList;
        synchronized (this.H) {
            this.H.add(new d2(4, runnable));
            arrayList = new ArrayList(this.H);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new u9.f(11, this, arrayList));
    }
}
