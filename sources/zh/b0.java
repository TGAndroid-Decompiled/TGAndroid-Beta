package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x31;
import w7.z5;
public final class b0 extends FrameLayout {
    public final Paint E;
    public final q10 F;
    public final Drawable G;
    public final Drawable H;
    public final Drawable I;
    public final g2 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public boolean N;
    public Utilities.CallbackReturn O;
    public Runnable P;
    public StaticLayout Q;
    public final float R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public boolean V;
    public int W;
    public final a0 f51642a;
    public float f51643a0;
    public CameraView f51644b;
    public float f51645b0;
    public Object f51646c;
    public float f51647c0;
    public final RectF d;
    public boolean f51648d0;
    public final RectF e;
    public float f51649e0;
    public final RectF f51650f;
    public final HandlerThread f51651f0;
    public final Handler f51652g0;
    public final RectF h;
    public volatile boolean f51653h0;
    public r8.n f51654i0;
    public a6.i f51655j0;
    public Bitmap f51656k0;
    public boolean f51657l0;
    public PointF[] m0;
    public final RectF f51658n;
    public float f51659n0;
    public Bitmap f51660o0;
    public Bitmap f51661p0;
    public final RectF f51662q0;
    public final RectF f51663r;
    public final Paint f51664r0;
    public final RectF f51665s;
    public BitmapShader f51666s0;
    public final Paint f51667t0;
    public final Matrix f51668u0;
    public final Path v;
    public Bitmap f51669v0;
    public final Path f51670w;
    public final Paint f51671w0;
    public final Paint f51672x;
    public final RectF f51673x0;
    public final Paint f51674y;
    public final z f51675y0;
    public static final bs f51641z0 = new bs(0.05d, 0.7d, 0.1d, 1.0d);
    public static final bs A0 = new bs(0.3d, 0.0d, 0.1d, 1.0d);

    public b0(Activity activity, RectF rectF, RectF rectF2, a0 a0Var) {
        super(activity);
        View view;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f51650f = rectF4;
        this.h = new RectF();
        this.f51658n = new RectF();
        this.f51663r = new RectF();
        this.f51665s = new RectF();
        this.v = new Path();
        this.f51670w = new Path();
        this.f51672x = new Paint(1);
        Paint paint = new Paint(1);
        this.f51674y = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new q10(2);
        g2 g2Var = new g2(true);
        this.J = g2Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.O = new gi.c(12);
        this.W = -1;
        this.f51643a0 = 1.0f;
        this.f51645b0 = 1.0f;
        this.f51647c0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f51651f0 = handlerThread;
        this.f51662q0 = new RectF();
        this.f51664r0 = new Paint(2);
        this.f51667t0 = new Paint(3);
        this.f51668u0 = new Matrix();
        this.f51671w0 = new Paint(2);
        this.f51673x0 = new RectF();
        this.f51675y0 = new z(this);
        this.f51642a = a0Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.G = o(activity, R.drawable.msg_qr_scan);
        this.H = o(activity, R.drawable.qr_flashlight);
        this.I = o(activity, R.drawable.qr_gallery);
        g2Var.a(-1);
        g2Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity != null) {
            view = findActivity.getWindow().getDecorView();
        } else {
            view = this;
        }
        this.R = u.g(view);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f51652g0 = handler;
        handler.post(new v(this, 2));
        invalidate();
        a(1.0f, 390L, new v(this, 3));
    }

    public static boolean c() {
        if (u.f() && LiteMode.isEnabled(256)) {
            return true;
        }
        return false;
    }

    public static boolean d(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                return false;
            }
            return true;
        } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            return false;
        } else {
            return true;
        }
    }

    public static xf.c f(android.graphics.Bitmap r10, r8.n r11, a6.i r12, org.telegram.messenger.Utilities.CallbackReturn r13) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b0.f(android.graphics.Bitmap, r8.n, a6.i, org.telegram.messenger.Utilities$CallbackReturn):xf.c");
    }

    public static boolean j(RectF rectF, float f7, float f10) {
        if (f7 >= rectF.left - AndroidUtilities.dp(8.0f) && f7 <= rectF.right + AndroidUtilities.dp(8.0f) && f10 >= rectF.top - AndroidUtilities.dp(8.0f) && f10 <= rectF.bottom + AndroidUtilities.dp(8.0f)) {
            return true;
        }
        return false;
    }

    public static b0 k(w61 w61Var, View view, Utilities.CallbackReturn callbackReturn, Utilities.Callback callback, Runnable runnable) {
        FrameLayout frameLayout;
        int[] iArr;
        int[] iArr2;
        d5 parentLayout = w61Var.getParentLayout();
        if (parentLayout != null) {
            frameLayout = parentLayout.getOverlayContainerView();
        } else {
            frameLayout = null;
        }
        if (frameLayout == null || w61Var.getParentActivity() == null) {
            return null;
        }
        frameLayout.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float width = (view.getWidth() / 2.0f) + (iArr2[0] - iArr[0]);
        float height = (view.getHeight() / 2.0f) + (iArr2[1] - iArr[1]);
        float min = Math.min(view.getWidth(), view.getHeight()) / 2.0f;
        b0 b0Var = new b0(w61Var.getParentActivity(), new RectF(width - min, height - min, width + min, height + min), new RectF(), new w(callback, runnable));
        b0Var.setPlainButton(true);
        b0Var.setAccept(callbackReturn);
        b0Var.setOnGallery(new si.o(w61Var, b0Var, callbackReturn, callback, 3));
        frameLayout.addView(b0Var, z5.c(-1.0f, -1));
        return b0Var;
    }

    public static String l(Bitmap bitmap, Utilities.CallbackReturn callbackReturn) {
        r8.n nVar;
        String str = null;
        try {
            Context context = ApplicationLoader.applicationContext;
            ?? obj = new Object();
            obj.f7391a = 256;
            nVar = new r8.n(new t2(context, (x1) obj));
        } catch (Throwable th2) {
            FileLog.e(th2);
            nVar = null;
        }
        try {
            xf.c f7 = f(bitmap, nVar, new a6.i(23), callbackReturn);
            if (f7 != null) {
                str = (String) f7.f49774a;
            }
            return str;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i10) {
        Drawable mutate = context.getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(n2 n2Var, int i10, x xVar) {
        if (n2Var.isFinished) {
            return;
        }
        d5 parentLayout = n2Var.getParentLayout();
        if (parentLayout != null && ((parentLayout.getLastFragment() != n2Var || ((ActionBarLayout) parentLayout).A()) && i10 < 40)) {
            AndroidUtilities.runOnUIThread(new x31(n2Var, i10, xVar, 27), 50L);
        } else {
            xVar.run();
        }
    }

    public final void a(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, f7);
        ofFloat.addUpdateListener(new i6(this, 28));
        ofFloat.addListener(new ah.q0(this, runnable));
        ofFloat.setDuration(Math.abs(f7 - this.S) * ((float) j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.T = ofFloat;
        ofFloat.start();
    }

    public final float b(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: zh.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.S >= 1.0f && !this.U) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.f51658n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f51650f;
            int i10 = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.W = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.W == 0 && !j(rectF3, x10, y3)) || ((this.W == 1 && !j(rectF2, x10, y3)) || (this.W == 2 && !j(rectF, x10, y3)))) {
                        this.W = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i11 = this.W;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i11 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.f51644b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z10 = this.f51648d0;
                            this.f51648d0 = !z10;
                            if (!z10) {
                                str = "torch";
                            } else {
                                str = "off";
                            }
                            cameraSessionWrapper.setCurrentFlashMode(str);
                            invalidate();
                        }
                    } else if (i11 == 2 && this.P != null) {
                        performHapticFeedback(3);
                        this.P.run();
                    } else {
                        CameraView cameraView2 = this.f51644b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y3);
                        }
                    }
                    this.W = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (j(rectF3, x10, y3)) {
                    i10 = 0;
                } else if (j(rectF2, x10, y3)) {
                    i10 = 1;
                } else if (this.P != null && j(rectF, x10, y3)) {
                    i10 = 2;
                }
                this.W = i10;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (!this.U && !this.V) {
            this.U = true;
            this.f51653h0 = false;
            Matrix matrix = this.f51668u0;
            RectF rectF = this.f51662q0;
            CameraView cameraView = this.f51644b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.f51660o0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    this.f51660o0 = null;
                }
                if (this.f51660o0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (c()) {
                        Bitmap bitmap = this.f51660o0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.f51660o0.getHeight() / 8), true);
                        this.f51661p0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.f51661p0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.f51666s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.f51661p0.getWidth(), rectF.height() / this.f51661p0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.f51666s0.setLocalMatrix(matrix);
                        this.f51667t0.setShader(this.f51666s0);
                    }
                }
            }
            m();
            a(0.0f, 330L, new v(this, 0));
        }
    }

    public final void g() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f51653h0 = false;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        m();
        this.f51652g0.removeCallbacksAndMessages(null);
        this.f51652g0.post(new v(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f10, canvas, rectF, true);
        if (drawable == this.H && this.f51649e0 > 0.0f) {
            Paint paint = this.f51672x;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f51649e0 * 102.0f * f10));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int dp = AndroidUtilities.dp(28.0f);
            float centerX = rectF.centerX();
            float f11 = dp / 2.0f;
            drawable.setBounds((int) (centerX - f11), (int) (rectF.centerY() - f11), (int) (rectF.centerX() + f11), (int) (rectF.centerY() + f11));
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
        } else {
            g2 g2Var = this.J;
            g2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), rectF.centerY() - (AndroidUtilities.dp(24.0f) / 2.0f));
            g2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        int i10;
        boolean z11;
        if (f10 <= 0.0f) {
            return;
        }
        int clamp01 = (int) (Utilities.clamp01(d1.f51964b[3] / 100.0f) * 255.0f);
        Paint paint = this.f51672x;
        if (z10) {
            if (this.f51644b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.f51646c == null) {
                    this.f51646c = this.f51644b.getBlurRenderNode();
                    invalidate();
                }
                z11 = u.e(this.f51646c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.f51670w;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.f51644b.getLeft(), this.f51644b.getTop());
                u.h(this.f51646c, f10);
                u.c(canvas, this.f51646c);
                canvas.restore();
                paint.setColor((clamp01 << 24) | 16777215);
                paint.setAlpha((int) (clamp01 * f10));
                canvas.drawRect(rectF, paint);
                t.b(canvas, rectF, f10);
                canvas.restore();
                this.F.a(canvas, rectF, f7, 0, f10);
            }
        }
        if (z10 && this.f51661p0 != null) {
            Paint paint2 = this.f51667t0;
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint2);
            paint.setColor((clamp01 << 24) | 16777215);
            paint.setAlpha((int) (clamp01 * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        } else {
            int i11 = (clamp01 << 24) | 16777215;
            if (c()) {
                i10 = 687865856;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            paint.setColor(i0.a.k(i11, i10));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        }
        this.F.a(canvas, rectF, f7, 0, f10);
    }

    public final void m() {
        CameraView cameraView = this.f51644b;
        if (cameraView == null) {
            return;
        }
        this.f51644b = null;
        this.f51646c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.f51648d0 && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float n() {
        if (this.U) {
            return 1.0f - A0.getInterpolation(1.0f - this.S);
        }
        return f51641z0.getInterpolation(Utilities.clamp01(this.S));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        float dp = ((i13 - i11) / 2.0f) - AndroidUtilities.dp(20.0f);
        float f10 = i15 / 2.0f;
        float min = (Math.min(i15, i14) * 0.66f) / 2.0f;
        float f11 = f10 - min;
        float f12 = dp - min;
        float f13 = f10 + min;
        float f14 = dp + min;
        RectF rectF = this.f51663r;
        rectF.set(f11, f12, f13, f14);
        float dp2 = AndroidUtilities.dp(56.0f);
        float dp3 = rectF.bottom + AndroidUtilities.dp(64.0f);
        if (this.P != null) {
            f7 = (dp2 / 2.0f) + AndroidUtilities.dp(35.0f) + f10;
        } else {
            f7 = f10;
        }
        float f15 = dp2 / 2.0f;
        float f16 = dp2 + dp3;
        this.h.set(f7 - f15, dp3, f7 + f15, f16);
        float dp4 = (f10 - AndroidUtilities.dp(35.0f)) - f15;
        this.f51658n.set(dp4 - f15, dp3, dp4 + f15, f16);
        this.Q = new StaticLayout(LocaleController.getString(R.string.ScanQrCode), this.K, org.telegram.messenger.g0.b(72.0f, i15, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f51650f;
        if (rectF2.isEmpty()) {
            String[] strArr = c1.C9;
            int i16 = AndroidUtilities.statusBarHeight;
            View view = this;
            int i17 = 0;
            while (true) {
                int top = view.getTop() + i17;
                if (!(view.getParent() instanceof View)) {
                    float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i16 - top);
                    rectF2.set(AndroidUtilities.dp(9.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(49.0f), currentActionBarHeight + AndroidUtilities.dp(20.0f));
                    return;
                }
                view = (View) view.getParent();
                i17 = top - view.getScrollY();
            }
        }
    }

    public void setAccept(Utilities.CallbackReturn<String, Boolean> callbackReturn) {
        this.O = callbackReturn;
    }

    public void setButtonLabel(String str) {
        this.L = str;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.M;
        textPaint.setTypeface(bold);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.P = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z10) {
        this.N = z10;
        invalidate();
    }
}
