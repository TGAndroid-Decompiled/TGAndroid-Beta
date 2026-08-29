package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public abstract class r4 extends View implements org.telegram.ui.Components.fh0 {
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
    public org.telegram.ui.Components.kh0 L;
    public final TextPaint M;
    public float N;
    public int O;
    public String P;
    public final RectF f41853a;
    public int f41854b;
    public final Rect f41855c;
    public final Rect d;
    public final RectF f41856e;
    public final GradientDrawable f41857f;
    public final GradientDrawable h;
    public final float[] f41858n;
    public final Paint f41859r;
    public final Paint f41860s;
    public final Paint v;
    public final Path f41861w;
    public final RectF f41862x;
    public final GradientDrawable[] f41863y;

    public r4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f41853a = new RectF();
        this.f41854b = 1;
        this.f41855c = new Rect();
        this.d = new Rect();
        this.f41856e = new RectF();
        this.f41858n = new float[]{0.0f, 1.0f};
        this.f41861w = new Path();
        this.f41862x = new RectF();
        this.f41863y = new GradientDrawable[2];
        this.A = new boolean[2];
        this.B = new float[2];
        this.C = 0.0f;
        this.D = null;
        this.G = -1;
        this.K = 1;
        this.O = -1;
        Paint paint = new Paint(1);
        this.f41860s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f41857f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            } else {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            }
            this.f41863y[i10] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.f41863y[i10].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f41859r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.f29803j);
        ofFloat.addUpdateListener(new g3(this, 1));
        ofFloat.addListener(new nh.q5(this, 7));
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

    public org.telegram.ui.Components.kh0 getProfileGalleryView() {
        return this.L;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.f41861w;
        path.reset();
        RectF rectF = this.f41862x;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        Rect rect = this.f41855c;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.f41857f.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i11 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f41863y;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.kh0 kh0Var) {
        this.L = kh0Var;
    }

    public void c() {
    }
}
