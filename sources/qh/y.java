package qh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.k9;
import org.telegram.messenger.q20;
import org.telegram.messenger.r20;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r51;
import org.telegram.ui.px0;
import org.telegram.ui.zh;
import vh.w3;
import w7.b6;
public final class y extends FrameLayout {
    public final Paint D;
    public final Paint E;
    public final k9 F;
    public final Drawable G;
    public final Drawable H;
    public final Drawable I;
    public final c2 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public boolean N;
    public r20 O;
    public Runnable P;
    public StaticLayout Q;
    public final float R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public boolean V;
    public int W;
    public final x f46057a;
    public float f46058a0;
    public CameraView f46059b;
    public float f46060b0;
    public Object f46061c;
    public float f46062c0;
    public final RectF d;
    public boolean f46063d0;
    public final RectF e;
    public float f46064e0;
    public final RectF f46065f;
    public final HandlerThread f46066f0;
    public final Handler f46067g0;
    public final RectF h;
    public volatile boolean f46068h0;
    public r8.n f46069i0;
    public w3 f46070j0;
    public Bitmap f46071k0;
    public boolean f46072l0;
    public PointF[] m0;
    public final RectF f46073n;
    public float f46074n0;
    public Bitmap f46075o0;
    public Bitmap f46076p0;
    public final RectF f46077q0;
    public final RectF f46078r;
    public final Paint f46079r0;
    public final RectF f46080s;
    public BitmapShader f46081s0;
    public final Paint f46082t0;
    public final Matrix f46083u0;
    public Bitmap f46084v0;
    public final Path f46085w;
    public final Paint f46086w0;
    public final Path f46087x;
    public final RectF f46088x0;
    public final Paint f46089y;
    public final ew f46090y0;
    public static final gr f46056z0 = new gr(0.05d, 0.7d, 0.1d, 1.0d);
    public static final gr A0 = new gr(0.3d, 0.0d, 0.1d, 1.0d);

    public y(Activity activity, RectF rectF, RectF rectF2, x xVar) {
        super(activity);
        View view;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f46065f = rectF4;
        this.h = new RectF();
        this.f46073n = new RectF();
        this.f46078r = new RectF();
        this.f46080s = new RectF();
        this.f46085w = new Path();
        this.f46087x = new Path();
        this.f46089y = new Paint(1);
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new k9(3);
        c2 c2Var = new c2(true);
        this.J = c2Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.O = new zh(11);
        this.W = -1;
        this.f46058a0 = 1.0f;
        this.f46060b0 = 1.0f;
        this.f46062c0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f46066f0 = handlerThread;
        this.f46077q0 = new RectF();
        this.f46079r0 = new Paint(2);
        this.f46082t0 = new Paint(3);
        this.f46083u0 = new Matrix();
        this.f46086w0 = new Paint(2);
        this.f46088x0 = new RectF();
        this.f46090y0 = new ew(this, 23);
        this.f46057a = xVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.G = o(activity, 2131232318);
        this.H = o(activity, 2131232626);
        this.I = o(activity, 2131232627);
        c2Var.a(-1);
        c2Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(22.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
        Activity W = org.telegram.messenger.i0.W(getContext());
        if (W != null) {
            view = W.getWindow().getDecorView();
        } else {
            view = this;
        }
        this.R = u.g(view);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f46067g0 = handler;
        handler.post(new v(this, 2));
        invalidate();
        a(1.0f, 390L, new v(this, 3));
    }

    public static boolean c() {
        if (u.f() && sc.e(256)) {
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

    public static m4.c f(android.graphics.Bitmap r11, r8.n r12, vh.w3 r13, org.telegram.messenger.r20 r14) {
        throw new UnsupportedOperationException("Method not decompiled: qh.y.f(android.graphics.Bitmap, r8.n, vh.w3, org.telegram.messenger.r20):m4.c");
    }

    public static boolean j(RectF rectF, float f7, float f10) {
        if (f7 >= rectF.left - org.telegram.messenger.i0.L(8.0f) && f7 <= rectF.right + org.telegram.messenger.i0.L(8.0f) && f10 >= rectF.top - org.telegram.messenger.i0.L(8.0f) && f10 <= rectF.bottom + org.telegram.messenger.i0.L(8.0f)) {
            return true;
        }
        return false;
    }

    public static y k(r51 r51Var, View view, r20 r20Var, q20 q20Var, Runnable runnable) {
        FrameLayout frameLayout;
        int[] iArr;
        int[] iArr2;
        z4 parentLayout = r51Var.getParentLayout();
        if (parentLayout != null) {
            frameLayout = parentLayout.getOverlayContainerView();
        } else {
            frameLayout = null;
        }
        if (frameLayout == null || r51Var.getParentActivity() == null) {
            return null;
        }
        frameLayout.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float width = (view.getWidth() / 2.0f) + (iArr2[0] - iArr[0]);
        float height = (view.getHeight() / 2.0f) + (iArr2[1] - iArr[1]);
        float min = Math.min(view.getWidth(), view.getHeight()) / 2.0f;
        y yVar = new y(r51Var.getParentActivity(), new RectF(width - min, height - min, width + min, height + min), new RectF(), new m5.e(19, q20Var, runnable));
        yVar.setPlainButton(true);
        yVar.setAccept(r20Var);
        yVar.setOnGallery(new px0(r51Var, yVar, r20Var, q20Var, 13));
        frameLayout.addView(yVar, b6.c(-1.0f, -1));
        return yVar;
    }

    public static String l(Bitmap bitmap, r20 r20Var) {
        r8.n nVar;
        String str = null;
        try {
            Context context = org.telegram.messenger.w0.f19025b;
            ?? obj = new Object();
            obj.f5383a = 256;
            nVar = new r8.n(new t2(context, (x1) obj));
        } catch (Throwable th2) {
            f8.g(th2, true);
            nVar = null;
        }
        try {
            m4.c f7 = f(bitmap, nVar, new w3(), r20Var);
            if (f7 != null) {
                str = (String) f7.f12705b;
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

    public static void p(k2 k2Var, int i10, w wVar) {
        if (k2Var.isFinished) {
            return;
        }
        z4 parentLayout = k2Var.getParentLayout();
        if (parentLayout != null && ((parentLayout.getLastFragment() != k2Var || ((ActionBarLayout) parentLayout).A()) && i10 < 40)) {
            org.telegram.messenger.i0.h3(new org.telegram.ui.Wallet.x0(k2Var, i10, wVar, 9), 50L);
        } else {
            wVar.run();
        }
    }

    public final void a(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, f7);
        ofFloat.addUpdateListener(new bg.k(this, 29));
        ofFloat.addListener(new androidx.fragment.app.g(this, runnable));
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
        throw new UnsupportedOperationException("Method not decompiled: qh.y.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.S >= 1.0f && !this.U) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.f46073n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f46065f;
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
                        CameraView cameraView = this.f46059b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z10 = this.f46063d0;
                            this.f46063d0 = !z10;
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
                        CameraView cameraView2 = this.f46059b;
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
            this.f46068h0 = false;
            Matrix matrix = this.f46083u0;
            RectF rectF = this.f46077q0;
            CameraView cameraView = this.f46059b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.f46075o0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    this.f46075o0 = null;
                }
                if (this.f46075o0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (c()) {
                        Bitmap bitmap = this.f46075o0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.f46075o0.getHeight() / 8), true);
                        this.f46076p0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.f46076p0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.f46081s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.f46076p0.getWidth(), rectF.height() / this.f46076p0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.f46081s0.setLocalMatrix(matrix);
                        this.f46082t0.setShader(this.f46081s0);
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
        this.f46068h0 = false;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        m();
        this.f46067g0.removeCallbacksAndMessages(null);
        this.f46067g0.post(new v(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f10, canvas, rectF, true);
        if (drawable == this.H && this.f46064e0 > 0.0f) {
            Paint paint = this.f46089y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f46064e0 * 102.0f * f10));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int L = org.telegram.messenger.i0.L(28.0f);
            float centerX = rectF.centerX();
            float f11 = L / 2.0f;
            drawable.setBounds((int) (centerX - f11), (int) (rectF.centerY() - f11), (int) (rectF.centerX() + f11), (int) (rectF.centerY() + f11));
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
        } else {
            c2 c2Var = this.J;
            c2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (org.telegram.messenger.i0.L(24.0f) / 2.0f), rectF.centerY() - (org.telegram.messenger.i0.L(24.0f) / 2.0f));
            c2Var.draw(canvas);
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
        int l4 = (int) (Utilities.l(y0.f46092b[3] / 100.0f) * 255.0f);
        Paint paint = this.f46089y;
        if (z10) {
            if (this.f46059b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.f46061c == null) {
                    this.f46061c = this.f46059b.getBlurRenderNode();
                    invalidate();
                }
                z11 = u.e(this.f46061c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.f46087x;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.f46059b.getLeft(), this.f46059b.getTop());
                u.h(this.f46061c, f10);
                u.c(canvas, this.f46061c);
                canvas.restore();
                paint.setColor((l4 << 24) | 16777215);
                paint.setAlpha((int) (l4 * f10));
                canvas.drawRect(rectF, paint);
                t.b(canvas, rectF, f10);
                canvas.restore();
                this.F.a(canvas, rectF, f7, 0, f10);
            }
        }
        if (z10 && this.f46076p0 != null) {
            Paint paint2 = this.f46082t0;
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint2);
            paint.setColor((l4 << 24) | 16777215);
            paint.setAlpha((int) (l4 * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        } else {
            int i11 = (l4 << 24) | 16777215;
            if (c()) {
                i10 = 687865856;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            paint.setColor(i0.b.k(i11, i10));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        }
        this.F.a(canvas, rectF, f7, 0, f10);
    }

    public final void m() {
        CameraView cameraView = this.f46059b;
        if (cameraView == null) {
            return;
        }
        this.f46059b = null;
        this.f46061c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.f46063d0 && cameraSession != null) {
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
        return f46056z0.getInterpolation(Utilities.l(this.S));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        float L = ((i13 - i11) / 2.0f) - org.telegram.messenger.i0.L(20.0f);
        float f10 = i15 / 2.0f;
        float min = (Math.min(i15, i14) * 0.66f) / 2.0f;
        float f11 = f10 - min;
        float f12 = L - min;
        float f13 = f10 + min;
        float f14 = L + min;
        RectF rectF = this.f46078r;
        rectF.set(f11, f12, f13, f14);
        float L2 = org.telegram.messenger.i0.L(56.0f);
        float L3 = rectF.bottom + org.telegram.messenger.i0.L(64.0f);
        if (this.P != null) {
            f7 = (L2 / 2.0f) + org.telegram.messenger.i0.L(35.0f) + f10;
        } else {
            f7 = f10;
        }
        float f15 = L2 / 2.0f;
        float f16 = L2 + L3;
        this.h.set(f7 - f15, L3, f7 + f15, f16);
        float L4 = (f10 - org.telegram.messenger.i0.L(35.0f)) - f15;
        this.f46073n.set(L4 - f15, L3, L4 + f15, f16);
        this.Q = new StaticLayout(cd.L0(2131745878, null), this.K, i0.a.d(72.0f, i15, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f46065f;
        if (rectF2.isEmpty()) {
            String[] strArr = x0.B9;
            int i16 = org.telegram.messenger.i0.f16020m;
            View view = this;
            int i17 = 0;
            while (true) {
                int top = view.getTop() + i17;
                if (!(view.getParent() instanceof View)) {
                    float currentActionBarHeight = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i16 - top);
                    rectF2.set(org.telegram.messenger.i0.L(9.0f), currentActionBarHeight - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(49.0f), currentActionBarHeight + org.telegram.messenger.i0.L(20.0f));
                    return;
                }
                view = (View) view.getParent();
                i17 = top - view.getScrollY();
            }
        }
    }

    public void setAccept(r20 r20Var) {
        this.O = r20Var;
    }

    public void setButtonLabel(String str) {
        this.L = str;
        Typeface o10 = org.telegram.messenger.i0.o();
        TextPaint textPaint = this.M;
        textPaint.setTypeface(o10);
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
