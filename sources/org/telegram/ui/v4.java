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
public abstract class v4 extends View implements org.telegram.ui.Components.rh0 {
    public final boolean[] B;
    public final float[] C;
    public float D;
    public float[] E;
    public long F;
    public float G;
    public int H;
    public float I;
    public int J;
    public float K;
    public int L;
    public org.telegram.ui.Components.wh0 M;
    public final TextPaint N;
    public float O;
    public int P;
    public String Q;
    public final RectF f38992a;
    public int f38993b;
    public final Rect f38994c;
    public final Rect d;
    public final RectF e;
    public final GradientDrawable f38995f;
    public final GradientDrawable h;
    public final float[] f38996n;
    public final Paint f38997r;
    public final Paint f38998s;
    public final Paint v;
    public final Path f38999w;
    public final RectF f39000x;
    public final GradientDrawable[] f39001y;

    public v4(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.f38992a = new RectF();
        this.f38993b = 1;
        this.f38994c = new Rect();
        this.d = new Rect();
        this.e = new RectF();
        this.f38996n = new float[]{0.0f, 1.0f};
        this.f38999w = new Path();
        this.f39000x = new RectF();
        this.f39001y = new GradientDrawable[2];
        this.B = new boolean[2];
        this.C = new float[2];
        this.D = 0.0f;
        this.E = null;
        this.H = -1;
        this.L = 1;
        this.P = -1;
        Paint paint = new Paint(1);
        this.f38998s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f38995f = gradientDrawable;
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
            this.f39001y[i10] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.f39001y[i10].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.f38997r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.mr.f27125j);
        ofFloat.addUpdateListener(new g3(this, 1));
        ofFloat.addListener(new cg.l0(this, 28));
        TextPaint textPaint = new TextPaint(1);
        this.N = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    private String getCurrentTitle() {
        if (this.P != this.M.getCurrentItem()) {
            this.Q = ((String) this.M.getAdapter().d(this.M.getCurrentItem())).toString();
            this.P = this.M.getCurrentItem();
        }
        return this.Q;
    }

    @Override
    public final void a() {
        Arrays.fill(this.B, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z4) {
        this.B[!z4 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.wh0 getProfileGalleryView() {
        return this.M;
    }

    @Override
    public void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.f38999w;
        path.reset();
        RectF rectF = this.f39000x;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.f38994c;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.f38995f.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i11 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f39001y;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.wh0 wh0Var) {
        this.M = wh0Var;
    }

    @Override
    public void c() {
    }
}
