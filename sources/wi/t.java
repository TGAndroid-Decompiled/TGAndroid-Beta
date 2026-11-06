package wi;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Components.q31;
public final class t {
    public EGLSurface B;
    public EGLSurface C;
    public int D;
    public int E;
    public volatile boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int[] K;
    public final float[] L;
    public final float[] M;
    public d0 N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public long X;
    public long Y;
    public long Z;
    public Size f58052a;
    public long f58053a0;
    public Size f58054b;
    public int f58055b0;
    public Size f58056c;
    public float f58057c0;
    public final Surface d;
    public m0 f58058d0;
    public final Surface f58059e;
    public m0 f58060e0;
    public final boolean f58061f;
    public int f58062f0;
    public final int f58063g;
    public long f58064g0;
    public final boolean h;
    public long f58065h0;
    public final n f58066i;
    public long f58067i0;
    public int f58068j;
    public long f58069j0;
    public int f58070k;
    public long f58071k0;
    public int f58072l;
    public long f58073l0;
    public boolean f58074m;
    public long m0;
    public boolean f58075n;
    public int f58076n0;
    public boolean f58077o;
    public int f58078o0;
    public volatile long f58079p;
    public long f58080p0;
    public long f58082q0;
    public final s f58083r;
    public volatile boolean f58084r0;
    public final c f58085s;
    public volatile boolean f58086s0;
    public HandlerThread f58087t;
    public volatile a f58088t0;
    public Handler f58089u;
    public Runnable f58090u0;
    public SurfaceTexture v;
    public boolean f58091v0;
    public Surface f58092w;
    public volatile RuntimeException f58093w0;
    public SurfaceTexture f58094x;
    public final o f58095x0;
    public Surface f58096y;
    public volatile long f58081q = Long.MAX_VALUE;
    public EGLDisplay f58097z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public t(Size size, Surface surface, Surface surface2, boolean z9, int i7, int i10, boolean z10, boolean z11, n nVar, s sVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.f58095x0 = new o(this, 1);
        this.f58052a = size;
        this.f58054b = size;
        this.f58056c = size;
        this.d = surface;
        this.f58059e = surface2;
        this.f58061f = z9;
        this.f58063g = i7;
        this.f58068j = i10;
        this.f58070k = i10;
        this.f58072l = i10;
        this.f58074m = z10;
        this.f58075n = z10;
        this.f58077o = z10;
        this.h = z11;
        this.f58066i = nVar;
        this.G = i7;
        this.H = i7;
        this.f58079p = 0L;
        this.f58086s0 = false;
        this.f58083r = sVar;
        this.f58085s = cVar;
    }

    public static void a(String str, boolean z9) {
        if (z9) {
            return;
        }
        StringBuilder j3 = rf.b.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    public final void b(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: wi.t.b(boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: wi.t.c():void");
    }

    public final long d() {
        long max;
        if (this.f58079p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f58079p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j3) {
        long max = Math.max(0L, j3 - this.Y);
        long max2 = Math.max(33L, this.f58055b0) * 1000000;
        float f10 = ((this.N.f57842a * 4.0f) / 48.0f) * 1.15f;
        if (max <= max2) {
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) max) / ((float) max2)));
            return (1.0f - (((max3 * max3) * max3) * max3)) * f10;
        }
        return f10 * ((float) Math.sqrt((Math.log1p(((float) (max - max2)) / ((float) max2)) * 0.3499999940395355d) + 1.0d));
    }

    public final void f() {
        boolean z9;
        boolean z10;
        boolean z11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f58097z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i7 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f58097z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f58097z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a("Unable to create EGL context", z9);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f58097z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL surface", z10);
                    Surface surface = this.f58059e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.f58097z, eGLConfigArr[0], surface, iArr3, 0);
                        this.C = eglCreateWindowSurface2;
                        if (eglCreateWindowSurface2 != EGL14.EGL_NO_SURFACE) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a("Unable to create preview EGL surface", z11);
                        this.I = h(this.C, 12375);
                        this.J = h(this.C, 12374);
                    }
                    g();
                    this.f58066i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f58082q0) / 1000000));
                    boolean z12 = this.f58061f;
                    if (!z12) {
                        i7 = 1;
                    }
                    int[] iArr4 = new int[i7];
                    GLES20.glGenTextures(i7, iArr4, 0);
                    int i10 = iArr4[0];
                    this.D = i10;
                    GLES20.glBindTexture(36197, i10);
                    k(i10, this.f58068j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f58052a.getWidth(), this.f58052a.getHeight());
                    this.v.setOnFrameAvailableListener(new r(this, 0), this.f58089u);
                    this.f58092w = new Surface(this.v);
                    if (z12) {
                        int i11 = iArr4[1];
                        this.E = i11;
                        GLES20.glBindTexture(36197, i11);
                        k(i11, this.f58068j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.f58094x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.f58052a.getWidth(), this.f58052a.getHeight());
                        this.f58094x.setOnFrameAvailableListener(new r(this, 1), this.f58089u);
                        this.f58096y = new Surface(this.f58094x);
                    }
                    Size size = this.f58052a;
                    int i12 = this.f58068j;
                    boolean z13 = this.h;
                    int i13 = this.f58063g;
                    this.N = new d0(i13, size, i12, z13);
                    GLES20.glViewport(0, 0, i13, i13);
                    return;
                }
                throw new IllegalStateException("Unable to choose EGL config");
            }
            throw new IllegalStateException("Unable to initialize EGL");
        }
        throw new IllegalStateException("Unable to get EGL display");
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.f58097z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i7) {
        EGLDisplay eGLDisplay = this.f58097z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i7, iArr, 0)) {
            return this.f58063g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f58082q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f58082q0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f58067i0);
        sb2.append(", inputFps=");
        long j3 = this.f58067i0;
        int i7 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i7 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f58069j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f58071k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f58073l0);
        sb2.append(", submittedFrames=");
        sb2.append(this.m0);
        sb2.append(", submittedFps=");
        long j10 = this.m0;
        if (i7 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.f58076n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f58078o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f58080p0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i10 = this.f58062f0;
        if (i10 != 0) {
            obj = Float.valueOf((((float) this.f58064g0) / i10) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f58065h0) / 1000000.0f);
        this.f58066i.b(sb2.toString());
        Handler handler = this.f58089u;
        if (handler != null) {
            handler.removeCallbacks(this.f58095x0);
        }
        EGLDisplay eGLDisplay = this.f58097z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f58094x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f58092w;
        if (surface != null) {
            surface.release();
            this.f58092w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.f58096y;
        if (surface2 != null) {
            surface2.release();
            this.f58096y = null;
        }
        SurfaceTexture surfaceTexture4 = this.f58094x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f58094x = null;
        }
        d0 d0Var = this.N;
        if (d0Var != null) {
            d0Var.f57847g.b();
            d0Var.h.b();
            a0 a0Var = d0Var.f57848i;
            if (a0Var != null) {
                a0Var.b();
            }
            z zVar = d0Var.f57849j;
            if (zVar != null) {
                zVar.b();
            }
            d0Var.f57850k.b();
            d0Var.f57851l.b();
            d0Var.f57852m.b();
            b3.h hVar = d0Var.f57853n;
            if (hVar != null) {
                hVar.b();
            }
            int[] iArr = d0Var.f57859t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = d0Var.f57858s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i11 = this.D;
        if (i11 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            this.D = 0;
        }
        int i12 = this.E;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.E = 0;
        }
        EGLDisplay eGLDisplay2 = this.f58097z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58097z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58097z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f58097z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f58097z);
        }
        this.f58097z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i7, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.f58097z, eGLSurface, eGLSurface, this.A)) {
                d0 d0Var = this.N;
                int i10 = this.I;
                int i11 = this.J;
                d0Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i10, i11);
                d0Var.c(d0Var.f57847g, fArr);
                d0.d(i7);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f58097z, this.C)) {
                    g();
                } else {
                    throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
        Runnable runnable = this.f58090u0;
        if (runnable != null) {
            this.f58090u0 = null;
            runnable.run();
        }
    }

    public final void k(int i7, int i10) {
        int i11;
        GLES20.glBindTexture(36197, i7);
        if (i10 == this.f58063g) {
            i11 = 9728;
        } else {
            i11 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i11);
        GLES20.glTexParameteri(36197, 10240, i11);
    }

    public final void l() {
        Handler handler = this.f58089u;
        HandlerThread handlerThread = this.f58087t;
        if (handler != null) {
            handler.removeCallbacks(this.f58095x0);
        }
        this.f58089u = null;
        this.f58087t = null;
        this.f58084r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new q31(this, handlerThread, countDownLatch, 24));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j3) {
        this.S = j3;
        EGLExt.eglPresentationTimeANDROID(this.f58097z, this.B, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f58097z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j10 = nanoTime2 - nanoTime;
            this.f58062f0++;
            this.f58064g0 += j10;
            this.f58065h0 = Math.max(this.f58065h0, j10);
            if (this.f58062f0 % 30 == 0) {
                this.f58066i.b("encoder swap: average=" + ((((float) this.f58064g0) / this.f58062f0) / 1000000.0f) + " ms, max=" + (((float) this.f58065h0) / 1000000.0f) + " ms");
            }
            s sVar = this.f58083r;
            if (sVar != null) {
                m mVar = (m) sVar;
                long j11 = mVar.C;
                int i7 = (int) (j11 % 256);
                mVar.f58001l[i7] = j3 / 1000;
                mVar.f58002m[i7] = nanoTime2;
                mVar.C = j11 + 1;
                synchronized (mVar) {
                    if (mVar.f58010u != null && !mVar.v) {
                        d dVar = mVar.f58010u;
                        mVar.f58010u = null;
                        mVar.f57996f.b("first synchronized video frame submitted");
                        dVar.run();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final void n(Size size, int i7, boolean z9) {
        Handler handler = this.f58089u;
        if (this.f58084r0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new p(this, size, i7, z9, runtimeExceptionArr, countDownLatch, 1));
            try {
                countDownLatch.await();
                RuntimeException runtimeException = runtimeExceptionArr[0];
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Input size update was interrupted", e10);
            }
        }
    }

    public final void o() {
        EGLDisplay eGLDisplay = this.f58097z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i7 = iArr[0];
            if (EGL14.eglQuerySurface(this.f58097z, this.B, 12374, iArr, 0)) {
                int i10 = iArr[0];
                if (i7 > 0 && i10 > 0 && (i7 != this.G || i10 != this.H)) {
                    this.G = i7;
                    this.H = i10;
                    this.f58066i.b("EGL output size changed: " + i7 + "x" + i10);
                }
                EGLSurface eGLSurface2 = this.C;
                if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                    this.I = h(eGLSurface2, 12375);
                    this.J = h(this.C, 12374);
                }
            }
        }
    }
}
