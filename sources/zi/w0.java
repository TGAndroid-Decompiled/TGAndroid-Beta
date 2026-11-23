package zi;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.m10;
public final class w0 {
    public static final float[] f62474n = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    public final int f62475a;
    public final FloatBuffer d;
    public final HandlerThread f62478e;
    public int f62481i;
    public int f62482j;
    public SurfaceTexture f62483k;
    public Surface f62484l;
    public boolean f62485m;
    public final Object f62476b = new Object();
    public final float[] f62477c = new float[16];
    public EGLDisplay f62479f = EGL14.EGL_NO_DISPLAY;
    public EGLContext f62480g = EGL14.EGL_NO_CONTEXT;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;

    public w0(Surface surface, int i7) {
        this.f62475a = i7;
        FloatBuffer i10 = m10.i(ByteBuffer.allocateDirect(64));
        this.d = i10;
        i10.put(f62474n).position(0);
        HandlerThread handlerThread = new HandlerThread("RoundVideoTranscoderFrames");
        this.f62478e = handlerThread;
        handlerThread.start();
        try {
            c(surface);
            this.f62481i = b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i11 = iArr[0];
            this.f62482j = i11;
            GLES20.glBindTexture(36197, i11);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f62482j);
            this.f62483k = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new p(this, 2), new Handler(handlerThread.getLooper()));
            this.f62484l = new Surface(this.f62483k);
        } catch (RuntimeException e10) {
            d();
            throw e10;
        }
    }

    public static int a(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(p5.c.k("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static int b() {
        int a10 = a(35633, "uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * aTextureCoord).xy;\n}\n");
        int a11 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glAttachShader(glCreateProgram, a11);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glDeleteShader(a10);
        GLES20.glDeleteShader(a11);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(p5.c.k("Unable to link program: ", glGetProgramInfoLog));
    }

    public final void c(Surface surface) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f62479f = eglGetDisplay;
        int[] iArr = new int[2];
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY && EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f62479f, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f62479f, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                this.f62480g = eglCreateContext;
                if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f62479f, eGLConfigArr[0], surface, new int[]{12344}, 0);
                    this.h = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        if (EGL14.eglMakeCurrent(this.f62479f, eglCreateWindowSurface, eglCreateWindowSurface, this.f62480g)) {
                            return;
                        }
                        throw new IllegalStateException("Unable to make EGL context current");
                    }
                    throw new IllegalStateException("Unable to create EGL surface");
                }
                throw new IllegalStateException("Unable to create EGL context");
            }
            throw new IllegalStateException("Unable to choose EGL config");
        }
        throw new IllegalStateException("Unable to initialize EGL");
    }

    public final void d() {
        EGLDisplay eGLDisplay = this.f62479f;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = this.h;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f62480g);
            int i7 = this.f62481i;
            if (i7 != 0) {
                GLES20.glDeleteProgram(i7);
            }
            int i10 = this.f62482j;
            if (i10 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i10}, 0);
            }
            EGLDisplay eGLDisplay2 = this.f62479f;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.h;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f62479f, eGLSurface3);
            }
            EGLContext eGLContext = this.f62480g;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f62479f, eGLContext);
            }
            EGL14.eglReleaseThread();
        }
        this.f62479f = EGL14.EGL_NO_DISPLAY;
        this.f62480g = EGL14.EGL_NO_CONTEXT;
        this.h = EGL14.EGL_NO_SURFACE;
        this.f62481i = 0;
        this.f62482j = 0;
        Surface surface = this.f62484l;
        if (surface != null) {
            surface.release();
            this.f62484l = null;
        }
        SurfaceTexture surfaceTexture = this.f62483k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f62483k = null;
        }
        this.f62478e.quitSafely();
    }
}
