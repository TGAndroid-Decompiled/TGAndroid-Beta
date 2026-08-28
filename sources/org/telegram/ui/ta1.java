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
import org.telegram.ui.ta1;
public final class ta1 extends LinearLayout {
    public final int f42938a;
    public Object f42939b;

    public ta1(Context context) {
        super(context);
        this.f42938a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f42938a) {
            case 1:
                fh.o2 o2Var = (fh.o2) this.f42939b;
                RectF rectF = o2Var.h;
                RectF rectF2 = o2Var.f6659f;
                RectF rectF3 = o2Var.f6658e;
                Paint paint = o2Var.f6660n;
                paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22983c6, false)));
                float d = o2Var.f6657c.d(o2Var.f6656b, false);
                double d9 = d;
                ArrayList arrayList = o2Var.d;
                int clamp = Utilities.clamp((int) Math.floor(d9), arrayList.size() - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(d9), arrayList.size() - 1, 0);
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
                float height = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height, height, paint);
                super.dispatchDraw(canvas);
                return;
            case 13:
                int width = getWidth() / 2;
                int height2 = getHeight() / 2;
                fh1 fh1Var = (fh1) this.f42939b;
                Camera camera = fh1Var.H;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = fh1Var.I;
                camera.getMatrix(matrix);
                camera.restore();
                float f10 = -width;
                float f11 = -height2;
                matrix.preTranslate(f10, f11);
                float f12 = width;
                float f13 = height2;
                matrix.postTranslate(f12, f13);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = fh1Var.J;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f10, f11);
                matrix2.postTranslate(f12, f13);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        View view;
        switch (this.f42938a) {
            case 2:
                if (!((gh.g5) this.f42939b).Q.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                if (!((gh.oa) this.f42939b).f8696b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((lh.g) this.f42939b).f16880a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f42939b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.K;
                if (scrollSlidingTextTabStrip.f26514b != null && scrollSlidingTextTabStrip.f26526j0) {
                    if (motionEvent.getAction() == 0) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        int i10 = 0;
                        while (true) {
                            if (i10 < getChildCount()) {
                                view = getChildAt(i10);
                                if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y10 < view.getY() || y10 > view.getY() + view.getHeight()) {
                                    i10++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.V = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.V));
                            scrollSlidingTextTabStrip.f26514b.getClass();
                            scrollSlidingTextTabStrip.V = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.V;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.V);
                            if (scrollSlidingTextTabStrip.f26527n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(AndroidUtilities.dp(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.V.getWidth() / 2.0f) + scrollSlidingTextTabStrip.V.getX();
                            int width2 = scrollSlidingTextTabStrip.V.getWidth();
                            if (width < 0.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                                while (true) {
                                    if (i9 < getChildCount()) {
                                        View childAt = getChildAt(i9);
                                        float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                        if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                            i9++;
                                        }
                                    } else {
                                        i9 = getChildCount() - 1;
                                    }
                                }
                            }
                            if (i9 != indexOfChild) {
                                org.telegram.ui.Components.wl0 wl0Var = scrollSlidingTextTabStrip.f26514b;
                                sparseIntArray.get(i9);
                                wl0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.V;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ta1 f33091b;

                                {
                                    this.f33091b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            ta1 ta1Var = this.f33091b;
                                            ta1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) ta1Var.f42939b).invalidate();
                                            return;
                                        default:
                                            ta1 ta1Var2 = this.f33091b;
                                            ta1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) ta1Var2.f42939b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        }
                        scrollSlidingTextTabStrip.V = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.V;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ta1 f33091b;

                                {
                                    this.f33091b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            ta1 ta1Var = this.f33091b;
                                            ta1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) ta1Var.f42939b).invalidate();
                                            return;
                                        default:
                                            ta1 ta1Var2 = this.f33091b;
                                            ta1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) ta1Var2.f42939b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        }
                        scrollSlidingTextTabStrip.V = null;
                    }
                    if (scrollSlidingTextTabStrip.V != null || super.dispatchTouchEvent(motionEvent)) {
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
        switch (this.f42938a) {
            case 15:
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    if (getChildAt(i9).getVisibility() == 0) {
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
        switch (this.f42938a) {
            case 6:
                if (view == ((org.telegram.ui.Components.w8) this.f42939b).f34138a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 9:
                org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) this.f42939b;
                if (view instanceof org.telegram.ui.Components.lw0) {
                    ((org.telegram.ui.Components.lw0) view).a(sl0Var.f32501e0);
                }
                if (view == sl0Var.f32514s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 14:
                boolean drawChild = super.drawChild(canvas, view, j10);
                r60 r60Var = (r60) this.f42939b;
                if (view == r60Var.f42278b && r60Var.f42286x != null) {
                    int measuredHeight = r60Var.f42284s.getMeasuredHeight();
                    r60Var.f42286x.setBounds(0, measuredHeight, getMeasuredWidth(), r60Var.f42286x.getIntrinsicHeight() + measuredHeight);
                    r60Var.f42286x.draw(canvas);
                }
                return drawChild;
            case 20:
                zf.k1 k1Var = ((zf.j1) this.f42939b).f50557c;
                if (view == k1Var.f50579n0 && k1Var.D0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f42938a) {
            case 0:
                super.invalidate();
                int i9 = 0;
                while (true) {
                    org.telegram.ui.Cells.y0[] y0VarArr = (org.telegram.ui.Cells.y0[]) this.f42939b;
                    if (i9 < y0VarArr.length) {
                        y0VarArr[i9].invalidate();
                        i9++;
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
        switch (this.f42938a) {
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((mh1) this.f42939b).f40469x0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f42938a) {
            case 5:
                return org.telegram.ui.ActionBar.t4.b((org.telegram.ui.ActionBar.t4) this.f42939b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f42938a) {
            case 7:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.lv) this.f42939b).f30562s.B && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.l0.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 8:
                ((org.telegram.ui.Components.m10) this.f42939b).f30660c.a(getMeasuredWidth());
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 9:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 10:
                super.onLayout(z10, i9, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f42939b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
                if (scrollSlidingTextTabStrip.f26524h0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f26528r) >= 0 && scrollSlidingTextTabStrip.f26512a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f26528r)) != null) {
                    scrollSlidingTextTabStrip.i(sparseIntArray.get(scrollSlidingTextTabStrip.f26528r), false);
                    scrollSlidingTextTabStrip.f26524h0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        Size size;
        int i11;
        int i12;
        switch (this.f42938a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), 1073741824));
                return;
            case 5:
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) this.f42939b;
                if (org.telegram.ui.ActionBar.t4.b(t4Var) && (size = t4Var.J) != null) {
                    i9 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                }
                super.onMeasure(i9, i10);
                return;
            case 7:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i9), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.lv) this.f42939b).f34720b.getChildCount() * 32), 1073741824)), i10);
                return;
            case 12:
                super.onMeasure(i9, i10);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.x21) this.f42939b).f34498c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 15:
                int childCount = getChildCount();
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() == 0) {
                        i13++;
                    }
                }
                int size2 = (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight();
                int size3 = View.MeasureSpec.getSize(i10);
                if (i13 != 0) {
                    int min = Math.min(AndroidUtilities.dp(56.0f), size2 / i13);
                    if (((PhotoViewer) this.f42939b).f35628f1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f42939b).T7 < 2) {
                            i11 = 48;
                        } else {
                            i11 = 64;
                        }
                        int max = Math.max(0, (min - AndroidUtilities.dp(i11)) / 2);
                        ((PhotoViewer) this.f42939b).f35628f1.setPadding(max, 0, max, 0);
                    }
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = getChildAt(i15);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i13), size3);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size2, size3);
                return;
            case 16:
                super.onMeasure(i9, i10);
                ag1 ag1Var = (ag1) this.f42939b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ag1Var.f36485c.getLayoutParams();
                int i16 = 0;
                if (ag1Var.f36481a.getVisibility() == 8) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                int dp = AndroidUtilities.dp(8.0f) + i12;
                if (ag1Var.K == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        i16 = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams.topMargin = dp + i16;
                return;
            case 18:
                int size4 = View.MeasureSpec.getSize(i9);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                qh.x1 x1Var = (qh.x1) this.f42939b;
                LinearLayout linearLayout = x1Var.f46804i0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) x1Var.f46804i0.getLayoutParams();
                    paddingRight += x1Var.f46804i0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout2 = x1Var.f46805j0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) x1Var.f46805j0.getLayoutParams();
                    paddingRight += x1Var.f46805j0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                LinearLayout linearLayout3 = x1Var.f46806k0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) x1Var.f46806k0.getLayoutParams();
                    paddingRight += x1Var.f46806k0.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                x1Var.f46802g0 = Math.max(0, size4 - paddingRight);
                super.onMeasure(i9, i10);
                return;
            case 19:
                int size5 = View.MeasureSpec.getSize(i9);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                qh.s3 s3Var = (qh.s3) this.f42939b;
                LinearLayout linearLayout4 = s3Var.H;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) s3Var.H.getLayoutParams();
                    paddingRight2 += s3Var.H.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout5 = s3Var.I;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) s3Var.I.getLayoutParams();
                    paddingRight2 += s3Var.I.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                LinearLayout linearLayout6 = s3Var.J;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) s3Var.J.getLayoutParams();
                    paddingRight2 += s3Var.J.getMeasuredWidth() + marginLayoutParams7.leftMargin + marginLayoutParams7.rightMargin;
                }
                s3Var.G = Math.max(0, size5 - paddingRight2);
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f42938a) {
            case 10:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f42939b).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f42938a) {
            case 11:
                org.telegram.ui.Components.gw0 gw0Var = (org.telegram.ui.Components.gw0) this.f42939b;
                org.telegram.ui.Components.o9 o9Var = gw0Var.f28883b;
                if (getVisibility() == 8 && i9 == 0) {
                    gw0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        o9Var.getImageReceiver().startAnimation();
                    }
                } else if (i9 == 8) {
                    o9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i9);
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }

    public ta1(Object obj, Context context, int i9) {
        super(context);
        this.f42938a = i9;
        this.f42939b = obj;
    }
}
