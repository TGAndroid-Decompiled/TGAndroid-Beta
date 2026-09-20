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
import org.telegram.messenger.rk;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.uv0;
import w7.o6;
public final class c1 extends DispatchQueue {
    public final SurfaceTexture f41114a;
    public EGL10 f41115b;
    public EGLDisplay f41116c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f41117f;
    public volatile boolean h;
    public int f41118n;
    public int f41119r;
    public b1 f41120s;
    public final ia v;
    public final p8.b f41121w;
    public final b1 f41122x;
    public final e1 f41123y;

    public c1(e1 e1Var, SurfaceTexture surfaceTexture, ia iaVar) {
        super("CanvasInternal");
        this.f41123y = e1Var;
        this.f41121w = new p8.b(this, 1);
        this.f41122x = new b1(this, 0);
        this.v = iaVar;
        this.f41114a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (!c1Var.f41117f) {
            return;
        }
        if (c1Var.d.equals(c1Var.f41115b.eglGetCurrentContext()) && c1Var.e.equals(c1Var.f41115b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = c1Var.f41115b;
        EGLDisplay eGLDisplay = c1Var.f41116c;
        EGLSurface eGLSurface = c1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
    }

    public final void finish() {
        ia iaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f41115b;
            EGLDisplay eGLDisplay = this.f41116c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f41115b.eglDestroySurface(this.f41116c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (iaVar != null) {
                synchronized (iaVar.f24973f) {
                    try {
                        if (iaVar.f24974g == eGLContext) {
                            iaVar.f24974g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f41115b.eglDestroyContext(this.f41116c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f41116c;
        if (eGLDisplay2 != null) {
            this.f41115b.eglTerminate(eGLDisplay2);
            this.f41116c = null;
        }
        if (iaVar != null) {
            b1 b1Var = this.f41122x;
            ArrayList arrayList = iaVar.e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && iaVar.d.isEmpty()) {
                iaVar.f24980n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        e1 e1Var = this.f41123y;
        Bitmap bitmap2 = e1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f41114a;
            ia iaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f41115b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f41116c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    rk.u(this.f41115b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f41115b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        rk.u(this.f41115b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f41115b.eglChooseConfig(this.f41116c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            rk.u(this.f41115b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (iaVar != null) {
                                synchronized (iaVar.f24973f) {
                                    try {
                                        eGLContext = iaVar.f24974g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f41115b.eglCreateContext(this.f41116c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    rk.u(this.f41115b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (iaVar != null) {
                                    iaVar.a(eglCreateContext);
                                    iaVar.e.add(this.f41122x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f41115b.eglCreateWindowSurface(this.f41116c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f41115b.eglMakeCurrent(this.f41116c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                rk.u(this.f41115b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = e1Var.f41150c;
                                            s0Var.getClass();
                                            Map map = g1.f41163a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : g1.f41163a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f41161b = new HashMap();
                                                obj.f41160a = GLES20.glCreateProgram();
                                                b2.q0 b10 = f1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3203a;
                                                if (b10.f3204b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    f1.c(i11, i10, obj.f41160a);
                                                } else {
                                                    b2.q0 b11 = f1.b(35632, str);
                                                    int i12 = b11.f3203a;
                                                    if (b11.f3204b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        f1.c(i11, i12, obj.f41160a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f41160a, i11);
                                                        GLES20.glAttachShader(obj.f41160a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f41160a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f41160a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            f1.c(i11, i12, obj.f41160a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f41161b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f41160a, str2)));
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
                                            s0Var.f41275r = DesugarCollections.unmodifiableMap(hashMap);
                                            uv0 uv0Var = s0Var.f41265g;
                                            if (e1Var.h.getWidth() != uv0Var.f28868a || e1Var.h.getHeight() != uv0Var.f28869b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) uv0Var.f28868a, (int) uv0Var.f28869b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, uv0Var.f28868a, uv0Var.f28869b), (Paint) null);
                                                e1Var.h = createBitmap;
                                                e1Var.f41153r = true;
                                            }
                                            if (e1Var.f41152n != null && (bitmap.getWidth() != uv0Var.f28868a || e1Var.f41152n.getHeight() != uv0Var.f28869b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) uv0Var.f28868a, (int) uv0Var.f28869b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e1Var.f41152n, (Rect) null, new RectF(0.0f, 0.0f, uv0Var.f28868a, uv0Var.f28869b), (Paint) null);
                                                e1Var.f41152n = createBitmap2;
                                                e1Var.f41153r = true;
                                            }
                                            Bitmap bitmap3 = e1Var.h;
                                            Bitmap bitmap4 = e1Var.f41152n;
                                            if (s0Var.f41268k == null) {
                                                s0Var.f41268k = new t1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new t1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f41269l == null) {
                                                s0Var.f41269l = new t1(s0Var.A);
                                            }
                                            o6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            rk.u(this.f41115b, new StringBuilder("createWindowSurface failed "));
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
            this.f41117f = z10;
            super.run();
        }
    }
}
