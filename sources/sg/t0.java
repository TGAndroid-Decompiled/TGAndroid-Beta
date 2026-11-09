package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.fc;
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
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.y9;
public final class t0 extends q5 {
    public final v0 D;
    public final SurfaceTexture f55215a;
    public EGL10 f55216b;
    public EGLDisplay f55217c;
    public EGLContext d;
    public EGLSurface f55218e;
    public boolean f55219f;
    public volatile boolean h;
    public int f55220n;
    public int f55221r;
    public s0 f55222s;
    public final y9 f55223w;
    public final et f55224x;
    public final s0 f55225y;

    public t0(v0 v0Var, SurfaceTexture surfaceTexture, y9 y9Var) {
        super("CanvasInternal", true);
        this.D = v0Var;
        this.f55224x = new et(this, 29);
        this.f55225y = new s0(this, 0);
        this.f55223w = y9Var;
        this.f55215a = surfaceTexture;
    }

    public static void a(t0 t0Var) {
        if (!t0Var.f55219f) {
            return;
        }
        if (t0Var.d.equals(t0Var.f55216b.eglGetCurrentContext()) && t0Var.f55218e.equals(t0Var.f55216b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = t0Var.f55216b;
        EGLDisplay eGLDisplay = t0Var.f55217c;
        EGLSurface eGLSurface = t0Var.f55218e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, t0Var.d);
    }

    public final void finish() {
        y9 y9Var = this.f55223w;
        if (this.f55218e != null) {
            EGL10 egl10 = this.f55216b;
            EGLDisplay eGLDisplay = this.f55217c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f55216b.eglDestroySurface(this.f55217c, this.f55218e);
            this.f55218e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (y9Var != null) {
                synchronized (y9Var.f40675f) {
                    try {
                        if (y9Var.f40676g == eGLContext) {
                            y9Var.f40676g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f55216b.eglDestroyContext(this.f55217c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f55217c;
        if (eGLDisplay2 != null) {
            this.f55216b.eglTerminate(eGLDisplay2);
            this.f55217c = null;
        }
        if (y9Var != null) {
            s0 s0Var = this.f55225y;
            ArrayList arrayList = y9Var.f40674e;
            arrayList.remove(s0Var);
            if (arrayList.isEmpty() && y9Var.d.isEmpty()) {
                y9Var.f40682n.o();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        v0 v0Var = this.D;
        Bitmap bitmap2 = v0Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f55215a;
            y9 y9Var = this.f55223w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f55216b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f55217c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z9 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (r2.f25212a) {
                    org.telegram.messenger.camera.q.t(this.f55216b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f55216b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (r2.f25212a) {
                        org.telegram.messenger.camera.q.t(this.f55216b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f55216b.eglChooseConfig(this.f55217c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (r2.f25212a) {
                            org.telegram.messenger.camera.q.t(this.f55216b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (y9Var != null) {
                                synchronized (y9Var.f40675f) {
                                    try {
                                        eGLContext = y9Var.f40676g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f55216b.eglCreateContext(this.f55217c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (r2.f25212a) {
                                    org.telegram.messenger.camera.q.t(this.f55216b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (y9Var != null) {
                                    y9Var.a(eglCreateContext);
                                    y9Var.f40674e.add(this.f55225y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f55216b.eglCreateWindowSurface(this.f55217c, eGLConfig, surfaceTexture, null);
                                    this.f55218e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f55216b.eglMakeCurrent(this.f55217c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (r2.f25212a) {
                                                org.telegram.messenger.camera.q.t(this.f55216b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            j0 j0Var = v0Var.f55236c;
                                            j0Var.getClass();
                                            Map map = x0.f55271a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : x0.f55271a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f55269b = new HashMap();
                                                obj.f55268a = GLES20.glCreateProgram();
                                                e2.r0 b10 = w0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10533a;
                                                if (b10.f10534b == 0) {
                                                    if (r2.f25212a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    w0.c(i10, i7, obj.f55268a);
                                                } else {
                                                    e2.r0 b11 = w0.b(35632, str);
                                                    int i11 = b11.f10533a;
                                                    if (b11.f10534b == 0) {
                                                        if (r2.f25212a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        w0.c(i10, i11, obj.f55268a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f55268a, i10);
                                                        GLES20.glAttachShader(obj.f55268a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f55268a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f55268a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && r2.f25212a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            w0.c(i10, i11, obj.f55268a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f55269b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f55268a, str2)));
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
                                            j0Var.f55114r = DesugarCollections.unmodifiableMap(hashMap);
                                            ot0 ot0Var = j0Var.f55104g;
                                            if (v0Var.h.getWidth() != ot0Var.f36801a || v0Var.h.getHeight() != ot0Var.f36802b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) ot0Var.f36801a, (int) ot0Var.f36802b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(v0Var.h, (Rect) null, new RectF(0.0f, 0.0f, ot0Var.f36801a, ot0Var.f36802b), (Paint) null);
                                                v0Var.h = createBitmap;
                                                v0Var.f55240r = true;
                                            }
                                            if (v0Var.f55239n != null && (bitmap.getWidth() != ot0Var.f36801a || v0Var.f55239n.getHeight() != ot0Var.f36802b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) ot0Var.f36801a, (int) ot0Var.f36802b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(v0Var.f55239n, (Rect) null, new RectF(0.0f, 0.0f, ot0Var.f36801a, ot0Var.f36802b), (Paint) null);
                                                v0Var.f55239n = createBitmap2;
                                                v0Var.f55240r = true;
                                            }
                                            Bitmap bitmap3 = v0Var.h;
                                            Bitmap bitmap4 = v0Var.f55239n;
                                            if (j0Var.f55107k == null) {
                                                j0Var.f55107k = new j1(bitmap3);
                                            }
                                            if (j0Var.D == null) {
                                                j0Var.D = new j1(bitmap4);
                                            }
                                            if (j0Var.G && j0Var.f55108l == null) {
                                                j0Var.f55108l = new j1(j0Var.A);
                                            }
                                            fc.a();
                                            z9 = true;
                                        }
                                    } else {
                                        if (r2.f25212a) {
                                            org.telegram.messenger.camera.q.t(this.f55216b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (r2.f25212a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z9 = false;
                    }
                }
            }
            this.f55219f = z9;
            super.run();
        }
    }
}
