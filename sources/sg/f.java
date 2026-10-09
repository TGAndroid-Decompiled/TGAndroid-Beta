package sg;

import ai.o3;
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
import ci.ya;
import java.util.ArrayList;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Wallet.w4;
import rg.w1;
public abstract class f extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final int K = 0;
    public volatile int E;
    public long F;
    public volatile int G;
    public final ArrayList H;
    public float I;
    public float J;
    public final g f48027a;
    public final GestureDetector f48028b;
    public w1 f48029c;
    public ValueAnimator d;
    public boolean f48030e;
    public boolean f48031f;
    public boolean h;
    public boolean f48032n;
    public volatile boolean f48033r;
    public boolean f48034s;
    public Runnable v;
    public volatile float f48035w;
    public volatile boolean f48036x;
    public volatile boolean f48037y;

    public f(Context context) {
        super(context);
        this.f48031f = true;
        this.f48035w = 1.0f;
        this.H = new ArrayList();
        this.I = 1.0f;
        this.J = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.f48027a = new g(context, 1, 4);
        setRenderer(new d(this));
        setRenderMode(0);
        this.f48028b = new GestureDetector(context, new e(0, this));
    }

    public static void a(f fVar, int i10) {
        if (fVar.f48030e && i10 == fVar.E) {
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
        g gVar = this.f48027a;
        float f7 = gVar.d;
        float f10 = gVar.f48044i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new ya(this, f7, f10, 8));
        this.d.addListener(new w4(this, 13));
        this.d.start();
        w1 w1Var = this.f48029c;
        if (w1Var != null) {
            w1Var.b(Math.abs(f7 + f10));
        }
    }

    @Override
    public final void doFrame(long j3) {
        float f7;
        if (this.f48030e && !this.f48031f && !this.f48033r) {
            if (Build.VERSION.SDK_INT < 34) {
                f7 = getAlpha();
            } else {
                f7 = 1.0f;
            }
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                f7 *= ((View) parent).getAlpha();
            }
            this.f48035w = f7;
            long j10 = this.F;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 == 0 || j3 >= j10) {
                if (i10 == 0 || j3 - j10 > 16666666) {
                    this.F = j3;
                }
                this.F += 16666666;
                requestRender();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void e() {
        if (this.f48030e && !this.f48031f && this.h && !this.f48032n && this.d == null) {
            float f7 = this.f48027a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
            this.d = ofFloat;
            ofFloat.setDuration(Math.round(10540.18445322793d));
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new r0(this, 17));
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
        this.f48030e = true;
        setPaused(this.f48031f);
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        this.f48030e = false;
        this.f48034s = false;
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
            this.f48032n = false;
            d();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return this.f48028b.onTouchEvent(motionEvent);
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
        this.f48031f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        this.F = 0L;
        if (z10) {
            b();
        } else if (this.f48030e && !this.f48033r) {
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
        this.f48027a.h = max / this.J;
    }

    public void setStarParticlesView(w1 w1Var) {
        this.f48029c = w1Var;
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.E++;
        this.f48037y = false;
        this.f48036x = false;
        this.f48034s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.E++;
        this.f48037y = false;
        this.f48036x = false;
        this.f48034s = false;
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
            this.H.add(new o3(4, runnable));
            arrayList = new ArrayList(this.H);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new org.telegram.ui.web.w1(19, this, arrayList));
    }
}
