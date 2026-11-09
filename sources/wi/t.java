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
import org.telegram.ui.Components.s31;
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
    public Size f58154a;
    public long f58155a0;
    public Size f58156b;
    public int f58157b0;
    public Size f58158c;
    public float f58159c0;
    public final Surface d;
    public m0 f58160d0;
    public final Surface f58161e;
    public m0 f58162e0;
    public final boolean f58163f;
    public int f58164f0;
    public final int f58165g;
    public long f58166g0;
    public final boolean h;
    public long f58167h0;
    public final o f58168i;
    public long f58169i0;
    public int f58170j;
    public long f58171j0;
    public int f58172k;
    public long f58173k0;
    public int f58174l;
    public long f58175l0;
    public boolean f58176m;
    public long m0;
    public boolean f58177n;
    public int f58178n0;
    public boolean f58179o;
    public int f58180o0;
    public volatile long f58181p;
    public long f58182p0;
    public long f58184q0;
    public final s f58185r;
    public volatile boolean f58186r0;
    public final c f58187s;
    public volatile int f58188s0;
    public HandlerThread f58189t;
    public volatile boolean f58190t0;
    public Handler f58191u;
    public volatile a f58192u0;
    public SurfaceTexture v;
    public Runnable f58193v0;
    public Surface f58194w;
    public boolean f58195w0;
    public SurfaceTexture f58196x;
    public volatile RuntimeException f58197x0;
    public Surface f58198y;
    public final q f58199y0;
    public volatile long f58183q = Long.MAX_VALUE;
    public EGLDisplay f58200z = EGL14.EGL_NO_DISPLAY;
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
        this.f58199y0 = new q(this, 1);
        this.f58154a = size;
        this.f58156b = size;
        this.f58158c = size;
        this.d = surface;
        this.f58161e = surface2;
        this.f58163f = z9;
        this.f58165g = i7;
        this.f58170j = i10;
        this.f58172k = i10;
        this.f58174l = i10;
        this.f58176m = z10;
        this.f58177n = z10;
        this.f58179o = z10;
        this.h = z11;
        this.f58168i = oVar;
        this.G = i7;
        this.H = i7;
        this.f58181p = 0L;
        this.f58190t0 = false;
        this.f58185r = sVar;
        this.f58187s = cVar;
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
        if (this.f58181p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f58181p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j3) {
        long max = Math.max(0L, j3 - this.Y);
        long max2 = Math.max(33L, this.f58157b0) * 1000000;
        float f10 = ((this.N.f57946a * 4.0f) / 48.0f) * 1.15f;
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
        this.f58200z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i7 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f58200z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f58200z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a("Unable to create EGL context", z9);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f58200z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL surface", z10);
                    Surface surface = this.f58161e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.f58200z, eGLConfigArr[0], surface, iArr3, 0);
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
                    this.f58168i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f58184q0) / 1000000));
                    boolean z12 = this.f58163f;
                    if (!z12) {
                        i7 = 1;
                    }
                    int[] iArr4 = new int[i7];
                    GLES20.glGenTextures(i7, iArr4, 0);
                    int i10 = iArr4[0];
                    this.D = i10;
                    GLES20.glBindTexture(36197, i10);
                    k(i10, this.f58170j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f58154a.getWidth(), this.f58154a.getHeight());
                    this.v.setOnFrameAvailableListener(new p(this, 1), this.f58191u);
                    this.f58194w = new Surface(this.v);
                    if (z12) {
                        int i11 = iArr4[1];
                        this.E = i11;
                        GLES20.glBindTexture(36197, i11);
                        k(i11, this.f58170j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.f58196x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.f58154a.getWidth(), this.f58154a.getHeight());
                        this.f58196x.setOnFrameAvailableListener(new p(this, 0), this.f58191u);
                        this.f58198y = new Surface(this.f58196x);
                    }
                    d0 d0Var = new d0(this.f58165g, this.f58170j, this.f58154a, this.h);
                    this.N = d0Var;
                    int i12 = ((this.f58188s0 % 360) + 360) % 360;
                    if (d0Var.f57962s != i12) {
                        d0Var.f57962s = i12;
                        d0Var.v();
                    }
                    int i13 = this.f58165g;
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
        EGLDisplay eGLDisplay = this.f58200z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i7) {
        EGLDisplay eGLDisplay = this.f58200z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i7, iArr, 0)) {
            return this.f58165g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f58184q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f58184q0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f58169i0);
        sb2.append(", inputFps=");
        long j3 = this.f58169i0;
        int i7 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i7 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f58171j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f58173k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f58175l0);
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
        sb2.append(this.f58178n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f58180o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f58182p0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i10 = this.f58164f0;
        if (i10 != 0) {
            obj = Float.valueOf((((float) this.f58166g0) / i10) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f58167h0) / 1000000.0f);
        this.f58168i.b(sb2.toString());
        Handler handler = this.f58191u;
        if (handler != null) {
            handler.removeCallbacks(this.f58199y0);
        }
        EGLDisplay eGLDisplay = this.f58200z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f58196x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f58194w;
        if (surface != null) {
            surface.release();
            this.f58194w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.f58198y;
        if (surface2 != null) {
            surface2.release();
            this.f58198y = null;
        }
        SurfaceTexture surfaceTexture4 = this.f58196x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f58196x = null;
        }
        d0 d0Var = this.N;
        if (d0Var != null) {
            d0Var.f57951g.b();
            d0Var.h.b();
            a0 a0Var = d0Var.f57952i;
            if (a0Var != null) {
                a0Var.b();
            }
            z zVar = d0Var.f57953j;
            if (zVar != null) {
                zVar.b();
            }
            d0Var.f57954k.b();
            d0Var.f57955l.b();
            d0Var.f57956m.b();
            b3.h hVar = d0Var.f57957n;
            if (hVar != null) {
                hVar.b();
            }
            int[] iArr = d0Var.f57964u;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = d0Var.f57963t;
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
        EGLDisplay eGLDisplay2 = this.f58200z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58200z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58200z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f58200z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f58200z);
        }
        this.f58200z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i7, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.f58200z, eGLSurface, eGLSurface, this.A)) {
                d0 d0Var = this.N;
                int i10 = this.I;
                int i11 = this.J;
                d0Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i10, i11);
                d0Var.c(d0Var.f57951g, fArr);
                d0.d(i7);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f58200z, this.C)) {
                    g();
                } else {
                    throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
        Runnable runnable = this.f58193v0;
        if (runnable != null) {
            this.f58193v0 = null;
            runnable.run();
        }
    }

    public final void k(int i7, int i10) {
        int i11;
        GLES20.glBindTexture(36197, i7);
        if (i10 == this.f58165g) {
            i11 = 9728;
        } else {
            i11 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i11);
        GLES20.glTexParameteri(36197, 10240, i11);
    }

    public final void l() {
        Handler handler = this.f58191u;
        HandlerThread handlerThread = this.f58189t;
        if (handler != null) {
            handler.removeCallbacks(this.f58199y0);
        }
        this.f58191u = null;
        this.f58189t = null;
        this.f58186r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new s31(this, handlerThread, countDownLatch, 24));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j3) {
        this.S = j3;
        EGLExt.eglPresentationTimeANDROID(this.f58200z, this.B, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f58200z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j10 = nanoTime2 - nanoTime;
            this.f58164f0++;
            this.f58166g0 += j10;
            this.f58167h0 = Math.max(this.f58167h0, j10);
            if (this.f58164f0 % 30 == 0) {
                this.f58168i.b("encoder swap: average=" + ((((float) this.f58166g0) / this.f58164f0) / 1000000.0f) + " ms, max=" + (((float) this.f58167h0) / 1000000.0f) + " ms");
            }
            s sVar = this.f58185r;
            if (sVar != null) {
                n nVar = (n) sVar;
                long j11 = nVar.C;
                int i7 = (int) (j11 % 256);
                nVar.f58109l[i7] = j3 / 1000;
                nVar.f58110m[i7] = nanoTime2;
                nVar.C = j11 + 1;
                synchronized (nVar) {
                    if (nVar.f58118u != null && !nVar.v) {
                        d dVar = nVar.f58118u;
                        nVar.f58118u = null;
                        nVar.f58104f.b("first synchronized video frame submitted");
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
        Handler handler = this.f58191u;
        if (this.f58186r0 && handler != null) {
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
        EGLDisplay eGLDisplay = this.f58200z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i7 = iArr[0];
            if (EGL14.eglQuerySurface(this.f58200z, this.B, 12374, iArr, 0)) {
                int i10 = iArr[0];
                if (i7 > 0 && i10 > 0 && (i7 != this.G || i10 != this.H)) {
                    this.G = i7;
                    this.H = i10;
                    this.f58168i.b("EGL output size changed: " + i7 + "x" + i10);
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
