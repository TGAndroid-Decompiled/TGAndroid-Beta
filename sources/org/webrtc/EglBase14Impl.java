package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import org.webrtc.EglBase14;
public class EglBase14Impl implements EglBase14 {
    private static final EglConnection EGL_NO_CONNECTION = new EglConnection(0);
    private static final String TAG = "EglBase14Impl";
    private EglConnection eglConnection;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    private boolean detachSurfaceOnRelease = false;

    public static class Context implements EglBase14.Context {
        private final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        @Override
        public long getNativeEglContext() {
            return this.egl14Context.getNativeHandle();
        }

        @Override
        public EGLContext getRawContext() {
            return this.egl14Context;
        }
    }

    public EglBase14Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    public static EGLDisplay c() {
        return getEglDisplay();
    }

    private void checkIsNotReleased() {
        if (this.eglConnection != EGL_NO_CONNECTION) {
            return;
        }
        xi4.l("This object has been released");
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == EGL14.EGL_NO_CONTEXT) {
            xi4.l("Invalid sharedContext");
            return null;
        }
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        int eglGetError = EGL14.eglGetError();
        String hexString = Integer.toHexString(EGL14.eglGetError());
        throw new GLException(eglGetError, "Failed to create EGL context: 0x" + hexString);
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            grb.i("Input must be either a Surface or SurfaceTexture");
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), obj, new int[]{12344}, 0);
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                return;
            }
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            int eglGetError = EGL14.eglGetError();
            String hexString = Integer.toHexString(EGL14.eglGetError());
            throw new GLException(eglGetError, "Failed to create window surface: 0x" + hexString);
        }
        xi4.l("Already has an EGLSurface");
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            if (iArr2[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                xi4.l("eglChooseConfig returned null");
                return null;
            }
            xi4.l("Unable to find any matching EGL config");
            return null;
        }
        int eglGetError = EGL14.eglGetError();
        String hexString = Integer.toHexString(EGL14.eglGetError());
        throw new GLException(eglGetError, "eglChooseConfig failed: 0x" + hexString);
    }

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            int eglGetError = EGL14.eglGetError();
            String hexString = Integer.toHexString(EGL14.eglGetError());
            throw new GLException(eglGetError, "Unable to initialize EGL14: 0x" + hexString);
        }
        int eglGetError2 = EGL14.eglGetError();
        String hexString2 = Integer.toHexString(EGL14.eglGetError());
        throw new GLException(eglGetError2, "Unable to get EGL14 display: 0x" + hexString2);
    }

    @Override
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface != null && eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                return;
            }
            this.eglSurface = EGL14.EGL_NO_SURFACE;
            int eglGetError = EGL14.eglGetError();
            StringBuilder p = bs2.p("Failed to create pixel buffer surface with size ", i, "x", i2, ": 0x");
            p.append(Integer.toHexString(EGL14.eglGetError()));
            throw new GLException(eglGetError, p.toString());
        }
        xi4.l("Already has an EGLSurface");
    }

    @Override
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override
    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    @Override
    public Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    @Override
    public boolean hasSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    @Override
    public void makeCurrent() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            this.eglConnection.makeCurrent(eGLSurface);
        } else {
            xi4.l("No EGLSurface - can't make current");
        }
    }

    @Override
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        this.eglConnection.release();
        this.eglConnection = EGL_NO_CONNECTION;
    }

    @Override
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            if (this.detachSurfaceOnRelease && eGLSurface.equals(EGL14.eglGetCurrentSurface(12377))) {
                detachCurrent();
            }
            EGL14.eglDestroySurface(this.eglConnection.getDisplay(), this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override
    public void setDetachSurfaceOnRelease(boolean z) {
        this.detachSurfaceOnRelease = z;
    }

    @Override
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override
    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglConnection.getDisplay(), this.eglSurface, j);
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        xi4.l("No EGLSurface - can't swap buffers");
    }

    @Override
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public EglBase14Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        xi4.l("No EGLSurface - can't swap buffers");
    }

    public static class EglConnection implements EglBase14.EglConnection {
        private EGLSurface currentSurface;
        private final EGLConfig eglConfig;
        private final EGLContext eglContext;
        private final EGLDisplay eglDisplay;
        private final RefCountDelegate refCountDelegate;

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            EGLDisplay c = EglBase14Impl.c();
            this.eglDisplay = c;
            EGLConfig eglConfig = EglBase14Impl.getEglConfig(c, iArr);
            this.eglConfig = eglConfig;
            int b = c.b(iArr);
            Logging.d("EglBase14Impl", "Using OpenGL ES version " + b);
            this.eglContext = EglBase14Impl.createEglContext(eGLContext, c, eglConfig, b);
            this.refCountDelegate = new RefCountDelegate(new zg3(this, (byte) 22));
        }

        public static void a(EglConnection eglConnection) {
            eglConnection.lambda$new$0();
        }

        public void lambda$new$0() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
            this.currentSurface = EGL14.EGL_NO_SURFACE;
        }

        public void detachCurrent() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    int eglGetError = EGL14.eglGetError();
                    throw new GLException(eglGetError, "eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            }
            this.currentSurface = EGL14.EGL_NO_SURFACE;
        }

        @Override
        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        @Override
        public EGLContext getContext() {
            return this.eglContext;
        }

        @Override
        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        public void makeCurrent(EGLSurface eGLSurface) {
            if (EGL14.eglGetCurrentContext() == this.eglContext && this.currentSurface == eGLSurface) {
                return;
            }
            synchronized (EglBase.lock) {
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    int eglGetError = EGL14.eglGetError();
                    throw new GLException(eglGetError, "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            }
            this.currentSurface = eGLSurface;
        }

        @Override
        public void release() {
            this.refCountDelegate.release();
        }

        @Override
        public void retain() {
            this.refCountDelegate.retain();
        }

        public EglConnection(int i) {
            this();
        }

        private EglConnection() {
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new jm3((byte) 5));
        }

        public static void lambda$new$1() {
        }
    }
}
