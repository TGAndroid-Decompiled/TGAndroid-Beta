package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = e.a().createConfigAttributes();
    public static final int[] CONFIG_RGBA = e.a().setHasAlphaChannel(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_BUFFER = e.a().setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = e.a().setHasAlphaChannel(true).setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_RECORDABLE = e.a().setIsRecordable(true).createConfigAttributes();

    public static class ConfigBuilder {
        private boolean hasAlphaChannel;
        private boolean isRecordable;
        private int openGlesVersion = 2;
        private boolean supportsPixelBuffer;

        public int[] createConfigAttributes() {
            int i10;
            ArrayList arrayList = new ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.hasAlphaChannel) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i11 = this.openGlesVersion;
            if (i11 == 2 || i11 == 3) {
                arrayList.add(12352);
                if (this.openGlesVersion == 3) {
                    i10 = 64;
                } else {
                    i10 = 4;
                }
                arrayList.add(Integer.valueOf(i10));
            }
            if (this.supportsPixelBuffer) {
                arrayList.add(12339);
                arrayList.add(1);
            }
            if (this.isRecordable) {
                arrayList.add(12610);
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
            }
            return iArr;
        }

        public ConfigBuilder setHasAlphaChannel(boolean z4) {
            this.hasAlphaChannel = z4;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z4) {
            this.isRecordable = z4;
            return this;
        }

        public ConfigBuilder setOpenGlesVersion(int i10) {
            if (i10 >= 1 && i10 <= 3) {
                this.openGlesVersion = i10;
                return this;
            }
            throw new IllegalArgumentException(l.d.k(i10, "OpenGL ES version ", " not supported"));
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z4) {
            this.supportsPixelBuffer = z4;
            return this;
        }
    }

    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    void createBackgroundSurface(SurfaceTexture surfaceTexture);

    void createDummyPbufferSurface();

    void createPbufferSurface(int i10, int i11);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasBackgroundSurface();

    boolean hasSurface();

    void makeBackgroundCurrent();

    void makeCurrent();

    void release();

    void releaseSurface(boolean z4);

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers(long j10, boolean z4);

    void swapBuffers(boolean z4);
}
