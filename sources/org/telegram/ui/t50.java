package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
public final class t50 extends org.telegram.messenger.q5 {
    public static final int D = 0;
    public final SurfaceTexture f49939a;
    public EGL10 f49940b;
    public EGLDisplay f49941c;
    public EGLConfig d;
    public EGLContext f49942e;
    public EGLSurface f49943f;
    public boolean h;
    public final int[] f49944n;
    public float f49945r;
    public long f49946s;
    public final org.telegram.ui.Components.il0 f49947w;
    public final m4 f49948x;
    public final u50 f49949y;

    public t50(u50 u50Var, SurfaceTexture surfaceTexture) {
        super("EGLThread", true);
        this.f49949y = u50Var;
        this.f49944n = new int[24];
        this.f49947w = new org.telegram.ui.Components.il0(21);
        this.f49948x = new m4(this, 9);
        this.f49939a = surfaceTexture;
    }

    public final void a(int i7, int i10, int i11, boolean z9) {
        Drawable drawable = this.f49949y.getParentActivity().getResources().getDrawable(i7);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.f49944n;
            if (z9) {
                GLES20.glDeleteTextures(1, iArr, i10);
                GLES20.glGenTextures(1, iArr, i10);
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            GLES20.glBindTexture(3553, iArr[i10]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            if (i11 != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(5);
                paint.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                GLUtils.texImage2D(3553, 0, createBitmap, 0);
                createBitmap.recycle();
                return;
            }
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
    }

    public final void b(org.telegram.messenger.k9 k9Var, int i7, boolean z9) {
        int[] iArr = this.f49944n;
        if (z9) {
            GLES20.glDeleteTextures(1, iArr, i7);
            GLES20.glGenTextures(1, iArr, i7);
        }
        Bitmap bitmap = (Bitmap) k9Var.j(null);
        GLES20.glBindTexture(3553, iArr[i7]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void c() {
        int[] iArr = this.f49944n;
        Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
    }

    public final void d() {
        int[] iArr = this.f49944n;
        Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
    }

    public final void finish() {
        if (this.f49943f != null) {
            EGL10 egl10 = this.f49940b;
            EGLDisplay eGLDisplay = this.f49941c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f49940b.eglDestroySurface(this.f49941c, this.f49943f);
            this.f49943f = null;
        }
        EGLContext eGLContext = this.f49942e;
        if (eGLContext != null) {
            this.f49940b.eglDestroyContext(this.f49941c, eGLContext);
            this.f49942e = null;
        }
        EGLDisplay eGLDisplay2 = this.f49941c;
        if (eGLDisplay2 != null) {
            this.f49940b.eglTerminate(eGLDisplay2);
            this.f49941c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f49940b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f49941c = eglGetDisplay;
        boolean z9 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.camera.q.t(this.f49940b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f49940b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.camera.q.t(this.f49940b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            u50 u50Var = this.f49949y;
            if (!this.f49940b.eglChooseConfig(this.f49941c, org.telegram.messenger.n6.h(u50Var.getParentActivity()).f() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.camera.q.t(this.f49940b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.f49940b.eglCreateContext(this.f49941c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f49942e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f25191a) {
                        org.telegram.messenger.camera.q.t(this.f49940b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f49939a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f49940b.eglCreateWindowSurface(this.f49941c, this.d, surfaceTexture, null);
                        this.f49943f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f49940b.eglMakeCurrent(this.f49941c, eglCreateWindowSurface, eglCreateWindowSurface, this.f49942e)) {
                                if (org.telegram.messenger.r2.f25191a) {
                                    org.telegram.messenger.camera.q.t(this.f49940b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int[] iArr2 = this.f49944n;
                                GLES20.glGenTextures(23, iArr2, 0);
                                a(2131231519, 0, 0, false);
                                a(2131231518, 1, 0, false);
                                a(2131231520, 2, 0, false);
                                a(2131231521, 3, 0, false);
                                a(2131231523, 4, 0, false);
                                a(2131231522, 5, 0, false);
                                a(2131231525, 6, 0, false);
                                a(2131231524, 7, 0, false);
                                a(2131231526, 8, 0, false);
                                a(2131231527, 9, 0, false);
                                a(2131231529, 10, 0, false);
                                a(2131231528, 11, 0, false);
                                a(2131231530, 12, 0, false);
                                a(2131231531, 13, 0, false);
                                a(2131231532, 14, 0, false);
                                a(2131231534, 15, 0, false);
                                a(2131231533, 16, 0, false);
                                a(2131231535, 17, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false), false);
                                a(2131231536, 18, 0, false);
                                a(2131231537, 19, 0, false);
                                a(2131231538, 20, 0, false);
                                a(2131231539, 21, 0, false);
                                b(new org.telegram.ui.Components.il0(22), 22, false);
                                b(this.f49947w, 23, false);
                                d();
                                c();
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                u50Var.J = System.currentTimeMillis() - 1000;
                                z9 = true;
                            }
                        } else {
                            if (org.telegram.messenger.r2.f25191a) {
                                org.telegram.messenger.camera.q.t(this.f49940b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.h = z9;
        super.run();
    }
}
