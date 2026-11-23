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
import ug.u1;
public final class o {
    public final Context f59638a;
    public final Handler f59639b;
    public final int f59640c;
    public final int f59641e;
    public EGLConfig f59648m;
    public a f59649n;
    public a f59650o;
    public a f59651p;
    public long f59652q;
    public long f59653r;
    public int f59654s;
    public final ArrayList f59642f = new ArrayList();
    public volatile q[] f59643g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f59644i = new int[2];
    public EGLDisplay f59645j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f59646k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f59647l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i7) {
        this.f59638a = context;
        this.f59641e = i7;
        this.f59640c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f59639b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f59645j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f59645j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f59648m = eGLConfig;
                this.f59646k = EGL14.eglCreateContext(this.f59645j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f59645j, this.f59648m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f59647l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f59645j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f59646k)) {
                    Context context = this.f59638a;
                    a aVar = new a(context, 2);
                    int i7 = this.f59641e;
                    aVar.C = i7;
                    this.f59649n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f59650o = aVar2;
                    this.f59653r = 0L;
                    this.f59652q = 0L;
                    this.f59654s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f59649n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f59650o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f59651p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f59651p = null;
        this.f59650o = null;
        this.f59649n = null;
        EGLDisplay eGLDisplay = this.f59645j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f59645j, this.f59647l);
        EGL14.eglDestroyContext(this.f59645j, this.f59646k);
        EGL14.eglTerminate(this.f59645j);
        EGL14.eglReleaseThread();
        this.f59645j = EGL14.EGL_NO_DISPLAY;
        this.f59646k = EGL14.EGL_NO_CONTEXT;
        this.f59647l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f59639b.post(new u1(this, 3));
        }
    }
}
