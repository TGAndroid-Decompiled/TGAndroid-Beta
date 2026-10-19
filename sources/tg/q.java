package tg;

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
public final class q {
    public final Context f47150a;
    public final Handler f47151b;
    public final int f47152c;
    public final int e;
    public EGLConfig f47159m;
    public a f47160n;
    public a f47161o;
    public a f47162p;
    public long f47163q;
    public long f47164r;
    public int f47165s;
    public final ArrayList f47153f = new ArrayList();
    public volatile s[] f47154g = new s[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f47155i = new int[2];
    public EGLDisplay f47156j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f47157k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f47158l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public q(Context context, int i10) {
        this.f47150a = context;
        this.e = i10;
        this.f47152c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f47151b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f47156j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f47156j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f47159m = eGLConfig;
                this.f47157k = EGL14.eglCreateContext(this.f47156j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f47156j, this.f47159m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f47158l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f47156j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f47157k)) {
                    Context context = this.f47150a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f47160n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f47161o = aVar2;
                    this.f47164r = 0L;
                    this.f47163q = 0L;
                    this.f47165s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f47160n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f47161o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f47162p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f47162p = null;
        this.f47161o = null;
        this.f47160n = null;
        EGLDisplay eGLDisplay = this.f47156j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f47156j, this.f47158l);
        EGL14.eglDestroyContext(this.f47156j, this.f47157k);
        EGL14.eglTerminate(this.f47156j);
        EGL14.eglReleaseThread();
        this.f47156j = EGL14.EGL_NO_DISPLAY;
        this.f47157k = EGL14.EGL_NO_CONTEXT;
        this.f47158l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f47151b.post(new p(this, 0));
        }
    }
}
