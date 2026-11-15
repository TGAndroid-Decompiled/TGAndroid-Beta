package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import c8.gc;
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
import org.telegram.messenger.i20;
import org.telegram.messenger.q5;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.u9;
public final class s0 extends q5 {
    public final u0 E;
    public final SurfaceTexture f56763a;
    public EGL10 f56764b;
    public EGLDisplay f56765c;
    public EGLContext d;
    public EGLSurface f56766e;
    public boolean f56767f;
    public volatile boolean h;
    public int f56768n;
    public int f56769r;
    public r0 f56770s;
    public final u9 f56771w;
    public final s4.s0 f56772x;
    public final r0 f56773y;

    public s0(u0 u0Var, SurfaceTexture surfaceTexture, u9 u9Var) {
        super("CanvasInternal", true);
        this.E = u0Var;
        this.f56772x = new s4.s0(this, 2);
        this.f56773y = new r0(this, 0);
        this.f56771w = u9Var;
        this.f56763a = surfaceTexture;
    }

    public static void a(s0 s0Var) {
        if (!s0Var.f56767f) {
            return;
        }
        if (s0Var.d.equals(s0Var.f56764b.eglGetCurrentContext()) && s0Var.f56766e.equals(s0Var.f56764b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = s0Var.f56764b;
        EGLDisplay eGLDisplay = s0Var.f56765c;
        EGLSurface eGLSurface = s0Var.f56766e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, s0Var.d);
    }

    public final void finish() {
        u9 u9Var = this.f56771w;
        if (this.f56766e != null) {
            EGL10 egl10 = this.f56764b;
            EGLDisplay eGLDisplay = this.f56765c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f56764b.eglDestroySurface(this.f56765c, this.f56766e);
            this.f56766e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (u9Var != null) {
                synchronized (u9Var.f39970f) {
                    try {
                        if (u9Var.f39971g == eGLContext) {
                            u9Var.f39971g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f56764b.eglDestroyContext(this.f56765c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f56765c;
        if (eGLDisplay2 != null) {
            this.f56764b.eglTerminate(eGLDisplay2);
            this.f56765c = null;
        }
        if (u9Var != null) {
            r0 r0Var = this.f56773y;
            ArrayList arrayList = u9Var.f39969e;
            arrayList.remove(r0Var);
            if (arrayList.isEmpty() && u9Var.d.isEmpty()) {
                u9Var.f39977n.o();
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
            SurfaceTexture surfaceTexture = this.f56763a;
            u9 u9Var = this.f56771w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f56764b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f56765c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (r2.f26206a) {
                    i20.u(this.f56764b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f56764b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (r2.f26206a) {
                        i20.u(this.f56764b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f56764b.eglChooseConfig(this.f56765c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (r2.f26206a) {
                            i20.u(this.f56764b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (u9Var != null) {
                                synchronized (u9Var.f39970f) {
                                    try {
                                        eGLContext = u9Var.f39971g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f56764b.eglCreateContext(this.f56765c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (r2.f26206a) {
                                    i20.u(this.f56764b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (u9Var != null) {
                                    u9Var.a(eglCreateContext);
                                    u9Var.f39969e.add(this.f56773y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f56764b.eglCreateWindowSurface(this.f56765c, eGLConfig, surfaceTexture, null);
                                    this.f56766e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f56764b.eglMakeCurrent(this.f56765c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (r2.f26206a) {
                                                i20.u(this.f56764b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            i0 i0Var = u0Var.f56784c;
                                            i0Var.getClass();
                                            Map map = w0.f56819a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : w0.f56819a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f56817b = new HashMap();
                                                obj.f56816a = GLES20.glCreateProgram();
                                                e2.r0 b10 = v0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10369a;
                                                if (b10.f10370b == 0) {
                                                    if (r2.f26206a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    v0.c(i10, i7, obj.f56816a);
                                                } else {
                                                    e2.r0 b11 = v0.b(35632, str);
                                                    int i11 = b11.f10369a;
                                                    if (b11.f10370b == 0) {
                                                        if (r2.f26206a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        v0.c(i10, i11, obj.f56816a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f56816a, i10);
                                                        GLES20.glAttachShader(obj.f56816a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f56816a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f56816a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && r2.f26206a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            v0.c(i10, i11, obj.f56816a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f56817b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f56816a, str2)));
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
                                            i0Var.f56662r = DesugarCollections.unmodifiableMap(hashMap);
                                            nt0 nt0Var = i0Var.f56652g;
                                            if (u0Var.h.getWidth() != nt0Var.f37702a || u0Var.h.getHeight() != nt0Var.f37703b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) nt0Var.f37702a, (int) nt0Var.f37703b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(u0Var.h, (Rect) null, new RectF(0.0f, 0.0f, nt0Var.f37702a, nt0Var.f37703b), (Paint) null);
                                                u0Var.h = createBitmap;
                                                u0Var.f56788r = true;
                                            }
                                            if (u0Var.f56787n != null && (bitmap.getWidth() != nt0Var.f37702a || u0Var.f56787n.getHeight() != nt0Var.f37703b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) nt0Var.f37702a, (int) nt0Var.f37703b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(u0Var.f56787n, (Rect) null, new RectF(0.0f, 0.0f, nt0Var.f37702a, nt0Var.f37703b), (Paint) null);
                                                u0Var.f56787n = createBitmap2;
                                                u0Var.f56788r = true;
                                            }
                                            Bitmap bitmap3 = u0Var.h;
                                            Bitmap bitmap4 = u0Var.f56787n;
                                            if (i0Var.f56655k == null) {
                                                i0Var.f56655k = new i1(bitmap3);
                                            }
                                            if (i0Var.D == null) {
                                                i0Var.D = new i1(bitmap4);
                                            }
                                            if (i0Var.G && i0Var.f56656l == null) {
                                                i0Var.f56656l = new i1(i0Var.A);
                                            }
                                            gc.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (r2.f26206a) {
                                            i20.u(this.f56764b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (r2.f26206a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f56767f = z10;
            super.run();
        }
    }
}
