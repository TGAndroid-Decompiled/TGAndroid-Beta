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
public final class rq0 extends org.telegram.ui.Components.ut0 {
    public final Paint f49559j0;
    public boolean f49560k0;
    public boolean f49561l0;
    public ArrayList m0;
    public final PhotoViewer f49562n0;

    public rq0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.f49562n0 = photoViewer;
        Paint paint = new Paint();
        this.f49559j0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f10;
        super.R();
        PhotoViewer photoViewer = this.f49562n0;
        if (photoViewer.f41505r1) {
            xo0 xo0Var = photoViewer.W0[0];
            if (getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            xo0Var.e(2, f10, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.m0 == null) {
                this.m0 = new ArrayList();
            }
            this.m0.clear();
            PhotoViewer photoViewer = this.f49562n0;
            if (photoViewer.f41526t4 == 1 || photoViewer.f41474n6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.m0.add(new Rect(0, org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), org.telegram.messenger.g0.L(100.0f), (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
                this.m0.add(new Rect(measuredWidth - org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.m0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.f49562n0;
        photoViewer.Q.n(photoViewer.f41410g0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f49562n0;
        org.telegram.ui.Cells.u9 n10 = photoViewer.Q.n(getContext());
        org.telegram.ui.Cells.v9 v9Var = n10.f30596r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.f30595n = motionEvent.getY();
            v9Var.f30659e = v9Var.x();
        } else if (v9Var.f30659e && Math.abs(motionEvent.getX() - n10.h) < org.telegram.messenger.g0.f22542e && Math.abs(motionEvent.getY() - n10.f30595n) < org.telegram.messenger.g0.f22542e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.v9 v9Var2 = n10.f30596r;
            if (!v9Var2.f30666i && v9Var2.f30659e) {
                v9Var2.f(false);
            }
        }
        if (photoViewer.Q.x()) {
            photoViewer.Q.n(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.f49562n0;
        eq0 eq0Var = photoViewer.f41401f0;
        if (eq0Var != null && eq0Var.f32248y) {
            int measuredHeight = ((int) ((photoViewer.Z5 - 1.0f) * eq0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.k51 k51Var = photoViewer.f41579z1;
            if (k51Var != null && k51Var.f35251j) {
                k51Var.setBounds(photoViewer.f41401f0.getLeft(), (photoViewer.f41401f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.X5 / photoViewer.Z5)), photoViewer.f41401f0.getRight(), photoViewer.f41401f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.f41579z1.draw(canvas);
            }
            org.telegram.ui.Components.rm0 rm0Var = photoViewer.A1;
            if (rm0Var != null && rm0Var.a()) {
                photoViewer.A1.setBounds(photoViewer.f41401f0.getLeft(), (int) ((photoViewer.F.getAlpha() * org.telegram.messenger.g0.L(90.0f)) + org.telegram.messenger.g0.f22557m), photoViewer.f41401f0.getRight(), photoViewer.f41401f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.A1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        PhotoViewer photoViewer = this.f49562n0;
        if (view != photoViewer.Q.n(photoViewer.f41410g0.getContext()) && view != photoViewer.f41509r5 && view != photoViewer.f41573y4 && view != photoViewer.f41582z4 && view != photoViewer.X0) {
            FrameLayout frameLayout = photoViewer.Q7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.Q7.getX(), photoViewer.Q7.getY(), photoViewer.Q7.getX() + photoViewer.Q7.getMeasuredWidth(), photoViewer.Q7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f41571y2 && view != photoViewer.f41563x4) {
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
        return this.f49562n0.P0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new y8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.r7 r7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.Y8;
        PhotoViewer photoViewer = this.f49562n0;
        photoViewer.T1(canvas);
        if (org.telegram.messenger.g0.f22557m != 0 && (r7Var = photoViewer.F) != null) {
            Paint paint = this.f49559j0;
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
                float alpha = (1.0f - photoViewer.F.getAlpha()) * org.telegram.messenger.g0.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rq0.onLayout(boolean, int, int, int, int):void");
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
        rq0 rq0Var = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (rq0Var.getLayoutParams().height > 0) {
            size2 = rq0Var.getLayoutParams().height;
        }
        int i16 = size2;
        rq0Var.setMeasuredDimension(size, i16);
        PhotoViewer photoViewer = rq0Var.f49562n0;
        boolean z9 = true;
        if (!photoViewer.f41505r1) {
            rq0Var.f49560k0 = true;
            if (photoViewer.f41429i2) {
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i15 = 5;
                } else {
                    i15 = 10;
                }
                photoViewer.Q1.getCurrentView().setMaxLines(i15);
                photoViewer.Q1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.Q1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            rq0Var.f49560k0 = false;
        }
        if (photoViewer.f41427i0.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.m20 m20Var = photoViewer.l1;
        if (m20Var != null && m20Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = i11;
            i12 = i7;
            rq0Var.measureChildWithMargins(photoViewer.l1, i12, 0, i10, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            rq0Var.f49560k0 = true;
            if (!org.telegram.messenger.g0.Q1() && i16 < size) {
                if (photoViewer.l1.getVisibility() != 4) {
                    photoViewer.l1.setVisibility(4);
                }
            } else if (photoViewer.l1.getVisibility() != 0) {
                photoViewer.l1.setVisibility(0);
            }
            rq0Var.f49560k0 = false;
            i13 = measuredHeight;
        } else {
            i12 = i7;
            i13 = 0;
        }
        er0 er0Var = photoViewer.f41422h3;
        if (er0Var != null) {
            er0Var.f45495e = size;
            er0Var.f45496f = i16;
        }
        int paddingLeft = size - (rq0Var.getPaddingLeft() + rq0Var.getPaddingRight());
        int paddingBottom = i16 - rq0Var.getPaddingBottom();
        int childCount = rq0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = rq0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                org.telegram.ui.Components.ge0 ge0Var = photoViewer.f41571y2;
                if (childAt == ge0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(rq0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f41563x4) {
                    if (ge0Var != null && ge0Var.getVisibility() == 0) {
                        if (photoViewer.D2) {
                            view = photoViewer.C2;
                        } else {
                            view = photoViewer.B2;
                        }
                        q10 = view.getMeasuredWidth();
                        o4 = view.getMeasuredHeight();
                    } else {
                        q10 = photoViewer.B4.q();
                        o4 = photoViewer.B4.o();
                    }
                    if (q10 == 0 || o4 == 0) {
                        q10 = paddingLeft;
                        o4 = paddingBottom;
                    }
                    photoViewer.f41563x4.measure(View.MeasureSpec.makeMeasureSpec(q10, 1073741824), View.MeasureSpec.makeMeasureSpec(o4, 1073741824));
                } else if (!photoViewer.U1.f12366f.l(childAt) && !photoViewer.V1.f12366f.l(childAt)) {
                    if (childAt == photoViewer.T1) {
                        if (photoViewer.f41461m2) {
                            if (rq0Var.f49561l0) {
                                i14 = i11 + i13;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                                ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i14 = i11;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.l1.c() && (org.telegram.messenger.g0.Q1() || paddingBottom > paddingLeft)) {
                            i14 = i11 + i13;
                            rq0Var.f49561l0 = z9;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            rq0Var.f49561l0 = false;
                            i14 = i11;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Y1 && childAt != photoViewer.Q0) {
                        if (childAt == photoViewer.V1.M) {
                            childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m), 1073741824));
                        } else {
                            rq0Var.measureChildWithMargins(childAt, i12, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m), 1073741824));
                    }
                } else if (photoViewer.f41513s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (org.telegram.messenger.g0.E) {
                    if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), paddingBottom - org.telegram.messenger.g0.f22557m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.g0.f22557m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.g0.f22558n, 1073741824));
                }
            }
            i17++;
            z9 = true;
            rq0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f49560k0) {
            return;
        }
        super.requestLayout();
    }
}
