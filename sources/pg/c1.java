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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Wallet.o5;
import w7.m6;
public final class c1 extends DispatchQueue {
    public final SurfaceTexture f45642a;
    public EGL10 f45643b;
    public EGLDisplay f45644c;
    public EGLContext d;
    public EGLSurface f45645e;
    public boolean f45646f;
    public volatile boolean h;
    public int f45647n;
    public int f45648r;
    public b1 f45649s;
    public final ma v;
    public final o5 f45650w;
    public final b1 f45651x;
    public final e1 f45652y;

    public c1(e1 e1Var, SurfaceTexture surfaceTexture, ma maVar) {
        super("CanvasInternal");
        this.f45652y = e1Var;
        this.f45650w = new o5(this, 3);
        this.f45651x = new b1(this, 0);
        this.v = maVar;
        this.f45642a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (!c1Var.f45646f) {
            return;
        }
        if (c1Var.d.equals(c1Var.f45643b.eglGetCurrentContext()) && c1Var.f45645e.equals(c1Var.f45643b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = c1Var.f45643b;
        EGLDisplay eGLDisplay = c1Var.f45644c;
        EGLSurface eGLSurface = c1Var.f45645e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
    }

    public final void finish() {
        ma maVar = this.v;
        if (this.f45645e != null) {
            EGL10 egl10 = this.f45643b;
            EGLDisplay eGLDisplay = this.f45644c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f45643b.eglDestroySurface(this.f45644c, this.f45645e);
            this.f45645e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (maVar != null) {
                synchronized (maVar.f28741f) {
                    try {
                        if (maVar.f28742g == eGLContext) {
                            maVar.f28742g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f45643b.eglDestroyContext(this.f45644c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f45644c;
        if (eGLDisplay2 != null) {
            this.f45643b.eglTerminate(eGLDisplay2);
            this.f45644c = null;
        }
        if (maVar != null) {
            b1 b1Var = this.f45651x;
            ArrayList arrayList = maVar.f28740e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && maVar.d.isEmpty()) {
                maVar.f28748n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        e1 e1Var = this.f45652y;
        Bitmap bitmap2 = e1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f45642a;
            ma maVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f45643b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f45644c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    bi.v(this.f45643b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f45643b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        bi.v(this.f45643b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f45643b.eglChooseConfig(this.f45644c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            bi.v(this.f45643b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (maVar != null) {
                                synchronized (maVar.f28741f) {
                                    try {
                                        eGLContext = maVar.f28742g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f45643b.eglCreateContext(this.f45644c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    bi.v(this.f45643b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (maVar != null) {
                                    maVar.a(eglCreateContext);
                                    maVar.f28740e.add(this.f45651x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f45643b.eglCreateWindowSurface(this.f45644c, eGLConfig, surfaceTexture, null);
                                    this.f45645e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f45643b.eglMakeCurrent(this.f45644c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                bi.v(this.f45643b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = e1Var.f45679c;
                                            s0Var.getClass();
                                            Map map = g1.f45693a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : g1.f45693a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f45691b = new HashMap();
                                                obj.f45690a = GLES20.glCreateProgram();
                                                b2.q0 b10 = f1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3533a;
                                                if (b10.f3534b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    f1.c(i11, i10, obj.f45690a);
                                                } else {
                                                    b2.q0 b11 = f1.b(35632, str);
                                                    int i12 = b11.f3533a;
                                                    if (b11.f3534b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        f1.c(i11, i12, obj.f45690a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f45690a, i11);
                                                        GLES20.glAttachShader(obj.f45690a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f45690a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f45690a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            f1.c(i11, i12, obj.f45690a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f45691b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f45690a, str2)));
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
                                            s0Var.f45814r = DesugarCollections.unmodifiableMap(hashMap);
                                            nw0 nw0Var = s0Var.f45804g;
                                            if (e1Var.h.getWidth() != nw0Var.f29260a || e1Var.h.getHeight() != nw0Var.f29261b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) nw0Var.f29260a, (int) nw0Var.f29261b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, nw0Var.f29260a, nw0Var.f29261b), (Paint) null);
                                                e1Var.h = createBitmap;
                                                e1Var.f45683r = true;
                                            }
                                            if (e1Var.f45682n != null && (bitmap.getWidth() != nw0Var.f29260a || e1Var.f45682n.getHeight() != nw0Var.f29261b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) nw0Var.f29260a, (int) nw0Var.f29261b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e1Var.f45682n, (Rect) null, new RectF(0.0f, 0.0f, nw0Var.f29260a, nw0Var.f29261b), (Paint) null);
                                                e1Var.f45682n = createBitmap2;
                                                e1Var.f45683r = true;
                                            }
                                            Bitmap bitmap3 = e1Var.h;
                                            Bitmap bitmap4 = e1Var.f45682n;
                                            if (s0Var.f45807k == null) {
                                                s0Var.f45807k = new t1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new t1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f45808l == null) {
                                                s0Var.f45808l = new t1(s0Var.A);
                                            }
                                            m6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            bi.v(this.f45643b, new StringBuilder("createWindowSurface failed "));
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
            this.f45646f = z10;
            super.run();
        }
    }
}
