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
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.ka;
import w7.o6;
public final class d1 extends DispatchQueue {
    public final SurfaceTexture f44455a;
    public EGL10 f44456b;
    public EGLDisplay f44457c;
    public EGLContext d;
    public EGLSurface f44458e;
    public boolean f44459f;
    public volatile boolean h;
    public int f44460n;
    public int f44461r;
    public b1 f44462s;
    public final ka v;
    public final c1 f44463w;
    public final b1 f44464x;
    public final f1 f44465y;

    public d1(f1 f1Var, SurfaceTexture surfaceTexture, ka kaVar) {
        super("CanvasInternal");
        this.f44465y = f1Var;
        this.f44463w = new c1(this, 0);
        this.f44464x = new b1(this, 0);
        this.v = kaVar;
        this.f44455a = surfaceTexture;
    }

    public static void b(d1 d1Var) {
        if (!d1Var.f44459f) {
            return;
        }
        if (d1Var.d.equals(d1Var.f44456b.eglGetCurrentContext()) && d1Var.f44458e.equals(d1Var.f44456b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = d1Var.f44456b;
        EGLDisplay eGLDisplay = d1Var.f44457c;
        EGLSurface eGLSurface = d1Var.f44458e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, d1Var.d);
    }

    public final void finish() {
        ka kaVar = this.v;
        if (this.f44458e != null) {
            EGL10 egl10 = this.f44456b;
            EGLDisplay eGLDisplay = this.f44457c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f44456b.eglDestroySurface(this.f44457c, this.f44458e);
            this.f44458e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (kaVar != null) {
                synchronized (kaVar.f28140f) {
                    try {
                        if (kaVar.f28141g == eGLContext) {
                            kaVar.f28141g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f44456b.eglDestroyContext(this.f44457c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f44457c;
        if (eGLDisplay2 != null) {
            this.f44456b.eglTerminate(eGLDisplay2);
            this.f44457c = null;
        }
        if (kaVar != null) {
            b1 b1Var = this.f44464x;
            ArrayList arrayList = kaVar.f28139e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && kaVar.d.isEmpty()) {
                kaVar.f28147n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        f1 f1Var = this.f44465y;
        Bitmap bitmap2 = f1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f44455a;
            ka kaVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f44456b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f44457c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    bi.t(this.f44456b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f44456b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        bi.t(this.f44456b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f44456b.eglChooseConfig(this.f44457c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            bi.t(this.f44456b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (kaVar != null) {
                                synchronized (kaVar.f28140f) {
                                    try {
                                        eGLContext = kaVar.f28141g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f44456b.eglCreateContext(this.f44457c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    bi.t(this.f44456b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (kaVar != null) {
                                    kaVar.a(eglCreateContext);
                                    kaVar.f28139e.add(this.f44464x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f44456b.eglCreateWindowSurface(this.f44457c, eGLConfig, surfaceTexture, null);
                                    this.f44458e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f44456b.eglMakeCurrent(this.f44457c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                bi.t(this.f44456b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = f1Var.f44493c;
                                            s0Var.getClass();
                                            Map map = h1.f44508a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : h1.f44508a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f44504b = new HashMap();
                                                obj.f44503a = GLES20.glCreateProgram();
                                                b2.q0 b10 = g1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3454a;
                                                if (b10.f3455b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    g1.c(i11, i10, obj.f44503a);
                                                } else {
                                                    b2.q0 b11 = g1.b(35632, str);
                                                    int i12 = b11.f3454a;
                                                    if (b11.f3455b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        g1.c(i11, i12, obj.f44503a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f44503a, i11);
                                                        GLES20.glAttachShader(obj.f44503a, i12);
                                                        for (int i13 = 0; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f44503a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f44503a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            g1.c(i11, i12, obj.f44503a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f44504b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f44503a, str2)));
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
                                            s0Var.f44612r = DesugarCollections.unmodifiableMap(hashMap);
                                            gw0 gw0Var = s0Var.f44602g;
                                            if (f1Var.h.getWidth() != gw0Var.f27002a || f1Var.h.getHeight() != gw0Var.f27003b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) gw0Var.f27002a, (int) gw0Var.f27003b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(f1Var.h, (Rect) null, new RectF(0.0f, 0.0f, gw0Var.f27002a, gw0Var.f27003b), (Paint) null);
                                                f1Var.h = createBitmap;
                                                f1Var.f44497r = true;
                                            }
                                            if (f1Var.f44496n != null && (bitmap.getWidth() != gw0Var.f27002a || f1Var.f44496n.getHeight() != gw0Var.f27003b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) gw0Var.f27002a, (int) gw0Var.f27003b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(f1Var.f44496n, (Rect) null, new RectF(0.0f, 0.0f, gw0Var.f27002a, gw0Var.f27003b), (Paint) null);
                                                f1Var.f44496n = createBitmap2;
                                                f1Var.f44497r = true;
                                            }
                                            Bitmap bitmap3 = f1Var.h;
                                            Bitmap bitmap4 = f1Var.f44496n;
                                            if (s0Var.f44605k == null) {
                                                s0Var.f44605k = new u1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new u1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f44606l == null) {
                                                s0Var.f44606l = new u1(s0Var.A);
                                            }
                                            o6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            bi.t(this.f44456b, new StringBuilder("createWindowSurface failed "));
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
            this.f44459f = z10;
            super.run();
        }
    }
}
