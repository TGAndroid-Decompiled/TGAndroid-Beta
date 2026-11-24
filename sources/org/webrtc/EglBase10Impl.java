package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;
public class EglBase10Impl implements EglBase10 {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final String TAG = "EglBase10Impl";
    private final EGL10 egl;
    private EGLSurface eglBackgroundSurface;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;

    private static class Context implements EglBase10.Context {
        private final EGL10 egl;
        private final EGLContext eglContext;
        private final EGLConfig eglContextConfig;

        public Context(EGL10 egl10, EGLContext eGLContext, EGLConfig eGLConfig) {
            this.egl = egl10;
            this.eglContext = eGLContext;
            this.eglContextConfig = eGLConfig;
        }

        @Override
        public long getNativeEglContext() {
            EGLContext eglGetCurrentContext = this.egl.eglGetCurrentContext();
            EGLDisplay eglGetCurrentDisplay = this.egl.eglGetCurrentDisplay();
            EGLSurface eglGetCurrentSurface = this.egl.eglGetCurrentSurface(12377);
            EGLSurface eglGetCurrentSurface2 = this.egl.eglGetCurrentSurface(12378);
            if (eglGetCurrentDisplay == EGL10.EGL_NO_DISPLAY) {
                eglGetCurrentDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            }
            EGLSurface eGLSurface = null;
            try {
                if (eglGetCurrentContext != this.eglContext) {
                    eGLSurface = this.egl.eglCreatePbufferSurface(eglGetCurrentDisplay, this.eglContextConfig, new int[]{12375, 1, 12374, 1, 12344});
                    if (!this.egl.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                        throw new RuntimeException("Failed to make temporary EGL surface active: " + this.egl.eglGetError());
                    }
                }
                return EglBase10Impl.access$000();
            } finally {
                if (0 != 0) {
                    this.egl.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
                    this.egl.eglDestroySurface(eglGetCurrentDisplay, null);
                }
            }
        }

        @Override
        public EGLContext getRawContext() {
            return this.eglContext;
        }
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.eglSurface = eGLSurface;
        this.eglBackgroundSurface = eGLSurface;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl = egl10;
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        this.eglConfig = getEglConfig(egl10, eglDisplay, iArr);
        int b = c.b(iArr);
        Logging.d("EglBase10Impl", "Using OpenGL ES version " + b);
        this.eglContext = createEglContext(eGLContext, this.eglDisplay, this.eglConfig, b);
    }

    public static long access$000() {
        return nativeGetCurrentNativeEGLContext();
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay != EGL10.EGL_NO_DISPLAY && this.eglContext != EGL10.EGL_NO_CONTEXT && this.eglConfig != null) {
            return;
        }
        zo4.k("This object has been released");
    }

    private EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == EGL10.EGL_NO_CONTEXT) {
            zo4.k("Invalid sharedContext");
            return null;
        }
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        wa3.c(Integer.toHexString(this.egl.eglGetError()), "Failed to create EGL context: 0x");
        return null;
    }

    private void createSurfaceInternal(Object obj, boolean z) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            dq9.m("Input must be either a SurfaceHolder or SurfaceTexture");
            return;
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (z) {
            if (this.eglBackgroundSurface == eGLSurface) {
                EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
                this.eglBackgroundSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == eGLSurface) {
                    wa3.c(Integer.toHexString(this.egl.eglGetError()), "Failed to create window surface: 0x");
                    return;
                }
                return;
            }
            zo4.k("Already has an EGLSurface");
        } else if (this.eglSurface == eGLSurface) {
            EGLSurface eglCreateWindowSurface2 = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
            this.eglSurface = eglCreateWindowSurface2;
            if (eglCreateWindowSurface2 != eGLSurface) {
                return;
            }
            wa3.c(Integer.toHexString(this.egl.eglGetError()), "Failed to create window surface: 0x");
        } else {
            zo4.k("Already has an EGLSurface");
        }
    }

    private static EGLConfig getEglConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            if (iArr2[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                zo4.k("eglChooseConfig returned null");
                return null;
            }
            zo4.k("Unable to find any matching EGL config");
            return null;
        }
        wa3.c(Integer.toHexString(egl10.eglGetError()), "eglChooseConfig failed: 0x");
        return null;
    }

    private EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        EGL10 egl10 = this.egl;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (egl10.eglInitialize(eglGetDisplay, new int[2])) {
                return eglGetDisplay;
            }
            wa3.c(Integer.toHexString(this.egl.eglGetError()), "Unable to initialize EGL10: 0x");
            return null;
        }
        wa3.c(Integer.toHexString(egl10.eglGetError()), "Unable to get EGL10 display: 0x");
        return null;
    }

    private static native long nativeGetCurrentNativeEGLContext();

    @Override
    public void createBackgroundSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture, true);
    }

    @Override
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface != eGLSurface2) {
                return;
            }
            StringBuilder o = ts2.o("Failed to create pixel buffer surface with size ", i, "x", i2, ": 0x");
            o.append(Integer.toHexString(this.egl.eglGetError()));
            throw new RuntimeException(o.toString());
        }
        zo4.k("Already has an EGLSurface");
    }

    @Override
    public void createSurface(Surface surface) {
        createSurfaceInternal(new FakeSurfaceHolder(surface), false);
    }

    @Override
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
            }
        }
    }

    @Override
    public EglBase.Context getEglBaseContext() {
        return new Context(this.egl, this.eglContext, this.eglConfig);
    }

    @Override
    public boolean hasBackgroundSurface() {
        if (this.eglBackgroundSurface != EGL10.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasSurface() {
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    @Override
    public void makeBackgroundCurrent() {
        checkIsNotReleased();
        if (this.eglBackgroundSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglBackgroundSurface;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            }
            return;
        }
        zo4.k("No EGLSurface - can't make current");
    }

    @Override
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            }
            return;
        }
        zo4.k("No EGLSurface - can't make current");
    }

    @Override
    public void release() {
        checkIsNotReleased();
        releaseSurface(false);
        releaseSurface(true);
        detachCurrent();
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override
    public void releaseSurface(boolean z) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (z) {
            EGLSurface eGLSurface2 = this.eglBackgroundSurface;
            if (eGLSurface2 != eGLSurface) {
                this.egl.eglDestroySurface(this.eglDisplay, eGLSurface2);
                this.eglBackgroundSurface = eGLSurface;
                return;
            }
            return;
        }
        EGLSurface eGLSurface3 = this.eglSurface;
        if (eGLSurface3 != eGLSurface) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface3);
            this.eglSurface = eGLSurface;
        }
    }

    @Override
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override
    public void swapBuffers(boolean z) {
        EGLSurface eGLSurface;
        if (z) {
            eGLSurface = this.eglBackgroundSurface;
        } else {
            eGLSurface = this.eglSurface;
        }
        checkIsNotReleased();
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                this.egl.eglSwapBuffers(this.eglDisplay, eGLSurface);
            }
            return;
        }
        zo4.k("No EGLSurface - can't swap buffers");
    }

    private class FakeSurfaceHolder implements SurfaceHolder {
        private final Surface surface;

        public FakeSurfaceHolder(Surface surface) {
            this.surface = surface;
        }

        @Override
        public Surface getSurface() {
            return this.surface;
        }

        @Override
        public Rect getSurfaceFrame() {
            return null;
        }

        @Override
        public boolean isCreating() {
            return false;
        }

        @Override
        public Canvas lockCanvas() {
            return null;
        }

        @Override
        public Canvas lockCanvas(Rect rect) {
            return null;
        }

        @Override
        public void setSizeFromLayout() {
        }

        @Override
        public void addCallback(SurfaceHolder.Callback callback) {
        }

        @Override
        public void removeCallback(SurfaceHolder.Callback callback) {
        }

        @Override
        public void setFormat(int i) {
        }

        @Override
        public void setKeepScreenOn(boolean z) {
        }

        @Override
        @Deprecated
        public void setType(int i) {
        }

        @Override
        public void unlockCanvasAndPost(Canvas canvas) {
        }

        @Override
        public void setFixedSize(int i, int i2) {
        }
    }

    @Override
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture, false);
    }

    @Override
    public void swapBuffers(long j, boolean z) {
        swapBuffers(z);
    }
}
