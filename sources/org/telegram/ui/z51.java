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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class z51 extends LinearLayout {
    public final int f53881a;
    public Object f53882b;

    public z51(int i7, Context context, Object obj) {
        super(context);
        this.f53881a = i7;
        this.f53882b = obj;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.f53881a) {
            case 1:
                bi.r2 r2Var = (bi.r2) this.f53882b;
                RectF rectF = r2Var.h;
                RectF rectF2 = r2Var.f3823f;
                RectF rectF3 = r2Var.f3822e;
                Paint paint = r2Var.f3824n;
                paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28831c6, false)));
                float e10 = r2Var.f3821c.e(false, r2Var.f3820b);
                double d = e10;
                ArrayList arrayList = r2Var.d;
                int j3 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                int j10 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                if (j3 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j3));
                } else if (j10 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(j10));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (j10 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j10));
                } else if (j3 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(j3));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                org.telegram.messenger.g0.Z1(rectF3, rectF2, e10 - j3, rectF);
                float height = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height, height, paint);
                super.dispatchDraw(canvas);
                return;
            case 2:
                ci.r rVar = (ci.r) this.f53882b;
                z51 z51Var = rVar.f5471c;
                int i7 = rVar.f5472e;
                if (i7 >= 0 && i7 < z51Var.getChildCount()) {
                    float width = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (z51Var.getChildAt(rVar.f5472e).getWidth() != 0) {
                        if (Float.isNaN(rVar.f5473f)) {
                            rVar.f5473f = width;
                        } else {
                            float f10 = rVar.f5473f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + rVar.f5473f;
                                }
                                rVar.f5473f = width;
                                z51Var.invalidate();
                            }
                        }
                        canvas.drawCircle(rVar.f5473f, z51Var.getHeight() / 2.0f, (rVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, rVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f53882b;
                float f12 = chatActivityEnterView.f32274r1;
                if (f12 < 1.0f) {
                    if (f12 > 0.0f) {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.f32274r1) * 255.0f));
                        super.dispatchDraw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        return;
                    }
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            case 19:
                int width2 = getWidth() / 2;
                int height2 = getHeight() / 2;
                yb1 yb1Var = (yb1) this.f53882b;
                Camera camera = yb1Var.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = yb1Var.N;
                camera.getMatrix(matrix);
                camera.restore();
                float f13 = -width2;
                float f14 = -height2;
                matrix.preTranslate(f13, f14);
                float f15 = width2;
                float f16 = height2;
                matrix.postTranslate(f15, f16);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = yb1Var.O;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f13, f14);
                matrix2.postTranslate(f15, f16);
                canvas.save();
                canvas.clipRect(0, 0, width2, getHeight());
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
        int i7;
        View view;
        switch (this.f53881a) {
            case 3:
                if (!((di.w5) this.f53882b).f9660b0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((di.mb) this.f53882b).f9084u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (!((ii.f) this.f53882b).f15971t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f53882b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f32702b != null && scrollSlidingTextTabStrip.f32719o0) {
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
                        scrollSlidingTextTabStrip.f32706d0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f32706d0));
                            scrollSlidingTextTabStrip.f32702b.getClass();
                            scrollSlidingTextTabStrip.f32706d0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f32706d0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f32706d0);
                            if (scrollSlidingTextTabStrip.f32717n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f32706d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f32706d0.getX();
                            int width2 = scrollSlidingTextTabStrip.f32706d0.getWidth();
                            if (width < 0.0f) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                while (true) {
                                    if (i7 < getChildCount()) {
                                        View childAt = getChildAt(i7);
                                        float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                        if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                            i7++;
                                        }
                                    } else {
                                        i7 = getChildCount() - 1;
                                    }
                                }
                            }
                            if (i7 != indexOfChild) {
                                org.telegram.ui.Components.zk0 zk0Var = scrollSlidingTextTabStrip.f32702b;
                                sparseIntArray.get(i7);
                                zk0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f32706d0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.z51 f41720b;

                                {
                                    this.f41720b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.z51 z51Var = this.f41720b;
                                            z51Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) z51Var.f53882b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.z51 z51Var2 = this.f41720b;
                                            z51Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) z51Var2.f53882b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.er.h).start();
                        }
                        scrollSlidingTextTabStrip.f32706d0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f32706d0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.z51 f41720b;

                                {
                                    this.f41720b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.z51 z51Var = this.f41720b;
                                            z51Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) z51Var.f53882b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.z51 z51Var2 = this.f41720b;
                                            z51Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) z51Var2.f53882b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.er.h).start();
                        }
                        scrollSlidingTextTabStrip.f32706d0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f32706d0 != null || super.dispatchTouchEvent(motionEvent)) {
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
        switch (this.f53881a) {
            case 21:
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    if (getChildAt(i7).getVisibility() == 0) {
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f53881a) {
            case 9:
                if ((view instanceof org.telegram.ui.ActionBar.d1) && ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f53882b).O != null) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 11:
                if (view == ((org.telegram.ui.Components.q8) this.f53882b).f38562a) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 15:
                org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) this.f53882b;
                if (view instanceof org.telegram.ui.Components.hv0) {
                    ((org.telegram.ui.Components.hv0) view).a(wk0Var.f41387j0);
                }
                if (view == wk0Var.f41397s) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 20:
                boolean drawChild = super.drawChild(canvas, view, j3);
                c50 c50Var = (c50) this.f53882b;
                if (view == c50Var.f46018b && c50Var.f46027y != null) {
                    int measuredHeight = c50Var.f46024s.getMeasuredHeight();
                    c50Var.f46027y.setBounds(0, measuredHeight, getMeasuredWidth(), c50Var.f46027y.getIntrinsicHeight() + measuredHeight);
                    c50Var.f46027y.draw(canvas);
                }
                return drawChild;
            case 26:
                ug.g1 g1Var = (ug.g1) ((di.i4) this.f53882b).d;
                if (view == g1Var.f58099n2 && g1Var.D2) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f53881a) {
            case 0:
                super.invalidate();
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) this.f53882b;
                    if (i7 < v0VarArr.length) {
                        v0VarArr[i7].invalidate();
                        i7++;
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
        switch (this.f53881a) {
            case 24:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((ec1) this.f53882b).B0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f53881a) {
            case 10:
                return org.telegram.ui.ActionBar.g4.b((org.telegram.ui.ActionBar.g4) this.f53882b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f53881a) {
            case 12:
                super.onLayout(z10, i7, i10, i11, i12);
                setPivotX(getWidth());
                return;
            case 13:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.ev) this.f53882b).f34441s.G && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.k5.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 14:
                ((org.telegram.ui.Components.v00) this.f53882b).f40198c.a(getMeasuredWidth());
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 15:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 16:
                super.onLayout(z10, i7, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f53882b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f32720r) >= 0 && scrollSlidingTextTabStrip.f32700a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f32720r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.f32720r), false);
                    scrollSlidingTextTabStrip.m0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        Size size;
        int i12;
        int i13;
        int i14 = i10;
        int i15 = 0;
        switch (this.f53881a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(123.0f), 1073741824));
                return;
            case 7:
                int size2 = View.MeasureSpec.getSize(i7);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                oi.z1 z1Var = (oi.z1) this.f53882b;
                LinearLayout linearLayout = z1Var.f22174n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z1Var.f22174n0.getLayoutParams();
                    paddingRight += z1Var.f22174n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = z1Var.f22175o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) z1Var.f22175o0.getLayoutParams();
                    paddingRight += z1Var.f22175o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = z1Var.f22176p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) z1Var.f22176p0.getLayoutParams();
                    paddingRight += z1Var.f22176p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                z1Var.f22172l0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i7, i10);
                return;
            case 8:
                int size3 = View.MeasureSpec.getSize(i7);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                oi.v3 v3Var = (oi.v3) this.f53882b;
                LinearLayout linearLayout4 = v3Var.M;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) v3Var.M.getLayoutParams();
                    paddingRight2 += v3Var.M.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = v3Var.N;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) v3Var.N.getLayoutParams();
                    paddingRight2 += v3Var.N.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = v3Var.O;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) v3Var.O.getLayoutParams();
                    paddingRight2 += v3Var.O.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                v3Var.L = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i7, i10);
                return;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f53882b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.P) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    while (i16 < childCount) {
                        View childAt = getChildAt(i16);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(2131296739);
                            Object tag2 = childAt.getTag(2131296585);
                            Object tag3 = childAt.getTag(2131296437);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i7, 0, i14, 0);
                            if (tag3 == null) {
                                boolean z10 = tag instanceof Integer;
                                if (!z10 && tag2 == null) {
                                    i17 = Math.max(i17, childAt.getMeasuredWidth());
                                } else if (z10) {
                                    i18 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = org.telegram.messenger.g0.L(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.F;
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i16++;
                        i14 = i10;
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        while (i15 < size4) {
                            ((View) arrayList.get(i15)).getLayoutParams().width = Math.max(i17, i18);
                            i15++;
                        }
                    }
                }
                super.onMeasure(i7, i10);
                return;
            case 10:
                org.telegram.ui.ActionBar.g4 g4Var = (org.telegram.ui.ActionBar.g4) this.f53882b;
                if (org.telegram.ui.ActionBar.g4.b(g4Var) && (size = g4Var.J) != null) {
                    i11 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                } else {
                    i11 = i7;
                }
                super.onMeasure(i11, i14);
                return;
            case 13:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i7), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.ev) this.f53882b).f33010b.getChildCount() * 32), 1073741824)), i14);
                return;
            case 18:
                super.onMeasure(i7, i10);
                if (org.telegram.messenger.hd.f24101a0) {
                    ((org.telegram.ui.Components.n21) this.f53882b).f37437c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 21:
                int childCount2 = getChildCount();
                int i19 = 0;
                for (int i20 = 0; i20 < childCount2; i20++) {
                    if (getChildAt(i20).getVisibility() == 0) {
                        i19++;
                    }
                }
                int size5 = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
                int size6 = View.MeasureSpec.getSize(i14);
                if (i19 != 0) {
                    int min = Math.min(org.telegram.messenger.g0.L(56.0f), size5 / i19);
                    if (((PhotoViewer) this.f53882b).f42806k1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f53882b).Y7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(i12)) / 2);
                        ((PhotoViewer) this.f53882b).f42806k1.setPadding(max, 0, max, 0);
                    }
                    while (i15 < childCount2) {
                        View childAt2 = getChildAt(i15);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                        }
                        i15++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i19), size6);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size5, size6);
                return;
            case 23:
                super.onMeasure(i7, i10);
                xa1 xa1Var = (xa1) this.f53882b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) xa1Var.f53143c.getLayoutParams();
                if (xa1Var.f53139a.getVisibility() == 8) {
                    i13 = org.telegram.messenger.g0.f23603m;
                } else {
                    i13 = 0;
                }
                int L = org.telegram.messenger.g0.L(8.0f) + i13;
                if (xa1Var.P == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.f23609q;
                    if (point.x <= point.y) {
                        i15 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i15;
                return;
            case 25:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.y5) this.f53882b).B0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f53881a) {
            case 16:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f53882b).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f53881a) {
            case 17:
                org.telegram.ui.Components.cv0 cv0Var = (org.telegram.ui.Components.cv0) this.f53882b;
                org.telegram.ui.Components.i9 i9Var = cv0Var.f33705b;
                if (getVisibility() == 8 && i7 == 0) {
                    cv0Var.c();
                    if (org.telegram.messenger.qc.e(3)) {
                        i9Var.getImageReceiver().P0(false);
                    }
                } else if (i7 == 8) {
                    i9Var.getImageReceiver().f();
                }
                super.setVisibility(i7);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public z51(Context context, int i7) {
        super(context);
        this.f53881a = i7;
    }

    public z51(ContextThemeWrapper contextThemeWrapper, final nn0 nn0Var) {
        super(contextThemeWrapper);
        this.f53881a = 22;
        this.f53882b = r9;
        setOrientation(1);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232370, org.telegram.messenger.hd.M0(2131745263, null), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                nn0 nn0Var2 = nn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = nn0Var2.f49597a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = nn0Var2.f49597a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = nn0Var2.f49597a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = nn0Var2.f49597a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = nn0Var2.f49597a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232374, org.telegram.messenger.hd.M0(2131745266, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                nn0 nn0Var2 = nn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = nn0Var2.f49597a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = nn0Var2.f49597a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = nn0Var2.f49597a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = nn0Var2.f49597a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = nn0Var2.f49597a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232373, org.telegram.messenger.hd.M0(2131745267, null), false, null);
        c12.d(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                nn0 nn0Var2 = nn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = nn0Var2.f49597a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = nn0Var2.f49597a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = nn0Var2.f49597a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = nn0Var2.f49597a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = nn0Var2.f49597a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232371, org.telegram.messenger.hd.M0(2131745270, null), false, null);
        c13.d(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                nn0 nn0Var2 = nn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = nn0Var2.f49597a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = nn0Var2.f49597a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = nn0Var2.f49597a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = nn0Var2.f49597a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = nn0Var2.f49597a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232375, org.telegram.messenger.hd.M0(2131745264, null), false, null);
        c14.d(-328966, -328966);
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i7 = r2;
                nn0 nn0Var2 = nn0Var;
                switch (i7) {
                    case 0:
                        PhotoViewer photoViewer = nn0Var2.f49597a;
                        Drawable[] drawableArr = PhotoViewer.Z8;
                        photoViewer.w0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = nn0Var2.f49597a;
                        Drawable[] drawableArr2 = PhotoViewer.Z8;
                        photoViewer2.w0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = nn0Var2.f49597a;
                        Drawable[] drawableArr3 = PhotoViewer.Z8;
                        photoViewer3.w0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = nn0Var2.f49597a;
                        Drawable[] drawableArr4 = PhotoViewer.Z8;
                        photoViewer4.w0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = nn0Var2.f49597a;
                        Drawable[] drawableArr5 = PhotoViewer.Z8;
                        photoViewer5.w0(true, true, 2.0f);
                        return;
                }
            }
        });
        c14.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.z0[] z0VarArr = {c10, c11, c12, c13, c14};
        View eh0Var = new eh0(contextThemeWrapper, 8);
        eh0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        eh0Var.setBackgroundColor(-15198184);
        addView(eh0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) eh0Var.getLayoutParams();
        if (org.telegram.messenger.hd.f24101a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        eh0Var.setLayoutParams(layoutParams);
    }
}
