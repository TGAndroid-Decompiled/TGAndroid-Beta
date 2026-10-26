package ug;

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
import c3.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.voip.w;
import tg.x1;
public class n extends TextureView implements TextureView.SurfaceTextureListener, p6 {
    public int E;
    public int F;
    public volatile boolean G;
    public volatile boolean H;
    public boolean I;
    public volatile m J;
    public final int K;
    public final long L;
    public boolean M;
    public final int N;
    public int O;
    public final ArrayList P;
    public boolean Q;
    public x1 R;
    public final int S;
    public volatile boolean T;
    public final int[] U;
    public final int[] V;
    public volatile boolean W;
    public boolean f49814a;
    public volatile Runnable f49815a0;
    public g f49816b;
    public final GestureDetector f49817b0;
    public SurfaceTexture f49818c;
    public ValueAnimator f49819c0;
    public final Object d;
    public AnimatorSet f49820d0;
    public g e;
    public final j f49821e0;
    public EGLDisplay f49822f;
    public final h f49823f0;
    public final h f49824g0;
    public EGLSurface h;
    public final h f49825h0;
    public EGLContext f49826n;
    public EGL10 f49827r;
    public EGLConfig f49828s;
    public GL10 v;
    public long f49829w;
    public volatile int f49830x;
    public volatile int f49831y;

    public n(Context context, int i10, int i11) {
        super(context);
        int i12;
        long j10;
        this.d = new Object();
        this.G = true;
        int i13 = 0;
        this.H = false;
        this.I = false;
        this.M = true;
        this.P = new ArrayList();
        this.U = new int[1];
        this.V = new int[1];
        this.f49820d0 = new AnimatorSet();
        this.f49821e0 = new j(this, 0);
        this.f49823f0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f49802b;

            {
                this.f49802b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f49802b.f49816b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f49802b.f49816b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f49802b.f49816b.f49784i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f49824g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f49802b;

            {
                this.f49802b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f49802b.f49816b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f49802b.f49816b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f49802b.f49816b.f49784i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f49825h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f49802b;

            {
                this.f49802b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f49802b.f49816b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f49802b.f49816b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f49802b.f49816b.f49784i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.S = i11;
        if (i11 != 1 && i11 != 4 && i11 != 3) {
            i12 = 5;
        } else {
            i12 = 1;
        }
        this.N = i12;
        if (i11 == 4) {
            j10 = 0;
        } else {
            j10 = 2000;
        }
        this.L = j10;
        setOpaque(false);
        setRenderer(new g(context, i10, i11));
        this.K = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new i(this, i11));
        this.f49817b0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i13 < this.N) {
            i13 = h0.i(i13, i13, 1, this.P);
        }
        Collections.shuffle(this.P);
    }

    public static void a(n nVar, float f7) {
        int i10;
        synchronized (nVar) {
            try {
                nVar.e();
                if (nVar.f49816b != null) {
                    int i11 = nVar.f49831y;
                    int i12 = nVar.f49830x;
                    if (nVar.T) {
                        nVar.f49827r.eglQuerySurface(nVar.f49822f, nVar.h, 12375, nVar.U);
                        nVar.f49827r.eglQuerySurface(nVar.f49822f, nVar.h, 12374, nVar.V);
                        int i13 = nVar.U[0];
                        if (i13 > 0 && (i10 = nVar.V[0]) > 0 && (i13 != i11 || i10 != i12)) {
                            nVar.f49818c.setDefaultBufferSize(i11, i12);
                            i11 = nVar.U[0];
                            i12 = nVar.V[0];
                        }
                    }
                    if (i11 != nVar.E || i12 != nVar.F) {
                        nVar.E = i11;
                        nVar.F = i12;
                        nVar.f49816b.onSurfaceChanged(nVar.v, i11, i12);
                    }
                    g gVar = nVar.f49816b;
                    gVar.G = f7;
                    gVar.onDrawFrame(nVar.v);
                }
                nVar.g();
                if (!nVar.f49827r.eglSwapBuffers(nVar.f49822f, nVar.h) && nVar.S == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + nVar.f49827r.eglGetError());
                }
            } finally {
            }
        }
    }

    public static void b(ug.n r5) {
        throw new UnsupportedOperationException("Method not decompiled: ug.n.b(ug.n):void");
    }

    public static void c(n nVar, g gVar) {
        synchronized (nVar) {
            if (gVar != null) {
                nVar.e = gVar;
                gVar.onSurfaceCreated(nVar.v, nVar.f49828s);
                nVar.E = nVar.f49831y;
                int i10 = nVar.f49830x;
                nVar.F = i10;
                gVar.onSurfaceChanged(nVar.v, nVar.E, i10);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f49819c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f49819c0.cancel();
            this.f49819c0 = null;
        }
        AnimatorSet animatorSet = this.f49820d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f49820d0.cancel();
            this.f49820d0 = null;
        }
    }

    public final void e() {
        if (this.f49826n.equals(this.f49827r.eglGetCurrentContext()) && this.h.equals(this.f49827r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f49827r;
        EGLDisplay eGLDisplay = this.f49822f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f49826n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f49827r.eglGetError()));
    }

    public final void f() {
        if (this.f49827r.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.v.glGetError();
        if (glGetError != 0 && this.S == 4) {
            throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
        }
    }

    public int getMaxFrameRate() {
        if (this.S == 4) {
            if (SharedConfig.getDevicePerformanceClass() == 2) {
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

    public final void j(long j10) {
        j jVar = this.f49821e0;
        AndroidUtilities.cancelRunOnUIThread(jVar);
        if (!this.I && this.M) {
            AndroidUtilities.runOnUIThread(jVar, j10);
        }
    }

    public final void k(SurfaceTexture surfaceTexture, int i10, int i11) {
        boolean z10;
        float renderScale = getRenderScale();
        int i12 = (renderScale > 1.0f ? 1 : (renderScale == 1.0f ? 0 : -1));
        if (i12 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = z10;
        if (i12 < 0 && i10 > 0 && i11 > 0) {
            i10 = Math.max(1, Math.round(i10 * renderScale));
            i11 = Math.max(1, Math.round(i11 * renderScale));
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
        this.f49831y = i10;
        this.f49830x = i11;
    }

    public final void l() {
        d();
        g gVar = this.f49816b;
        float f7 = gVar.d;
        float f10 = gVar.f49784i;
        float f11 = gVar.e;
        float f12 = f7 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f49819c0 = ofFloat;
        ofFloat.addUpdateListener(new w(this, f7, f11, f10, 2));
        this.f49819c0.setDuration(600L);
        this.f49819c0.setInterpolator(new OvershootInterpolator());
        this.f49819c0.start();
        x1 x1Var = this.R;
        if (x1Var != null) {
            x1Var.b(Math.abs(f12));
        }
        j(this.L);
    }

    public final void m(long j10) {
        g gVar = this.f49816b;
        if (gVar != null) {
            gVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new j(this, 1), j10);
        }
    }

    public void n() {
        int i10;
        if (this.Q && this.M) {
            int i11 = this.O;
            ArrayList arrayList = this.P;
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int i12 = this.O + 1;
            this.O = i12;
            if (i12 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.O = 0;
            }
            h hVar = this.f49825h0;
            h hVar2 = this.f49824g0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.random.nextInt() % 4);
                this.f49820d0 = new AnimatorSet();
                int i13 = this.S;
                if (i13 == 4) {
                    float f7 = this.f49816b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                    ofFloat.addUpdateListener(hVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f49820d0.playTogether(ofFloat);
                } else if (abs == 0 && i13 != 1 && i13 != 3) {
                    float f10 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f49816b.f49784i, f10);
                    ofFloat2.addUpdateListener(hVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(ds.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(hVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.f49820d0.playTogether(ofFloat2, ofFloat3);
                } else {
                    if (i13 != 1 && i13 != 3) {
                        i10 = 485;
                    } else {
                        i10 = 360;
                    }
                    if (abs == 2) {
                        i10 = -i10;
                    }
                    float f11 = i10;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f49816b.f49784i, f11);
                    ofFloat4.addUpdateListener(hVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(ds.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(hVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.f49820d0.playTogether(ofFloat4, ofFloat5);
                }
                this.f49820d0.addListener(new k(this, 1));
                this.f49820d0.start();
            } else if (intValue == 1) {
                this.f49820d0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f49816b.d, 360.0f);
                ofFloat6.addUpdateListener(hVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(ds.f27586f);
                this.f49820d0.playTogether(ofFloat6);
                this.f49820d0.addListener(new k(this, 0));
                this.f49820d0.start();
            } else if (intValue == 2) {
                this.f49820d0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f49816b.d, 184.0f);
                ofFloat7.addUpdateListener(hVar2);
                ofFloat7.setDuration(600L);
                ds dsVar = ds.f27587g;
                ofFloat7.setInterpolator(dsVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f49816b.f49784i, 50.0f);
                ofFloat8.addUpdateListener(hVar);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(dsVar);
                ValueAnimator ofFloat9 = ValueAnimator.ofFloat(180.0f, 0.0f);
                ofFloat9.addUpdateListener(hVar2);
                ofFloat9.setDuration(800L);
                ofFloat9.setStartDelay(10000L);
                ofFloat9.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat10 = ValueAnimator.ofFloat(60.0f, 0.0f);
                ofFloat10.addUpdateListener(hVar);
                ofFloat10.setDuration(800L);
                ofFloat10.setStartDelay(10000L);
                ofFloat10.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
                ofFloat11.addUpdateListener(this.f49823f0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f49820d0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f49820d0.addListener(new k(this, 3));
                this.f49820d0.start();
            } else {
                this.f49820d0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f49816b.d, 180.0f);
                ofFloat12.addUpdateListener(hVar2);
                ofFloat12.setDuration(600L);
                ds dsVar2 = ds.f27586f;
                ofFloat12.setInterpolator(dsVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(hVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(dsVar2);
                this.f49820d0.playTogether(ofFloat12, ofFloat13);
                this.f49820d0.addListener(new k(this, 2));
                this.f49820d0.start();
            }
        }
    }

    public final void o() {
        m mVar = this.J;
        this.J = null;
        this.W = false;
        if (mVar != null) {
            mVar.f49812b = true;
            mVar.interrupt();
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
        g gVar = this.f49816b;
        if (gVar != null) {
            gVar.d = 0.0f;
            gVar.f49784i = 0.0f;
            gVar.e = 0.0f;
        }
        this.Q = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        o();
        this.W = false;
        this.J = new m(this, surfaceTexture);
        k(surfaceTexture, i10, i11);
        this.f49829w = 1000000000 / Math.max(1, Math.min(this.K, getMaxFrameRate()));
        this.J.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.W = false;
        o();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        k(surfaceTexture, i10, i11);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f49814a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.f49817b0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        g gVar = this.f49816b;
        o oVar = gVar.f49781c;
        if (oVar != null && oVar.f49835a == null) {
            oVar.Z = bitmap;
        }
        gVar.f49793r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.I = z10;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f49821e0);
            l();
            return;
        }
        j(this.L);
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.M = z10;
        if (z10) {
            j(this.L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f49821e0);
        d();
    }

    public void setPaused(boolean z10) {
        boolean z11 = this.G;
        this.G = z10;
        if (z11 && !z10 && this.J != null) {
            this.J.interrupt();
        }
    }

    public synchronized void setRenderer(g gVar) {
        this.f49816b = gVar;
        this.H = true;
    }

    public void setStarParticlesView(x1 x1Var) {
        this.R = x1Var;
    }

    @Override
    public final void updateColors() {
        try {
            g gVar = this.f49816b;
            if (gVar != null) {
                gVar.b();
            }
        } catch (Exception e) {
            FileLog.e(e);
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
