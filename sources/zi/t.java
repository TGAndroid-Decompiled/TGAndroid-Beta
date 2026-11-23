package zi;

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
    public Size f62266a;
    public long f62267a0;
    public Size f62268b;
    public int f62269b0;
    public Size f62270c;
    public float f62271c0;
    public final Surface d;
    public n0 f62272d0;
    public final Surface f62273e;
    public n0 f62274e0;
    public final boolean f62275f;
    public int f62276f0;
    public final int f62277g;
    public long f62278g0;
    public final boolean h;
    public long f62279h0;
    public final o f62280i;
    public long f62281i0;
    public int f62282j;
    public long f62283j0;
    public int f62284k;
    public long f62285k0;
    public int f62286l;
    public long f62287l0;
    public boolean f62288m;
    public long m0;
    public boolean f62289n;
    public int f62290n0;
    public boolean f62291o;
    public int f62292o0;
    public volatile long f62293p;
    public long f62294p0;
    public long f62296q0;
    public final s f62297r;
    public volatile boolean f62298r0;
    public final c f62299s;
    public volatile int f62300s0;
    public HandlerThread f62301t;
    public volatile boolean f62302t0;
    public Handler f62303u;
    public volatile a f62304u0;
    public SurfaceTexture v;
    public Runnable f62305v0;
    public Surface f62306w;
    public boolean f62307w0;
    public SurfaceTexture f62308x;
    public volatile RuntimeException f62309x0;
    public Surface f62310y;
    public final q f62311y0;
    public volatile long f62295q = Long.MAX_VALUE;
    public EGLDisplay f62312z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public t(Size size, Surface surface, Surface surface2, boolean z10, int i7, int i10, boolean z11, boolean z12, o oVar, s sVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.f62311y0 = new q(this, 1);
        this.f62266a = size;
        this.f62268b = size;
        this.f62270c = size;
        this.d = surface;
        this.f62273e = surface2;
        this.f62275f = z10;
        this.f62277g = i7;
        this.f62282j = i10;
        this.f62284k = i10;
        this.f62286l = i10;
        this.f62288m = z11;
        this.f62289n = z11;
        this.f62291o = z11;
        this.h = z12;
        this.f62280i = oVar;
        this.G = i7;
        this.H = i7;
        this.f62293p = 0L;
        this.f62302t0 = false;
        this.f62297r = sVar;
        this.f62299s = cVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder n10 = p5.c.n(str, ": 0x");
        n10.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(n10.toString());
    }

    public final void b(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: zi.t.b(boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: zi.t.c():void");
    }

    public final long d() {
        long max;
        if (this.f62293p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f62293p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j3) {
        long max = Math.max(0L, j3 - this.Y);
        long max2 = Math.max(33L, this.f62269b0) * 1000000;
        float f10 = ((this.N.f62063a * 4.0f) / 48.0f) * 1.15f;
        if (max <= max2) {
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) max) / ((float) max2)));
            return (1.0f - (((max3 * max3) * max3) * max3)) * f10;
        }
        return f10 * ((float) Math.sqrt((Math.log1p(((float) (max - max2)) / ((float) max2)) * 0.3499999940395355d) + 1.0d));
    }

    public final void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f62312z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i7 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f62312z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f62312z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f62312z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    Surface surface = this.f62273e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.f62312z, eGLConfigArr[0], surface, iArr3, 0);
                        this.C = eglCreateWindowSurface2;
                        if (eglCreateWindowSurface2 != EGL14.EGL_NO_SURFACE) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        a("Unable to create preview EGL surface", z12);
                        this.I = h(this.C, 12375);
                        this.J = h(this.C, 12374);
                    }
                    g();
                    this.f62280i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f62296q0) / 1000000));
                    boolean z13 = this.f62275f;
                    if (!z13) {
                        i7 = 1;
                    }
                    int[] iArr4 = new int[i7];
                    GLES20.glGenTextures(i7, iArr4, 0);
                    int i10 = iArr4[0];
                    this.D = i10;
                    GLES20.glBindTexture(36197, i10);
                    k(i10, this.f62282j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f62266a.getWidth(), this.f62266a.getHeight());
                    this.v.setOnFrameAvailableListener(new p(this, 1), this.f62303u);
                    this.f62306w = new Surface(this.v);
                    if (z13) {
                        int i11 = iArr4[1];
                        this.E = i11;
                        GLES20.glBindTexture(36197, i11);
                        k(i11, this.f62282j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.f62308x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.f62266a.getWidth(), this.f62266a.getHeight());
                        this.f62308x.setOnFrameAvailableListener(new p(this, 0), this.f62303u);
                        this.f62310y = new Surface(this.f62308x);
                    }
                    d0 d0Var = new d0(this.f62277g, this.f62282j, this.f62266a, this.h);
                    this.N = d0Var;
                    int i12 = ((this.f62300s0 % 360) + 360) % 360;
                    if (d0Var.f62079s != i12) {
                        d0Var.f62079s = i12;
                        d0Var.v();
                    }
                    int i13 = this.f62277g;
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
        EGLDisplay eGLDisplay = this.f62312z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i7) {
        EGLDisplay eGLDisplay = this.f62312z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i7, iArr, 0)) {
            return this.f62277g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f62296q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f62296q0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f62281i0);
        sb2.append(", inputFps=");
        long j3 = this.f62281i0;
        int i7 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i7 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f62283j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f62285k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f62287l0);
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
        sb2.append(this.f62290n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f62292o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f62294p0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i10 = this.f62276f0;
        if (i10 != 0) {
            obj = Float.valueOf((((float) this.f62278g0) / i10) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f62279h0) / 1000000.0f);
        this.f62280i.b(sb2.toString());
        Handler handler = this.f62303u;
        if (handler != null) {
            handler.removeCallbacks(this.f62311y0);
        }
        EGLDisplay eGLDisplay = this.f62312z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f62308x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f62306w;
        if (surface != null) {
            surface.release();
            this.f62306w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.f62310y;
        if (surface2 != null) {
            surface2.release();
            this.f62310y = null;
        }
        SurfaceTexture surfaceTexture4 = this.f62308x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f62308x = null;
        }
        d0 d0Var = this.N;
        if (d0Var != null) {
            d0Var.f62068g.b();
            d0Var.h.b();
            a0 a0Var = d0Var.f62069i;
            if (a0Var != null) {
                a0Var.b();
            }
            z zVar = d0Var.f62070j;
            if (zVar != null) {
                zVar.b();
            }
            d0Var.f62071k.b();
            d0Var.f62072l.b();
            d0Var.f62073m.b();
            b3.h hVar = d0Var.f62074n;
            if (hVar != null) {
                hVar.b();
            }
            int[] iArr = d0Var.f62081u;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = d0Var.f62080t;
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
        EGLDisplay eGLDisplay2 = this.f62312z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f62312z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f62312z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f62312z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f62312z);
        }
        this.f62312z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i7, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.f62312z, eGLSurface, eGLSurface, this.A)) {
                d0 d0Var = this.N;
                int i10 = this.I;
                int i11 = this.J;
                d0Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i10, i11);
                d0Var.c(d0Var.f62068g, fArr);
                d0.d(i7);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f62312z, this.C)) {
                    g();
                } else {
                    throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
        Runnable runnable = this.f62305v0;
        if (runnable != null) {
            this.f62305v0 = null;
            runnable.run();
        }
    }

    public final void k(int i7, int i10) {
        int i11;
        GLES20.glBindTexture(36197, i7);
        if (i10 == this.f62277g) {
            i11 = 9728;
        } else {
            i11 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i11);
        GLES20.glTexParameteri(36197, 10240, i11);
    }

    public final void l() {
        Handler handler = this.f62303u;
        HandlerThread handlerThread = this.f62301t;
        if (handler != null) {
            handler.removeCallbacks(this.f62311y0);
        }
        this.f62303u = null;
        this.f62301t = null;
        this.f62298r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new wg.p(this, handlerThread, countDownLatch, 7));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j3) {
        this.S = j3;
        EGLExt.eglPresentationTimeANDROID(this.f62312z, this.B, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f62312z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j10 = nanoTime2 - nanoTime;
            this.f62276f0++;
            this.f62278g0 += j10;
            this.f62279h0 = Math.max(this.f62279h0, j10);
            if (this.f62276f0 % 30 == 0) {
                this.f62280i.b("encoder swap: average=" + ((((float) this.f62278g0) / this.f62276f0) / 1000000.0f) + " ms, max=" + (((float) this.f62279h0) / 1000000.0f) + " ms");
            }
            s sVar = this.f62297r;
            if (sVar != null) {
                n nVar = (n) sVar;
                long j11 = nVar.C;
                int i7 = (int) (j11 % 256);
                nVar.f62224l[i7] = j3 / 1000;
                nVar.f62225m[i7] = nanoTime2;
                nVar.C = j11 + 1;
                synchronized (nVar) {
                    if (nVar.f62233u != null && !nVar.v) {
                        d dVar = nVar.f62233u;
                        nVar.f62233u = null;
                        nVar.f62219f.b("first synchronized video frame submitted");
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

    public final void n(Size size, int i7, boolean z10) {
        Handler handler = this.f62303u;
        if (this.f62298r0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new r(this, size, i7, z10, runtimeExceptionArr, countDownLatch, 1));
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
        EGLDisplay eGLDisplay = this.f62312z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i7 = iArr[0];
            if (EGL14.eglQuerySurface(this.f62312z, this.B, 12374, iArr, 0)) {
                int i10 = iArr[0];
                if (i7 > 0 && i10 > 0 && (i7 != this.G || i10 != this.H)) {
                    this.G = i7;
                    this.H = i10;
                    this.f62280i.b("EGL output size changed: " + i7 + "x" + i10);
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
