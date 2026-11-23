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
public final class qq0 extends org.telegram.ui.Components.eu0 {
    public final Paint f51331k0;
    public boolean f51332l0;
    public boolean m0;
    public ArrayList f51333n0;
    public final PhotoViewer f51334o0;

    public qq0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.f51334o0 = photoViewer;
        Paint paint = new Paint();
        this.f51331k0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f10;
        super.R();
        PhotoViewer photoViewer = this.f51334o0;
        if (photoViewer.f43367s1) {
            wo0 wo0Var = photoViewer.X0[0];
            if (getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            wo0Var.e(2, f10, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f51333n0 == null) {
                this.f51333n0 = new ArrayList();
            }
            this.f51333n0.clear();
            PhotoViewer photoViewer = this.f51334o0;
            if (photoViewer.f43386u4 == 1 || photoViewer.f43334o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.f51333n0.add(new Rect(0, org.telegram.messenger.o10.z(200.0f, measuredHeight, 2), org.telegram.messenger.g0.L(100.0f), (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
                this.f51333n0.add(new Rect(measuredWidth - org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.o10.z(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.f51333n0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.f51334o0;
        photoViewer.R.n(photoViewer.f43271h0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f51334o0;
        org.telegram.ui.Cells.v9 n10 = photoViewer.R.n(getContext());
        org.telegram.ui.Cells.w9 w9Var = n10.f32218r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.f32217n = motionEvent.getY();
            w9Var.f32275e = w9Var.x();
        } else if (w9Var.f32275e && Math.abs(motionEvent.getX() - n10.h) < org.telegram.messenger.g0.f24025e && Math.abs(motionEvent.getY() - n10.f32217n) < org.telegram.messenger.g0.f24025e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.w9 w9Var2 = n10.f32218r;
            if (!w9Var2.f32282i && w9Var2.f32275e) {
                w9Var2.f(false);
            }
        }
        if (photoViewer.R.x()) {
            photoViewer.R.n(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.f51334o0;
        dq0 dq0Var = photoViewer.f43262g0;
        if (dq0Var != null && dq0Var.f37178y) {
            int measuredHeight = ((int) ((photoViewer.f43211a6 - 1.0f) * dq0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.a61 a61Var = photoViewer.A1;
            if (a61Var != null && a61Var.f33354j) {
                a61Var.setBounds(photoViewer.f43262g0.getLeft(), (photoViewer.f43262g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.f43211a6)), photoViewer.f43262g0.getRight(), photoViewer.f43262g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f43211a6)));
                photoViewer.A1.draw(canvas);
            }
            org.telegram.ui.Components.fn0 fn0Var = photoViewer.B1;
            if (fn0Var != null && fn0Var.a()) {
                photoViewer.B1.setBounds(photoViewer.f43262g0.getLeft(), (int) ((photoViewer.G.getAlpha() * org.telegram.messenger.g0.L(90.0f)) + org.telegram.messenger.g0.f24040m), photoViewer.f43262g0.getRight(), photoViewer.f43262g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f43211a6)));
                photoViewer.B1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        PhotoViewer photoViewer = this.f51334o0;
        if (view != photoViewer.R.n(photoViewer.f43271h0.getContext()) && view != photoViewer.s5 && view != photoViewer.f43434z4 && view != photoViewer.A4 && view != photoViewer.Y0) {
            FrameLayout frameLayout = photoViewer.R7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.Q0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.R7.getX(), photoViewer.R7.getY(), photoViewer.R7.getX() + photoViewer.R7.getMeasuredWidth(), photoViewer.R7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f43432z2 && view != photoViewer.f43425y4) {
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
        return this.f51334o0.Q0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new z8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.v7 v7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.Z8;
        PhotoViewer photoViewer = this.f51334o0;
        photoViewer.T1(canvas);
        if (org.telegram.messenger.g0.f24040m != 0 && (v7Var = photoViewer.G) != null) {
            Paint paint = this.f51331k0;
            paint.setAlpha((int) (v7Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.G.getAlpha()) * org.telegram.messenger.g0.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int q10;
        int o4;
        View view;
        int i15;
        qq0 qq0Var = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (qq0Var.getLayoutParams().height > 0) {
            size2 = qq0Var.getLayoutParams().height;
        }
        int i16 = size2;
        qq0Var.setMeasuredDimension(size, i16);
        PhotoViewer photoViewer = qq0Var.f51334o0;
        boolean z10 = true;
        if (!photoViewer.f43367s1) {
            qq0Var.f51332l0 = true;
            if (photoViewer.f43289j2) {
                Point point = org.telegram.messenger.g0.f24046q;
                if (point.x > point.y) {
                    i15 = 5;
                } else {
                    i15 = 10;
                }
                photoViewer.R1.getCurrentView().setMaxLines(i15);
                photoViewer.R1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.R1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.R1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            qq0Var.f51332l0 = false;
        }
        if (photoViewer.f43287j0.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.z20 z20Var = photoViewer.f43312m1;
        if (z20Var != null && z20Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.f43312m1.getLayoutParams()).bottomMargin = i11;
            i12 = i7;
            qq0Var.measureChildWithMargins(photoViewer.f43312m1, i12, 0, i10, 0);
            int measuredHeight = photoViewer.f43312m1.getMeasuredHeight();
            qq0Var.f51332l0 = true;
            if (!org.telegram.messenger.g0.Q1() && i16 < size) {
                if (photoViewer.f43312m1.getVisibility() != 4) {
                    photoViewer.f43312m1.setVisibility(4);
                }
            } else if (photoViewer.f43312m1.getVisibility() != 0) {
                photoViewer.f43312m1.setVisibility(0);
            }
            qq0Var.f51332l0 = false;
            i13 = measuredHeight;
        } else {
            i12 = i7;
            i13 = 0;
        }
        cr0 cr0Var = photoViewer.f43282i3;
        if (cr0Var != null) {
            cr0Var.f46661e = size;
            cr0Var.f46662f = i16;
        }
        int paddingLeft = size - (qq0Var.getPaddingLeft() + qq0Var.getPaddingRight());
        int paddingBottom = i16 - qq0Var.getPaddingBottom();
        int childCount = qq0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = qq0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.f43312m1) {
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.f43432z2;
                if (childAt == ue0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(qq0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f43425y4) {
                    if (ue0Var != null && ue0Var.getVisibility() == 0) {
                        if (photoViewer.E2) {
                            view = photoViewer.D2;
                        } else {
                            view = photoViewer.C2;
                        }
                        q10 = view.getMeasuredWidth();
                        o4 = view.getMeasuredHeight();
                    } else {
                        q10 = photoViewer.C4.q();
                        o4 = photoViewer.C4.o();
                    }
                    if (q10 == 0 || o4 == 0) {
                        q10 = paddingLeft;
                        o4 = paddingBottom;
                    }
                    photoViewer.f43425y4.measure(View.MeasureSpec.makeMeasureSpec(q10, 1073741824), View.MeasureSpec.makeMeasureSpec(o4, 1073741824));
                } else if (!photoViewer.V1.f15151f.l(childAt) && !photoViewer.W1.f15151f.l(childAt)) {
                    if (childAt == photoViewer.U1) {
                        if (photoViewer.f43322n2) {
                            if (qq0Var.m0) {
                                i14 = i11 + i13;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m)) - i14;
                                ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i14 = i11;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.f43312m1.c() && (org.telegram.messenger.g0.Q1() || paddingBottom > paddingLeft)) {
                            i14 = i11 + i13;
                            qq0Var.m0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            qq0Var.m0 = false;
                            i14 = i11;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Z1 && childAt != photoViewer.R0) {
                        if (childAt == photoViewer.W1.N) {
                            childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m), 1073741824));
                        } else {
                            qq0Var.measureChildWithMargins(childAt, i12, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m), 1073741824));
                    }
                } else if (photoViewer.f43365s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (org.telegram.messenger.g0.E) {
                    if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), paddingBottom - org.telegram.messenger.g0.f24040m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.g0.f24040m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.g0.f24041n, 1073741824));
                }
            }
            i17++;
            z10 = true;
            qq0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f51332l0) {
            return;
        }
        super.requestLayout();
    }
}
