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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Wallet.p5;
import w7.m6;
public final class c1 extends DispatchQueue {
    public final SurfaceTexture f45632a;
    public EGL10 f45633b;
    public EGLDisplay f45634c;
    public EGLContext d;
    public EGLSurface f45635e;
    public boolean f45636f;
    public volatile boolean h;
    public int f45637n;
    public int f45638r;
    public b1 f45639s;
    public final la v;
    public final p5 f45640w;
    public final b1 f45641x;
    public final e1 f45642y;

    public c1(e1 e1Var, SurfaceTexture surfaceTexture, la laVar) {
        super("CanvasInternal");
        this.f45642y = e1Var;
        this.f45640w = new p5(this, 3);
        this.f45641x = new b1(this, 0);
        this.v = laVar;
        this.f45632a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (!c1Var.f45636f) {
            return;
        }
        if (c1Var.d.equals(c1Var.f45633b.eglGetCurrentContext()) && c1Var.f45635e.equals(c1Var.f45633b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = c1Var.f45633b;
        EGLDisplay eGLDisplay = c1Var.f45634c;
        EGLSurface eGLSurface = c1Var.f45635e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
    }

    public final void finish() {
        la laVar = this.v;
        if (this.f45635e != null) {
            EGL10 egl10 = this.f45633b;
            EGLDisplay eGLDisplay = this.f45634c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f45633b.eglDestroySurface(this.f45634c, this.f45635e);
            this.f45635e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (laVar != null) {
                synchronized (laVar.f28268f) {
                    try {
                        if (laVar.f28269g == eGLContext) {
                            laVar.f28269g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f45633b.eglDestroyContext(this.f45634c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f45634c;
        if (eGLDisplay2 != null) {
            this.f45633b.eglTerminate(eGLDisplay2);
            this.f45634c = null;
        }
        if (laVar != null) {
            b1 b1Var = this.f45641x;
            ArrayList arrayList = laVar.f28267e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && laVar.d.isEmpty()) {
                laVar.f28275n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        e1 e1Var = this.f45642y;
        Bitmap bitmap2 = e1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f45632a;
            la laVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f45633b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f45634c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    ai.v(this.f45633b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f45633b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        ai.v(this.f45633b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f45633b.eglChooseConfig(this.f45634c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            ai.v(this.f45633b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (laVar != null) {
                                synchronized (laVar.f28268f) {
                                    try {
                                        eGLContext = laVar.f28269g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f45633b.eglCreateContext(this.f45634c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    ai.v(this.f45633b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (laVar != null) {
                                    laVar.a(eglCreateContext);
                                    laVar.f28267e.add(this.f45641x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f45633b.eglCreateWindowSurface(this.f45634c, eGLConfig, surfaceTexture, null);
                                    this.f45635e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f45633b.eglMakeCurrent(this.f45634c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                ai.v(this.f45633b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = e1Var.f45669c;
                                            s0Var.getClass();
                                            Map map = g1.f45683a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : g1.f45683a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f45681b = new HashMap();
                                                obj.f45680a = GLES20.glCreateProgram();
                                                b2.q0 b10 = f1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3533a;
                                                if (b10.f3534b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    f1.c(i11, i10, obj.f45680a);
                                                } else {
                                                    b2.q0 b11 = f1.b(35632, str);
                                                    int i12 = b11.f3533a;
                                                    if (b11.f3534b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        f1.c(i11, i12, obj.f45680a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f45680a, i11);
                                                        GLES20.glAttachShader(obj.f45680a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f45680a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f45680a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            f1.c(i11, i12, obj.f45680a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f45681b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f45680a, str2)));
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
                                            s0Var.f45804r = DesugarCollections.unmodifiableMap(hashMap);
                                            ow0 ow0Var = s0Var.f45794g;
                                            if (e1Var.h.getWidth() != ow0Var.f29541a || e1Var.h.getHeight() != ow0Var.f29542b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) ow0Var.f29541a, (int) ow0Var.f29542b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, ow0Var.f29541a, ow0Var.f29542b), (Paint) null);
                                                e1Var.h = createBitmap;
                                                e1Var.f45673r = true;
                                            }
                                            if (e1Var.f45672n != null && (bitmap.getWidth() != ow0Var.f29541a || e1Var.f45672n.getHeight() != ow0Var.f29542b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) ow0Var.f29541a, (int) ow0Var.f29542b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e1Var.f45672n, (Rect) null, new RectF(0.0f, 0.0f, ow0Var.f29541a, ow0Var.f29542b), (Paint) null);
                                                e1Var.f45672n = createBitmap2;
                                                e1Var.f45673r = true;
                                            }
                                            Bitmap bitmap3 = e1Var.h;
                                            Bitmap bitmap4 = e1Var.f45672n;
                                            if (s0Var.f45797k == null) {
                                                s0Var.f45797k = new t1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new t1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f45798l == null) {
                                                s0Var.f45798l = new t1(s0Var.A);
                                            }
                                            m6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            ai.v(this.f45633b, new StringBuilder("createWindowSurface failed "));
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
            this.f45636f = z10;
            super.run();
        }
    }
}
