package wi;

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
public final class v0 {
    public static final float[] f58233n = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    public final int f58234a;
    public final FloatBuffer d;
    public final HandlerThread f58237e;
    public int f58240i;
    public int f58241j;
    public SurfaceTexture f58242k;
    public Surface f58243l;
    public boolean f58244m;
    public final Object f58235b = new Object();
    public final float[] f58236c = new float[16];
    public EGLDisplay f58238f = EGL14.EGL_NO_DISPLAY;
    public EGLContext f58239g = EGL14.EGL_NO_CONTEXT;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;

    public v0(Surface surface, int i7) {
        this.f58234a = i7;
        FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(64));
        this.d = g10;
        g10.put(f58233n).position(0);
        HandlerThread handlerThread = new HandlerThread("RoundVideoTranscoderFrames");
        this.f58237e = handlerThread;
        handlerThread.start();
        try {
            c(surface);
            this.f58240i = b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i10 = iArr[0];
            this.f58241j = i10;
            GLES20.glBindTexture(36197, i10);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f58241j);
            this.f58242k = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new p(this, 2), new Handler(handlerThread.getLooper()));
            this.f58243l = new Surface(this.f58242k);
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
        throw new IllegalStateException(rf.b.i("Unable to compile shader: ", glGetShaderInfoLog));
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
        throw new IllegalStateException(rf.b.i("Unable to link program: ", glGetProgramInfoLog));
    }

    public final void c(Surface surface) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f58238f = eglGetDisplay;
        int[] iArr = new int[2];
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY && EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f58238f, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f58238f, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                this.f58239g = eglCreateContext;
                if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f58238f, eGLConfigArr[0], surface, new int[]{12344}, 0);
                    this.h = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        if (EGL14.eglMakeCurrent(this.f58238f, eglCreateWindowSurface, eglCreateWindowSurface, this.f58239g)) {
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
        EGLDisplay eGLDisplay = this.f58238f;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = this.h;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58239g);
            int i7 = this.f58240i;
            if (i7 != 0) {
                GLES20.glDeleteProgram(i7);
            }
            int i10 = this.f58241j;
            if (i10 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i10}, 0);
            }
            EGLDisplay eGLDisplay2 = this.f58238f;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.h;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f58238f, eGLSurface3);
            }
            EGLContext eGLContext = this.f58239g;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f58238f, eGLContext);
            }
            EGL14.eglReleaseThread();
        }
        this.f58238f = EGL14.EGL_NO_DISPLAY;
        this.f58239g = EGL14.EGL_NO_CONTEXT;
        this.h = EGL14.EGL_NO_SURFACE;
        this.f58240i = 0;
        this.f58241j = 0;
        Surface surface = this.f58243l;
        if (surface != null) {
            surface.release();
            this.f58243l = null;
        }
        SurfaceTexture surfaceTexture = this.f58242k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f58242k = null;
        }
        this.f58237e.quitSafely();
    }
}
