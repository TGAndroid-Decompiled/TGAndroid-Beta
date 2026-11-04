package wg;

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
import ei.h2;
import gi.l9;
import java.util.ArrayList;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.i81;
import ug.f2;
import vg.t1;
public abstract class e extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final int L = 0;
    public volatile boolean E;
    public volatile int F;
    public long G;
    public volatile int H;
    public final ArrayList I;
    public float J;
    public float K;
    public final f f57617a;
    public final GestureDetector f57618b;
    public t1 f57619c;
    public ValueAnimator d;
    public boolean f57620e;
    public boolean f57621f;
    public boolean h;
    public boolean f57622n;
    public volatile boolean f57623r;
    public boolean f57624s;
    public Runnable f57625w;
    public volatile float f57626x;
    public volatile boolean f57627y;

    public e(Context context) {
        super(context);
        this.f57621f = true;
        this.f57626x = 1.0f;
        this.I = new ArrayList();
        this.J = 1.0f;
        this.K = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.f57617a = new f(context, 1, 4);
        setRenderer(new d(this));
        setRenderMode(0);
        this.f57618b = new GestureDetector(context, new x9(1, this));
    }

    public static void a(e eVar, int i3) {
        if (eVar.f57620e && i3 == eVar.F) {
            b bVar = new b(eVar, i3, 0);
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
        int i3;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.I) {
            try {
                int size = arrayList.size();
                i3 = 0;
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
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((Runnable) obj2).run();
        }
    }

    public final void d() {
        b();
        f fVar = this.f57617a;
        float f10 = fVar.d;
        float f11 = fVar.f57634i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new l9(this, f10, f11, 7));
        this.d.addListener(new i81(this, 21));
        this.d.start();
        t1 t1Var = this.f57619c;
        if (t1Var != null) {
            t1Var.b(Math.abs(f10 + f11));
        }
    }

    @Override
    public final void doFrame(long j10) {
        float f10;
        if (this.f57620e && !this.f57621f && !this.f57623r) {
            if (Build.VERSION.SDK_INT < 34) {
                f10 = getAlpha();
            } else {
                f10 = 1.0f;
            }
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                f10 *= ((View) parent).getAlpha();
            }
            this.f57626x = f10;
            long j11 = this.G;
            int i3 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i3 == 0 || j10 >= j11) {
                if (i3 == 0 || j10 - j11 > 16666666) {
                    this.G = j10;
                }
                this.G += 16666666;
                requestRender();
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void e() {
        if (this.f57620e && !this.f57621f && this.h && !this.f57622n && this.d == null) {
            float f10 = this.f57617a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
            this.d = ofFloat;
            ofFloat.setDuration(Math.round(10540.18445322793d));
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new f2(this, 4));
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
        this.f57620e = true;
        setPaused(this.f57621f);
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        this.f57620e = false;
        this.f57624s = false;
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
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
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
            this.f57622n = false;
            d();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return this.f57618b.onTouchEvent(motionEvent);
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
        this.f57621f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        this.G = 0L;
        if (z10) {
            b();
        } else if (this.f57620e && !this.f57623r) {
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
        this.f57617a.h = max / this.K;
    }

    public void setStarParticlesView(t1 t1Var) {
        this.f57619c = t1Var;
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.F++;
        this.E = false;
        this.f57627y = false;
        this.f57624s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.F++;
        this.E = false;
        this.f57627y = false;
        this.f57624s = false;
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
            this.I.add(new h2(4, runnable));
            arrayList = new ArrayList(this.I);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new u9.a(16, this, arrayList));
    }
}
