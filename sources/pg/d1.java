package pg;

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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.wv0;
import w7.n6;
public final class d1 extends DispatchQueue {
    public final SurfaceTexture f41091a;
    public EGL10 f41092b;
    public EGLDisplay f41093c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f41094f;
    public volatile boolean h;
    public int f41095n;
    public int f41096r;
    public b1 f41097s;
    public final ja v;
    public final c1 f41098w;
    public final b1 f41099x;
    public final f1 f41100y;

    public d1(f1 f1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f41100y = f1Var;
        this.f41098w = new c1(this, 0);
        this.f41099x = new b1(this, 0);
        this.v = jaVar;
        this.f41091a = surfaceTexture;
    }

    public static void b(d1 d1Var) {
        if (!d1Var.f41094f) {
            return;
        }
        if (d1Var.d.equals(d1Var.f41092b.eglGetCurrentContext()) && d1Var.e.equals(d1Var.f41092b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = d1Var.f41092b;
        EGLDisplay eGLDisplay = d1Var.f41093c;
        EGLSurface eGLSurface = d1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, d1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f41092b;
            EGLDisplay eGLDisplay = this.f41093c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f41092b.eglDestroySurface(this.f41093c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f25394f) {
                    try {
                        if (jaVar.f25395g == eGLContext) {
                            jaVar.f25395g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f41092b.eglDestroyContext(this.f41093c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f41093c;
        if (eGLDisplay2 != null) {
            this.f41092b.eglTerminate(eGLDisplay2);
            this.f41093c = null;
        }
        if (jaVar != null) {
            b1 b1Var = this.f41099x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f25401n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        f1 f1Var = this.f41100y;
        Bitmap bitmap2 = f1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f41091a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f41092b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f41093c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    ok.u(this.f41092b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f41092b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        ok.u(this.f41092b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f41092b.eglChooseConfig(this.f41093c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            ok.u(this.f41092b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f25394f) {
                                    try {
                                        eGLContext = jaVar.f25395g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f41092b.eglCreateContext(this.f41093c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    ok.u(this.f41092b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.e.add(this.f41099x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f41092b.eglCreateWindowSurface(this.f41093c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f41092b.eglMakeCurrent(this.f41093c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                ok.u(this.f41092b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = f1Var.f41127c;
                                            s0Var.getClass();
                                            Map map = h1.f41141a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : h1.f41141a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f41137b = new HashMap();
                                                obj.f41136a = GLES20.glCreateProgram();
                                                b2.q0 b10 = g1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3195a;
                                                if (b10.f3196b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    g1.c(i11, i10, obj.f41136a);
                                                } else {
                                                    b2.q0 b11 = g1.b(35632, str);
                                                    int i12 = b11.f3195a;
                                                    if (b11.f3196b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        g1.c(i11, i12, obj.f41136a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f41136a, i11);
                                                        GLES20.glAttachShader(obj.f41136a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f41136a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f41136a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            g1.c(i11, i12, obj.f41136a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f41137b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f41136a, str2)));
                                                            }
                                                            if (i11 != 0) {
                                                                GLES20.glDeleteShader(i11);
                                                            }
                                                            if (i12 != 0) {
                                                                GLES20.glDeleteShader(i12);
                                                            }
                                                        }
                                                    }
                                                }
                                                hashMap.put((String) entry.getKey(), obj);
                                                i10 = 0;
                                            }
                                            s0Var.f41237r = DesugarCollections.unmodifiableMap(hashMap);
                                            wv0 wv0Var = s0Var.f41227g;
                                            if (f1Var.h.getWidth() != wv0Var.f30182a || f1Var.h.getHeight() != wv0Var.f30183b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) wv0Var.f30182a, (int) wv0Var.f30183b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(f1Var.h, (Rect) null, new RectF(0.0f, 0.0f, wv0Var.f30182a, wv0Var.f30183b), (Paint) null);
                                                f1Var.h = createBitmap;
                                                f1Var.f41130r = true;
                                            }
                                            if (f1Var.f41129n != null && (bitmap.getWidth() != wv0Var.f30182a || f1Var.f41129n.getHeight() != wv0Var.f30183b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) wv0Var.f30182a, (int) wv0Var.f30183b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(f1Var.f41129n, (Rect) null, new RectF(0.0f, 0.0f, wv0Var.f30182a, wv0Var.f30183b), (Paint) null);
                                                f1Var.f41129n = createBitmap2;
                                                f1Var.f41130r = true;
                                            }
                                            Bitmap bitmap3 = f1Var.h;
                                            Bitmap bitmap4 = f1Var.f41129n;
                                            if (s0Var.f41230k == null) {
                                                s0Var.f41230k = new u1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new u1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f41231l == null) {
                                                s0Var.f41231l = new u1(s0Var.A);
                                            }
                                            n6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            ok.u(this.f41092b, new StringBuilder("createWindowSurface failed "));
                                        }
                                        finish();
                                    }
                                } else {
                                    finish();
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("eglConfig not initialized");
                            }
                            finish();
                        }
                        z10 = false;
                    }
                }
            }
            this.f41094f = z10;
            super.run();
        }
    }
}
