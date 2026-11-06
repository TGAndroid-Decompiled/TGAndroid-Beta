package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.ec;
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
import org.telegram.messenger.q5;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.y9;
public final class u0 extends q5 {
    public final w0 D;
    public final SurfaceTexture f55093a;
    public EGL10 f55094b;
    public EGLDisplay f55095c;
    public EGLContext d;
    public EGLSurface f55096e;
    public boolean f55097f;
    public volatile boolean h;
    public int f55098n;
    public int f55099r;
    public s0 f55100s;
    public final y9 f55101w;
    public final dt f55102x;
    public final s0 f55103y;

    public u0(w0 w0Var, SurfaceTexture surfaceTexture, y9 y9Var) {
        super("CanvasInternal", true);
        this.D = w0Var;
        this.f55102x = new dt(this, 29);
        this.f55103y = new s0(this, 0);
        this.f55101w = y9Var;
        this.f55093a = surfaceTexture;
    }

    public static void a(u0 u0Var) {
        if (!u0Var.f55097f) {
            return;
        }
        if (u0Var.d.equals(u0Var.f55094b.eglGetCurrentContext()) && u0Var.f55096e.equals(u0Var.f55094b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = u0Var.f55094b;
        EGLDisplay eGLDisplay = u0Var.f55095c;
        EGLSurface eGLSurface = u0Var.f55096e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, u0Var.d);
    }

    public final void finish() {
        y9 y9Var = this.f55101w;
        if (this.f55096e != null) {
            EGL10 egl10 = this.f55094b;
            EGLDisplay eGLDisplay = this.f55095c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f55094b.eglDestroySurface(this.f55095c, this.f55096e);
            this.f55096e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (y9Var != null) {
                synchronized (y9Var.f40572f) {
                    try {
                        if (y9Var.f40573g == eGLContext) {
                            y9Var.f40573g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f55094b.eglDestroyContext(this.f55095c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f55095c;
        if (eGLDisplay2 != null) {
            this.f55094b.eglTerminate(eGLDisplay2);
            this.f55095c = null;
        }
        if (y9Var != null) {
            s0 s0Var = this.f55103y;
            ArrayList arrayList = y9Var.f40571e;
            arrayList.remove(s0Var);
            if (arrayList.isEmpty() && y9Var.d.isEmpty()) {
                y9Var.f40579n.o();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        w0 w0Var = this.D;
        Bitmap bitmap2 = w0Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f55093a;
            y9 y9Var = this.f55101w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f55094b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f55095c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z9 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (r2.f25191a) {
                    org.telegram.messenger.camera.q.t(this.f55094b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f55094b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (r2.f25191a) {
                        org.telegram.messenger.camera.q.t(this.f55094b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f55094b.eglChooseConfig(this.f55095c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (r2.f25191a) {
                            org.telegram.messenger.camera.q.t(this.f55094b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (y9Var != null) {
                                synchronized (y9Var.f40572f) {
                                    try {
                                        eGLContext = y9Var.f40573g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f55094b.eglCreateContext(this.f55095c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (r2.f25191a) {
                                    org.telegram.messenger.camera.q.t(this.f55094b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (y9Var != null) {
                                    y9Var.a(eglCreateContext);
                                    y9Var.f40571e.add(this.f55103y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f55094b.eglCreateWindowSurface(this.f55095c, eGLConfig, surfaceTexture, null);
                                    this.f55096e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f55094b.eglMakeCurrent(this.f55095c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (r2.f25191a) {
                                                org.telegram.messenger.camera.q.t(this.f55094b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            j0 j0Var = w0Var.f55134c;
                                            j0Var.getClass();
                                            Map map = y0.f55149a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : y0.f55149a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f55145b = new HashMap();
                                                obj.f55144a = GLES20.glCreateProgram();
                                                e2.r0 b10 = x0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10533a;
                                                if (b10.f10534b == 0) {
                                                    if (r2.f25191a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    x0.c(i10, i7, obj.f55144a);
                                                } else {
                                                    e2.r0 b11 = x0.b(35632, str);
                                                    int i11 = b11.f10533a;
                                                    if (b11.f10534b == 0) {
                                                        if (r2.f25191a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        x0.c(i10, i11, obj.f55144a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f55144a, i10);
                                                        GLES20.glAttachShader(obj.f55144a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f55144a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f55144a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && r2.f25191a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            x0.c(i10, i11, obj.f55144a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f55145b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f55144a, str2)));
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
                                            j0Var.f54984r = DesugarCollections.unmodifiableMap(hashMap);
                                            mt0 mt0Var = j0Var.f54974g;
                                            if (w0Var.h.getWidth() != mt0Var.f36132a || w0Var.h.getHeight() != mt0Var.f36133b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) mt0Var.f36132a, (int) mt0Var.f36133b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(w0Var.h, (Rect) null, new RectF(0.0f, 0.0f, mt0Var.f36132a, mt0Var.f36133b), (Paint) null);
                                                w0Var.h = createBitmap;
                                                w0Var.f55138r = true;
                                            }
                                            if (w0Var.f55137n != null && (bitmap.getWidth() != mt0Var.f36132a || w0Var.f55137n.getHeight() != mt0Var.f36133b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) mt0Var.f36132a, (int) mt0Var.f36133b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(w0Var.f55137n, (Rect) null, new RectF(0.0f, 0.0f, mt0Var.f36132a, mt0Var.f36133b), (Paint) null);
                                                w0Var.f55137n = createBitmap2;
                                                w0Var.f55138r = true;
                                            }
                                            Bitmap bitmap3 = w0Var.h;
                                            Bitmap bitmap4 = w0Var.f55137n;
                                            if (j0Var.f54977k == null) {
                                                j0Var.f54977k = new k1(bitmap3);
                                            }
                                            if (j0Var.D == null) {
                                                j0Var.D = new k1(bitmap4);
                                            }
                                            if (j0Var.G && j0Var.f54978l == null) {
                                                j0Var.f54978l = new k1(j0Var.A);
                                            }
                                            ec.a();
                                            z9 = true;
                                        }
                                    } else {
                                        if (r2.f25191a) {
                                            org.telegram.messenger.camera.q.t(this.f55094b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (r2.f25191a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z9 = false;
                    }
                }
            }
            this.f55097f = z9;
            super.run();
        }
    }
}
