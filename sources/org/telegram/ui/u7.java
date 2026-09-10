package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u7 extends View {
    public final int f37137a = 3;
    public final Object f37138b;
    public Object f37139c;
    public Object d;

    public u7(h8 h8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = h8Var;
        this.f37138b = strArr;
        this.f37139c = drawable;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int textColor;
        Canvas canvas2;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f37137a) {
            case 2:
                org.telegram.ui.Components.f31 f31Var = (org.telegram.ui.Components.f31) this.d;
                org.telegram.ui.Components.n6 n6Var = f31Var.e;
                float g10 = n6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), n6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f37138b;
                    h6Var.setColor(h6Var.f23526b.a(org.telegram.ui.ActionBar.j6.v0(f31Var.I, h6Var.f23525a), false));
                    textColor = f31Var.getTextColor();
                    h6Var.setColor(i0.a.d(f31Var.F, h6Var.getColor(), textColor));
                    h6Var.setAlpha((int) (h6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), h6Var);
                    n6Var.m(rectF);
                    n6Var.f25442w = (int) (g10 * 255.0f);
                    n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W8, (org.telegram.ui.ActionBar.f6) this.f37139c));
                    n6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                int[] iArr = (int[]) this.f37138b;
                t50 t50Var = (t50) this.f37139c;
                s50 s50Var = (s50) this.d;
                if (s50Var.h > 0.0f && s50Var.d != null) {
                    s50Var.f36553f.reset();
                    float width = getWidth() / s50Var.f36552c.getWidth();
                    s50Var.f36553f.postScale(width, width);
                    s50Var.e.setLocalMatrix(s50Var.f36553f);
                    s50Var.d.setAlpha((int) (s50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), s50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (t50Var != null) {
                    if (t50Var.isAttachedToWindow() && t50Var.getAlpha() > 0.5f) {
                        t50Var.getLocationInWindow(iArr);
                    } else {
                        s50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - t50Var.getScaleX()) * t50Var.getMeasuredWidth()), iArr[1] - ((1.0f - t50Var.getScaleY()) * t50Var.getMeasuredHeight()));
                    if (((u50) t50Var.f36840b).a(canvas2, t50Var.getMeasuredWidth(), s50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 5:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                e70 e70Var = (e70) this.d;
                int i10 = dp + ((int) e70Var.f32079b.e);
                Paint paint = (Paint) this.f37139c;
                paint.setColor(e70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18201s8));
                RectF rectF2 = (RectF) this.f37138b;
                lVar = ((org.telegram.ui.ActionBar.p2) e70Var).actionBar;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), lVar.getMeasuredHeight() + i10);
                e70.a0(e70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.zf0 zf0Var;
        int dp;
        switch (this.f37137a) {
            case 0:
                Drawable drawable = (Drawable) this.f37139c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f37138b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((h8) this.d).f33308f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.Components.og0 og0Var = (org.telegram.ui.Components.og0) this.d;
                if (!og0Var.f25798n || ((zf0Var = og0Var.f25799r) != null && zf0Var.f29666x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (og0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = og0Var.f25783a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        f7 = height;
                        canvas.drawLine(f12, f7, (f10 * f11) + f12, height, (Paint) this.f37139c);
                    } else {
                        f7 = height;
                    }
                    canvas.drawLine(dp2, f7, i11, f7, (Paint) this.f37138b);
                    return;
                }
                return;
            case 2:
            case 4:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f37138b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + n6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                bh.d dVar = (bh.d) this.f37139c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((bh.d) this.f37139c).draw(canvas);
                }
                n6Var.draw(canvas);
                return;
            case 6:
                RectF rectF = (RectF) this.f37138b;
                id0 id0Var = (id0) this.d;
                Drawable drawable2 = id0Var.f33637s;
                Rect rect = (Rect) this.f37139c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                id0Var.f33637s.draw(canvas);
                int i13 = id0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.j6.f18212t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f18212t0);
                    return;
                }
                return;
            case 7:
                float dp4 = AndroidUtilities.dp(10.0f);
                float f13 = dp4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f14 = dp4 + measuredWidth2;
                rectF2.set(dp4, dp4, f14, f14);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f15 = measuredWidth2 / 7.0f;
                Path path = (Path) this.f37139c;
                path.rewind();
                path.addRoundRect(rectF2, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f16 = dp5;
                int width3 = ((int) (rectF2.width() / f16)) + 1;
                int height2 = ((int) (rectF2.height() / f16)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f37138b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 8:
                org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) this.f37138b;
                super.onDraw(canvas);
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f37139c;
                d6Var.f22293a = this;
                ((zh.a3) this.d).getClass();
                d6Var.d(0.0f, false);
                float f17 = d6Var.f22295c;
                if (f17 != 0.0f) {
                    if (f17 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (d6Var.f22295c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    q90Var.d(rectF3);
                    q90Var.j(24.0f);
                    q90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    q90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37137a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((org.telegram.ui.Components.f31) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f37137a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.n6) this.f37138b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f37137a) {
            case 7:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f30066g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f37137a) {
            case 2:
                if (((org.telegram.ui.Components.f31) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 3:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.n6) this.f37138b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public u7(e70 e70Var, Context context) {
        super(context);
        this.d = e70Var;
        this.f37138b = new RectF();
        this.f37139c = new Paint(1);
    }

    public u7(org.telegram.ui.Components.og0 og0Var, Context context) {
        super(context);
        this.d = og0Var;
        Paint paint = new Paint();
        this.f37138b = paint;
        Paint paint2 = new Paint();
        this.f37139c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public u7(id0 id0Var, Context context, Rect rect) {
        super(context);
        this.d = id0Var;
        this.f37139c = rect;
        this.f37138b = new RectF();
    }

    public u7(org.telegram.ui.Components.f31 f31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = f31Var;
        this.f37139c = f6Var;
        this.f37138b = new org.telegram.ui.Components.h6(this, f6Var);
        f31Var.e.setCallback(this);
    }

    public u7(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, false, false, false);
        this.f37138b = n6Var;
        n6Var.r(-1);
        n6Var.f25425b = 17;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.setCallback(this);
    }

    public u7(zh.a3 a3Var, Context context) {
        super(context);
        this.d = a3Var;
        this.f37138b = new org.telegram.ui.Components.q90();
        this.f37139c = new org.telegram.ui.Components.d6(250L, org.telegram.ui.Components.wr.f28819f);
    }

    public u7(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f37138b = paint;
        this.f37139c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public u7(s50 s50Var, Context context, t50 t50Var) {
        super(context);
        this.d = s50Var;
        this.f37139c = t50Var;
        this.f37138b = new int[2];
    }
}
