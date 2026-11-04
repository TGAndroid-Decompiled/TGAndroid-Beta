package yh;

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
    public EGLSurface E;
    public EGLContext F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int[] P;
    public float Q;
    public final e R;
    public final c f59486c;
    public final SurfaceTexture d;
    public boolean f59488f;
    public int h;
    public int f59489n;
    public int f59490r;
    public EGL10 f59492w;
    public EGLDisplay f59493x;
    public EGLConfig f59494y;
    public volatile boolean f59484a = true;
    public volatile boolean f59485b = false;
    public final Object f59487e = new Object();
    public final float f59491s = g0.N(1.2f);
    public boolean N = true;
    public int O = 0;

    public d(e eVar, SurfaceTexture surfaceTexture, int i3, int i10, c cVar) {
        this.R = eVar;
        this.f59486c = cVar;
        this.d = surfaceTexture;
        this.h = i3;
        this.f59489n = i10;
        this.f59490r = (int) Utilities.i(((i3 * i10) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
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
        int[] iArr = this.P;
        if (iArr != null) {
            GLES20.glDeleteBuffers(2, iArr, 0);
        }
        int[] iArr2 = new int[2];
        this.P = iArr2;
        GLES20.glGenBuffers(2, iArr2, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            GLES20.glBindBuffer(34962, this.P[i3]);
            GLES20.glBufferData(34962, this.f59490r * 24, null, 35048);
        }
        a();
    }

    @Override
    public final void run() {
        float f10;
        int i3;
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f59492w = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f59493x = eglGetDisplay;
        int i11 = 3;
        int i12 = 2;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.f59484a = false;
        } else {
            if (!this.f59492w.eglInitialize(eglGetDisplay, new int[2])) {
                this.f59484a = false;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.f59492w.eglChooseConfig(this.f59493x, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.f59484a = false;
                } else {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.f59494y = eGLConfig;
                    EGLContext eglCreateContext = this.f59492w.eglCreateContext(this.f59493x, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.F = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.f59484a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.f59492w.eglCreateWindowSurface(this.f59493x, this.f59494y, this.d, null);
                        this.E = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.f59484a = false;
                        } else if (!this.f59492w.eglMakeCurrent(this.f59493x, eglCreateWindowSurface, eglCreateWindowSurface, this.F)) {
                            this.f59484a = false;
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
                                    this.f59484a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, g0.y2(null, 2131624212));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        a8.d("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.f59484a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.G = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.f59484a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.G, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.G, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.G);
                                            GLES20.glGetProgramiv(this.G, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                a8.d("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.G));
                                                this.f59484a = false;
                                            } else {
                                                this.H = GLES20.glGetUniformLocation(this.G, "reset");
                                                this.I = GLES20.glGetUniformLocation(this.G, "time");
                                                this.J = GLES20.glGetUniformLocation(this.G, "deltaTime");
                                                this.K = GLES20.glGetUniformLocation(this.G, "size");
                                                this.L = GLES20.glGetUniformLocation(this.G, "r");
                                                this.M = GLES20.glGetUniformLocation(this.G, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.f59489n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.G);
                                                GLES20.glUniform2f(this.K, this.h, this.f59489n);
                                                int i13 = this.H;
                                                if (this.N) {
                                                    f10 = 1.0f;
                                                } else {
                                                    f10 = 0.0f;
                                                }
                                                GLES20.glUniform1f(i13, f10);
                                                GLES20.glUniform1f(this.L, this.f59491s);
                                                GLES20.glUniform1f(this.M, Utilities.f21386c.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f59484a = false;
                            }
                        }
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        while (this.f59484a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            e eVar = this.R;
            double d10 = eVar.f59496a;
            if (d < d10) {
                double d11 = d10 - d;
                long j10 = (long) (d11 * 1000.0d);
                i3 = i11;
                i10 = i12;
                try {
                    Thread.sleep(j10, (int) ((d11 - (j10 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.R.f59496a;
            } else {
                i3 = i11;
                i10 = i12;
                double d12 = eVar.f59497b;
                if (d > d12) {
                    d = d12;
                }
            }
            while (this.f59485b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.f59487e) {
                try {
                    if (this.f59488f) {
                        GLES20.glUniform2f(this.K, this.h, this.f59489n);
                        GLES20.glViewport(0, 0, this.h, this.f59489n);
                        int i14 = (int) Utilities.i(((this.h * this.f59489n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (i14 > this.f59490r) {
                            this.N = true;
                            b();
                        }
                        this.f59490r = i14;
                        this.f59488f = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            float f11 = (float) d;
            EGL10 egl102 = this.f59492w;
            EGLDisplay eGLDisplay = this.f59493x;
            EGLSurface eGLSurface = this.E;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.F)) {
                this.f59484a = false;
            } else {
                float f12 = f11 * 0.65f;
                float f13 = this.Q + f12;
                this.Q = f13;
                if (f13 > 1000.0f) {
                    this.Q = 0.0f;
                }
                GLES20.glClear(16384);
                GLES20.glBindBuffer(34962, this.P[this.O]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i3);
                GLES30.glBindBufferBase(35982, 0, this.P[1 - this.O]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i3);
                GLES20.glUniform1f(this.I, this.Q);
                GLES20.glUniform1f(this.J, f12);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.f59490r);
                GLES30.glEndTransformFeedback();
                if (this.N) {
                    this.N = false;
                    GLES20.glUniform1f(this.H, 0.0f);
                }
                this.O = 1 - this.O;
                this.f59492w.eglSwapBuffers(this.f59493x, this.E);
                a();
            }
            g0.r(this.f59486c);
            g0.h3(this.f59486c);
            i11 = i3;
            nanoTime = nanoTime2;
            i12 = i10;
        }
        int i15 = i12;
        int[] iArr2 = this.P;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(i15, iArr2, 0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.P = null;
        }
        int i16 = this.G;
        if (i16 != 0) {
            try {
                GLES20.glDeleteProgram(i16);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            this.G = 0;
        }
        EGL10 egl103 = this.f59492w;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.f59493x;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                this.f59492w.eglDestroySurface(this.f59493x, this.E);
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            try {
                this.f59492w.eglDestroyContext(this.f59493x, this.F);
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
