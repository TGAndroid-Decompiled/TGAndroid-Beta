package wg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.voip.u;
import org.telegram.ui.Components.xq;
import vg.t1;
public class m extends TextureView implements TextureView.SurfaceTextureListener, z5 {
    public volatile int E;
    public int F;
    public int G;
    public volatile boolean H;
    public volatile boolean I;
    public boolean J;
    public volatile l K;
    public final int L;
    public final long M;
    public boolean N;
    public final int O;
    public int P;
    public final ArrayList Q;
    public boolean R;
    public t1 S;
    public final int T;
    public volatile boolean U;
    public final int[] V;
    public final int[] W;
    public boolean f57664a;
    public volatile boolean f57665a0;
    public f f57666b;
    public volatile Runnable f57667b0;
    public SurfaceTexture f57668c;
    public final GestureDetector f57669c0;
    public final Object d;
    public ValueAnimator f57670d0;
    public f f57671e;
    public AnimatorSet f57672e0;
    public EGLDisplay f57673f;
    public final i f57674f0;
    public final g f57675g0;
    public EGLSurface h;
    public final g f57676h0;
    public final g f57677i0;
    public EGLContext f57678n;
    public EGL10 f57679r;
    public EGLConfig f57680s;
    public GL10 f57681w;
    public long f57682x;
    public volatile int f57683y;

    public m(Context context, int i3, int i10) {
        super(context);
        int i11;
        long j10;
        this.d = new Object();
        this.H = true;
        int i12 = 0;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Q = new ArrayList();
        this.V = new int[1];
        this.W = new int[1];
        this.f57672e0 = new AnimatorSet();
        this.f57674f0 = new i(this, 0);
        this.f57675g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f57652b;

            {
                this.f57652b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f57652b.f57666b.f57631e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f57652b.f57666b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f57652b.f57666b.f57634i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f57676h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f57652b;

            {
                this.f57652b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f57652b.f57666b.f57631e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f57652b.f57666b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f57652b.f57666b.f57634i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f57677i0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f57652b;

            {
                this.f57652b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f57652b.f57666b.f57631e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f57652b.f57666b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f57652b.f57666b.f57634i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.T = i10;
        if (i10 != 1 && i10 != 4 && i10 != 3) {
            i11 = 5;
        } else {
            i11 = 1;
        }
        this.O = i11;
        if (i10 == 4) {
            j10 = 0;
        } else {
            j10 = 2000;
        }
        this.M = j10;
        setOpaque(false);
        setRenderer(new f(context, i3, i10));
        this.L = (int) g0.f22609r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new h(this, i10));
        this.f57669c0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.O) {
            i12 = com.google.android.recaptcha.internal.a.f(i12, i12, 1, this.Q);
        }
        Collections.shuffle(this.Q);
    }

    public static void a(m mVar, float f10) {
        int i3;
        synchronized (mVar) {
            try {
                mVar.e();
                if (mVar.f57666b != null) {
                    int i10 = mVar.E;
                    int i11 = mVar.f57683y;
                    if (mVar.U) {
                        mVar.f57679r.eglQuerySurface(mVar.f57673f, mVar.h, 12375, mVar.V);
                        mVar.f57679r.eglQuerySurface(mVar.f57673f, mVar.h, 12374, mVar.W);
                        int i12 = mVar.V[0];
                        if (i12 > 0 && (i3 = mVar.W[0]) > 0 && (i12 != i10 || i3 != i11)) {
                            mVar.f57668c.setDefaultBufferSize(i10, i11);
                            i10 = mVar.V[0];
                            i11 = mVar.W[0];
                        }
                    }
                    if (i10 != mVar.F || i11 != mVar.G) {
                        mVar.F = i10;
                        mVar.G = i11;
                        mVar.f57666b.onSurfaceChanged(mVar.f57681w, i10, i11);
                    }
                    f fVar = mVar.f57666b;
                    fVar.G = f10;
                    fVar.onDrawFrame(mVar.f57681w);
                }
                mVar.g();
                if (!mVar.f57679r.eglSwapBuffers(mVar.f57673f, mVar.h) && mVar.T == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + mVar.f57679r.eglGetError());
                }
            } finally {
            }
        }
    }

    public static void b(wg.m r6) {
        throw new UnsupportedOperationException("Method not decompiled: wg.m.b(wg.m):void");
    }

    public static void c(m mVar, f fVar) {
        synchronized (mVar) {
            if (fVar != null) {
                mVar.f57671e = fVar;
                fVar.onSurfaceCreated(mVar.f57681w, mVar.f57680s);
                mVar.F = mVar.E;
                int i3 = mVar.f57683y;
                mVar.G = i3;
                fVar.onSurfaceChanged(mVar.f57681w, mVar.F, i3);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f57670d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f57670d0.cancel();
            this.f57670d0 = null;
        }
        AnimatorSet animatorSet = this.f57672e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f57672e0.cancel();
            this.f57672e0 = null;
        }
    }

    public final void e() {
        if (this.f57678n.equals(this.f57679r.eglGetCurrentContext()) && this.h.equals(this.f57679r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f57679r;
        EGLDisplay eGLDisplay = this.f57673f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f57678n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f57679r.eglGetError()));
    }

    public final void f() {
        if (this.f57679r.eglGetError() != 12288) {
            a8.d("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.f57681w.glGetError();
        if (glGetError != 0 && this.T == 4) {
            throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
        }
    }

    public int getMaxFrameRate() {
        if (this.T == 4) {
            if (az.o() == 2) {
                return 60;
            }
            return 30;
        }
        return this.L;
    }

    public int getMsaaSamples() {
        return 4;
    }

    public float getRenderScale() {
        return 1.0f;
    }

    public final void j(long j10) {
        i iVar = this.f57674f0;
        g0.r(iVar);
        if (!this.J && this.N) {
            g0.i3(iVar, j10);
        }
    }

    public final void k(SurfaceTexture surfaceTexture, int i3, int i10) {
        boolean z10;
        float renderScale = getRenderScale();
        int i11 = (renderScale > 1.0f ? 1 : (renderScale == 1.0f ? 0 : -1));
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U = z10;
        if (i11 < 0 && i3 > 0 && i10 > 0) {
            i3 = Math.max(1, Math.round(i3 * renderScale));
            i10 = Math.max(1, Math.round(i10 * renderScale));
            surfaceTexture.setDefaultBufferSize(i3, i10);
        }
        this.E = i3;
        this.f57683y = i10;
    }

    public final void l() {
        d();
        f fVar = this.f57666b;
        float f10 = fVar.d;
        float f11 = fVar.f57634i;
        float f12 = fVar.f57631e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f57670d0 = ofFloat;
        ofFloat.addUpdateListener(new u(this, f10, f12, f11, 2));
        this.f57670d0.setDuration(600L);
        this.f57670d0.setInterpolator(new OvershootInterpolator());
        this.f57670d0.start();
        t1 t1Var = this.S;
        if (t1Var != null) {
            t1Var.b(Math.abs(f13));
        }
        j(this.M);
    }

    public final void m(long j10) {
        f fVar = this.f57666b;
        if (fVar != null) {
            fVar.d = -180.0f;
            g0.i3(new i(this, 1), j10);
        }
    }

    public void n() {
        int i3;
        if (this.R && this.N) {
            int i10 = this.P;
            ArrayList arrayList = this.Q;
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.P + 1;
            this.P = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.P = 0;
            }
            g gVar = this.f57677i0;
            g gVar2 = this.f57676h0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.f21385b.nextInt() % 4);
                this.f57672e0 = new AnimatorSet();
                int i12 = this.T;
                if (i12 == 4) {
                    float f10 = this.f57666b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                    ofFloat.addUpdateListener(gVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f57672e0.playTogether(ofFloat);
                } else if (abs == 0 && i12 != 1 && i12 != 3) {
                    float f11 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f57666b.f57634i, f11);
                    ofFloat2.addUpdateListener(gVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(xq.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat3.addUpdateListener(gVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(g0.H);
                    this.f57672e0.playTogether(ofFloat2, ofFloat3);
                } else {
                    if (i12 != 1 && i12 != 3) {
                        i3 = 485;
                    } else {
                        i3 = 360;
                    }
                    if (abs == 2) {
                        i3 = -i3;
                    }
                    float f12 = i3;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f57666b.f57634i, f12);
                    ofFloat4.addUpdateListener(gVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(xq.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                    ofFloat5.addUpdateListener(gVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(g0.H);
                    this.f57672e0.playTogether(ofFloat4, ofFloat5);
                }
                this.f57672e0.addListener(new j(this, 1));
                this.f57672e0.start();
            } else if (intValue == 1) {
                this.f57672e0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f57666b.d, 360.0f);
                ofFloat6.addUpdateListener(gVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(xq.f40452f);
                this.f57672e0.playTogether(ofFloat6);
                this.f57672e0.addListener(new j(this, 0));
                this.f57672e0.start();
            } else if (intValue == 2) {
                this.f57672e0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f57666b.d, 184.0f);
                ofFloat7.addUpdateListener(gVar2);
                ofFloat7.setDuration(600L);
                xq xqVar = xq.f40453g;
                ofFloat7.setInterpolator(xqVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f57666b.f57634i, 50.0f);
                ofFloat8.addUpdateListener(gVar);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(xqVar);
                ValueAnimator ofFloat9 = ValueAnimator.ofFloat(180.0f, 0.0f);
                ofFloat9.addUpdateListener(gVar2);
                ofFloat9.setDuration(800L);
                ofFloat9.setStartDelay(10000L);
                OvershootInterpolator overshootInterpolator = g0.H;
                ofFloat9.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat10 = ValueAnimator.ofFloat(60.0f, 0.0f);
                ofFloat10.addUpdateListener(gVar);
                ofFloat10.setDuration(800L);
                ofFloat10.setStartDelay(10000L);
                ofFloat10.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
                ofFloat11.addUpdateListener(this.f57675g0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f57672e0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f57672e0.addListener(new j(this, 3));
                this.f57672e0.start();
            } else {
                this.f57672e0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f57666b.d, 180.0f);
                ofFloat12.addUpdateListener(gVar2);
                ofFloat12.setDuration(600L);
                xq xqVar2 = xq.f40452f;
                ofFloat12.setInterpolator(xqVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(gVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(xqVar2);
                this.f57672e0.playTogether(ofFloat12, ofFloat13);
                this.f57672e0.addListener(new j(this, 2));
                this.f57672e0.start();
            }
        }
    }

    public final void o() {
        l lVar = this.K;
        this.K = null;
        this.f57665a0 = false;
        if (lVar != null) {
            lVar.f57662b = true;
            lVar.interrupt();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        this.I = true;
        j(this.M);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f fVar = this.f57666b;
        if (fVar != null) {
            fVar.d = 0.0f;
            fVar.f57634i = 0.0f;
            fVar.f57631e = 0.0f;
        }
        this.R = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        o();
        this.f57665a0 = false;
        this.K = new l(this, surfaceTexture);
        k(surfaceTexture, i3, i10);
        this.f57682x = 1000000000 / Math.max(1, Math.min(this.L, getMaxFrameRate()));
        this.K.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f57665a0 = false;
        o();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        k(surfaceTexture, i3, i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f57664a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.f57669c0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        f fVar = this.f57666b;
        n nVar = fVar.f57630c;
        if (nVar != null && nVar.f57687a == null) {
            nVar.Z = bitmap;
        }
        fVar.f57643r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.J = z10;
        if (z10) {
            g0.r(this.f57674f0);
            l();
            return;
        }
        j(this.M);
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.N = z10;
        if (z10) {
            j(this.M);
            return;
        }
        g0.r(this.f57674f0);
        d();
    }

    public void setPaused(boolean z10) {
        boolean z11 = this.H;
        this.H = z10;
        if (z11 && !z10 && this.K != null) {
            this.K.interrupt();
        }
    }

    public synchronized void setRenderer(f fVar) {
        this.f57666b = fVar;
        this.I = true;
    }

    public void setStarParticlesView(t1 t1Var) {
        this.S = t1Var;
    }

    @Override
    public final void updateColors() {
        try {
            f fVar = this.f57666b;
            if (fVar != null) {
                fVar.b();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void h() {
    }

    public void i() {
    }
}
