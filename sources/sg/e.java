package sg;

import ai.k6;
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
import h2.k;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.voip.x;
import rg.v1;
import yh.z7;
public class e extends TextureView implements TextureView.SurfaceTextureListener {
    public boolean E;
    public boolean F;
    public k G;
    public final int H;
    public final long I;
    public final int J;
    public int K;
    public final ArrayList L;
    public boolean M;
    public v1 N;
    public final int O;
    public volatile boolean P;
    public volatile z7 Q;
    public final GestureDetector R;
    public ValueAnimator S;
    public AnimatorSet T;
    public final c U;
    public final b V;
    public final b W;
    public boolean f42935a;
    public final b f42936a0;
    public a f42937b;
    public SurfaceTexture f42938c;
    public EGLDisplay d;
    public EGLSurface e;
    public EGLContext f42939f;
    public EGL10 h;
    public EGLConfig f42940n;
    public GL10 f42941r;
    public int f42942s;
    public int v;
    public int f42943w;
    public boolean f42944x;
    public boolean f42945y;

    public e(Context context, int i10, int i11) {
        super(context);
        int i12;
        long j3;
        int i13 = 0;
        this.f42944x = false;
        this.f42945y = true;
        this.E = false;
        this.F = false;
        this.L = new ArrayList();
        this.T = new AnimatorSet();
        this.U = new c(this, 0);
        this.V = new ValueAnimator.AnimatorUpdateListener(this) {
            public final e f42930b;

            {
                this.f42930b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f42930b.f42937b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f42930b.f42937b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f42930b.f42937b.f42911g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.W = new ValueAnimator.AnimatorUpdateListener(this) {
            public final e f42930b;

            {
                this.f42930b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f42930b.f42937b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f42930b.f42937b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f42930b.f42937b.f42911g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f42936a0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final e f42930b;

            {
                this.f42930b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f42930b.f42937b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f42930b.f42937b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f42930b.f42937b.f42911g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.O = i11;
        if (i11 != 1 && i11 != 4 && i11 != 3) {
            i12 = 5;
        } else {
            i12 = 1;
        }
        this.J = i12;
        if (i11 == 4) {
            j3 = 0;
        } else {
            j3 = 2000;
        }
        this.I = j3;
        setOpaque(false);
        setRenderer(new a(context, i10, i11));
        this.H = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new k6(1, this));
        this.R = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i13 < this.J) {
            i13 = e2.e(i13, i13, 1, this.L);
        }
        Collections.shuffle(this.L);
    }

    public static void a(e eVar) {
        int[] iArr;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        eVar.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        eVar.d = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (eVar.h.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EmuDetector.with(eVar.getContext()).detect()) {
                    iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344};
                } else {
                    iArr = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
                }
                eVar.f42940n = null;
                if (eVar.h.eglChooseConfig(eVar.d, iArr, eGLConfigArr, 1, iArr2)) {
                    if (iArr2[0] > 0) {
                        eVar.f42940n = eGLConfigArr[0];
                    }
                    EGLConfig eGLConfig = eVar.f42940n;
                    if (eGLConfig != null) {
                        eVar.f42939f = eVar.h.eglCreateContext(eVar.d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                        eVar.f();
                        eVar.e = eVar.h.eglCreateWindowSurface(eVar.d, eVar.f42940n, eVar.f42938c, null);
                        eVar.f();
                        EGLSurface eGLSurface = eVar.e;
                        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                            if (eVar.h.eglMakeCurrent(eVar.d, eGLSurface, eGLSurface, eVar.f42939f)) {
                                eVar.f();
                                eVar.f42941r = (GL10) eVar.f42939f.getGL();
                                eVar.f();
                                return;
                            }
                            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
                        }
                        int eglGetError = eVar.h.eglGetError();
                        if (eglGetError == 12299) {
                            FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                            return;
                        }
                        throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
                    }
                    throw new RuntimeException("eglConfig not initialized");
                }
                throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
            }
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
        }
        throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
    }

    public static boolean b(e eVar) {
        boolean z10;
        synchronized (eVar) {
            z10 = eVar.f42945y;
        }
        if (!z10 && eVar.f42937b != null) {
            return false;
        }
        return true;
    }

    public static void c(e eVar, float f7) {
        synchronized (eVar) {
            try {
                eVar.e();
                a aVar = eVar.f42937b;
                if (aVar != null) {
                    aVar.D = f7;
                    aVar.onDrawFrame(eVar.f42941r);
                }
                int glGetError = eVar.f42941r.glGetError();
                if (glGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                }
                eVar.h.eglSwapBuffers(eVar.d, eVar.e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.S.cancel();
            this.S = null;
        }
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.T.cancel();
            this.T = null;
        }
    }

    public final void e() {
        if (this.f42939f.equals(this.h.eglGetCurrentContext()) && this.e.equals(this.h.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f42939f)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.h.eglGetError()));
    }

    public final void f() {
        if (this.h.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public final void h(long j3) {
        c cVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        if (this.F) {
            return;
        }
        AndroidUtilities.runOnUIThread(cVar, j3);
    }

    public final void i() {
        float f7;
        d();
        a aVar = this.f42937b;
        float f10 = aVar.d;
        float f11 = aVar.f42911g;
        float f12 = aVar.e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new x(this, f10, f12, f11, 2));
        this.S.setDuration(600L);
        this.S.setInterpolator(new OvershootInterpolator());
        this.S.start();
        v1 v1Var = this.N;
        if (v1Var != null) {
            float abs = Math.abs(f13);
            if (abs < 60.0f) {
                f7 = 5.0f;
            } else if (abs < 180.0f) {
                f7 = 9.0f;
            } else {
                f7 = 15.0f;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            r0 r0Var = new r0(v1Var, 17);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, f7);
            ofFloat2.addUpdateListener(r0Var);
            ofFloat2.setDuration(600L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f7, 1.0f);
            ofFloat3.addUpdateListener(r0Var);
            ofFloat3.setDuration(2000L);
            animatorSet.playTogether(ofFloat2, ofFloat3);
            animatorSet.start();
        }
        h(this.I);
    }

    public final void j(long j3) {
        a aVar = this.f42937b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new c(this, 1), j3);
        }
    }

    public void k() {
        int i10;
        if (!this.M) {
            return;
        }
        int i11 = this.K;
        ArrayList arrayList = this.L;
        int intValue = ((Integer) arrayList.get(i11)).intValue();
        int i12 = this.K + 1;
        this.K = i12;
        if (i12 >= arrayList.size()) {
            Collections.shuffle(arrayList);
            this.K = 0;
        }
        b bVar = this.f42936a0;
        b bVar2 = this.W;
        if (intValue == 0) {
            int abs = Math.abs(Utilities.random.nextInt() % 4);
            this.T = new AnimatorSet();
            int i13 = this.O;
            if (i13 == 4) {
                float f7 = this.f42937b.d;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                ofFloat.addUpdateListener(bVar2);
                ofFloat.setDuration(12000L);
                ofFloat.setInterpolator(new LinearInterpolator());
                this.T.playTogether(ofFloat);
            } else if (abs == 0 && i13 != 1 && i13 != 3) {
                float f10 = 48;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f42937b.f42911g, f10);
                ofFloat2.addUpdateListener(bVar);
                ofFloat2.setDuration(2300L);
                ofFloat2.setInterpolator(qr.h);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(500L);
                ofFloat3.setStartDelay(2300L);
                ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.T.playTogether(ofFloat2, ofFloat3);
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
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f42937b.f42911g, f11);
                ofFloat4.addUpdateListener(bVar2);
                ofFloat4.setDuration(3000L);
                ofFloat4.setInterpolator(qr.h);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat5.addUpdateListener(bVar2);
                ofFloat5.setDuration(1000L);
                ofFloat5.setStartDelay(3000L);
                ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.T.playTogether(ofFloat4, ofFloat5);
            }
            this.T.addListener(new d(this, 1));
            this.T.start();
        } else if (intValue == 1) {
            this.T = new AnimatorSet();
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f42937b.d, 360.0f);
            ofFloat6.addUpdateListener(bVar2);
            ofFloat6.setDuration(8000L);
            ofFloat6.setInterpolator(qr.f27423f);
            this.T.playTogether(ofFloat6);
            this.T.addListener(new d(this, 0));
            this.T.start();
        } else if (intValue == 2) {
            this.T = new AnimatorSet();
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f42937b.d, 184.0f);
            ofFloat7.addUpdateListener(bVar2);
            ofFloat7.setDuration(600L);
            qr qrVar = qr.f27424g;
            ofFloat7.setInterpolator(qrVar);
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f42937b.f42911g, 50.0f);
            ofFloat8.addUpdateListener(bVar);
            ofFloat8.setDuration(600L);
            ofFloat8.setInterpolator(qrVar);
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat9.addUpdateListener(bVar2);
            ofFloat9.setDuration(800L);
            ofFloat9.setStartDelay(10000L);
            ofFloat9.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat10.addUpdateListener(bVar);
            ofFloat10.setDuration(800L);
            ofFloat10.setStartDelay(10000L);
            ofFloat10.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat11.addUpdateListener(this.V);
            ofFloat11.setDuration(10000L);
            ofFloat11.setInterpolator(new LinearInterpolator());
            this.T.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
            this.T.addListener(new d(this, 3));
            this.T.start();
        } else {
            this.T = new AnimatorSet();
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f42937b.d, 180.0f);
            ofFloat12.addUpdateListener(bVar2);
            ofFloat12.setDuration(600L);
            qr qrVar2 = qr.f27423f;
            ofFloat12.setInterpolator(qrVar2);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
            ofFloat13.addUpdateListener(bVar2);
            ofFloat13.setDuration(600L);
            ofFloat13.setStartDelay(2000L);
            ofFloat13.setInterpolator(qrVar2);
            this.T.playTogether(ofFloat12, ofFloat13);
            this.T.addListener(new d(this, 2));
            this.T.start();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        this.E = true;
        h(this.I);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a aVar = this.f42937b;
        if (aVar != null) {
            aVar.d = 0.0f;
            aVar.f42911g = 0.0f;
            aVar.e = 0.0f;
        }
        this.M = false;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.G = new k(this);
        this.f42938c = surfaceTexture;
        this.f42943w = i10;
        this.v = i11;
        this.f42942s = Math.max(0, ((int) ((1.0f / this.H) * 1000.0f)) - 1);
        this.G.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.P = false;
        if (this.G != null) {
            this.f42944x = false;
            this.G = null;
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f42943w = i10;
        this.v = i11;
        a aVar = this.f42937b;
        if (aVar != null) {
            aVar.onSurfaceChanged(this.f42941r, i10, i11);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f42935a = false;
            i();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.R.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.f42937b;
        f fVar = aVar.f42909c;
        if (fVar != null) {
            fVar.V = bitmap;
        }
        aVar.f42918o = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.F = z10;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            i();
            return;
        }
        h(this.I);
    }

    public synchronized void setPaused(boolean z10) {
        this.f42945y = z10;
    }

    public synchronized void setRenderer(a aVar) {
        this.f42937b = aVar;
        this.E = true;
    }

    public void setStarParticlesView(v1 v1Var) {
        this.N = v1Var;
    }

    public void g() {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
