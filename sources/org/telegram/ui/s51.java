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
public final class s51 extends LinearLayout {
    public final int f49369a;
    public Object f49370b;

    public s51(int i3, Context context, Object obj) {
        super(context);
        this.f49369a = i3;
        this.f49370b = obj;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.f49369a) {
            case 1:
                ai.a3 a3Var = (ai.a3) this.f49370b;
                RectF rectF = a3Var.h;
                RectF rectF2 = a3Var.f487f;
                RectF rectF3 = a3Var.f486e;
                Paint paint = a3Var.f488n;
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27861c6, false)));
                float e10 = a3Var.f485c.e(false, a3Var.f484b);
                double d = e10;
                ArrayList arrayList = a3Var.d;
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
                org.telegram.messenger.g0.Z1(rectF3, rectF2, e10 - j10, rectF);
                float height = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, height, height, paint);
                super.dispatchDraw(canvas);
                return;
            case 2:
                bi.r rVar = (bi.r) this.f49370b;
                s51 s51Var = rVar.f3832c;
                int i3 = rVar.f3833e;
                if (i3 >= 0 && i3 < s51Var.getChildCount()) {
                    float width = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (s51Var.getChildAt(rVar.f3833e).getWidth() != 0) {
                        if (Float.isNaN(rVar.f3834f)) {
                            rVar.f3834f = width;
                        } else {
                            float f10 = rVar.f3834f;
                            if (f10 != width) {
                                float f11 = width - f10;
                                if (Math.abs(f11) >= 0.5f) {
                                    width = (f11 * 0.3f) + rVar.f3834f;
                                }
                                rVar.f3834f = width;
                                s51Var.invalidate();
                            }
                        }
                        canvas.drawCircle(rVar.f3834f, s51Var.getHeight() / 2.0f, (rVar.getHeight() - org.telegram.messenger.g0.L(6.0f)) / 2.0f, rVar.d);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 18:
                int width2 = getWidth() / 2;
                int height2 = getHeight() / 2;
                sb1 sb1Var = (sb1) this.f49370b;
                Camera camera = sb1Var.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = sb1Var.N;
                camera.getMatrix(matrix);
                camera.restore();
                float f12 = -width2;
                float f13 = -height2;
                matrix.preTranslate(f12, f13);
                float f14 = width2;
                float f15 = height2;
                matrix.postTranslate(f14, f15);
                canvas.save();
                canvas.clipRect(width2, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = sb1Var.O;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f12, f13);
                matrix2.postTranslate(f14, f15);
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
        int i3;
        View view;
        switch (this.f49369a) {
            case 3:
                if (!((ci.f6) this.f49370b).f5086b0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (!((ci.wb) this.f49370b).f6295u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (!((hi.g) this.f49370b).f14450t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f49370b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.f31595b != null && scrollSlidingTextTabStrip.f31612o0) {
                    if (motionEvent.getAction() == 0) {
                        float x10 = motionEvent.getX();
                        float y9 = motionEvent.getY();
                        int i10 = 0;
                        while (true) {
                            if (i10 < getChildCount()) {
                                view = getChildAt(i10);
                                if (x10 < view.getX() || x10 > view.getX() + view.getWidth() || y9 < view.getY() || y9 > view.getY() + view.getHeight()) {
                                    i10++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.f31599d0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.f31599d0));
                            scrollSlidingTextTabStrip.f31595b.getClass();
                            scrollSlidingTextTabStrip.f31599d0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.f31599d0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.f31599d0);
                            if (scrollSlidingTextTabStrip.f31610n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-org.telegram.messenger.g0.L(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - org.telegram.messenger.g0.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(org.telegram.messenger.g0.L(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.f31599d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.f31599d0.getX();
                            int width2 = scrollSlidingTextTabStrip.f31599d0.getWidth();
                            if (width < 0.0f) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                                while (true) {
                                    if (i3 < getChildCount()) {
                                        View childAt = getChildAt(i3);
                                        float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                        if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                            i3++;
                                        }
                                    } else {
                                        i3 = getChildCount() - 1;
                                    }
                                }
                            }
                            if (i3 != indexOfChild) {
                                org.telegram.ui.Components.yk0 yk0Var = scrollSlidingTextTabStrip.f31595b;
                                sparseIntArray.get(i3);
                                yk0Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.f31599d0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.s51 f40024b;

                                {
                                    this.f40024b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.s51 s51Var = this.f40024b;
                                            s51Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) s51Var.f49370b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.s51 s51Var2 = this.f40024b;
                                            s51Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) s51Var2.f49370b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        }
                        scrollSlidingTextTabStrip.f31599d0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.f31599d0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final org.telegram.ui.s51 f40024b;

                                {
                                    this.f40024b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.s51 s51Var = this.f40024b;
                                            s51Var.invalidate();
                                            ((ScrollSlidingTextTabStrip) s51Var.f49370b).invalidate();
                                            return;
                                        default:
                                            org.telegram.ui.s51 s51Var2 = this.f40024b;
                                            s51Var2.invalidate();
                                            ((ScrollSlidingTextTabStrip) s51Var2.f49370b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        }
                        scrollSlidingTextTabStrip.f31599d0 = null;
                    }
                    if (scrollSlidingTextTabStrip.f31599d0 != null || super.dispatchTouchEvent(motionEvent)) {
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
        switch (this.f49369a) {
            case 20:
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (getChildAt(i3).getVisibility() == 0) {
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
        switch (this.f49369a) {
            case 9:
                if ((view instanceof org.telegram.ui.ActionBar.c1) && ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f49370b).O != null) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                if (view == ((org.telegram.ui.Components.r8) this.f49370b).f37667a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 14:
                org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) this.f49370b;
                if (view instanceof org.telegram.ui.Components.ev0) {
                    ((org.telegram.ui.Components.ev0) view).a(vk0Var.f39159j0);
                }
                if (view == vk0Var.f39169s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 19:
                boolean drawChild = super.drawChild(canvas, view, j10);
                y40 y40Var = (y40) this.f49370b;
                if (view == y40Var.f52181b && y40Var.f52190y != null) {
                    int measuredHeight = y40Var.f52187s.getMeasuredHeight();
                    y40Var.f52190y.setBounds(0, measuredHeight, getMeasuredWidth(), y40Var.f52190y.getIntrinsicHeight() + measuredHeight);
                    y40Var.f52190y.draw(canvas);
                }
                return drawChild;
            case 25:
                vg.h1 h1Var = (vg.h1) ((ci.r4) this.f49370b).d;
                if (view == h1Var.f56633k2 && h1Var.A2) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f49369a) {
            case 0:
                super.invalidate();
                int i3 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) this.f49370b;
                    if (i3 < v0VarArr.length) {
                        v0VarArr[i3].invalidate();
                        i3++;
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
        switch (this.f49369a) {
            case 23:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((zb1) this.f49370b).C0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f49369a) {
            case 10:
                return org.telegram.ui.ActionBar.i4.b((org.telegram.ui.ActionBar.i4) this.f49370b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f49369a) {
            case 12:
                int paddingLeft = getPaddingLeft();
                int i13 = (i12 - i10) / 2;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt != ((org.telegram.ui.Components.xu) this.f49370b).f40482s.G && childAt != null) {
                        childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                        paddingLeft = org.telegram.messenger.k5.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 13:
                ((org.telegram.ui.Components.n00) this.f49370b).f36298c.a(getMeasuredWidth());
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            case 14:
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            case 15:
                super.onLayout(z10, i3, i10, i11, i12);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f49370b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f31613r) >= 0 && scrollSlidingTextTabStrip.f31593a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f31613r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.f31613r), false);
                    scrollSlidingTextTabStrip.m0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        Size size;
        int i12;
        int i13;
        int i14 = i10;
        int i15 = 0;
        switch (this.f49369a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(123.0f), 1073741824));
                return;
            case 7:
                int size2 = View.MeasureSpec.getSize(i3);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                mi.c2 c2Var = (mi.c2) this.f49370b;
                LinearLayout linearLayout = c2Var.f19525n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c2Var.f19525n0.getLayoutParams();
                    paddingRight += c2Var.f19525n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = c2Var.f19526o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c2Var.f19526o0.getLayoutParams();
                    paddingRight += c2Var.f19526o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = c2Var.f19527p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c2Var.f19527p0.getLayoutParams();
                    paddingRight += c2Var.f19527p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                c2Var.f19523l0 = Math.max(0, size2 - paddingRight);
                super.onMeasure(i3, i10);
                return;
            case 8:
                int size3 = View.MeasureSpec.getSize(i3);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                mi.y3 y3Var = (mi.y3) this.f49370b;
                LinearLayout linearLayout4 = y3Var.M;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) y3Var.M.getLayoutParams();
                    paddingRight2 += y3Var.M.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                LinearLayout linearLayout5 = y3Var.N;
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) y3Var.N.getLayoutParams();
                    paddingRight2 += y3Var.N.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                LinearLayout linearLayout6 = y3Var.O;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) y3Var.O.getLayoutParams();
                    paddingRight2 += y3Var.O.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                y3Var.L = Math.max(0, size3 - paddingRight2);
                super.onMeasure(i3, i10);
                return;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f49370b;
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
                            measureChildWithMargins(childAt, i3, 0, i14, 0);
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
                super.onMeasure(i3, i10);
                return;
            case 10:
                org.telegram.ui.ActionBar.i4 i4Var = (org.telegram.ui.ActionBar.i4) this.f49370b;
                if (org.telegram.ui.ActionBar.i4.b(i4Var) && (size = i4Var.J) != null) {
                    i11 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                } else {
                    i11 = i3;
                }
                super.onMeasure(i11, i14);
                return;
            case 12:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(((org.telegram.ui.Components.xu) this.f49370b).f41058b.getChildCount() * 32), 1073741824)), i14);
                return;
            case 17:
                super.onMeasure(i3, i10);
                if (org.telegram.messenger.bd.f21784a0) {
                    ((org.telegram.ui.Components.d21) this.f49370b).f32919c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 20:
                int childCount2 = getChildCount();
                int i19 = 0;
                for (int i20 = 0; i20 < childCount2; i20++) {
                    if (getChildAt(i20).getVisibility() == 0) {
                        i19++;
                    }
                }
                int size5 = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
                int size6 = View.MeasureSpec.getSize(i14);
                if (i19 != 0) {
                    int min = Math.min(org.telegram.messenger.g0.L(56.0f), size5 / i19);
                    if (((PhotoViewer) this.f49370b).k1.getVisibility() == 0) {
                        if (((PhotoViewer) this.f49370b).Z7 < 2) {
                            i12 = 48;
                        } else {
                            i12 = 64;
                        }
                        int max = Math.max(0, (min - org.telegram.messenger.g0.L(i12)) / 2);
                        ((PhotoViewer) this.f49370b).k1.setPadding(max, 0, max, 0);
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
            case 22:
                super.onMeasure(i3, i10);
                ra1 ra1Var = (ra1) this.f49370b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) ra1Var.f49157c.getLayoutParams();
                if (ra1Var.f49153a.getVisibility() == 8) {
                    i13 = org.telegram.messenger.g0.f22602m;
                } else {
                    i13 = 0;
                }
                int L = org.telegram.messenger.g0.L(8.0f) + i13;
                if (ra1Var.P == 2 && org.telegram.messenger.g0.O1()) {
                    Point point = org.telegram.messenger.g0.f22608q;
                    if (point.x <= point.y) {
                        i15 = org.telegram.messenger.g0.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i15;
                return;
            case 24:
                super.onMeasure(i3, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((org.telegram.ui.Wallet.w5) this.f49370b).B0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f49369a) {
            case 15:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f49370b).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f49369a) {
            case 16:
                org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) this.f49370b;
                org.telegram.ui.Components.k9 k9Var = zu0Var.f41126b;
                if (getVisibility() == 8 && i3 == 0) {
                    zu0Var.c();
                    if (org.telegram.messenger.lc.e(3)) {
                        k9Var.getImageReceiver().P0(false);
                    }
                } else if (i3 == 8) {
                    k9Var.getImageReceiver().f();
                }
                super.setVisibility(i3);
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    public s51(Context context, int i3) {
        super(context);
        this.f49369a = i3;
    }

    public s51(ContextThemeWrapper contextThemeWrapper, final gn0 gn0Var) {
        super(contextThemeWrapper);
        this.f49369a = 21;
        this.f49370b = r9;
        setOrientation(1);
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232369, org.telegram.messenger.bd.M0(2131745273, null), false, null);
        c2.d(-328966, -328966);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i3 = r2;
                gn0 gn0Var2 = gn0Var;
                switch (i3) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.f45683a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.f45683a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.f45683a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.f45683a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.f45683a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c2.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232373, org.telegram.messenger.bd.M0(2131745276, null), false, null);
        c10.d(-328966, -328966);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i3 = r2;
                gn0 gn0Var2 = gn0Var;
                switch (i3) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.f45683a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.f45683a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.f45683a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.f45683a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.f45683a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232372, org.telegram.messenger.bd.M0(2131745277, null), false, null);
        c11.d(-328966, -328966);
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i3 = r2;
                gn0 gn0Var2 = gn0Var;
                switch (i3) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.f45683a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.f45683a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.f45683a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.f45683a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.f45683a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232370, org.telegram.messenger.bd.M0(2131745280, null), false, null);
        c12.d(-328966, -328966);
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i3 = r2;
                gn0 gn0Var2 = gn0Var;
                switch (i3) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.f45683a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.f45683a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.f45683a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.f45683a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.f45683a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, 2131232374, org.telegram.messenger.bd.M0(2131745274, null), false, null);
        c13.d(-328966, -328966);
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i3 = r2;
                gn0 gn0Var2 = gn0Var;
                switch (i3) {
                    case 0:
                        PhotoViewer photoViewer = gn0Var2.f45683a;
                        Drawable[] drawableArr = PhotoViewer.V8;
                        photoViewer.E0(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = gn0Var2.f45683a;
                        Drawable[] drawableArr2 = PhotoViewer.V8;
                        photoViewer2.E0(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = gn0Var2.f45683a;
                        Drawable[] drawableArr3 = PhotoViewer.V8;
                        photoViewer3.E0(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = gn0Var2.f45683a;
                        Drawable[] drawableArr4 = PhotoViewer.V8;
                        photoViewer4.E0(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = gn0Var2.f45683a;
                        Drawable[] drawableArr5 = PhotoViewer.V8;
                        photoViewer5.E0(true, true, 2.0f);
                        return;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.y0[] y0VarArr = {c2, c10, c11, c12, c13};
        View yg0Var = new yg0(contextThemeWrapper, 8);
        yg0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        yg0Var.setBackgroundColor(-15198184);
        addView(yg0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) yg0Var.getLayoutParams();
        if (org.telegram.messenger.bd.f21784a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        yg0Var.setLayoutParams(layoutParams);
    }
}
