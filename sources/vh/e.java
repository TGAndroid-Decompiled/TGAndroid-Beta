package vh;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class e extends Thread {
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
    public final f Q;
    public final d f44665c;
    public final SurfaceTexture d;
    public boolean f44666f;
    public int h;
    public int f44667n;
    public int f44668r;
    public EGL10 v;
    public EGLDisplay f44670w;
    public EGLConfig f44671x;
    public EGLSurface f44672y;
    public volatile boolean f44663a = true;
    public volatile boolean f44664b = false;
    public final Object e = new Object();
    public final float f44669s = AndroidUtilities.dpf2(1.2f);
    public boolean M = true;
    public int N = 0;

    public e(f fVar, SurfaceTexture surfaceTexture, int i10, int i11, d dVar) {
        this.Q = fVar;
        this.f44665c = dVar;
        this.d = surfaceTexture;
        this.h = i10;
        this.f44667n = i11;
        this.f44668r = (int) Utilities.clamp(((i10 * i11) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
    }

    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                FileLog.e("spoiler gles error " + glGetError);
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
        for (int i10 = 0; i10 < 2; i10++) {
            GLES20.glBindBuffer(34962, this.O[i10]);
            GLES20.glBufferData(34962, this.f44668r * 24, null, 35048);
        }
        a();
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.v = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f44670w = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.f44663a = false;
        } else {
            if (!this.v.eglInitialize(eglGetDisplay, new int[2])) {
                this.f44663a = false;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.v.eglChooseConfig(this.f44670w, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.f44663a = false;
                } else {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.f44671x = eGLConfig;
                    EGLContext eglCreateContext = this.v.eglCreateContext(this.f44670w, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.E = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.f44663a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.v.eglCreateWindowSurface(this.f44670w, this.f44671x, this.d, null);
                        this.f44672y = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.f44663a = false;
                        } else if (!this.v.eglMakeCurrent(this.f44670w, eglCreateWindowSurface, eglCreateWindowSurface, this.E)) {
                            this.f44663a = false;
                        } else {
                            b();
                            int glCreateShader = GLES20.glCreateShader(35633);
                            int glCreateShader2 = GLES20.glCreateShader(35632);
                            if (glCreateShader != 0 && glCreateShader2 != 0) {
                                GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(R.raw.spoiler_vertex));
                                GLES20.glCompileShader(glCreateShader);
                                int[] iArr = new int[1];
                                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                                if (iArr[0] == 0) {
                                    FileLog.e("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                                    GLES20.glDeleteShader(glCreateShader);
                                    this.f44663a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, AndroidUtilities.readRes(R.raw.spoiler_fragment));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.f44663a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.F = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.f44663a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.F, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.F, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.F);
                                            GLES20.glGetProgramiv(this.F, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                FileLog.e("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.F));
                                                this.f44663a = false;
                                            } else {
                                                this.G = GLES20.glGetUniformLocation(this.F, "reset");
                                                this.H = GLES20.glGetUniformLocation(this.F, "time");
                                                this.I = GLES20.glGetUniformLocation(this.F, "deltaTime");
                                                this.J = GLES20.glGetUniformLocation(this.F, "size");
                                                this.K = GLES20.glGetUniformLocation(this.F, "r");
                                                this.L = GLES20.glGetUniformLocation(this.F, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.f44667n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.F);
                                                GLES20.glUniform2f(this.J, this.h, this.f44667n);
                                                int i11 = this.G;
                                                if (this.M) {
                                                    f7 = 1.0f;
                                                } else {
                                                    f7 = 0.0f;
                                                }
                                                GLES20.glUniform1f(i11, f7);
                                                GLES20.glUniform1f(this.K, this.f44669s);
                                                GLES20.glUniform1f(this.L, Utilities.fastRandom.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f44663a = false;
                            }
                        }
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        while (this.f44663a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            f fVar = this.Q;
            double d10 = fVar.f44674a;
            if (d < d10) {
                double d11 = d10 - d;
                long j3 = (long) (d11 * 1000.0d);
                i10 = 3;
                try {
                    Thread.sleep(j3, (int) ((d11 - (j3 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.Q.f44674a;
            } else {
                i10 = 3;
                double d12 = fVar.f44675b;
                if (d > d12) {
                    d = d12;
                }
            }
            while (this.f44664b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.e) {
                try {
                    if (this.f44666f) {
                        GLES20.glUniform2f(this.J, this.h, this.f44667n);
                        GLES20.glViewport(0, 0, this.h, this.f44667n);
                        int clamp = (int) Utilities.clamp(((this.h * this.f44667n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (clamp > this.f44668r) {
                            this.M = true;
                            b();
                        }
                        this.f44668r = clamp;
                        this.f44666f = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            float f10 = (float) d;
            EGL10 egl102 = this.v;
            EGLDisplay eGLDisplay = this.f44670w;
            EGLSurface eGLSurface = this.f44672y;
            if (!egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.E)) {
                this.f44663a = false;
            } else {
                float f11 = f10 * 0.65f;
                float f12 = this.P + f11;
                this.P = f12;
                if (f12 > 1000.0f) {
                    this.P = 0.0f;
                }
                GLES20.glClear(16384);
                GLES20.glBindBuffer(34962, this.O[this.N]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i10);
                GLES30.glBindBufferBase(35982, 0, this.O[1 - this.N]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glUniform1f(this.H, this.P);
                GLES20.glUniform1f(this.I, f11);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.f44668r);
                GLES30.glEndTransformFeedback();
                if (this.M) {
                    this.M = false;
                    GLES20.glUniform1f(this.G, 0.0f);
                }
                this.N = 1 - this.N;
                this.v.eglSwapBuffers(this.f44670w, this.f44672y);
                a();
            }
            AndroidUtilities.cancelRunOnUIThread(this.f44665c);
            AndroidUtilities.runOnUIThread(this.f44665c);
            nanoTime = nanoTime2;
        }
        int[] iArr2 = this.O;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(2, iArr2, 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.O = null;
        }
        int i12 = this.F;
        if (i12 != 0) {
            try {
                GLES20.glDeleteProgram(i12);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.F = 0;
        }
        EGL10 egl103 = this.v;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.f44670w;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                this.v.eglDestroySurface(this.f44670w, this.f44672y);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            try {
                this.v.eglDestroyContext(this.f44670w, this.E);
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        try {
            this.d.release();
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        a();
    }
}
