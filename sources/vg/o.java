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
    public final Context f59549a;
    public final Handler f59550b;
    public final int f59551c;
    public final int f59552e;
    public EGLConfig f59559m;
    public a f59560n;
    public a f59561o;
    public a f59562p;
    public long f59563q;
    public long f59564r;
    public int f59565s;
    public final ArrayList f59553f = new ArrayList();
    public volatile q[] f59554g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f59555i = new int[2];
    public EGLDisplay f59556j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f59557k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f59558l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i7) {
        this.f59549a = context;
        this.f59552e = i7;
        this.f59551c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f59550b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f59556j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f59556j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f59559m = eGLConfig;
                this.f59557k = EGL14.eglCreateContext(this.f59556j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f59556j, this.f59559m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f59558l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f59556j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f59557k)) {
                    Context context = this.f59549a;
                    a aVar = new a(context, 2);
                    int i7 = this.f59552e;
                    aVar.C = i7;
                    this.f59560n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f59561o = aVar2;
                    this.f59564r = 0L;
                    this.f59563q = 0L;
                    this.f59565s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f59560n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f59561o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f59562p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f59562p = null;
        this.f59561o = null;
        this.f59560n = null;
        EGLDisplay eGLDisplay = this.f59556j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f59556j, this.f59558l);
        EGL14.eglDestroyContext(this.f59556j, this.f59557k);
        EGL14.eglTerminate(this.f59556j);
        EGL14.eglReleaseThread();
        this.f59556j = EGL14.EGL_NO_DISPLAY;
        this.f59557k = EGL14.EGL_NO_CONTEXT;
        this.f59558l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f59550b.post(new v4.p(this, 2));
        }
    }
}
