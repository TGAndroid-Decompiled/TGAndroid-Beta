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
public final class va1 extends org.telegram.ui.Components.vu0 {
    public boolean f42466f0;
    public final Paint f42467g0;
    public final nb1 f42468h0;

    public va1(nb1 nb1Var, Context context) {
        super(context, null);
        this.f42468h0 = nb1Var;
        setWillNotDraw(false);
        this.f42467g0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.uz.f()) {
            nb1 nb1Var = this.f42468h0;
            if (nb1Var.f39816h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                nb1Var.f39816h1.e(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
        int i10 = 0;
        while (true) {
            nb1 nb1Var = this.f42468h0;
            if (i10 < nb1Var.N.getChildCount()) {
                View childAt = nb1Var.N.getChildAt(i10);
                if (childAt.getY() < org.telegram.messenger.i0.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + nb1Var.N.getX(), childAt.getY() + nb1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.su0)) {
                        arrayList.add((org.telegram.ui.Components.su0) childAt);
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
        nb1 nb1Var = this.f42468h0;
        hi.f fVar = nb1Var.f39818i1;
        hi.f fVar2 = nb1Var.f39816h1;
        tg.f fVar3 = nb1Var.f39814g1;
        if (Build.VERSION.SDK_INT >= 31 && fVar3 != null) {
            nb1Var.B0();
            zx zxVar = nb1Var.M0;
            if (zxVar != null) {
                measuredWidth = zxVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            zx zxVar2 = nb1Var.M0;
            if (zxVar2 != null) {
                measuredHeight = zxVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (fVar2 != null && !fVar2.f7722r && fVar2.k(measuredWidth, measuredHeight)) {
                fVar3.b(fVar2.i(measuredWidth, measuredHeight), -3);
                fVar2.j();
            }
            if (fVar != null && !fVar.f7722r && fVar.k(measuredWidth, measuredHeight)) {
                fVar3.b(fVar.i(measuredWidth, measuredHeight), -2);
                fVar.j();
            }
        }
        super.dispatchDraw(canvas);
        if (nb1Var.isInPreviewMode()) {
            int themedColor = nb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6);
            Paint paint = this.f42467g0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (nb1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.f16166m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.t6.f21053k0);
        } else {
            canvas2 = canvas;
        }
        if (nb1Var.M0 == null) {
            org.telegram.messenger.i0.O(canvas2, this, nb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6), nb1Var.f39812f1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        float f7;
        nb1 nb1Var = this.f42468h0;
        lVar = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
        if (view == lVar && !nb1Var.isInPreviewMode()) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
            float y3 = lVar2.getY();
            lVar3 = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
            float height = lVar3.getHeight();
            org.telegram.ui.Components.w71 w71Var = nb1Var.f39799a1;
            if (w71Var != null && w71Var.getVisibility() != 8) {
                f7 = nb1Var.f39799a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * nb1Var.W) + height)));
            ((ActionBarLayout) nb1Var.getParentLayout()).p(canvas, (int) ((1.0f - nb1Var.W) * 255.0f), i10);
            float f10 = nb1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.t6.f21053k0.getAlpha();
                    org.telegram.ui.ActionBar.t6.f21053k0.setAlpha((int) (alpha * nb1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.t6.f21053k0);
                    org.telegram.ui.ActionBar.t6.f21053k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.t6.f21053k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.va1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        nb1 nb1Var = this.f42468h0;
        bg0 bg0Var = nb1Var.f39828o0;
        if (bg0Var != null) {
            this.f42466f0 = true;
            ViewGroup.LayoutParams layoutParams = bg0Var.getLayoutParams();
            int L = org.telegram.messenger.i0.L(51.0f);
            int i13 = nb1Var.f39812f1;
            layoutParams.height = L + i13;
            nb1Var.f39828o0.setPadding(0, 0, 0, i13);
            this.f42466f0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.l) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.l)) {
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
        if (this.f42466f0) {
            return;
        }
        super.requestLayout();
    }
}
