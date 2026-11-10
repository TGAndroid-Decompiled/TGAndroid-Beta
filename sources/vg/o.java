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
    public final Context f57467a;
    public final Handler f57468b;
    public final int f57469c;
    public final int f57470e;
    public EGLConfig f57477m;
    public a f57478n;
    public a f57479o;
    public a f57480p;
    public long f57481q;
    public long f57482r;
    public int f57483s;
    public final ArrayList f57471f = new ArrayList();
    public volatile q[] f57472g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f57473i = new int[2];
    public EGLDisplay f57474j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f57475k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f57476l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i7) {
        this.f57467a = context;
        this.f57470e = i7;
        this.f57469c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f57468b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f57474j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f57474j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f57477m = eGLConfig;
                this.f57475k = EGL14.eglCreateContext(this.f57474j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f57474j, this.f57477m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f57476l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f57474j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f57475k)) {
                    Context context = this.f57467a;
                    a aVar = new a(context, 2);
                    int i7 = this.f57470e;
                    aVar.C = i7;
                    this.f57478n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f57479o = aVar2;
                    this.f57482r = 0L;
                    this.f57481q = 0L;
                    this.f57483s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f57478n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f57479o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f57480p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f57480p = null;
        this.f57479o = null;
        this.f57478n = null;
        EGLDisplay eGLDisplay = this.f57474j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f57474j, this.f57476l);
        EGL14.eglDestroyContext(this.f57474j, this.f57475k);
        EGL14.eglTerminate(this.f57474j);
        EGL14.eglReleaseThread();
        this.f57474j = EGL14.EGL_NO_DISPLAY;
        this.f57475k = EGL14.EGL_NO_CONTEXT;
        this.f57476l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f57468b.post(new sh.b(this, 23));
        }
    }
}
