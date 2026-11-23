package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.jc;
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
import org.telegram.messenger.o10;
import org.telegram.messenger.r5;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.yt0;
public final class s0 extends r5 {
    public final u0 E;
    public final SurfaceTexture f57382a;
    public EGL10 f57383b;
    public EGLDisplay f57384c;
    public EGLContext d;
    public EGLSurface f57385e;
    public boolean f57386f;
    public volatile boolean h;
    public int f57387n;
    public int f57388r;
    public r0 f57389s;
    public final ca f57390w;
    public final s4.s0 f57391x;
    public final r0 f57392y;

    public s0(u0 u0Var, SurfaceTexture surfaceTexture, ca caVar) {
        super("CanvasInternal", true);
        this.E = u0Var;
        this.f57391x = new s4.s0(this, 2);
        this.f57392y = new r0(this, 0);
        this.f57390w = caVar;
        this.f57382a = surfaceTexture;
    }

    public static void a(s0 s0Var) {
        if (!s0Var.f57386f) {
            return;
        }
        if (s0Var.d.equals(s0Var.f57383b.eglGetCurrentContext()) && s0Var.f57385e.equals(s0Var.f57383b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = s0Var.f57383b;
        EGLDisplay eGLDisplay = s0Var.f57384c;
        EGLSurface eGLSurface = s0Var.f57385e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, s0Var.d);
    }

    public final void finish() {
        ca caVar = this.f57390w;
        if (this.f57385e != null) {
            EGL10 egl10 = this.f57383b;
            EGLDisplay eGLDisplay = this.f57384c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f57383b.eglDestroySurface(this.f57384c, this.f57385e);
            this.f57385e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (caVar != null) {
                synchronized (caVar.f34129f) {
                    try {
                        if (caVar.f34130g == eGLContext) {
                            caVar.f34130g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f57383b.eglDestroyContext(this.f57384c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f57384c;
        if (eGLDisplay2 != null) {
            this.f57383b.eglTerminate(eGLDisplay2);
            this.f57384c = null;
        }
        if (caVar != null) {
            r0 r0Var = this.f57392y;
            ArrayList arrayList = caVar.f34128e;
            arrayList.remove(r0Var);
            if (arrayList.isEmpty() && caVar.d.isEmpty()) {
                caVar.f34136n.o();
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
            SurfaceTexture surfaceTexture = this.f57382a;
            ca caVar = this.f57390w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f57383b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f57384c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (s2.f26730a) {
                    o10.v(this.f57383b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f57383b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (s2.f26730a) {
                        o10.v(this.f57383b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f57383b.eglChooseConfig(this.f57384c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (s2.f26730a) {
                            o10.v(this.f57383b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (caVar != null) {
                                synchronized (caVar.f34129f) {
                                    try {
                                        eGLContext = caVar.f34130g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f57383b.eglCreateContext(this.f57384c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (s2.f26730a) {
                                    o10.v(this.f57383b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (caVar != null) {
                                    caVar.a(eglCreateContext);
                                    caVar.f34128e.add(this.f57392y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f57383b.eglCreateWindowSurface(this.f57384c, eGLConfig, surfaceTexture, null);
                                    this.f57385e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f57383b.eglMakeCurrent(this.f57384c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (s2.f26730a) {
                                                o10.v(this.f57383b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            i0 i0Var = u0Var.f57403c;
                                            i0Var.getClass();
                                            Map map = w0.f57438a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : w0.f57438a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f57436b = new HashMap();
                                                obj.f57435a = GLES20.glCreateProgram();
                                                e2.r0 b10 = v0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10716a;
                                                if (b10.f10717b == 0) {
                                                    if (s2.f26730a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    v0.c(i10, i7, obj.f57435a);
                                                } else {
                                                    e2.r0 b11 = v0.b(35632, str);
                                                    int i11 = b11.f10716a;
                                                    if (b11.f10717b == 0) {
                                                        if (s2.f26730a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        v0.c(i10, i11, obj.f57435a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f57435a, i10);
                                                        GLES20.glAttachShader(obj.f57435a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f57435a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f57435a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && s2.f26730a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            v0.c(i10, i11, obj.f57435a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f57436b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f57435a, str2)));
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
                                            i0Var.f57281r = DesugarCollections.unmodifiableMap(hashMap);
                                            yt0 yt0Var = i0Var.f57271g;
                                            if (u0Var.h.getWidth() != yt0Var.f42545a || u0Var.h.getHeight() != yt0Var.f42546b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) yt0Var.f42545a, (int) yt0Var.f42546b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(u0Var.h, (Rect) null, new RectF(0.0f, 0.0f, yt0Var.f42545a, yt0Var.f42546b), (Paint) null);
                                                u0Var.h = createBitmap;
                                                u0Var.f57407r = true;
                                            }
                                            if (u0Var.f57406n != null && (bitmap.getWidth() != yt0Var.f42545a || u0Var.f57406n.getHeight() != yt0Var.f42546b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) yt0Var.f42545a, (int) yt0Var.f42546b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(u0Var.f57406n, (Rect) null, new RectF(0.0f, 0.0f, yt0Var.f42545a, yt0Var.f42546b), (Paint) null);
                                                u0Var.f57406n = createBitmap2;
                                                u0Var.f57407r = true;
                                            }
                                            Bitmap bitmap3 = u0Var.h;
                                            Bitmap bitmap4 = u0Var.f57406n;
                                            if (i0Var.f57274k == null) {
                                                i0Var.f57274k = new i1(bitmap3);
                                            }
                                            if (i0Var.D == null) {
                                                i0Var.D = new i1(bitmap4);
                                            }
                                            if (i0Var.G && i0Var.f57275l == null) {
                                                i0Var.f57275l = new i1(i0Var.A);
                                            }
                                            jc.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (s2.f26730a) {
                                            o10.v(this.f57383b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (s2.f26730a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f57386f = z10;
            super.run();
        }
    }
}
