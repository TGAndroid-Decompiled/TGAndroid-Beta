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
    public final Context f47146a;
    public final Handler f47147b;
    public final int f47148c;
    public final int e;
    public EGLConfig f47155m;
    public a f47156n;
    public a f47157o;
    public a f47158p;
    public long f47159q;
    public long f47160r;
    public int f47161s;
    public final ArrayList f47149f = new ArrayList();
    public volatile s[] f47150g = new s[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f47151i = new int[2];
    public EGLDisplay f47152j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f47153k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f47154l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public q(Context context, int i10) {
        this.f47146a = context;
        this.e = i10;
        this.f47148c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f47147b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f47152j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f47152j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f47155m = eGLConfig;
                this.f47153k = EGL14.eglCreateContext(this.f47152j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f47152j, this.f47155m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f47154l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f47152j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f47153k)) {
                    Context context = this.f47146a;
                    a aVar = new a(context, 2);
                    int i10 = this.e;
                    aVar.C = i10;
                    this.f47156n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i10;
                    this.f47157o = aVar2;
                    this.f47160r = 0L;
                    this.f47159q = 0L;
                    this.f47161s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f47156n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f47157o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f47158p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f47158p = null;
        this.f47157o = null;
        this.f47156n = null;
        EGLDisplay eGLDisplay = this.f47152j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f47152j, this.f47154l);
        EGL14.eglDestroyContext(this.f47152j, this.f47153k);
        EGL14.eglTerminate(this.f47152j);
        EGL14.eglReleaseThread();
        this.f47152j = EGL14.EGL_NO_DISPLAY;
        this.f47153k = EGL14.EGL_NO_CONTEXT;
        this.f47154l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f47147b.post(new p(this, 0));
        }
    }
}
