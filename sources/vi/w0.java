package vi;

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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.b10;
public final class w0 {
    public static final float[] f50682n = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    public final int f50683a;
    public final FloatBuffer d;
    public final HandlerThread e;
    public int f50688i;
    public int f50689j;
    public SurfaceTexture f50690k;
    public Surface f50691l;
    public boolean f50692m;
    public final Object f50684b = new Object();
    public final float[] f50685c = new float[16];
    public EGLDisplay f50686f = EGL14.EGL_NO_DISPLAY;
    public EGLContext f50687g = EGL14.EGL_NO_CONTEXT;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;

    public w0(Surface surface, int i10) {
        this.f50683a = i10;
        FloatBuffer h = wh.h(ByteBuffer.allocateDirect(64));
        this.d = h;
        h.put(f50682n).position(0);
        HandlerThread handlerThread = new HandlerThread("RoundVideoTranscoderFrames");
        this.e = handlerThread;
        handlerThread.start();
        try {
            c(surface);
            this.f50688i = b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i11 = iArr[0];
            this.f50689j = i11;
            GLES20.glBindTexture(36197, i11);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f50689j);
            this.f50690k = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new q(this, 2), new Handler(handlerThread.getLooper()));
            this.f50691l = new Surface(this.f50690k);
        } catch (RuntimeException e) {
            d();
            throw e;
        }
    }

    public static int a(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(b10.j("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static int b() {
        int a2 = a(35633, "uniform mat4 uTextureMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = (uTextureMatrix * aTextureCoord).xy;\n}\n");
        int a10 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glDeleteShader(a2);
        GLES20.glDeleteShader(a10);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(b10.j("Unable to link program: ", glGetProgramInfoLog));
    }

    public final void c(Surface surface) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f50686f = eglGetDisplay;
        int[] iArr = new int[2];
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY && EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig(this.f50686f, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] != 0) {
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f50686f, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                this.f50687g = eglCreateContext;
                if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f50686f, eGLConfigArr[0], surface, new int[]{12344}, 0);
                    this.h = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        if (EGL14.eglMakeCurrent(this.f50686f, eglCreateWindowSurface, eglCreateWindowSurface, this.f50687g)) {
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
        EGLDisplay eGLDisplay = this.f50686f;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = this.h;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f50687g);
            int i10 = this.f50688i;
            if (i10 != 0) {
                GLES20.glDeleteProgram(i10);
            }
            int i11 = this.f50689j;
            if (i11 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            }
            EGLDisplay eGLDisplay2 = this.f50686f;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.h;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f50686f, eGLSurface3);
            }
            EGLContext eGLContext = this.f50687g;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.f50686f, eGLContext);
            }
            EGL14.eglReleaseThread();
        }
        this.f50686f = EGL14.EGL_NO_DISPLAY;
        this.f50687g = EGL14.EGL_NO_CONTEXT;
        this.h = EGL14.EGL_NO_SURFACE;
        this.f50688i = 0;
        this.f50689j = 0;
        Surface surface = this.f50691l;
        if (surface != null) {
            surface.release();
            this.f50691l = null;
        }
        SurfaceTexture surfaceTexture = this.f50690k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f50690k = null;
        }
        this.e.quitSafely();
    }
}
