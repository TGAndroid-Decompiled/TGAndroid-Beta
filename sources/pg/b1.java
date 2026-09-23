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
import org.telegram.messenger.ul;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jv0;
import w7.m6;
public final class b1 extends DispatchQueue {
    public final SurfaceTexture f40763a;
    public EGL10 f40764b;
    public EGLDisplay f40765c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f40766f;
    public volatile boolean h;
    public int f40767n;
    public int f40768r;
    public a1 f40769s;
    public final ja v;
    public final l7 f40770w;
    public final a1 f40771x;
    public final d1 f40772y;

    public b1(d1 d1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f40772y = d1Var;
        this.f40770w = new l7(this, 29);
        this.f40771x = new a1(this, 0);
        this.v = jaVar;
        this.f40763a = surfaceTexture;
    }

    public static void b(b1 b1Var) {
        if (!b1Var.f40766f) {
            return;
        }
        if (b1Var.d.equals(b1Var.f40764b.eglGetCurrentContext()) && b1Var.e.equals(b1Var.f40764b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = b1Var.f40764b;
        EGLDisplay eGLDisplay = b1Var.f40765c;
        EGLSurface eGLSurface = b1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f40764b;
            EGLDisplay eGLDisplay = this.f40765c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f40764b.eglDestroySurface(this.f40765c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f25231f) {
                    try {
                        if (jaVar.f25232g == eGLContext) {
                            jaVar.f25232g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f40764b.eglDestroyContext(this.f40765c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f40765c;
        if (eGLDisplay2 != null) {
            this.f40764b.eglTerminate(eGLDisplay2);
            this.f40765c = null;
        }
        if (jaVar != null) {
            a1 a1Var = this.f40771x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(a1Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f25238n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        d1 d1Var = this.f40772y;
        Bitmap bitmap2 = d1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f40763a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f40764b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f40765c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    ul.t(this.f40764b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f40764b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        ul.t(this.f40764b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f40764b.eglChooseConfig(this.f40765c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            ul.t(this.f40764b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f25231f) {
                                    try {
                                        eGLContext = jaVar.f25232g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f40764b.eglCreateContext(this.f40765c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    ul.t(this.f40764b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.e.add(this.f40771x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f40764b.eglCreateWindowSurface(this.f40765c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f40764b.eglMakeCurrent(this.f40765c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                ul.t(this.f40764b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            r0 r0Var = d1Var.f40801c;
                                            r0Var.getClass();
                                            Map map = f1.f40814a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : f1.f40814a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f40811b = new HashMap();
                                                obj.f40810a = GLES20.glCreateProgram();
                                                b2.q0 b10 = e1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3195a;
                                                if (b10.f3196b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    e1.c(i11, i10, obj.f40810a);
                                                } else {
                                                    b2.q0 b11 = e1.b(35632, str);
                                                    int i12 = b11.f3195a;
                                                    if (b11.f3196b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        e1.c(i11, i12, obj.f40810a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f40810a, i11);
                                                        GLES20.glAttachShader(obj.f40810a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f40810a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f40810a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            e1.c(i11, i12, obj.f40810a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f40811b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f40810a, str2)));
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
                                            r0Var.f40919r = DesugarCollections.unmodifiableMap(hashMap);
                                            jv0 jv0Var = r0Var.f40909g;
                                            if (d1Var.h.getWidth() != jv0Var.f25428a || d1Var.h.getHeight() != jv0Var.f25429b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) jv0Var.f25428a, (int) jv0Var.f25429b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(d1Var.h, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f25428a, jv0Var.f25429b), (Paint) null);
                                                d1Var.h = createBitmap;
                                                d1Var.f40804r = true;
                                            }
                                            if (d1Var.f40803n != null && (bitmap.getWidth() != jv0Var.f25428a || d1Var.f40803n.getHeight() != jv0Var.f25429b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) jv0Var.f25428a, (int) jv0Var.f25429b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(d1Var.f40803n, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f25428a, jv0Var.f25429b), (Paint) null);
                                                d1Var.f40803n = createBitmap2;
                                                d1Var.f40804r = true;
                                            }
                                            Bitmap bitmap3 = d1Var.h;
                                            Bitmap bitmap4 = d1Var.f40803n;
                                            if (r0Var.f40912k == null) {
                                                r0Var.f40912k = new s1(bitmap3);
                                            }
                                            if (r0Var.D == null) {
                                                r0Var.D = new s1(bitmap4);
                                            }
                                            if (r0Var.G && r0Var.f40913l == null) {
                                                r0Var.f40913l = new s1(r0Var.A);
                                            }
                                            m6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            ul.t(this.f40764b, new StringBuilder("createWindowSurface failed "));
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
            this.f40766f = z10;
            super.run();
        }
    }
}
