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
    public final Context f48246a;
    public final Handler f48247b;
    public final int f48248c;
    public EGLConfig f48255l;
    public a f48256m;
    public a f48257n;
    public a f48258o;
    public long f48259p;
    public long f48260q;
    public int f48261r;
    public final ArrayList f48249e = new ArrayList();
    public volatile r[] f48250f = new r[0];
    public final AtomicBoolean f48251g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay f48252i = EGL14.EGL_NO_DISPLAY;
    public EGLContext f48253j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f48254k = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context) {
        this.f48246a = context;
        this.f48248c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f48247b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f48252i = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f48252i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f48255l = eGLConfig;
                this.f48253j = EGL14.eglCreateContext(this.f48252i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f48252i, this.f48255l, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f48254k = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f48252i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f48253j)) {
                    Context context = this.f48246a;
                    a aVar = new a(context, 2);
                    aVar.C = 2;
                    this.f48256m = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = 2;
                    this.f48257n = aVar2;
                    this.f48260q = 0L;
                    this.f48259p = 0L;
                    this.f48261r = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f48256m;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f48257n;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f48258o;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f48258o = null;
        this.f48257n = null;
        this.f48256m = null;
        EGLDisplay eGLDisplay = this.f48252i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f48252i, this.f48254k);
        EGL14.eglDestroyContext(this.f48252i, this.f48253j);
        EGL14.eglTerminate(this.f48252i);
        EGL14.eglReleaseThread();
        this.f48252i = EGL14.EGL_NO_DISPLAY;
        this.f48253j = EGL14.EGL_NO_CONTEXT;
        this.f48254k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.f48251g.compareAndSet(false, true)) {
            this.f48247b.post(new x1(this, 4));
        }
    }
}
