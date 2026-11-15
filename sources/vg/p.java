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
public final class p {
    public final Context f58943a;
    public final Handler f58944b;
    public final int f58945c;
    public final int f58946e;
    public EGLConfig f58953m;
    public a f58954n;
    public a f58955o;
    public a f58956p;
    public long f58957q;
    public long f58958r;
    public int f58959s;
    public final ArrayList f58947f = new ArrayList();
    public volatile r[] f58948g = new r[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f58949i = new int[2];
    public EGLDisplay f58950j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f58951k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f58952l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context, int i7) {
        this.f58943a = context;
        this.f58946e = i7;
        this.f58945c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f58944b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f58950j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f58950j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f58953m = eGLConfig;
                this.f58951k = EGL14.eglCreateContext(this.f58950j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f58950j, this.f58953m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f58952l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f58950j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f58951k)) {
                    Context context = this.f58943a;
                    a aVar = new a(context, 2);
                    int i7 = this.f58946e;
                    aVar.C = i7;
                    this.f58954n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f58955o = aVar2;
                    this.f58958r = 0L;
                    this.f58957q = 0L;
                    this.f58959s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f58954n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f58955o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f58956p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f58956p = null;
        this.f58955o = null;
        this.f58954n = null;
        EGLDisplay eGLDisplay = this.f58950j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f58950j, this.f58952l);
        EGL14.eglDestroyContext(this.f58950j, this.f58951k);
        EGL14.eglTerminate(this.f58950j);
        EGL14.eglReleaseThread();
        this.f58950j = EGL14.EGL_NO_DISPLAY;
        this.f58951k = EGL14.EGL_NO_CONTEXT;
        this.f58952l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f58944b.post(new q2.d(this, 29));
        }
    }
}
