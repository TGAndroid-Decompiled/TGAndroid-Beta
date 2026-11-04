package wg;

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
import r4.u;
public final class o {
    public final Context f57714a;
    public final Handler f57715b;
    public final int f57716c;
    public final int f57717e;
    public EGLConfig f57724m;
    public a f57725n;
    public a f57726o;
    public a f57727p;
    public long f57728q;
    public long f57729r;
    public int f57730s;
    public final ArrayList f57718f = new ArrayList();
    public volatile q[] f57719g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f57720i = new int[2];
    public EGLDisplay f57721j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f57722k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f57723l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i3) {
        this.f57714a = context;
        this.f57717e = i3;
        this.f57716c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f57715b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f57721j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f57721j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f57724m = eGLConfig;
                this.f57722k = EGL14.eglCreateContext(this.f57721j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f57721j, this.f57724m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f57723l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f57721j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f57722k)) {
                    Context context = this.f57714a;
                    a aVar = new a(context, 2);
                    int i3 = this.f57717e;
                    aVar.C = i3;
                    this.f57725n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i3;
                    this.f57726o = aVar2;
                    this.f57729r = 0L;
                    this.f57728q = 0L;
                    this.f57730s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f57725n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f57726o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f57727p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f57727p = null;
        this.f57726o = null;
        this.f57725n = null;
        EGLDisplay eGLDisplay = this.f57721j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f57721j, this.f57723l);
        EGL14.eglDestroyContext(this.f57721j, this.f57722k);
        EGL14.eglTerminate(this.f57721j);
        EGL14.eglReleaseThread();
        this.f57721j = EGL14.EGL_NO_DISPLAY;
        this.f57722k = EGL14.EGL_NO_CONTEXT;
        this.f57723l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f57715b.post(new u(this, 26));
        }
    }
}
