package sg;

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
import rg.x1;
public final class p {
    public final Context f48212a;
    public final Handler f48213b;
    public final int f48214c;
    public EGLConfig f48221l;
    public a f48222m;
    public a f48223n;
    public a f48224o;
    public long f48225p;
    public long f48226q;
    public int f48227r;
    public final ArrayList f48215e = new ArrayList();
    public volatile r[] f48216f = new r[0];
    public final AtomicBoolean f48217g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay f48218i = EGL14.EGL_NO_DISPLAY;
    public EGLContext f48219j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f48220k = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context) {
        this.f48212a = context;
        this.f48214c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f48213b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f48218i = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f48218i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f48221l = eGLConfig;
                this.f48219j = EGL14.eglCreateContext(this.f48218i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f48218i, this.f48221l, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f48220k = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f48218i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f48219j)) {
                    Context context = this.f48212a;
                    a aVar = new a(context, 2);
                    aVar.C = 2;
                    this.f48222m = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = 2;
                    this.f48223n = aVar2;
                    this.f48226q = 0L;
                    this.f48225p = 0L;
                    this.f48227r = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f48222m;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f48223n;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f48224o;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f48224o = null;
        this.f48223n = null;
        this.f48222m = null;
        EGLDisplay eGLDisplay = this.f48218i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f48218i, this.f48220k);
        EGL14.eglDestroyContext(this.f48218i, this.f48219j);
        EGL14.eglTerminate(this.f48218i);
        EGL14.eglReleaseThread();
        this.f48218i = EGL14.EGL_NO_DISPLAY;
        this.f48219j = EGL14.EGL_NO_CONTEXT;
        this.f48220k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.f48217g.compareAndSet(false, true)) {
            this.f48213b.post(new x1(this, 4));
        }
    }
}
