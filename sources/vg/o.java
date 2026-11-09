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
    public final Context f57471a;
    public final Handler f57472b;
    public final int f57473c;
    public final int f57474e;
    public EGLConfig f57481m;
    public a f57482n;
    public a f57483o;
    public a f57484p;
    public long f57485q;
    public long f57486r;
    public int f57487s;
    public final ArrayList f57475f = new ArrayList();
    public volatile q[] f57476g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f57477i = new int[2];
    public EGLDisplay f57478j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f57479k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f57480l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i7) {
        this.f57471a = context;
        this.f57474e = i7;
        this.f57473c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f57472b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f57478j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f57478j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f57481m = eGLConfig;
                this.f57479k = EGL14.eglCreateContext(this.f57478j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f57478j, this.f57481m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f57480l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f57478j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f57479k)) {
                    Context context = this.f57471a;
                    a aVar = new a(context, 2);
                    int i7 = this.f57474e;
                    aVar.C = i7;
                    this.f57482n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f57483o = aVar2;
                    this.f57486r = 0L;
                    this.f57485q = 0L;
                    this.f57487s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f57482n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f57483o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f57484p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f57484p = null;
        this.f57483o = null;
        this.f57482n = null;
        EGLDisplay eGLDisplay = this.f57478j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f57478j, this.f57480l);
        EGL14.eglDestroyContext(this.f57478j, this.f57479k);
        EGL14.eglTerminate(this.f57478j);
        EGL14.eglReleaseThread();
        this.f57478j = EGL14.EGL_NO_DISPLAY;
        this.f57479k = EGL14.EGL_NO_CONTEXT;
        this.f57480l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f57472b.post(new sh.b(this, 23));
        }
    }
}
