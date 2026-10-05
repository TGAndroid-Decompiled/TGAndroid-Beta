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
public final class qu0 extends org.telegram.ui.Components.nw0 {
    public final Paint A0;
    public boolean B0;
    public boolean C0;
    public ArrayList D0;
    public final PhotoViewer E0;

    public qu0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.E0 = photoViewer;
        Paint paint = new Paint();
        this.A0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void S() {
        float f7;
        super.S();
        PhotoViewer photoViewer = this.E0;
        if (photoViewer.f34027r1) {
            uu0 uu0Var = photoViewer.W0[0];
            if (getKeyboardHeight() <= AndroidUtilities.dp(20.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            uu0Var.e(2, f7, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.D0 == null) {
                this.D0 = new ArrayList();
            }
            this.D0.clear();
            PhotoViewer photoViewer = this.E0;
            if (photoViewer.f34058u4 == 1 || photoViewer.f34006o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.D0.add(new Rect(0, org.telegram.messenger.bi.z(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.D0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), org.telegram.messenger.bi.z(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.D0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.E0;
        photoViewer.Q.o(photoViewer.f33931g0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.E0;
        org.telegram.ui.Cells.ca o9 = photoViewer.Q.o(getContext());
        org.telegram.ui.Cells.da daVar = o9.f21908r;
        if (motionEvent.getAction() == 0) {
            o9.h = motionEvent.getX();
            o9.f21907n = motionEvent.getY();
            daVar.f21958e = daVar.y();
        } else if (daVar.f21958e && Math.abs(motionEvent.getX() - o9.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o9.f21907n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.da daVar2 = o9.f21908r;
            if (!daVar2.f21965i && daVar2.f21958e) {
                daVar2.f(false);
            }
        }
        if (photoViewer.Q.y()) {
            photoViewer.Q.o(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.E0;
        du0 du0Var = photoViewer.f33923f0;
        if (du0Var != null && du0Var.f25784x) {
            int measuredHeight = ((int) ((photoViewer.f33881a6 - 1.0f) * du0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.w71 w71Var = photoViewer.f34102z1;
            if (w71Var != null && w71Var.f32548j) {
                w71Var.setBounds(photoViewer.f33923f0.getLeft(), (photoViewer.f33923f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.f33881a6)), photoViewer.f33923f0.getRight(), photoViewer.f33923f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f33881a6)));
                photoViewer.f34102z1.draw(canvas);
            }
            org.telegram.ui.Components.ep0 ep0Var = photoViewer.A1;
            if (ep0Var != null && ep0Var.a()) {
                photoViewer.A1.setBounds(photoViewer.f33923f0.getLeft(), (int) ((photoViewer.F.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.f33923f0.getRight(), photoViewer.f33923f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f33881a6)));
                photoViewer.A1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        PhotoViewer photoViewer = this.E0;
        if (view != photoViewer.Q.o(photoViewer.f33931g0.getContext()) && view != photoViewer.f34041s5 && view != photoViewer.f34105z4 && view != photoViewer.A4 && view != photoViewer.X0) {
            FrameLayout frameLayout = photoViewer.R7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.R7.getX(), photoViewer.R7.getY(), photoViewer.R7.getX() + photoViewer.R7.getMeasuredWidth(), photoViewer.R7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f34095y2 && view != photoViewer.f34096y4) {
                    if (super.drawChild(canvas, view, j3)) {
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
        return this.E0.P0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.rc.a(this, new b9(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.rc.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.y7 y7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.E0;
        photoViewer.V1(canvas);
        if (AndroidUtilities.statusBarHeight != 0 && (y7Var = photoViewer.F) != null) {
            Paint paint = this.A0;
            paint.setAlpha((int) (y7Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.F.getAlpha()) * AndroidUtilities.dpf2(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qu0.onLayout(boolean, int, int, int, int):void");
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
        qu0 qu0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (qu0Var.getLayoutParams().height > 0) {
            size2 = qu0Var.getLayoutParams().height;
        }
        int i17 = size2;
        qu0Var.setMeasuredDimension(size, i17);
        PhotoViewer photoViewer = qu0Var.E0;
        boolean z10 = true;
        if (!photoViewer.f34027r1) {
            qu0Var.B0 = true;
            if (photoViewer.f33951i2) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i16 = 5;
                } else {
                    i16 = 10;
                }
                photoViewer.Q1.getCurrentView().setMaxLines(i16);
                photoViewer.Q1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.Q1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            qu0Var.B0 = false;
        }
        if (photoViewer.f33949i0.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(48.0f);
        } else {
            i12 = 0;
        }
        org.telegram.ui.Components.z30 z30Var = photoViewer.l1;
        if (z30Var != null && z30Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = i12;
            i13 = i10;
            qu0Var.measureChildWithMargins(photoViewer.l1, i13, 0, i11, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            qu0Var.B0 = true;
            if (!AndroidUtilities.isTablet() && i17 < size) {
                if (photoViewer.l1.getVisibility() != 4) {
                    photoViewer.l1.setVisibility(4);
                }
            } else if (photoViewer.l1.getVisibility() != 0) {
                photoViewer.l1.setVisibility(0);
            }
            qu0Var.B0 = false;
            i14 = measuredHeight;
        } else {
            i13 = i10;
            i14 = 0;
        }
        fv0 fv0Var = photoViewer.f33952i3;
        if (fv0Var != null) {
            fv0Var.f36422e = size;
            fv0Var.f36423f = i17;
        }
        int paddingLeft = size - (qu0Var.getPaddingLeft() + qu0Var.getPaddingRight());
        int paddingBottom = i17 - qu0Var.getPaddingBottom();
        int childCount = qu0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = qu0Var.getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                nt0 nt0Var = photoViewer.f34095y2;
                if (childAt == nt0Var) {
                    childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(qu0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f34096y4) {
                    if (nt0Var != null && nt0Var.getVisibility() == 0) {
                        if (photoViewer.D2) {
                            view = photoViewer.C2;
                        } else {
                            view = photoViewer.B2;
                        }
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    } else {
                        bitmapWidth = photoViewer.C4.getBitmapWidth();
                        bitmapHeight = photoViewer.C4.getBitmapHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.f34096y4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(bitmapHeight, 1073741824));
                } else if (!photoViewer.U1.f5518f.l(childAt) && !photoViewer.V1.f5518f.l(childAt)) {
                    if (childAt == photoViewer.T1) {
                        if (photoViewer.f33983m2) {
                            if (qu0Var.C0) {
                                i15 = i12 + i14;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                                ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i15 = i12;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.l1.c() && (AndroidUtilities.isTablet() || paddingBottom > paddingLeft)) {
                            i15 = i12 + i14;
                            qu0Var.C0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            qu0Var.C0 = false;
                            i15 = i12;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Y1 && childAt != photoViewer.Q0) {
                        if (childAt == photoViewer.V1.M) {
                            childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                        } else {
                            qu0Var.measureChildWithMargins(childAt, i13, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else if (photoViewer.f34035s) {
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
            qu0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.B0) {
            return;
        }
        super.requestLayout();
    }
}
