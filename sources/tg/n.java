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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.voip.w;
import sg.x1;
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
    public x1 R;
    public final int S;
    public volatile boolean T;
    public volatile Runnable U;
    public final GestureDetector V;
    public ValueAnimator W;
    public boolean f45738a;
    public AnimatorSet f45739a0;
    public g f45740b;
    public final j f45741b0;
    public SurfaceTexture f45742c;
    public final h f45743c0;
    public final Object d;
    public final h f45744d0;
    public g e;
    public final h f45745e0;
    public EGLDisplay f45746f;
    public EGLSurface h;
    public EGLContext f45747n;
    public EGL10 f45748r;
    public EGLConfig f45749s;
    public GL10 v;
    public long f45750w;
    public volatile int f45751x;
    public volatile int f45752y;

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
        this.f45739a0 = new AnimatorSet();
        this.f45741b0 = new j(this, 0);
        this.f45743c0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f45726b;

            {
                this.f45726b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f45726b.f45740b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f45726b.f45740b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f45726b.f45740b.f45708i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f45744d0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f45726b;

            {
                this.f45726b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f45726b.f45740b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f45726b.f45740b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f45726b.f45740b.f45708i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f45745e0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final n f45726b;

            {
                this.f45726b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f45726b.f45740b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f45726b.f45740b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f45726b.f45740b.f45708i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        this.V = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i13 < this.N) {
            i13 = k3.f(i13, i13, 1, this.P);
        }
        Collections.shuffle(this.P);
    }

    public static void a(n nVar, float f7) {
        synchronized (nVar) {
            try {
                nVar.e();
                if (nVar.f45740b != null) {
                    int i10 = nVar.f45752y;
                    int i11 = nVar.f45751x;
                    if (i10 == nVar.E) {
                        if (i11 != nVar.F) {
                        }
                        g gVar = nVar.f45740b;
                        gVar.G = f7;
                        gVar.onDrawFrame(nVar.v);
                    }
                    nVar.E = i10;
                    nVar.F = i11;
                    nVar.f45740b.onSurfaceChanged(nVar.v, i10, i11);
                    g gVar2 = nVar.f45740b;
                    gVar2.G = f7;
                    gVar2.onDrawFrame(nVar.v);
                }
                nVar.g();
                if (!nVar.f45748r.eglSwapBuffers(nVar.f45746f, nVar.h) && nVar.S == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + nVar.f45748r.eglGetError());
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
                gVar.onSurfaceCreated(nVar.v, nVar.f45749s);
                nVar.E = nVar.f45752y;
                int i10 = nVar.f45751x;
                nVar.F = i10;
                gVar.onSurfaceChanged(nVar.v, nVar.E, i10);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W.cancel();
            this.W = null;
        }
        AnimatorSet animatorSet = this.f45739a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f45739a0.cancel();
            this.f45739a0 = null;
        }
    }

    public final void e() {
        if (this.f45747n.equals(this.f45748r.eglGetCurrentContext()) && this.h.equals(this.f45748r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f45748r;
        EGLDisplay eGLDisplay = this.f45746f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f45747n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f45748r.eglGetError()));
    }

    public final void f() {
        if (this.f45748r.eglGetError() != 12288) {
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

    public boolean j() {
        if (this.S == 4) {
            return true;
        }
        return false;
    }

    public final void k(long j10) {
        j jVar = this.f45741b0;
        AndroidUtilities.cancelRunOnUIThread(jVar);
        if (!this.I && this.M) {
            AndroidUtilities.runOnUIThread(jVar, j10);
        }
    }

    public final void l() {
        d();
        g gVar = this.f45740b;
        float f7 = gVar.d;
        float f10 = gVar.f45708i;
        float f11 = gVar.e;
        float f12 = f7 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new w(this, f7, f11, f10, 2));
        this.W.setDuration(600L);
        this.W.setInterpolator(new OvershootInterpolator());
        this.W.start();
        x1 x1Var = this.R;
        if (x1Var != null) {
            x1Var.b(Math.abs(f12));
        }
        k(this.L);
    }

    public final void m(long j10) {
        g gVar = this.f45740b;
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
            h hVar = this.f45745e0;
            h hVar2 = this.f45744d0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.random.nextInt() % 4);
                this.f45739a0 = new AnimatorSet();
                int i13 = this.S;
                if (i13 == 4) {
                    float f7 = this.f45740b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                    ofFloat.addUpdateListener(hVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f45739a0.playTogether(ofFloat);
                } else if (abs == 0 && i13 != 1 && i13 != 3) {
                    float f10 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f45740b.f45708i, f10);
                    ofFloat2.addUpdateListener(hVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(es.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(hVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.f45739a0.playTogether(ofFloat2, ofFloat3);
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
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f45740b.f45708i, f11);
                    ofFloat4.addUpdateListener(hVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(es.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(hVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.f45739a0.playTogether(ofFloat4, ofFloat5);
                }
                this.f45739a0.addListener(new k(this, 1));
                this.f45739a0.start();
            } else if (intValue == 1) {
                this.f45739a0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f45740b.d, 360.0f);
                ofFloat6.addUpdateListener(hVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(es.f24465f);
                this.f45739a0.playTogether(ofFloat6);
                this.f45739a0.addListener(new k(this, 0));
                this.f45739a0.start();
            } else if (intValue == 2) {
                this.f45739a0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f45740b.d, 184.0f);
                ofFloat7.addUpdateListener(hVar2);
                ofFloat7.setDuration(600L);
                es esVar = es.f24466g;
                ofFloat7.setInterpolator(esVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f45740b.f45708i, 50.0f);
                ofFloat8.addUpdateListener(hVar);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(esVar);
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
                ofFloat11.addUpdateListener(this.f45743c0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f45739a0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f45739a0.addListener(new k(this, 3));
                this.f45739a0.start();
            } else {
                this.f45739a0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f45740b.d, 180.0f);
                ofFloat12.addUpdateListener(hVar2);
                ofFloat12.setDuration(600L);
                es esVar2 = es.f24465f;
                ofFloat12.setInterpolator(esVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(hVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(esVar2);
                this.f45739a0.playTogether(ofFloat12, ofFloat13);
                this.f45739a0.addListener(new k(this, 2));
                this.f45739a0.start();
            }
        }
    }

    public final void o() {
        m mVar = this.J;
        this.J = null;
        this.T = false;
        if (mVar != null) {
            mVar.f45736b = true;
            mVar.interrupt();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.H = true;
        k(this.L);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        g gVar = this.f45740b;
        if (gVar != null) {
            gVar.d = 0.0f;
            gVar.f45708i = 0.0f;
            gVar.e = 0.0f;
        }
        this.Q = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        o();
        this.T = false;
        this.J = new m(this, surfaceTexture);
        this.f45752y = i10;
        this.f45751x = i11;
        this.f45750w = 1000000000 / Math.max(1, Math.min(this.K, getMaxFrameRate()));
        this.J.start();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.T = false;
        o();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f45752y = i10;
        this.f45751x = i11;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f45738a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.V.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        g gVar = this.f45740b;
        o oVar = gVar.f45705c;
        if (oVar != null && oVar.f45756a == null) {
            oVar.Z = bitmap;
        }
        gVar.f45717r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.I = z10;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f45741b0);
            l();
            return;
        }
        k(this.L);
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.M = z10;
        if (z10) {
            k(this.L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f45741b0);
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
        this.f45740b = gVar;
        this.H = true;
    }

    public void setStarParticlesView(x1 x1Var) {
        this.R = x1Var;
    }

    public void h() {
    }

    public void i() {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
