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
    public final Context f59553a;
    public final Handler f59554b;
    public final int f59555c;
    public final int f59556e;
    public EGLConfig f59563m;
    public a f59564n;
    public a f59565o;
    public a f59566p;
    public long f59567q;
    public long f59568r;
    public int f59569s;
    public final ArrayList f59557f = new ArrayList();
    public volatile q[] f59558g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f59559i = new int[2];
    public EGLDisplay f59560j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f59561k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f59562l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i7) {
        this.f59553a = context;
        this.f59556e = i7;
        this.f59555c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f59554b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f59560j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f59560j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f59563m = eGLConfig;
                this.f59561k = EGL14.eglCreateContext(this.f59560j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f59560j, this.f59563m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f59562l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f59560j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f59561k)) {
                    Context context = this.f59553a;
                    a aVar = new a(context, 2);
                    int i7 = this.f59556e;
                    aVar.C = i7;
                    this.f59564n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f59565o = aVar2;
                    this.f59568r = 0L;
                    this.f59567q = 0L;
                    this.f59569s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f59564n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f59565o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f59566p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f59566p = null;
        this.f59565o = null;
        this.f59564n = null;
        EGLDisplay eGLDisplay = this.f59560j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f59560j, this.f59562l);
        EGL14.eglDestroyContext(this.f59560j, this.f59561k);
        EGL14.eglTerminate(this.f59560j);
        EGL14.eglReleaseThread();
        this.f59560j = EGL14.EGL_NO_DISPLAY;
        this.f59561k = EGL14.EGL_NO_CONTEXT;
        this.f59562l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f59554b.post(new v4.p(this, 2));
        }
    }
}
