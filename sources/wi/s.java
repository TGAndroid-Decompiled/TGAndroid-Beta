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
import org.telegram.ui.Components.iv0;
public final class s {
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
    public c0 N;
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
    public Size f58001a;
    public long f58002a0;
    public Size f58003b;
    public int f58004b0;
    public Size f58005c;
    public float f58006c0;
    public final Surface d;
    public m0 f58007d0;
    public final Surface f58008e;
    public m0 f58009e0;
    public final boolean f58010f;
    public int f58011f0;
    public final int f58012g;
    public long f58013g0;
    public final boolean h;
    public long f58014h0;
    public final n f58015i;
    public long f58016i0;
    public int f58017j;
    public long f58018j0;
    public int f58019k;
    public long f58020k0;
    public int f58021l;
    public long f58022l0;
    public boolean f58023m;
    public long m0;
    public boolean f58024n;
    public int f58025n0;
    public boolean f58026o;
    public int f58027o0;
    public volatile long f58028p;
    public long f58029p0;
    public long f58031q0;
    public final r f58032r;
    public volatile boolean f58033r0;
    public final c f58034s;
    public volatile boolean f58035s0;
    public HandlerThread f58036t;
    public volatile a f58037t0;
    public Handler f58038u;
    public Runnable f58039u0;
    public SurfaceTexture v;
    public boolean f58040v0;
    public Surface f58041w;
    public volatile RuntimeException f58042w0;
    public SurfaceTexture f58043x;
    public final o f58044x0;
    public Surface f58045y;
    public volatile long f58030q = Long.MAX_VALUE;
    public EGLDisplay f58046z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public s(Size size, Surface surface, Surface surface2, boolean z10, int i3, int i10, boolean z11, boolean z12, n nVar, r rVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.f58044x0 = new o(this, 1);
        this.f58001a = size;
        this.f58003b = size;
        this.f58005c = size;
        this.d = surface;
        this.f58008e = surface2;
        this.f58010f = z10;
        this.f58012g = i3;
        this.f58017j = i10;
        this.f58019k = i10;
        this.f58021l = i10;
        this.f58023m = z11;
        this.f58024n = z11;
        this.f58026o = z11;
        this.h = z12;
        this.f58015i = nVar;
        this.G = i3;
        this.H = i3;
        this.f58028p = 0L;
        this.f58035s0 = false;
        this.f58032r = rVar;
        this.f58034s = cVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder h = t4.c.h(str, ": 0x");
        h.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(h.toString());
    }

    public final void b(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: wi.s.b(boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: wi.s.c():void");
    }

    public final long d() {
        long max;
        if (this.f58028p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f58028p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j10) {
        long max = Math.max(0L, j10 - this.Y);
        long max2 = Math.max(33L, this.f58004b0) * 1000000;
        float f10 = ((this.N.f57795a * 4.0f) / 48.0f) * 1.15f;
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
        this.f58046z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i3 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f58046z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f58046z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f58046z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    Surface surface = this.f58008e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.f58046z, eGLConfigArr[0], surface, iArr3, 0);
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
                    this.f58015i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f58031q0) / 1000000));
                    boolean z13 = this.f58010f;
                    if (!z13) {
                        i3 = 1;
                    }
                    int[] iArr4 = new int[i3];
                    GLES20.glGenTextures(i3, iArr4, 0);
                    int i10 = iArr4[0];
                    this.D = i10;
                    GLES20.glBindTexture(36197, i10);
                    k(i10, this.f58017j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f58001a.getWidth(), this.f58001a.getHeight());
                    this.v.setOnFrameAvailableListener(new q(this, 0), this.f58038u);
                    this.f58041w = new Surface(this.v);
                    if (z13) {
                        int i11 = iArr4[1];
                        this.E = i11;
                        GLES20.glBindTexture(36197, i11);
                        k(i11, this.f58017j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.f58043x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.f58001a.getWidth(), this.f58001a.getHeight());
                        this.f58043x.setOnFrameAvailableListener(new q(this, 1), this.f58038u);
                        this.f58045y = new Surface(this.f58043x);
                    }
                    Size size = this.f58001a;
                    int i12 = this.f58017j;
                    boolean z14 = this.h;
                    int i13 = this.f58012g;
                    this.N = new c0(i13, size, i12, z14);
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
        EGLDisplay eGLDisplay = this.f58046z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i3) {
        EGLDisplay eGLDisplay = this.f58046z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i3, iArr, 0)) {
            return this.f58012g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f58031q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f58031q0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f58016i0);
        sb2.append(", inputFps=");
        long j10 = this.f58016i0;
        int i3 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i3 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f58018j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f58020k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f58022l0);
        sb2.append(", submittedFrames=");
        sb2.append(this.m0);
        sb2.append(", submittedFps=");
        long j11 = this.m0;
        if (i3 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j11 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.f58025n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f58027o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f58029p0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i10 = this.f58011f0;
        if (i10 != 0) {
            obj = Float.valueOf((((float) this.f58013g0) / i10) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f58014h0) / 1000000.0f);
        this.f58015i.b(sb2.toString());
        Handler handler = this.f58038u;
        if (handler != null) {
            handler.removeCallbacks(this.f58044x0);
        }
        EGLDisplay eGLDisplay = this.f58046z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f58043x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f58041w;
        if (surface != null) {
            surface.release();
            this.f58041w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.f58045y;
        if (surface2 != null) {
            surface2.release();
            this.f58045y = null;
        }
        SurfaceTexture surfaceTexture4 = this.f58043x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f58043x = null;
        }
        c0 c0Var = this.N;
        if (c0Var != null) {
            c0Var.f57800g.b();
            c0Var.h.b();
            z zVar = c0Var.f57801i;
            if (zVar != null) {
                zVar.b();
            }
            y yVar = c0Var.f57802j;
            if (yVar != null) {
                yVar.b();
            }
            c0Var.f57803k.b();
            c0Var.f57804l.b();
            c0Var.f57805m.b();
            a3.h hVar = c0Var.f57806n;
            if (hVar != null) {
                hVar.b();
            }
            int[] iArr = c0Var.f57812t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = c0Var.f57811s;
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
        EGLDisplay eGLDisplay2 = this.f58046z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58046z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58046z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f58046z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f58046z);
        }
        this.f58046z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i3, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.f58046z, eGLSurface, eGLSurface, this.A)) {
                c0 c0Var = this.N;
                int i10 = this.I;
                int i11 = this.J;
                c0Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i10, i11);
                c0Var.c(c0Var.f57800g, fArr);
                c0.d(i3);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f58046z, this.C)) {
                    g();
                } else {
                    throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
        Runnable runnable = this.f58039u0;
        if (runnable != null) {
            this.f58039u0 = null;
            runnable.run();
        }
    }

    public final void k(int i3, int i10) {
        int i11;
        GLES20.glBindTexture(36197, i3);
        if (i10 == this.f58012g) {
            i11 = 9728;
        } else {
            i11 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i11);
        GLES20.glTexParameteri(36197, 10240, i11);
    }

    public final void l() {
        Handler handler = this.f58038u;
        HandlerThread handlerThread = this.f58036t;
        if (handler != null) {
            handler.removeCallbacks(this.f58044x0);
        }
        this.f58038u = null;
        this.f58036t = null;
        this.f58033r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new iv0(this, handlerThread, countDownLatch, 22));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j10) {
        this.S = j10;
        EGLExt.eglPresentationTimeANDROID(this.f58046z, this.B, j10);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f58046z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j11 = nanoTime2 - nanoTime;
            this.f58011f0++;
            this.f58013g0 += j11;
            this.f58014h0 = Math.max(this.f58014h0, j11);
            if (this.f58011f0 % 30 == 0) {
                this.f58015i.b("encoder swap: average=" + ((((float) this.f58013g0) / this.f58011f0) / 1000000.0f) + " ms, max=" + (((float) this.f58014h0) / 1000000.0f) + " ms");
            }
            r rVar = this.f58032r;
            if (rVar != null) {
                m mVar = (m) rVar;
                long j12 = mVar.C;
                int i3 = (int) (j12 % 256);
                mVar.f57959l[i3] = j10 / 1000;
                mVar.f57960m[i3] = nanoTime2;
                mVar.C = j12 + 1;
                synchronized (mVar) {
                    if (mVar.f57968u != null && !mVar.v) {
                        d dVar = mVar.f57968u;
                        mVar.f57968u = null;
                        mVar.f57954f.b("first synchronized video frame submitted");
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

    public final void n(Size size, int i3, boolean z10) {
        Handler handler = this.f58038u;
        if (this.f58033r0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new p(this, size, i3, z10, runtimeExceptionArr, countDownLatch, 1));
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
        EGLDisplay eGLDisplay = this.f58046z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i3 = iArr[0];
            if (EGL14.eglQuerySurface(this.f58046z, this.B, 12374, iArr, 0)) {
                int i10 = iArr[0];
                if (i3 > 0 && i10 > 0 && (i3 != this.G || i10 != this.H)) {
                    this.G = i3;
                    this.H = i10;
                    this.f58015i.b("EGL output size changed: " + i3 + "x" + i10);
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
