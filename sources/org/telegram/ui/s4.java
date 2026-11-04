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
public abstract class s4 extends View implements org.telegram.ui.Components.rf0 {
    public final GradientDrawable[] E;
    public final boolean[] F;
    public final float[] G;
    public float H;
    public float[] I;
    public long J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public org.telegram.ui.Components.vf0 Q;
    public final TextPaint R;
    public float S;
    public int T;
    public String U;
    public final RectF f49347a;
    public int f49348b;
    public final Rect f49349c;
    public final Rect d;
    public final RectF f49350e;
    public final GradientDrawable f49351f;
    public final GradientDrawable h;
    public final float[] f49352n;
    public final Paint f49353r;
    public final Paint f49354s;
    public final Paint f49355w;
    public final Path f49356x;
    public final RectF f49357y;

    public s4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f49347a = new RectF();
        this.f49348b = 1;
        this.f49349c = new Rect();
        this.d = new Rect();
        this.f49350e = new RectF();
        this.f49352n = new float[]{0.0f, 1.0f};
        this.f49356x = new Path();
        this.f49357y = new RectF();
        this.E = new GradientDrawable[2];
        this.F = new boolean[2];
        this.G = new float[2];
        this.H = 0.0f;
        this.I = null;
        this.L = -1;
        this.P = 1;
        this.T = -1;
        Paint paint = new Paint(1);
        this.f49354s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.f49355w = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f49351f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            } else {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            }
            this.E[i3] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.E[i3].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f49353r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40455j);
        ofFloat.addUpdateListener(new b3(this, 1));
        ofFloat.addListener(new ii.v3(this, 16));
        TextPaint textPaint = new TextPaint(1);
        this.R = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
    }

    private String getCurrentTitle() {
        if (this.T != this.Q.getCurrentItem()) {
            this.U = ((String) this.Q.getAdapter().d(this.Q.getCurrentItem())).toString();
            this.T = this.Q.getCurrentItem();
        }
        return this.U;
    }

    @Override
    public final void a() {
        Arrays.fill(this.F, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.F[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.vf0 getProfileGalleryView() {
        return this.Q;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Path path = this.f49356x;
        path.reset();
        RectF rectF = this.f49357y;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.f49349c;
        rect.set(0, 0, i3, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i3, i10);
        this.f49351f.setBounds(0, rect.bottom, i3, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i10 - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i3, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.E;
        int i13 = i3 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i3 - i13, 0, i3, i10);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.vf0 vf0Var) {
        this.Q = vf0Var;
    }

    @Override
    public void c() {
    }
}
