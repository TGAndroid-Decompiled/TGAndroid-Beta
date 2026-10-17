package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.internal.cast.a6;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.q10;
import w7.z5;
public final class d0 extends FrameLayout {
    public static final bs f51945l0 = new bs(0.05d, 0.7d, 0.1d, 1.0d);
    public static final bs m0 = new bs(0.3d, 0.0d, 0.1d, 1.0d);
    public final LinearGradient E;
    public final Matrix F;
    public final q10 G;
    public final Drawable H;
    public final Drawable I;
    public final g2 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public StaticLayout N;
    public final float O;
    public float P;
    public ValueAnimator Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public float V;
    public boolean W;
    public final le.b f51946a;
    public float f51947a0;
    public final CameraView f51948b;
    public final HandlerThread f51949b0;
    public final Object f51950c;
    public final Handler f51951c0;
    public final RectF d;
    public volatile boolean f51952d0;
    public final RectF e;
    public r8.n f51953e0;
    public final RectF f51954f;
    public a6.i f51955f0;
    public Bitmap f51956g0;
    public final RectF h;
    public boolean f51957h0;
    public PointF[] f51958i0;
    public float f51959j0;
    public final p4.s0 f51960k0;
    public final RectF f51961n;
    public final RectF f51962r;
    public final Path f51963s;
    public final Path v;
    public final Paint f51964w;
    public final Paint f51965x;
    public final Paint f51966y;

    public d0(Activity activity, RectF rectF, RectF rectF2, le.b bVar) {
        super(activity);
        View view;
        float g10;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f51954f = rectF4;
        this.h = new RectF();
        this.f51961n = new RectF();
        this.f51962r = new RectF();
        this.f51963s = new Path();
        this.v = new Path();
        this.f51964w = new Paint(1);
        Paint paint = new Paint(1);
        this.f51965x = paint;
        Paint paint2 = new Paint(1);
        this.f51966y = paint2;
        this.E = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 352321535, 16777215, Shader.TileMode.CLAMP);
        this.F = new Matrix();
        this.G = new q10(2);
        g2 g2Var = new g2(true);
        this.J = g2Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.T = -1;
        this.U = 1.0f;
        this.V = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f51949b0 = handlerThread;
        this.f51960k0 = new p4.s0(this, 17);
        this.f51946a = bVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        Drawable mutate = activity.getDrawable(R.drawable.msg_qr_scan).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.H = mutate;
        Drawable mutate2 = activity.getDrawable(R.drawable.qr_flashlight).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.I = mutate2;
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
        paint2.setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(3.0f), 1080452710);
        if (!b0.f()) {
            g10 = AndroidUtilities.dp(28.0f);
        } else {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity != null) {
                view = findActivity.getWindow().getDecorView();
            } else {
                view = null;
            }
            g10 = b0.g(view, 0.0f);
        }
        this.O = g10;
        if (CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(activity, false);
            this.f51948b = cameraView;
            cameraView.setUseMaxPreview(true);
            cameraView.setOptimizeForBarcode(true);
            cameraView.setDelegate(new yh.r0(this, 4));
            if (b0.f()) {
                this.f51950c = cameraView.getBlurRenderNode();
            }
            addView(cameraView, z5.d(-1.0f, -1));
        } else {
            this.f51948b = null;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f51951c0 = handler;
        handler.post(new c0(this, 2));
        CameraView cameraView2 = this.f51948b;
        if (cameraView2 != null) {
            cameraView2.setAlpha(Utilities.clamp01((j() - 0.15f) / 0.45f));
        }
        invalidate();
        b(1.0f, 500L, null);
    }

    public static xf.c a(zh.d0 r11, android.graphics.Bitmap r12) {
        throw new UnsupportedOperationException("Method not decompiled: zh.d0.a(zh.d0, android.graphics.Bitmap):xf.c");
    }

    public static boolean i(RectF rectF, float f7, float f10) {
        if (f7 >= rectF.left - AndroidUtilities.dp(8.0f) && f7 <= rectF.right + AndroidUtilities.dp(8.0f) && f10 >= rectF.top - AndroidUtilities.dp(8.0f) && f10 <= rectF.bottom + AndroidUtilities.dp(8.0f)) {
            return true;
        }
        return false;
    }

    public final void b(float f7, long j10, c0 c0Var) {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.P, f7);
        ofFloat.addUpdateListener(new i6(this, 28));
        ofFloat.addListener(new ah.q0(this, c0Var));
        ofFloat.setDuration(Math.abs(f7 - this.P) * ((float) j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.Q = ofFloat;
        ofFloat.start();
    }

    public final float c(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    public final void d() {
        if (!this.R && !this.S) {
            this.R = true;
            this.f51952d0 = false;
            b(0.0f, 330L, new c0(this, 0));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float lerp = AndroidUtilities.lerp(1.0f, 1.15f, h());
        float j10 = j();
        RectF rectF2 = this.d;
        float width = (rectF2.width() / 2.0f) * lerp;
        float height = (rectF2.height() / 2.0f) * lerp;
        float centerX = rectF2.centerX();
        float centerY = rectF2.centerY();
        float lerp2 = AndroidUtilities.lerp(centerX - width, 0.0f, j10);
        float lerp3 = AndroidUtilities.lerp(centerY - height, 0.0f, j10);
        float lerp4 = AndroidUtilities.lerp(centerX + width, getWidth(), j10);
        float lerp5 = AndroidUtilities.lerp(centerY + height, getHeight(), j10);
        RectF rectF3 = this.e;
        rectF3.set(lerp2, lerp3, lerp4, lerp5);
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.lerp(1.0f, 1.15f, h()) * (rectF2.height() / 2.0f), this.O, j());
        int save = canvas2.save();
        if (this.P < 1.0f) {
            Path path = this.f51963s;
            path.rewind();
            path.addRoundRect(rectF3, lerp6, lerp6, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float clamp01 = 1.0f - Utilities.clamp01(j() / 0.35f);
        float clamp012 = Utilities.clamp01(j() / 0.3f);
        int i10 = (clamp012 > 0.0f ? 1 : (clamp012 == 0.0f ? 0 : -1));
        Paint paint = this.f51964w;
        if (i10 > 0) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (clamp012 * 255.0f));
            canvas2.drawRect(rectF3, paint);
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.P < 1.0f && width2 > 0 && height2 > 0) {
            f7 = 2.0f;
            float max = Math.max(rectF3.width() / width2, rectF3.height() / height2);
            canvas2.translate(rectF3.centerX(), rectF3.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        } else {
            f7 = 2.0f;
        }
        super.dispatchDraw(canvas);
        float clamp013 = Utilities.clamp01((j() - 0.15f) / 0.45f);
        if (clamp013 > 0.0f) {
            float dp = AndroidUtilities.dp(14.0f);
            Path path2 = this.v;
            path2.rewind();
            path2.setFillType(Path.FillType.EVEN_ODD);
            f10 = 14.0f;
            Path.Direction direction = Path.Direction.CW;
            path2.addRect(0.0f, 0.0f, getWidth(), getHeight(), direction);
            RectF rectF4 = this.f51961n;
            path2.addRoundRect(rectF4, dp, dp, direction);
            paint.setColor(1073741824);
            paint.setAlpha((int) (64.0f * clamp013));
            canvas2.drawPath(path2, paint);
            path2.setFillType(Path.FillType.WINDING);
            float dp2 = AndroidUtilities.dp(28.0f);
            float f17 = clamp013 * 255.0f;
            f11 = 0.0f;
            f12 = 255.0f;
            Paint paint2 = this.f51965x;
            paint2.setAlpha((int) ((1.0f - this.f51959j0) * f17));
            path2.rewind();
            path2.moveTo(rectF4.left, rectF4.top + dp2);
            path2.lineTo(rectF4.left, rectF4.top + dp);
            float f18 = rectF4.left;
            float f19 = rectF4.top;
            path2.quadTo(f18, f19, f18 + dp, f19);
            path2.lineTo(rectF4.left + dp2, rectF4.top);
            path2.moveTo(rectF4.right - dp2, rectF4.top);
            path2.lineTo(rectF4.right - dp, rectF4.top);
            float f20 = rectF4.right;
            float f21 = rectF4.top;
            path2.quadTo(f20, f21, f20, f21 + dp);
            path2.lineTo(rectF4.right, rectF4.top + dp2);
            path2.moveTo(rectF4.right, rectF4.bottom - dp2);
            path2.lineTo(rectF4.right, rectF4.bottom - dp);
            float f22 = rectF4.right;
            float f23 = rectF4.bottom;
            path2.quadTo(f22, f23, f22 - dp, f23);
            path2.lineTo(rectF4.right - dp2, rectF4.bottom);
            path2.moveTo(rectF4.left + dp2, rectF4.bottom);
            path2.lineTo(rectF4.left + dp, rectF4.bottom);
            float f24 = rectF4.left;
            float f25 = rectF4.bottom;
            path2.quadTo(f24, f25, f24, f25 - dp);
            path2.lineTo(rectF4.left, rectF4.bottom - dp2);
            canvas2.drawPath(path2, paint2);
            if (this.N != null) {
                canvas2.save();
                canvas2.translate((getWidth() / f7) - (this.N.getWidth() / f7), (rectF4.top - AndroidUtilities.dp(36.0f)) - this.N.getHeight());
                this.K.setAlpha((int) f17);
                this.N.draw(canvas2);
                canvas2.restore();
            }
            float f26 = this.f51959j0;
            if (this.f51958i0 != null) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            float c10 = c(f26, f13);
            this.f51959j0 = c10;
            PointF[] pointFArr = this.f51958i0;
            int i11 = 1;
            if (pointFArr == null || pointFArr.length < 3 || (cameraView = this.f51948b) == null || c10 <= 0.0f) {
                f14 = clamp013;
                rectF = rectF3;
            } else {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + cameraView.getLeft();
                float top = textureView.getTop() + cameraView.getTop();
                int left2 = cameraView.getLeft();
                int top2 = cameraView.getTop();
                RectF rectF5 = this.f51962r;
                rectF5.set(left, top, textureView.getRight() + left2, textureView.getBottom() + top2);
                int min = Math.min(4, this.f51958i0.length);
                float f27 = 0.0f;
                float f28 = 0.0f;
                for (int i12 = 0; i12 < min; i12++) {
                    PointF pointF = this.f51958i0[i12];
                    f27 += pointF.x;
                    f28 += pointF.y;
                }
                float f29 = min;
                float width3 = (rectF5.width() * (f27 / f29)) + rectF5.left;
                float height3 = (rectF5.height() * (f28 / f29)) + rectF5.top;
                path2.rewind();
                int i13 = 0;
                while (i13 < min) {
                    PointF[] pointFArr2 = this.f51958i0;
                    PointF pointF2 = pointFArr2[((i13 + min) - i11) % min];
                    PointF pointF3 = pointFArr2[i13];
                    int i14 = i13 + 1;
                    PointF pointF4 = pointFArr2[i14 % min];
                    float f30 = clamp013;
                    float width4 = (rectF5.width() * pointF3.x) + rectF5.left;
                    int i15 = min;
                    float height4 = (rectF5.height() * pointF3.y) + rectF5.top;
                    float width5 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height5 = (rectF5.height() * pointF2.y) + rectF5.top;
                    RectF rectF6 = rectF3;
                    float width6 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float f31 = rectF5.top;
                    float f32 = pointF4.y;
                    path2.moveTo(a6.x(width5, width4, 0.18f, width4), a6.x(height5, height4, 0.18f, height4));
                    path2.lineTo(width4, height4);
                    path2.lineTo(((width6 - width4) * 0.18f) + width4, a6.x((rectF5.height() * f32) + f31, height4, 0.18f, height4));
                    clamp013 = f30;
                    min = i15;
                    i13 = i14;
                    rectF3 = rectF6;
                    i11 = 1;
                }
                f14 = clamp013;
                rectF = rectF3;
                canvas2.save();
                float lerp7 = AndroidUtilities.lerp(0.5f, 1.1f, this.f51959j0);
                canvas2.scale(lerp7, lerp7, width3, height3);
                Paint paint3 = this.f51966y;
                paint3.setAlpha((int) (this.f51959j0 * 255.0f * f14));
                canvas2.drawPath(path2, paint3);
                canvas2.restore();
            }
            float f33 = this.U;
            float f34 = 0.88f;
            if (this.T == 0) {
                f15 = 0.88f;
            } else {
                f15 = 1.0f;
            }
            this.U = c(f33, f15);
            float f35 = this.V;
            if (this.T != 1) {
                f34 = 1.0f;
            }
            this.V = c(f35, f34);
            float f36 = this.f51947a0;
            if (this.W) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            this.f51947a0 = c(f36, f16);
            float f37 = f14;
            f(canvas2, this.f51954f, this.U, f37, null);
            canvas2 = canvas;
            f(canvas2, this.h, this.V, f37, this.I);
        } else {
            f10 = 14.0f;
            rectF = rectF3;
            f11 = 0.0f;
            f12 = 255.0f;
        }
        canvas2.restoreToCount(save);
        if (clamp01 > f11) {
            Canvas canvas3 = canvas2;
            RectF rectF7 = rectF;
            g(lerp6, clamp01, canvas3, rectF7, false);
            float lerp8 = AndroidUtilities.lerp(1.0f, 1.15f, h());
            String str = this.L;
            Drawable drawable = this.H;
            if (str != null) {
                float dp3 = ((AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(12.0f)) * lerp8) + rectF7.left;
                float dp4 = ((int) (AndroidUtilities.dp(20.0f) * lerp8)) / f7;
                drawable.setBounds((int) (dp3 - dp4), (int) (rectF7.centerY() - dp4), (int) (dp3 + dp4), (int) (rectF7.centerY() + dp4));
                int i16 = (int) (clamp01 * f12);
                drawable.setAlpha(i16);
                drawable.draw(canvas3);
                TextPaint textPaint = this.M;
                textPaint.setTextSize(AndroidUtilities.dp(f10) * lerp8);
                textPaint.setAlpha(i16);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                canvas3.drawText(this.L, ((AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f)) * lerp8) + rectF7.left, rectF7.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f7), textPaint);
                return;
            }
            float dp5 = ((int) (AndroidUtilities.dp(22.0f) * lerp8)) / f7;
            drawable.setBounds((int) (rectF7.centerX() - dp5), (int) (rectF7.centerY() - dp5), (int) (rectF7.centerX() + dp5), (int) (rectF7.centerY() + dp5));
            drawable.setAlpha((int) (clamp01 * f12));
            drawable.draw(canvas3);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.P >= 1.0f && !this.R) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.h;
            RectF rectF2 = this.f51954f;
            int i10 = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.T = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.T == 0 && !i(rectF2, x10, y3)) || (this.T == 1 && !i(rectF, x10, y3))) {
                        this.T = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i11 = this.T;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        d();
                    } else {
                        CameraView cameraView = this.f51948b;
                        if (i11 == 1) {
                            performHapticFeedback(3);
                            if (cameraView != null) {
                                cameraSessionWrapper = cameraView.getCameraSession();
                            } else {
                                cameraSessionWrapper = null;
                            }
                            if (cameraSessionWrapper != null) {
                                boolean z10 = this.W;
                                this.W = !z10;
                                if (!z10) {
                                    str = "torch";
                                } else {
                                    str = "off";
                                }
                                cameraSessionWrapper.setCurrentFlashMode(str);
                                invalidate();
                            }
                        } else if (cameraView != null) {
                            cameraView.focusToPoint((int) x10, (int) y3);
                        }
                    }
                    this.T = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (i(rectF2, x10, y3)) {
                    i10 = 0;
                } else if (i(rectF, x10, y3)) {
                    i10 = 1;
                }
                this.T = i10;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        if (this.S) {
            return;
        }
        this.S = true;
        this.f51952d0 = false;
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        CameraView cameraView = this.f51948b;
        if (cameraView != null) {
            CameraSessionWrapper cameraSession = cameraView.getCameraSession();
            if (this.W && cameraSession != null) {
                cameraSession.setCurrentFlashMode("off");
            }
            this.f51948b.destroy(true, null);
        }
        this.f51951c0.removeCallbacksAndMessages(null);
        this.f51951c0.post(new c0(this, 1));
    }

    public final void f(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        g(height, f10, canvas, rectF, true);
        if (drawable == this.I && this.f51947a0 > 0.0f) {
            Paint paint = this.f51964w;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f51947a0 * 102.0f * f10));
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

    public final void g(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        CameraView cameraView;
        if (f10 <= 0.0f) {
            return;
        }
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Paint paint = this.f51964w;
        if (z10 && b0.f() && (cameraView = this.f51948b) != null && canvas.isHardwareAccelerated()) {
            Object obj = this.f51950c;
            if (b0.e(obj)) {
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f));
                }
                canvas.save();
                canvas.translate(cameraView.getLeft(), cameraView.getTop());
                b0.c(canvas, obj);
                canvas.restore();
                if (i10 < 0) {
                    canvas.restore();
                }
                int clamp01 = (int) (Utilities.clamp01(e1.f51980b[3] / 100.0f) * 255.0f);
                paint.setColor((clamp01 << 24) | 16777215);
                paint.setAlpha((int) (clamp01 * f10));
                canvas.drawRect(rectF, paint);
                float min = Math.min(rectF.height(), AndroidUtilities.dp(40.0f));
                Matrix matrix = this.F;
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, rectF.top);
                LinearGradient linearGradient = this.E;
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                paint.setAlpha((int) (255.0f * f10));
                canvas.drawRect(rectF, paint);
                paint.setShader(null);
                canvas.restore();
                this.G.a(canvas, rectF, f7, 0, f10);
            }
        }
        paint.setColor(687865856);
        paint.setAlpha((int) (41.0f * f10));
        canvas.drawRect(rectF, paint);
        int clamp012 = (int) (Utilities.clamp01(e1.f51980b[3] / 100.0f) * 255.0f);
        paint.setColor((clamp012 << 24) | 16777215);
        paint.setAlpha((int) (clamp012 * f10));
        canvas.drawRect(rectF, paint);
        float min2 = Math.min(rectF.height(), AndroidUtilities.dp(40.0f));
        Matrix matrix2 = this.F;
        matrix2.setScale(1.0f, min2);
        matrix2.postTranslate(0.0f, rectF.top);
        LinearGradient linearGradient2 = this.E;
        linearGradient2.setLocalMatrix(matrix2);
        paint.setShader(linearGradient2);
        paint.setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paint);
        paint.setShader(null);
        canvas.restore();
        this.G.a(canvas, rectF, f7, 0, f10);
    }

    public final float h() {
        if (this.R) {
            return Utilities.clamp01(this.P / 0.12f);
        }
        return bs.f25034k.getInterpolation(Utilities.clamp01((this.P * 500.0f) / 150.0f));
    }

    public final float j() {
        if (this.R) {
            return 1.0f - m0.getInterpolation(1.0f - this.P);
        }
        return f51945l0.getInterpolation(Utilities.clamp01(((this.P * 500.0f) - 110.0f) / 390.0f));
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
        RectF rectF = this.f51961n;
        rectF.set(f10, f11, f12, f13);
        float dp2 = AndroidUtilities.dp(56.0f);
        float f14 = dp2 / 2.0f;
        float dp3 = rectF.bottom + AndroidUtilities.dp(64.0f) + dp2;
        this.h.set(f7 - f14, rectF.bottom + AndroidUtilities.dp(64.0f), f7 + f14, dp3);
        this.N = new StaticLayout(LocaleController.getString(R.string.ScanQrCode), this.K, org.telegram.messenger.q.b(72.0f, i15, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f51954f;
        if (rectF2.isEmpty()) {
            float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight;
            rectF2.set(AndroidUtilities.dp(9.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(49.0f), currentActionBarHeight + AndroidUtilities.dp(20.0f));
        }
    }
}
