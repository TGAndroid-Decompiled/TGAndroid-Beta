package qi;

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
import ii.s2;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.m5;
public final class p {
    public int A;
    public int B;
    public int C;
    public final int[] D;
    public final float[] E;
    public final float[] F;
    public y G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public float V;
    public i0 W;
    public i0 X;
    public int Y;
    public long Z;
    public Size f46822a;
    public long f46823a0;
    public final Surface f46824b;
    public long f46825b0;
    public final int f46826c;
    public long f46827c0;
    public final boolean d;
    public long f46828d0;
    public final l f46829e;
    public long f46830e0;
    public int f46831f;
    public long f46832f0;
    public int f46833g;
    public int f46834g0;
    public int h;
    public int f46835h0;
    public boolean f46836i;
    public long f46837i0;
    public volatile long f46838j;
    public long f46839j0;
    public volatile boolean f46841k0;
    public final o f46842l;
    public volatile boolean f46843l0;
    public final b f46844m;
    public volatile a m0;
    public HandlerThread f46845n;
    public boolean f46846n0;
    public Handler f46847o;
    public volatile RuntimeException f46848o0;
    public SurfaceTexture f46849p;
    public final m f46850p0;
    public Surface f46851q;
    public SurfaceTexture f46852r;
    public Surface f46853s;
    public EGLSurface v;
    public EGLSurface f46856w;
    public int f46857x;
    public int f46858y;
    public int f46859z;
    public volatile long f46840k = Long.MAX_VALUE;
    public EGLDisplay f46854t = EGL14.EGL_NO_DISPLAY;
    public EGLContext f46855u = EGL14.EGL_NO_CONTEXT;

    public p(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, l lVar, o oVar, b bVar) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.v = eGLSurface;
        this.f46856w = eGLSurface;
        this.D = new int[1];
        this.E = new float[16];
        this.F = new float[16];
        this.J = -1L;
        this.L = -1L;
        this.f46850p0 = new m(this, 1);
        this.f46822a = size;
        this.f46824b = surface;
        this.f46826c = i10;
        this.f46831f = i11;
        this.f46833g = i11;
        this.h = i11;
        this.f46836i = z10;
        this.d = z11;
        this.f46829e = lVar;
        this.f46859z = i10;
        this.A = i10;
        this.f46838j = 0L;
        this.f46843l0 = false;
        this.f46842l = oVar;
        this.f46844m = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder j3 = sc.v.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: qi.p.b():void");
    }

    public final long c() {
        long max;
        if (this.f46838j == 0) {
            max = this.L + 33333333;
        } else {
            max = Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.f46838j);
        }
        return Math.max(max, this.L + 1);
    }

    public final float d(long j3) {
        long max = Math.max(0L, j3 - this.R);
        long max2 = Math.max(33L, this.U) * 1000000;
        float f7 = ((this.G.f46924a * 4.0f) / 48.0f) * 1.15f;
        if (max <= max2) {
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) max) / ((float) max2)));
            return (1.0f - (((max3 * max3) * max3) * max3)) * f7;
        }
        return f7 * ((float) Math.sqrt((Math.log1p(((float) (max - max2)) / ((float) max2)) * 0.3499999940395355d) + 1.0d));
    }

    public final void e() {
        boolean z10;
        boolean z11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f46854t = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (EGL14.eglChooseConfig(this.f46854t, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f46854t, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.f46855u = eglCreateContext;
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a("Unable to create EGL context", z10);
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f46854t, eGLConfigArr[0], this.f46824b, new int[]{12344}, 0);
                    this.v = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a("Unable to create EGL surface", z11);
                    f();
                    this.f46829e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.f46839j0) / 1000000));
                    int[] iArr3 = new int[1];
                    GLES20.glGenTextures(1, iArr3, 0);
                    int i10 = iArr3[0];
                    this.f46857x = i10;
                    GLES20.glBindTexture(36197, i10);
                    j(i10, this.f46831f);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f46857x);
                    this.f46849p = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(this.f46822a.getWidth(), this.f46822a.getHeight());
                    this.f46849p.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                        @Override
                        public final void onFrameAvailable(android.graphics.SurfaceTexture r22) {
                            throw new UnsupportedOperationException("Method not decompiled: qi.n.onFrameAvailable(android.graphics.SurfaceTexture):void");
                        }
                    }, this.f46847o);
                    this.f46851q = new Surface(this.f46849p);
                    Size size = this.f46822a;
                    int i11 = this.f46831f;
                    boolean z12 = this.d;
                    int i12 = this.f46826c;
                    this.G = new y(i12, size, i11, z12);
                    GLES20.glViewport(0, 0, i12, i12);
                    return;
                }
                throw new IllegalStateException("Unable to choose EGL config");
            }
            throw new IllegalStateException("Unable to initialize EGL");
        }
        throw new IllegalStateException("Unable to get EGL display");
    }

    public final void f() {
        EGLDisplay eGLDisplay = this.f46854t;
        EGLSurface eGLSurface = this.v;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f46855u)) {
            return;
        }
        throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final int g(EGLSurface eGLSurface, int i10) {
        EGLDisplay eGLDisplay = this.f46854t;
        int[] iArr = this.D;
        if (!EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0)) {
            return this.f46826c;
        }
        return Math.max(1, iArr[0]);
    }

    public final void h() {
        long nanoTime;
        String valueOf;
        String valueOf2;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        if (this.f46839j0 == 0) {
            nanoTime = 0;
        } else {
            nanoTime = System.nanoTime() - this.f46839j0;
        }
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.f46825b0);
        sb2.append(", inputFps=");
        long j3 = this.f46825b0;
        int i10 = (nanoTime > 0L ? 1 : (nanoTime == 0L ? 0 : -1));
        Object obj = "n/a";
        if (i10 <= 0) {
            valueOf = "n/a";
        } else {
            valueOf = String.valueOf((j3 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf);
        sb2.append(", primaryInputFrames=");
        sb2.append(this.f46827c0);
        sb2.append(", secondaryInputFrames=");
        sb2.append(this.f46828d0);
        sb2.append(", preOriginFrames=");
        sb2.append(this.f46830e0);
        sb2.append(", submittedFrames=");
        sb2.append(this.f46832f0);
        sb2.append(", submittedFps=");
        long j10 = this.f46832f0;
        if (i10 <= 0) {
            valueOf2 = "n/a";
        } else {
            valueOf2 = String.valueOf((j10 * 1.0E9d) / nanoTime);
        }
        sb2.append(valueOf2);
        sb2.append(", syntheticFrames=");
        sb2.append(this.f46834g0);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.f46835h0);
        sb2.append(", maxFrameGapMs=");
        sb2.append(((float) this.f46837i0) / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=");
        sb2.append((Object) "n/a");
        sb2.append(", gpuMaxMs=");
        sb2.append(((float) 0) / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i11 = this.Y;
        if (i11 != 0) {
            obj = Float.valueOf((((float) this.Z) / i11) / 1000000.0f);
        }
        sb2.append(obj);
        sb2.append(", swapMaxMs=");
        sb2.append(((float) this.f46823a0) / 1000000.0f);
        this.f46829e.b(sb2.toString());
        Handler handler = this.f46847o;
        if (handler != null) {
            handler.removeCallbacks(this.f46850p0);
        }
        EGLDisplay eGLDisplay = this.f46854t;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.v) != EGL14.EGL_NO_SURFACE && (eGLContext = this.f46855u) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.f46849p;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.f46852r;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.f46851q;
        if (surface != null) {
            surface.release();
            this.f46851q = null;
        }
        SurfaceTexture surfaceTexture3 = this.f46849p;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.f46849p = null;
        }
        Surface surface2 = this.f46853s;
        if (surface2 != null) {
            surface2.release();
            this.f46853s = null;
        }
        SurfaceTexture surfaceTexture4 = this.f46852r;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.f46852r = null;
        }
        y yVar = this.G;
        if (yVar != null) {
            yVar.f46929g.d();
            yVar.h.d();
            v vVar = yVar.f46930i;
            if (vVar != null) {
                vVar.d();
            }
            u uVar = yVar.f46931j;
            if (uVar != null) {
                uVar.d();
            }
            yVar.f46932k.d();
            yVar.f46933l.d();
            yVar.f46934m.d();
            m5 m5Var = yVar.f46935n;
            if (m5Var != null) {
                m5Var.d();
            }
            int[] iArr = yVar.f46941t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = yVar.f46940s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.G = null;
        }
        int i12 = this.f46857x;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.f46857x = 0;
        }
        int i13 = this.f46858y;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            this.f46858y = 0;
        }
        EGLDisplay eGLDisplay2 = this.f46854t;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.v;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f46854t, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.f46856w;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f46854t, eGLSurface4);
            }
            EGLContext eGLContext2 = this.f46855u;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f46854t, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f46854t);
        }
        this.f46854t = EGL14.EGL_NO_DISPLAY;
        this.f46855u = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.v = eGLSurface5;
        this.f46856w = eGLSurface5;
    }

    public final void i(float[] fArr, int i10) {
        EGLSurface eGLSurface = this.f46856w;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.G != null) {
            if (EGL14.eglMakeCurrent(this.f46854t, eGLSurface, eGLSurface, this.f46855u)) {
                y yVar = this.G;
                int i11 = this.B;
                int i12 = this.C;
                yVar.getClass();
                GLES20.glDisable(3042);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i11, i12);
                yVar.c(yVar.f46929g, fArr);
                y.d(i10);
                GLES20.glDrawArrays(5, 0, 4);
                if (EGL14.eglSwapBuffers(this.f46854t, this.f46856w)) {
                    f();
                    return;
                }
                throw new IllegalStateException("Unable to swap preview EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
            throw new IllegalStateException("Unable to make preview EGL surface current: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
    }

    public final void j(int i10, int i11) {
        int i12;
        GLES20.glBindTexture(36197, i10);
        if (i11 == this.f46826c) {
            i12 = 9728;
        } else {
            i12 = 9729;
        }
        GLES20.glTexParameteri(36197, 10241, i12);
        GLES20.glTexParameteri(36197, 10240, i12);
    }

    public final void k() {
        Handler handler = this.f46847o;
        HandlerThread handlerThread = this.f46845n;
        if (handler != null) {
            handler.removeCallbacks(this.f46850p0);
        }
        this.f46847o = null;
        this.f46845n = null;
        this.f46841k0 = false;
        if (handler != null && handlerThread != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new pi.i(this, handlerThread, countDownLatch, 1));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void l(long j3) {
        this.L = j3;
        EGLExt.eglPresentationTimeANDROID(this.f46854t, this.v, j3);
        long nanoTime = System.nanoTime();
        if (EGL14.eglSwapBuffers(this.f46854t, this.v)) {
            long nanoTime2 = System.nanoTime();
            this.f46832f0++;
            long j10 = nanoTime2 - nanoTime;
            this.Y++;
            this.Z += j10;
            this.f46823a0 = Math.max(this.f46823a0, j10);
            if (this.Y % 30 == 0) {
                this.f46829e.b("encoder swap: average=" + ((((float) this.Z) / this.Y) / 1000000.0f) + " ms, max=" + (((float) this.f46823a0) / 1000000.0f) + " ms");
            }
            o oVar = this.f46842l;
            if (oVar != null) {
                k kVar = (k) oVar;
                long j11 = kVar.f46798x;
                int i10 = (int) (j11 % 256);
                kVar.f46786k[i10] = j3 / 1000;
                kVar.f46787l[i10] = nanoTime2;
                kVar.f46798x = j11 + 1;
                synchronized (kVar) {
                    if (kVar.f46795t != null && !kVar.f46796u) {
                        c cVar = kVar.f46795t;
                        kVar.f46795t = null;
                        kVar.f46782f.b("first synchronized video frame submitted");
                        cVar.run();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public final void m(Size size, int i10, boolean z10) {
        Handler handler = this.f46847o;
        if (this.f46841k0 && handler != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler.post(new s2(this, size, i10, z10, runtimeExceptionArr, countDownLatch));
            try {
                countDownLatch.await();
                RuntimeException runtimeException = runtimeExceptionArr[0];
                if (runtimeException != null) {
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Input size update was interrupted", e7);
            }
        }
    }

    public final void n() {
        EGLDisplay eGLDisplay = this.f46854t;
        EGLSurface eGLSurface = this.v;
        int[] iArr = this.D;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.f46854t, this.v, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 > 0 && i11 > 0 && (i10 != this.f46859z || i11 != this.A)) {
                    this.f46859z = i10;
                    this.A = i11;
                    this.f46829e.b("EGL output size changed: " + i10 + "x" + i11);
                }
                EGLSurface eGLSurface2 = this.f46856w;
                if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                    this.B = g(eGLSurface2, 12375);
                    this.C = g(this.f46856w, 12374);
                }
            }
        }
    }
}
