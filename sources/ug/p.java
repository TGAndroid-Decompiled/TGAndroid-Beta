package ug;

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
public final class p {
    public final Context f49896a;
    public final Handler f49897b;
    public final int f49898c;
    public final int e;
    public EGLConfig f49905m;
    public a f49906n;
    public a f49907o;
    public a f49908p;
    public long f49909q;
    public long f49910r;
    public int f49911s;
    public final ArrayList f49899f = new ArrayList();
    public volatile r[] f49900g = new r[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f49901i = new int[2];
    public EGLDisplay f49902j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f49903k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f49904l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context, int i10) {
        this.f49896a = context;
        this.e = i10;
        this.f49898c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f49897b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f49902j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f49902j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f49905m = eGLConfig;
                this.f49903k = EGL14.eglCreateContext(this.f49902j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f49902j, this.f49905m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f49904l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f49902j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f49903k)) {
                    Context context = this.f49896a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f49906n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f49907o = aVar2;
                    this.f49910r = 0L;
                    this.f49909q = 0L;
                    this.f49911s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f49906n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f49907o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f49908p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f49908p = null;
        this.f49907o = null;
        this.f49906n = null;
        EGLDisplay eGLDisplay = this.f49902j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f49902j, this.f49904l);
        EGL14.eglDestroyContext(this.f49902j, this.f49903k);
        EGL14.eglTerminate(this.f49902j);
        EGL14.eglReleaseThread();
        this.f49902j = EGL14.EGL_NO_DISPLAY;
        this.f49903k = EGL14.EGL_NO_CONTEXT;
        this.f49904l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f49897b.post(new ti.g(this, 3));
        }
    }
}
