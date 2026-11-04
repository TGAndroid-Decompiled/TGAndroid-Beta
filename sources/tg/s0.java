package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
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
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.x9;
public final class s0 extends q5 {
    public final u0 E;
    public final SurfaceTexture f55304a;
    public EGL10 f55305b;
    public EGLDisplay f55306c;
    public EGLContext d;
    public EGLSurface f55307e;
    public boolean f55308f;
    public volatile boolean h;
    public int f55309n;
    public int f55310r;
    public r0 f55311s;
    public final x9 f55312w;
    public final lt f55313x;
    public final r0 f55314y;

    public s0(u0 u0Var, SurfaceTexture surfaceTexture, x9 x9Var) {
        super("CanvasInternal", true);
        this.E = u0Var;
        this.f55313x = new lt(this, 24);
        this.f55314y = new r0(this, 0);
        this.f55312w = x9Var;
        this.f55304a = surfaceTexture;
    }

    public static void a(s0 s0Var) {
        if (!s0Var.f55308f) {
            return;
        }
        if (s0Var.d.equals(s0Var.f55305b.eglGetCurrentContext()) && s0Var.f55307e.equals(s0Var.f55305b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = s0Var.f55305b;
        EGLDisplay eGLDisplay = s0Var.f55306c;
        EGLSurface eGLSurface = s0Var.f55307e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, s0Var.d);
    }

    public final void finish() {
        x9 x9Var = this.f55312w;
        if (this.f55307e != null) {
            EGL10 egl10 = this.f55305b;
            EGLDisplay eGLDisplay = this.f55306c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f55305b.eglDestroySurface(this.f55306c, this.f55307e);
            this.f55307e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (x9Var != null) {
                synchronized (x9Var.f40275f) {
                    try {
                        if (x9Var.f40276g == eGLContext) {
                            x9Var.f40276g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f55305b.eglDestroyContext(this.f55306c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f55306c;
        if (eGLDisplay2 != null) {
            this.f55305b.eglTerminate(eGLDisplay2);
            this.f55306c = null;
        }
        if (x9Var != null) {
            r0 r0Var = this.f55314y;
            ArrayList arrayList = x9Var.f40274e;
            arrayList.remove(r0Var);
            if (arrayList.isEmpty() && x9Var.d.isEmpty()) {
                x9Var.f40282n.o();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        u0 u0Var = this.E;
        Bitmap bitmap2 = u0Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f55304a;
            x9 x9Var = this.f55312w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f55305b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f55306c = eglGetDisplay;
            int i3 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (r2.f25040a) {
                    org.telegram.messenger.camera.q.t(this.f55305b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f55305b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (r2.f25040a) {
                        org.telegram.messenger.camera.q.t(this.f55305b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f55305b.eglChooseConfig(this.f55306c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (r2.f25040a) {
                            org.telegram.messenger.camera.q.t(this.f55305b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (x9Var != null) {
                                synchronized (x9Var.f40275f) {
                                    try {
                                        eGLContext = x9Var.f40276g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f55305b.eglCreateContext(this.f55306c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (r2.f25040a) {
                                    org.telegram.messenger.camera.q.t(this.f55305b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (x9Var != null) {
                                    x9Var.a(eglCreateContext);
                                    x9Var.f40274e.add(this.f55314y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f55305b.eglCreateWindowSurface(this.f55306c, eGLConfig, surfaceTexture, null);
                                    this.f55307e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f55305b.eglMakeCurrent(this.f55306c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (r2.f25040a) {
                                                org.telegram.messenger.camera.q.t(this.f55305b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            i0 i0Var = u0Var.f55323c;
                                            i0Var.getClass();
                                            Map map = w0.f55362a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : w0.f55362a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f55338b = new HashMap();
                                                obj.f55337a = GLES20.glCreateProgram();
                                                d2.t0 b10 = v0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f8413a;
                                                if (b10.f8414b == 0) {
                                                    if (r2.f25040a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    v0.c(i10, i3, obj.f55337a);
                                                } else {
                                                    d2.t0 b11 = v0.b(35632, str);
                                                    int i11 = b11.f8413a;
                                                    if (b11.f8414b == 0) {
                                                        if (r2.f25040a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        v0.c(i10, i11, obj.f55337a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f55337a, i10);
                                                        GLES20.glAttachShader(obj.f55337a, i11);
                                                        for (int i12 = i3; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f55337a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f55337a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i3);
                                                        if (iArr3[i3] == 0 && r2.f25040a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i3] == 0) {
                                                            v0.c(i10, i11, obj.f55337a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i3; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f55338b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f55337a, str2)));
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
                                                i3 = 0;
                                            }
                                            i0Var.f55204r = DesugarCollections.unmodifiableMap(hashMap);
                                            lt0 lt0Var = i0Var.f55194g;
                                            if (u0Var.h.getWidth() != lt0Var.f35877a || u0Var.h.getHeight() != lt0Var.f35878b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) lt0Var.f35877a, (int) lt0Var.f35878b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(u0Var.h, (Rect) null, new RectF(0.0f, 0.0f, lt0Var.f35877a, lt0Var.f35878b), (Paint) null);
                                                u0Var.h = createBitmap;
                                                u0Var.f55327r = true;
                                            }
                                            if (u0Var.f55326n != null && (bitmap.getWidth() != lt0Var.f35877a || u0Var.f55326n.getHeight() != lt0Var.f35878b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) lt0Var.f35877a, (int) lt0Var.f35878b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(u0Var.f55326n, (Rect) null, new RectF(0.0f, 0.0f, lt0Var.f35877a, lt0Var.f35878b), (Paint) null);
                                                u0Var.f55326n = createBitmap2;
                                                u0Var.f55327r = true;
                                            }
                                            Bitmap bitmap3 = u0Var.h;
                                            Bitmap bitmap4 = u0Var.f55326n;
                                            if (i0Var.f55197k == null) {
                                                i0Var.f55197k = new i1(bitmap3);
                                            }
                                            if (i0Var.D == null) {
                                                i0Var.D = new i1(bitmap4);
                                            }
                                            if (i0Var.G && i0Var.f55198l == null) {
                                                i0Var.f55198l = new i1(i0Var.A);
                                            }
                                            x7.e0.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (r2.f25040a) {
                                            org.telegram.messenger.camera.q.t(this.f55305b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (r2.f25040a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f55308f = z10;
            super.run();
        }
    }
}
