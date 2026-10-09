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
    public final Context f48122a;
    public final Handler f48123b;
    public final int f48124c;
    public EGLConfig f48131l;
    public a f48132m;
    public a f48133n;
    public a f48134o;
    public long f48135p;
    public long f48136q;
    public int f48137r;
    public final ArrayList f48125e = new ArrayList();
    public volatile r[] f48126f = new r[0];
    public final AtomicBoolean f48127g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay f48128i = EGL14.EGL_NO_DISPLAY;
    public EGLContext f48129j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f48130k = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context) {
        this.f48122a = context;
        this.f48124c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f48123b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f48128i = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f48128i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f48131l = eGLConfig;
                this.f48129j = EGL14.eglCreateContext(this.f48128i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f48128i, this.f48131l, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f48130k = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f48128i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f48129j)) {
                    Context context = this.f48122a;
                    a aVar = new a(context, 2);
                    aVar.C = 2;
                    this.f48132m = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = 2;
                    this.f48133n = aVar2;
                    this.f48136q = 0L;
                    this.f48135p = 0L;
                    this.f48137r = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f48132m;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f48133n;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f48134o;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f48134o = null;
        this.f48133n = null;
        this.f48132m = null;
        EGLDisplay eGLDisplay = this.f48128i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f48128i, this.f48130k);
        EGL14.eglDestroyContext(this.f48128i, this.f48129j);
        EGL14.eglTerminate(this.f48128i);
        EGL14.eglReleaseThread();
        this.f48128i = EGL14.EGL_NO_DISPLAY;
        this.f48129j = EGL14.EGL_NO_CONTEXT;
        this.f48130k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.f48127g.compareAndSet(false, true)) {
            this.f48123b.post(new x1(this, 4));
        }
    }
}
