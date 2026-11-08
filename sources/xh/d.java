package xh;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
public final class d extends Thread {
    public EGLSurface D;
    public EGLContext E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int[] O;
    public float P;
    public final e Q;
    public final c f58768c;
    public final SurfaceTexture d;
    public boolean f58770f;
    public int h;
    public int f58771n;
    public int f58772r;
    public EGL10 f58774w;
    public EGLDisplay f58775x;
    public EGLConfig f58776y;
    public volatile boolean f58766a = true;
    public volatile boolean f58767b = false;
    public final Object f58769e = new Object();
    public final float f58773s = g0.N(1.2f);
    public boolean M = true;
    public int N = 0;

    public d(e eVar, SurfaceTexture surfaceTexture, int i7, int i10, c cVar) {
        this.Q = eVar;
        this.f58768c = cVar;
        this.d = surfaceTexture;
        this.h = i7;
        this.f58771n = i10;
        this.f58772r = (int) Utilities.i(((i7 * i10) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
    }

    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                a8.d("spoiler gles error " + glGetError);
            } else {
                return;
            }
        }
    }

    public final void b() {
        int[] iArr = this.O;
        if (iArr != null) {
            GLES20.glDeleteBuffers(2, iArr, 0);
        }
        int[] iArr2 = new int[2];
        this.O = iArr2;
        GLES20.glGenBuffers(2, iArr2, 0);
        for (int i7 = 0; i7 < 2; i7++) {
            GLES20.glBindBuffer(34962, this.O[i7]);
            GLES20.glBufferData(34962, this.f58772r * 24, null, 35048);
        }
        a();
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f58774w = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f58775x = eglGetDisplay;
        int i11 = 3;
        int i12 = 2;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.f58766a = false;
        } else {
            if (!this.f58774w.eglInitialize(eglGetDisplay, new int[2])) {
                this.f58766a = false;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.f58774w.eglChooseConfig(this.f58775x, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.f58766a = false;
                } else {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.f58776y = eGLConfig;
                    EGLContext eglCreateContext = this.f58774w.eglCreateContext(this.f58775x, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.E = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.f58766a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.f58774w.eglCreateWindowSurface(this.f58775x, this.f58776y, this.d, null);
                        this.D = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.f58766a = false;
                        } else if (!this.f58774w.eglMakeCurrent(this.f58775x, eglCreateWindowSurface, eglCreateWindowSurface, this.E)) {
                            this.f58766a = false;
                        } else {
                            b();
                            int glCreateShader = GLES20.glCreateShader(35633);
                            int glCreateShader2 = GLES20.glCreateShader(35632);
                            if (glCreateShader != 0 && glCreateShader2 != 0) {
                                GLES20.glShaderSource(glCreateShader, g0.y2(null, 2131624213));
                                GLES20.glCompileShader(glCreateShader);
                                int[] iArr = new int[1];
                                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                                if (iArr[0] == 0) {
                                    a8.d("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                                    GLES20.glDeleteShader(glCreateShader);
                                    this.f58766a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, g0.y2(null, 2131624212));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        a8.d("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.f58766a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.F = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.f58766a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.F, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.F, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.F);
                                            GLES20.glGetProgramiv(this.F, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                a8.d("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.F));
                                                this.f58766a = false;
                                            } else {
                                                this.G = GLES20.glGetUniformLocation(this.F, "reset");
                                                this.H = GLES20.glGetUniformLocation(this.F, "time");
                                                this.I = GLES20.glGetUniformLocation(this.F, "deltaTime");
                                                this.J = GLES20.glGetUniformLocation(this.F, "size");
                                                this.K = GLES20.glGetUniformLocation(this.F, "r");
                                                this.L = GLES20.glGetUniformLocation(this.F, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.f58771n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.F);
                                                GLES20.glUniform2f(this.J, this.h, this.f58771n);
                                                int i13 = this.G;
                                                if (this.M) {
                                                    f10 = 1.0f;
                                                } else {
                                                    f10 = 0.0f;
                                                }
                                                GLES20.glUniform1f(i13, f10);
                                                GLES20.glUniform1f(this.K, this.f58773s);
                                                GLES20.glUniform1f(this.L, Utilities.f21335c.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f58766a = false;
                            }
                        }
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        while (this.f58766a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            e eVar = this.Q;
            double d2 = eVar.f58778a;
            if (d < d2) {
                double d10 = d2 - d;
                long j3 = (long) (d10 * 1000.0d);
                i7 = i11;
                i10 = i12;
                try {
                    Thread.sleep(j3, (int) ((d10 - (j3 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.Q.f58778a;
            } else {
                i7 = i11;
                i10 = i12;
                double d11 = eVar.f58779b;
                if (d > d11) {
                    d = d11;
                }
            }
            while (this.f58767b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.f58769e) {
                try {
                    if (this.f58770f) {
                        GLES20.glUniform2f(this.J, this.h, this.f58771n);
                        GLES20.glViewport(0, 0, this.h, this.f58771n);
                        int i14 = (int) Utilities.i(((this.h * this.f58771n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (i14 > this.f58772r) {
                            this.M = true;
                            b();
                        }
                        this.f58772r = i14;
                        this.f58770f = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            float f11 = (float) d;
            EGL10 egl102 = this.f58774w;
            EGLDisplay eGLDisplay = this.f58775x;
            EGLSurface eGLSurface = this.D;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.E)) {
                this.f58766a = false;
            } else {
                float f12 = f11 * 0.65f;
                float f13 = this.P + f12;
                this.P = f13;
                if (f13 > 1000.0f) {
                    this.P = 0.0f;
                }
                GLES20.glClear(16384);
                GLES20.glBindBuffer(34962, this.O[this.N]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i7);
                GLES30.glBindBufferBase(35982, 0, this.O[1 - this.N]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i7);
                GLES20.glUniform1f(this.H, this.P);
                GLES20.glUniform1f(this.I, f12);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.f58772r);
                GLES30.glEndTransformFeedback();
                if (this.M) {
                    this.M = false;
                    GLES20.glUniform1f(this.G, 0.0f);
                }
                this.N = 1 - this.N;
                this.f58774w.eglSwapBuffers(this.f58775x, this.D);
                a();
            }
            g0.r(this.f58768c);
            g0.h3(this.f58768c);
            i11 = i7;
            nanoTime = nanoTime2;
            i12 = i10;
        }
        int i15 = i12;
        int[] iArr2 = this.O;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(i15, iArr2, 0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.O = null;
        }
        int i16 = this.F;
        if (i16 != 0) {
            try {
                GLES20.glDeleteProgram(i16);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            this.F = 0;
        }
        EGL10 egl103 = this.f58774w;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.f58775x;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                this.f58774w.eglDestroySurface(this.f58775x, this.D);
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            try {
                this.f58774w.eglDestroyContext(this.f58775x, this.E);
            } catch (Exception e14) {
                a8.g(e14, true);
            }
        }
        try {
            this.d.release();
        } catch (Exception e15) {
            a8.g(e15, true);
        }
        a();
    }
}
