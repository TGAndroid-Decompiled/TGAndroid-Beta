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
import org.telegram.messenger.vl;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jv0;
import w7.m6;
public final class a1 extends DispatchQueue {
    public final SurfaceTexture f40803a;
    public EGL10 f40804b;
    public EGLDisplay f40805c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f40806f;
    public volatile boolean h;
    public int f40807n;
    public int f40808r;
    public z0 f40809s;
    public final ha v;
    public final l7 f40810w;
    public final z0 f40811x;
    public final c1 f40812y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, ha haVar) {
        super("CanvasInternal");
        this.f40812y = c1Var;
        this.f40810w = new l7(this, 29);
        this.f40811x = new z0(this, 0);
        this.v = haVar;
        this.f40803a = surfaceTexture;
    }

    public static void b(a1 a1Var) {
        if (!a1Var.f40806f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f40804b.eglGetCurrentContext()) && a1Var.e.equals(a1Var.f40804b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f40804b;
        EGLDisplay eGLDisplay = a1Var.f40805c;
        EGLSurface eGLSurface = a1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        ha haVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f40804b;
            EGLDisplay eGLDisplay = this.f40805c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f40804b.eglDestroySurface(this.f40805c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (haVar != null) {
                synchronized (haVar.f24648f) {
                    try {
                        if (haVar.f24649g == eGLContext) {
                            haVar.f24649g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f40804b.eglDestroyContext(this.f40805c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f40805c;
        if (eGLDisplay2 != null) {
            this.f40804b.eglTerminate(eGLDisplay2);
            this.f40805c = null;
        }
        if (haVar != null) {
            z0 z0Var = this.f40811x;
            ArrayList arrayList = haVar.e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && haVar.d.isEmpty()) {
                haVar.f24655n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        c1 c1Var = this.f40812y;
        Bitmap bitmap2 = c1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f40803a;
            ha haVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f40804b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f40805c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    vl.t(this.f40804b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f40804b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        vl.t(this.f40804b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f40804b.eglChooseConfig(this.f40805c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            vl.t(this.f40804b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (haVar != null) {
                                synchronized (haVar.f24648f) {
                                    try {
                                        eGLContext = haVar.f24649g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f40804b.eglCreateContext(this.f40805c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    vl.t(this.f40804b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (haVar != null) {
                                    haVar.a(eglCreateContext);
                                    haVar.e.add(this.f40811x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f40804b.eglCreateWindowSurface(this.f40805c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f40804b.eglMakeCurrent(this.f40805c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                vl.t(this.f40804b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f40822c;
                                            q0Var.getClass();
                                            Map map = e1.f40856a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f40856a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f40853b = new HashMap();
                                                obj.f40852a = GLES20.glCreateProgram();
                                                b2.q0 b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3200a;
                                                if (b10.f3201b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i11, i10, obj.f40852a);
                                                } else {
                                                    b2.q0 b11 = d1.b(35632, str);
                                                    int i12 = b11.f3200a;
                                                    if (b11.f3201b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i11, i12, obj.f40852a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f40852a, i11);
                                                        GLES20.glAttachShader(obj.f40852a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f40852a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f40852a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            d1.c(i11, i12, obj.f40852a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f40853b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f40852a, str2)));
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
                                            q0Var.f40958r = DesugarCollections.unmodifiableMap(hashMap);
                                            jv0 jv0Var = q0Var.f40948g;
                                            if (c1Var.h.getWidth() != jv0Var.f25440a || c1Var.h.getHeight() != jv0Var.f25441b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) jv0Var.f25440a, (int) jv0Var.f25441b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f25440a, jv0Var.f25441b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f40825r = true;
                                            }
                                            if (c1Var.f40824n != null && (bitmap.getWidth() != jv0Var.f25440a || c1Var.f40824n.getHeight() != jv0Var.f25441b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) jv0Var.f25440a, (int) jv0Var.f25441b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f40824n, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f25440a, jv0Var.f25441b), (Paint) null);
                                                c1Var.f40824n = createBitmap2;
                                                c1Var.f40825r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f40824n;
                                            if (q0Var.f40951k == null) {
                                                q0Var.f40951k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f40952l == null) {
                                                q0Var.f40952l = new r1(q0Var.A);
                                            }
                                            m6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            vl.t(this.f40804b, new StringBuilder("createWindowSurface failed "));
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
            this.f40806f = z10;
            super.run();
        }
    }
}
