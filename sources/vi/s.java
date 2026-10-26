package vi;

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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ny0;
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
    public Size f50538a;
    public long f50539a0;
    public Size f50540b;
    public int f50541b0;
    public Size f50542c;
    public float f50543c0;
    public final Surface d;
    public l0 f50544d0;
    public final Surface e;
    public l0 f50545e0;
    public final boolean f50546f;
    public int f50547f0;
    public final int f50548g;
    public long f50549g0;
    public final boolean h;
    public long f50550h0;
    public final n f50551i;
    public long f50552i0;
    public int f50553j;
    public long f50554j0;
    public int f50555k;
    public long f50556k0;
    public int f50557l;
    public long f50558l0;
    public boolean f50559m;
    public long m0;
    public boolean f50560n;
    public int f50561n0;
    public boolean f50562o;
    public int f50563o0;
    public volatile long f50564p;
    public long f50565p0;
    public long f50567q0;
    public final r f50568r;
    public volatile boolean f50569r0;
    public final c f50570s;
    public volatile boolean f50571s0;
    public HandlerThread f50572t;
    public volatile a f50573t0;
    public Handler f50574u;
    public Runnable f50575u0;
    public SurfaceTexture v;
    public boolean f50576v0;
    public Surface f50577w;
    public volatile RuntimeException f50578w0;
    public SurfaceTexture f50579x;
    public final o f50580x0;
    public Surface f50581y;
    public volatile long f50566q = Long.MAX_VALUE;
    public EGLDisplay f50582z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    public s(Size size, Surface surface, Surface surface2, boolean z10, int i10, int i11, boolean z11, boolean z12, n nVar, r rVar, c cVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.f50580x0 = new o(this, 1);
        this.f50538a = size;
        this.f50540b = size;
        this.f50542c = size;
        this.d = surface;
        this.e = surface2;
        this.f50546f = z10;
        this.f50548g = i10;
        this.f50553j = i11;
        this.f50555k = i11;
        this.f50557l = i11;
        this.f50559m = z11;
        this.f50560n = z11;
        this.f50562o = z11;
        this.h = z12;
        this.f50551i = nVar;
        this.G = i10;
        this.H = i10;
        this.f50564p = 0L;
        this.f50571s0 = false;
        this.f50568r = rVar;
        this.f50570s = cVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder l4 = b10.l(str, ": 0x");
        l4.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(l4.toString());
    }

    public final void b(boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: vi.s.b(boolean):void");
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: vi.s.c():void");
    }

    public final long d() {
        long max;
        if (this.f50564p == 0) {
            max = this.S + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f50564p);
        }
        return Math.max(max, this.S + 1);
    }

    public final float e(long j10) {
        long max = Math.max(0L, j10 - this.Y);
        long max2 = Math.max(33L, this.f50541b0) * 1000000;
        float f7 = ((this.N.f50343a * 4.0f) / 48.0f) * 1.15f;
        if (max <= max2) {
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) max) / ((float) max2)));
            return (1.0f - (((max3 * max3) * max3) * max3)) * f7;
        }
        return f7 * ((float) Math.sqrt((Math.log1p(((float) (max - max2)) / ((float) max2)) * 0.3499999940395355d) + 1.0d));
    }

    public final void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f50582z = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int i10 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f50582z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f50582z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.A = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    int[] iArr3 = {12344};
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f50582z, eGLConfigArr[0], this.d, iArr3, 0);
                    this.B = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    Surface surface = this.e;
                    if (surface != null) {
                        EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.f50582z, eGLConfigArr[0], surface, iArr3, 0);
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
                    this.f50551i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f50567q0) / 1000000));
                    boolean z13 = this.f50546f;
                    if (!z13) {
                        i10 = 1;
                    }
                    int[] iArr4 = new int[i10];
                    GLES20.glGenTextures(i10, iArr4, 0);
                    int i11 = iArr4[0];
                    this.D = i11;
                    GLES20.glBindTexture(36197, i11);
                    k(i11, this.f50553j);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
                    this.v = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f50538a.getWidth(), this.f50538a.getHeight());
                    this.v.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) {
                        public final s f50530b;

                        {
                            this.f50530b = this;
                        }

                        @Override
                        public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                            switch (r2) {
                                case 0:
                                    this.f50530b.b(false);
                                    return;
                                default:
                                    this.f50530b.b(true);
                                    return;
                            }
                        }
                    }, this.f50574u);
                    this.f50577w = new Surface(this.v);
                    if (z13) {
                        int i12 = iArr4[1];
                        this.E = i12;
                        GLES20.glBindTexture(36197, i12);
                        k(i12, this.f50553j);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
                        this.f50579x = surfaceTexture2;
                        surfaceTexture2.setDefaultBufferSize(this.f50538a.getWidth(), this.f50538a.getHeight());
                        this.f50579x.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) {
                            public final s f50530b;

                            {
                                this.f50530b = this;
                            }

                            @Override
                            public final void onFrameAvailable(SurfaceTexture surfaceTexture22) {
                                switch (r2) {
                                    case 0:
                                        this.f50530b.b(false);
                                        return;
                                    default:
                                        this.f50530b.b(true);
                                        return;
                                }
                            }
                        }, this.f50574u);
                        this.f50581y = new Surface(this.f50579x);
                    }
                    Size size = this.f50538a;
                    int i13 = this.f50553j;
                    boolean z14 = this.h;
                    int i14 = this.f50548g;
                    this.N = new c0(i14, size, i13, z14);
                    GLES20.glViewport(0, 0, i14, i14);
                    return;
                }
                throw new IllegalStateException("Unable to choose EGL config");
            }
            throw new IllegalStateException("Unable to initialize EGL");
        }
        throw new IllegalStateException("Unable to get EGL display");
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.f50582z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int h(EGLSurface eGLSurface, int i10) {
        EGLDisplay eGLDisplay = this.f50582z;
        int[] iArr = this.K;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0)) {
            return this.f50548g;
        }
        return Math.max(1, iArr[0]);
    }

    public final void i() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f50567q0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f50567q0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f50552i0);
        sb2.append(", inputFps=");
        long j10 = this.f50552i0;
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i10 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f50554j0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f50556k0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f50558l0);
        sb2.append(", submittedFrames=");
        sb2.append(this.m0);
        sb2.append(", submittedFps=");
        long j11 = this.m0;
        if (i10 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j11 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.f50561n0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f50563o0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f50565p0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i11 = this.f50547f0;
        if (i11 != 0) {
            obj = Float.valueOf((((float) this.f50549g0) / i11) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f50550h0) / 1000000.0f);
        this.f50551i.b(sb2.toString());
        Handler handler = this.f50574u;
        if (handler != null) {
            handler.removeCallbacks(this.f50580x0);
        }
        EGLDisplay eGLDisplay = this.f50582z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f50579x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f50577w;
        if (surface != null) {
            surface.release();
            this.f50577w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.f50581y;
        if (surface2 != null) {
            surface2.release();
            this.f50581y = null;
        }
        SurfaceTexture surfaceTexture4 = this.f50579x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f50579x = null;
        }
        c0 c0Var = this.N;
        if (c0Var != null) {
            c0Var.f50347g.b();
            c0Var.h.b();
            z zVar = c0Var.f50348i;
            if (zVar != null) {
                zVar.b();
            }
            x xVar = c0Var.f50349j;
            if (xVar != null) {
                xVar.b();
            }
            c0Var.f50350k.b();
            c0Var.f50351l.b();
            c0Var.f50352m.b();
            y yVar = c0Var.f50353n;
            if (yVar != null) {
                yVar.b();
            }
            int[] iArr = c0Var.f50359t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = c0Var.f50358s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i12 = this.D;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.D = 0;
        }
        int i13 = this.E;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            this.E = 0;
        }
        EGLDisplay eGLDisplay2 = this.f50582z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f50582z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f50582z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f50582z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f50582z);
        }
        this.f50582z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(float[] fArr, int i10) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (EGL14.eglMakeCurrent(this.f50582z, eGLSurface, eGLSurface, this.A)) {
                c0 c0Var = this.N;
                int i11 = this.I;
                int i12 = this.J;
                c0Var.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i11, i12);
                c0Var.c(c0Var.f50347g, fArr);
                c0.d(i10);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f50582z, this.C)) {
                    g();
                } else {
                    throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else {
                throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
        Runnable runnable = this.f50575u0;
        if (runnable != null) {
            this.f50575u0 = null;
            runnable.run();
        }
    }

    public final void k(int i10, int i11) {
        int i12;
        GLES20.glBindTexture(36197, i10);
        if (i11 == this.f50548g) {
            i12 = 9728;
        } else {
            i12 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i12);
        GLES20.glTexParameteri(36197, 10240, i12);
    }

    public final void l() {
        Handler handler = this.f50574u;
        HandlerThread handlerThread = this.f50572t;
        if (handler != null) {
            handler.removeCallbacks(this.f50580x0);
        }
        this.f50574u = null;
        this.f50572t = null;
        this.f50569r0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new ny0(this, handlerThread, countDownLatch, 24));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void m(long j10) {
        this.S = j10;
        EGLExt.eglPresentationTimeANDROID(this.f50582z, this.B, j10);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f50582z, this.B)) {
            long nanoTime2 = System.nanoTime();
            this.m0++;
            long j11 = nanoTime2 - nanoTime;
            this.f50547f0++;
            this.f50549g0 += j11;
            this.f50550h0 = Math.max(this.f50550h0, j11);
            if (this.f50547f0 % 30 == 0) {
                this.f50551i.b("encoder swap: average=" + ((((float) this.f50549g0) / this.f50547f0) / 1000000.0f) + " ms, max=" + (((float) this.f50550h0) / 1000000.0f) + " ms");
            }
            r rVar = this.f50568r;
            if (rVar != null) {
                m mVar = (m) rVar;
                long j12 = mVar.f50508x;
                int i10 = (int) (j12 % 256);
                mVar.f50496k[i10] = j10 / 1000;
                mVar.f50497l[i10] = nanoTime2;
                mVar.f50508x = j12 + 1;
                synchronized (mVar) {
                    if (mVar.f50505t != null && !mVar.f50506u) {
                        d dVar = mVar.f50505t;
                        mVar.f50505t = null;
                        mVar.f50492f.b("first synchronized video frame submitted");
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

    public final void n(Size size, int i10, boolean z10) {
        Handler handler = this.f50574u;
        if (this.f50569r0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new p(this, size, i10, z10, runtimeExceptionArr, countDownLatch, 1));
            try {
                countDownLatch.await();
                RuntimeException runtimeException = runtimeExceptionArr[0];
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Input size update was interrupted", e);
            }
        }
    }

    public final void o() {
        EGLDisplay eGLDisplay = this.f50582z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f50582z, this.B, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0 && (i10 != this.G || i11 != this.H)) {
                    this.G = i10;
                    this.H = i11;
                    this.f50551i.b("EGL output size changed: " + i10 + "x" + i11);
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
