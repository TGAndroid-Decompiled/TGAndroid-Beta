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
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.voip.h0;
import ug.u1;
public class m extends TextureView implements TextureView.SurfaceTextureListener, c6 {
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
    public u1 S;
    public final int T;
    public volatile boolean U;
    public final int[] V;
    public final int[] W;
    public boolean f59461a;
    public volatile boolean f59462a0;
    public f f59463b;
    public volatile Runnable f59464b0;
    public SurfaceTexture f59465c;
    public final GestureDetector f59466c0;
    public final Object d;
    public ValueAnimator f59467d0;
    public f f59468e;
    public AnimatorSet f59469e0;
    public EGLDisplay f59470f;
    public final i f59471f0;
    public final g f59472g0;
    public EGLSurface h;
    public final g f59473h0;
    public final g f59474i0;
    public EGLContext f59475n;
    public EGL10 f59476r;
    public EGLConfig f59477s;
    public GL10 f59478w;
    public long f59479x;
    public volatile int f59480y;

    public m(Context context, int i7, int i10) {
        super(context);
        int i11;
        long j3;
        this.d = new Object();
        this.H = true;
        int i12 = 0;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Q = new ArrayList();
        this.V = new int[1];
        this.W = new int[1];
        this.f59469e0 = new AnimatorSet();
        this.f59471f0 = new i(this, 0);
        this.f59472g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f59449b;

            {
                this.f59449b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f59449b.f59463b.f59428e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f59449b.f59463b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f59449b.f59463b.f59431i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f59473h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f59449b;

            {
                this.f59449b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f59449b.f59463b.f59428e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f59449b.f59463b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f59449b.f59463b.f59431i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f59474i0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f59449b;

            {
                this.f59449b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f59449b.f59463b.f59428e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f59449b.f59463b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f59449b.f59463b.f59431i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
            j3 = 0;
        } else {
            j3 = 2000;
        }
        this.M = j3;
        setOpaque(false);
        setRenderer(new f(context, i7, i10));
        this.L = (int) g0.f24119r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new h(this, i10));
        this.f59466c0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.O) {
            i12 = e2.f(i12, i12, 1, this.Q);
        }
        Collections.shuffle(this.Q);
    }

    public static void a(m mVar, float f10) {
        int i7;
        synchronized (mVar) {
            try {
                mVar.e();
                if (mVar.f59463b != null) {
                    int i10 = mVar.E;
                    int i11 = mVar.f59480y;
                    if (mVar.U) {
                        mVar.f59476r.eglQuerySurface(mVar.f59470f, mVar.h, 12375, mVar.V);
                        mVar.f59476r.eglQuerySurface(mVar.f59470f, mVar.h, 12374, mVar.W);
                        int i12 = mVar.V[0];
                        if (i12 > 0 && (i7 = mVar.W[0]) > 0 && (i12 != i10 || i7 != i11)) {
                            mVar.f59465c.setDefaultBufferSize(i10, i11);
                            i10 = mVar.V[0];
                            i11 = mVar.W[0];
                        }
                    }
                    if (i10 != mVar.F || i11 != mVar.G) {
                        mVar.F = i10;
                        mVar.G = i11;
                        mVar.f59463b.onSurfaceChanged(mVar.f59478w, i10, i11);
                    }
                    f fVar = mVar.f59463b;
                    fVar.G = f10;
                    fVar.onDrawFrame(mVar.f59478w);
                }
                mVar.g();
                if (!mVar.f59476r.eglSwapBuffers(mVar.f59470f, mVar.h) && mVar.T == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + mVar.f59476r.eglGetError());
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
                mVar.f59468e = fVar;
                fVar.onSurfaceCreated(mVar.f59478w, mVar.f59477s);
                mVar.F = mVar.E;
                int i7 = mVar.f59480y;
                mVar.G = i7;
                fVar.onSurfaceChanged(mVar.f59478w, mVar.F, i7);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f59467d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f59467d0.cancel();
            this.f59467d0 = null;
        }
        AnimatorSet animatorSet = this.f59469e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f59469e0.cancel();
            this.f59469e0 = null;
        }
    }

    public final void e() {
        if (this.f59475n.equals(this.f59476r.eglGetCurrentContext()) && this.h.equals(this.f59476r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f59476r;
        EGLDisplay eGLDisplay = this.f59470f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f59475n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f59476r.eglGetError()));
    }

    public final void f() {
        if (this.f59476r.eglGetError() != 12288) {
            a8.d("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.f59478w.glGetError();
        if (glGetError != 0 && this.T == 4) {
            throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
        }
    }

    public int getMaxFrameRate() {
        if (this.T == 4) {
            if (bz.o() == 2) {
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

    public final void j(long j3) {
        i iVar = this.f59471f0;
        g0.r(iVar);
        if (!this.J && this.N) {
            g0.h3(iVar, j3);
        }
    }

    public final void k(SurfaceTexture surfaceTexture, int i7, int i10) {
        boolean z10;
        float renderScale = getRenderScale();
        int i11 = (renderScale > 1.0f ? 1 : (renderScale == 1.0f ? 0 : -1));
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U = z10;
        if (i11 < 0 && i7 > 0 && i10 > 0) {
            i7 = Math.max(1, Math.round(i7 * renderScale));
            i10 = Math.max(1, Math.round(i10 * renderScale));
            surfaceTexture.setDefaultBufferSize(i7, i10);
        }
        this.E = i7;
        this.f59480y = i10;
    }

    public final void l() {
        d();
        f fVar = this.f59463b;
        float f10 = fVar.d;
        float f11 = fVar.f59431i;
        float f12 = fVar.f59428e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f59467d0 = ofFloat;
        ofFloat.addUpdateListener(new h0(this, f10, f12, f11, 2));
        this.f59467d0.setDuration(600L);
        this.f59467d0.setInterpolator(new OvershootInterpolator());
        this.f59467d0.start();
        u1 u1Var = this.S;
        if (u1Var != null) {
            u1Var.b(Math.abs(f13));
        }
        j(this.M);
    }

    public final void m(long j3) {
        f fVar = this.f59463b;
        if (fVar != null) {
            fVar.d = -180.0f;
            g0.h3(new i(this, 1), j3);
        }
    }

    public void n() {
        int i7;
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
            g gVar = this.f59474i0;
            g gVar2 = this.f59473h0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.f22777b.nextInt() % 4);
                this.f59469e0 = new AnimatorSet();
                int i12 = this.T;
                if (i12 == 4) {
                    float f10 = this.f59463b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                    ofFloat.addUpdateListener(gVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f59469e0.playTogether(ofFloat);
                } else if (abs == 0 && i12 != 1 && i12 != 3) {
                    float f11 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f59463b.f59431i, f11);
                    ofFloat2.addUpdateListener(gVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(lr.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat3.addUpdateListener(gVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(g0.H);
                    this.f59469e0.playTogether(ofFloat2, ofFloat3);
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
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f59463b.f59431i, f12);
                    ofFloat4.addUpdateListener(gVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(lr.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                    ofFloat5.addUpdateListener(gVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(g0.H);
                    this.f59469e0.playTogether(ofFloat4, ofFloat5);
                }
                this.f59469e0.addListener(new j(this, 1));
                this.f59469e0.start();
            } else if (intValue == 1) {
                this.f59469e0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f59463b.d, 360.0f);
                ofFloat6.addUpdateListener(gVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(lr.f37208f);
                this.f59469e0.playTogether(ofFloat6);
                this.f59469e0.addListener(new j(this, 0));
                this.f59469e0.start();
            } else if (intValue == 2) {
                this.f59469e0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f59463b.d, 184.0f);
                ofFloat7.addUpdateListener(gVar2);
                ofFloat7.setDuration(600L);
                lr lrVar = lr.f37209g;
                ofFloat7.setInterpolator(lrVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f59463b.f59431i, 50.0f);
                ofFloat8.addUpdateListener(gVar);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(lrVar);
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
                ofFloat11.addUpdateListener(this.f59472g0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f59469e0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f59469e0.addListener(new j(this, 3));
                this.f59469e0.start();
            } else {
                this.f59469e0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f59463b.d, 180.0f);
                ofFloat12.addUpdateListener(gVar2);
                ofFloat12.setDuration(600L);
                lr lrVar2 = lr.f37208f;
                ofFloat12.setInterpolator(lrVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(gVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(lrVar2);
                this.f59469e0.playTogether(ofFloat12, ofFloat13);
                this.f59469e0.addListener(new j(this, 2));
                this.f59469e0.start();
            }
        }
    }

    public final void o() {
        l lVar = this.K;
        this.K = null;
        this.f59462a0 = false;
        if (lVar != null) {
            lVar.f59459b = true;
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
        f fVar = this.f59463b;
        if (fVar != null) {
            fVar.d = 0.0f;
            fVar.f59431i = 0.0f;
            fVar.f59428e = 0.0f;
        }
        this.R = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        o();
        this.f59462a0 = false;
        this.K = new l(this, surfaceTexture);
        k(surfaceTexture, i7, i10);
        this.f59479x = 1000000000 / Math.max(1, Math.min(this.L, getMaxFrameRate()));
        this.K.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f59462a0 = false;
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
            this.f59461a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.f59466c0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        f fVar = this.f59463b;
        n nVar = fVar.f59427c;
        if (nVar != null && nVar.f59484a == null) {
            nVar.Z = bitmap;
        }
        fVar.f59440r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.J = z10;
        if (z10) {
            g0.r(this.f59471f0);
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
        g0.r(this.f59471f0);
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
        this.f59463b = fVar;
        this.I = true;
    }

    public void setStarParticlesView(u1 u1Var) {
        this.S = u1Var;
    }

    @Override
    public final void updateColors() {
        try {
            f fVar = this.f59463b;
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
