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
public final class u50 extends org.telegram.messenger.r5 {
    public static final int E = 0;
    public final SurfaceTexture f52429a;
    public EGL10 f52430b;
    public EGLDisplay f52431c;
    public EGLConfig d;
    public EGLContext f52432e;
    public EGLSurface f52433f;
    public boolean h;
    public final int[] f52434n;
    public float f52435r;
    public long f52436s;
    public final org.telegram.ui.Components.wb0 f52437w;
    public final m4 f52438x;
    public final v50 f52439y;

    public u50(v50 v50Var, SurfaceTexture surfaceTexture) {
        super("EGLThread", true);
        this.f52439y = v50Var;
        this.f52434n = new int[24];
        this.f52437w = new org.telegram.ui.Components.wb0(28);
        this.f52438x = new m4(this, 9);
        this.f52429a = surfaceTexture;
    }

    public final void a(int i7, int i10, int i11, boolean z10) {
        Drawable drawable = this.f52439y.getParentActivity().getResources().getDrawable(i7);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.f52434n;
            if (z10) {
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

    public final void b(org.telegram.messenger.i9 i9Var, int i7, boolean z10) {
        int[] iArr = this.f52434n;
        if (z10) {
            GLES20.glDeleteTextures(1, iArr, i7);
            GLES20.glGenTextures(1, iArr, i7);
        }
        Bitmap bitmap = (Bitmap) i9Var.m(null);
        GLES20.glBindTexture(3553, iArr[i7]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void c() {
        int[] iArr = this.f52434n;
        Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
    }

    public final void d() {
        int[] iArr = this.f52434n;
        Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
    }

    public final void finish() {
        if (this.f52433f != null) {
            EGL10 egl10 = this.f52430b;
            EGLDisplay eGLDisplay = this.f52431c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f52430b.eglDestroySurface(this.f52431c, this.f52433f);
            this.f52433f = null;
        }
        EGLContext eGLContext = this.f52432e;
        if (eGLContext != null) {
            this.f52430b.eglDestroyContext(this.f52431c, eGLContext);
            this.f52432e = null;
        }
        EGLDisplay eGLDisplay2 = this.f52431c;
        if (eGLDisplay2 != null) {
            this.f52430b.eglTerminate(eGLDisplay2);
            this.f52431c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f52430b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f52431c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.s2.f26721a) {
                org.telegram.messenger.n10.v(this.f52430b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f52430b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.s2.f26721a) {
                org.telegram.messenger.n10.v(this.f52430b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            v50 v50Var = this.f52439y;
            if (!this.f52430b.eglChooseConfig(this.f52431c, org.telegram.messenger.n6.h(v50Var.getParentActivity()).f() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.s2.f26721a) {
                    org.telegram.messenger.n10.v(this.f52430b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.f52430b.eglCreateContext(this.f52431c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f52432e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.s2.f26721a) {
                        org.telegram.messenger.n10.v(this.f52430b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f52429a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f52430b.eglCreateWindowSurface(this.f52431c, this.d, surfaceTexture, null);
                        this.f52433f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f52430b.eglMakeCurrent(this.f52431c, eglCreateWindowSurface, eglCreateWindowSurface, this.f52432e)) {
                                if (org.telegram.messenger.s2.f26721a) {
                                    org.telegram.messenger.n10.v(this.f52430b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int[] iArr2 = this.f52434n;
                                GLES20.glGenTextures(23, iArr2, 0);
                                a(2131231520, 0, 0, false);
                                a(2131231519, 1, 0, false);
                                a(2131231521, 2, 0, false);
                                a(2131231522, 3, 0, false);
                                a(2131231524, 4, 0, false);
                                a(2131231523, 5, 0, false);
                                a(2131231526, 6, 0, false);
                                a(2131231525, 7, 0, false);
                                a(2131231527, 8, 0, false);
                                a(2131231528, 9, 0, false);
                                a(2131231530, 10, 0, false);
                                a(2131231529, 11, 0, false);
                                a(2131231531, 12, 0, false);
                                a(2131231532, 13, 0, false);
                                a(2131231533, 14, 0, false);
                                a(2131231535, 15, 0, false);
                                a(2131231534, 16, 0, false);
                                a(2131231536, 17, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false), false);
                                a(2131231537, 18, 0, false);
                                a(2131231538, 19, 0, false);
                                a(2131231539, 20, 0, false);
                                a(2131231540, 21, 0, false);
                                b(new org.telegram.ui.Components.wb0(29), 22, false);
                                b(this.f52437w, 23, false);
                                d();
                                c();
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                v50Var.K = System.currentTimeMillis() - 1000;
                                z10 = true;
                            }
                        } else {
                            if (org.telegram.messenger.s2.f26721a) {
                                org.telegram.messenger.n10.v(this.f52430b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.s2.f26721a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.h = z10;
        super.run();
    }
}
