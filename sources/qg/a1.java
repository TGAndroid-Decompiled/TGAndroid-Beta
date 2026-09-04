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
import org.telegram.messenger.wl;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ja;
import w7.u6;
public final class a1 extends DispatchQueue {
    public final SurfaceTexture f44368a;
    public EGL10 f44369b;
    public EGLDisplay f44370c;
    public EGLContext d;
    public EGLSurface f44371e;
    public boolean f44372f;
    public volatile boolean h;
    public int f44373n;
    public int f44374r;
    public z0 f44375s;
    public final ja v;
    public final l7 f44376w;
    public final z0 f44377x;
    public final c1 f44378y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, ja jaVar) {
        super("CanvasInternal");
        this.f44378y = c1Var;
        this.f44376w = new l7(this, 29);
        this.f44377x = new z0(this, 0);
        this.v = jaVar;
        this.f44368a = surfaceTexture;
    }

    public static void b(a1 a1Var) {
        if (!a1Var.f44372f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f44369b.eglGetCurrentContext()) && a1Var.f44371e.equals(a1Var.f44369b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f44369b;
        EGLDisplay eGLDisplay = a1Var.f44370c;
        EGLSurface eGLSurface = a1Var.f44371e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        ja jaVar = this.v;
        if (this.f44371e != null) {
            EGL10 egl10 = this.f44369b;
            EGLDisplay eGLDisplay = this.f44370c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f44369b.eglDestroySurface(this.f44370c, this.f44371e);
            this.f44371e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (jaVar != null) {
                synchronized (jaVar.f27411f) {
                    try {
                        if (jaVar.f27412g == eGLContext) {
                            jaVar.f27412g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f44369b.eglDestroyContext(this.f44370c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f44370c;
        if (eGLDisplay2 != null) {
            this.f44369b.eglTerminate(eGLDisplay2);
            this.f44370c = null;
        }
        if (jaVar != null) {
            z0 z0Var = this.f44377x;
            ArrayList arrayList = jaVar.f27410e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && jaVar.d.isEmpty()) {
                jaVar.f27418n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        c1 c1Var = this.f44378y;
        Bitmap bitmap2 = c1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f44368a;
            ja jaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f44369b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f44370c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    wl.s(this.f44369b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f44369b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        wl.s(this.f44369b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f44369b.eglChooseConfig(this.f44370c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            wl.s(this.f44369b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (jaVar != null) {
                                synchronized (jaVar.f27411f) {
                                    try {
                                        eGLContext = jaVar.f27412g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f44369b.eglCreateContext(this.f44370c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    wl.s(this.f44369b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (jaVar != null) {
                                    jaVar.a(eglCreateContext);
                                    jaVar.f27410e.add(this.f44377x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f44369b.eglCreateWindowSurface(this.f44370c, eGLConfig, surfaceTexture, null);
                                    this.f44371e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f44369b.eglMakeCurrent(this.f44370c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                wl.s(this.f44369b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f44389c;
                                            q0Var.getClass();
                                            Map map = e1.f44425a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f44425a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f44422b = new HashMap();
                                                obj.f44421a = GLES20.glCreateProgram();
                                                b2.q0 b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f2260a;
                                                if (b10.f2261b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i11, i10, obj.f44421a);
                                                } else {
                                                    b2.q0 b11 = d1.b(35632, str);
                                                    int i12 = b11.f2260a;
                                                    if (b11.f2261b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i11, i12, obj.f44421a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f44421a, i11);
                                                        GLES20.glAttachShader(obj.f44421a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f44421a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f44421a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            d1.c(i11, i12, obj.f44421a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f44422b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f44421a, str2)));
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
                                            q0Var.f44533r = DesugarCollections.unmodifiableMap(hashMap);
                                            iv0 iv0Var = q0Var.f44523g;
                                            if (c1Var.h.getWidth() != iv0Var.f27271a || c1Var.h.getHeight() != iv0Var.f27272b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) iv0Var.f27271a, (int) iv0Var.f27272b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, iv0Var.f27271a, iv0Var.f27272b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f44393r = true;
                                            }
                                            if (c1Var.f44392n != null && (bitmap.getWidth() != iv0Var.f27271a || c1Var.f44392n.getHeight() != iv0Var.f27272b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) iv0Var.f27271a, (int) iv0Var.f27272b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f44392n, (Rect) null, new RectF(0.0f, 0.0f, iv0Var.f27271a, iv0Var.f27272b), (Paint) null);
                                                c1Var.f44392n = createBitmap2;
                                                c1Var.f44393r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f44392n;
                                            if (q0Var.f44526k == null) {
                                                q0Var.f44526k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f44527l == null) {
                                                q0Var.f44527l = new r1(q0Var.A);
                                            }
                                            u6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            wl.s(this.f44369b, new StringBuilder("createWindowSurface failed "));
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
            this.f44372f = z10;
            super.run();
        }
    }
}
