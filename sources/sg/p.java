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
    public final Context f48361a;
    public final Handler f48362b;
    public final int f48363c;
    public EGLConfig f48370l;
    public a f48371m;
    public a f48372n;
    public a f48373o;
    public long f48374p;
    public long f48375q;
    public int f48376r;
    public final ArrayList f48364e = new ArrayList();
    public volatile r[] f48365f = new r[0];
    public final AtomicBoolean f48366g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay f48367i = EGL14.EGL_NO_DISPLAY;
    public EGLContext f48368j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f48369k = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context) {
        this.f48361a = context;
        this.f48363c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f48362b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f48367i = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f48367i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f48370l = eGLConfig;
                this.f48368j = EGL14.eglCreateContext(this.f48367i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f48367i, this.f48370l, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f48369k = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f48367i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f48368j)) {
                    Context context = this.f48361a;
                    a aVar = new a(context, 2);
                    aVar.C = 2;
                    this.f48371m = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = 2;
                    this.f48372n = aVar2;
                    this.f48375q = 0L;
                    this.f48374p = 0L;
                    this.f48376r = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f48371m;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f48372n;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f48373o;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f48373o = null;
        this.f48372n = null;
        this.f48371m = null;
        EGLDisplay eGLDisplay = this.f48367i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f48367i, this.f48369k);
        EGL14.eglDestroyContext(this.f48367i, this.f48368j);
        EGL14.eglTerminate(this.f48367i);
        EGL14.eglReleaseThread();
        this.f48367i = EGL14.EGL_NO_DISPLAY;
        this.f48368j = EGL14.EGL_NO_CONTEXT;
        this.f48369k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.f48366g.compareAndSet(false, true)) {
            this.f48362b.post(new x1(this, 4));
        }
    }
}
