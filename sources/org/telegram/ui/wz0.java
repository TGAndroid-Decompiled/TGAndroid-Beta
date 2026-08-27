package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

public final class wz0 extends View implements org.telegram.ui.Components.xg0 {
    public boolean A;
    public float B;
    public float C;
    public float[] D;
    public long E;
    public float F;
    public int G;
    public float H;
    public int I;
    public float J;
    public int K;
    public final ProfileActivity L;

    public final int f44216a;

    public final Rect f44217b;

    public final Rect f44218c;
    public final RectF d;

    public final GradientDrawable f44219e;

    public final GradientDrawable f44220f;
    public final ValueAnimator h;

    public final float[] f44221n;

    public final Paint f44222r;

    public final Paint f44223s;
    public final Paint v;

    public final GradientDrawable[] f44224w;

    public final boolean[] f44225x;

    public final float[] f44226y;

    public wz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.L = profileActivity;
        this.f44216a = (!((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getOccupyStatusBar() || ((org.telegram.ui.ActionBar.n2) profileActivity).inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight;
        this.f44217b = new Rect();
        this.f44218c = new Rect();
        this.d = new RectF();
        this.f44221n = new float[]{0.0f, 1.0f};
        this.f44224w = new GradientDrawable[2];
        this.f44225x = new boolean[2];
        this.f44226y = new float[2];
        this.C = 0.0f;
        this.D = null;
        this.G = -1;
        this.K = 1;
        setVisibility(8);
        Paint paint = new Paint(1);
        this.f44223s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f44219e = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.f44220f = gradientDrawable2;
        gradientDrawable2.setShape(0);
        int i10 = 0;
        while (i10 < 2) {
            this.f44224w[i10] = new GradientDrawable(i10 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f44224w[i10].setShape(0);
            i10++;
        }
        Paint paint3 = new Paint(1);
        this.f44222r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28125j);
        valueAnimatorOfFloat.addUpdateListener(new g3(this, 28));
        valueAnimatorOfFloat.addListener(new f50(this, 22));
    }

    @Override
    public final void a() {
        Arrays.fill(this.f44225x, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.f44225x[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        this.L.i5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(float f10, boolean z10) {
        int i10 = (int) (255.0f * f10);
        this.f44219e.setAlpha(i10);
        this.f44220f.setAlpha(i10);
        this.f44222r.setAlpha((int) (66.0f * f10));
        this.f44223s.setAlpha((int) (85.0f * f10));
        this.v.setAlpha(i10);
        this.C = f10;
        if (!z10) {
            this.B = f10;
        }
        invalidate();
    }

    public final void f(float f10, boolean z10) {
        if (z10 != this.A) {
            this.A = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f11 = this.B;
            float[] fArr = this.f44221n;
            float fLerp = AndroidUtilities.lerp(fArr, f11);
            if (z10) {
                valueAnimator.setDuration((long) (((1.0f - fLerp) * 250.0f) / f10));
            } else {
                valueAnimator.setDuration((long) ((250.0f * fLerp) / f10));
            }
            fArr[0] = fLerp;
            fArr[1] = z10 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z10;
        Paint paint;
        float[] fArr3;
        int i10;
        int i11;
        float currentItemProgress;
        Paint paint2;
        int i12 = 0;
        while (true) {
            fArr = this.f44226y;
            if (i12 >= 2) {
                break;
            }
            float f11 = fArr[i12];
            if (f11 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.f44224w;
                gradientDrawableArr[i12].setAlpha((int) (f11 * 255.0f));
                gradientDrawableArr[i12].draw(canvas);
            }
            i12++;
        }
        this.f44219e.draw(canvas);
        this.f44220f.draw(canvas);
        Rect rect = this.f44217b;
        Paint paint3 = this.f44222r;
        canvas.drawRect(rect, paint3);
        canvas.drawRect(this.f44218c, paint3);
        ProfileActivity profileActivity = this.L;
        int realCount = profileActivity.f35987j0.getRealCount();
        this.I = profileActivity.f35987j0.getRealPosition();
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
        float f12 = 1.0f;
        if (realCount > 1 && realCount <= 20) {
            int i13 = profileActivity.f36073w0;
            if (i13 == 0) {
                this.C = 0.0f;
                profileActivity.f36073w0 = 3;
            } else if (i13 == 1) {
                this.C = 0.0f;
                profileActivity.f36073w0 = 2;
            }
            int i14 = profileActivity.f36073w0;
            Paint paint4 = this.v;
            Paint paint5 = this.f44223s;
            if (i14 == 2) {
                paint5.setAlpha((int) (this.C * 85.0f));
                paint4.setAlpha((int) (this.C * 255.0f));
            }
            f10 = 180.0f;
            int iX = org.telegram.messenger.rl.x((realCount - 1) * 2, getMeasuredWidth() - AndroidUtilities.dp(10.0f), realCount);
            int iDp = AndroidUtilities.dp(4.0f) + (!((org.telegram.ui.ActionBar.n2) profileActivity).inBubbleMode ? AndroidUtilities.statusBarHeight : 0);
            int i15 = 0;
            z10 = false;
            while (i15 < realCount) {
                int iDp2 = (iX * i15) + AndroidUtilities.dp((i15 * 2) + 5);
                int i16 = this.G;
                RectF rectF = this.d;
                if (i15 != i16 || Math.abs(this.F - f12) <= 1.0E-4f) {
                    paint = paint4;
                    fArr3 = fArr;
                    i10 = realCount;
                    i11 = 85;
                    if (i15 == this.I) {
                        if (profileActivity.f35987j0.I()) {
                            currentItemProgress = profileActivity.f35987j0.getCurrentItemProgress();
                            this.H = currentItemProgress;
                            if ((currentItemProgress > 0.0f || !profileActivity.f35987j0.J()) && this.J <= 0.0f) {
                                j10 = j10;
                            } else {
                                float f13 = this.J;
                                int i17 = this.K;
                                j10 = j10;
                                float f14 = ((((long) i17) * j10) / 500.0f) + f13;
                                this.J = f14;
                                if (f14 > 1.0f) {
                                    this.J = 1.0f;
                                    this.K = i17 * (-1);
                                } else if (f14 <= 0.0f) {
                                    this.J = 0.0f;
                                    this.K = i17 * (-1);
                                }
                            }
                            rectF.set(iDp2, iDp, iDp2 + iX, AndroidUtilities.dp(2.0f) + iDp);
                            paint5.setAlpha((int) (((this.J * 48.0f) + 85.0f) * this.C));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
                        } else {
                            this.H = 1.0f;
                        }
                    }
                    currentItemProgress = 1.0f;
                    float f15 = iDp2;
                    rectF.set(f15, iDp, (iX * currentItemProgress) + f15, AndroidUtilities.dp(2.0f) + iDp);
                    if (i15 != this.I) {
                        this.D[i15] = 0.75f;
                    } else if (profileActivity.f36073w0 == 3) {
                        paint5.setAlpha((int) (AndroidUtilities.lerp(i11, 255, org.telegram.ui.Components.er.f28125j.getInterpolation(this.D[i15])) * this.C));
                    }
                    float fDp = AndroidUtilities.dp(1.0f);
                    float fDp2 = AndroidUtilities.dp(1.0f);
                    if (i15 == this.I) {
                        paint2 = paint;
                    } else {
                        paint2 = paint5;
                    }
                    canvas.drawRoundRect(rectF, fDp, fDp2, paint2);
                    i15++;
                    paint4 = paint;
                    fArr = fArr3;
                    realCount = i10;
                    j10 = j10;
                    f12 = 1.0f;
                } else {
                    float f16 = this.F;
                    canvas.save();
                    float f17 = iDp2;
                    paint = paint4;
                    fArr3 = fArr;
                    float f18 = iDp;
                    i10 = realCount;
                    float f19 = iDp2 + iX;
                    canvas.clipRect((iX * f16) + f17, f18, f19, AndroidUtilities.dp(2.0f) + iDp);
                    rectF.set(f17, f18, f19, AndroidUtilities.dp(2.0f) + iDp);
                    paint5.setAlpha((int) (this.C * 85.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
                    canvas.restore();
                    j10 = j10;
                    currentItemProgress = f16;
                }
                i11 = 80;
                z10 = true;
                float f110 = iDp2;
                rectF.set(f110, iDp, (iX * currentItemProgress) + f110, AndroidUtilities.dp(2.0f) + iDp);
                if (i15 != this.I) {
                    this.D[i15] = 0.75f;
                } else if (profileActivity.f36073w0 == 3) {
                    paint5.setAlpha((int) (AndroidUtilities.lerp(i11, 255, org.telegram.ui.Components.er.f28125j.getInterpolation(this.D[i15])) * this.C));
                }
                float fDp3 = AndroidUtilities.dp(1.0f);
                float fDp4 = AndroidUtilities.dp(1.0f);
                if (i15 == this.I) {
                    paint2 = paint;
                } else {
                    paint2 = paint5;
                }
                canvas.drawRoundRect(rectF, fDp3, fDp4, paint2);
                i15++;
                paint4 = paint;
                fArr = fArr3;
                realCount = i10;
                j10 = j10;
                f12 = 1.0f;
            }
            fArr2 = fArr;
            long j11 = j10;
            int i18 = profileActivity.f36073w0;
            if (i18 != 2) {
                j10 = j11;
                if (i18 == 3) {
                    int i19 = 0;
                    while (true) {
                        float[] fArr6 = this.D;
                        if (i19 >= fArr6.length) {
                            break;
                        }
                        if (i19 != this.I) {
                            float f20 = fArr6[i19];
                            if (f20 > 0.0f) {
                                float f21 = f20 - (j10 / 500.0f);
                                fArr6[i19] = f21;
                                if (f21 <= 0.0f) {
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
            } else {
                float f22 = this.C;
                if (f22 < 1.0f) {
                    j10 = j11;
                    float f23 = (j10 / 180.0f) + f22;
                    this.C = f23;
                    if (f23 > 1.0f) {
                        this.C = 1.0f;
                    }
                    z10 = true;
                } else {
                    j10 = j11;
                    profileActivity.f36073w0 = 3;
                }
            }
        } else {
            fArr2 = fArr;
            f10 = 180.0f;
            z10 = false;
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (this.f44225x[i20]) {
                float f24 = fArr2[i20];
                if (f24 < 1.0f) {
                    float f25 = (j10 / f10) + f24;
                    fArr2[i20] = f25;
                    if (f25 > 1.0f) {
                        fArr2[i20] = 1.0f;
                    }
                    z10 = true;
                }
            } else {
                float f26 = fArr2[i20];
                if (f26 > 0.0f) {
                    float f27 = f26 - (j10 / f10);
                    fArr2[i20] = f27;
                    if (f27 < 0.0f) {
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f44216a;
        Rect rect = this.f44217b;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        int iDp = (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f));
        Rect rect2 = this.f44218c;
        rect2.set(0, iDp, i10, i11);
        this.f44219e.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.f44220f.setBounds(0, ((i11 - this.L.O3()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f44224w;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }
}
