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
    public final Context f47594a;
    public final Handler f47595b;
    public final int f47596c;
    public final int e;
    public EGLConfig f47603m;
    public a f47604n;
    public a f47605o;
    public a f47606p;
    public long f47607q;
    public long f47608r;
    public int f47609s;
    public final ArrayList f47597f = new ArrayList();
    public volatile s[] f47598g = new s[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f47599i = new int[2];
    public EGLDisplay f47600j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f47601k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f47602l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public q(Context context, int i10) {
        this.f47594a = context;
        this.e = i10;
        this.f47596c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f47595b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f47600j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f47600j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f47603m = eGLConfig;
                this.f47601k = EGL14.eglCreateContext(this.f47600j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f47600j, this.f47603m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f47602l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f47600j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f47601k)) {
                    Context context = this.f47594a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f47604n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f47605o = aVar2;
                    this.f47608r = 0L;
                    this.f47607q = 0L;
                    this.f47609s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f47604n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f47605o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f47606p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f47606p = null;
        this.f47605o = null;
        this.f47604n = null;
        EGLDisplay eGLDisplay = this.f47600j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f47600j, this.f47602l);
        EGL14.eglDestroyContext(this.f47600j, this.f47601k);
        EGL14.eglTerminate(this.f47600j);
        EGL14.eglReleaseThread();
        this.f47600j = EGL14.EGL_NO_DISPLAY;
        this.f47601k = EGL14.EGL_NO_CONTEXT;
        this.f47602l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f47595b.post(new p(this, 0));
        }
    }
}
