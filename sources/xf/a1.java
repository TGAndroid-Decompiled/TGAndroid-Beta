package xf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import g7.j8;
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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.qu0;
public final class a1 extends DispatchQueue {
    public final SurfaceTexture f49159a;
    public EGL10 f49160b;
    public EGLDisplay f49161c;
    public EGLContext d;
    public EGLSurface f49162e;
    public boolean f49163f;
    public volatile boolean h;
    public int f49164n;
    public int f49165r;
    public z0 f49166s;
    public final ba v;
    public final ju0 f49167w;
    public final z0 f49168x;
    public final c1 f49169y;

    public a1(c1 c1Var, SurfaceTexture surfaceTexture, ba baVar) {
        super("CanvasInternal");
        this.f49169y = c1Var;
        this.f49167w = new ju0(this, 9);
        this.f49168x = new z0(this, 0);
        this.v = baVar;
        this.f49159a = surfaceTexture;
    }

    public static void b(a1 a1Var) {
        if (!a1Var.f49163f) {
            return;
        }
        if (a1Var.d.equals(a1Var.f49160b.eglGetCurrentContext()) && a1Var.f49162e.equals(a1Var.f49160b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = a1Var.f49160b;
        EGLDisplay eGLDisplay = a1Var.f49161c;
        EGLSurface eGLSurface = a1Var.f49162e;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
    }

    public final void finish() {
        ba baVar = this.v;
        if (this.f49162e != null) {
            EGL10 egl10 = this.f49160b;
            EGLDisplay eGLDisplay = this.f49161c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f49160b.eglDestroySurface(this.f49161c, this.f49162e);
            this.f49162e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (baVar != null) {
                synchronized (baVar.f27124f) {
                    try {
                        if (baVar.f27125g == eGLContext) {
                            baVar.f27125g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f49160b.eglDestroyContext(this.f49161c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f49161c;
        if (eGLDisplay2 != null) {
            this.f49160b.eglTerminate(eGLDisplay2);
            this.f49161c = null;
        }
        if (baVar != null) {
            z0 z0Var = this.f49168x;
            ArrayList arrayList = baVar.f27123e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && baVar.d.isEmpty()) {
                baVar.f27131n.a();
            }
        }
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        Bitmap bitmap;
        c1 c1Var = this.f49169y;
        Bitmap bitmap2 = c1Var.h;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            SurfaceTexture surfaceTexture = this.f49159a;
            ba baVar = this.v;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f49160b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f49161c = eglGetDisplay;
            int i9 = 0;
            r6 = false;
            r6 = false;
            r6 = false;
            r6 = false;
            boolean z10 = false;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    ll.t(this.f49160b, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
            } else {
                if (!this.f49160b.eglInitialize(eglGetDisplay, new int[2])) {
                    if (BuildVars.LOGS_ENABLED) {
                        ll.t(this.f49160b, new StringBuilder("eglInitialize failed "));
                    }
                    finish();
                } else {
                    int[] iArr = new int[1];
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!this.f49160b.eglChooseConfig(this.f49161c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                        if (BuildVars.LOGS_ENABLED) {
                            ll.t(this.f49160b, new StringBuilder("eglChooseConfig failed "));
                        }
                        finish();
                    } else {
                        if (iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            int[] iArr2 = {12440, 2, 12344};
                            if (baVar != null) {
                                synchronized (baVar.f27124f) {
                                    try {
                                        eGLContext = baVar.f27125g;
                                        if (eGLContext == null) {
                                            eGLContext = EGL10.EGL_NO_CONTEXT;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                            EGLContext eglCreateContext = this.f49160b.eglCreateContext(this.f49161c, eGLConfig, eGLContext, iArr2);
                            this.d = eglCreateContext;
                            if (eglCreateContext == null) {
                                if (BuildVars.LOGS_ENABLED) {
                                    ll.t(this.f49160b, new StringBuilder("eglCreateContext failed "));
                                }
                                finish();
                            } else {
                                if (baVar != null) {
                                    baVar.a(eglCreateContext);
                                    baVar.f27123e.add(this.f49168x);
                                }
                                if (surfaceTexture != null) {
                                    EGLSurface eglCreateWindowSurface = this.f49160b.eglCreateWindowSurface(this.f49161c, eGLConfig, surfaceTexture, null);
                                    this.f49162e = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                                        if (!this.f49160b.eglMakeCurrent(this.f49161c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                ll.t(this.f49160b, new StringBuilder("eglMakeCurrent failed "));
                                            }
                                            finish();
                                        } else {
                                            GLES20.glEnable(3042);
                                            GLES20.glDisable(3024);
                                            GLES20.glDisable(2960);
                                            GLES20.glDisable(2929);
                                            q0 q0Var = c1Var.f49180c;
                                            q0Var.getClass();
                                            Map map = e1.f49215a;
                                            HashMap hashMap = new HashMap();
                                            for (Map.Entry entry : e1.f49215a.entrySet()) {
                                                Map map2 = (Map) entry.getValue();
                                                String str = (String) map2.get("fragment");
                                                String[] strArr = (String[]) map2.get("attributes");
                                                String[] strArr2 = (String[]) map2.get("uniforms");
                                                ?? obj = new Object();
                                                obj.f49213b = new HashMap();
                                                obj.f49212a = GLES20.glCreateProgram();
                                                d5.p b10 = d1.b(35633, (String) map2.get("vertex"));
                                                int i10 = b10.f4376a;
                                                if (b10.f4377b == 0) {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("Vertex shader compilation failed");
                                                    }
                                                    d1.c(i10, i9, obj.f49212a);
                                                } else {
                                                    d5.p b11 = d1.b(35632, str);
                                                    int i11 = b11.f4376a;
                                                    if (b11.f4377b == 0) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.e("Fragment shader compilation failed");
                                                        }
                                                        d1.c(i10, i11, obj.f49212a);
                                                    } else {
                                                        GLES20.glAttachShader(obj.f49212a, i10);
                                                        GLES20.glAttachShader(obj.f49212a, i11);
                                                        for (int i12 = 0; i12 < strArr.length; i12++) {
                                                            GLES20.glBindAttribLocation(obj.f49212a, i12, strArr[i12]);
                                                        }
                                                        int i13 = obj.f49212a;
                                                        GLES20.glLinkProgram(i13);
                                                        int[] iArr3 = new int[1];
                                                        GLES20.glGetProgramiv(i13, 35714, iArr3, i9);
                                                        if (iArr3[i9] == 0 && BuildVars.LOGS_ENABLED) {
                                                            FileLog.e(GLES20.glGetProgramInfoLog(i13));
                                                        }
                                                        if (iArr3[i9] == 0) {
                                                            d1.c(i10, i11, obj.f49212a);
                                                        } else {
                                                            for (String str2 : strArr2) {
                                                                obj.f49213b.put(str2, Integer.valueOf(GLES20.glGetUniformLocation(obj.f49212a, str2)));
                                                            }
                                                            if (i10 != 0) {
                                                                GLES20.glDeleteShader(i10);
                                                            }
                                                            if (i11 != 0) {
                                                                GLES20.glDeleteShader(i11);
                                                            }
                                                        }
                                                    }
                                                }
                                                hashMap.put((String) entry.getKey(), obj);
                                                i9 = 0;
                                            }
                                            q0Var.f49325r = DesugarCollections.unmodifiableMap(hashMap);
                                            qu0 qu0Var = q0Var.f49315g;
                                            if (c1Var.h.getWidth() != qu0Var.f32026a || c1Var.h.getHeight() != qu0Var.f32027b) {
                                                Bitmap createBitmap = Bitmap.createBitmap((int) qu0Var.f32026a, (int) qu0Var.f32027b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, qu0Var.f32026a, qu0Var.f32027b), (Paint) null);
                                                c1Var.h = createBitmap;
                                                c1Var.f49184r = true;
                                            }
                                            if (c1Var.f49183n != null && (bitmap.getWidth() != qu0Var.f32026a || c1Var.f49183n.getHeight() != qu0Var.f32027b)) {
                                                Bitmap createBitmap2 = Bitmap.createBitmap((int) qu0Var.f32026a, (int) qu0Var.f32027b, Bitmap.Config.ARGB_8888);
                                                new Canvas(createBitmap2).drawBitmap(c1Var.f49183n, (Rect) null, new RectF(0.0f, 0.0f, qu0Var.f32026a, qu0Var.f32027b), (Paint) null);
                                                c1Var.f49183n = createBitmap2;
                                                c1Var.f49184r = true;
                                            }
                                            Bitmap bitmap3 = c1Var.h;
                                            Bitmap bitmap4 = c1Var.f49183n;
                                            if (q0Var.f49318k == null) {
                                                q0Var.f49318k = new r1(bitmap3);
                                            }
                                            if (q0Var.D == null) {
                                                q0Var.D = new r1(bitmap4);
                                            }
                                            if (q0Var.G && q0Var.f49319l == null) {
                                                q0Var.f49319l = new r1(q0Var.A);
                                            }
                                            j8.a();
                                            z10 = true;
                                        }
                                    } else {
                                        if (BuildVars.LOGS_ENABLED) {
                                            ll.t(this.f49160b, new StringBuilder("createWindowSurface failed "));
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
            this.f49163f = z10;
            super.run();
        }
    }
}
