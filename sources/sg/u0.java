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
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.y9;
public final class u0 extends q5 {
    public final w0 D;
    public final SurfaceTexture f55209a;
    public EGL10 f55210b;
    public EGLDisplay f55211c;
    public EGLContext d;
    public EGLSurface f55212e;
    public boolean f55213f;
    public volatile boolean h;
    public int f55214n;
    public int f55215r;
    public s0 f55216s;
    public final y9 f55217w;
    public final et f55218x;
    public final s0 f55219y;

    public u0(w0 w0Var, SurfaceTexture surfaceTexture, y9 y9Var) {
        super("CanvasInternal", true);
        this.D = w0Var;
        this.f55218x = new et(this, 29);
        this.f55219y = new s0(this, 0);
        this.f55217w = y9Var;
        this.f55209a = surfaceTexture;
    }

    public static void a(u0 u0Var) {
        if (!u0Var.f55213f) {
            return;
        }
        if (u0Var.d.equals(u0Var.f55210b.eglGetCurrentContext()) && u0Var.f55212e.equals(u0Var.f55210b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = u0Var.f55210b;
        EGLDisplay eGLDisplay = u0Var.f55211c;
        EGLSurface eGLSurface = u0Var.f55212e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, u0Var.d);
    }

    public final void finish() {
        y9 y9Var = this.f55217w;
        if (this.f55212e != null) {
            EGL10 egl10 = this.f55210b;
            EGLDisplay eGLDisplay = this.f55211c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f55210b.eglDestroySurface(this.f55211c, this.f55212e);
            this.f55212e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (y9Var != null) {
                synchronized (y9Var.f40629f) {
                    try {
                        if (y9Var.f40630g == eGLContext) {
                            y9Var.f40630g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f55210b.eglDestroyContext(this.f55211c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f55211c;
        if (eGLDisplay2 != null) {
            this.f55210b.eglTerminate(eGLDisplay2);
            this.f55211c = null;
        }
        if (y9Var != null) {
            s0 s0Var = this.f55219y;
            ArrayList arrayList = y9Var.f40628e;
            arrayList.remove(s0Var);
            if (arrayList.isEmpty() && y9Var.d.isEmpty()) {
                y9Var.f40636n.o();
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
            SurfaceTexture surfaceTexture = this.f55209a;
            y9 y9Var = this.f55217w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f55210b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f55211c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z9 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (r2.f25212a) {
                    org.telegram.messenger.camera.q.t(this.f55210b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f55210b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (r2.f25212a) {
                        org.telegram.messenger.camera.q.t(this.f55210b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f55210b.eglChooseConfig(this.f55211c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (r2.f25212a) {
                            org.telegram.messenger.camera.q.t(this.f55210b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (y9Var != null) {
                                synchronized (y9Var.f40629f) {
                                    try {
                                        eGLContext = y9Var.f40630g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f55210b.eglCreateContext(this.f55211c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (r2.f25212a) {
                                    org.telegram.messenger.camera.q.t(this.f55210b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (y9Var != null) {
                                    y9Var.a(eglCreateContext);
                                    y9Var.f40628e.add(this.f55219y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f55210b.eglCreateWindowSurface(this.f55211c, eGLConfig, surfaceTexture, null);
                                    this.f55212e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f55210b.eglMakeCurrent(this.f55211c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (r2.f25212a) {
                                                org.telegram.messenger.camera.q.t(this.f55210b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            j0 j0Var = w0Var.f55250c;
                                            j0Var.getClass();
                                            Map map = y0.f55265a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : y0.f55265a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f55261b = new HashMap();
                                                obj.f55260a = GLES20.glCreateProgram();
                                                e2.r0 b10 = x0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10533a;
                                                if (b10.f10534b == 0) {
                                                    if (r2.f25212a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    x0.c(i10, i7, obj.f55260a);
                                                } else {
                                                    e2.r0 b11 = x0.b(35632, str);
                                                    int i11 = b11.f10533a;
                                                    if (b11.f10534b == 0) {
                                                        if (r2.f25212a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        x0.c(i10, i11, obj.f55260a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f55260a, i10);
                                                        GLES20.glAttachShader(obj.f55260a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f55260a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f55260a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && r2.f25212a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            x0.c(i10, i11, obj.f55260a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f55261b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f55260a, str2)));
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
                                            j0Var.f55100r = DesugarCollections.unmodifiableMap(hashMap);
                                            mt0 mt0Var = j0Var.f55090g;
                                            if (w0Var.h.getWidth() != mt0Var.f36114a || w0Var.h.getHeight() != mt0Var.f36115b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) mt0Var.f36114a, (int) mt0Var.f36115b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(w0Var.h, (Rect) null, new RectF(0.0f, 0.0f, mt0Var.f36114a, mt0Var.f36115b), (Paint) null);
                                                w0Var.h = createBitmap;
                                                w0Var.f55254r = true;
                                            }
                                            if (w0Var.f55253n != null && (bitmap.getWidth() != mt0Var.f36114a || w0Var.f55253n.getHeight() != mt0Var.f36115b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) mt0Var.f36114a, (int) mt0Var.f36115b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(w0Var.f55253n, (Rect) null, new RectF(0.0f, 0.0f, mt0Var.f36114a, mt0Var.f36115b), (Paint) null);
                                                w0Var.f55253n = createBitmap2;
                                                w0Var.f55254r = true;
                                            }
                                            Bitmap bitmap3 = w0Var.h;
                                            Bitmap bitmap4 = w0Var.f55253n;
                                            if (j0Var.f55093k == null) {
                                                j0Var.f55093k = new k1(bitmap3);
                                            }
                                            if (j0Var.D == null) {
                                                j0Var.D = new k1(bitmap4);
                                            }
                                            if (j0Var.G && j0Var.f55094l == null) {
                                                j0Var.f55094l = new k1(j0Var.A);
                                            }
                                            fc.a();
                                            z9 = true;
                                        }
                                    } else {
                                        if (r2.f25212a) {
                                            org.telegram.messenger.camera.q.t(this.f55210b, new StringBuilder("createWindowSurface failed "));
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
            this.f55213f = z9;
            super.run();
        }
    }
}
