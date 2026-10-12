package tg;

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
import bi.d3;
import di.xa;
import java.util.ArrayList;
import org.telegram.ui.fi1;
import sg.x1;
public abstract class f extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final int K = 0;
    public volatile int E;
    public long F;
    public volatile int G;
    public final ArrayList H;
    public float I;
    public float J;
    public final g f45693a;
    public final GestureDetector f45694b;
    public x1 f45695c;
    public ValueAnimator d;
    public boolean e;
    public boolean f45696f;
    public boolean h;
    public boolean f45697n;
    public volatile boolean f45698r;
    public boolean f45699s;
    public Runnable v;
    public volatile float f45700w;
    public volatile boolean f45701x;
    public volatile boolean f45702y;

    public f(Context context) {
        super(context);
        this.f45696f = true;
        this.f45700w = 1.0f;
        this.H = new ArrayList();
        this.I = 1.0f;
        this.J = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.f45693a = new g(context, 1, 4);
        setRenderer(new d(this));
        setRenderMode(0);
        this.f45694b = new GestureDetector(context, new e(0, this));
    }

    public static void a(f fVar, int i10) {
        if (fVar.e && i10 == fVar.E) {
            b bVar = new b(fVar, i10, 0);
            if (Build.VERSION.SDK_INT >= 29 && fVar.isHardwareAccelerated()) {
                fVar.getViewTreeObserver().registerFrameCommitCallback(bVar);
                fVar.getRootView().invalidate();
                return;
            }
            fVar.postOnAnimation(bVar);
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
        int i10;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.H) {
            try {
                int size = arrayList.size();
                i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
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
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void d() {
        b();
        g gVar = this.f45693a;
        float f7 = gVar.d;
        float f10 = gVar.f45708i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new xa(this, f7, f10, 8));
        this.d.addListener(new fi1(this, 16));
        this.d.start();
        x1 x1Var = this.f45695c;
        if (x1Var != null) {
            x1Var.b(Math.abs(f7 + f10));
        }
    }

    @Override
    public final void doFrame(long j10) {
        float f7;
        if (this.e && !this.f45696f && !this.f45698r) {
            if (Build.VERSION.SDK_INT < 34) {
                f7 = getAlpha();
            } else {
                f7 = 1.0f;
            }
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                f7 *= ((View) parent).getAlpha();
            }
            this.f45700w = f7;
            long j11 = this.F;
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 == 0 || j10 >= j11) {
                if (i10 == 0 || j10 - j11 > 16666666) {
                    this.F = j10;
                }
                this.F += 16666666;
                requestRender();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void e() {
        if (this.e && !this.f45696f && this.h && !this.f45697n && this.d == null) {
            float f7 = this.f45693a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
            this.d = ofFloat;
            ofFloat.setDuration(Math.round(10540.18445322793d));
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new ki.a(this, 18));
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
        this.e = true;
        setPaused(this.f45696f);
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        this.e = false;
        this.f45699s = false;
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
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
            this.f45697n = false;
            d();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return this.f45694b.onTouchEvent(motionEvent);
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.h = z10;
        if (z10) {
            e();
        } else {
            b();
        }
    }

    public void setPaused(boolean z10) {
        this.f45696f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        this.F = 0L;
        if (z10) {
            b();
        } else if (this.e && !this.f45698r) {
            e();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void setRenderScale(float f7) {
        float max = Math.max(1.0f, Math.min(this.J, f7));
        if (this.I == max) {
            return;
        }
        this.I = max;
        this.f45693a.h = max / this.J;
    }

    public void setStarParticlesView(x1 x1Var) {
        this.f45695c = x1Var;
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.E++;
        this.f45702y = false;
        this.f45701x = false;
        this.f45699s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.E++;
        this.f45702y = false;
        this.f45701x = false;
        this.f45699s = false;
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
            this.H.add(new d3(4, runnable));
            arrayList = new ArrayList(this.H);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new s9.b(5, this, arrayList));
    }
}
