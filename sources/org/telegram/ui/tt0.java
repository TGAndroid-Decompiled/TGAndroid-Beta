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
public final class tt0 extends org.telegram.ui.Components.yu0 {
    public final PhotoViewer A0;
    public final Paint f43057w0;
    public boolean f43058x0;
    public boolean f43059y0;
    public ArrayList f43060z0;

    public tt0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.A0 = photoViewer;
        Paint paint = new Paint();
        this.f43057w0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void S() {
        float f10;
        super.S();
        PhotoViewer photoViewer = this.A0;
        if (photoViewer.f35699n1) {
            xt0 xt0Var = photoViewer.S0[0];
            if (getKeyboardHeight() <= AndroidUtilities.dp(20.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            xt0Var.e(2, f10, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f43060z0 == null) {
                this.f43060z0 = new ArrayList();
            }
            this.f43060z0.clear();
            PhotoViewer photoViewer = this.A0;
            if (photoViewer.f35727q4 == 1 || photoViewer.f35678k6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.f43060z0.add(new Rect(0, org.telegram.messenger.ll.y(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.f43060z0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), org.telegram.messenger.ll.y(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.f43060z0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.A0;
        photoViewer.M.o(photoViewer.f35598c0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.A0;
        org.telegram.ui.Cells.z9 o6 = photoViewer.M.o(getContext());
        org.telegram.ui.Cells.aa aaVar = o6.f26047r;
        if (motionEvent.getAction() == 0) {
            o6.h = motionEvent.getX();
            o6.f26046n = motionEvent.getY();
            aaVar.f24078e = aaVar.y();
        } else if (aaVar.f24078e && Math.abs(motionEvent.getX() - o6.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o6.f26046n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.aa aaVar2 = o6.f26047r;
            if (!aaVar2.f24085i && aaVar2.f24078e) {
                aaVar2.f(false);
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
        gt0 gt0Var = photoViewer.f35588b0;
        if (gt0Var != null && gt0Var.f35295x) {
            int measuredHeight = ((int) ((photoViewer.W5 - 1.0f) * gt0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.a61 a61Var = photoViewer.f35771v1;
            if (a61Var != null && a61Var.f26702j) {
                a61Var.setBounds(photoViewer.f35588b0.getLeft(), (photoViewer.f35588b0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.U5 / photoViewer.W5)), photoViewer.f35588b0.getRight(), photoViewer.f35588b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
                photoViewer.f35771v1.draw(canvas);
            }
            org.telegram.ui.Components.tn0 tn0Var = photoViewer.f35780w1;
            if (tn0Var != null && tn0Var.a()) {
                photoViewer.f35780w1.setBounds(photoViewer.f35588b0.getLeft(), (int) ((photoViewer.B.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.f35588b0.getRight(), photoViewer.f35588b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
                photoViewer.f35780w1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.A0;
        if (view != photoViewer.M.o(photoViewer.f35598c0.getContext()) && view != photoViewer.f35712o5 && view != photoViewer.v4 && view != photoViewer.f35783w4 && view != photoViewer.T0) {
            FrameLayout frameLayout = photoViewer.M7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.L0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.M7.getX(), photoViewer.M7.getY(), photoViewer.M7.getX() + photoViewer.M7.getMeasuredWidth(), photoViewer.M7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f35763u2 && view != photoViewer.f35765u4) {
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
        org.telegram.ui.Components.gc.a(this, new x8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.gc.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.r7 r7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.A0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight != 0 && (r7Var = photoViewer.B) != null) {
            Paint paint = this.f43057w0;
            paint.setAlpha((int) (r7Var.getAlpha() * 255.0f * 0.498f));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tt0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int bitmapWidth;
        int bitmapHeight;
        View view;
        int i15;
        tt0 tt0Var = this;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        if (tt0Var.getLayoutParams().height > 0) {
            size2 = tt0Var.getLayoutParams().height;
        }
        int i16 = size2;
        tt0Var.setMeasuredDimension(size, i16);
        PhotoViewer photoViewer = tt0Var.A0;
        boolean z10 = true;
        if (!photoViewer.f35699n1) {
            tt0Var.f43058x0 = true;
            if (photoViewer.f35619e2) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = 5;
                } else {
                    i15 = 10;
                }
                photoViewer.M1.getCurrentView().setMaxLines(i15);
                photoViewer.M1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.M1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.M1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            tt0Var.f43058x0 = false;
        }
        if (photoViewer.f35617e0.getVisibility() != 8) {
            i11 = AndroidUtilities.dp(48.0f);
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.f30 f30Var = photoViewer.f35646h1;
        if (f30Var != null && f30Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.f35646h1.getLayoutParams()).bottomMargin = i11;
            i12 = i9;
            tt0Var.measureChildWithMargins(photoViewer.f35646h1, i12, 0, i10, 0);
            int measuredHeight = photoViewer.f35646h1.getMeasuredHeight();
            tt0Var.f43058x0 = true;
            if (!AndroidUtilities.isTablet() && i16 < size) {
                if (photoViewer.f35646h1.getVisibility() != 4) {
                    photoViewer.f35646h1.setVisibility(4);
                }
            } else if (photoViewer.f35646h1.getVisibility() != 0) {
                photoViewer.f35646h1.setVisibility(0);
            }
            tt0Var.f43058x0 = false;
            i13 = measuredHeight;
        } else {
            i12 = i9;
            i13 = 0;
        }
        iu0 iu0Var = photoViewer.f35620e3;
        if (iu0Var != null) {
            iu0Var.f39288e = size;
            iu0Var.f39289f = i16;
        }
        int paddingLeft = size - (tt0Var.getPaddingLeft() + tt0Var.getPaddingRight());
        int paddingBottom = i16 - tt0Var.getPaddingBottom();
        int childCount = tt0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = tt0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.f35646h1) {
                ps0 ps0Var = photoViewer.f35763u2;
                if (childAt == ps0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, 1073741824));
                } else if (childAt == photoViewer.f35765u4) {
                    if (ps0Var != null && ps0Var.getVisibility() == 0) {
                        if (photoViewer.f35809z2) {
                            view = photoViewer.f35800y2;
                        } else {
                            view = photoViewer.f35790x2;
                        }
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    } else {
                        bitmapWidth = photoViewer.f35802y4.getBitmapWidth();
                        bitmapHeight = photoViewer.f35802y4.getBitmapHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.f35765u4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(bitmapHeight, 1073741824));
                } else if (!photoViewer.Q1.f15632f.l(childAt) && !photoViewer.R1.f15632f.l(childAt)) {
                    if (childAt == photoViewer.P1) {
                        if (photoViewer.f35656i2) {
                            if (tt0Var.f43059y0) {
                                i14 = i11 + i13;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                                ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i14 = i11;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.f35646h1.c() && (AndroidUtilities.isTablet() || paddingBottom > paddingLeft)) {
                            i14 = i11 + i13;
                            tt0Var.f43059y0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            tt0Var.f43059y0 = false;
                            i14 = i11;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.U1 && childAt != photoViewer.M0) {
                        if (childAt == photoViewer.R1.I) {
                            childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                        } else {
                            tt0Var.measureChildWithMargins(childAt, i12, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else if (photoViewer.f35742s) {
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
            i17++;
            z10 = true;
            tt0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f43058x0) {
            return;
        }
        super.requestLayout();
    }
}
