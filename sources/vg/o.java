package vg;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
public final class o {
    public final Context f59511a;
    public final Handler f59512b;
    public final int f59513c;
    public final int f59514e;
    public EGLConfig f59521m;
    public a f59522n;
    public a f59523o;
    public a f59524p;
    public long f59525q;
    public long f59526r;
    public int f59527s;
    public final ArrayList f59515f = new ArrayList();
    public volatile q[] f59516g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f59517i = new int[2];
    public EGLDisplay f59518j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f59519k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f59520l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i7) {
        this.f59511a = context;
        this.f59514e = i7;
        this.f59513c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f59512b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f59518j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f59518j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f59521m = eGLConfig;
                this.f59519k = EGL14.eglCreateContext(this.f59518j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f59518j, this.f59521m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f59520l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f59518j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f59519k)) {
                    Context context = this.f59511a;
                    a aVar = new a(context, 2);
                    int i7 = this.f59514e;
                    aVar.C = i7;
                    this.f59522n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f59523o = aVar2;
                    this.f59526r = 0L;
                    this.f59525q = 0L;
                    this.f59527s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f59522n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f59523o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f59524p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f59524p = null;
        this.f59523o = null;
        this.f59522n = null;
        EGLDisplay eGLDisplay = this.f59518j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f59518j, this.f59520l);
        EGL14.eglDestroyContext(this.f59518j, this.f59519k);
        EGL14.eglTerminate(this.f59518j);
        EGL14.eglReleaseThread();
        this.f59518j = EGL14.EGL_NO_DISPLAY;
        this.f59519k = EGL14.EGL_NO_CONTEXT;
        this.f59520l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f59512b.post(new v4.p(this, 2));
        }
    }
}
