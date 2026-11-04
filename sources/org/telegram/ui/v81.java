package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v81 extends org.telegram.ui.Components.qt0 {
    public boolean f50426g0;
    public final Paint f50427h0;
    public final m91 f50428i0;

    public v81(m91 m91Var, Context context) {
        super(context, null);
        this.f50428i0 = m91Var;
        setWillNotDraw(false);
        this.f50427h0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.az.f()) {
            m91 m91Var = this.f50428i0;
            if (m91Var.f47597i1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                m91Var.f47597i1.l(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            m91 m91Var = this.f50428i0;
            if (i3 < m91Var.O.getChildCount()) {
                View childAt = m91Var.O.getChildAt(i3);
                if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + m91Var.O.getX(), childAt.getY() + m91Var.O.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.nt0)) {
                        arrayList.add((org.telegram.ui.Components.nt0) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
                i3++;
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
        m91 m91Var = this.f50428i0;
        si.f fVar = m91Var.f47599j1;
        si.f fVar2 = m91Var.f47597i1;
        eh.g gVar = m91Var.f47595h1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            m91Var.B0();
            uw uwVar = m91Var.N0;
            if (uwVar != null) {
                measuredWidth = uwVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            uw uwVar2 = m91Var.N0;
            if (uwVar2 != null) {
                measuredHeight = uwVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (fVar2 != null && !fVar2.f54758r && fVar2.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.h(measuredWidth, measuredHeight), -3);
                fVar2.i();
            }
            if (fVar != null && !fVar.f54758r && fVar.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar.h(measuredWidth, measuredHeight), -2);
                fVar.i();
            }
        }
        super.dispatchDraw(canvas);
        if (m91Var.isInPreviewMode()) {
            int themedColor = m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6);
            Paint paint = this.f50427h0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (m91Var.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f22602m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        } else {
            canvas2 = canvas;
        }
        if (m91Var.N0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6), m91Var.f47593g1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        m91 m91Var = this.f50428i0;
        kVar = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
        if (view == kVar && !m91Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
            float y9 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.m61 m61Var = m91Var.f47580b1;
            if (m61Var != null && m61Var.getVisibility() != 8) {
                f10 = m91Var.f47580b1.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i3 = (int) (y9 + ((int) ((f10 * m91Var.X) + height)));
            ((ActionBarLayout) m91Var.getParentLayout()).p(canvas, (int) ((1.0f - m91Var.X) * 255.0f), i3);
            float f11 = m91Var.X;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.k6.f28002k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.f28002k0.setAlpha((int) (alpha * m91Var.X));
                    float f12 = i3;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.k6.f28002k0);
                    org.telegram.ui.ActionBar.k6.f28002k0.setAlpha(alpha);
                } else {
                    float f13 = i3;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.k6.f28002k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v81.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        m91 m91Var = this.f50428i0;
        yg0 yg0Var = m91Var.f47608p0;
        if (yg0Var != null) {
            this.f50426g0 = true;
            ViewGroup.LayoutParams layoutParams = yg0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = m91Var.f47593g1;
            layoutParams.height = L + i12;
            m91Var.f47608p0.setPadding(0, 0, 0, i12);
            this.f50426g0 = false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                i13 = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i3, 0, i10, 0);
                } else {
                    i11 = i13;
                    measureChildWithMargins(childAt2, i3, 0, i10, i11);
                    i15++;
                    i13 = i11;
                }
            }
            i11 = i13;
            i15++;
            i13 = i11;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void requestLayout() {
        if (this.f50426g0) {
            return;
        }
        super.requestLayout();
    }
}
