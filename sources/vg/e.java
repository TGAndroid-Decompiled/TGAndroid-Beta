package vg;

import ai.z0;
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
import hi.j9;
import java.util.ArrayList;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.k71;
import p4.o0;
import tg.x1;
import ug.u1;
public abstract class e extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final int L = 0;
    public volatile boolean E;
    public volatile int F;
    public long G;
    public volatile int H;
    public final ArrayList I;
    public float J;
    public float K;
    public final f f59413a;
    public final GestureDetector f59414b;
    public u1 f59415c;
    public ValueAnimator d;
    public boolean f59416e;
    public boolean f59417f;
    public boolean h;
    public boolean f59418n;
    public volatile boolean f59419r;
    public boolean f59420s;
    public Runnable f59421w;
    public volatile float f59422x;
    public volatile boolean f59423y;

    public e(Context context) {
        super(context);
        this.f59417f = true;
        this.f59422x = 1.0f;
        this.I = new ArrayList();
        this.J = 1.0f;
        this.K = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.f59413a = new f(context, 1, 4);
        setRenderer(new d(this));
        setRenderMode(0);
        this.f59414b = new GestureDetector(context, new y9(1, this));
    }

    public static void a(e eVar, int i7) {
        if (eVar.f59416e && i7 == eVar.F) {
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
        synchronized (this.I) {
            try {
                int size = arrayList.size();
                i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Runnable runnable = (Runnable) obj;
                    if (this.I.remove(runnable)) {
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
        f fVar = this.f59413a;
        float f10 = fVar.d;
        float f11 = fVar.f59430i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new j9(this, f10, f11, 7));
        this.d.addListener(new k71(this, 22));
        this.d.start();
        u1 u1Var = this.f59415c;
        if (u1Var != null) {
            u1Var.b(Math.abs(f10 + f11));
        }
    }

    @Override
    public final void doFrame(long j3) {
        float f10;
        if (this.f59416e && !this.f59417f && !this.f59419r) {
            if (Build.VERSION.SDK_INT < 34) {
                f10 = getAlpha();
            } else {
                f10 = 1.0f;
            }
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                f10 *= ((View) parent).getAlpha();
            }
            this.f59422x = f10;
            long j10 = this.G;
            int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i7 == 0 || j3 >= j10) {
                if (i7 == 0 || j3 - j10 > 16666666) {
                    this.G = j3;
                }
                this.G += 16666666;
                requestRender();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void e() {
        if (this.f59416e && !this.f59417f && this.h && !this.f59418n && this.d == null) {
            float f10 = this.f59413a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
            this.d = ofFloat;
            ofFloat.setDuration(Math.round(10540.18445322793d));
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new x1(this, 5));
            this.d.start();
        }
    }

    public final void f() {
        if (this.K == 1.0f) {
            getHolder().setSizeFromLayout();
        } else if (getWidth() > 0 && getHeight() > 0) {
            getHolder().setFixedSize(Math.round(getWidth() * this.K), Math.round(getHeight() * this.K));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59416e = true;
        setPaused(this.f59417f);
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        this.f59416e = false;
        this.f59420s = false;
        this.H++;
        Choreographer.getInstance().removeFrameCallback(this);
        this.G = 0L;
        b();
        super.onDetachedFromWindow();
        synchronized (this.I) {
            arrayList = new ArrayList(this.I);
        }
        c(arrayList);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.K > 1.0f) {
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
            this.f59418n = false;
            d();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return this.f59414b.onTouchEvent(motionEvent);
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
        this.f59417f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        this.G = 0L;
        if (z10) {
            b();
        } else if (this.f59416e && !this.f59419r) {
            e();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void setRenderScale(float f10) {
        float max = Math.max(1.0f, Math.min(this.K, f10));
        if (this.J == max) {
            return;
        }
        this.J = max;
        this.f59413a.h = max / this.K;
    }

    public void setStarParticlesView(u1 u1Var) {
        this.f59415c = u1Var;
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.F++;
        this.E = false;
        this.f59423y = false;
        this.f59420s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.F++;
        this.E = false;
        this.f59423y = false;
        this.f59420s = false;
        super.surfaceDestroyed(surfaceHolder);
        synchronized (this.I) {
            arrayList = new ArrayList(this.I);
        }
        c(arrayList);
    }

    @Override
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        ArrayList arrayList;
        synchronized (this.I) {
            this.I.add(new z0(5, runnable));
            arrayList = new ArrayList(this.I);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new o0(25, this, arrayList));
    }
}
