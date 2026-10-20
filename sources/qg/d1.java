package qg;

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
import org.telegram.messenger.mk;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.ja;
import w7.q6;
public final class d1 extends DispatchQueue {
    public final SurfaceTexture f44487a;
    public EGL10 f44488b;
    public EGLDisplay f44489c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f44490f;
    public volatile boolean h;
    public int f44491n;
    public int f44492r;
    public c1 f44493s;
    public final ja v;
    public final p8.b f44494w;
    public final c1 f44495x;
    public final f1 f44496y;

    public d1(f1 f1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f44496y = f1Var;
        this.f44494w = new p8.b(this, 1);
        this.f44495x = new c1(this, 0);
        this.v = jaVar;
        this.f44487a = surfaceTexture;
    }

    public static void b(d1 d1Var) {
        if (!d1Var.f44490f) {
            return;
        }
        if (d1Var.d.equals(d1Var.f44488b.eglGetCurrentContext()) && d1Var.e.equals(d1Var.f44488b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = d1Var.f44488b;
        EGLDisplay eGLDisplay = d1Var.f44489c;
        EGLSurface eGLSurface = d1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, d1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f44488b;
            EGLDisplay eGLDisplay = this.f44489c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f44488b.eglDestroySurface(this.f44489c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f27476f) {
                    try {
                        if (jaVar.f27477g == eGLContext) {
                            jaVar.f27477g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f44488b.eglDestroyContext(this.f44489c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f44489c;
        if (eGLDisplay2 != null) {
            this.f44488b.eglTerminate(eGLDisplay2);
            this.f44489c = null;
        }
        if (jaVar != null) {
            c1 c1Var = this.f44495x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(c1Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f27483n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        f1 f1Var = this.f44496y;
        Bitmap bitmap2 = f1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f44487a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f44488b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f44489c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    mk.v(this.f44488b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f44488b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        mk.v(this.f44488b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f44488b.eglChooseConfig(this.f44489c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            mk.v(this.f44488b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f27476f) {
                                    try {
                                        eGLContext = jaVar.f27477g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f44488b.eglCreateContext(this.f44489c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    mk.v(this.f44488b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.e.add(this.f44495x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f44488b.eglCreateWindowSurface(this.f44489c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f44488b.eglMakeCurrent(this.f44489c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                mk.v(this.f44488b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            t0 t0Var = f1Var.f44522c;
                                            t0Var.getClass();
                                            Map map = h1.f44536a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : h1.f44536a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f44533b = new HashMap();
                                                obj.f44532a = GLES20.glCreateProgram();
                                                b2.u0 b10 = g1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f4053a;
                                                if (b10.f4054b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    g1.c(i11, i10, obj.f44532a);
                                                } else {
                                                    b2.u0 b11 = g1.b(35632, str);
                                                    int i12 = b11.f4053a;
                                                    if (b11.f4054b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        g1.c(i11, i12, obj.f44532a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f44532a, i11);
                                                        GLES20.glAttachShader(obj.f44532a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f44532a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f44532a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            g1.c(i11, i12, obj.f44532a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f44533b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f44532a, str2)));
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
                                            t0Var.f44649r = DesugarCollections.unmodifiableMap(hashMap);
                                            fw0 fw0Var = t0Var.f44639g;
                                            if (f1Var.h.getWidth() != fw0Var.f26428a || f1Var.h.getHeight() != fw0Var.f26429b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) fw0Var.f26428a, (int) fw0Var.f26429b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(f1Var.h, (Rect) null, new RectF(0.0f, 0.0f, fw0Var.f26428a, fw0Var.f26429b), (Paint) null);
                                                f1Var.h = createBitmap;
                                                f1Var.f44525r = true;
                                            }
                                            if (f1Var.f44524n != null && (bitmap.getWidth() != fw0Var.f26428a || f1Var.f44524n.getHeight() != fw0Var.f26429b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) fw0Var.f26428a, (int) fw0Var.f26429b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(f1Var.f44524n, (Rect) null, new RectF(0.0f, 0.0f, fw0Var.f26428a, fw0Var.f26429b), (Paint) null);
                                                f1Var.f44524n = createBitmap2;
                                                f1Var.f44525r = true;
                                            }
                                            Bitmap bitmap3 = f1Var.h;
                                            Bitmap bitmap4 = f1Var.f44524n;
                                            if (t0Var.f44642k == null) {
                                                t0Var.f44642k = new u1(bitmap3);
                                            }
                                            if (t0Var.D == null) {
                                                t0Var.D = new u1(bitmap4);
                                            }
                                            if (t0Var.G && t0Var.f44643l == null) {
                                                t0Var.f44643l = new u1(t0Var.A);
                                            }
                                            q6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            mk.v(this.f44488b, new StringBuilder("createWindowSurface failed "));
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
            this.f44490f = z10;
            super.run();
        }
    }
}
