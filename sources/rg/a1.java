package rg;

import a8.yf;
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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.rw0;
public final class a1 extends DispatchQueue {
    public final SurfaceTexture f47394a;
    public EGL10 f47395b;
    public EGLDisplay f47396c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f47397f;
    public volatile boolean h;
    public int f47398n;
    public int f47399r;
    public z0 f47400s;
    public final la v;
    public final dy0 f47401w;
    public final z0 f47402x;
    public final c1 f47403y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, la laVar) {
        super("CanvasInternal");
        this.f47403y = c1Var;
        this.f47401w = new dy0(this, 10);
        this.f47402x = new z0(this, 0);
        this.v = laVar;
        this.f47394a = surfaceTexture;
    }

    public static void b(a1 a1Var) {
        if (!a1Var.f47397f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f47395b.eglGetCurrentContext()) && a1Var.e.equals(a1Var.f47395b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f47395b;
        EGLDisplay eGLDisplay = a1Var.f47396c;
        EGLSurface eGLSurface = a1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        la laVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f47395b;
            EGLDisplay eGLDisplay = this.f47396c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f47395b.eglDestroySurface(this.f47396c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (laVar != null) {
                synchronized (laVar.f30204f) {
                    try {
                        if (laVar.f30205g == eGLContext) {
                            laVar.f30205g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f47395b.eglDestroyContext(this.f47396c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f47396c;
        if (eGLDisplay2 != null) {
            this.f47395b.eglTerminate(eGLDisplay2);
            this.f47396c = null;
        }
        if (laVar != null) {
            z0 z0Var = this.f47402x;
            ArrayList arrayList = laVar.e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && laVar.d.isEmpty()) {
                laVar.f30211n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        c1 c1Var = this.f47403y;
        Bitmap bitmap2 = c1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f47394a;
            la laVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f47395b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f47396c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    wh.t(this.f47395b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f47395b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        wh.t(this.f47395b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f47395b.eglChooseConfig(this.f47396c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            wh.t(this.f47395b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (laVar != null) {
                                synchronized (laVar.f30204f) {
                                    try {
                                        eGLContext = laVar.f30205g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f47395b.eglCreateContext(this.f47396c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    wh.t(this.f47395b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (laVar != null) {
                                    laVar.a(eglCreateContext);
                                    laVar.e.add(this.f47402x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f47395b.eglCreateWindowSurface(this.f47396c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f47395b.eglMakeCurrent(this.f47396c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                wh.t(this.f47395b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f47412c;
                                            q0Var.getClass();
                                            Map map = e1.f47448a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f47448a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f47425b = new HashMap();
                                                obj.f47424a = GLES20.glCreateProgram();
                                                b2.v0 b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3511a;
                                                if (b10.f3512b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i11, i10, obj.f47424a);
                                                } else {
                                                    b2.v0 b11 = d1.b(35632, str);
                                                    int i12 = b11.f3511a;
                                                    if (b11.f3512b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i11, i12, obj.f47424a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f47424a, i11);
                                                        GLES20.glAttachShader(obj.f47424a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f47424a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f47424a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            d1.c(i11, i12, obj.f47424a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f47425b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f47424a, str2)));
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
                                            q0Var.f47552r = DesugarCollections.unmodifiableMap(hashMap);
                                            rw0 rw0Var = q0Var.f47542g;
                                            if (c1Var.h.getWidth() != rw0Var.f32392a || c1Var.h.getHeight() != rw0Var.f32393b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) rw0Var.f32392a, (int) rw0Var.f32393b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, rw0Var.f32392a, rw0Var.f32393b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f47415r = true;
                                            }
                                            if (c1Var.f47414n != null && (bitmap.getWidth() != rw0Var.f32392a || c1Var.f47414n.getHeight() != rw0Var.f32393b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) rw0Var.f32392a, (int) rw0Var.f32393b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f47414n, (Rect) null, new RectF(0.0f, 0.0f, rw0Var.f32392a, rw0Var.f32393b), (Paint) null);
                                                c1Var.f47414n = createBitmap2;
                                                c1Var.f47415r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f47414n;
                                            if (q0Var.f47545k == null) {
                                                q0Var.f47545k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f47546l == null) {
                                                q0Var.f47546l = new r1(q0Var.A);
                                            }
                                            yf.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            wh.t(this.f47395b, new StringBuilder("createWindowSurface failed "));
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
            this.f47397f = z10;
            super.run();
        }
    }
}
