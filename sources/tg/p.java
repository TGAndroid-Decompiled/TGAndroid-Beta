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
import ri.h0;
public final class p {
    public final Context f45782a;
    public final Handler f45783b;
    public final int f45784c;
    public EGLConfig f45790l;
    public a f45791m;
    public a f45792n;
    public a f45793o;
    public long f45794p;
    public long f45795q;
    public int f45796r;
    public final ArrayList e = new ArrayList();
    public volatile r[] f45785f = new r[0];
    public final AtomicBoolean f45786g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay f45787i = EGL14.EGL_NO_DISPLAY;
    public EGLContext f45788j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f45789k = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context) {
        this.f45782a = context;
        this.f45784c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f45783b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f45787i = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f45787i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f45790l = eGLConfig;
                this.f45788j = EGL14.eglCreateContext(this.f45787i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f45787i, this.f45790l, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f45789k = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f45787i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f45788j)) {
                    Context context = this.f45782a;
                    a aVar = new a(context, 2);
                    aVar.C = 2;
                    this.f45791m = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = 2;
                    this.f45792n = aVar2;
                    this.f45795q = 0L;
                    this.f45794p = 0L;
                    this.f45796r = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f45791m;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f45792n;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f45793o;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f45793o = null;
        this.f45792n = null;
        this.f45791m = null;
        EGLDisplay eGLDisplay = this.f45787i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f45787i, this.f45789k);
        EGL14.eglDestroyContext(this.f45787i, this.f45788j);
        EGL14.eglTerminate(this.f45787i);
        EGL14.eglReleaseThread();
        this.f45787i = EGL14.EGL_NO_DISPLAY;
        this.f45788j = EGL14.EGL_NO_CONTEXT;
        this.f45789k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.f45786g.compareAndSet(false, true)) {
            this.f45783b.post(new h0(this, 10));
        }
    }
}
