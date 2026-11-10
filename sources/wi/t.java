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
import org.telegram.ui.Components.r31;
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
    public Size f58158a;
    public long f58159a0;
    public Size f58160b;
    public int f58161b0;
    public Size f58162c;
    public float f58163c0;
    public final Surface d;
    public m0 f58164d0;
    public final Surface f58165e;
    public m0 f58166e0;
    public final boolean f58167f;
    public int f58168f0;
    public final int f58169g;
    public long f58170g0;
    public final boolean h;
    public long f58171h0;
    public final o f58172i;
    public long f58173i0;
    public int f58174j;
    public long f58175j0;
    public int f58176k;
    public long f58177k0;
    public int f58178l;
    public long f58179l0;
    public boolean f58180m;
    public long m0;
    public boolean f58181n;
    public int f58182n0;
    public boolean f58183o;
    public int f58184o0;
    public volatile long f58185p;
    public long f58186p0;
    public long f58188q0;
    public final s f58189r;
    public volatile boolean f58190r0;
    public final c f58191s;
    public volatile int f58192s0;
    public HandlerThread f58193t;
    public volatile boolean f58194t0;
    public Handler f58195u;
    public volatile a f58196u0;
    public SurfaceTexture v;
    public Runnable f58197v0;
    public Surface f58198w;
    public boolean f58199w0;
    public SurfaceTexture f58200x;
    public volatile RuntimeException f58201x0;
    public Surface f58202y;
    public final q f58203y0;
    public volatile long f58187q = Long.MAX_VALUE;
    public EGLDisplay f58204z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public t(Size size, Surface surface, Surface surface2, boolean z9, int i7, int i10, boolean z10, boolean z11, o oVar, s sVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.f58203y0 = new q(this, 1);
        this.f58158a = size;
        this.f58160b = size;
        this.f58162c = size;
        this.d = surface;
        this.f58165e = surface2;
        this.f58167f = z9;
        this.f58169g = i7;
        this.f58174j = i10;
        this.f58176k = i10;
        this.f58178l = i10;
        this.f58180m = z10;
        this.f58181n = z10;
        this.f58183o = z10;
        this.h = z11;
        this.f58172i = oVar;
        this.G = i7;
        this.H = i7;
        this.f58185p = 0L;
        this.f58194t0 = false;
        this.f58189r = sVar;
        this.f58191s = cVar;
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
        if (this.f58185p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f58185p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j3) {
        long max = Math.max(0L, j3 - this.Y);
        long max2 = Math.max(33L, this.f58161b0) * 1000000;
        float f10 = ((this.N.f57950a * 4.0f) / 48.0f) * 1.15f;
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
        this.f58204z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i7 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f58204z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f58204z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a("Unable to create EGL context", z9);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f58204z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL surface", z10);
                    Surface surface = this.f58165e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.f58204z, eGLConfigArr[0], surface, iArr3, 0);
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
                    this.f58172i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f58188q0) / 1000000));
                    boolean z12 = this.f58167f;
                    if (!z12) {
                        i7 = 1;
                    }
                    int[] iArr4 = new int[i7];
                    GLES20.glGenTextures(i7, iArr4, 0);
                    int i10 = iArr4[0];
                    this.D = i10;
                    GLES20.glBindTexture(36197, i10);
                    k(i10, this.f58174j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f58158a.getWidth(), this.f58158a.getHeight());
                    this.v.setOnFrameAvailableListener(new p(this, 1), this.f58195u);
                    this.f58198w = new Surface(this.v);
                    if (z12) {
                        int i11 = iArr4[1];
                        this.E = i11;
                        GLES20.glBindTexture(36197, i11);
                        k(i11, this.f58174j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.f58200x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.f58158a.getWidth(), this.f58158a.getHeight());
                        this.f58200x.setOnFrameAvailableListener(new p(this, 0), this.f58195u);
                        this.f58202y = new Surface(this.f58200x);
                    }
                    d0 d0Var = new d0(this.f58169g, this.f58174j, this.f58158a, this.h);
                    this.N = d0Var;
                    int i12 = ((this.f58192s0 % 360) + 360) % 360;
                    if (d0Var.f57966s != i12) {
                        d0Var.f57966s = i12;
                        d0Var.v();
                    }
                    int i13 = this.f58169g;
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
        EGLDisplay eGLDisplay = this.f58204z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i7) {
        EGLDisplay eGLDisplay = this.f58204z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i7, iArr, 0)) {
            return this.f58169g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f58188q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f58188q0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f58173i0);
        sb2.append(", inputFps=");
        long j3 = this.f58173i0;
        int i7 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i7 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f58175j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f58177k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f58179l0);
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
        sb2.append(this.f58182n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f58184o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f58186p0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i10 = this.f58168f0;
        if (i10 != 0) {
            obj = Float.valueOf((((float) this.f58170g0) / i10) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f58171h0) / 1000000.0f);
        this.f58172i.b(sb2.toString());
        Handler handler = this.f58195u;
        if (handler != null) {
            handler.removeCallbacks(this.f58203y0);
        }
        EGLDisplay eGLDisplay = this.f58204z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f58200x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f58198w;
        if (surface != null) {
            surface.release();
            this.f58198w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.f58202y;
        if (surface2 != null) {
            surface2.release();
            this.f58202y = null;
        }
        SurfaceTexture surfaceTexture4 = this.f58200x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f58200x = null;
        }
        d0 d0Var = this.N;
        if (d0Var != null) {
            d0Var.f57955g.b();
            d0Var.h.b();
            a0 a0Var = d0Var.f57956i;
            if (a0Var != null) {
                a0Var.b();
            }
            z zVar = d0Var.f57957j;
            if (zVar != null) {
                zVar.b();
            }
            d0Var.f57958k.b();
            d0Var.f57959l.b();
            d0Var.f57960m.b();
            b3.h hVar = d0Var.f57961n;
            if (hVar != null) {
                hVar.b();
            }
            int[] iArr = d0Var.f57968u;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = d0Var.f57967t;
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
        EGLDisplay eGLDisplay2 = this.f58204z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58204z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58204z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f58204z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f58204z);
        }
        this.f58204z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i7, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.f58204z, eGLSurface, eGLSurface, this.A)) {
                d0 d0Var = this.N;
                int i10 = this.I;
                int i11 = this.J;
                d0Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i10, i11);
                d0Var.c(d0Var.f57955g, fArr);
                d0.d(i7);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f58204z, this.C)) {
                    g();
                } else {
                    throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
        Runnable runnable = this.f58197v0;
        if (runnable != null) {
            this.f58197v0 = null;
            runnable.run();
        }
    }

    public final void k(int i7, int i10) {
        int i11;
        GLES20.glBindTexture(36197, i7);
        if (i10 == this.f58169g) {
            i11 = 9728;
        } else {
            i11 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i11);
        GLES20.glTexParameteri(36197, 10240, i11);
    }

    public final void l() {
        Handler handler = this.f58195u;
        HandlerThread handlerThread = this.f58193t;
        if (handler != null) {
            handler.removeCallbacks(this.f58203y0);
        }
        this.f58195u = null;
        this.f58193t = null;
        this.f58190r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new r31(this, handlerThread, countDownLatch, 24));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j3) {
        this.S = j3;
        EGLExt.eglPresentationTimeANDROID(this.f58204z, this.B, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f58204z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j10 = nanoTime2 - nanoTime;
            this.f58168f0++;
            this.f58170g0 += j10;
            this.f58171h0 = Math.max(this.f58171h0, j10);
            if (this.f58168f0 % 30 == 0) {
                this.f58172i.b("encoder swap: average=" + ((((float) this.f58170g0) / this.f58168f0) / 1000000.0f) + " ms, max=" + (((float) this.f58171h0) / 1000000.0f) + " ms");
            }
            s sVar = this.f58189r;
            if (sVar != null) {
                n nVar = (n) sVar;
                long j11 = nVar.C;
                int i7 = (int) (j11 % 256);
                nVar.f58113l[i7] = j3 / 1000;
                nVar.f58114m[i7] = nanoTime2;
                nVar.C = j11 + 1;
                synchronized (nVar) {
                    if (nVar.f58122u != null && !nVar.v) {
                        d dVar = nVar.f58122u;
                        nVar.f58122u = null;
                        nVar.f58108f.b("first synchronized video frame submitted");
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
        Handler handler = this.f58195u;
        if (this.f58190r0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new r(this, size, i7, z9, runtimeExceptionArr, countDownLatch, 1));
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
        EGLDisplay eGLDisplay = this.f58204z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i7 = iArr[0];
            if (EGL14.eglQuerySurface(this.f58204z, this.B, 12374, iArr, 0)) {
                int i10 = iArr[0];
                if (i7 > 0 && i10 > 0 && (i7 != this.G || i10 != this.H)) {
                    this.G = i7;
                    this.H = i10;
                    this.f58172i.b("EGL output size changed: " + i7 + "x" + i10);
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
