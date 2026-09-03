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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Intro;
import org.telegram.messenger.R;
public final class u70 extends DispatchQueue {
    public static final int f41738y = 0;
    public final SurfaceTexture f41739a;
    public EGL10 f41740b;
    public EGLDisplay f41741c;
    public EGLConfig d;
    public EGLContext f41742e;
    public EGLSurface f41743f;
    public boolean h;
    public final int[] f41744n;
    public float f41745r;
    public long f41746s;
    public final org.telegram.ui.Components.mh0 v;
    public final z5 f41747w;
    public final v70 f41748x;

    public u70(v70 v70Var, SurfaceTexture surfaceTexture) {
        super("EGLThread");
        this.f41748x = v70Var;
        this.f41744n = new int[24];
        this.v = new org.telegram.ui.Components.mh0(24);
        this.f41747w = new z5(this, 7);
        this.f41739a = surfaceTexture;
    }

    public final void b(int i10, int i11, int i12, boolean z4) {
        Drawable drawable = this.f41748x.getParentActivity().getResources().getDrawable(i10);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.f41744n;
            if (z4) {
                GLES20.glDeleteTextures(1, iArr, i11);
                GLES20.glGenTextures(1, iArr, i11);
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            GLES20.glBindTexture(3553, iArr[i11]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            if (i12 != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(5);
                paint.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                GLUtils.texImage2D(3553, 0, createBitmap, 0);
                createBitmap.recycle();
                return;
            }
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
    }

    public final void c(GenericProvider genericProvider, int i10, boolean z4) {
        int[] iArr = this.f41744n;
        if (z4) {
            GLES20.glDeleteTextures(1, iArr, i10);
            GLES20.glGenTextures(1, iArr, i10);
        }
        Bitmap bitmap = (Bitmap) genericProvider.provide(null);
        GLES20.glBindTexture(3553, iArr[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void finish() {
        if (this.f41743f != null) {
            EGL10 egl10 = this.f41740b;
            EGLDisplay eGLDisplay = this.f41741c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f41740b.eglDestroySurface(this.f41741c, this.f41743f);
            this.f41743f = null;
        }
        EGLContext eGLContext = this.f41742e;
        if (eGLContext != null) {
            this.f41740b.eglDestroyContext(this.f41741c, eGLContext);
            this.f41742e = null;
        }
        EGLDisplay eGLDisplay2 = this.f41741c;
        if (eGLDisplay2 != null) {
            this.f41740b.eglTerminate(eGLDisplay2);
            this.f41741c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f41740b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f41741c = eglGetDisplay;
        boolean z4 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.y3.u(this.f41740b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f41740b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.y3.u(this.f41740b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            v70 v70Var = this.f41748x;
            if (!this.f41740b.eglChooseConfig(this.f41741c, EmuDetector.with(v70Var.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.y3.u(this.f41740b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.f41740b.eglCreateContext(this.f41741c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f41742e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.y3.u(this.f41740b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f41739a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f41740b.eglCreateWindowSurface(this.f41741c, this.d, surfaceTexture, null);
                        this.f41743f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f41740b.eglMakeCurrent(this.f41741c, eglCreateWindowSurface, eglCreateWindowSurface, this.f41742e)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.y3.u(this.f41740b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int[] iArr2 = this.f41744n;
                                GLES20.glGenTextures(23, iArr2, 0);
                                b(R.drawable.intro_fast_arrow_shadow, 0, 0, false);
                                b(R.drawable.intro_fast_arrow, 1, 0, false);
                                b(R.drawable.intro_fast_body, 2, 0, false);
                                b(R.drawable.intro_fast_spiral, 3, 0, false);
                                b(R.drawable.intro_ic_bubble_dot, 4, 0, false);
                                b(R.drawable.intro_ic_bubble, 5, 0, false);
                                b(R.drawable.intro_ic_cam_lens, 6, 0, false);
                                b(R.drawable.intro_ic_cam, 7, 0, false);
                                b(R.drawable.intro_ic_pencil, 8, 0, false);
                                b(R.drawable.intro_ic_pin, 9, 0, false);
                                b(R.drawable.intro_ic_smile_eye, 10, 0, false);
                                b(R.drawable.intro_ic_smile, 11, 0, false);
                                b(R.drawable.intro_ic_videocam, 12, 0, false);
                                b(R.drawable.intro_knot_down, 13, 0, false);
                                b(R.drawable.intro_knot_up, 14, 0, false);
                                b(R.drawable.intro_powerful_infinity_white, 15, 0, false);
                                b(R.drawable.intro_powerful_infinity, 16, 0, false);
                                b(R.drawable.intro_powerful_mask, 17, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), false);
                                b(R.drawable.intro_powerful_star, 18, 0, false);
                                b(R.drawable.intro_private_door, 19, 0, false);
                                b(R.drawable.intro_private_screw, 20, 0, false);
                                b(R.drawable.intro_tg_plane, 21, 0, false);
                                c(new org.telegram.ui.Components.mh0(25), 22, false);
                                c(this.v, 23, false);
                                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                                Intro.setPowerfulTextures(iArr2[17], iArr2[18], iArr2[16], iArr2[15]);
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                v70Var.G = System.currentTimeMillis() - 1000;
                                z4 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.y3.u(this.f41740b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
            }
        }
        this.h = z4;
        super.run();
    }
}
