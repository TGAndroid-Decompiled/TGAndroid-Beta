package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class se1 extends org.telegram.ui.Components.qv0 {
    public boolean f41240t0;
    public final Paint f41241u0;
    public final mf1 f41242v0;

    public se1(mf1 mf1Var, Context context) {
        super(context, null);
        this.f41242v0 = mf1Var;
        setWillNotDraw(false);
        this.f41241u0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            mf1 mf1Var = this.f41242v0;
            if (mf1Var.f39112d1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                mf1Var.f39112d1.I(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            mf1 mf1Var = this.f41242v0;
            if (i10 < mf1Var.K.getChildCount()) {
                View childAt = mf1Var.K.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + mf1Var.K.getX(), childAt.getY() + mf1Var.K.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.nv0)) {
                        arrayList.add((org.telegram.ui.Components.nv0) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int measuredWidth;
        int measuredHeight;
        mf1 mf1Var = this.f41242v0;
        tg.d dVar = mf1Var.f39115e1;
        tg.d dVar2 = mf1Var.f39112d1;
        og.e eVar = mf1Var.f39110c1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            mf1Var.x0();
            py pyVar = mf1Var.J0;
            if (pyVar != null) {
                measuredWidth = pyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            py pyVar2 = mf1Var.J0;
            if (pyVar2 != null) {
                measuredHeight = pyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f48092n && dVar2.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.f48092n && dVar.f(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (mf1Var.isInPreviewMode()) {
            int themedColor = mf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6);
            Paint paint = this.f41241u0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (mf1Var.T * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.k6.f21779k0);
        } else {
            canvas2 = canvas;
        }
        if (mf1Var.J0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, mf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6), mf1Var.f39107b1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        mf1 mf1Var = this.f41242v0;
        kVar = ((org.telegram.ui.ActionBar.p2) mf1Var).actionBar;
        if (view == kVar && !mf1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) mf1Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.p2) mf1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.l81 l81Var = mf1Var.X0;
            if (l81Var != null && l81Var.getVisibility() != 8) {
                f10 = mf1Var.X0.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i10 = (int) (y10 + ((int) ((f10 * mf1Var.T) + height)));
            ((ActionBarLayout) mf1Var.getParentLayout()).p(canvas, (int) ((1.0f - mf1Var.T) * 255.0f), i10);
            float f11 = mf1Var.T;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.k6.f21779k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.f21779k0.setAlpha((int) (alpha * mf1Var.T));
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.k6.f21779k0);
                    org.telegram.ui.ActionBar.k6.f21779k0.setAlpha(alpha);
                } else {
                    float f13 = i10;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.k6.f21779k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.se1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        mf1 mf1Var = this.f41242v0;
        c51 c51Var = mf1Var.f39128l0;
        if (c51Var != null) {
            this.f41240t0 = true;
            ViewGroup.LayoutParams layoutParams = c51Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = mf1Var.f39107b1;
            layoutParams.height = dp + i13;
            mf1Var.f39128l0.setPadding(0, 0, 0, i13);
            this.f41240t0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, 0);
                } else {
                    i12 = i14;
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                    i16++;
                    i14 = i12;
                }
            }
            i12 = i14;
            i16++;
            i14 = i12;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void requestLayout() {
        if (this.f41240t0) {
            return;
        }
        super.requestLayout();
    }
}
