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
    public final Context f59518a;
    public final Handler f59519b;
    public final int f59520c;
    public final int f59521e;
    public EGLConfig f59528m;
    public a f59529n;
    public a f59530o;
    public a f59531p;
    public long f59532q;
    public long f59533r;
    public int f59534s;
    public final ArrayList f59522f = new ArrayList();
    public volatile r[] f59523g = new r[0];
    public final AtomicBoolean h = new AtomicBoolean();
    public final int[] f59524i = new int[2];
    public EGLDisplay f59525j = EGL14.EGL_NO_DISPLAY;
    public EGLContext f59526k = EGL14.EGL_NO_CONTEXT;
    public EGLSurface f59527l = EGL14.EGL_NO_SURFACE;
    public final int d = 378;

    public p(Context context, int i7) {
        this.f59518a = context;
        this.f59521e = i7;
        this.f59520c = Math.max(1, Math.min(192, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.f59519b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f59525j = eglGetDisplay;
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f59525j, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f59528m = eGLConfig;
                this.f59526k = EGL14.eglCreateContext(this.f59525j, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f59525j, this.f59528m, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f59527l = eglCreatePbufferSurface;
                if (EGL14.eglMakeCurrent(this.f59525j, eglCreatePbufferSurface, eglCreatePbufferSurface, this.f59526k)) {
                    Context context = this.f59518a;
                    a aVar = new a(context, 2);
                    int i7 = this.f59521e;
                    aVar.C = i7;
                    this.f59529n = aVar;
                    a aVar2 = new a(context, 2);
                    aVar2.C = i7;
                    this.f59530o = aVar2;
                    this.f59533r = 0L;
                    this.f59532q = 0L;
                    this.f59534s = 0;
                    return;
                }
                throw new IllegalStateException("Wallet EGL context failed");
            }
            throw new IllegalStateException("Wallet EGL config failed");
        }
        throw new IllegalStateException("Wallet EGL initialize failed");
    }

    public final void b() {
        a aVar = this.f59529n;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f59530o;
        if (aVar2 != null) {
            aVar2.b();
        }
        a aVar3 = this.f59531p;
        if (aVar3 != null) {
            aVar3.b();
        }
        this.f59531p = null;
        this.f59530o = null;
        this.f59529n = null;
        EGLDisplay eGLDisplay = this.f59525j;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.f59525j, this.f59527l);
        EGL14.eglDestroyContext(this.f59525j, this.f59526k);
        EGL14.eglTerminate(this.f59525j);
        EGL14.eglReleaseThread();
        this.f59525j = EGL14.EGL_NO_DISPLAY;
        this.f59526k = EGL14.EGL_NO_CONTEXT;
        this.f59527l = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.h.compareAndSet(false, true)) {
            this.f59519b.post(new d(this, 1));
        }
    }
}
