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
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Wallet.m5;
import w7.m6;
public final class c1 extends DispatchQueue {
    public final SurfaceTexture f45596a;
    public EGL10 f45597b;
    public EGLDisplay f45598c;
    public EGLContext d;
    public EGLSurface f45599e;
    public boolean f45600f;
    public volatile boolean h;
    public int f45601n;
    public int f45602r;
    public b1 f45603s;
    public final ma v;
    public final m5 f45604w;
    public final b1 f45605x;
    public final e1 f45606y;

    public c1(e1 e1Var, SurfaceTexture surfaceTexture, ma maVar) {
        super("CanvasInternal");
        this.f45606y = e1Var;
        this.f45604w = new m5(this, 3);
        this.f45605x = new b1(this, 0);
        this.v = maVar;
        this.f45596a = surfaceTexture;
    }

    public static void b(c1 c1Var) {
        if (!c1Var.f45600f) {
            return;
        }
        if (c1Var.d.equals(c1Var.f45597b.eglGetCurrentContext()) && c1Var.f45599e.equals(c1Var.f45597b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = c1Var.f45597b;
        EGLDisplay eGLDisplay = c1Var.f45598c;
        EGLSurface eGLSurface = c1Var.f45599e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c1Var.d);
    }

    public final void finish() {
        ma maVar = this.v;
        if (this.f45599e != null) {
            EGL10 egl10 = this.f45597b;
            EGLDisplay eGLDisplay = this.f45598c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f45597b.eglDestroySurface(this.f45598c, this.f45599e);
            this.f45599e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (maVar != null) {
                synchronized (maVar.f28791f) {
                    try {
                        if (maVar.f28792g == eGLContext) {
                            maVar.f28792g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f45597b.eglDestroyContext(this.f45598c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f45598c;
        if (eGLDisplay2 != null) {
            this.f45597b.eglTerminate(eGLDisplay2);
            this.f45598c = null;
        }
        if (maVar != null) {
            b1 b1Var = this.f45605x;
            ArrayList arrayList = maVar.f28790e;
            arrayList.remove(b1Var);
            if (arrayList.isEmpty() && maVar.d.isEmpty()) {
                maVar.f28798n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        e1 e1Var = this.f45606y;
        Bitmap bitmap2 = e1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f45596a;
            ma maVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f45597b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f45598c = eglGetDisplay;
            int i10 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    bi.v(this.f45597b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f45597b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        bi.v(this.f45597b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f45597b.eglChooseConfig(this.f45598c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            bi.v(this.f45597b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (maVar != null) {
                                synchronized (maVar.f28791f) {
                                    try {
                                        eGLContext = maVar.f28792g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f45597b.eglCreateContext(this.f45598c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    bi.v(this.f45597b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (maVar != null) {
                                    maVar.a(eglCreateContext);
                                    maVar.f28790e.add(this.f45605x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f45597b.eglCreateWindowSurface(this.f45598c, eGLConfig, surfaceTexture, null);
                                    this.f45599e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f45597b.eglMakeCurrent(this.f45598c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                bi.v(this.f45597b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            s0 s0Var = e1Var.f45633c;
                                            s0Var.getClass();
                                            Map map = g1.f45647a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : g1.f45647a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f45645b = new HashMap();
                                                obj.f45644a = GLES20.glCreateProgram();
                                                b2.q0 b10 = f1.b(35633, (String) map2.get("vertex"));
                                                int i11 = b10.f3533a;
                                                if (b10.f3534b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    f1.c(i11, i10, obj.f45644a);
                                                } else {
                                                    b2.q0 b11 = f1.b(35632, str);
                                                    int i12 = b11.f3533a;
                                                    if (b11.f3534b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        f1.c(i11, i12, obj.f45644a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f45644a, i11);
                                                        GLES20.glAttachShader(obj.f45644a, i12);
                                                        for (int i13 = i10; i13 < strArr.length; i13++) {
                                                            GLES20.glBindAttribLocation(obj.f45644a, i13, strArr[i13]);
                                                        }
                                                        int i14 = obj.f45644a;
                                                        GLES20.glLinkProgram(i14);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                        if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                        }
                                                        if (iArr3[i10] == 0) {
                                                            f1.c(i11, i12, obj.f45644a);
                                                        } else {
                                                            int length = strArr2.length;
                                                            for (int i15 = i10; i15 < length; i15++) {
                                                                String str2 = strArr2[i15];
                                                                obj.f45645b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f45644a, str2)));
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
                                            s0Var.f45768r = DesugarCollections.unmodifiableMap(hashMap);
                                            mw0 mw0Var = s0Var.f45758g;
                                            if (e1Var.h.getWidth() != mw0Var.f28963a || e1Var.h.getHeight() != mw0Var.f28964b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) mw0Var.f28963a, (int) mw0Var.f28964b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(e1Var.h, (Rect) null, new RectF(0.0f, 0.0f, mw0Var.f28963a, mw0Var.f28964b), (Paint) null);
                                                e1Var.h = createBitmap;
                                                e1Var.f45637r = true;
                                            }
                                            if (e1Var.f45636n != null && (bitmap.getWidth() != mw0Var.f28963a || e1Var.f45636n.getHeight() != mw0Var.f28964b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) mw0Var.f28963a, (int) mw0Var.f28964b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(e1Var.f45636n, (Rect) null, new RectF(0.0f, 0.0f, mw0Var.f28963a, mw0Var.f28964b), (Paint) null);
                                                e1Var.f45636n = createBitmap2;
                                                e1Var.f45637r = true;
                                            }
                                            Bitmap bitmap3 = e1Var.h;
                                            Bitmap bitmap4 = e1Var.f45636n;
                                            if (s0Var.f45761k == null) {
                                                s0Var.f45761k = new t1(bitmap3);
                                            }
                                            if (s0Var.D == null) {
                                                s0Var.D = new t1(bitmap4);
                                            }
                                            if (s0Var.G && s0Var.f45762l == null) {
                                                s0Var.f45762l = new t1(s0Var.A);
                                            }
                                            m6.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            bi.v(this.f45597b, new StringBuilder("createWindowSurface failed "));
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
            this.f45600f = z10;
            super.run();
        }
    }
}
