package vg;

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
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.Components.voip.h0;
import org.telegram.ui.Components.xq;
import ug.q1;
public class m extends TextureView implements TextureView.SurfaceTextureListener, a6 {
    public volatile int D;
    public int E;
    public int F;
    public volatile boolean G;
    public volatile boolean H;
    public boolean I;
    public volatile l J;
    public final int K;
    public final long L;
    public boolean M;
    public final int N;
    public int O;
    public final ArrayList P;
    public boolean Q;
    public q1 R;
    public final int S;
    public volatile boolean T;
    public final int[] U;
    public final int[] V;
    public volatile boolean W;
    public boolean f57409a;
    public volatile Runnable f57410a0;
    public f f57411b;
    public final GestureDetector f57412b0;
    public SurfaceTexture f57413c;
    public ValueAnimator f57414c0;
    public final Object d;
    public AnimatorSet f57415d0;
    public f f57416e;
    public final i f57417e0;
    public EGLDisplay f57418f;
    public final g f57419f0;
    public final g f57420g0;
    public EGLSurface h;
    public final g f57421h0;
    public EGLContext f57422n;
    public EGL10 f57423r;
    public EGLConfig f57424s;
    public GL10 f57425w;
    public long f57426x;
    public volatile int f57427y;

    public m(Context context, int i7, int i10) {
        super(context);
        int i11;
        long j3;
        this.d = new Object();
        this.G = true;
        int i12 = 0;
        this.H = false;
        this.I = false;
        this.M = true;
        this.P = new ArrayList();
        this.U = new int[1];
        this.V = new int[1];
        this.f57415d0 = new AnimatorSet();
        this.f57417e0 = new i(this, 0);
        this.f57419f0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f57397b;

            {
                this.f57397b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f57397b.f57411b.f57376e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f57397b.f57411b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f57397b.f57411b.f57379i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f57420g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f57397b;

            {
                this.f57397b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f57397b.f57411b.f57376e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f57397b.f57411b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f57397b.f57411b.f57379i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f57421h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f57397b;

            {
                this.f57397b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f57397b.f57411b.f57376e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f57397b.f57411b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f57397b.f57411b.f57379i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.S = i10;
        if (i10 != 1 && i10 != 4 && i10 != 3) {
            i11 = 5;
        } else {
            i11 = 1;
        }
        this.N = i11;
        if (i10 == 4) {
            j3 = 0;
        } else {
            j3 = 2000;
        }
        this.L = j3;
        setOpaque(false);
        setRenderer(new f(context, i7, i10));
        this.K = (int) g0.f22564r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new h(this, i10));
        this.f57412b0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.N) {
            i12 = com.google.android.recaptcha.internal.a.f(i12, i12, 1, this.P);
        }
        Collections.shuffle(this.P);
    }

    public static void a(m mVar, float f10) {
        int i7;
        synchronized (mVar) {
            try {
                mVar.e();
                if (mVar.f57411b != null) {
                    int i10 = mVar.D;
                    int i11 = mVar.f57427y;
                    if (mVar.T) {
                        mVar.f57423r.eglQuerySurface(mVar.f57418f, mVar.h, 12375, mVar.U);
                        mVar.f57423r.eglQuerySurface(mVar.f57418f, mVar.h, 12374, mVar.V);
                        int i12 = mVar.U[0];
                        if (i12 > 0 && (i7 = mVar.V[0]) > 0 && (i12 != i10 || i7 != i11)) {
                            mVar.f57413c.setDefaultBufferSize(i10, i11);
                            i10 = mVar.U[0];
                            i11 = mVar.V[0];
                        }
                    }
                    if (i10 != mVar.E || i11 != mVar.F) {
                        mVar.E = i10;
                        mVar.F = i11;
                        mVar.f57411b.onSurfaceChanged(mVar.f57425w, i10, i11);
                    }
                    f fVar = mVar.f57411b;
                    fVar.G = f10;
                    fVar.onDrawFrame(mVar.f57425w);
                }
                mVar.g();
                if (!mVar.f57423r.eglSwapBuffers(mVar.f57418f, mVar.h) && mVar.S == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + mVar.f57423r.eglGetError());
                }
            } finally {
            }
        }
    }

    public static void b(vg.m r6) {
        throw new UnsupportedOperationException("Method not decompiled: vg.m.b(vg.m):void");
    }

    public static void c(m mVar, f fVar) {
        synchronized (mVar) {
            if (fVar != null) {
                mVar.f57416e = fVar;
                fVar.onSurfaceCreated(mVar.f57425w, mVar.f57424s);
                mVar.E = mVar.D;
                int i7 = mVar.f57427y;
                mVar.F = i7;
                fVar.onSurfaceChanged(mVar.f57425w, mVar.E, i7);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f57414c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f57414c0.cancel();
            this.f57414c0 = null;
        }
        AnimatorSet animatorSet = this.f57415d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f57415d0.cancel();
            this.f57415d0 = null;
        }
    }

    public final void e() {
        if (this.f57422n.equals(this.f57423r.eglGetCurrentContext()) && this.h.equals(this.f57423r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f57423r;
        EGLDisplay eGLDisplay = this.f57418f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f57422n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f57423r.eglGetError()));
    }

    public final void f() {
        if (this.f57423r.eglGetError() != 12288) {
            a8.d("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.f57425w.glGetError();
        if (glGetError != 0 && this.S == 4) {
            throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
        }
    }

    public int getMaxFrameRate() {
        if (this.S == 4) {
            if (iz.o() == 2) {
                return 60;
            }
            return 30;
        }
        return this.K;
    }

    public int getMsaaSamples() {
        return 4;
    }

    public float getRenderScale() {
        return 1.0f;
    }

    public final void j(long j3) {
        i iVar = this.f57417e0;
        g0.r(iVar);
        if (!this.I && this.M) {
            g0.i3(iVar, j3);
        }
    }

    public final void k(SurfaceTexture surfaceTexture, int i7, int i10) {
        boolean z9;
        float renderScale = getRenderScale();
        int i11 = (renderScale > 1.0f ? 1 : (renderScale == 1.0f ? 0 : -1));
        if (i11 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.T = z9;
        if (i11 < 0 && i7 > 0 && i10 > 0) {
            i7 = Math.max(1, Math.round(i7 * renderScale));
            i10 = Math.max(1, Math.round(i10 * renderScale));
            surfaceTexture.setDefaultBufferSize(i7, i10);
        }
        this.D = i7;
        this.f57427y = i10;
    }

    public final void l() {
        d();
        f fVar = this.f57411b;
        float f10 = fVar.d;
        float f11 = fVar.f57379i;
        float f12 = fVar.f57376e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f57414c0 = ofFloat;
        ofFloat.addUpdateListener(new h0(this, f10, f12, f11, 2));
        this.f57414c0.setDuration(600L);
        this.f57414c0.setInterpolator(new OvershootInterpolator());
        this.f57414c0.start();
        q1 q1Var = this.R;
        if (q1Var != null) {
            q1Var.b(Math.abs(f13));
        }
        j(this.L);
    }

    public final void m(long j3) {
        f fVar = this.f57411b;
        if (fVar != null) {
            fVar.d = -180.0f;
            g0.i3(new i(this, 1), j3);
        }
    }

    public void n() {
        int i7;
        if (this.Q && this.M) {
            int i10 = this.O;
            ArrayList arrayList = this.P;
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.O + 1;
            this.O = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.O = 0;
            }
            g gVar = this.f57421h0;
            g gVar2 = this.f57420g0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.f21334b.nextInt() % 4);
                this.f57415d0 = new AnimatorSet();
                int i12 = this.S;
                if (i12 == 4) {
                    float f10 = this.f57411b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                    ofFloat.addUpdateListener(gVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f57415d0.playTogether(ofFloat);
                } else if (abs == 0 && i12 != 1 && i12 != 3) {
                    float f11 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f57411b.f57379i, f11);
                    ofFloat2.addUpdateListener(gVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(xq.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat3.addUpdateListener(gVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(g0.H);
                    this.f57415d0.playTogether(ofFloat2, ofFloat3);
                } else {
                    if (i12 != 1 && i12 != 3) {
                        i7 = 485;
                    } else {
                        i7 = 360;
                    }
                    if (abs == 2) {
                        i7 = -i7;
                    }
                    float f12 = i7;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f57411b.f57379i, f12);
                    ofFloat4.addUpdateListener(gVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(xq.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                    ofFloat5.addUpdateListener(gVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(g0.H);
                    this.f57415d0.playTogether(ofFloat4, ofFloat5);
                }
                this.f57415d0.addListener(new j(this, 1));
                this.f57415d0.start();
            } else if (intValue == 1) {
                this.f57415d0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f57411b.d, 360.0f);
                ofFloat6.addUpdateListener(gVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(xq.f40366f);
                this.f57415d0.playTogether(ofFloat6);
                this.f57415d0.addListener(new j(this, 0));
                this.f57415d0.start();
            } else if (intValue == 2) {
                this.f57415d0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f57411b.d, 184.0f);
                ofFloat7.addUpdateListener(gVar2);
                ofFloat7.setDuration(600L);
                xq xqVar = xq.f40367g;
                ofFloat7.setInterpolator(xqVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f57411b.f57379i, 50.0f);
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
                ofFloat11.addUpdateListener(this.f57419f0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f57415d0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f57415d0.addListener(new j(this, 3));
                this.f57415d0.start();
            } else {
                this.f57415d0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f57411b.d, 180.0f);
                ofFloat12.addUpdateListener(gVar2);
                ofFloat12.setDuration(600L);
                xq xqVar2 = xq.f40366f;
                ofFloat12.setInterpolator(xqVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(gVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(xqVar2);
                this.f57415d0.playTogether(ofFloat12, ofFloat13);
                this.f57415d0.addListener(new j(this, 2));
                this.f57415d0.start();
            }
        }
    }

    public final void o() {
        l lVar = this.J;
        this.J = null;
        this.W = false;
        if (lVar != null) {
            lVar.f57407b = true;
            lVar.interrupt();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.H = true;
        j(this.L);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f fVar = this.f57411b;
        if (fVar != null) {
            fVar.d = 0.0f;
            fVar.f57379i = 0.0f;
            fVar.f57376e = 0.0f;
        }
        this.Q = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        o();
        this.W = false;
        this.J = new l(this, surfaceTexture);
        k(surfaceTexture, i7, i10);
        this.f57426x = 1000000000 / Math.max(1, Math.min(this.K, getMaxFrameRate()));
        this.J.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.W = false;
        o();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        k(surfaceTexture, i7, i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f57409a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.f57412b0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        f fVar = this.f57411b;
        n nVar = fVar.f57375c;
        if (nVar != null && nVar.f57431a == null) {
            nVar.Z = bitmap;
        }
        fVar.f57388r = bitmap;
    }

    public void setDialogVisible(boolean z9) {
        this.I = z9;
        if (z9) {
            g0.r(this.f57417e0);
            l();
            return;
        }
        j(this.L);
    }

    public void setIdleAnimationEnabled(boolean z9) {
        this.M = z9;
        if (z9) {
            j(this.L);
            return;
        }
        g0.r(this.f57417e0);
        d();
    }

    public void setPaused(boolean z9) {
        boolean z10 = this.G;
        this.G = z9;
        if (z10 && !z9 && this.J != null) {
            this.J.interrupt();
        }
    }

    public synchronized void setRenderer(f fVar) {
        this.f57411b = fVar;
        this.H = true;
    }

    public void setStarParticlesView(q1 q1Var) {
        this.R = q1Var;
    }

    @Override
    public final void updateColors() {
        try {
            f fVar = this.f57411b;
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
