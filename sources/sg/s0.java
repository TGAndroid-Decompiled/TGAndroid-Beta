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
import org.telegram.messenger.n10;
import org.telegram.messenger.r5;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.vt0;
public final class s0 extends r5 {
    public final u0 E;
    public final SurfaceTexture f57337a;
    public EGL10 f57338b;
    public EGLDisplay f57339c;
    public EGLContext d;
    public EGLSurface f57340e;
    public boolean f57341f;
    public volatile boolean h;
    public int f57342n;
    public int f57343r;
    public r0 f57344s;
    public final ca f57345w;
    public final s4.s0 f57346x;
    public final r0 f57347y;

    public s0(u0 u0Var, SurfaceTexture surfaceTexture, ca caVar) {
        super("CanvasInternal", true);
        this.E = u0Var;
        this.f57346x = new s4.s0(this, 2);
        this.f57347y = new r0(this, 0);
        this.f57345w = caVar;
        this.f57337a = surfaceTexture;
    }

    public static void a(s0 s0Var) {
        if (!s0Var.f57341f) {
            return;
        }
        if (s0Var.d.equals(s0Var.f57338b.eglGetCurrentContext()) && s0Var.f57340e.equals(s0Var.f57338b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = s0Var.f57338b;
        EGLDisplay eGLDisplay = s0Var.f57339c;
        EGLSurface eGLSurface = s0Var.f57340e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, s0Var.d);
    }

    public final void finish() {
        ca caVar = this.f57345w;
        if (this.f57340e != null) {
            EGL10 egl10 = this.f57338b;
            EGLDisplay eGLDisplay = this.f57339c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f57338b.eglDestroySurface(this.f57339c, this.f57340e);
            this.f57340e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (caVar != null) {
                synchronized (caVar.f33945f) {
                    try {
                        if (caVar.f33946g == eGLContext) {
                            caVar.f33946g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f57338b.eglDestroyContext(this.f57339c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f57339c;
        if (eGLDisplay2 != null) {
            this.f57338b.eglTerminate(eGLDisplay2);
            this.f57339c = null;
        }
        if (caVar != null) {
            r0 r0Var = this.f57347y;
            ArrayList arrayList = caVar.f33944e;
            arrayList.remove(r0Var);
            if (arrayList.isEmpty() && caVar.d.isEmpty()) {
                caVar.f33952n.o();
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
            SurfaceTexture surfaceTexture = this.f57337a;
            ca caVar = this.f57345w;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f57338b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f57339c = eglGetDisplay;
            int i7 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (s2.f26723a) {
                    n10.v(this.f57338b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f57338b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (s2.f26723a) {
                        n10.v(this.f57338b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f57338b.eglChooseConfig(this.f57339c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (s2.f26723a) {
                            n10.v(this.f57338b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (caVar != null) {
                                synchronized (caVar.f33945f) {
                                    try {
                                        eGLContext = caVar.f33946g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f57338b.eglCreateContext(this.f57339c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (s2.f26723a) {
                                    n10.v(this.f57338b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (caVar != null) {
                                    caVar.a(eglCreateContext);
                                    caVar.f33944e.add(this.f57347y);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f57338b.eglCreateWindowSurface(this.f57339c, eGLConfig, surfaceTexture, null);
                                    this.f57340e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f57338b.eglMakeCurrent(this.f57339c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (s2.f26723a) {
                                                n10.v(this.f57338b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            i0 i0Var = u0Var.f57358c;
                                            i0Var.getClass();
                                            Map map = w0.f57393a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : w0.f57393a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f57391b = new HashMap();
                                                obj.f57390a = GLES20.glCreateProgram();
                                                e2.r0 b10 = v0.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f10687a;
                                                if (b10.f10688b == 0) {
                                                    if (s2.f26723a) {
                                                        a8.d("Vertex shader compilation failed");
                                                    }
                                                    v0.c(i10, i7, obj.f57390a);
                                                } else {
                                                    e2.r0 b11 = v0.b(35632, str);
                                                    int i11 = b11.f10687a;
                                                    if (b11.f10688b == 0) {
                                                        if (s2.f26723a) {
                                                            a8.d("Fragment shader compilation failed");
                                                        }
                                                        v0.c(i10, i11, obj.f57390a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f57390a, i10);
                                                        GLES20.glAttachShader(obj.f57390a, i11);
                                                        for (int i12 = i7; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f57390a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f57390a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i7);
                                                        if (iArr3[i7] == 0 && s2.f26723a) {
                                                            a8.d(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i7] == 0) {
                                                            v0.c(i10, i11, obj.f57390a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i14 = i7; i14 < length; i14++) {
                                                                String str2 = strArr2[i14];
                                                                obj.f57391b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f57390a, str2)));
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
                                            i0Var.f57236r = DesugarCollections.unmodifiableMap(hashMap);
                                            vt0 vt0Var = i0Var.f57226g;
                                            if (u0Var.h.getWidth() != vt0Var.f41433a || u0Var.h.getHeight() != vt0Var.f41434b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) vt0Var.f41433a, (int) vt0Var.f41434b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(u0Var.h, (Rect) null, new RectF(0.0f, 0.0f, vt0Var.f41433a, vt0Var.f41434b), (Paint) null);
                                                u0Var.h = createBitmap;
                                                u0Var.f57362r = true;
                                            }
                                            if (u0Var.f57361n != null && (bitmap.getWidth() != vt0Var.f41433a || u0Var.f57361n.getHeight() != vt0Var.f41434b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) vt0Var.f41433a, (int) vt0Var.f41434b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(u0Var.f57361n, (Rect) null, new RectF(0.0f, 0.0f, vt0Var.f41433a, vt0Var.f41434b), (Paint) null);
                                                u0Var.f57361n = createBitmap2;
                                                u0Var.f57362r = true;
                                            }
                                            Bitmap bitmap3 = u0Var.h;
                                            Bitmap bitmap4 = u0Var.f57361n;
                                            if (i0Var.f57229k == null) {
                                                i0Var.f57229k = new i1(bitmap3);
                                            }
                                            if (i0Var.D == null) {
                                                i0Var.D = new i1(bitmap4);
                                            }
                                            if (i0Var.G && i0Var.f57230l == null) {
                                                i0Var.f57230l = new i1(i0Var.A);
                                            }
                                            jc.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (s2.f26723a) {
                                            n10.v(this.f57338b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (s2.f26723a) {
                                a8.d("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f57341f = z10;
            super.run();
        }
    }
}
