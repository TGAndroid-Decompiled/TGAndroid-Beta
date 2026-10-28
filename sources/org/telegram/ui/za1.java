package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class za1 extends LinearLayout {
    public final int f46211a;
    public Object f46212b;

    public za1(Context context) {
        super(context);
        this.f46211a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.f46211a) {
            case 1:
                ai.x xVar = (ai.x) this.f46212b;
                za1 za1Var = xVar.f1968c;
                int i10 = xVar.e;
                if (i10 >= 0 && i10 < za1Var.getChildCount()) {
                    float width = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (za1Var.getChildAt(xVar.e).getWidth() != 0) {
                        if (Float.isNaN(xVar.f1969f)) {
                            xVar.f1969f = width;
                        } else {
                            float f7 = xVar.f1969f;
                            if (f7 != width) {
                                float f10 = width - f7;
                                if (Math.abs(f10) >= 0.5f) {
                                    width = (f10 * 0.3f) + xVar.f1969f;
                                }
                                xVar.f1969f = width;
                                za1Var.invalidate();
                            }
                        }
                        canvas.drawCircle(xVar.f1969f, za1Var.getHeight() / 2.0f, (xVar.getHeight() - AndroidUtilities.dp(6.0f)) / 2.0f, xVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 15:
                int width2 = getWidth() / 2;
                int height = getHeight() / 2;
                kh1 kh1Var = (kh1) this.f46212b;
                Camera camera = kh1Var.L;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = kh1Var.M;
                camera.getMatrix(matrix);
                camera.restore();
                float f11 = -width2;
                float f12 = -height;
                matrix.preTranslate(f11, f12);
                float f13 = width2;
                float f14 = height;
                matrix.postTranslate(f13, f14);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = kh1Var.N;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f11, f12);
                matrix2.postTranslate(f13, f14);
                canvas.save();
                canvas.clipRect(0, 0, width2, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 22:
                zh.o1 o1Var = (zh.o1) this.f46212b;
                RectF rectF = o1Var.h;
                RectF rectF2 = o1Var.f53232f;
                RectF rectF3 = o1Var.e;
                Paint paint = o1Var.f53233n;
                paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23338c6, false)));
                float d = o1Var.f53231c.d(o1Var.f53230b, false);
                double d10 = d;
                ArrayList arrayList = o1Var.d;
                int clamp = Utilities.clamp((int) Math.floor(d10), arrayList.size() - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                if (clamp < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp));
                } else if (clamp2 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(clamp2));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (clamp2 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp2));
                } else if (clamp < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(clamp));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                float height2 = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height2, height2, paint);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        View view;
        switch (this.f46211a) {
            case 2:
                if (!((bi.b7) this.f46212b).f4344a0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (!((bi.dd) this.f46212b).f4531t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((gi.h) this.f46212b).f12519s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f46212b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
                if (scrollSlidingTextTabStrip.f26288b != null && scrollSlidingTextTabStrip.f26303n0) {
                    if (motionEvent.getAction() == 0) {
                        float x9 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        int i11 = 0;
                        while (true) {
                            if (i11 < getChildCount()) {
                                view = getChildAt(i11);
                                if (x9 < view.getX() || x9 > view.getX() + view.getWidth() || y3 < view.getY() || y3 > view.getY() + view.getHeight()) {
                                    i11++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.f26291c0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f26291c0));
                            scrollSlidingTextTabStrip.f26288b.getClass();
                            scrollSlidingTextTabStrip.f26291c0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f26291c0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f26291c0);
                            if (scrollSlidingTextTabStrip.f26302n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(AndroidUtilities.dp(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f26291c0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f26291c0.getX();
                            int width2 = scrollSlidingTextTabStrip.f26291c0.getWidth();
                            if (width < 0.0f) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                                while (true) {
                                    if (i10 < getChildCount()) {
                                        View childAt = getChildAt(i10);
                                        float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                        if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                            i10++;
                                        }
                                    } else {
                                        i10 = getChildCount() - 1;
                                    }
                                }
                            }
                            if (i10 != indexOfChild) {
                                org.telegram.ui.Components.tn0 tn0Var = scrollSlidingTextTabStrip.f26288b;
                                sparseIntArray.get(i10);
                                tn0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f26291c0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.za1 f32293b;

                                {
                                    this.f32293b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.za1 za1Var = this.f32293b;
                                            za1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) za1Var.f46212b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.za1 za1Var2 = this.f32293b;
                                            za1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) za1Var2.f46212b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        }
                        scrollSlidingTextTabStrip.f26291c0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f26291c0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.za1 f32293b;

                                {
                                    this.f32293b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.za1 za1Var = this.f32293b;
                                            za1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) za1Var.f46212b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.za1 za1Var2 = this.f32293b;
                                            za1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) za1Var2.f46212b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.ds.h).start();
                        }
                        scrollSlidingTextTabStrip.f26291c0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f26291c0 != null || super.dispatchTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f46211a) {
            case 17:
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (getChildAt(i10).getVisibility() == 0) {
                        super.draw(canvas);
                        return;
                    }
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f46211a) {
            case 8:
                if (view == ((org.telegram.ui.Components.g9) this.f46212b).f28471a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                org.telegram.ui.Components.qn0 qn0Var = (org.telegram.ui.Components.qn0) this.f46212b;
                if (view instanceof org.telegram.ui.Components.ky0) {
                    ((org.telegram.ui.Components.ky0) view).a(qn0Var.f31959i0);
                }
                if (view == qn0Var.f31970s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 16:
                boolean drawChild = super.drawChild(canvas, view, j10);
                z60 z60Var = (z60) this.f46212b;
                if (view == z60Var.f46173b && z60Var.f46180x != null) {
                    int measuredHeight = z60Var.f46178s.getMeasuredHeight();
                    z60Var.f46180x.setBounds(0, measuredHeight, getMeasuredWidth(), z60Var.f46180x.getIntrinsicHeight() + measuredHeight);
                    z60Var.f46180x.draw(canvas);
                }
                return drawChild;
            case 21:
                tg.m1 m1Var = ((tg.l1) this.f46212b).f48965c;
                if (view == m1Var.f48984r0 && m1Var.H0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f46211a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.f46212b;
                    if (i10 < x0VarArr.length) {
                        x0VarArr[i10].invalidate();
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f46211a) {
            case 19:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((rh1) this.f46212b).B0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f46211a) {
            case 7:
                return org.telegram.ui.ActionBar.a5.b((org.telegram.ui.ActionBar.a5) this.f46212b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f46211a) {
            case 9:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.iw) this.f46212b).f29429s.F && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.t.D(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 10:
                ((org.telegram.ui.Components.m20) this.f46212b).f30344c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f46212b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f26301l0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f26304r) >= 0 && scrollSlidingTextTabStrip.f26286a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f26304r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.f26304r), false);
                    scrollSlidingTextTabStrip.f26301l0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        Size size;
        int i12;
        int i13;
        switch (this.f46211a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), 1073741824));
                return;
            case 5:
                int size2 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                li.b2 b2Var = (li.b2) this.f46212b;
                LinearLayout linearLayout = b2Var.m0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b2Var.m0.getLayoutParams();
                    paddingRight += b2Var.m0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = b2Var.f17135n0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) b2Var.f17135n0.getLayoutParams();
                    paddingRight += b2Var.f17135n0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = b2Var.f17136o0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) b2Var.f17136o0.getLayoutParams();
                    paddingRight += b2Var.f17136o0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                b2Var.f17132k0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i10, i11);
                return;
            case 6:
                int size3 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                li.a4 a4Var = (li.a4) this.f46212b;
                LinearLayout linearLayout4 = a4Var.L;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) a4Var.L.getLayoutParams();
                    paddingRight2 += a4Var.L.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = a4Var.M;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) a4Var.M.getLayoutParams();
                    paddingRight2 += a4Var.M.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = a4Var.N;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) a4Var.N.getLayoutParams();
                    paddingRight2 += a4Var.N.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                a4Var.K = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i10, i11);
                return;
            case 7:
                org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) this.f46212b;
                if (org.telegram.ui.ActionBar.a5.b(a5Var) && (size = a5Var.J) != null) {
                    i10 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                }
                super.onMeasure(i10, i11);
                return;
            case 9:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.iw) this.f46212b).f33435b.getChildCount() * 32), 1073741824)), i11);
                return;
            case 14:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.e51) this.f46212b).f27718c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 17:
                int childCount = getChildCount();
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() == 0) {
                        i14++;
                    }
                }
                int size4 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size5 = View.MeasureSpec.getSize(i11);
                if (i14 != 0) {
                    int min = Math.min(AndroidUtilities.dp(56.0f), size4 / i14);
                    if (((PhotoViewer) this.f46212b).f35715j1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f46212b).Y7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - AndroidUtilities.dp(i12)) / 2);
                        ((PhotoViewer) this.f46212b).f35715j1.setPadding(max, 0, max, 0);
                    }
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt = getChildAt(i16);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i14), size5);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size4, size5);
                return;
            case 18:
                super.onMeasure(i10, i11);
                fg1 fg1Var = (fg1) this.f46212b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) fg1Var.f39363c.getLayoutParams();
                int i17 = 0;
                if (fg1Var.f39359a.getVisibility() == 8) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                int dp = AndroidUtilities.dp(8.0f) + i13;
                if (fg1Var.O == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        i17 = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = dp + i17;
                return;
            case 20:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.m5) this.f46212b).A0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f46211a) {
            case 12:
                super.setAlpha(f7);
                ((ScrollSlidingTextTabStrip) this.f46212b).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f46211a) {
            case 13:
                org.telegram.ui.Components.fy0 fy0Var = (org.telegram.ui.Components.fy0) this.f46212b;
                org.telegram.ui.Components.y9 y9Var = fy0Var.f28313b;
                if (getVisibility() == 8 && i10 == 0) {
                    fy0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        y9Var.getImageReceiver().startAnimation();
                    }
                } else if (i10 == 8) {
                    y9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i10);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public za1(Object obj, Context context, int i10) {
        super(context);
        this.f46211a = i10;
        this.f46212b = obj;
    }
}
