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
import org.telegram.messenger.wl;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jv0;
import w7.m6;
public final class a1 extends DispatchQueue {
    public final SurfaceTexture f40807a;
    public EGL10 f40808b;
    public EGLDisplay f40809c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f40810f;
    public volatile boolean h;
    public int f40811n;
    public int f40812r;
    public z0 f40813s;
    public final ha v;
    public final l7 f40814w;
    public final z0 f40815x;
    public final c1 f40816y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, ha haVar) {
        super("CanvasInternal");
        this.f40816y = c1Var;
        this.f40814w = new l7(this, 29);
        this.f40815x = new z0(this, 0);
        this.v = haVar;
        this.f40807a = surfaceTexture;
    }

    public static void b(a1 a1Var) {
        if (!a1Var.f40810f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f40808b.eglGetCurrentContext()) && a1Var.e.equals(a1Var.f40808b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f40808b;
        EGLDisplay eGLDisplay = a1Var.f40809c;
        EGLSurface eGLSurface = a1Var.e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        ha haVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.f40808b;
            EGLDisplay eGLDisplay = this.f40809c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f40808b.eglDestroySurface(this.f40809c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (haVar != null) {
                synchronized (haVar.f24645f) {
                    try {
                        if (haVar.f24646g == eGLContext) {
                            haVar.f24646g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f40808b.eglDestroyContext(this.f40809c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f40809c;
        if (eGLDisplay2 != null) {
            this.f40808b.eglTerminate(eGLDisplay2);
            this.f40809c = null;
        }
        if (haVar != null) {
            z0 z0Var = this.f40815x;
            ArrayList arrayList = haVar.e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && haVar.d.isEmpty()) {
                haVar.f24652n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        c1 c1Var = this.f40816y;
        Bitmap bitmap2 = c1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f40807a;
            ha haVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f40808b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f40809c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    wl.s(this.f40808b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f40808b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        wl.s(this.f40808b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f40808b.eglChooseConfig(this.f40809c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            wl.s(this.f40808b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (haVar != null) {
                                synchronized (haVar.f24645f) {
                                    try {
                                        eGLContext = haVar.f24646g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f40808b.eglCreateContext(this.f40809c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    wl.s(this.f40808b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (haVar != null) {
                                    haVar.a(eglCreateContext);
                                    haVar.e.add(this.f40815x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f40808b.eglCreateWindowSurface(this.f40809c, eGLConfig, surfaceTexture, null);
                                    this.e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f40808b.eglMakeCurrent(this.f40809c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                wl.s(this.f40808b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f40826c;
                                            q0Var.getClass();
                                            Map map = e1.f40860a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f40860a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f40857b = new HashMap();
                                                obj.f40856a = GLES20.glCreateProgram();
                                                b2.q0 b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3198a;
                                                if (b10.f3199b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i11, i10, obj.f40856a);
                                                } else {
                                                    b2.q0 b11 = d1.b(35632, str);
                                                    int i12 = b11.f3198a;
                                                    if (b11.f3199b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i11, i12, obj.f40856a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f40856a, i11);
                                                        GLES20.glAttachShader(obj.f40856a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f40856a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f40856a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            d1.c(i11, i12, obj.f40856a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f40857b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f40856a, str2)));
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
                                            q0Var.f40962r = DesugarCollections.unmodifiableMap(hashMap);
                                            jv0 jv0Var = q0Var.f40952g;
                                            if (c1Var.h.getWidth() != jv0Var.f25443a || c1Var.h.getHeight() != jv0Var.f25444b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) jv0Var.f25443a, (int) jv0Var.f25444b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f25443a, jv0Var.f25444b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f40829r = true;
                                            }
                                            if (c1Var.f40828n != null && (bitmap.getWidth() != jv0Var.f25443a || c1Var.f40828n.getHeight() != jv0Var.f25444b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) jv0Var.f25443a, (int) jv0Var.f25444b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f40828n, (Rect) null, new RectF(0.0f, 0.0f, jv0Var.f25443a, jv0Var.f25444b), (Paint) null);
                                                c1Var.f40828n = createBitmap2;
                                                c1Var.f40829r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f40828n;
                                            if (q0Var.f40955k == null) {
                                                q0Var.f40955k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f40956l == null) {
                                                q0Var.f40956l = new r1(q0Var.A);
                                            }
                                            m6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            wl.s(this.f40808b, new StringBuilder("createWindowSurface failed "));
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
            this.f40810f = z10;
            super.run();
        }
    }
}
