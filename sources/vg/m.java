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
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.voip.i0;
import ug.s1;
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
    public s1 S;
    public final int T;
    public volatile boolean U;
    public final int[] V;
    public final int[] W;
    public boolean f58891a;
    public volatile boolean f58892a0;
    public f f58893b;
    public volatile Runnable f58894b0;
    public SurfaceTexture f58895c;
    public final GestureDetector f58896c0;
    public final Object d;
    public ValueAnimator f58897d0;
    public f f58898e;
    public AnimatorSet f58899e0;
    public EGLDisplay f58900f;
    public final i f58901f0;
    public final g f58902g0;
    public EGLSurface h;
    public final g f58903h0;
    public final g f58904i0;
    public EGLContext f58905n;
    public EGL10 f58906r;
    public EGLConfig f58907s;
    public GL10 f58908w;
    public long f58909x;
    public volatile int f58910y;

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
        this.f58899e0 = new AnimatorSet();
        this.f58901f0 = new i(this, 0);
        this.f58902g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f58879b;

            {
                this.f58879b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f58879b.f58893b.f58858e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f58879b.f58893b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f58879b.f58893b.f58861i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f58903h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f58879b;

            {
                this.f58879b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f58879b.f58893b.f58858e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f58879b.f58893b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f58879b.f58893b.f58861i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f58904i0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final m f58879b;

            {
                this.f58879b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f58879b.f58893b.f58858e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f58879b.f58893b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f58879b.f58893b.f58861i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        this.L = (int) g0.f23612r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new h(this, i10));
        this.f58896c0 = gestureDetector;
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
                if (mVar.f58893b != null) {
                    int i10 = mVar.E;
                    int i11 = mVar.f58910y;
                    if (mVar.U) {
                        mVar.f58906r.eglQuerySurface(mVar.f58900f, mVar.h, 12375, mVar.V);
                        mVar.f58906r.eglQuerySurface(mVar.f58900f, mVar.h, 12374, mVar.W);
                        int i12 = mVar.V[0];
                        if (i12 > 0 && (i7 = mVar.W[0]) > 0 && (i12 != i10 || i7 != i11)) {
                            mVar.f58895c.setDefaultBufferSize(i10, i11);
                            i10 = mVar.V[0];
                            i11 = mVar.W[0];
                        }
                    }
                    if (i10 != mVar.F || i11 != mVar.G) {
                        mVar.F = i10;
                        mVar.G = i11;
                        mVar.f58893b.onSurfaceChanged(mVar.f58908w, i10, i11);
                    }
                    f fVar = mVar.f58893b;
                    fVar.G = f10;
                    fVar.onDrawFrame(mVar.f58908w);
                }
                mVar.g();
                if (!mVar.f58906r.eglSwapBuffers(mVar.f58900f, mVar.h) && mVar.T == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + mVar.f58906r.eglGetError());
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
                mVar.f58898e = fVar;
                fVar.onSurfaceCreated(mVar.f58908w, mVar.f58907s);
                mVar.F = mVar.E;
                int i7 = mVar.f58910y;
                mVar.G = i7;
                fVar.onSurfaceChanged(mVar.f58908w, mVar.F, i7);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f58897d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f58897d0.cancel();
            this.f58897d0 = null;
        }
        AnimatorSet animatorSet = this.f58899e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f58899e0.cancel();
            this.f58899e0 = null;
        }
    }

    public final void e() {
        if (this.f58905n.equals(this.f58906r.eglGetCurrentContext()) && this.h.equals(this.f58906r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f58906r;
        EGLDisplay eGLDisplay = this.f58900f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58905n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f58906r.eglGetError()));
    }

    public final void f() {
        if (this.f58906r.eglGetError() != 12288) {
            a8.d("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.f58908w.glGetError();
        if (glGetError != 0 && this.T == 4) {
            throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
        }
    }

    public int getMaxFrameRate() {
        if (this.T == 4) {
            if (gz.o() == 2) {
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
        i iVar = this.f58901f0;
        g0.r(iVar);
        if (!this.J && this.N) {
            g0.i3(iVar, j3);
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
        this.f58910y = i10;
    }

    public final void l() {
        d();
        f fVar = this.f58893b;
        float f10 = fVar.d;
        float f11 = fVar.f58861i;
        float f12 = fVar.f58858e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f58897d0 = ofFloat;
        ofFloat.addUpdateListener(new i0(this, f10, f12, f11, 2));
        this.f58897d0.setDuration(600L);
        this.f58897d0.setInterpolator(new OvershootInterpolator());
        this.f58897d0.start();
        s1 s1Var = this.S;
        if (s1Var != null) {
            s1Var.b(Math.abs(f13));
        }
        j(this.M);
    }

    public final void m(long j3) {
        f fVar = this.f58893b;
        if (fVar != null) {
            fVar.d = -180.0f;
            g0.i3(new i(this, 1), j3);
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
            g gVar = this.f58904i0;
            g gVar2 = this.f58903h0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.f22414b.nextInt() % 4);
                this.f58899e0 = new AnimatorSet();
                int i12 = this.T;
                if (i12 == 4) {
                    float f10 = this.f58893b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                    ofFloat.addUpdateListener(gVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f58899e0.playTogether(ofFloat);
                } else if (abs == 0 && i12 != 1 && i12 != 3) {
                    float f11 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f58893b.f58861i, f11);
                    ofFloat2.addUpdateListener(gVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(er.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat3.addUpdateListener(gVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(g0.H);
                    this.f58899e0.playTogether(ofFloat2, ofFloat3);
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
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f58893b.f58861i, f12);
                    ofFloat4.addUpdateListener(gVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(er.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                    ofFloat5.addUpdateListener(gVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(g0.H);
                    this.f58899e0.playTogether(ofFloat4, ofFloat5);
                }
                this.f58899e0.addListener(new j(this, 1));
                this.f58899e0.start();
            } else if (intValue == 1) {
                this.f58899e0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f58893b.d, 360.0f);
                ofFloat6.addUpdateListener(gVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(er.f34419f);
                this.f58899e0.playTogether(ofFloat6);
                this.f58899e0.addListener(new j(this, 0));
                this.f58899e0.start();
            } else if (intValue == 2) {
                this.f58899e0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f58893b.d, 184.0f);
                ofFloat7.addUpdateListener(gVar2);
                ofFloat7.setDuration(600L);
                er erVar = er.f34420g;
                ofFloat7.setInterpolator(erVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f58893b.f58861i, 50.0f);
                ofFloat8.addUpdateListener(gVar);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(erVar);
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
                ofFloat11.addUpdateListener(this.f58902g0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f58899e0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f58899e0.addListener(new j(this, 3));
                this.f58899e0.start();
            } else {
                this.f58899e0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f58893b.d, 180.0f);
                ofFloat12.addUpdateListener(gVar2);
                ofFloat12.setDuration(600L);
                er erVar2 = er.f34419f;
                ofFloat12.setInterpolator(erVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(gVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(erVar2);
                this.f58899e0.playTogether(ofFloat12, ofFloat13);
                this.f58899e0.addListener(new j(this, 2));
                this.f58899e0.start();
            }
        }
    }

    public final void o() {
        l lVar = this.K;
        this.K = null;
        this.f58892a0 = false;
        if (lVar != null) {
            lVar.f58889b = true;
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
        f fVar = this.f58893b;
        if (fVar != null) {
            fVar.d = 0.0f;
            fVar.f58861i = 0.0f;
            fVar.f58858e = 0.0f;
        }
        this.R = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        o();
        this.f58892a0 = false;
        this.K = new l(this, surfaceTexture);
        k(surfaceTexture, i7, i10);
        this.f58909x = 1000000000 / Math.max(1, Math.min(this.L, getMaxFrameRate()));
        this.K.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f58892a0 = false;
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
            this.f58891a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.f58896c0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        f fVar = this.f58893b;
        n nVar = fVar.f58857c;
        if (nVar != null && nVar.f58914a == null) {
            nVar.Z = bitmap;
        }
        fVar.f58870r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.J = z10;
        if (z10) {
            g0.r(this.f58901f0);
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
        g0.r(this.f58901f0);
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
        this.f58893b = fVar;
        this.I = true;
    }

    public void setStarParticlesView(s1 s1Var) {
        this.S = s1Var;
    }

    @Override
    public final void updateColors() {
        try {
            f fVar = this.f58893b;
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
