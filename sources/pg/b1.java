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
import org.telegram.messenger.am;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.sw0;
import w7.l6;
public final class b1 extends DispatchQueue {
    public final SurfaceTexture f45476a;
    public EGL10 f45477b;
    public EGLDisplay f45478c;
    public EGLContext d;
    public EGLSurface f45479e;
    public boolean f45480f;
    public volatile boolean h;
    public int f45481n;
    public int f45482r;
    public a1 f45483s;
    public final la v;
    public final p4.t0 f45484w;
    public final a1 f45485x;
    public final d1 f45486y;

    public b1(d1 d1Var, SurfaceTexture surfaceTexture, la laVar) {
        super("CanvasInternal");
        this.f45486y = d1Var;
        this.f45484w = new p4.t0(this, 2);
        this.f45485x = new a1(this, 0);
        this.v = laVar;
        this.f45476a = surfaceTexture;
    }

    public static void b(b1 b1Var) {
        if (!b1Var.f45480f) {
            return;
        }
        if (b1Var.d.equals(b1Var.f45477b.eglGetCurrentContext()) && b1Var.f45479e.equals(b1Var.f45477b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = b1Var.f45477b;
        EGLDisplay eGLDisplay = b1Var.f45478c;
        EGLSurface eGLSurface = b1Var.f45479e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b1Var.d);
    }

    public final void finish() {
        la laVar = this.v;
        if (this.f45479e != null) {
            EGL10 egl10 = this.f45477b;
            EGLDisplay eGLDisplay = this.f45478c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f45477b.eglDestroySurface(this.f45478c, this.f45479e);
            this.f45479e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (laVar != null) {
                synchronized (laVar.f28136f) {
                    try {
                        if (laVar.f28137g == eGLContext) {
                            laVar.f28137g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f45477b.eglDestroyContext(this.f45478c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f45478c;
        if (eGLDisplay2 != null) {
            this.f45477b.eglTerminate(eGLDisplay2);
            this.f45478c = null;
        }
        if (laVar != null) {
            a1 a1Var = this.f45485x;
            ArrayList arrayList = laVar.f28135e;
            arrayList.remove(a1Var);
            if (arrayList.isEmpty() && laVar.d.isEmpty()) {
                laVar.f28143n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        d1 d1Var = this.f45486y;
        Bitmap bitmap2 = d1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f45476a;
            la laVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f45477b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f45478c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    am.v(this.f45477b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f45477b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        am.v(this.f45477b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f45477b.eglChooseConfig(this.f45478c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            am.v(this.f45477b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (laVar != null) {
                                synchronized (laVar.f28136f) {
                                    try {
                                        eGLContext = laVar.f28137g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f45477b.eglCreateContext(this.f45478c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    am.v(this.f45477b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (laVar != null) {
                                    laVar.a(eglCreateContext);
                                    laVar.f28135e.add(this.f45485x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f45477b.eglCreateWindowSurface(this.f45478c, eGLConfig, surfaceTexture, null);
                                    this.f45479e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f45477b.eglMakeCurrent(this.f45478c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                am.v(this.f45477b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            r0 r0Var = d1Var.f45517c;
                                            r0Var.getClass();
                                            Map map = f1.f45531a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : f1.f45531a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f45528b = new HashMap();
                                                obj.f45527a = GLES20.glCreateProgram();
                                                b2.q0 b10 = e1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3531a;
                                                if (b10.f3532b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    e1.c(i11, i10, obj.f45527a);
                                                } else {
                                                    b2.q0 b11 = e1.b(35632, str);
                                                    int i12 = b11.f3531a;
                                                    if (b11.f3532b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        e1.c(i11, i12, obj.f45527a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f45527a, i11);
                                                        GLES20.glAttachShader(obj.f45527a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f45527a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f45527a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            e1.c(i11, i12, obj.f45527a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f45528b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f45527a, str2)));
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
                                            r0Var.f45643r = DesugarCollections.unmodifiableMap(hashMap);
                                            sw0 sw0Var = r0Var.f45633g;
                                            if (d1Var.h.getWidth() != sw0Var.f30696a || d1Var.h.getHeight() != sw0Var.f30697b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) sw0Var.f30696a, (int) sw0Var.f30697b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(d1Var.h, (Rect) null, new RectF(0.0f, 0.0f, sw0Var.f30696a, sw0Var.f30697b), (Paint) null);
                                                d1Var.h = createBitmap;
                                                d1Var.f45521r = true;
                                            }
                                            if (d1Var.f45520n != null && (bitmap.getWidth() != sw0Var.f30696a || d1Var.f45520n.getHeight() != sw0Var.f30697b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) sw0Var.f30696a, (int) sw0Var.f30697b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(d1Var.f45520n, (Rect) null, new RectF(0.0f, 0.0f, sw0Var.f30696a, sw0Var.f30697b), (Paint) null);
                                                d1Var.f45520n = createBitmap2;
                                                d1Var.f45521r = true;
                                            }
                                            Bitmap bitmap3 = d1Var.h;
                                            Bitmap bitmap4 = d1Var.f45520n;
                                            if (r0Var.f45636k == null) {
                                                r0Var.f45636k = new s1(bitmap3);
                                            }
                                            if (r0Var.D == null) {
                                                r0Var.D = new s1(bitmap4);
                                            }
                                            if (r0Var.G && r0Var.f45637l == null) {
                                                r0Var.f45637l = new s1(r0Var.A);
                                            }
                                            l6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            am.v(this.f45477b, new StringBuilder("createWindowSurface failed "));
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
            this.f45480f = z10;
            super.run();
        }
    }
}
