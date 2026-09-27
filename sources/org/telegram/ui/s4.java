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
public abstract class s4 extends View implements org.telegram.ui.Components.wh0 {
    public final boolean[] E;
    public final float[] F;
    public float G;
    public float[] H;
    public long I;
    public float J;
    public int K;
    public float L;
    public int M;
    public float N;
    public int O;
    public org.telegram.ui.Components.bi0 P;
    public final TextPaint Q;
    public float R;
    public int S;
    public String T;
    public final RectF f37292a;
    public int f37293b;
    public final Rect f37294c;
    public final Rect d;
    public final RectF e;
    public final GradientDrawable f37295f;
    public final GradientDrawable h;
    public final float[] f37296n;
    public final Paint f37297r;
    public final Paint f37298s;
    public final Paint v;
    public final Path f37299w;
    public final RectF f37300x;
    public final GradientDrawable[] f37301y;

    public s4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f37292a = new RectF();
        this.f37293b = 1;
        this.f37294c = new Rect();
        this.d = new Rect();
        this.e = new RectF();
        this.f37296n = new float[]{0.0f, 1.0f};
        this.f37299w = new Path();
        this.f37300x = new RectF();
        this.f37301y = new GradientDrawable[2];
        this.E = new boolean[2];
        this.F = new float[2];
        this.G = 0.0f;
        this.H = null;
        this.K = -1;
        this.O = 1;
        this.S = -1;
        Paint paint = new Paint(1);
        this.f37298s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f37295f = gradientDrawable;
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
            this.f37301y[i10] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.f37301y[i10].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f37297r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.sr.f28362j);
        ofFloat.addUpdateListener(new d3(this, 1));
        ofFloat.addListener(new ai.b(this, 29));
        TextPaint textPaint = new TextPaint(1);
        this.Q = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    private String getCurrentTitle() {
        if (this.S != this.P.getCurrentItem()) {
            this.T = ((String) this.P.getAdapter().d(this.P.getCurrentItem())).toString();
            this.S = this.P.getCurrentItem();
        }
        return this.T;
    }

    @Override
    public final void a() {
        Arrays.fill(this.E, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.E[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.bi0 getProfileGalleryView() {
        return this.P;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.f37299w;
        path.reset();
        RectF rectF = this.f37300x;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        Rect rect = this.f37294c;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.f37295f.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i11 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f37301y;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.bi0 bi0Var) {
        this.P = bi0Var;
    }

    @Override
    public void c() {
    }
}
