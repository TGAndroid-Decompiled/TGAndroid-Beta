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
    public final Context f48353a;
    public final Handler f48354b;
    public final int f48355c;
    public EGLConfig f48362l;
    public a f48363m;
    public a f48364n;
    public a f48365o;
    public long f48366p;
    public long f48367q;
    public int f48368r;
    public final ArrayList f48356e = new ArrayList();
    public volatile r[] f48357f = new r[0];
    public final AtomicBoolean f48358g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay f48359i = EGL14.EGL_NO_DISPLAY;
    public EGLContext f48360j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f48361k = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context) {
        this.f48353a = context;
        this.f48355c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f48354b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f48359i = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f48359i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f48362l = eGLConfig;
                this.f48360j = EGL14.eglCreateContext(this.f48359i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f48359i, this.f48362l, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f48361k = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f48359i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f48360j)) {
                    Context context = this.f48353a;
                    a aVar = new a(context, 2);
                    aVar.C = 2;
                    this.f48363m = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = 2;
                    this.f48364n = aVar2;
                    this.f48367q = 0L;
                    this.f48366p = 0L;
                    this.f48368r = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f48363m;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f48364n;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f48365o;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f48365o = null;
        this.f48364n = null;
        this.f48363m = null;
        EGLDisplay eGLDisplay = this.f48359i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f48359i, this.f48361k);
        EGL14.eglDestroyContext(this.f48359i, this.f48360j);
        EGL14.eglTerminate(this.f48359i);
        EGL14.eglReleaseThread();
        this.f48359i = EGL14.EGL_NO_DISPLAY;
        this.f48360j = EGL14.EGL_NO_CONTEXT;
        this.f48361k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.f48358g.compareAndSet(false, true)) {
            this.f48354b.post(new x1(this, 4));
        }
    }
}
