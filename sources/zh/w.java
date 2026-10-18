package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
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
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
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
import com.google.android.gms.internal.play_billing.k3;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.q10;
public final class w extends FrameLayout {
    public static final bs f52159t0 = new bs(0.05d, 0.7d, 0.1d, 1.0d);
    public static final bs f52160u0 = new bs(0.3d, 0.0d, 0.1d, 1.0d);
    public final q10 E;
    public final Drawable F;
    public final Drawable G;
    public final g2 H;
    public final TextPaint I;
    public String J;
    public final TextPaint K;
    public StaticLayout L;
    public final float M;
    public float N;
    public ValueAnimator O;
    public boolean P;
    public boolean Q;
    public int R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public final HandlerThread W;
    public final le.b f52161a;
    public final Handler f52162a0;
    public CameraView f52163b;
    public volatile boolean f52164b0;
    public Object f52165c;
    public r8.n f52166c0;
    public final RectF d;
    public a6.i f52167d0;
    public final RectF e;
    public Bitmap f52168e0;
    public final RectF f52169f;
    public boolean f52170f0;
    public PointF[] f52171g0;
    public final RectF h;
    public float f52172h0;
    public Bitmap f52173i0;
    public Bitmap f52174j0;
    public final RectF f52175k0;
    public final Paint f52176l0;
    public BitmapShader m0;
    public final RectF f52177n;
    public final Paint f52178n0;
    public final Matrix f52179o0;
    public Bitmap f52180p0;
    public final Paint f52181q0;
    public final RectF f52182r;
    public final RectF f52183r0;
    public final Path f52184s;
    public final p4.s0 f52185s0;
    public final Path v;
    public final Paint f52186w;
    public final Paint f52187x;
    public final Paint f52188y;

    public w(Activity activity, RectF rectF, RectF rectF2, le.b bVar) {
        super(activity);
        View view;
        float g10;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f52169f = rectF4;
        this.h = new RectF();
        this.f52177n = new RectF();
        this.f52182r = new RectF();
        this.f52184s = new Path();
        this.v = new Path();
        this.f52186w = new Paint(1);
        Paint paint = new Paint(1);
        this.f52187x = paint;
        Paint paint2 = new Paint(1);
        this.f52188y = paint2;
        this.E = new q10(2);
        g2 g2Var = new g2(true);
        this.H = g2Var;
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        this.K = new TextPaint(1);
        this.R = -1;
        this.S = 1.0f;
        this.T = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.W = handlerThread;
        this.f52175k0 = new RectF();
        this.f52176l0 = new Paint(2);
        this.f52178n0 = new Paint(3);
        this.f52179o0 = new Matrix();
        this.f52181q0 = new Paint(2);
        this.f52183r0 = new RectF();
        this.f52185s0 = new p4.s0(this, 17);
        this.f52161a = bVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        Drawable mutate = activity.getDrawable(R.drawable.msg_qr_scan).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.F = mutate;
        Drawable mutate2 = activity.getDrawable(R.drawable.qr_flashlight).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.G = mutate2;
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
        if (!u.f()) {
            g10 = AndroidUtilities.dp(28.0f);
        } else {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity != null) {
                view = findActivity.getWindow().getDecorView();
            } else {
                view = null;
            }
            g10 = u.g(view, 0.0f);
        }
        this.M = g10;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f52162a0 = handler;
        handler.post(new v(this, 2));
        invalidate();
        b(1.0f, 390L, new v(this, 3));
    }

    public static xf.c a(zh.w r11, android.graphics.Bitmap r12) {
        throw new UnsupportedOperationException("Method not decompiled: zh.w.a(zh.w, android.graphics.Bitmap):xf.c");
    }

    public static boolean d() {
        if (u.f() && LiteMode.isEnabled(256)) {
            return true;
        }
        return false;
    }

    public static boolean i(RectF rectF, float f7, float f10) {
        if (f7 >= rectF.left - AndroidUtilities.dp(8.0f) && f7 <= rectF.right + AndroidUtilities.dp(8.0f) && f10 >= rectF.top - AndroidUtilities.dp(8.0f) && f10 <= rectF.bottom + AndroidUtilities.dp(8.0f)) {
            return true;
        }
        return false;
    }

    public final void b(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, f7);
        ofFloat.addUpdateListener(new i6(this, 28));
        ofFloat.addListener(new ah.q0(this, runnable));
        ofFloat.setDuration(Math.abs(f7 - this.N) * ((float) j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.O = ofFloat;
        ofFloat.start();
    }

    public final float c(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        Path path;
        boolean z10;
        boolean z11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float k10 = k();
        RectF rectF = this.d;
        float width = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float lerp = AndroidUtilities.lerp(centerX - width, 0.0f, k10);
        float lerp2 = AndroidUtilities.lerp(centerY - height, 0.0f, k10);
        float lerp3 = AndroidUtilities.lerp(centerX + width, getWidth(), k10);
        float lerp4 = AndroidUtilities.lerp(centerY + height, getHeight(), k10);
        RectF rectF2 = this.e;
        rectF2.set(lerp, lerp2, lerp3, lerp4);
        float lerp5 = AndroidUtilities.lerp(rectF.height() / 2.0f, this.M, k());
        int save = canvas2.save();
        if (this.N < 1.0f) {
            Path path2 = this.f52184s;
            path2.rewind();
            path2.addRoundRect(rectF2, lerp5, lerp5, Path.Direction.CW);
            canvas2.clipPath(path2);
        }
        float clamp01 = 1.0f - Utilities.clamp01(k() / 0.35f);
        float clamp012 = Utilities.clamp01(k() / 0.3f);
        int i10 = (clamp012 > 0.0f ? 1 : (clamp012 == 0.0f ? 0 : -1));
        Paint paint = this.f52186w;
        if (i10 > 0) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (clamp012 * 255.0f));
            canvas2.drawRect(rectF2, paint);
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.N < 1.0f && width2 > 0 && height2 > 0) {
            float max = Math.max(rectF2.width() / width2, rectF2.height() / height2);
            canvas2.translate(rectF2.centerX(), rectF2.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        }
        super.dispatchDraw(canvas);
        if (this.f52173i0 != null) {
            Paint paint2 = this.f52176l0;
            paint2.setAlpha((int) (Utilities.clamp01((k() - 0.15f) / 0.45f) * 255.0f));
            canvas2.drawBitmap(this.f52173i0, (Rect) null, this.f52175k0, paint2);
        }
        float clamp013 = Utilities.clamp01((k() - 0.15f) / 0.45f);
        if (clamp013 > 0.0f) {
            float dp = AndroidUtilities.dp(14.0f);
            paint.setColor(1073741824);
            paint.setAlpha((int) (64.0f * clamp013));
            int i11 = Build.VERSION.SDK_INT;
            RectF rectF3 = this.f52177n;
            Path path3 = this.v;
            if (i11 >= 29) {
                RectF rectF4 = this.f52183r0;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawDoubleRoundRect(rectF4, 0.0f, 0.0f, rectF3, dp, dp, paint);
                path = path3;
            } else {
                path3.rewind();
                path = path3;
                path.setFillType(Path.FillType.EVEN_ODD);
                Path.Direction direction = Path.Direction.CW;
                path.addRect(0.0f, 0.0f, getWidth(), getHeight(), direction);
                path.addRoundRect(rectF3, dp, dp, direction);
                canvas2.drawPath(path, paint);
                path.setFillType(Path.FillType.WINDING);
            }
            float f19 = (1.0f - this.f52172h0) * clamp013;
            int i12 = 1;
            if (f19 <= 0.004f) {
                f7 = 2.0f;
                f10 = 0.0f;
                f11 = 1.0f;
                f12 = clamp01;
            } else {
                float dp2 = AndroidUtilities.dp(28.0f);
                f7 = 2.0f;
                Paint paint3 = this.f52187x;
                f10 = 0.0f;
                f11 = 1.0f;
                f12 = clamp01;
                int ceil = ((int) Math.ceil(paint3.getStrokeWidth() / 2.0f)) + 1;
                if (this.f52180p0 == null) {
                    int ceil2 = (ceil * 2) + ((int) Math.ceil(dp2));
                    this.f52180p0 = Bitmap.createBitmap(ceil2, ceil2, Bitmap.Config.ARGB_8888);
                    Path path4 = new Path();
                    float f20 = ceil;
                    float f21 = dp2 + f20;
                    path4.moveTo(f20, f21);
                    float f22 = dp + f20;
                    path4.lineTo(f20, f22);
                    path4.quadTo(f20, f20, f22, f20);
                    path4.lineTo(f21, f20);
                    Paint paint4 = new Paint(paint3);
                    paint4.setAlpha(255);
                    new Canvas(this.f52180p0).drawPath(path4, paint4);
                    this.f52180p0.prepareToDraw();
                }
                Paint paint5 = this.f52181q0;
                paint5.setAlpha((int) (f19 * 255.0f));
                for (int i13 = 0; i13 < 4; i13++) {
                    if (i13 != 1 && i13 != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (i13 >= 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    canvas2.save();
                    if (z10) {
                        f13 = rectF3.right;
                    } else {
                        f13 = rectF3.left;
                    }
                    if (z11) {
                        f14 = rectF3.bottom;
                    } else {
                        f14 = rectF3.top;
                    }
                    canvas2.translate(f13, f14);
                    float f23 = -1.0f;
                    if (z10) {
                        f15 = -1.0f;
                    } else {
                        f15 = 1.0f;
                    }
                    if (!z11) {
                        f23 = 1.0f;
                    }
                    canvas2.scale(f15, f23);
                    float f24 = -ceil;
                    canvas2.drawBitmap(this.f52180p0, f24, f24, paint5);
                    canvas2.restore();
                }
            }
            if (this.L != null) {
                canvas2.save();
                canvas2.translate((getWidth() / f7) - (this.L.getWidth() / f7), (rectF3.top - AndroidUtilities.dp(36.0f)) - this.L.getHeight());
                this.I.setAlpha((int) (clamp013 * 255.0f));
                this.L.draw(canvas2);
                canvas2.restore();
            }
            float f25 = this.f52172h0;
            if (this.f52171g0 != null) {
                f16 = f11;
            } else {
                f16 = f10;
            }
            float c10 = c(f25, f16);
            this.f52172h0 = c10;
            PointF[] pointFArr = this.f52171g0;
            if (pointFArr != null && pointFArr.length >= 3 && (cameraView = this.f52163b) != null && c10 > f10) {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + this.f52163b.getLeft();
                float top = textureView.getTop() + this.f52163b.getTop();
                float right = textureView.getRight() + this.f52163b.getLeft();
                int top2 = this.f52163b.getTop();
                RectF rectF5 = this.f52182r;
                rectF5.set(left, top, right, textureView.getBottom() + top2);
                int min = Math.min(4, this.f52171g0.length);
                float f26 = f10;
                float f27 = f26;
                for (int i14 = 0; i14 < min; i14++) {
                    PointF pointF = this.f52171g0[i14];
                    f26 += pointF.x;
                    f27 += pointF.y;
                }
                float f28 = min;
                float width3 = (rectF5.width() * (f26 / f28)) + rectF5.left;
                float height3 = (rectF5.height() * (f27 / f28)) + rectF5.top;
                path.rewind();
                int i15 = 0;
                while (i15 < min) {
                    PointF[] pointFArr2 = this.f52171g0;
                    PointF pointF2 = pointFArr2[((i15 + min) - i12) % min];
                    PointF pointF3 = pointFArr2[i15];
                    int i16 = i15 + 1;
                    PointF pointF4 = pointFArr2[i16 % min];
                    float width4 = (rectF5.width() * pointF3.x) + rectF5.left;
                    float height4 = (rectF5.height() * pointF3.y) + rectF5.top;
                    int i17 = min;
                    float width5 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height5 = (rectF5.height() * pointF2.y) + rectF5.top;
                    float width6 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float f29 = rectF5.top;
                    float f30 = pointF4.y;
                    path.moveTo(k3.y(width5, width4, 0.18f, width4), k3.y(height5, height4, 0.18f, height4));
                    path.lineTo(width4, height4);
                    path.lineTo(((width6 - width4) * 0.18f) + width4, k3.y((rectF5.height() * f30) + f29, height4, 0.18f, height4));
                    min = i17;
                    i15 = i16;
                    i12 = 1;
                }
                canvas2.save();
                float lerp6 = AndroidUtilities.lerp(0.5f, 1.1f, this.f52172h0);
                canvas2.scale(lerp6, lerp6, width3, height3);
                Paint paint6 = this.f52188y;
                paint6.setAlpha((int) (this.f52172h0 * 255.0f * clamp013));
                canvas2.drawPath(path, paint6);
                canvas2.restore();
            }
            float f31 = this.S;
            float f32 = 0.88f;
            if (this.R == 0) {
                f17 = 0.88f;
            } else {
                f17 = f11;
            }
            this.S = c(f31, f17);
            float f33 = this.T;
            if (this.R != 1) {
                f32 = f11;
            }
            this.T = c(f33, f32);
            float f34 = this.V;
            if (this.U) {
                f18 = f11;
            } else {
                f18 = f10;
            }
            this.V = c(f34, f18);
            g(canvas2, this.f52169f, this.S, clamp013, null);
            canvas2 = canvas;
            g(canvas2, this.h, this.T, clamp013, this.G);
        } else {
            f7 = 2.0f;
            f10 = 0.0f;
            f11 = 1.0f;
            f12 = clamp01;
        }
        canvas2.restoreToCount(save);
        if (f12 > f10) {
            Canvas canvas3 = canvas2;
            float f35 = f12;
            h(lerp5, f35, canvas3, rectF2, false);
            String str = this.J;
            Drawable drawable = this.F;
            if (str != null) {
                float dp3 = ((AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(12.0f)) * f11) + rectF2.left;
                float dp4 = ((int) (AndroidUtilities.dp(20.0f) * f11)) / f7;
                drawable.setBounds((int) (dp3 - dp4), (int) (rectF2.centerY() - dp4), (int) (dp3 + dp4), (int) (rectF2.centerY() + dp4));
                int i18 = (int) (f35 * 255.0f);
                drawable.setAlpha(i18);
                drawable.draw(canvas3);
                TextPaint textPaint = this.K;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f) * f11);
                textPaint.setAlpha(i18);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                canvas3.drawText(this.J, ((AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f)) * f11) + rectF2.left, rectF2.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f7), textPaint);
                return;
            }
            float dp5 = ((int) (AndroidUtilities.dp(22.0f) * f11)) / f7;
            drawable.setBounds((int) (rectF2.centerX() - dp5), (int) (rectF2.centerY() - dp5), (int) (rectF2.centerX() + dp5), (int) (rectF2.centerY() + dp5));
            drawable.setAlpha((int) (f35 * 255.0f));
            drawable.draw(canvas3);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.N >= 1.0f && !this.P) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.h;
            RectF rectF2 = this.f52169f;
            int i10 = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.R = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.R == 0 && !i(rectF2, x10, y3)) || (this.R == 1 && !i(rectF, x10, y3))) {
                        this.R = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i11 = this.R;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i11 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.f52163b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z10 = this.U;
                            this.U = !z10;
                            if (!z10) {
                                str = "torch";
                            } else {
                                str = "off";
                            }
                            cameraSessionWrapper.setCurrentFlashMode(str);
                            invalidate();
                        }
                    } else {
                        CameraView cameraView2 = this.f52163b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y3);
                        }
                    }
                    this.R = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (i(rectF2, x10, y3)) {
                    i10 = 0;
                } else if (i(rectF, x10, y3)) {
                    i10 = 1;
                }
                this.R = i10;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (!this.P && !this.Q) {
            this.P = true;
            this.f52164b0 = false;
            Matrix matrix = this.f52179o0;
            RectF rectF = this.f52175k0;
            CameraView cameraView = this.f52163b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.f52173i0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    this.f52173i0 = null;
                }
                if (this.f52173i0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (d()) {
                        Bitmap bitmap = this.f52173i0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.f52173i0.getHeight() / 8), true);
                        this.f52174j0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.f52174j0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.m0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.f52174j0.getWidth(), rectF.height() / this.f52174j0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.m0.setLocalMatrix(matrix);
                        this.f52178n0.setShader(this.m0);
                    }
                }
            }
            j();
            b(0.0f, 330L, new v(this, 0));
        }
    }

    public final void f() {
        if (this.Q) {
            return;
        }
        this.Q = true;
        this.f52164b0 = false;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        j();
        this.f52162a0.removeCallbacksAndMessages(null);
        this.f52162a0.post(new v(this, 1));
    }

    public final void g(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        h(height, f10, canvas, rectF, true);
        if (drawable == this.G && this.V > 0.0f) {
            Paint paint = this.f52186w;
            paint.setColor(-1);
            paint.setAlpha((int) (this.V * 102.0f * f10));
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
            g2 g2Var = this.H;
            g2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), rectF.centerY() - (AndroidUtilities.dp(24.0f) / 2.0f));
            g2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void h(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        int i10;
        boolean z11;
        if (f10 <= 0.0f) {
            return;
        }
        int clamp01 = (int) (Utilities.clamp01(v0.f52158b[3] / 100.0f) * 255.0f);
        Paint paint = this.f52186w;
        if (z10) {
            if (this.f52163b != null && canvas.isHardwareAccelerated() && d()) {
                if (this.f52165c == null) {
                    this.f52165c = this.f52163b.getBlurRenderNode();
                    invalidate();
                }
                z11 = u.e(this.f52165c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.v;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.f52163b.getLeft(), this.f52163b.getTop());
                u.h(this.f52165c, f10);
                u.c(canvas, this.f52165c);
                canvas.restore();
                paint.setColor((clamp01 << 24) | 16777215);
                paint.setAlpha((int) (clamp01 * f10));
                canvas.drawRect(rectF, paint);
                t.b(canvas, rectF, f10);
                canvas.restore();
                this.E.a(canvas, rectF, f7, 0, f10);
            }
        }
        if (z10 && this.f52174j0 != null) {
            Paint paint2 = this.f52178n0;
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint2);
            paint.setColor((clamp01 << 24) | 16777215);
            paint.setAlpha((int) (clamp01 * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        } else {
            int i11 = (clamp01 << 24) | 16777215;
            if (d()) {
                i10 = 687865856;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            paint.setColor(i0.a.k(i11, i10));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        }
        this.E.a(canvas, rectF, f7, 0, f10);
    }

    public final void j() {
        CameraView cameraView = this.f52163b;
        if (cameraView == null) {
            return;
        }
        this.f52163b = null;
        this.f52165c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.U && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float k() {
        if (this.P) {
            return 1.0f - f52160u0.getInterpolation(1.0f - this.N);
        }
        return f52159t0.getInterpolation(Utilities.clamp01(this.N));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        float dp = ((i13 - i11) / 2.0f) - AndroidUtilities.dp(20.0f);
        float f7 = i15 / 2.0f;
        float min = (Math.min(i15, i14) * 0.66f) / 2.0f;
        float f10 = f7 - min;
        float f11 = dp - min;
        float f12 = f7 + min;
        float f13 = dp + min;
        RectF rectF = this.f52177n;
        rectF.set(f10, f11, f12, f13);
        float dp2 = AndroidUtilities.dp(56.0f);
        float f14 = dp2 / 2.0f;
        float dp3 = rectF.bottom + AndroidUtilities.dp(64.0f) + dp2;
        this.h.set(f7 - f14, rectF.bottom + AndroidUtilities.dp(64.0f), f7 + f14, dp3);
        this.L = new StaticLayout(LocaleController.getString(R.string.ScanQrCode), this.I, org.telegram.messenger.g0.b(72.0f, i15, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f52169f;
        if (rectF2.isEmpty()) {
            String[] strArr = t0.C9;
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
}
