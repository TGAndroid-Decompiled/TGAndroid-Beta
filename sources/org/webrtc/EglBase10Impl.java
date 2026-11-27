package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLException;
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
    private static final EglConnection EGL_NO_CONNECTION = new EglConnection(0);
    private static final String TAG = "EglBase10Impl";
    private EglConnection eglConnection;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;
    private boolean detachSurfaceOnRelease = false;

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
                        int eglGetError = this.egl.eglGetError();
                        throw new GLException(eglGetError, "Failed to make temporary EGL surface active: " + this.egl.eglGetError());
                    }
                }
                return EglBase10ImplJni.get().getCurrentNativeEGLContext();
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

    public interface Natives {
        long getCurrentNativeEGLContext();
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    private void checkIsNotReleased() {
        if (this.eglConnection != EGL_NO_CONNECTION) {
            return;
        }
        xi4.l("This object has been released");
    }

    public static EGLContext createEglContext(EGL10 egl10, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == EGL10.EGL_NO_CONTEXT) {
            xi4.l("Invalid sharedContext");
            return null;
        }
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        int eglGetError = egl10.eglGetError();
        String hexString = Integer.toHexString(egl10.eglGetError());
        throw new GLException(eglGetError, "Failed to create EGL context: 0x" + hexString);
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            grb.i("Input must be either a SurfaceHolder or SurfaceTexture");
            return;
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EGL10 egl = this.eglConnection.getEgl();
            EGLSurface eglCreateWindowSurface = egl.eglCreateWindowSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), obj, new int[]{12344});
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface != null && eglCreateWindowSurface != eGLSurface2) {
                return;
            }
            this.eglSurface = eGLSurface2;
            int eglGetError = egl.eglGetError();
            String hexString = Integer.toHexString(egl.eglGetError());
            throw new GLException(eglGetError, "Failed to create window surface: 0x" + hexString);
        }
        xi4.l("Already has an EGLSurface");
    }

    public static EGLConfig getEglConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
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
        int eglGetError = egl10.eglGetError();
        String hexString = Integer.toHexString(egl10.eglGetError());
        throw new GLException(eglGetError, "eglChooseConfig failed: 0x" + hexString);
    }

    public static EGLDisplay getEglDisplay(EGL10 egl10) {
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (egl10.eglInitialize(eglGetDisplay, new int[2])) {
                return eglGetDisplay;
            }
            int eglGetError = egl10.eglGetError();
            String hexString = Integer.toHexString(egl10.eglGetError());
            throw new GLException(eglGetError, "Unable to initialize EGL10: 0x" + hexString);
        }
        int eglGetError2 = egl10.eglGetError();
        String hexString2 = Integer.toHexString(egl10.eglGetError());
        throw new GLException(eglGetError2, "Unable to get EGL10 display: 0x" + hexString2);
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
            EGL10 egl = this.eglConnection.getEgl();
            EGLSurface eglCreatePbufferSurface = egl.eglCreatePbufferSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface != null && eglCreatePbufferSurface != eGLSurface2) {
                return;
            }
            this.eglSurface = eGLSurface2;
            int eglGetError = egl.eglGetError();
            StringBuilder p = bs2.p("Failed to create pixel buffer surface with size ", i, "x", i2, ": 0x");
            p.append(Integer.toHexString(egl.eglGetError()));
            throw new GLException(eglGetError, p.toString());
        }
        xi4.l("Already has an EGLSurface");
    }

    @Override
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) {
            private final Surface surface;

            {
                EglBase10Impl.this = this;
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
        });
    }

    @Override
    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    @Override
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglConnection.getEgl(), this.eglConnection.getContext(), this.eglConnection.getConfig());
    }

    @Override
    public boolean hasSurface() {
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    @Override
    public void makeCurrent() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
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
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            if (this.detachSurfaceOnRelease) {
                if (this.eglSurface.equals(this.eglConnection.getEgl().eglGetCurrentSurface(12377))) {
                    detachCurrent();
                }
            }
            this.eglConnection.getEgl().eglDestroySurface(this.eglConnection.getDisplay(), this.eglSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    @Override
    public void setDetachSurfaceOnRelease(boolean z) {
        this.detachSurfaceOnRelease = z;
    }

    @Override
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.eglConnection.getEgl().eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.eglConnection.getEgl().eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                this.eglConnection.getEgl().eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        xi4.l("No EGLSurface - can't swap buffers");
    }

    @Override
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public EglBase10Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override
    public void swapBuffers(long j) {
        swapBuffers();
    }

    public static class EglConnection implements EglBase10.EglConnection {
        private EGLSurface currentSurface;
        private final EGL10 egl;
        private final EGLConfig eglConfig;
        private final EGLContext eglContext;
        private final EGLDisplay eglDisplay;
        private final RefCountDelegate refCountDelegate;

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglDisplay = EglBase10Impl.getEglDisplay(egl10);
            this.eglDisplay = eglDisplay;
            EGLConfig eglConfig = EglBase10Impl.getEglConfig(egl10, eglDisplay, iArr);
            this.eglConfig = eglConfig;
            int b = c.b(iArr);
            Logging.d("EglBase10Impl", "Using OpenGL ES version " + b);
            this.eglContext = EglBase10Impl.createEglContext(egl10, eGLContext, eglDisplay, eglConfig, b);
            this.refCountDelegate = new RefCountDelegate(new zg3(this, (byte) 21));
        }

        public static void a() {
            lambda$new$1();
        }

        public void lambda$new$0() {
            EGLSurface eGLSurface;
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
            this.currentSurface = eGLSurface;
        }

        public void detachCurrent() {
            EGLSurface eGLSurface;
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    int eglGetError = this.egl.eglGetError();
                    throw new GLException(eglGetError, "eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            }
            this.currentSurface = eGLSurface;
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

        @Override
        public EGL10 getEgl() {
            return this.egl;
        }

        public void makeCurrent(EGLSurface eGLSurface) {
            if (this.egl.eglGetCurrentContext() == this.eglContext && this.currentSurface == eGLSurface) {
                return;
            }
            synchronized (EglBase.lock) {
                if (!this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    int eglGetError = this.egl.eglGetError();
                    throw new GLException(eglGetError, "eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
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
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            this.egl = (EGL10) EGLContext.getEGL();
            this.eglContext = EGL10.EGL_NO_CONTEXT;
            this.eglDisplay = EGL10.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new jm3((byte) 4));
        }

        public static void lambda$new$1() {
        }
    }
}
