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
import org.telegram.messenger.o10;
import org.telegram.messenger.r5;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.yt0;
public final class s0 extends r5 {
    public final u0 E;
    public final SurfaceTexture f57347a;
    public EGL10 f57348b;
    public EGLDisplay f57349c;
    public EGLContext d;
    public EGLSurface f57350e;
    public boolean f57351f;
    public volatile boolean h;
    public int f57352n;
    public int f57353r;
    public r0 f57354s;
    public final ca f57355w;
    public final s4.s0 f57356x;
    public final r0 f57357y;

    public s0(u0 u0Var, SurfaceTexture surfaceTexture, ca caVar) {
        super("CanvasInternal", true);
        this.E = u0Var;
        this.f57356x = new s4.s0(this, 2);
        this.f57357y = new r0(this, 0);
        this.f57355w = caVar;
        this.f57347a = surfaceTexture;
    }

    public static void a(s0 s0Var) {
        if (!s0Var.f57351f) {
            return;
        }
        if (s0Var.d.equals(s0Var.f57348b.eglGetCurrentContext()) && s0Var.f57350e.equals(s0Var.f57348b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = s0Var.f57348b;
        EGLDisplay eGLDisplay = s0Var.f57349c;
        EGLSurface eGLSurface = s0Var.f57350e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, s0Var.d);
    }

    public final void finish() {
        ca caVar = this.f57355w;
        if (this.f57350e != null) {
            EGL10 egl10 = this.f57348b;
            EGLDisplay eGLDisplay = this.f57349c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f57348b.eglDestroySurface(this.f57349c, this.f57350e);
            this.f57350e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (caVar != null) {
                synchronized (caVar.f34093f) {
                    try {
                        if (caVar.f34094g == eGLContext) {
                            caVar.f34094g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f57348b.eglDestroyContext(this.f57349c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f57349c;
        if (eGLDisplay2 != null) {
            this.f57348b.eglTerminate(eGLDisplay2);
            this.f57349c = null;
        }
        if (caVar != null) {
            r0 r0Var = this.f57357y;
            ArrayList arrayList = caVar.f34092e;
            arrayList.remove(r0Var);
            if (arrayList.isEmpty() && caVar.d.isEmpty()) {
                caVar.f34100n.o();
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
            SurfaceTexture surfaceTexture = this.f57347a;
            ca caVar = this.f57355w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f57348b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f57349c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (s2.f26694a) {
                    o10.v(this.f57348b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f57348b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (s2.f26694a) {
                        o10.v(this.f57348b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f57348b.eglChooseConfig(this.f57349c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (s2.f26694a) {
                            o10.v(this.f57348b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (caVar != null) {
                                synchronized (caVar.f34093f) {
                                    try {
                                        eGLContext = caVar.f34094g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f57348b.eglCreateContext(this.f57349c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (s2.f26694a) {
                                    o10.v(this.f57348b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (caVar != null) {
                                    caVar.a(eglCreateContext);
                                    caVar.f34092e.add(this.f57357y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f57348b.eglCreateWindowSurface(this.f57349c, eGLConfig, surfaceTexture, null);
                                    this.f57350e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f57348b.eglMakeCurrent(this.f57349c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (s2.f26694a) {
                                                o10.v(this.f57348b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            i0 i0Var = u0Var.f57368c;
                                            i0Var.getClass();
                                            Map map = w0.f57403a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : w0.f57403a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f57401b = new HashMap();
                                                obj.f57400a = GLES20.glCreateProgram();
                                                e2.r0 b10 = v0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10679a;
                                                if (b10.f10680b == 0) {
                                                    if (s2.f26694a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    v0.c(i10, i7, obj.f57400a);
                                                } else {
                                                    e2.r0 b11 = v0.b(35632, str);
                                                    int i11 = b11.f10679a;
                                                    if (b11.f10680b == 0) {
                                                        if (s2.f26694a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        v0.c(i10, i11, obj.f57400a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f57400a, i10);
                                                        GLES20.glAttachShader(obj.f57400a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f57400a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f57400a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && s2.f26694a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            v0.c(i10, i11, obj.f57400a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f57401b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f57400a, str2)));
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
                                            i0Var.f57246r = DesugarCollections.unmodifiableMap(hashMap);
                                            yt0 yt0Var = i0Var.f57236g;
                                            if (u0Var.h.getWidth() != yt0Var.f42506a || u0Var.h.getHeight() != yt0Var.f42507b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) yt0Var.f42506a, (int) yt0Var.f42507b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(u0Var.h, (Rect) null, new RectF(0.0f, 0.0f, yt0Var.f42506a, yt0Var.f42507b), (Paint) null);
                                                u0Var.h = createBitmap;
                                                u0Var.f57372r = true;
                                            }
                                            if (u0Var.f57371n != null && (bitmap.getWidth() != yt0Var.f42506a || u0Var.f57371n.getHeight() != yt0Var.f42507b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) yt0Var.f42506a, (int) yt0Var.f42507b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(u0Var.f57371n, (Rect) null, new RectF(0.0f, 0.0f, yt0Var.f42506a, yt0Var.f42507b), (Paint) null);
                                                u0Var.f57371n = createBitmap2;
                                                u0Var.f57372r = true;
                                            }
                                            Bitmap bitmap3 = u0Var.h;
                                            Bitmap bitmap4 = u0Var.f57371n;
                                            if (i0Var.f57239k == null) {
                                                i0Var.f57239k = new i1(bitmap3);
                                            }
                                            if (i0Var.D == null) {
                                                i0Var.D = new i1(bitmap4);
                                            }
                                            if (i0Var.G && i0Var.f57240l == null) {
                                                i0Var.f57240l = new i1(i0Var.A);
                                            }
                                            kc.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (s2.f26694a) {
                                            o10.v(this.f57348b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (s2.f26694a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f57351f = z10;
            super.run();
        }
    }
}
