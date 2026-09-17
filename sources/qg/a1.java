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
import org.telegram.messenger.vl;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ja;
import w7.u6;
public final class a1 extends DispatchQueue {
    public final SurfaceTexture f44369a;
    public EGL10 f44370b;
    public EGLDisplay f44371c;
    public EGLContext d;
    public EGLSurface f44372e;
    public boolean f44373f;
    public volatile boolean h;
    public int f44374n;
    public int f44375r;
    public z0 f44376s;
    public final ja v;
    public final l7 f44377w;
    public final z0 f44378x;
    public final c1 f44379y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f44379y = c1Var;
        this.f44377w = new l7(this, 29);
        this.f44378x = new z0(this, 0);
        this.v = jaVar;
        this.f44369a = surfaceTexture;
    }

    public static void b(a1 a1Var) {
        if (!a1Var.f44373f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f44370b.eglGetCurrentContext()) && a1Var.f44372e.equals(a1Var.f44370b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f44370b;
        EGLDisplay eGLDisplay = a1Var.f44371c;
        EGLSurface eGLSurface = a1Var.f44372e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.f44372e != null) {
            EGL10 egl10 = this.f44370b;
            EGLDisplay eGLDisplay = this.f44371c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f44370b.eglDestroySurface(this.f44371c, this.f44372e);
            this.f44372e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f27412f) {
                    try {
                        if (jaVar.f27413g == eGLContext) {
                            jaVar.f27413g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f44370b.eglDestroyContext(this.f44371c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f44371c;
        if (eGLDisplay2 != null) {
            this.f44370b.eglTerminate(eGLDisplay2);
            this.f44371c = null;
        }
        if (jaVar != null) {
            z0 z0Var = this.f44378x;
            ArrayList arrayList = jaVar.f27411e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f27419n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        c1 c1Var = this.f44379y;
        Bitmap bitmap2 = c1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f44369a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f44370b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f44371c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    vl.s(this.f44370b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f44370b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        vl.s(this.f44370b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f44370b.eglChooseConfig(this.f44371c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            vl.s(this.f44370b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f27412f) {
                                    try {
                                        eGLContext = jaVar.f27413g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f44370b.eglCreateContext(this.f44371c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    vl.s(this.f44370b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.f27411e.add(this.f44378x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f44370b.eglCreateWindowSurface(this.f44371c, eGLConfig, surfaceTexture, null);
                                    this.f44372e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f44370b.eglMakeCurrent(this.f44371c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                vl.s(this.f44370b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f44390c;
                                            q0Var.getClass();
                                            Map map = e1.f44426a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f44426a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f44423b = new HashMap();
                                                obj.f44422a = GLES20.glCreateProgram();
                                                b2.q0 b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f2260a;
                                                if (b10.f2261b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i11, i10, obj.f44422a);
                                                } else {
                                                    b2.q0 b11 = d1.b(35632, str);
                                                    int i12 = b11.f2260a;
                                                    if (b11.f2261b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i11, i12, obj.f44422a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f44422a, i11);
                                                        GLES20.glAttachShader(obj.f44422a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f44422a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f44422a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            d1.c(i11, i12, obj.f44422a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f44423b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f44422a, str2)));
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
                                            q0Var.f44534r = DesugarCollections.unmodifiableMap(hashMap);
                                            iv0 iv0Var = q0Var.f44524g;
                                            if (c1Var.h.getWidth() != iv0Var.f27272a || c1Var.h.getHeight() != iv0Var.f27273b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) iv0Var.f27272a, (int) iv0Var.f27273b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, iv0Var.f27272a, iv0Var.f27273b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f44394r = true;
                                            }
                                            if (c1Var.f44393n != null && (bitmap.getWidth() != iv0Var.f27272a || c1Var.f44393n.getHeight() != iv0Var.f27273b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) iv0Var.f27272a, (int) iv0Var.f27273b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f44393n, (Rect) null, new RectF(0.0f, 0.0f, iv0Var.f27272a, iv0Var.f27273b), (Paint) null);
                                                c1Var.f44393n = createBitmap2;
                                                c1Var.f44394r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f44393n;
                                            if (q0Var.f44527k == null) {
                                                q0Var.f44527k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f44528l == null) {
                                                q0Var.f44528l = new r1(q0Var.A);
                                            }
                                            u6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            vl.s(this.f44370b, new StringBuilder("createWindowSurface failed "));
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
            this.f44373f = z10;
            super.run();
        }
    }
}
