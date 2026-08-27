package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

public abstract class r4 extends View implements org.telegram.ui.Components.xg0 {
    public final boolean[] A;
    public final float[] B;
    public float C;
    public float[] D;
    public long E;
    public float F;
    public int G;
    public float H;
    public int I;
    public float J;
    public int K;
    public org.telegram.ui.Components.ch0 L;
    public final TextPaint M;
    public float N;
    public int O;
    public String P;

    public final RectF f41795a;

    public int f41796b;

    public final Rect f41797c;
    public final Rect d;

    public final RectF f41798e;

    public final GradientDrawable f41799f;
    public final GradientDrawable h;

    public final float[] f41800n;

    public final Paint f41801r;

    public final Paint f41802s;
    public final Paint v;

    public final Path f41803w;

    public final RectF f41804x;

    public final GradientDrawable[] f41805y;

    public r4(Context context) {
        super(context);
        this.f41795a = new RectF();
        int i10 = 1;
        this.f41796b = 1;
        this.f41797c = new Rect();
        this.d = new Rect();
        this.f41798e = new RectF();
        this.f41800n = new float[]{0.0f, 1.0f};
        this.f41803w = new Path();
        this.f41804x = new RectF();
        this.f41805y = new GradientDrawable[2];
        this.A = new boolean[2];
        this.B = new float[2];
        this.C = 0.0f;
        this.D = null;
        this.G = -1;
        this.K = 1;
        this.O = -1;
        Paint paint = new Paint(1);
        this.f41802s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f41799f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        int i11 = 0;
        while (i11 < 2) {
            this.f41805y[i11] = new GradientDrawable(i11 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f41805y[i11].setShape(0);
            i11++;
        }
        Paint paint3 = new Paint(1);
        this.f41801r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28125j);
        valueAnimatorOfFloat.addUpdateListener(new g3(this, i10));
        valueAnimatorOfFloat.addListener(new lh.h9(this, 7));
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    private String getCurrentTitle() {
        if (this.O != this.L.getCurrentItem()) {
            this.P = ((String) this.L.getAdapter().d(this.L.getCurrentItem())).toString();
            this.O = this.L.getCurrentItem();
        }
        return this.P;
    }

    @Override
    public final void a() {
        Arrays.fill(this.A, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.A[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.ch0 getProfileGalleryView() {
        return this.L;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float[] fArr;
        float[] fArr2;
        Paint paint;
        float f10;
        float f11;
        int i10;
        boolean z10;
        float f12;
        float[] fArr3;
        Paint paint2;
        Paint paint3;
        int i11;
        float f13;
        float f14;
        Paint paint4;
        int i12 = 0;
        while (true) {
            fArr = this.B;
            if (i12 >= 2) {
                break;
            }
            float f15 = fArr[i12];
            if (f15 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.f41805y;
                gradientDrawableArr[i12].setAlpha((int) (f15 * 255.0f));
                gradientDrawableArr[i12].draw(canvas);
            }
            i12++;
        }
        this.f41799f.draw(canvas);
        Rect rect = this.f41797c;
        Paint paint5 = this.f41801r;
        canvas.drawRect(rect, paint5);
        int realCount = this.L.getRealCount();
        this.I = this.L.getRealPosition();
        float[] fArr4 = this.D;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.D = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.E;
        if (j10 < 0 || j10 > 20) {
            j10 = 17;
        }
        this.E = jElapsedRealtime;
        float f16 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            paint = paint5;
            f10 = 180.0f;
            f11 = 8.0f;
            i10 = 20;
            z10 = false;
        } else {
            int i13 = this.f41796b;
            if (i13 == 0) {
                this.C = 0.0f;
                this.f41796b = 3;
            } else if (i13 == 1) {
                this.C = 0.0f;
                this.f41796b = 2;
            }
            int i14 = this.f41796b;
            f10 = 180.0f;
            Paint paint6 = this.v;
            f11 = 8.0f;
            Paint paint7 = this.f41802s;
            if (i14 == 2) {
                paint7.setAlpha((int) (this.C * 85.0f));
                paint6.setAlpha((int) (this.C * 255.0f));
            }
            int iX = org.telegram.messenger.rl.x((realCount - 1) * 2, getMeasuredWidth() - AndroidUtilities.dp(10.0f), realCount);
            int iDp = AndroidUtilities.dp(8.0f);
            int i15 = 0;
            z10 = false;
            while (i15 < realCount) {
                int iDp2 = (iX * i15) + AndroidUtilities.dp((i15 * 2) + 5);
                int i16 = this.G;
                RectF rectF = this.f41798e;
                if (i15 != i16 || Math.abs(this.F - f16) <= 1.0E-4f) {
                    fArr3 = fArr;
                    paint2 = paint5;
                    paint3 = paint6;
                    i11 = 85;
                    if (i15 == this.I) {
                        if (this.L.I()) {
                            float currentItemProgress = this.L.getCurrentItemProgress();
                            this.H = currentItemProgress;
                            if ((currentItemProgress > 0.0f || !this.L.J()) && this.J <= 0.0f) {
                                f14 = currentItemProgress;
                            } else {
                                float f17 = this.J;
                                int i17 = this.K;
                                f14 = currentItemProgress;
                                float f18 = ((((long) i17) * j10) / 500.0f) + f17;
                                this.J = f18;
                                if (f18 > 1.0f) {
                                    this.J = 1.0f;
                                    this.K = i17 * (-1);
                                } else if (f18 <= 0.0f) {
                                    this.J = 0.0f;
                                    this.K = i17 * (-1);
                                }
                            }
                            rectF.set(iDp2, iDp, iDp2 + iX, AndroidUtilities.dp(2.0f) + iDp);
                            paint7.setAlpha((int) (((this.J * 48.0f) + 85.0f) * this.C));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint7);
                            f13 = f14;
                        } else {
                            this.H = 1.0f;
                        }
                    }
                    f13 = 1.0f;
                    float f19 = iDp2;
                    rectF.set(f19, iDp, (iX * f13) + f19, AndroidUtilities.dp(2.0f) + iDp);
                    if (i15 != this.I) {
                        this.D[i15] = 0.75f;
                    } else if (this.f41796b == 3) {
                        paint7.setAlpha((int) (AndroidUtilities.lerp(i11, 255, org.telegram.ui.Components.er.f28125j.getInterpolation(this.D[i15])) * this.C));
                    }
                    float fDp = AndroidUtilities.dp(1.0f);
                    float fDp2 = AndroidUtilities.dp(1.0f);
                    if (i15 == this.I) {
                        paint4 = paint3;
                    } else {
                        paint4 = paint7;
                    }
                    canvas.drawRoundRect(rectF, fDp, fDp2, paint4);
                    i15++;
                    fArr = fArr3;
                    paint6 = paint3;
                    paint5 = paint2;
                    f16 = 1.0f;
                } else {
                    float f20 = this.F;
                    canvas.save();
                    float f21 = iDp2;
                    fArr3 = fArr;
                    float f22 = iDp;
                    paint3 = paint6;
                    float f23 = iDp2 + iX;
                    paint2 = paint5;
                    canvas.clipRect((iX * f20) + f21, f22, f23, AndroidUtilities.dp(2.0f) + iDp);
                    rectF.set(f21, f22, f23, AndroidUtilities.dp(2.0f) + iDp);
                    paint7.setAlpha((int) (this.C * 85.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint7);
                    canvas.restore();
                    f13 = f20;
                }
                i11 = 80;
                z10 = true;
                float f110 = iDp2;
                rectF.set(f110, iDp, (iX * f13) + f110, AndroidUtilities.dp(2.0f) + iDp);
                if (i15 != this.I) {
                    this.D[i15] = 0.75f;
                } else if (this.f41796b == 3) {
                    paint7.setAlpha((int) (AndroidUtilities.lerp(i11, 255, org.telegram.ui.Components.er.f28125j.getInterpolation(this.D[i15])) * this.C));
                }
                float fDp3 = AndroidUtilities.dp(1.0f);
                float fDp4 = AndroidUtilities.dp(1.0f);
                if (i15 == this.I) {
                    paint4 = paint3;
                } else {
                    paint4 = paint7;
                }
                canvas.drawRoundRect(rectF, fDp3, fDp4, paint4);
                i15++;
                fArr = fArr3;
                paint6 = paint3;
                paint5 = paint2;
                f16 = 1.0f;
            }
            fArr2 = fArr;
            paint = paint5;
            int i18 = this.f41796b;
            if (i18 == 2) {
                float f24 = this.C;
                if (f24 < 1.0f) {
                    float f25 = (j10 / 180.0f) + f24;
                    this.C = f25;
                    if (f25 > 1.0f) {
                        this.C = 1.0f;
                    }
                    i10 = 20;
                    z10 = true;
                } else {
                    this.f41796b = 3;
                }
            } else if (i18 == 3) {
                int i19 = 0;
                while (true) {
                    float[] fArr6 = this.D;
                    if (i19 >= fArr6.length) {
                        break;
                    }
                    if (i19 != this.I) {
                        float f26 = fArr6[i19];
                        if (f26 > 0.0f) {
                            float f27 = f26 - (j10 / 500.0f);
                            fArr6[i19] = f27;
                            if (f27 <= 0.0f) {
                                fArr6[i19] = 0.0f;
                                if (i19 == this.G) {
                                    this.G = -1;
                                }
                            }
                            z10 = true;
                        } else if (i19 == this.G) {
                            this.G = -1;
                        }
                    } else if (i19 == this.G) {
                        this.G = -1;
                    }
                    i19++;
                }
            }
            i10 = 20;
        }
        if (realCount > i10 || this.N != 0.0f) {
            String currentTitle = getCurrentTitle();
            TextPaint textPaint = this.M;
            float fMeasureText = textPaint.measureText(currentTitle);
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(f11);
            RectF rectF2 = this.f41795a;
            rectF2.right = measuredWidth;
            rectF2.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + fMeasureText);
            float fDp5 = AndroidUtilities.dp(f11);
            rectF2.top = fDp5;
            rectF2.bottom = fDp5 + AndroidUtilities.dp(26.0f);
            float fDpf2 = AndroidUtilities.dpf2(12.0f);
            canvas.save();
            boolean z11 = realCount > 20;
            if (z11) {
                float f28 = this.N;
                if (f28 != 1.0f) {
                    this.N = (j10 / 150.0f) + f28;
                } else if (!z11) {
                    f12 = this.N;
                    if (f12 != 0.0f) {
                        this.N = f12 - (j10 / 150.0f);
                    }
                }
            } else if (!z11) {
                f12 = this.N;
                if (f12 != 0.0f) {
                    this.N = f12 - (j10 / 150.0f);
                }
            }
            float f29 = this.N;
            if (f29 >= 1.0f) {
                this.N = 1.0f;
            } else if (f29 <= 0.0f) {
                this.N = 0.0f;
            } else {
                invalidate();
            }
            float f30 = this.N;
            canvas.scale(f30, f30, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, fDpf2, fDpf2, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (this.A[i20]) {
                float f31 = fArr2[i20];
                if (f31 < 1.0f) {
                    float f32 = (j10 / f10) + f31;
                    fArr2[i20] = f32;
                    if (f32 > 1.0f) {
                        fArr2[i20] = 1.0f;
                    }
                    z10 = true;
                }
            } else {
                float f33 = fArr2[i20];
                if (f33 > 0.0f) {
                    float f34 = f33 - (j10 / f10);
                    fArr2[i20] = f34;
                    if (f34 < 0.0f) {
                        fArr2[i20] = 0.0f;
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.f41803w;
        path.reset();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.f41804x;
        rectF.set(0.0f, 0.0f, measuredHeight, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.f41797c;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        int iDp = (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, iDp, i10, i11);
        this.f41799f.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i11 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f41805y;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.ch0 ch0Var) {
        this.L = ch0Var;
    }

    public void c() {
    }
}
