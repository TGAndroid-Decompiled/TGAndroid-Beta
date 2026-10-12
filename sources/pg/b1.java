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
    public final SurfaceTexture f45481a;
    public EGL10 f45482b;
    public EGLDisplay f45483c;
    public EGLContext d;
    public EGLSurface f45484e;
    public boolean f45485f;
    public volatile boolean h;
    public int f45486n;
    public int f45487r;
    public a1 f45488s;
    public final la v;
    public final p4.t0 f45489w;
    public final a1 f45490x;
    public final d1 f45491y;

    public b1(d1 d1Var, SurfaceTexture surfaceTexture, la laVar) {
        super("CanvasInternal");
        this.f45491y = d1Var;
        this.f45489w = new p4.t0(this, 2);
        this.f45490x = new a1(this, 0);
        this.v = laVar;
        this.f45481a = surfaceTexture;
    }

    public static void b(b1 b1Var) {
        if (!b1Var.f45485f) {
            return;
        }
        if (b1Var.d.equals(b1Var.f45482b.eglGetCurrentContext()) && b1Var.f45484e.equals(b1Var.f45482b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = b1Var.f45482b;
        EGLDisplay eGLDisplay = b1Var.f45483c;
        EGLSurface eGLSurface = b1Var.f45484e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b1Var.d);
    }

    public final void finish() {
        la laVar = this.v;
        if (this.f45484e != null) {
            EGL10 egl10 = this.f45482b;
            EGLDisplay eGLDisplay = this.f45483c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f45482b.eglDestroySurface(this.f45483c, this.f45484e);
            this.f45484e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (laVar != null) {
                synchronized (laVar.f28121f) {
                    try {
                        if (laVar.f28122g == eGLContext) {
                            laVar.f28122g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f45482b.eglDestroyContext(this.f45483c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f45483c;
        if (eGLDisplay2 != null) {
            this.f45482b.eglTerminate(eGLDisplay2);
            this.f45483c = null;
        }
        if (laVar != null) {
            a1 a1Var = this.f45490x;
            ArrayList arrayList = laVar.f28120e;
            arrayList.remove(a1Var);
            if (arrayList.isEmpty() && laVar.d.isEmpty()) {
                laVar.f28128n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        d1 d1Var = this.f45491y;
        Bitmap bitmap2 = d1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f45481a;
            la laVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f45482b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f45483c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    am.v(this.f45482b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f45482b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        am.v(this.f45482b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f45482b.eglChooseConfig(this.f45483c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            am.v(this.f45482b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (laVar != null) {
                                synchronized (laVar.f28121f) {
                                    try {
                                        eGLContext = laVar.f28122g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f45482b.eglCreateContext(this.f45483c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    am.v(this.f45482b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (laVar != null) {
                                    laVar.a(eglCreateContext);
                                    laVar.f28120e.add(this.f45490x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f45482b.eglCreateWindowSurface(this.f45483c, eGLConfig, surfaceTexture, null);
                                    this.f45484e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f45482b.eglMakeCurrent(this.f45483c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                am.v(this.f45482b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            r0 r0Var = d1Var.f45522c;
                                            r0Var.getClass();
                                            Map map = f1.f45536a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : f1.f45536a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f45533b = new HashMap();
                                                obj.f45532a = GLES20.glCreateProgram();
                                                b2.q0 b10 = e1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3531a;
                                                if (b10.f3532b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    e1.c(i11, i10, obj.f45532a);
                                                } else {
                                                    b2.q0 b11 = e1.b(35632, str);
                                                    int i12 = b11.f3531a;
                                                    if (b11.f3532b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        e1.c(i11, i12, obj.f45532a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f45532a, i11);
                                                        GLES20.glAttachShader(obj.f45532a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f45532a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f45532a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            e1.c(i11, i12, obj.f45532a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f45533b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f45532a, str2)));
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
                                            r0Var.f45648r = DesugarCollections.unmodifiableMap(hashMap);
                                            sw0 sw0Var = r0Var.f45638g;
                                            if (d1Var.h.getWidth() != sw0Var.f30699a || d1Var.h.getHeight() != sw0Var.f30700b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) sw0Var.f30699a, (int) sw0Var.f30700b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(d1Var.h, (Rect) null, new RectF(0.0f, 0.0f, sw0Var.f30699a, sw0Var.f30700b), (Paint) null);
                                                d1Var.h = createBitmap;
                                                d1Var.f45526r = true;
                                            }
                                            if (d1Var.f45525n != null && (bitmap.getWidth() != sw0Var.f30699a || d1Var.f45525n.getHeight() != sw0Var.f30700b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) sw0Var.f30699a, (int) sw0Var.f30700b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(d1Var.f45525n, (Rect) null, new RectF(0.0f, 0.0f, sw0Var.f30699a, sw0Var.f30700b), (Paint) null);
                                                d1Var.f45525n = createBitmap2;
                                                d1Var.f45526r = true;
                                            }
                                            Bitmap bitmap3 = d1Var.h;
                                            Bitmap bitmap4 = d1Var.f45525n;
                                            if (r0Var.f45641k == null) {
                                                r0Var.f45641k = new s1(bitmap3);
                                            }
                                            if (r0Var.D == null) {
                                                r0Var.D = new s1(bitmap4);
                                            }
                                            if (r0Var.G && r0Var.f45642l == null) {
                                                r0Var.f45642l = new s1(r0Var.A);
                                            }
                                            l6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            am.v(this.f45482b, new StringBuilder("createWindowSurface failed "));
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
            this.f45485f = z10;
            super.run();
        }
    }
}
