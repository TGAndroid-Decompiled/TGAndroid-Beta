package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.kc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.r5;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Wallet.o5;
public final class r0 extends r5 {
    public final t0 E;
    public final SurfaceTexture f57453a;
    public EGL10 f57454b;
    public EGLDisplay f57455c;
    public EGLContext d;
    public EGLSurface f57456e;
    public boolean f57457f;
    public volatile boolean h;
    public int f57458n;
    public int f57459r;
    public q0 f57460s;
    public final ba f57461w;
    public final o5 f57462x;
    public final q0 f57463y;

    public r0(t0 t0Var, SurfaceTexture surfaceTexture, ba baVar) {
        super("CanvasInternal", true);
        this.E = t0Var;
        this.f57462x = new o5(this, 5);
        this.f57463y = new q0(this, 0);
        this.f57461w = baVar;
        this.f57453a = surfaceTexture;
    }

    public static void a(r0 r0Var) {
        if (!r0Var.f57457f) {
            return;
        }
        if (r0Var.d.equals(r0Var.f57454b.eglGetCurrentContext()) && r0Var.f57456e.equals(r0Var.f57454b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = r0Var.f57454b;
        EGLDisplay eGLDisplay = r0Var.f57455c;
        EGLSurface eGLSurface = r0Var.f57456e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, r0Var.d);
    }

    public final void finish() {
        ba baVar = this.f57461w;
        if (this.f57456e != null) {
            EGL10 egl10 = this.f57454b;
            EGLDisplay eGLDisplay = this.f57455c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f57454b.eglDestroySurface(this.f57455c, this.f57456e);
            this.f57456e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (baVar != null) {
                synchronized (baVar.f33711f) {
                    try {
                        if (baVar.f33712g == eGLContext) {
                            baVar.f33712g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f57454b.eglDestroyContext(this.f57455c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f57455c;
        if (eGLDisplay2 != null) {
            this.f57454b.eglTerminate(eGLDisplay2);
            this.f57455c = null;
        }
        if (baVar != null) {
            q0 q0Var = this.f57463y;
            ArrayList arrayList = baVar.f33710e;
            arrayList.remove(q0Var);
            if (arrayList.isEmpty() && baVar.d.isEmpty()) {
                baVar.f33718n.o();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        t0 t0Var = this.E;
        Bitmap bitmap2 = t0Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f57453a;
            ba baVar = this.f57461w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f57454b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f57455c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (s2.f26829a) {
                    m10.v(this.f57454b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f57454b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (s2.f26829a) {
                        m10.v(this.f57454b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f57454b.eglChooseConfig(this.f57455c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (s2.f26829a) {
                            m10.v(this.f57454b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (baVar != null) {
                                synchronized (baVar.f33711f) {
                                    try {
                                        eGLContext = baVar.f33712g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f57454b.eglCreateContext(this.f57455c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (s2.f26829a) {
                                    m10.v(this.f57454b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (baVar != null) {
                                    baVar.a(eglCreateContext);
                                    baVar.f33710e.add(this.f57463y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f57454b.eglCreateWindowSurface(this.f57455c, eGLConfig, surfaceTexture, null);
                                    this.f57456e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f57454b.eglMakeCurrent(this.f57455c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (s2.f26829a) {
                                                m10.v(this.f57454b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            h0 h0Var = t0Var.f57471c;
                                            h0Var.getClass();
                                            Map map = v0.f57510a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : v0.f57510a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f57486b = new HashMap();
                                                obj.f57485a = GLES20.glCreateProgram();
                                                e2.r0 b10 = u0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10677a;
                                                if (b10.f10678b == 0) {
                                                    if (s2.f26829a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    u0.c(i10, i7, obj.f57485a);
                                                } else {
                                                    e2.r0 b11 = u0.b(35632, str);
                                                    int i11 = b11.f10677a;
                                                    if (b11.f10678b == 0) {
                                                        if (s2.f26829a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        u0.c(i10, i11, obj.f57485a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f57485a, i10);
                                                        GLES20.glAttachShader(obj.f57485a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f57485a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f57485a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && s2.f26829a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            u0.c(i10, i11, obj.f57485a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f57486b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f57485a, str2)));
                                                            }
                                                            if (i10 != 0) {
                                                                GLES20.glDeleteShader(i10);
                                                            }
                                                            if (i11 != 0) {
                                                                GLES20.glDeleteShader(i11);
                                                            }
                                                        }
                                                    }
                                                }
                                                hashMap.put((String) entry.getKey(), obj);
                                                i7 = 0;
                                            }
                                            h0Var.f57354r = DesugarCollections.unmodifiableMap(hashMap);
                                            xt0 xt0Var = h0Var.f57344g;
                                            if (t0Var.h.getWidth() != xt0Var.f42189a || t0Var.h.getHeight() != xt0Var.f42190b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) xt0Var.f42189a, (int) xt0Var.f42190b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(t0Var.h, (Rect) null, new RectF(0.0f, 0.0f, xt0Var.f42189a, xt0Var.f42190b), (Paint) null);
                                                t0Var.h = createBitmap;
                                                t0Var.f57475r = true;
                                            }
                                            if (t0Var.f57474n != null && (bitmap.getWidth() != xt0Var.f42189a || t0Var.f57474n.getHeight() != xt0Var.f42190b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) xt0Var.f42189a, (int) xt0Var.f42190b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(t0Var.f57474n, (Rect) null, new RectF(0.0f, 0.0f, xt0Var.f42189a, xt0Var.f42190b), (Paint) null);
                                                t0Var.f57474n = createBitmap2;
                                                t0Var.f57475r = true;
                                            }
                                            Bitmap bitmap3 = t0Var.h;
                                            Bitmap bitmap4 = t0Var.f57474n;
                                            if (h0Var.f57347k == null) {
                                                h0Var.f57347k = new h1(bitmap3);
                                            }
                                            if (h0Var.D == null) {
                                                h0Var.D = new h1(bitmap4);
                                            }
                                            if (h0Var.G && h0Var.f57348l == null) {
                                                h0Var.f57348l = new h1(h0Var.A);
                                            }
                                            kc.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (s2.f26829a) {
                                            m10.v(this.f57454b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (s2.f26829a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f57457f = z10;
            super.run();
        }
    }
}
