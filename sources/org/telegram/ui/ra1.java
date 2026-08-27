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
import org.telegram.ui.ra1;

public final class ra1 extends LinearLayout {

    public final int f41886a;

    public Object f41887b;

    public ra1(Context context) {
        super(context);
        this.f41886a = 0;
    }

    public static void a(RectF rectF, View view) {
        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41886a) {
            case 2:
                gh.j2 j2Var = (gh.j2) this.f41887b;
                RectF rectF = j2Var.h;
                RectF rectF2 = j2Var.f7355f;
                RectF rectF3 = j2Var.f7354e;
                Paint paint = j2Var.f7356n;
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23036c6, false)));
                float fD = j2Var.f7353c.d(j2Var.f7352b, false);
                double d = fD;
                int iFloor = (int) Math.floor(d);
                ArrayList arrayList = j2Var.d;
                int iClamp = Utilities.clamp(iFloor, arrayList.size() - 1, 0);
                int iClamp2 = Utilities.clamp((int) Math.ceil(d), arrayList.size() - 1, 0);
                if (iClamp < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(iClamp));
                } else if (iClamp2 < arrayList.size()) {
                    a(rectF3, (View) arrayList.get(iClamp2));
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (iClamp2 < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(iClamp2));
                } else if (iClamp < arrayList.size()) {
                    a(rectF2, (View) arrayList.get(iClamp));
                } else {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                AndroidUtilities.lerp(rectF3, rectF2, fD - iClamp, rectF);
                float fHeight = rectF.height() / 2.0f;
                canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
                super.dispatchDraw(canvas);
                break;
            case 14:
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                eh1 eh1Var = (eh1) this.f41887b;
                Camera camera = eh1Var.H;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = eh1Var.I;
                camera.getMatrix(matrix);
                camera.restore();
                float f10 = -width;
                float f11 = -height;
                matrix.preTranslate(f10, f11);
                float f12 = width;
                float f13 = height;
                matrix.postTranslate(f12, f13);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = eh1Var.J;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f10, f11);
                matrix2.postTranslate(f12, f13);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int childCount;
        View childAt;
        switch (this.f41886a) {
            case 3:
                if (((hh.e5) this.f41887b).Q.c(0)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 4:
                if (((hh.oa) this.f41887b).f9848b0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 5:
                if (((mh.g) this.f41887b).f18064a0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            case 11:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f41887b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.K;
                if (scrollSlidingTextTabStrip.f26510b == null || !scrollSlidingTextTabStrip.f26522j0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int i10 = 0;
                    while (true) {
                        if (i10 < getChildCount()) {
                            childAt = getChildAt(i10);
                            if (x8 < childAt.getX() || x8 > childAt.getX() + childAt.getWidth() || y10 < childAt.getY() || y10 > childAt.getY() + childAt.getHeight()) {
                                i10++;
                            }
                        } else {
                            childAt = null;
                        }
                    }
                    scrollSlidingTextTabStrip.V = childAt;
                    if (childAt != null && getParent() != null) {
                        sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.V));
                        scrollSlidingTextTabStrip.f26510b.getClass();
                        scrollSlidingTextTabStrip.V = null;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else if (motionEvent.getAction() == 2) {
                    View view = scrollSlidingTextTabStrip.V;
                    if (view != null) {
                        view.setTranslationX(motionEvent.getX() - 0.0f);
                        int iIndexOfChild = indexOfChild(scrollSlidingTextTabStrip.V);
                        if (scrollSlidingTextTabStrip.f26523n == iIndexOfChild) {
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
                            childCount = 0;
                        } else {
                            childCount = 0;
                            while (true) {
                                if (childCount < getChildCount()) {
                                    View childAt2 = getChildAt(childCount);
                                    float width3 = (childAt2.getWidth() / 2.0f) + childAt2.getLeft();
                                    if (width < width3 - (Math.min(width2, childAt2.getWidth()) / 2.0f) || width > (Math.min(width2, childAt2.getWidth()) / 2.0f) + width3) {
                                        childCount++;
                                    }
                                } else {
                                    childCount = getChildCount() - 1;
                                }
                            }
                        }
                        if (childCount != iIndexOfChild) {
                            org.telegram.ui.Components.zl0 zl0Var = scrollSlidingTextTabStrip.f26510b;
                            sparseIntArray.get(childCount);
                            zl0Var.getClass();
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    View view2 = scrollSlidingTextTabStrip.V;
                    if (view2 != null) {
                        final int i11 = 0;
                        view2.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final ra1 f34649b;

                            {
                                this.f34649b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        ra1 ra1Var = this.f34649b;
                                        ra1Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) ra1Var.f41887b).invalidate();
                                        break;
                                    default:
                                        ra1 ra1Var2 = this.f34649b;
                                        ra1Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) ra1Var2.f41887b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.er.h).start();
                    }
                    scrollSlidingTextTabStrip.V = null;
                } else if (motionEvent.getAction() == 3) {
                    View view3 = scrollSlidingTextTabStrip.V;
                    if (view3 != null) {
                        final int i12 = 1;
                        view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final ra1 f34649b;

                            {
                                this.f34649b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        ra1 ra1Var = this.f34649b;
                                        ra1Var.invalidate();
                                        ((ScrollSlidingTextTabStrip) ra1Var.f41887b).invalidate();
                                        break;
                                    default:
                                        ra1 ra1Var2 = this.f34649b;
                                        ra1Var2.invalidate();
                                        ((ScrollSlidingTextTabStrip) ra1Var2.f41887b).invalidate();
                                        break;
                                }
                            }
                        }).setInterpolator(org.telegram.ui.Components.er.h).start();
                    }
                    scrollSlidingTextTabStrip.V = null;
                }
                return scrollSlidingTextTabStrip.V != null || super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41886a) {
            case 16:
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (getChildAt(i10).getVisibility() == 0) {
                        super.draw(canvas);
                    }
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f41886a) {
            case 1:
                ag.y2 y2Var = ((ag.x2) this.f41887b).f700c;
                if (view == y2Var.f720n0 && y2Var.D0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 7:
                if (view == ((org.telegram.ui.Components.v8) this.f41887b).f33295a) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 10:
                org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) this.f41887b;
                if (view instanceof org.telegram.ui.Components.nw0) {
                    ((org.telegram.ui.Components.nw0) view).a(vl0Var.f33449e0);
                }
                if (view == vl0Var.f33462s) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 15:
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                u60 u60Var = (u60) this.f41887b;
                if (view == u60Var.f43134b && u60Var.f43142x != null) {
                    int measuredHeight = u60Var.f43140s.getMeasuredHeight();
                    u60Var.f43142x.setBounds(0, measuredHeight, getMeasuredWidth(), u60Var.f43142x.getIntrinsicHeight() + measuredHeight);
                    u60Var.f43142x.draw(canvas);
                }
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f41886a) {
            case 0:
                super.invalidate();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) this.f41887b;
                    if (i10 < x0VarArr.length) {
                        x0VarArr[i10].invalidate();
                        i10++;
                    }
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f41886a) {
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((lh1) this.f41887b).f40130x0);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f41886a) {
            case 6:
                return org.telegram.ui.ActionBar.t4.b((org.telegram.ui.ActionBar.t4) this.f41887b);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41886a) {
            case 8:
                int paddingLeft = getPaddingLeft();
                int i14 = (i13 - i11) / 2;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt != ((org.telegram.ui.Components.kv) this.f41887b).f30190s.B && childAt != null) {
                        childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                        paddingLeft = org.telegram.messenger.y1.C(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                break;
            case 9:
                ((org.telegram.ui.Components.p10) this.f41887b).f31464c.a(getMeasuredWidth());
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 10:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f41887b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
                if (scrollSlidingTextTabStrip.f26520h0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.f26524r) >= 0 && scrollSlidingTextTabStrip.f26508a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.f26524r)) != null) {
                    scrollSlidingTextTabStrip.i(sparseIntArray.get(scrollSlidingTextTabStrip.f26524r), false);
                    scrollSlidingTextTabStrip.f26520h0 = false;
                    break;
                }
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        Size size;
        switch (this.f41886a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(123.0f), 1073741824));
                break;
            case 6:
                org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) this.f41887b;
                if (org.telegram.ui.ActionBar.t4.b(t4Var) && (size = t4Var.J) != null) {
                    i10 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                }
                super.onMeasure(i10, i11);
                break;
            case 8:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(((org.telegram.ui.Components.kv) this.f41887b).f26767b.getChildCount() * 32), 1073741824)), i11);
                break;
            case 13:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.z21) this.f41887b).f35141c.setPivotX(getMeasuredWidth());
                }
                break;
            case 16:
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (getChildAt(i13).getVisibility() == 0) {
                        i12++;
                    }
                }
                int size2 = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
                int size3 = View.MeasureSpec.getSize(i11);
                if (i12 != 0) {
                    int iMin = Math.min(AndroidUtilities.dp(56.0f), size2 / i12);
                    if (((PhotoViewer) this.f41887b).f35631f1.getVisibility() == 0) {
                        int iMax = Math.max(0, (iMin - AndroidUtilities.dp(((PhotoViewer) this.f41887b).T7 < 2 ? 48 : 64)) / 2);
                        ((PhotoViewer) this.f41887b).f35631f1.setPadding(iMax, 0, iMax, 0);
                    }
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = getChildAt(i14);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
                        }
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (iMin * i12), size3);
                } else {
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size2, size3);
                }
                break;
            case 17:
                super.onMeasure(i10, i11);
                zf1 zf1Var = (zf1) this.f41887b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zf1Var.f45165c.getLayoutParams();
                int iDp = 0;
                int iDp2 = AndroidUtilities.dp(8.0f) + (zf1Var.f45161a.getVisibility() == 8 ? AndroidUtilities.statusBarHeight : 0);
                if (zf1Var.K == 2 && AndroidUtilities.isSmallScreen()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x <= point.y) {
                        iDp = AndroidUtilities.dp(32.0f);
                    }
                }
                marginLayoutParams.topMargin = iDp2 + iDp;
                break;
            case 19:
                int size4 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                rh.x1 x1Var = (rh.x1) this.f41887b;
                LinearLayout linearLayout = x1Var.f47560i0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) x1Var.f47560i0.getLayoutParams();
                    paddingRight += x1Var.f47560i0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout2 = x1Var.f47561j0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) x1Var.f47561j0.getLayoutParams();
                    paddingRight += x1Var.f47561j0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                LinearLayout linearLayout3 = x1Var.f47562k0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) x1Var.f47562k0.getLayoutParams();
                    paddingRight += x1Var.f47562k0.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                x1Var.f47558g0 = Math.max(0, size4 - paddingRight);
                super.onMeasure(i10, i11);
                break;
            case 20:
                int size5 = View.MeasureSpec.getSize(i10);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                rh.t3 t3Var = (rh.t3) this.f41887b;
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
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f41886a) {
            case 11:
                super.setAlpha(f10);
                ((ScrollSlidingTextTabStrip) this.f41887b).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41886a) {
            case 12:
                org.telegram.ui.Components.iw0 iw0Var = (org.telegram.ui.Components.iw0) this.f41887b;
                org.telegram.ui.Components.n9 n9Var = iw0Var.f29504b;
                if (getVisibility() == 8 && i10 == 0) {
                    iw0Var.c();
                    if (LiteMode.isEnabled(3)) {
                        n9Var.getImageReceiver().startAnimation();
                    }
                } else if (i10 == 8) {
                    n9Var.getImageReceiver().clearImage();
                }
                super.setVisibility(i10);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    public ra1(Object obj, Context context, int i10) {
        super(context);
        this.f41886a = i10;
        this.f41887b = obj;
    }
}
