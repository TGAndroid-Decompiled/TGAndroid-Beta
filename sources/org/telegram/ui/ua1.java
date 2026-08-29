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
import org.telegram.ui.ua1;
public final class ua1 extends LinearLayout {
    public final int f43210a;
    public Object f43211b;

    public ua1(Context context) {
        super(context);
        this.f43210a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f43210a) {
            case 2:
                ih.g2 g2Var = (ih.g2) this.f43211b;
                RectF rectF = g2Var.h;
                RectF rectF2 = g2Var.f9183f;
                RectF rectF3 = g2Var.f9182e;
                Paint paint = g2Var.f9184n;
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.c6, false)));
                float d = g2Var.f9181c.d(g2Var.f9180b, false);
                double d10 = d;
                ArrayList arrayList = g2Var.d;
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
                float height = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height, height, paint);
                super.dispatchDraw(canvas);
                return;
            case 14:
                int width = getWidth() / 2;
                int height2 = getHeight() / 2;
                hh1 hh1Var = (hh1) this.f43211b;
                Camera camera = hh1Var.H;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = hh1Var.I;
                camera.getMatrix(matrix);
                camera.restore();
                float f9 = -width;
                float f10 = -height2;
                matrix.preTranslate(f9, f10);
                float f11 = width;
                float f12 = height2;
                matrix.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = hh1Var.J;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f9, f10);
                matrix2.postTranslate(f11, f12);
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
        int i10;
        View view;
        switch (this.f43210a) {
            case 3:
                if (!((jh.d5) this.f43211b).Q.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((jh.ia) this.f43211b).f12276b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (!((oh.g) this.f43211b).f19574a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f43211b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.K;
                if (scrollSlidingTextTabStrip.f26525b != null && scrollSlidingTextTabStrip.f26537j0) {
                    if (motionEvent.getAction() == 0) {
                        float x4 = motionEvent.getX();
                        float y8 = motionEvent.getY();
                        int i11 = 0;
                        while (true) {
                            if (i11 < getChildCount()) {
                                view = getChildAt(i11);
                                if (x4 < view.getX() || x4 > view.getX() + view.getWidth() || y8 < view.getY() || y8 > view.getY() + view.getHeight()) {
                                    i11++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.V = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.V));
                            scrollSlidingTextTabStrip.f26525b.getClass();
                            scrollSlidingTextTabStrip.V = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.V;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.V);
                            if (scrollSlidingTextTabStrip.f26538n == indexOfChild) {
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
                                org.telegram.ui.Components.jm0 jm0Var = scrollSlidingTextTabStrip.f26525b;
                                sparseIntArray.get(i10);
                                jm0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.V;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ua1 f29204b;

                                {
                                    this.f29204b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            ua1 ua1Var = this.f29204b;
                                            ua1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) ua1Var.f43211b).invalidate();
                                            return;
                                        default:
                                            ua1 ua1Var2 = this.f29204b;
                                            ua1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) ua1Var2.f43211b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.jr.h).start();
                        }
                        scrollSlidingTextTabStrip.V = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.V;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ua1 f29204b;

                                {
                                    this.f29204b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            ua1 ua1Var = this.f29204b;
                                            ua1Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) ua1Var.f43211b).invalidate();
                                            return;
                                        default:
                                            ua1 ua1Var2 = this.f29204b;
                                            ua1Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) ua1Var2.f43211b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.jr.h).start();
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
        switch (this.f43210a) {
            case 16:
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
        switch (this.f43210a) {
            case 1:
                cg.f2 f2Var = ((cg.e2) this.f43211b).f3111c;
                if (view == f2Var.f3134n0 && f2Var.D0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 7:
                if (view == ((org.telegram.ui.Components.b9) this.f43211b).f27003a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 10:
                org.telegram.ui.Components.fm0 fm0Var = (org.telegram.ui.Components.fm0) this.f43211b;
                if (view instanceof org.telegram.ui.Components.vw0) {
                    ((org.telegram.ui.Components.vw0) view).a(fm0Var.f28491e0);
                }
                if (view == fm0Var.f28504s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 15:
                boolean drawChild = super.drawChild(canvas, view, j10);
                t60 t60Var = (t60) this.f43211b;
                if (view == t60Var.f42558b && t60Var.f42566x != null) {
                    int measuredHeight = t60Var.f42564s.getMeasuredHeight();
                    t60Var.f42566x.setBounds(0, measuredHeight, getMeasuredWidth(), t60Var.f42566x.getIntrinsicHeight() + measuredHeight);
                    t60Var.f42566x.draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f43210a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.f43211b;
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
        switch (this.f43210a) {
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((oh1) this.f43211b).f41177x0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f43210a) {
            case 6:
                return org.telegram.ui.ActionBar.t4.b((org.telegram.ui.ActionBar.t4) this.f43211b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43210a) {
            case 8:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.rv) this.f43211b).f32390s.B && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.x3.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 9:
                ((org.telegram.ui.Components.x10) this.f43211b).f34542c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 10:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f43211b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
                if (scrollSlidingTextTabStrip.f26535h0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f26539r) >= 0 && scrollSlidingTextTabStrip.f26523a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f26539r)) != null) {
                    scrollSlidingTextTabStrip.i(sparseIntArray.get(scrollSlidingTextTabStrip.f26539r), false);
                    scrollSlidingTextTabStrip.f26535h0 = false;
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
        switch (this.f43210a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), 1073741824));
                return;
            case 6:
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) this.f43211b;
                if (org.telegram.ui.ActionBar.t4.b(t4Var) && (size = t4Var.J) != null) {
                    i10 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                }
                super.onMeasure(i10, i11);
                return;
            case 8:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.rv) this.f43211b).f30108b.getChildCount() * 32), 1073741824)), i11);
                return;
            case 13:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.i31) this.f43211b).f29312c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 16:
                int childCount = getChildCount();
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getVisibility() == 0) {
                        i14++;
                    }
                }
                int size2 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size3 = View.MeasureSpec.getSize(i11);
                if (i14 != 0) {
                    int min = Math.min(AndroidUtilities.dp(56.0f), size2 / i14);
                    if (((PhotoViewer) this.f43211b).f35694f1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f43211b).T7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - AndroidUtilities.dp(i12)) / 2);
                        ((PhotoViewer) this.f43211b).f35694f1.setPadding(max, 0, max, 0);
                    }
                    for (int i16 = 0; i16 < childCount; i16++) {
                        View childAt = getChildAt(i16);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i14), size3);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size2, size3);
                return;
            case 17:
                super.onMeasure(i10, i11);
                cg1 cg1Var = (cg1) this.f43211b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cg1Var.f37108c.getLayoutParams();
                int i17 = 0;
                if (cg1Var.f37104a.getVisibility() == 8) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                int dp = AndroidUtilities.dp(8.0f) + i13;
                if (cg1Var.K == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        i17 = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams.topMargin = dp + i17;
                return;
            case 19:
                int size4 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                th.x1 x1Var = (th.x1) this.f43211b;
                LinearLayout linearLayout = x1Var.f48858i0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) x1Var.f48858i0.getLayoutParams();
                    paddingRight += x1Var.f48858i0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout2 = x1Var.f48859j0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) x1Var.f48859j0.getLayoutParams();
                    paddingRight += x1Var.f48859j0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                LinearLayout linearLayout3 = x1Var.f48860k0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) x1Var.f48860k0.getLayoutParams();
                    paddingRight += x1Var.f48860k0.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                x1Var.f48856g0 = Math.max(0, size4 - paddingRight);
                super.onMeasure(i10, i11);
                return;
            case 20:
                int size5 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                th.t3 t3Var = (th.t3) this.f43211b;
                LinearLayout linearLayout4 = t3Var.H;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) t3Var.H.getLayoutParams();
                    paddingRight2 += t3Var.H.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout5 = t3Var.I;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) t3Var.I.getLayoutParams();
                    paddingRight2 += t3Var.I.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                LinearLayout linearLayout6 = t3Var.J;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) t3Var.J.getLayoutParams();
                    paddingRight2 += t3Var.J.getMeasuredWidth() + marginLayoutParams7.leftMargin + marginLayoutParams7.rightMargin;
                }
                t3Var.G = Math.max(0, size5 - paddingRight2);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f43210a) {
            case 11:
                super.setAlpha(f9);
                ((ScrollSlidingTextTabStrip) this.f43211b).invalidate();
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f43210a) {
            case 12:
                org.telegram.ui.Components.qw0 qw0Var = (org.telegram.ui.Components.qw0) this.f43211b;
                org.telegram.ui.Components.t9 t9Var = qw0Var.f32120b;
                if (getVisibility() == 8 && i10 == 0) {
                    qw0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        t9Var.getImageReceiver().startAnimation();
                    }
                } else if (i10 == 8) {
                    t9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i10);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public ua1(Object obj, Context context, int i10) {
        super(context);
        this.f43210a = i10;
        this.f43211b = obj;
    }
}
