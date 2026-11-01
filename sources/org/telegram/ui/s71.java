package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class s71 extends LinearLayout {
    public final int f41279a;
    public Object f41280b;

    public s71(Context context, int i10) {
        super(context);
        this.f41279a = i10;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.f41279a) {
            case 13:
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                sd1 sd1Var = (sd1) this.f41280b;
                Camera camera = sd1Var.L;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = sd1Var.M;
                camera.getMatrix(matrix);
                camera.restore();
                float f7 = -width;
                float f10 = -height;
                matrix.preTranslate(f7, f10);
                float f11 = width;
                float f12 = height;
                matrix.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = sd1Var.N;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f7, f10);
                matrix2.postTranslate(f11, f12);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 20:
                ph.k1 k1Var = (ph.k1) this.f41280b;
                RectF rectF = k1Var.h;
                RectF rectF2 = k1Var.f45175f;
                RectF rectF3 = k1Var.e;
                Paint paint = k1Var.f45176n;
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20911c6, false)));
                float e = k1Var.f45174c.e(false, k1Var.f45173b);
                double d = e;
                ArrayList arrayList = k1Var.d;
                int j10 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                int j11 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                if (j10 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j10));
                } else if (j11 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j11));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (j11 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j11));
                } else if (j10 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j10));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                org.telegram.messenger.i0.Z1(rectF3, rectF2, e - j10, rectF);
                float height2 = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height2, height2, paint);
                super.dispatchDraw(canvas);
                return;
            case 21:
                qh.q qVar = (qh.q) this.f41280b;
                s71 s71Var = qVar.f45726c;
                int i10 = qVar.e;
                if (i10 >= 0 && i10 < s71Var.getChildCount()) {
                    float width2 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (s71Var.getChildAt(qVar.e).getWidth() != 0) {
                        if (Float.isNaN(qVar.f45727f)) {
                            qVar.f45727f = width2;
                        } else {
                            float f13 = qVar.f45727f;
                            if (f13 != width2) {
                                float f14 = width2 - f13;
                                if (Math.abs(f14) >= 0.5f) {
                                    width2 = (f14 * 0.3f) + qVar.f45727f;
                                }
                                qVar.f45727f = width2;
                                s71Var.invalidate();
                            }
                        }
                        canvas.drawCircle(qVar.f45727f, s71Var.getHeight() / 2.0f, (qVar.getHeight() - org.telegram.messenger.i0.L(6.0f)) / 2.0f, qVar.d);
                    }
                }
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
        switch (this.f41279a) {
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f41280b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
                if (scrollSlidingTextTabStrip.f24168b != null && scrollSlidingTextTabStrip.f24183n0) {
                    if (motionEvent.getAction() == 0) {
                        float x10 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        int i11 = 0;
                        while (true) {
                            if (i11 < getChildCount()) {
                                view = getChildAt(i11);
                                if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y3 < view.getY() || y3 > view.getY() + view.getHeight()) {
                                    i11++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.f24171c0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f24171c0));
                            scrollSlidingTextTabStrip.f24168b.getClass();
                            scrollSlidingTextTabStrip.f24171c0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f24171c0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f24171c0);
                            if (scrollSlidingTextTabStrip.f24182n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < org.telegram.messenger.i0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.i0.L(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.i0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.i0.L(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f24171c0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f24171c0.getX();
                            int width2 = scrollSlidingTextTabStrip.f24171c0.getWidth();
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
                                org.telegram.ui.Components.yl0 yl0Var = scrollSlidingTextTabStrip.f24168b;
                                sparseIntArray.get(i10);
                                yl0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f24171c0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.s71 f32280b;

                                {
                                    this.f32280b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.s71 s71Var = this.f32280b;
                                            s71Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) s71Var.f41280b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.s71 s71Var2 = this.f32280b;
                                            s71Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) s71Var2.f41280b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        }
                        scrollSlidingTextTabStrip.f24171c0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f24171c0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.s71 f32280b;

                                {
                                    this.f32280b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.s71 s71Var = this.f32280b;
                                            s71Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) s71Var.f41280b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.s71 s71Var2 = this.f32280b;
                                            s71Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) s71Var2.f41280b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        }
                        scrollSlidingTextTabStrip.f24171c0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f24171c0 != null || super.dispatchTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                if (!((rh.y3) this.f41280b).f47729a0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 23:
                if (!((rh.h8) this.f41280b).f47045t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                if (!((wh.g) this.f41280b).f52897s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41279a) {
            case 15:
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
        switch (this.f41279a) {
            case 3:
                kg.v1 v1Var = (kg.v1) ((kg.f) this.f41280b).d;
                if (view == v1Var.f11302j2 && v1Var.f11318z2) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                if ((view instanceof org.telegram.ui.ActionBar.h1) && ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f41280b).N != null) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 6:
                if (view == ((org.telegram.ui.Components.o8) this.f41280b).f29044a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 9:
                org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) this.f41280b;
                if (view instanceof org.telegram.ui.Components.kw0) {
                    ((org.telegram.ui.Components.kw0) view).a(vl0Var.f31328i0);
                }
                if (view == vl0Var.f31339s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 14:
                boolean drawChild = super.drawChild(canvas, view, j10);
                b60 b60Var = (b60) this.f41280b;
                if (view == b60Var.f35954b && b60Var.f35962y != null) {
                    int measuredHeight = b60Var.f35959s.getMeasuredHeight();
                    b60Var.f35962y.setBounds(0, measuredHeight, getMeasuredWidth(), b60Var.f35962y.getIntrinsicHeight() + measuredHeight);
                    b60Var.f35962y.draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f41279a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.u0[] u0VarArr = (org.telegram.ui.Cells.u0[]) this.f41280b;
                    if (i10 < u0VarArr.length) {
                        u0VarArr[i10].invalidate();
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
        switch (this.f41279a) {
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((zd1) this.f41280b).B0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f41279a) {
            case 5:
                return org.telegram.ui.ActionBar.q4.b((org.telegram.ui.ActionBar.q4) this.f41280b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41279a) {
            case 7:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.kv) this.f41280b).f27963s.F && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.m5.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 8:
                ((org.telegram.ui.Components.h10) this.f41280b).f26632c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 9:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f41280b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f24181l0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f24184r) >= 0 && scrollSlidingTextTabStrip.f24166a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f24184r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.f24184r), false);
                    scrollSlidingTextTabStrip.f24181l0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        Size size;
        int i13;
        int i14;
        int i15 = i11;
        int i16 = 0;
        switch (this.f41279a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(123.0f), 1073741824));
                return;
            case 1:
                int size2 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                bi.k2 k2Var = (bi.k2) this.f41280b;
                LinearLayout linearLayout = k2Var.m0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k2Var.m0.getLayoutParams();
                    paddingRight += k2Var.m0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = k2Var.f3151n0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) k2Var.f3151n0.getLayoutParams();
                    paddingRight += k2Var.f3151n0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = k2Var.f3152o0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) k2Var.f3152o0.getLayoutParams();
                    paddingRight += k2Var.f3152o0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                k2Var.f3148k0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i10, i11);
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                bi.i4 i4Var = (bi.i4) this.f41280b;
                LinearLayout linearLayout4 = i4Var.L;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) i4Var.L.getLayoutParams();
                    paddingRight2 += i4Var.L.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = i4Var.M;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) i4Var.M.getLayoutParams();
                    paddingRight2 += i4Var.M.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = i4Var.N;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) i4Var.N.getLayoutParams();
                    paddingRight2 += i4Var.N.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                i4Var.K = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i10, i11);
                return;
            case 4:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f41280b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.O) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (i17 < childCount) {
                        View childAt = getChildAt(i17);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(2131296739);
                            Object tag2 = childAt.getTag(2131296585);
                            Object tag3 = childAt.getTag(2131296437);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i10, 0, i15, 0);
                            if (tag3 == null) {
                                boolean z10 = tag instanceof Integer;
                                if (!z10 && tag2 == null) {
                                    i18 = Math.max(i18, childAt.getMeasuredWidth());
                                } else if (z10) {
                                    i19 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.E = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = org.telegram.messenger.i0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.E;
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i17++;
                        i15 = i11;
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        while (i16 < size4) {
                            ((View) arrayList.get(i16)).getLayoutParams().width = Math.max(i18, i19);
                            i16++;
                        }
                    }
                }
                super.onMeasure(i10, i11);
                return;
            case 5:
                org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.f41280b;
                if (org.telegram.ui.ActionBar.q4.b(q4Var) && (size = q4Var.J) != null) {
                    i12 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                } else {
                    i12 = i10;
                }
                super.onMeasure(i12, i15);
                return;
            case 7:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(((org.telegram.ui.Components.kv) this.f41280b).f33184b.getChildCount() * 32), 1073741824)), i15);
                return;
            case 12:
                super.onMeasure(i10, i11);
                if (org.telegram.messenger.dd.X) {
                    ((org.telegram.ui.Components.l31) this.f41280b).f28044c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 15:
                int childCount2 = getChildCount();
                int i20 = 0;
                for (int i21 = 0; i21 < childCount2; i21++) {
                    if (getChildAt(i21).getVisibility() == 0) {
                        i20++;
                    }
                }
                int size5 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size6 = View.MeasureSpec.getSize(i15);
                if (i20 != 0) {
                    int min = Math.min(org.telegram.messenger.i0.L(56.0f), size5 / i20);
                    if (((PhotoViewer) this.f41280b).f33522j1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f41280b).Y7 < 2) {
                            i13 = 48;
                        } else {
                            i13 = 64;
                        }
                        int max = Math.max(0, (min - org.telegram.messenger.i0.L(i13)) / 2);
                        ((PhotoViewer) this.f41280b).f33522j1.setPadding(max, 0, max, 0);
                    }
                    while (i16 < childCount2) {
                        View childAt2 = getChildAt(i16);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                        }
                        i16++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i20), size6);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size5, size6);
                return;
            case 17:
                super.onMeasure(i10, i11);
                rc1 rc1Var = (rc1) this.f41280b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) rc1Var.f41041c.getLayoutParams();
                if (rc1Var.f41037a.getVisibility() == 8) {
                    i14 = org.telegram.messenger.i0.f16166m;
                } else {
                    i14 = 0;
                }
                int L = org.telegram.messenger.i0.L(8.0f) + i14;
                if (rc1Var.O == 2 && org.telegram.messenger.i0.O1()) {
                    Point point = org.telegram.messenger.i0.f16172q;
                    if (point.x <= point.y) {
                        i16 = org.telegram.messenger.i0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i16;
                return;
            case 19:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.b6) this.f41280b).A0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f41279a) {
            case 10:
                super.setAlpha(f7);
                ((ScrollSlidingTextTabStrip) this.f41280b).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41279a) {
            case 11:
                org.telegram.ui.Components.ew0 ew0Var = (org.telegram.ui.Components.ew0) this.f41280b;
                org.telegram.ui.Components.g9 g9Var = ew0Var.f25947b;
                if (getVisibility() == 8 && i10 == 0) {
                    ew0Var.c();
                    if (org.telegram.messenger.tc.e(3)) {
                        g9Var.getImageReceiver().P0(false);
                    }
                } else if (i10 == 8) {
                    g9Var.getImageReceiver().f();
                }
                super.setVisibility(i10);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public s71(Object obj, Context context, int i10) {
        super(context);
        this.f41279a = i10;
        this.f41280b = obj;
    }

    public s71(ContextThemeWrapper contextThemeWrapper, final wo0 wo0Var) {
        super(contextThemeWrapper);
        this.f41279a = 16;
        this.f41280b = r9;
        setOrientation(1);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232368, org.telegram.messenger.dd.L0(2131745281, null), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                wo0 wo0Var2 = wo0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = wo0Var2.f43143a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = wo0Var2.f43143a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = wo0Var2.f43143a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = wo0Var2.f43143a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = wo0Var2.f43143a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232372, org.telegram.messenger.dd.L0(2131745284, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                wo0 wo0Var2 = wo0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = wo0Var2.f43143a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = wo0Var2.f43143a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = wo0Var2.f43143a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = wo0Var2.f43143a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = wo0Var2.f43143a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232371, org.telegram.messenger.dd.L0(2131745285, null), false, null);
        c12.d(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                wo0 wo0Var2 = wo0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = wo0Var2.f43143a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = wo0Var2.f43143a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = wo0Var2.f43143a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = wo0Var2.f43143a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = wo0Var2.f43143a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232369, org.telegram.messenger.dd.L0(2131745288, null), false, null);
        c13.d(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                wo0 wo0Var2 = wo0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = wo0Var2.f43143a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = wo0Var2.f43143a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = wo0Var2.f43143a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = wo0Var2.f43143a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = wo0Var2.f43143a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, this, 2131232373, org.telegram.messenger.dd.L0(2131745282, null), false, null);
        c14.d(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = r2;
                wo0 wo0Var2 = wo0Var;
                switch (i10) {
                    case 0:
                        PhotoViewer photoViewer = wo0Var2.f43143a;
                        Drawable[] drawableArr = PhotoViewer.U8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = wo0Var2.f43143a;
                        Drawable[] drawableArr2 = PhotoViewer.U8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = wo0Var2.f43143a;
                        Drawable[] drawableArr3 = PhotoViewer.U8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = wo0Var2.f43143a;
                        Drawable[] drawableArr4 = PhotoViewer.U8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = wo0Var2.f43143a;
                        Drawable[] drawableArr5 = PhotoViewer.U8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.b1[] b1VarArr = {c10, c11, c12, c13, c14};
        View bg0Var = new bg0(contextThemeWrapper, 9);
        bg0Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        bg0Var.setBackgroundColor(-15198184);
        addView(bg0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bg0Var.getLayoutParams();
        if (org.telegram.messenger.dd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(8.0f);
        bg0Var.setLayoutParams(layoutParams);
    }
}
