package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class rt0 extends org.telegram.ui.Components.iv0 {
    public final PhotoViewer A0;
    public final Paint f42205w0;
    public boolean f42206x0;
    public boolean f42207y0;
    public ArrayList f42208z0;

    public rt0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.A0 = photoViewer;
        Paint paint = new Paint();
        this.f42205w0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void S() {
        float f9;
        super.S();
        PhotoViewer photoViewer = this.A0;
        if (photoViewer.f35765n1) {
            vt0 vt0Var = photoViewer.S0[0];
            if (getKeyboardHeight() <= AndroidUtilities.dp(20.0f)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            vt0Var.e(2, f9, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f42208z0 == null) {
                this.f42208z0 = new ArrayList();
            }
            this.f42208z0.clear();
            PhotoViewer photoViewer = this.A0;
            if (photoViewer.f35795q4 == 1 || photoViewer.f35744k6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.f42208z0.add(new Rect(0, b.x(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.f42208z0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), b.x(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.f42208z0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.A0;
        photoViewer.M.o(photoViewer.f35666c0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.A0;
        org.telegram.ui.Cells.w9 o10 = photoViewer.M.o(getContext());
        org.telegram.ui.Cells.x9 x9Var = o10.f25887r;
        if (motionEvent.getAction() == 0) {
            o10.h = motionEvent.getX();
            o10.f25886n = motionEvent.getY();
            x9Var.f25939e = x9Var.y();
        } else if (x9Var.f25939e && Math.abs(motionEvent.getX() - o10.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o10.f25886n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.x9 x9Var2 = o10.f25887r;
            if (!x9Var2.f25946i && x9Var2.f25939e) {
                x9Var2.f(false);
            }
        }
        if (photoViewer.M.y()) {
            photoViewer.M.o(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.A0;
        et0 et0Var = photoViewer.f35656b0;
        if (et0Var != null && et0Var.f30680x) {
            int measuredHeight = ((int) ((photoViewer.W5 - 1.0f) * et0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.n61 n61Var = photoViewer.f35837v1;
            if (n61Var != null && n61Var.f30910j) {
                n61Var.setBounds(photoViewer.f35656b0.getLeft(), (photoViewer.f35656b0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.U5 / photoViewer.W5)), photoViewer.f35656b0.getRight(), photoViewer.f35656b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
                photoViewer.f35837v1.draw(canvas);
            }
            org.telegram.ui.Components.eo0 eo0Var = photoViewer.f35847w1;
            if (eo0Var != null && eo0Var.a()) {
                photoViewer.f35847w1.setBounds(photoViewer.f35656b0.getLeft(), (int) ((photoViewer.B.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.f35656b0.getRight(), photoViewer.f35656b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
                photoViewer.f35847w1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.A0;
        if (view != photoViewer.M.o(photoViewer.f35666c0.getContext()) && view != photoViewer.f35778o5 && view != photoViewer.f35840v4 && view != photoViewer.f35850w4 && view != photoViewer.T0) {
            FrameLayout frameLayout = photoViewer.M7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.L0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.M7.getX(), photoViewer.M7.getY(), photoViewer.M7.getX() + photoViewer.M7.getMeasuredWidth(), photoViewer.M7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f35829u2 && view != photoViewer.f35831u4) {
                    if (super.drawChild(canvas, view, j10)) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getBottomPadding() {
        return this.A0.L0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.mc.a(this, new w8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.mc.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cg.m1 m1Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.A0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight != 0 && (m1Var = photoViewer.B) != null) {
            Paint paint = this.f42205w0;
            paint.setAlpha((int) (m1Var.getAlpha() * 255.0f * 0.498f));
            if (getPaddingRight() > 0) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            } else {
                canvas2 = canvas;
            }
            if (getPaddingLeft() > 0) {
                canvas2.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), paint);
            }
            if (getPaddingBottom() > 0) {
                float alpha = (1.0f - photoViewer.B.getAlpha()) * AndroidUtilities.dpf2(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rt0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int bitmapWidth;
        int bitmapHeight;
        View view;
        int i16;
        rt0 rt0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (rt0Var.getLayoutParams().height > 0) {
            size2 = rt0Var.getLayoutParams().height;
        }
        int i17 = size2;
        rt0Var.setMeasuredDimension(size, i17);
        PhotoViewer photoViewer = rt0Var.A0;
        boolean z10 = true;
        if (!photoViewer.f35765n1) {
            rt0Var.f42206x0 = true;
            if (photoViewer.f35685e2) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i16 = 5;
                } else {
                    i16 = 10;
                }
                photoViewer.M1.getCurrentView().setMaxLines(i16);
                photoViewer.M1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.M1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.M1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            rt0Var.f42206x0 = false;
        }
        if (photoViewer.f35683e0.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(48.0f);
        } else {
            i12 = 0;
        }
        org.telegram.ui.Components.t30 t30Var = photoViewer.f35712h1;
        if (t30Var != null && t30Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.f35712h1.getLayoutParams()).bottomMargin = i12;
            i13 = i10;
            rt0Var.measureChildWithMargins(photoViewer.f35712h1, i13, 0, i11, 0);
            int measuredHeight = photoViewer.f35712h1.getMeasuredHeight();
            rt0Var.f42206x0 = true;
            if (!AndroidUtilities.isTablet() && i17 < size) {
                if (photoViewer.f35712h1.getVisibility() != 4) {
                    photoViewer.f35712h1.setVisibility(4);
                }
            } else if (photoViewer.f35712h1.getVisibility() != 0) {
                photoViewer.f35712h1.setVisibility(0);
            }
            rt0Var.f42206x0 = false;
            i14 = measuredHeight;
        } else {
            i13 = i10;
            i14 = 0;
        }
        gu0 gu0Var = photoViewer.f35686e3;
        if (gu0Var != null) {
            gu0Var.f38669e = size;
            gu0Var.f38670f = i17;
        }
        int paddingLeft = size - (rt0Var.getPaddingLeft() + rt0Var.getPaddingRight());
        int paddingBottom = i17 - rt0Var.getPaddingBottom();
        int childCount = rt0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = rt0Var.getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.f35712h1) {
                os0 os0Var = photoViewer.f35829u2;
                if (childAt == os0Var) {
                    childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, 1073741824));
                } else if (childAt == photoViewer.f35831u4) {
                    if (os0Var != null && os0Var.getVisibility() == 0) {
                        if (photoViewer.f35875z2) {
                            view = photoViewer.f35867y2;
                        } else {
                            view = photoViewer.f35858x2;
                        }
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    } else {
                        bitmapWidth = photoViewer.f35869y4.getBitmapWidth();
                        bitmapHeight = photoViewer.f35869y4.getBitmapHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.f35831u4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(bitmapHeight, 1073741824));
                } else if (!photoViewer.Q1.f18076f.l(childAt) && !photoViewer.R1.f18076f.l(childAt)) {
                    if (childAt == photoViewer.P1) {
                        if (photoViewer.f35722i2) {
                            if (rt0Var.f42207y0) {
                                i15 = i12 + i14;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                                ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i15;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i15 = i12;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.f35712h1.c() && (AndroidUtilities.isTablet() || paddingBottom > paddingLeft)) {
                            i15 = i12 + i14;
                            rt0Var.f42207y0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            rt0Var.f42207y0 = false;
                            i15 = i12;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.U1 && childAt != photoViewer.M0) {
                        if (childAt == photoViewer.R1.I) {
                            childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                        } else {
                            rt0Var.measureChildWithMargins(childAt, i13, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else if (photoViewer.f35808s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (AndroidUtilities.isInMultiwindow) {
                    if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), paddingBottom - AndroidUtilities.statusBarHeight), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - AndroidUtilities.statusBarHeight, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + AndroidUtilities.navigationBarHeight, 1073741824));
                }
            }
            i18++;
            z10 = true;
            rt0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f42206x0) {
            return;
        }
        super.requestLayout();
    }
}
