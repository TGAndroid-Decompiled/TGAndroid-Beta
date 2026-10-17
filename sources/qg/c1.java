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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ja;
import w7.t6;
public final class c1 extends DispatchQueue {
    public final SurfaceTexture f44499a;
    public EGL10 f44500b;
    public EGLDisplay f44501c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f44502f;
    public volatile boolean h;
    public int f44503n;
    public int f44504r;
    public b1 f44505s;
    public final ja v;
    public final p4.s0 f44506w;
    public final b1 f44507x;
    public final e1 f44508y;

    public c1(e1 e1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f44508y = e1Var;
        this.f44506w = new p4.s0(this, 2);
        this.f44507x = new b1(this, 0);
        this.v = jaVar;
        this.f44499a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (!c1Var.f44502f) {
            return;
        }
        if (c1Var.d.equals(c1Var.f44500b.eglGetCurrentContext()) && c1Var.e.equals(c1Var.f44500b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = c1Var.f44500b;
        EGLDisplay eGLDisplay = c1Var.f44501c;
        EGLSurface eGLSurface = c1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f44500b;
            EGLDisplay eGLDisplay = this.f44501c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f44500b.eglDestroySurface(this.f44501c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f27479f) {
                    try {
                        if (jaVar.f27480g == eGLContext) {
                            jaVar.f27480g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f44500b.eglDestroyContext(this.f44501c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f44501c;
        if (eGLDisplay2 != null) {
            this.f44500b.eglTerminate(eGLDisplay2);
            this.f44501c = null;
        }
        if (jaVar != null) {
            b1 b1Var = this.f44507x;
            ArrayList arrayList = jaVar.e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f27486n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        e1 e1Var = this.f44508y;
        Bitmap bitmap2 = e1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f44499a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f44500b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f44501c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    wh.v(this.f44500b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f44500b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        wh.v(this.f44500b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f44500b.eglChooseConfig(this.f44501c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            wh.v(this.f44500b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f27479f) {
                                    try {
                                        eGLContext = jaVar.f27480g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f44500b.eglCreateContext(this.f44501c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    wh.v(this.f44500b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.e.add(this.f44507x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f44500b.eglCreateWindowSurface(this.f44501c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f44500b.eglMakeCurrent(this.f44501c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                wh.v(this.f44500b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = e1Var.f44537c;
                                            s0Var.getClass();
                                            Map map = g1.f44551a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : g1.f44551a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f44548b = new HashMap();
                                                obj.f44547a = GLES20.glCreateProgram();
                                                b2.u0 b10 = f1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f4056a;
                                                if (b10.f4057b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    f1.c(i11, i10, obj.f44547a);
                                                } else {
                                                    b2.u0 b11 = f1.b(35632, str);
                                                    int i12 = b11.f4056a;
                                                    if (b11.f4057b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        f1.c(i11, i12, obj.f44547a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f44547a, i11);
                                                        GLES20.glAttachShader(obj.f44547a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f44547a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f44547a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            f1.c(i11, i12, obj.f44547a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f44548b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f44547a, str2)));
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
                                            s0Var.f44659r = DesugarCollections.unmodifiableMap(hashMap);
                                            dw0 dw0Var = s0Var.f44649g;
                                            if (e1Var.h.getWidth() != dw0Var.f25720a || e1Var.h.getHeight() != dw0Var.f25721b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) dw0Var.f25720a, (int) dw0Var.f25721b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, dw0Var.f25720a, dw0Var.f25721b), (Paint) null);
                                                e1Var.h = createBitmap;
                                                e1Var.f44540r = true;
                                            }
                                            if (e1Var.f44539n != null && (bitmap.getWidth() != dw0Var.f25720a || e1Var.f44539n.getHeight() != dw0Var.f25721b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) dw0Var.f25720a, (int) dw0Var.f25721b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e1Var.f44539n, (Rect) null, new RectF(0.0f, 0.0f, dw0Var.f25720a, dw0Var.f25721b), (Paint) null);
                                                e1Var.f44539n = createBitmap2;
                                                e1Var.f44540r = true;
                                            }
                                            Bitmap bitmap3 = e1Var.h;
                                            Bitmap bitmap4 = e1Var.f44539n;
                                            if (s0Var.f44652k == null) {
                                                s0Var.f44652k = new t1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new t1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f44653l == null) {
                                                s0Var.f44653l = new t1(s0Var.A);
                                            }
                                            t6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            wh.v(this.f44500b, new StringBuilder("createWindowSurface failed "));
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
            this.f44502f = z10;
            super.run();
        }
    }
}
