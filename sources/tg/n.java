package tg;

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
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.voip.w;
import sg.w1;
public class n extends TextureView implements TextureView.SurfaceTextureListener {
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
    public w1 R;
    public final int S;
    public volatile boolean T;
    public final int[] U;
    public final int[] V;
    public volatile boolean W;
    public boolean f47147a;
    public volatile Runnable f47148a0;
    public g f47149b;
    public final GestureDetector f47150b0;
    public SurfaceTexture f47151c;
    public ValueAnimator f47152c0;
    public final Object d;
    public AnimatorSet f47153d0;
    public g e;
    public final j f47154e0;
    public EGLDisplay f47155f;
    public final h f47156f0;
    public final h f47157g0;
    public EGLSurface h;
    public final h f47158h0;
    public EGLContext f47159n;
    public EGL10 f47160r;
    public EGLConfig f47161s;
    public GL10 v;
    public long f47162w;
    public volatile int f47163x;
    public volatile int f47164y;

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
        this.f47153d0 = new AnimatorSet();
        this.f47154e0 = new j(this, 0);
        this.f47156f0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f47135b;

            {
                this.f47135b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f47135b.f47149b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f47135b.f47149b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f47135b.f47149b.f47117i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f47157g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f47135b;

            {
                this.f47135b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f47135b.f47149b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f47135b.f47149b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f47135b.f47149b.f47117i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f47158h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f47135b;

            {
                this.f47135b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f47135b.f47149b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f47135b.f47149b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f47135b.f47149b.f47117i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        this.f47150b0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i13 < this.N) {
            i13 = k3.f(i13, i13, 1, this.P);
        }
        Collections.shuffle(this.P);
    }

    public static void a(n nVar, float f7) {
        int i10;
        synchronized (nVar) {
            try {
                nVar.e();
                if (nVar.f47149b != null) {
                    int i11 = nVar.f47164y;
                    int i12 = nVar.f47163x;
                    if (nVar.T) {
                        nVar.f47160r.eglQuerySurface(nVar.f47155f, nVar.h, 12375, nVar.U);
                        nVar.f47160r.eglQuerySurface(nVar.f47155f, nVar.h, 12374, nVar.V);
                        int i13 = nVar.U[0];
                        if (i13 > 0 && (i10 = nVar.V[0]) > 0 && (i13 != i11 || i10 != i12)) {
                            nVar.f47151c.setDefaultBufferSize(i11, i12);
                            i11 = nVar.U[0];
                            i12 = nVar.V[0];
                        }
                    }
                    if (i11 != nVar.E || i12 != nVar.F) {
                        nVar.E = i11;
                        nVar.F = i12;
                        nVar.f47149b.onSurfaceChanged(nVar.v, i11, i12);
                    }
                    g gVar = nVar.f47149b;
                    gVar.G = f7;
                    gVar.onDrawFrame(nVar.v);
                }
                nVar.g();
                if (!nVar.f47160r.eglSwapBuffers(nVar.f47155f, nVar.h) && nVar.S == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + nVar.f47160r.eglGetError());
                }
            } finally {
            }
        }
    }

    public static void b(tg.n r5) {
        throw new UnsupportedOperationException("Method not decompiled: tg.n.b(tg.n):void");
    }

    public static void c(n nVar, g gVar) {
        synchronized (nVar) {
            if (gVar != null) {
                nVar.e = gVar;
                gVar.onSurfaceCreated(nVar.v, nVar.f47161s);
                nVar.E = nVar.f47164y;
                int i10 = nVar.f47163x;
                nVar.F = i10;
                gVar.onSurfaceChanged(nVar.v, nVar.E, i10);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f47152c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f47152c0.cancel();
            this.f47152c0 = null;
        }
        AnimatorSet animatorSet = this.f47153d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f47153d0.cancel();
            this.f47153d0 = null;
        }
    }

    public final void e() {
        if (this.f47159n.equals(this.f47160r.eglGetCurrentContext()) && this.h.equals(this.f47160r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f47160r;
        EGLDisplay eGLDisplay = this.f47155f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f47159n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f47160r.eglGetError()));
    }

    public final void f() {
        if (this.f47160r.eglGetError() != 12288) {
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

    public boolean k() {
        if (this.S == 4) {
            return true;
        }
        return false;
    }

    public final void l(long j10) {
        j jVar = this.f47154e0;
        AndroidUtilities.cancelRunOnUIThread(jVar);
        if (!this.I && this.M) {
            AndroidUtilities.runOnUIThread(jVar, j10);
        }
    }

    public final void m(SurfaceTexture surfaceTexture, int i10, int i11) {
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
        this.f47164y = i10;
        this.f47163x = i11;
    }

    public final void n() {
        d();
        g gVar = this.f47149b;
        float f7 = gVar.d;
        float f10 = gVar.f47117i;
        float f11 = gVar.e;
        float f12 = f7 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f47152c0 = ofFloat;
        ofFloat.addUpdateListener(new w(this, f7, f11, f10, 2));
        this.f47152c0.setDuration(600L);
        this.f47152c0.setInterpolator(new OvershootInterpolator());
        this.f47152c0.start();
        w1 w1Var = this.R;
        if (w1Var != null) {
            w1Var.b(Math.abs(f12));
        }
        l(this.L);
    }

    public final void o(long j10) {
        g gVar = this.f47149b;
        if (gVar != null) {
            gVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new j(this, 1), j10);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.H = true;
        l(this.L);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        g gVar = this.f47149b;
        if (gVar != null) {
            gVar.d = 0.0f;
            gVar.f47117i = 0.0f;
            gVar.e = 0.0f;
        }
        this.Q = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        q();
        this.W = false;
        this.J = new m(this, surfaceTexture);
        m(surfaceTexture, i10, i11);
        this.f47162w = 1000000000 / Math.max(1, Math.min(this.K, getMaxFrameRate()));
        this.J.start();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.W = false;
        q();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        m(surfaceTexture, i10, i11);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f47147a = false;
            n();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.f47150b0.onTouchEvent(motionEvent);
    }

    public void p() {
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
            h hVar = this.f47158h0;
            h hVar2 = this.f47157g0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.random.nextInt() % 4);
                this.f47153d0 = new AnimatorSet();
                int i13 = this.S;
                if (i13 == 4) {
                    float f7 = this.f47149b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                    ofFloat.addUpdateListener(hVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f47153d0.playTogether(ofFloat);
                } else if (abs == 0 && i13 != 1 && i13 != 3) {
                    float f10 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f47149b.f47117i, f10);
                    ofFloat2.addUpdateListener(hVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(bs.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(hVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.f47153d0.playTogether(ofFloat2, ofFloat3);
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
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f47149b.f47117i, f11);
                    ofFloat4.addUpdateListener(hVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(bs.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(hVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.f47153d0.playTogether(ofFloat4, ofFloat5);
                }
                this.f47153d0.addListener(new k(this, 1));
                this.f47153d0.start();
            } else if (intValue == 1) {
                this.f47153d0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f47149b.d, 360.0f);
                ofFloat6.addUpdateListener(hVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(bs.f25037f);
                this.f47153d0.playTogether(ofFloat6);
                this.f47153d0.addListener(new k(this, 0));
                this.f47153d0.start();
            } else if (intValue == 2) {
                this.f47153d0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f47149b.d, 184.0f);
                ofFloat7.addUpdateListener(hVar2);
                ofFloat7.setDuration(600L);
                bs bsVar = bs.f25038g;
                ofFloat7.setInterpolator(bsVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f47149b.f47117i, 50.0f);
                ofFloat8.addUpdateListener(hVar);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(bsVar);
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
                ofFloat11.addUpdateListener(this.f47156f0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f47153d0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f47153d0.addListener(new k(this, 3));
                this.f47153d0.start();
            } else {
                this.f47153d0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f47149b.d, 180.0f);
                ofFloat12.addUpdateListener(hVar2);
                ofFloat12.setDuration(600L);
                bs bsVar2 = bs.f25037f;
                ofFloat12.setInterpolator(bsVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(hVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(bsVar2);
                this.f47153d0.playTogether(ofFloat12, ofFloat13);
                this.f47153d0.addListener(new k(this, 2));
                this.f47153d0.start();
            }
        }
    }

    public final void q() {
        m mVar = this.J;
        this.J = null;
        this.W = false;
        if (mVar != null) {
            mVar.f47145b = true;
            mVar.interrupt();
        }
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        g gVar = this.f47149b;
        o oVar = gVar.f47114c;
        if (oVar != null && oVar.f47168a == null) {
            oVar.Z = bitmap;
        }
        gVar.f47126r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.I = z10;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f47154e0);
            n();
            return;
        }
        l(this.L);
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.M = z10;
        if (z10) {
            l(this.L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f47154e0);
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
        this.f47149b = gVar;
        this.H = true;
    }

    public void setStarParticlesView(w1 w1Var) {
        this.R = w1Var;
    }

    public long h(long j10) {
        return j10;
    }

    public void i() {
    }

    public void j() {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
