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
import sg.t0;
public final class o {
    public final Context f57367a;
    public final Handler f57368b;
    public final int f57369c;
    public final int f57370e;
    public EGLConfig f57377m;
    public a f57378n;
    public a f57379o;
    public a f57380p;
    public long f57381q;
    public long f57382r;
    public int f57383s;
    public final ArrayList f57371f = new ArrayList();
    public volatile q[] f57372g = new q[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f57373i = new int[2];
    public EGLDisplay f57374j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f57375k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f57376l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public o(Context context, int i7) {
        this.f57367a = context;
        this.f57370e = i7;
        this.f57369c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f57368b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f57374j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f57374j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f57377m = eGLConfig;
                this.f57375k = EGL14.eglCreateContext(this.f57374j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f57374j, this.f57377m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f57376l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f57374j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f57375k)) {
                    Context context = this.f57367a;
                    a aVar = new a(context, 2);
                    int i7 = this.f57370e;
                    aVar.C = i7;
                    this.f57378n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f57379o = aVar2;
                    this.f57382r = 0L;
                    this.f57381q = 0L;
                    this.f57383s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f57378n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f57379o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f57380p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f57380p = null;
        this.f57379o = null;
        this.f57378n = null;
        EGLDisplay eGLDisplay = this.f57374j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f57374j, this.f57376l);
        EGL14.eglDestroyContext(this.f57374j, this.f57375k);
        EGL14.eglTerminate(this.f57374j);
        EGL14.eglReleaseThread();
        this.f57374j = EGL14.EGL_NO_DISPLAY;
        this.f57375k = EGL14.EGL_NO_CONTEXT;
        this.f57376l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f57368b.post(new t0(this, 25));
        }
    }
}
