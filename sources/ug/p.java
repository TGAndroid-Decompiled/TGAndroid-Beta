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
    public final Context f49858a;
    public final Handler f49859b;
    public final int f49860c;
    public final int e;
    public EGLConfig f49867m;
    public a f49868n;
    public a f49869o;
    public a f49870p;
    public long f49871q;
    public long f49872r;
    public int f49873s;
    public final ArrayList f49861f = new ArrayList();
    public volatile r[] f49862g = new r[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f49863i = new int[2];
    public EGLDisplay f49864j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f49865k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f49866l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context, int i10) {
        this.f49858a = context;
        this.e = i10;
        this.f49860c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f49859b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f49864j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f49864j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f49867m = eGLConfig;
                this.f49865k = EGL14.eglCreateContext(this.f49864j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f49864j, this.f49867m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f49866l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f49864j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f49865k)) {
                    Context context = this.f49858a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f49868n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f49869o = aVar2;
                    this.f49872r = 0L;
                    this.f49871q = 0L;
                    this.f49873s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f49868n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f49869o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f49870p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f49870p = null;
        this.f49869o = null;
        this.f49868n = null;
        EGLDisplay eGLDisplay = this.f49864j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f49864j, this.f49866l);
        EGL14.eglDestroyContext(this.f49864j, this.f49865k);
        EGL14.eglTerminate(this.f49864j);
        EGL14.eglReleaseThread();
        this.f49864j = EGL14.EGL_NO_DISPLAY;
        this.f49865k = EGL14.EGL_NO_CONTEXT;
        this.f49866l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f49859b.post(new ti.g(this, 3));
        }
    }
}
