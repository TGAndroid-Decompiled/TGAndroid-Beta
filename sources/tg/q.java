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
    public final Context f47155a;
    public final Handler f47156b;
    public final int f47157c;
    public final int e;
    public EGLConfig f47164m;
    public a f47165n;
    public a f47166o;
    public a f47167p;
    public long f47168q;
    public long f47169r;
    public int f47170s;
    public final ArrayList f47158f = new ArrayList();
    public volatile s[] f47159g = new s[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f47160i = new int[2];
    public EGLDisplay f47161j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f47162k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f47163l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public q(Context context, int i10) {
        this.f47155a = context;
        this.e = i10;
        this.f47157c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f47156b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f47161j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f47161j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f47164m = eGLConfig;
                this.f47162k = EGL14.eglCreateContext(this.f47161j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f47161j, this.f47164m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f47163l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f47161j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f47162k)) {
                    Context context = this.f47155a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f47165n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f47166o = aVar2;
                    this.f47169r = 0L;
                    this.f47168q = 0L;
                    this.f47170s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f47165n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f47166o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f47167p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f47167p = null;
        this.f47166o = null;
        this.f47165n = null;
        EGLDisplay eGLDisplay = this.f47161j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f47161j, this.f47163l);
        EGL14.eglDestroyContext(this.f47161j, this.f47162k);
        EGL14.eglTerminate(this.f47161j);
        EGL14.eglReleaseThread();
        this.f47161j = EGL14.EGL_NO_DISPLAY;
        this.f47162k = EGL14.EGL_NO_CONTEXT;
        this.f47163l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f47156b.post(new p(this, 0));
        }
    }
}
