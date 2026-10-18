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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ja;
import w7.t6;
public final class c1 extends DispatchQueue {
    public final SurfaceTexture f44519a;
    public EGL10 f44520b;
    public EGLDisplay f44521c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f44522f;
    public volatile boolean h;
    public int f44523n;
    public int f44524r;
    public b1 f44525s;
    public final ja v;
    public final p4.s0 f44526w;
    public final b1 f44527x;
    public final e1 f44528y;

    public c1(e1 e1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f44528y = e1Var;
        this.f44526w = new p4.s0(this, 2);
        this.f44527x = new b1(this, 0);
        this.v = jaVar;
        this.f44519a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (!c1Var.f44522f) {
            return;
        }
        if (c1Var.d.equals(c1Var.f44520b.eglGetCurrentContext()) && c1Var.e.equals(c1Var.f44520b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = c1Var.f44520b;
        EGLDisplay eGLDisplay = c1Var.f44521c;
        EGLSurface eGLSurface = c1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f44520b;
            EGLDisplay eGLDisplay = this.f44521c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f44520b.eglDestroySurface(this.f44521c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f27486f) {
                    try {
                        if (jaVar.f27487g == eGLContext) {
                            jaVar.f27487g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f44520b.eglDestroyContext(this.f44521c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f44521c;
        if (eGLDisplay2 != null) {
            this.f44520b.eglTerminate(eGLDisplay2);
            this.f44521c = null;
        }
        if (jaVar != null) {
            b1 b1Var = this.f44527x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f27493n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        e1 e1Var = this.f44528y;
        Bitmap bitmap2 = e1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f44519a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f44520b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f44521c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    kk.v(this.f44520b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f44520b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        kk.v(this.f44520b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f44520b.eglChooseConfig(this.f44521c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            kk.v(this.f44520b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f27486f) {
                                    try {
                                        eGLContext = jaVar.f27487g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f44520b.eglCreateContext(this.f44521c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    kk.v(this.f44520b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.e.add(this.f44527x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f44520b.eglCreateWindowSurface(this.f44521c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f44520b.eglMakeCurrent(this.f44521c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                kk.v(this.f44520b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = e1Var.f44557c;
                                            s0Var.getClass();
                                            Map map = g1.f44571a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : g1.f44571a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f44568b = new HashMap();
                                                obj.f44567a = GLES20.glCreateProgram();
                                                b2.u0 b10 = f1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f4057a;
                                                if (b10.f4058b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    f1.c(i11, i10, obj.f44567a);
                                                } else {
                                                    b2.u0 b11 = f1.b(35632, str);
                                                    int i12 = b11.f4057a;
                                                    if (b11.f4058b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        f1.c(i11, i12, obj.f44567a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f44567a, i11);
                                                        GLES20.glAttachShader(obj.f44567a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f44567a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f44567a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            f1.c(i11, i12, obj.f44567a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f44568b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f44567a, str2)));
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
                                            s0Var.f44679r = DesugarCollections.unmodifiableMap(hashMap);
                                            dw0 dw0Var = s0Var.f44669g;
                                            if (e1Var.h.getWidth() != dw0Var.f25727a || e1Var.h.getHeight() != dw0Var.f25728b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) dw0Var.f25727a, (int) dw0Var.f25728b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, dw0Var.f25727a, dw0Var.f25728b), (Paint) null);
                                                e1Var.h = createBitmap;
                                                e1Var.f44560r = true;
                                            }
                                            if (e1Var.f44559n != null && (bitmap.getWidth() != dw0Var.f25727a || e1Var.f44559n.getHeight() != dw0Var.f25728b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) dw0Var.f25727a, (int) dw0Var.f25728b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e1Var.f44559n, (Rect) null, new RectF(0.0f, 0.0f, dw0Var.f25727a, dw0Var.f25728b), (Paint) null);
                                                e1Var.f44559n = createBitmap2;
                                                e1Var.f44560r = true;
                                            }
                                            Bitmap bitmap3 = e1Var.h;
                                            Bitmap bitmap4 = e1Var.f44559n;
                                            if (s0Var.f44672k == null) {
                                                s0Var.f44672k = new t1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new t1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f44673l == null) {
                                                s0Var.f44673l = new t1(s0Var.A);
                                            }
                                            t6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            kk.v(this.f44520b, new StringBuilder("createWindowSurface failed "));
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
            this.f44522f = z10;
            super.run();
        }
    }
}
