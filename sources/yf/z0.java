package yf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import h7.n8;
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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.z9;

public final class z0 extends DispatchQueue {

    public final SurfaceTexture f50130a;

    public EGL10 f50131b;

    public EGLDisplay f50132c;
    public EGLContext d;

    public EGLSurface f50133e;

    public boolean f50134f;
    public volatile boolean h;

    public int f50135n;

    public int f50136r;

    public y0 f50137s;
    public final z9 v;

    public final mu0 f50138w;

    public final y0 f50139x;

    public final b1 f50140y;

    public z0(b1 b1Var, SurfaceTexture surfaceTexture, z9 z9Var) {
        super("CanvasInternal");
        this.f50140y = b1Var;
        this.f50138w = new mu0(this, 9);
        this.f50139x = new y0(this, 0);
        this.v = z9Var;
        this.f50130a = surfaceTexture;
    }

    public static void b(z0 z0Var) {
        if (z0Var.f50134f) {
            if (z0Var.d.equals(z0Var.f50131b.eglGetCurrentContext()) && z0Var.f50133e.equals(z0Var.f50131b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = z0Var.f50131b;
            EGLDisplay eGLDisplay = z0Var.f50132c;
            EGLSurface eGLSurface = z0Var.f50133e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, z0Var.d);
        }
    }

    public final void finish() {
        z9 z9Var = this.v;
        if (this.f50133e != null) {
            EGL10 egl10 = this.f50131b;
            EGLDisplay eGLDisplay = this.f50132c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f50131b.eglDestroySurface(this.f50132c, this.f50133e);
            this.f50133e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (z9Var != null) {
                synchronized (z9Var.f35206f) {
                    try {
                        if (z9Var.f35207g == eGLContext) {
                            z9Var.f35207g = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f50131b.eglDestroyContext(this.f50132c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f50132c;
        if (eGLDisplay2 != null) {
            this.f50131b.eglTerminate(eGLDisplay2);
            this.f50132c = null;
        }
        if (z9Var != null) {
            y0 y0Var = this.f50139x;
            ArrayList arrayList = z9Var.f35205e;
            arrayList.remove(y0Var);
            if (arrayList.isEmpty() && z9Var.d.isEmpty()) {
                z9Var.f35213n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        b1 b1Var = this.f50140y;
        Bitmap bitmap = b1Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f50130a;
        z9 z9Var = this.v;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f50131b = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f50132c = eGLDisplayEglGetDisplay;
        int i10 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z10 = false;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                rl.r(this.f50131b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            if (this.f50131b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.f50131b.eglChooseConfig(this.f50132c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (iArr[0] > 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        int[] iArr2 = {12440, 2, 12344};
                        if (z9Var != null) {
                            synchronized (z9Var.f35206f) {
                                try {
                                    eGLContext = z9Var.f35207g;
                                    if (eGLContext == null) {
                                        eGLContext = EGL10.EGL_NO_CONTEXT;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            eGLContext = EGL10.EGL_NO_CONTEXT;
                        }
                        EGLContext eGLContextEglCreateContext = this.f50131b.eglCreateContext(this.f50132c, eGLConfig, eGLContext, iArr2);
                        this.d = eGLContextEglCreateContext;
                        if (eGLContextEglCreateContext == null) {
                            if (BuildVars.LOGS_ENABLED) {
                                rl.r(this.f50131b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (z9Var != null) {
                                z9Var.a(eGLContextEglCreateContext);
                                z9Var.f35205e.add(this.f50139x);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eGLSurfaceEglCreateWindowSurface = this.f50131b.eglCreateWindowSurface(this.f50132c, eGLConfig, surfaceTexture, null);
                                this.f50133e = eGLSurfaceEglCreateWindowSurface;
                                if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        rl.r(this.f50131b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.f50131b.eglMakeCurrent(this.f50132c, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    p0 p0Var = b1Var.f49880c;
                                    p0Var.getClass();
                                    Map map = d1.f49919a;
                                    HashMap map2 = new HashMap();
                                    for (Map.Entry entry : d1.f49919a.entrySet()) {
                                        Map map3 = (Map) entry.getValue();
                                        String str = (String) map3.get("vertex");
                                        String str2 = (String) map3.get("fragment");
                                        String[] strArr = (String[]) map3.get("attributes");
                                        String[] strArr2 = (String[]) map3.get("uniforms");
                                        c1 c1Var = new c1();
                                        c1Var.f49895b = new HashMap();
                                        c1Var.f49894a = GLES20.glCreateProgram();
                                        d5.p pVarB = c1.b(35633, str);
                                        int i11 = pVarB.f4821a;
                                        if (pVarB.f4822b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            c1.c(i11, i10, c1Var.f49894a);
                                        } else {
                                            d5.p pVarB2 = c1.b(35632, str2);
                                            int i12 = pVarB2.f4821a;
                                            if (pVarB2.f4822b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                c1.c(i11, i12, c1Var.f49894a);
                                            } else {
                                                GLES20.glAttachShader(c1Var.f49894a, i11);
                                                GLES20.glAttachShader(c1Var.f49894a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(c1Var.f49894a, i13, strArr[i13]);
                                                }
                                                int i14 = c1Var.f49894a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    c1.c(i11, i12, c1Var.f49894a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        c1Var.f49895b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(c1Var.f49894a, str3)));
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
                                        map2.put((String) entry.getKey(), c1Var);
                                        i10 = 0;
                                    }
                                    p0Var.f50026r = DesugarCollections.unmodifiableMap(map2);
                                    tu0 tu0Var = p0Var.f50016g;
                                    if (b1Var.h.getWidth() != tu0Var.f32893a || b1Var.h.getHeight() != tu0Var.f32894b) {
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) tu0Var.f32893a, (int) tu0Var.f32894b, Bitmap.Config.ARGB_8888);
                                        new Canvas(bitmapCreateBitmap).drawBitmap(b1Var.h, (Rect) null, new RectF(0.0f, 0.0f, tu0Var.f32893a, tu0Var.f32894b), (Paint) null);
                                        b1Var.h = bitmapCreateBitmap;
                                        b1Var.f49884r = true;
                                    }
                                    Bitmap bitmap2 = b1Var.f49883n;
                                    if (bitmap2 != null && (bitmap2.getWidth() != tu0Var.f32893a || b1Var.f49883n.getHeight() != tu0Var.f32894b)) {
                                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((int) tu0Var.f32893a, (int) tu0Var.f32894b, Bitmap.Config.ARGB_8888);
                                        new Canvas(bitmapCreateBitmap2).drawBitmap(b1Var.f49883n, (Rect) null, new RectF(0.0f, 0.0f, tu0Var.f32893a, tu0Var.f32894b), (Paint) null);
                                        b1Var.f49883n = bitmapCreateBitmap2;
                                        b1Var.f49884r = true;
                                    }
                                    Bitmap bitmap3 = b1Var.h;
                                    Bitmap bitmap4 = b1Var.f49883n;
                                    if (p0Var.f50019k == null) {
                                        p0Var.f50019k = new q1(bitmap3);
                                    }
                                    if (p0Var.D == null) {
                                        p0Var.D = new q1(bitmap4);
                                    }
                                    if (p0Var.G && p0Var.f50020l == null) {
                                        p0Var.f50020l = new q1(p0Var.A);
                                    }
                                    n8.a();
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        rl.r(this.f50131b, new StringBuilder("eglMakeCurrent failed "));
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
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        rl.r(this.f50131b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    rl.r(this.f50131b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f50134f = z10;
        super.run();
    }
}
