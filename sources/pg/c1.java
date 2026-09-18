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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.vv0;
import w7.n6;
public final class c1 extends DispatchQueue {
    public final SurfaceTexture f41073a;
    public EGL10 f41074b;
    public EGLDisplay f41075c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f41076f;
    public volatile boolean h;
    public int f41077n;
    public int f41078r;
    public b1 f41079s;
    public final ja v;
    public final p8.b f41080w;
    public final b1 f41081x;
    public final e1 f41082y;

    public c1(e1 e1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f41082y = e1Var;
        this.f41080w = new p8.b(this, 1);
        this.f41081x = new b1(this, 0);
        this.v = jaVar;
        this.f41073a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (!c1Var.f41076f) {
            return;
        }
        if (c1Var.d.equals(c1Var.f41074b.eglGetCurrentContext()) && c1Var.e.equals(c1Var.f41074b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = c1Var.f41074b;
        EGLDisplay eGLDisplay = c1Var.f41075c;
        EGLSurface eGLSurface = c1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f41074b;
            EGLDisplay eGLDisplay = this.f41075c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f41074b.eglDestroySurface(this.f41075c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f25274f) {
                    try {
                        if (jaVar.f25275g == eGLContext) {
                            jaVar.f25275g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f41074b.eglDestroyContext(this.f41075c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f41075c;
        if (eGLDisplay2 != null) {
            this.f41074b.eglTerminate(eGLDisplay2);
            this.f41075c = null;
        }
        if (jaVar != null) {
            b1 b1Var = this.f41081x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f25281n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        e1 e1Var = this.f41082y;
        Bitmap bitmap2 = e1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f41073a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f41074b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f41075c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    wh.t(this.f41074b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f41074b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        wh.t(this.f41074b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f41074b.eglChooseConfig(this.f41075c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            wh.t(this.f41074b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f25274f) {
                                    try {
                                        eGLContext = jaVar.f25275g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f41074b.eglCreateContext(this.f41075c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    wh.t(this.f41074b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.e.add(this.f41081x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f41074b.eglCreateWindowSurface(this.f41075c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f41074b.eglMakeCurrent(this.f41075c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                wh.t(this.f41074b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = e1Var.f41109c;
                                            s0Var.getClass();
                                            Map map = g1.f41122a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : g1.f41122a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f41120b = new HashMap();
                                                obj.f41119a = GLES20.glCreateProgram();
                                                b2.q0 b10 = f1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3203a;
                                                if (b10.f3204b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    f1.c(i11, i10, obj.f41119a);
                                                } else {
                                                    b2.q0 b11 = f1.b(35632, str);
                                                    int i12 = b11.f3203a;
                                                    if (b11.f3204b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        f1.c(i11, i12, obj.f41119a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f41119a, i11);
                                                        GLES20.glAttachShader(obj.f41119a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f41119a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f41119a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            f1.c(i11, i12, obj.f41119a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f41120b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f41119a, str2)));
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
                                            s0Var.f41234r = DesugarCollections.unmodifiableMap(hashMap);
                                            vv0 vv0Var = s0Var.f41224g;
                                            if (e1Var.h.getWidth() != vv0Var.f29776a || e1Var.h.getHeight() != vv0Var.f29777b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) vv0Var.f29776a, (int) vv0Var.f29777b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, vv0Var.f29776a, vv0Var.f29777b), (Paint) null);
                                                e1Var.h = createBitmap;
                                                e1Var.f41112r = true;
                                            }
                                            if (e1Var.f41111n != null && (bitmap.getWidth() != vv0Var.f29776a || e1Var.f41111n.getHeight() != vv0Var.f29777b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) vv0Var.f29776a, (int) vv0Var.f29777b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e1Var.f41111n, (Rect) null, new RectF(0.0f, 0.0f, vv0Var.f29776a, vv0Var.f29777b), (Paint) null);
                                                e1Var.f41111n = createBitmap2;
                                                e1Var.f41112r = true;
                                            }
                                            Bitmap bitmap3 = e1Var.h;
                                            Bitmap bitmap4 = e1Var.f41111n;
                                            if (s0Var.f41227k == null) {
                                                s0Var.f41227k = new t1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new t1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f41228l == null) {
                                                s0Var.f41228l = new t1(s0Var.A);
                                            }
                                            n6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            wh.t(this.f41074b, new StringBuilder("createWindowSurface failed "));
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
            this.f41076f = z10;
            super.run();
        }
    }
}
